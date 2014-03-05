package org.adempiere.web.client.component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.adempiere.common.DisplayType;
import org.adempiere.common.LookupValue;
import org.adempiere.web.client.event.ActionEvent;
import org.adempiere.web.client.event.ActionListener;
import org.adempiere.web.client.model.ADFormField;
import org.adempiere.web.client.model.ADMapData;
import org.adempiere.web.client.model.ADMapData.ADModelValueProvider;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.CommonUtil;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.data.shared.Converter;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.DateField;
import com.sencha.gxt.widget.core.client.form.Field;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.NumberField;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor.DoublePropertyEditor;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor.IntegerPropertyEditor;
import com.sencha.gxt.widget.core.client.form.PasswordField;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ADFieldBuilder {
	private ADFormField					field;
	private ColumnConfig<ADMapData, ?>	columnCfg;
	private Cell<?>						columnCell;
	private Field<?>					gridEditor;
	private Field<?>					formEditor;
	private OptionStore					optionStore;
	private boolean						showLabel	= true;
	private Converter					converter;
	private DisplayType					fieldType;
	private ADFormBuilder				formStrategy;

	public ADFieldBuilder(ADFormBuilder formStrategy, ADFormField field) {
		this.formStrategy = formStrategy;
		this.field = field;
		this.init();
	}

	public DisplayType getFieldType() {
		return fieldType;
	}

	private void init() {
		fieldType = field.getFieldType();
		ADModelValueProvider<?> valueProvider = null;
		String propertyName = field.getPropertyName();
//		LoggingUtil.info("column2property:" + field.getColumnname() + "=>" + propertyName);
		if (fieldType.isID() || fieldType.isInteger()) {
			valueProvider = new ADModelValueProvider<Integer>(propertyName, fieldType);
			if (fieldType.isLookup()) {
				optionStore = OptionStoreManager.getOptionStore(field.getPropertyName(), field.getADReferenceID(),
						field.getADReferenceValueID());
				columnCell = new OptionCell(optionStore);
				LabelProvider<LookupValue> labelProvider = CommonUtil.createLabelProvider();
				if (formStrategy.isCreateGridEditor())
					gridEditor = createComboBox(labelProvider);
				if (formStrategy.isCreateFormEditor())
					formEditor = createComboBox(labelProvider);
				converter = new Converter<Integer, LookupValue>() {
					@Override
					public Integer convertFieldValue(LookupValue value) {
						if (null != value) {
							return Integer.valueOf(value.getValue());
						}
						return null;
					}

					@Override
					public LookupValue convertModelValue(Integer value) {
						return optionStore.findModelWithKey("" + value);
					}
				};
			} else {
				NumberPropertyEditor<Integer> propertyEditor = new IntegerPropertyEditor();
				if (formStrategy.isCreateGridEditor())
					gridEditor = new NumberField<Integer>(propertyEditor);
				if (formStrategy.isCreateFormEditor())
					formEditor = new NumberField<Integer>(propertyEditor);
			}
		} else if (fieldType.isFloat()) {
			valueProvider = new ADModelValueProvider<Double>(propertyName, fieldType);
			NumberPropertyEditor<Double> propertyEditor = new DoublePropertyEditor();
			if (formStrategy.isCreateGridEditor())
				gridEditor = new NumberField<Double>(propertyEditor);
			if (formStrategy.isCreateFormEditor())
				formEditor = new NumberField<Double>(propertyEditor);
		} else if (fieldType.isDate()) {
			valueProvider = new ADModelValueProvider<String>(propertyName, fieldType);
			if (formStrategy.isCreateGridEditor())
				gridEditor = new DateField();
			if (formStrategy.isCreateFormEditor())
				formEditor = new DateField();
			converter = new Converter<String, Date>() {
				DateTimeFormat	format	= DateTimeFormat.getFormat("yyyy-MM-dd HH:mm:ss.S");

				@Override
				public String convertFieldValue(Date value) {
					return format.format(value);
				}

				@Override
				public Date convertModelValue(String value) {
					return format.parse(value);
				}
			};
		} else if (fieldType.isButton()) {
			valueProvider = new ADModelValueProvider<Boolean>(propertyName, fieldType);
			showLabel = false;
		} else if (fieldType.isText()) {
			valueProvider = new ADModelValueProvider<String>(propertyName, fieldType);
			if (field.isEncryptedField()) {
				if (formStrategy.isCreateGridEditor())
					gridEditor = new PasswordField();
				if (formStrategy.isCreateFormEditor())
					formEditor = new PasswordField();
			} else {
				if (formStrategy.isCreateGridEditor())
					gridEditor = new TextField();
				if (formStrategy.isCreateFormEditor())
					formEditor = new TextField();
			}
		} else if (fieldType.isBoolean()) {
			valueProvider = new ADModelValueProvider<String>(propertyName, fieldType);
			if (formStrategy.isCreateGridEditor())
				gridEditor = createCheckBox(false);
			if (formStrategy.isCreateFormEditor())
				formEditor = createCheckBox(true);
			showLabel = false;
		} else {
			valueProvider = new ADModelValueProvider<String>(propertyName, fieldType);
			if (formStrategy.isCreateGridEditor())
				gridEditor = new TextField();
			if (formStrategy.isCreateFormEditor())
				formEditor = new TextField();
		}
		if (null != formEditor) {
			formEditor.setName(propertyName);
			// LoggingUtil.info(field.getName() + " : " + fieldType.toString() +
			// " : " + gridEditor.getClass());
		}
		columnCfg = new ColumnConfig(valueProvider, 100);
		columnCfg.setHeader(field.getName());
		columnCfg.setCell((Cell) columnCell);
		if (formStrategy.isDisableKey() && field.isKey()) {
			if (formStrategy.isCreateGridEditor())
				gridEditor.setReadOnly(true);
			if (formStrategy.isCreateFormEditor())
				formEditor.setReadOnly(true);
		}
	}

	private ComboBox<LookupValue> createComboBox(LabelProvider<LookupValue> labelProvider) {
		ComboBox<LookupValue> toReturn = new ComboBox<LookupValue>(optionStore, labelProvider);
		// toReturn.setAllowBlank(false);
		toReturn.setForceSelection(true);
		toReturn.setTriggerAction(TriggerAction.ALL);
		toReturn.setEditable(false);
		return toReturn;
	}

	private CheckBox createCheckBox(boolean showLabel) {
		CheckBox checkBox = new CheckBox();
		if (showLabel) {
			checkBox.setBoxLabel(field.getName());
		}
		return checkBox;
	}

	static class OptionStore extends ListStore<LookupValue> {
		public OptionStore() {
			super(CommonUtil.createKeyProvider());
		}

		public String getDisplay(String value) {
			LookupValue model = findModelWithKey(value);
			if (null != model) {
				return model.getDisplay();
			}
			// TODO undone
			return value;
		}
	}

	static class OptionStoreManager {
		private static Map<String, OptionStore>	optionStoreMap		= new HashMap<String, OptionStore>();
		private static AdempiereServiceAsync	adempiereService	= GWT.create(AdempiereService.class);

		static OptionStore createOptionStore(String columnname, Integer display, Integer adRefId) {
			final OptionStore store = new OptionStore();
			adempiereService.getOptions(columnname, display, adRefId, new AsyncSuccessCallback<List<LookupValue>>() {
				@Override
				public void onSuccess(List<LookupValue> result) {
					store.addAll(result);
				}
			});
			return store;
		}

		public static OptionStore getOptionStore(String columnname, Integer displayType, Integer adRefId) {
			if (optionStoreMap.containsKey(adRefId)) {
				return optionStoreMap.get(columnname + adRefId);
			}
			OptionStore store = createOptionStore(columnname, displayType, adRefId);
			if (null != store) {
				optionStoreMap.put(columnname + adRefId, store);
			}
			return store;
		}
	}

	static class OptionCell extends AbstractCell<Object> {
		private OptionStore	optionStore;

		public OptionCell(OptionStore optionStore) {
			this.optionStore = optionStore;
		}

		@Override
		public void render(Context context, Object value, SafeHtmlBuilder sb) {
			if (null != value) {
				String display = optionStore.getDisplay("" + value);
				sb.appendEscaped(display);
			}
		}
	}

	public ADFormField getField() {
		return field;
	}

	public ColumnConfig<ADMapData, ?> getColumnCfg() {
		return columnCfg;
	}

	public Cell<?> getColumnCell() {
		return columnCell;
	}

	public Field<?> getGridEditor() {
		return gridEditor;
	}

	public Field<?> getFormEditor() {
		return formEditor;
	}

	public FieldLabel getFieldLabel(int labelWidth) {
		FieldLabel fieldLabel = new FieldLabel();
		fieldLabel.setStyleName("formField", true);
		fieldLabel.setLabelWidth(labelWidth);
		if (!field.getFieldType().isButton()) {
			fieldLabel.setHeight(24);
		}
		if (showLabel) {
			fieldLabel.setText(field.getName());
		} else {
			fieldLabel.setText("");
			fieldLabel.setLabelSeparator("");
		}
		fieldLabel.setWidget(formEditor);
		if (field.getFieldType().isButton()) {
			TextButton button = new TextButton(field.getName());
			final ActionListener listener = formStrategy.getFieldButtonListener();
			if (null != listener) {
				button.addSelectHandler(new SelectHandler() {
					@Override
					public void onSelect(SelectEvent event) {
						listener.actionPerformed(new ActionEvent(field));
					}
				});
			}
			fieldLabel.setWidget(button);
		}
		return fieldLabel;
	}

	public ListStore<LookupValue> getOptionStore() {
		return optionStore;
	}

	public Converter getConverter() {
		return converter;
	}

}
