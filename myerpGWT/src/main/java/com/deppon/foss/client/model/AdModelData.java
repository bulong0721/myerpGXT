package com.deppon.foss.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.deppon.foss.client.util.JSOUtil;
import com.deppon.foss.client.util.StringUtil;
import com.deppon.foss.shared.AdModelKey;
import com.deppon.foss.shared.adempiere.DisplayType;
import com.google.gwt.core.client.JavaScriptObject;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;

public class AdModelData implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private JavaScriptObject	jso;

	public AdModelData() {
		jso = JavaScriptObject.createObject();
	}

	public AdModelData(JavaScriptObject jso) {
		this.jso = jso;
	}

	public void setValue(String path, Object value) {
		JSOUtil.setAttribute(jso, path, value);
	}

	public Object getValue(String path, DisplayType fieldType) {
		if (fieldType.isID() || fieldType.isInteger()) {
			return JSOUtil.getAttributeAsInteger(jso, path);
		}
		if (fieldType.isFloat()) {
			return JSOUtil.getAttributeAsDouble(jso, path);
		}
		return JSOUtil.getAttributeAsObject(jso, path);
	}

	public AdModelData deepClone() {
		JavaScriptObject newJso = JSOUtil.deepClone(jso);
		return new AdModelData(newJso);
	}

	public static AdModelKeyProvider createKeyProvider(AdTabModel tabModel) {
		return new AdModelKeyProvider(tabModel);
	}

	public static class AdModelKeyProvider implements ModelKeyProvider<AdModelData> {
		private List<String>	keyFields;
		private Long			RecordId	= -1L;
		private DisplayType		fieldType;

		public AdModelKeyProvider(AdTabModel tabModel) {
			keyFields = new ArrayList<String>();
			for (IAdFormField field : tabModel.getFieldList()) {
				if (field.getIskey()) {
					fieldType = field.getFieldType();
					String propertyName = StringUtil.toCamelStyle(field.getColumnname());
					keyFields.add(propertyName);
				}
			}
		}

		@Override
		public String getKey(AdModelData item) {
			String result = "";
			for (String keyField : keyFields) {
				result += item.getValue(keyField, fieldType) + "_";
			}
			return result;
		}

		public List<AdModelKey> getKeys(AdModelData item) {
			ArrayList<AdModelKey> result = new ArrayList<AdModelKey>();
			for (String keyField : keyFields) {
				Object value = item.getValue(keyField, fieldType);
				AdModelKey key = new AdModelKey(keyField, (Integer) value);
				result.add(key);
			}
			return result;
		}

		public void resetKeys(AdModelData item) {
			for (String keyField : keyFields) {
				item.setValue(keyField, RecordId--);
			}
		}
	}

	public static class AdModelValueProvider<T> implements ValueProvider<AdModelData, T> {
		private String		path;
		private DisplayType	fieldType;

		public AdModelValueProvider(String path, DisplayType fieldType) {
			this.fieldType = fieldType;
			this.path = path;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getValue(AdModelData data) {
			return (T) data.getValue(path, fieldType);
		}

		@Override
		public void setValue(AdModelData data, T value) {
			data.setValue(path, value);
		}

		@Override
		public String getPath() {
			return path;
		}
	}
}
