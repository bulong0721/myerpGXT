package org.adempiere.web.client.model;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.model.common.ADModelKey;
import org.adempiere.model.common.DisplayType;
import org.adempiere.web.client.util.StringUtil;

import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;

public interface ADMapData extends IsADRPCModel {

	public abstract void setValue(String path, Object value);

	public abstract Object getValue(String path, DisplayType fieldType);

	public abstract ADMapData deepClone();

	

	public static class ADModelKeyProvider implements ModelKeyProvider<ADMapData> {
		private List<String>	keyFields;
		private Long			RecordId	= -1L;
		private DisplayType		fieldType;

		public ADModelKeyProvider(ADTabModel tabModel) {
			keyFields = new ArrayList<String>();
			for (ADFormField field : tabModel.getFieldList()) {
				if (field.getIskey()) {
					fieldType = field.getFieldType();
					String propertyName = StringUtil.toCamelStyle(field.getColumnname());
					keyFields.add(propertyName);
				}
			}
		}

		@Override
		public String getKey(ADMapData item) {
			String result = "";
			for (String keyField : keyFields) {
				result += item.getValue(keyField, fieldType) + "_";
			}
			return result;
		}

		public List<ADModelKey> getKeys(ADMapData item) {
			ArrayList<ADModelKey> result = new ArrayList<ADModelKey>();
			for (String keyField : keyFields) {
				Object value = item.getValue(keyField, fieldType);
				ADModelKey key = new ADModelKey(keyField, (Integer) value);
				result.add(key);
			}
			return result;
		}

		public void resetKeys(ADMapData item) {
			for (String keyField : keyFields) {
				item.setValue(keyField, RecordId--);
			}
		}
	}

	public static class ADModelValueProvider<T> implements ValueProvider<ADMapData, T> {
		private String		path;
		private DisplayType	fieldType;

		public ADModelValueProvider(String path, DisplayType fieldType) {
			this.fieldType = fieldType;
			this.path = path;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getValue(ADMapData data) {
			return (T) data.getValue(path, fieldType);
		}

		@Override
		public void setValue(ADMapData data, T value) {
			data.setValue(path, value);
		}

		@Override
		public String getPath() {
			return path;
		}
	}

}