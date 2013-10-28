package org.adempiere.web.client.component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.adempiere.model.common.LookupValue;
import org.adempiere.model.core.DisplayType;
import org.adempiere.web.client.model.AdModelData;
import org.adempiere.web.client.model.AdModelData.AdModelValueProvider;
import org.adempiere.web.client.model.IAdFormField;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.CommonUtil;
import org.adempiere.web.client.util.StringUtil;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.widget.client.TextButton;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.data.shared.Converter;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
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
import com.sencha.gxt.widget.core.client.info.Info;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class AdFieldEditStrategy {
	private IAdFormField					field;
	private ColumnConfig<AdModelData, ?>	columnCfg;
	private Cell<?>							columnCell;
	private Field<?>						gridEditor;
	private Field<?>						formEditor;
	private OptionStore						optionStore;
	private boolean							showLabel	= true;
	private Converter						converter;
	private DisplayType						fieldType;

	public AdFieldEditStrategy(IAdFormField field) {
		this.field = field;
		this.init();
	}

	public DisplayType getFieldType() {
		return fieldType;
	}

	private void init() {
		fieldType = field.getFieldType();
		AdModelValueProvider<?> valueProvider = null;
		String propertyName = StringUtil.toCamelStyle(field.getColumnname());
		if (fieldType.isID() || fieldType.isInteger()) {
			valueProvider = new AdModelValueProvider<Integer>(propertyName, fieldType);
			if (fieldType.isLookup()) {
				optionStore = OptionStoreManager.getOptionStore(field.getColumnname(), field.getAdReferenceId(),
						field.getAdReferenceValueId());
				columnCell = new OptionCell(optionStore);
				LabelProvider<LookupValue> labelProvider = CommonUtil.createLabelProvider();
				gridEditor = createComboBox(labelProvider);
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
				gridEditor = new NumberField<Integer>(propertyEditor);
				formEditor = new NumberField<Integer>(propertyEditor);
			}
		} else if (fieldType.isFloat()) {
			valueProvider = new AdModelValueProvider<Double>(propertyName, fieldType);
			NumberPropertyEditor<Double> propertyEditor = new DoublePropertyEditor();
			gridEditor = new NumberField<Double>(propertyEditor);
			formEditor = new NumberField<Double>(propertyEditor);
		} else if (fieldType.isDate()) {
			valueProvider = new AdModelValueProvider<String>(propertyName, fieldType);
			gridEditor = new DateField();
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
			valueProvider = new AdModelValueProvider<String>(propertyName, fieldType);
			showLabel = false;
		} else if (fieldType.isText()) {
			valueProvider = new AdModelValueProvider<String>(propertyName, fieldType);
			if (field.getIsencryptedfield()) {
				gridEditor = new PasswordField();
				formEditor = new PasswordField();
			} else {
				gridEditor = new TextField();
				formEditor = new TextField();
			}
		} else if (fieldType.isBoolean()) {
			valueProvider = new AdModelValueProvider<String>(propertyName, fieldType);
			gridEditor = createCheckBox(false);
			formEditor = createCheckBox(true);
			converter = new Converter<String, Boolean>() {
				@Override
				public String convertFieldValue(Boolean value) {
					return StringUtil.toYesNo(value);
				}

				@Override
				public Boolean convertModelValue(String value) {
					return StringUtil.isYes(value);
				}
			};
			showLabel = false;
		} else {
			valueProvider = new AdModelValueProvider<String>(propertyName, fieldType);
			gridEditor = new TextField();
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
		if (field.getIskey()) {
			gridEditor.setReadOnly(true);
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

		static OptionStore createOptionStore(String columnname, Integer display, Long adRefId) {
			final OptionStore store = new OptionStore();
			adempiereService.getOptions(columnname, display, adRefId, new AsyncCallback<List<LookupValue>>() {
				@Override
				public void onFailure(Throwable caught) {
					Info.display("createOptionStore", caught.getMessage());
				}

				@Override
				public void onSuccess(List<LookupValue> result) {
					store.addAll(result);
				}
			});
			return store;
		}

		public static OptionStore getOptionStore(String columnname, Integer displayType, Long adRefId) {
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

	public IAdFormField getField() {
		return field;
	}

	public ColumnConfig<AdModelData, ?> getColumnCfg() {
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

	public FieldLabel getFieldLabel() {
		FieldLabel fieldLabel = new FieldLabel();
		fieldLabel.setStyleName("formField", true);
		fieldLabel.setLabelWidth(135);
		fieldLabel.setHeight(24);
		if (showLabel) {
			fieldLabel.setText(field.getName());
		} else {
			fieldLabel.setText("");
			fieldLabel.setLabelSeparator("");
		}
		fieldLabel.setWidget(formEditor);
		if (field.getAdReferenceId() == DisplayType.Button.getValue()) {
			TextButton button = new TextButton(field.getName());
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
