package org.adempiere.web.client.component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.adempiere.common.DisplayType;
import org.adempiere.common.LookupValue;
import org.adempiere.web.client.event.ActionListener;
import org.adempiere.web.client.event.FieldEvent;
import org.adempiere.web.client.event.FieldEvent.FieldAction;
import org.adempiere.web.client.model.FormField;
import org.adempiere.web.client.model.MapEntry;
import org.adempiere.web.client.model.MapEntry.EntryValueProvider;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.CommonUtil;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.data.shared.Converter;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.DateField;
import com.sencha.gxt.widget.core.client.form.DateTimePropertyEditor;
import com.sencha.gxt.widget.core.client.form.Field;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.NumberField;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor.DoublePropertyEditor;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor.IntegerPropertyEditor;
import com.sencha.gxt.widget.core.client.form.PasswordField;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.ValueBaseField;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class FieldBuilder {

    private FormField                 field;
    private ColumnConfig<MapEntry, ?> columnCfg;
    private Cell<?>                   columnCell;
    private Field<?>                  gridEditor;
    private Field<?>                  formEditor;
    private OptionStore               optionStore;
    private boolean                   showLabel = true;
    private Converter                 converter;
    private DisplayType               fieldType;
    private TabBuilder                tabBuilder;

    public FieldBuilder(TabBuilder formStrategy, FormField field){
        this.tabBuilder = formStrategy;
        this.field = field;
        this.init();
    }

    public DisplayType getFieldType() {
        return fieldType;
    }

    private void init() {
        fieldType = field.getFieldType();
        EntryValueProvider<?> valueProvider = null;
        String propertyName = field.getPropertyName();
        if (fieldType.isLookup()) {
            optionStore = OptionStoreManager.getOptionStore(field);
            columnCell = new OptionCell(optionStore);
            LabelProvider<LookupValue> labelProvider = CommonUtil.createLabelProvider();
            if (tabBuilder.isCreateGridEditor()) gridEditor = createComboBox(labelProvider);
            if (tabBuilder.isCreateFormEditor()) formEditor = createComboBox(labelProvider);
            if (fieldType.isID() && !propertyName.equals("entityType")) {
                valueProvider = new EntryValueProvider<Integer>(propertyName, fieldType);
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
                valueProvider = new EntryValueProvider<String>(propertyName, fieldType);
                converter = new Converter<String, LookupValue>() {

                    @Override
                    public String convertFieldValue(LookupValue value) {
                        if (null == value) {
                            return null;
                        }
                        return value.getValue();
                    }

                    @Override
                    public LookupValue convertModelValue(String value) {
                        return optionStore.findModelWithKey(value);
                    }
                };
            }
        } else if (fieldType.isID() || fieldType.isInteger()) {
            valueProvider = new EntryValueProvider<Integer>(propertyName, fieldType);
            NumberPropertyEditor<Integer> propertyEditor = new IntegerPropertyEditor();
            if (tabBuilder.isCreateGridEditor()) gridEditor = new NumberField<Integer>(propertyEditor);
            if (tabBuilder.isCreateFormEditor()) formEditor = new NumberField<Integer>(propertyEditor);
        } else if (fieldType.isFloat()) {
            valueProvider = new EntryValueProvider<Double>(propertyName, fieldType);
            NumberPropertyEditor<Double> propertyEditor = new DoublePropertyEditor();
            if (tabBuilder.isCreateGridEditor()) gridEditor = new NumberField<Double>(propertyEditor);
            if (tabBuilder.isCreateFormEditor()) formEditor = new NumberField<Double>(propertyEditor);
        } else if (fieldType.isDate()) {
            valueProvider = new EntryValueProvider<String>(propertyName, fieldType);
            final DateTimeFormat format = getDTFormat(fieldType);
            if (tabBuilder.isCreateGridEditor()) gridEditor = new DateField(new DateTimePropertyEditor(format));
            if (tabBuilder.isCreateFormEditor()) formEditor = new DateField(new DateTimePropertyEditor(format));
            converter = new Converter<String, Date>() {

                @Override
                public String convertFieldValue(Date value) {
                    if (null == value) {
                        return null;
                    }
                    return format.format(value);
                }

                @Override
                public Date convertModelValue(String value) {
                    if (null == value) {
                        return null;
                    }
                    return format.parse(value);
                }
            };
        } else if (fieldType.isButton()) {
            valueProvider = new EntryValueProvider<Boolean>(propertyName, fieldType);
            showLabel = false;
        } else if (fieldType.isText()) {
            valueProvider = new EntryValueProvider<String>(propertyName, fieldType);
            if (field.isEncryptedField()) {
                if (tabBuilder.isCreateGridEditor()) gridEditor = new PasswordField();
                if (tabBuilder.isCreateFormEditor()) formEditor = new PasswordField();
            } else {
                if (tabBuilder.isCreateGridEditor()) gridEditor = new TextField();
                if (tabBuilder.isCreateFormEditor()) formEditor = new TextField();
            }
        } else if (fieldType.isBoolean()) {
            valueProvider = new EntryValueProvider<String>(propertyName, fieldType);
            if (tabBuilder.isCreateGridEditor()) gridEditor = createCheckBox(false);
            if (tabBuilder.isCreateFormEditor()) formEditor = createCheckBox(true);
            showLabel = false;
        } else {
            valueProvider = new EntryValueProvider<String>(propertyName, fieldType);
            if (tabBuilder.isCreateGridEditor()) gridEditor = new TextField();
            if (tabBuilder.isCreateFormEditor()) formEditor = new TextField();
        }
        if (null != formEditor) {
            formEditor.setName(propertyName);
        }
        if (tabBuilder.isCreateGridEditor()) {
            columnCfg = new ColumnConfig(valueProvider, 100);
            columnCfg.setHeader(field.getName());
            columnCfg.setCell((Cell) columnCell);
        }
        if (field.isReadOnly() || !field.isUpdatable() || field.isFieldOnly()) {
            if (tabBuilder.isCreateGridEditor()) disableEditor(gridEditor);
            if (tabBuilder.isCreateFormEditor()) disableEditor(formEditor);
        } else if (field.isMandatory()) {
            if (tabBuilder.isCreateGridEditor()) notNullable(gridEditor);
            if (tabBuilder.isCreateFormEditor()) notNullable(formEditor);
        }

        if (field.getFieldType().isNumeric()) {
            if (tabBuilder.isCreateGridEditor()) numberFormat(gridEditor);
            if (tabBuilder.isCreateFormEditor()) numberFormat(formEditor);
        }
    }

    DateTimeFormat getDTFormat(DisplayType fieldType) {
        if (DisplayType.Date == fieldType) {
            return DateTimeFormat.getFormat("yyyy-MM-dd");
        } else if (DisplayType.Time == fieldType) {
            return DateTimeFormat.getFormat("HH:mm:ss.S");
        }
        return DateTimeFormat.getFormat("yyyy-MM-dd HH:mm:ss.S");
    }

    private void notNullable(Field<?> editor) {
        if (editor instanceof ValueBaseField) {
            ValueBaseField valueBaseField = (ValueBaseField) editor;
            valueBaseField.setAllowBlank(false);
        }
    }

    private void numberFormat(Field<?> editor) {
        editor.setStyleName("numberField", true);
    }

    private void disableEditor(Field<?> editor) {
        if (null != editor && tabBuilder.canReadOnly()) {
            editor.addStyleName(ThemeStyles.get().style().disabled());
            editor.setReadOnly(true);
        }
    }

    private ComboBox<LookupValue> createComboBox(LabelProvider<LookupValue> labelProvider) {
        ComboBox<LookupValue> toReturn = new ComboBox<LookupValue>(optionStore, labelProvider);
        toReturn.setForceSelection(true);
        toReturn.setTriggerAction(TriggerAction.ALL);
        // toReturn.setEditable(false);
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

        public OptionStore(){
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

        private static Map<String, OptionStore> optionStoreMap   = new HashMap<String, OptionStore>();
        private static AdempiereServiceAsync    adempiereService = GWT.create(AdempiereService.class);

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

        public static OptionStore getOptionStore(FormField field) {
            String columnname = field.getPropertyName();
            Integer display = field.getADReferenceID();
            Integer adRefId = field.getADReferenceValueID();
            String storeKey = null == adRefId ? columnname : field.getFieldType().name() + adRefId;
            if (optionStoreMap.containsKey(storeKey)) {
                return optionStoreMap.get(storeKey);
            }
            OptionStore store = createOptionStore(columnname, display, adRefId);
            if (null != store) {
                optionStoreMap.put(storeKey, store);
            }
            return store;
        }
    }

    static class OptionCell extends AbstractCell<Object> {

        private OptionStore optionStore;

        public OptionCell(OptionStore optionStore){
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

    public FormField getField() {
        return field;
    }

    public ColumnConfig<MapEntry, ?> getColumnCfg() {
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
        fieldLabel.setLabelSeparator("");
        if (!field.getFieldType().isButton()) {
            fieldLabel.setHeight(24);
        }
        if (showLabel) {
            if (field.isMandatory()) {
                fieldLabel.setHTML("<font color=\"red\">*</font>" + field.getName());
            } else {
                fieldLabel.setText(field.getName());
            }
        } else {
            fieldLabel.setText("");
        }
        fieldLabel.setWidget(formEditor);
        if (field.getFieldType().isButton()) {
            final TextButton button = new TextButton(field.getName());
            final ActionListener listener = tabBuilder.getFieldListener();
            if (null != listener) {
                button.addSelectHandler(new SelectHandler() {

                    @Override
                    public void onSelect(SelectEvent event) {
                        listener.actionPerformed(new FieldEvent(FieldAction.ButtionClick, field));
                    }
                });
            }
            fieldLabel.setWidget(button);
        } else {
            handleValueChanged(formEditor);
        }
        return fieldLabel;
    }

    private void handleValueChanged(final Field editor) {
        final ActionListener listener = tabBuilder.getFieldListener();
        if (null == listener) {
            return;
        }
        editor.addValueChangeHandler(new ValueChangeHandler<Object>() {

            @Override
            public void onValueChange(ValueChangeEvent<Object> event) {
                listener.actionPerformed(new FieldEvent(FieldAction.ValueChange, field, editor));
            }
        });
    }

    public ListStore<LookupValue> getOptionStore() {
        return optionStore;
    }

    public Converter getConverter() {
        return converter;
    }

}
