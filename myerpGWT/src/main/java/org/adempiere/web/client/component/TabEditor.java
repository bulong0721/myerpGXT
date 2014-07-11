package org.adempiere.web.client.component;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.common.DisplayType;
import org.adempiere.web.client.model.FormField;
import org.adempiere.web.client.model.MapEntry;
import org.adempiere.web.client.util.JSOUtil;
import org.adempiere.web.client.util.StringUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.editor.client.CompositeEditor;
import com.google.gwt.editor.client.EditorDelegate;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.data.shared.Converter;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer.CssFloatData;
import com.sencha.gxt.widget.core.client.form.Field;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.info.Info;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class TabEditor implements CompositeEditor<MapEntry, Object, Field<Object>>, IsWidget {

    private TabBuilder              tabBuilder;
    private List<FieldBuilder>      fieldList;
    private MapEntry                model;
    private CssFloatLayoutContainer container;
    private double                  layoutWidth = 0.485d;
    private int                     labelWidth  = 130;
    private boolean                 filling;

    @UiConstructor
    public TabEditor(TabBuilder tabStrategy){
        super();
        this.tabBuilder = tabStrategy;
        this.fieldList = new ArrayList<FieldBuilder>();
    }

    public TabEditor(){
    }

    public void setLayoutWidth(double layoutWidth) {
        this.layoutWidth = layoutWidth;
    }

    public void setLabelWidth(int labelWidth) {
        this.labelWidth = labelWidth;
    }

    public boolean isFilling() {
        return filling;
    }

    @Override
    public Widget asWidget() {
        if (null == container) {
            container = new CssFloatLayoutContainer();
            container.addStyleName("modelEditor");
            container.setAdjustForScroll(true);
            CssFloatLayoutContainer groupContainer = null;
            String oldFieldGroup = null;
            for (FieldBuilder fieldStrategy : tabBuilder.getFieldBuilders()) {
                FormField field = fieldStrategy.getField();
                String fieldGroup = field.getFieldGroup();
                if (!StringUtil.isNullOrEmpty(fieldGroup)) {
                    if (!fieldGroup.equals(oldFieldGroup)) {
                        ContentPanel groupPanel = new ContentPanel();
                        groupPanel.setStyleName("fieldGroup", true);
                        groupPanel.setHeadingText(fieldGroup);
                        groupPanel.setCollapsible(true);
                        oldFieldGroup = fieldGroup;
                        groupContainer = new CssFloatLayoutContainer();
                        groupPanel.add(groupContainer);
                        container.add(groupPanel, new CssFloatData(1));
                    }
                    layoutFiled(groupContainer, fieldStrategy);
                } else {
                    layoutFiled(container, fieldStrategy);
                }
            }
        }
        return container;
    }

    private void layoutFiled(CssFloatLayoutContainer container, FieldBuilder fieldStrategy) {
        FieldLabel fieldLabel = fieldStrategy.getFieldLabel(labelWidth);
        Widget widget = fieldLabel.getWidget();
        if (widget instanceof Field) {
            fieldList.add(fieldStrategy);
        }
        CssFloatData layoutData = new CssFloatData(layoutWidth);
        container.add(fieldLabel, layoutData);
    }

    @Override
    public void flush() {
        if (null == fieldList || null == model) {
            return;
        }
        for (FieldBuilder fieldStrategy : fieldList) {
            Field formEditor = fieldStrategy.getFormEditor();
            Converter converter = fieldStrategy.getConverter();
            Object value = formEditor.getValue();
            if (null != converter) {
                value = converter.convertFieldValue(value);
            }
            model.setValue(formEditor.getName(), value);
        }
    }

    @Override
    public void onPropertyChange(String... paths) {

    }

    public void cancelEditing() {
        setValue(model);
    }
    
    public MapEntry getValue() {
        return model;
    }

    @Override
    public void setValue(MapEntry model) {
        this.model = model;
        if (null == fieldList || null == model) {
            return;
        }
        this.filling = true;
        for (FieldBuilder fieldStrategy : fieldList) {
            Converter converter = fieldStrategy.getConverter();
            Field formEditor = fieldStrategy.getFormEditor();
            DisplayType fieldType = fieldStrategy.getField().getFieldType();
            Object value = model.getValue(formEditor.getName(), fieldType);
            if (null != converter) {
                value = converter.convertModelValue(value);
            }
            formEditor.setValue(value);
        }
        this.filling = false;
    }

    public void overWrite(JavaScriptObject jso) {
        if (null == fieldList) {
            return;
        }
        this.filling = true;
        for (String key : JSOUtil.getKeys(jso)) {
            FieldBuilder builder = getFieldBuilder(key);
            Converter converter = builder.getConverter();
            Field formEditor = builder.getFormEditor();
            DisplayType fieldType = builder.getField().getFieldType();
            Object value = model.getValue(formEditor.getName(), fieldType);
            if (null != converter) {
                value = converter.convertModelValue(value);
            }
            formEditor.setValue(value);
        }
        this.filling = false;
    }

    @Override
    public void setDelegate(EditorDelegate<MapEntry> delegate) {
    }

    @Override
    public Field<Object> createEditorForTraversal() {
        Info.display("edit", "createEditorForTraversal");
        return null;
    }

    @Override
    public String getPathElement(Field<Object> subEditor) {
        return subEditor.getName();
    }

    @Override
    public void setEditorChain(EditorChain<Object, Field<Object>> chain) {
    }

    public List<FieldBuilder> getFieldList() {
        return fieldList;
    }

    public FieldBuilder getFieldBuilder(String propertyName) {
        for (FieldBuilder builder : fieldList) {
            if (StringUtil.equals(propertyName, builder.getField().getPropertyName())) {
                return builder;
            }
        }
        return null;
    }
    
    public boolean validate() {
        boolean isValid = true;
        for (FieldBuilder builder : fieldList) {
            isValid &= builder.getFormEditor().validate();
        }
        return isValid;
    }
}
