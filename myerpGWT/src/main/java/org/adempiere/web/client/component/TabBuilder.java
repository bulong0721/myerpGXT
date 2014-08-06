package org.adempiere.web.client.component;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.event.ActionListener;
import org.adempiere.web.client.model.FormField;
import org.adempiere.web.client.model.MapEntry;
import org.adempiere.web.client.util.StringUtil;

import com.sencha.gxt.data.shared.Converter;
import com.sencha.gxt.widget.core.client.form.Field;
import com.sencha.gxt.widget.core.client.grid.CheckBoxSelectionModel;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.editing.GridEditing;
import com.sencha.gxt.widget.core.client.grid.editing.GridInlineEditing;

public class TabBuilder {
	private List<? extends FormField>	fieldList;
	private List<FieldBuilder>			fieldBuilders;
	private boolean						canReadOnly			= true;
	private boolean						createFormEditor	= true;
	private boolean						createGridEditor	= true;
	private ActionListener				fieldListener;
	private boolean						isCreated;

	public TabBuilder(List<? extends FormField> fieldList) {
		super();
		this.fieldList = fieldList;
	}

	private void initialize() {
		if (isCreated) {
			return;
		}
		int size = fieldList.size();
		fieldBuilders = new ArrayList<FieldBuilder>(size);
		for (FormField field : fieldList) {
			if (field.isDisplayed() || field.isKey()) {
				FieldBuilder fieldStrategy = new FieldBuilder(this, field);
				fieldBuilders.add(fieldStrategy);
			}
		}
		isCreated = true;
	}

	public boolean canReadOnly() {
		return canReadOnly;
	}

	public void setCanReadOnly(boolean canReadOnly) {
		this.canReadOnly = canReadOnly;
	}

	public boolean isCreateFormEditor() {
		return createFormEditor;
	}

	public boolean isCreateGridEditor() {
		return createGridEditor;
	}

	public void setCreateFormEditor(boolean createFormEditor) {
		this.createFormEditor = createFormEditor;
	}

	public void setCreateGridEditor(boolean createGridEditor) {
		this.createGridEditor = createGridEditor;
	}

	public List<FieldBuilder> getFieldBuilders() {
		this.initialize();
		return fieldBuilders;
	}

	public FieldBuilder getFieldBuilder(String column) {
		if (StringUtil.isNullOrEmpty(column)) {
			return null;
		}
		for (FieldBuilder fieldStrategy : getFieldBuilders()) {
			if (column.equalsIgnoreCase(fieldStrategy.getField().getPropertyName())) {
				return fieldStrategy;
			}
		}
		return null;
	}

	public ActionListener getFieldListener() {
		return fieldListener;
	}

	public void setFieldListener(ActionListener fieldListener) {
		this.fieldListener = fieldListener;
	}

	public ColumnModel<MapEntry> createColumnModel(CheckBoxSelectionModel<MapEntry> chkSm) {
		List<ColumnConfig<MapEntry, ?>> columnList = new ArrayList<ColumnConfig<MapEntry, ?>>();
		if (null != chkSm) {
			columnList.add(chkSm.getColumn());
		}
		for (FieldBuilder builder : getFieldBuilders()) {
			columnList.add(builder.getColumnCfg());
		}
		return new ColumnModel<MapEntry>(columnList);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GridEditing<MapEntry> createGridEditing(Grid<MapEntry> editableGrid) {
		GridInlineEditing<MapEntry> editing = new GridInlineEditing<MapEntry>(editableGrid);
		for (FieldBuilder strategy : getFieldBuilders()) {
			ColumnConfig<MapEntry, ?> columnConfig = strategy.getColumnCfg();
			Field editor = strategy.getGridEditor();
			Converter converter = strategy.getConverter();
			if (null != editor) {
				editing.addEditor(columnConfig, converter, editor);
			}
		}
		return editing;
	}

}
