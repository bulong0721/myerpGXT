package org.adempiere.web.client.component;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.common.DisplayType;
import org.adempiere.web.client.model.FormField;
import org.adempiere.web.client.model.ADMapData;
import org.adempiere.web.client.util.StringUtil;

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
public class AdModelEditor implements CompositeEditor<ADMapData, Object, Field<Object>>, IsWidget {
	private ADFormBuilder						tabStrategy;
//	private EditorChain<Object, Field<Object>>	chain;
	private List<ADFieldBuilder>				fieldList;
	private ADMapData							model;
	private CssFloatLayoutContainer				container;
	private double								layoutWidth	= 0.485d;
	private int									labelWidth	= 130;

	@UiConstructor
	public AdModelEditor(ADFormBuilder tabStrategy) {
		super();
		this.tabStrategy = tabStrategy;
		this.fieldList = new ArrayList<ADFieldBuilder>();
	}

	public AdModelEditor() {
	}

	public void setLayoutWidth(double layoutWidth) {
		this.layoutWidth = layoutWidth;
	}

	public void setLabelWidth(int labelWidth) {
		this.labelWidth = labelWidth;
	}

	@Override
	public Widget asWidget() {
		// if (null == container) {
		container = new CssFloatLayoutContainer();
		CssFloatLayoutContainer groupContainer = null;
		String oldFieldGroup = null;
		for (ADFieldBuilder fieldStrategy : tabStrategy.getFieldStrategies()) {
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
		// LoggingUtil.info("xxxxxxxxxxxxxxxxxxx:" + tabStrategy);
		// }
		return container;
	}

	private void layoutFiled(CssFloatLayoutContainer container, ADFieldBuilder fieldStrategy) {
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
		for (ADFieldBuilder fieldStrategy : fieldList) {
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

	@Override
	public void setValue(ADMapData model) {
		if (null == fieldList || null == model) {
			return;
		}
		this.model = model;
		for (ADFieldBuilder fieldStrategy : fieldList) {
			Converter converter = fieldStrategy.getConverter();
			Field formEditor = fieldStrategy.getFormEditor();
			DisplayType fieldType = fieldStrategy.getField().getFieldType();
			Object value = model.getValue(formEditor.getName(), fieldType);
			if (null != converter) {
				value = converter.convertModelValue(value);
			}
			formEditor.setValue(value);
		}
	}

	@Override
	public void setDelegate(EditorDelegate<ADMapData> delegate) {
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
//		this.chain = chain;
	}

	public List<ADFieldBuilder> getFieldList() {
		return fieldList;
	}

}
