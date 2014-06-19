package org.adempiere.web.client.model;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.common.ADModelKey;
import org.adempiere.common.DisplayType;

import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;

public interface MapEntry extends GwtSerializable {

	public abstract void setValue(String path, Object value);

	public abstract Object getValue(String path, DisplayType fieldType);

	public abstract MapEntry deepClone();

	public static class EntryKeyProvider implements ModelKeyProvider<MapEntry> {
		private List<String>	keyFields;
		private DisplayType		fieldType;

		public EntryKeyProvider(TabModel tabModel) {
			keyFields = new ArrayList<String>();
			for (FormField field : tabModel.getFieldList()) {
				if (field.isKey()) {
					fieldType = field.getFieldType();
					String propertyName = field.getPropertyName();
					keyFields.add(propertyName);
				}
			}
		}

		@Override
		public String getKey(MapEntry item) {
			String result = "";
			if (null != item) {
				for (String keyField : keyFields) {
					result += item.getValue(keyField, fieldType) + "_";
				}
			}
			return result;
		}

		public List<ADModelKey> getKeys(MapEntry item) {
			ArrayList<ADModelKey> result = new ArrayList<ADModelKey>();
			for (String keyField : keyFields) {
				Object value = item.getValue(keyField, fieldType);
				ADModelKey key = new ADModelKey(keyField, (Integer) value);
				result.add(key);
			}
			return result;
		}

		public void resetKeys(MapEntry item, String table) {
			if (1 == keyFields.size()) {
				item.setValue(keyFields.get(0), null);
			} else {
				for (String keyField : keyFields) {
					if (keyField.equalsIgnoreCase(table + "_ID")) {
						item.setValue(keyField, null);
					}
				}
			}
		}
	}

	public static class EntryValueProvider<T> implements ValueProvider<MapEntry, T> {
		private String		path;
		private DisplayType	fieldType;

		public EntryValueProvider(String path, DisplayType fieldType) {
			this.fieldType = fieldType;
			this.path = path;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getValue(MapEntry data) {
			return (T) data.getValue(path, fieldType);
		}

		@Override
		public void setValue(MapEntry data, T value) {
			data.setValue(path, value);
		}

		@Override
		public String getPath() {
			return path;
		}
	}

}