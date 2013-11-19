package org.adempiere.web.client.model;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.model.common.AdModelKey;
import org.adempiere.model.common.DisplayType;
import org.adempiere.web.client.util.StringUtil;

import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;

public interface MapAccessable {

	public abstract void setValue(String path, Object value);

	public abstract Object getValue(String path, DisplayType fieldType);

	public abstract MapAccessable deepClone();

	

	public static class AdModelKeyProvider implements ModelKeyProvider<MapAccessable> {
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
		public String getKey(MapAccessable item) {
			String result = "";
			for (String keyField : keyFields) {
				result += item.getValue(keyField, fieldType) + "_";
			}
			return result;
		}

		public List<AdModelKey> getKeys(MapAccessable item) {
			ArrayList<AdModelKey> result = new ArrayList<AdModelKey>();
			for (String keyField : keyFields) {
				Object value = item.getValue(keyField, fieldType);
				AdModelKey key = new AdModelKey(keyField, (Integer) value);
				result.add(key);
			}
			return result;
		}

		public void resetKeys(MapAccessable item) {
			for (String keyField : keyFields) {
				item.setValue(keyField, RecordId--);
			}
		}
	}

	public static class AdModelValueProvider<T> implements ValueProvider<MapAccessable, T> {
		private String		path;
		private DisplayType	fieldType;

		public AdModelValueProvider(String path, DisplayType fieldType) {
			this.fieldType = fieldType;
			this.path = path;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getValue(MapAccessable data) {
			return (T) data.getValue(path, fieldType);
		}

		@Override
		public void setValue(MapAccessable data, T value) {
			data.setValue(path, value);
		}

		@Override
		public String getPath() {
			return path;
		}
	}

}