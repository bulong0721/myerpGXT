package org.adempiere.install;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.adempiere.common.ADEntityBase;

public class TranslateProxy extends ADEntityBase {
	private static final long							serialVersionUID	= 1L;
	private static Map<String, Class<?>>				classMap			= new HashMap<String, Class<?>>();
	private static Map<Class<?>, Map<String, Method>>	getterMap			= new HashMap<Class<?>, Map<String, Method>>();
	private Class<?>									entityClass;
	private ADEntityBase								entity;
	private String										tableName;

	public TranslateProxy(String tableName) {
		try {
			this.tableName = tableName;
			if (classMap.containsKey(tableName)) {
				entityClass = classMap.get(tableName);
			} else {
				String className = "org.adempiere.model." + tableName.replace("_", "") + "Trl";
				entityClass = Class.forName(className);
				classMap.put(tableName, entityClass);
				Map<String, Method> setterMap = new HashMap<String, Method>();
				getterMap.put(entityClass, setterMap);
			}
			entity = (ADEntityBase) entityClass.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public ADEntityBase getEntity() {
		return entity;
	}

	public void setValue(String key, Class<?> paramClass, Object value) {
		Method setter = getSetter(key.replace("_", ""), paramClass);
		if (null != setter) {
			try {
				setter.invoke(entity, value);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}

	private Method getSetter(String key, Class<?> paramClass) {
		if (getterMap.get(entityClass).containsKey(key)) {
			return getterMap.get(entityClass).get(key);
		}
		try {
			Method setter = entityClass.getMethod("set" + key, paramClass);
			getterMap.get(entityClass).put(key, setter);
			return setter;
		} catch (SecurityException e) {
			return null;
		} catch (NoSuchMethodException e) {
			return null;
		}
	}

	@Override
	public void setADOrgID(Integer adOrgId) {
		entity.setADOrgID(adOrgId);
	}

	@Override
	public void setADClientID(Integer adClientId) {
		entity.setADClientID(adClientId);
	}

	@Override
	public void setCreated(String created) {
		entity.setCreated(created);
	}

	@Override
	public Integer getCreatedBy() {
		return entity.getCreatedBy();
	}

	@Override
	public void setCreatedBy(Integer createdBy) {
		entity.setCreatedBy(createdBy);
	}

	@Override
	public void setUpdated(String updated) {
		entity.setUpdated(updated);
	}

	@Override
	public void setUpdatedBy(Integer updatedby) {
		entity.setUpdatedBy(updatedby);
	}

	@Override
	public void setActive(Boolean isactive) {
		entity.setActive(isactive);
	}

	public void setKey(String curID) {
		setValue(tableName.replace("_", "") + "ID", Integer.class, Integer.valueOf(curID));
	}

}
