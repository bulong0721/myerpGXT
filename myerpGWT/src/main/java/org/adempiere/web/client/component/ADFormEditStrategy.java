package org.adempiere.web.client.component;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.event.FieldButtonListener;
import org.adempiere.web.client.model.ADFormField;
import org.adempiere.web.client.model.ADMapData;

import com.sencha.gxt.data.shared.Converter;
import com.sencha.gxt.widget.core.client.form.Field;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.editing.GridEditing;
import com.sencha.gxt.widget.core.client.grid.editing.GridInlineEditing;

public class ADFormEditStrategy {
	private List<? extends ADFormField>	fieldList;
	private List<ADFieldEditStrategy>		fieldStrategies;
	private boolean							disableKey			= true;
	private boolean							createFormEditor	= true;
	private boolean							createGridEditor	= true;
	private FieldButtonListener				fieldButtonListener;

	public ADFormEditStrategy(List<? extends ADFormField> fieldList) {
		super();
		this.fieldList = fieldList;
		this.init();
	}

	private void init() {
		int size = fieldList.size();
		fieldStrategies = new ArrayList<ADFieldEditStrategy>(size);
		for (ADFormField field : fieldList) {
			if (field.getIsdisplayed() || field.getIskey()) {
				ADFieldEditStrategy fieldStrategy = new ADFieldEditStrategy(this, field);
				fieldStrategies.add(fieldStrategy);
			}
		}
	}

	public boolean isDisableKey() {
		return disableKey;
	}

	public boolean isCreateFormEditor() {
		return createFormEditor;
	}

	public boolean isCreateGridEditor() {
		return createGridEditor;
	}

	public void setDisableKey(boolean disableKey) {
		this.disableKey = disableKey;
	}

	public void setCreateFormEditor(boolean createFormEditor) {
		this.createFormEditor = createFormEditor;
	}

	public void setCreateGridEditor(boolean createGridEditor) {
		this.createGridEditor = createGridEditor;
	}

	public List<ADFieldEditStrategy> getFieldStrategies() {
		return fieldStrategies;
	}

	public FieldButtonListener getFieldButtonListener() {
		return fieldButtonListener;
	}

	public void setFieldButtonListener(FieldButtonListener fieldButtonListener) {
		this.fieldButtonListener = fieldButtonListener;
	}

	public ColumnModel<ADMapData> createColumnModel() {
		List<ColumnConfig<ADMapData, ?>> columnList = new ArrayList<ColumnConfig<ADMapData, ?>>();
		for (ADFieldEditStrategy strategy : fieldStrategies) {
			columnList.add(strategy.getColumnCfg());
		}
		return new ColumnModel<ADMapData>(columnList);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GridEditing<ADMapData> createGridEditing(Grid<ADMapData> editableGrid) {
		GridInlineEditing<ADMapData> editing = new GridInlineEditing<ADMapData>(editableGrid);
		for (ADFieldEditStrategy strategy : fieldStrategies) {
			ColumnConfig<ADMapData, ?> columnConfig = strategy.getColumnCfg();
			Field editor = strategy.getGridEditor();
			Converter converter = strategy.getConverter();
			if (null != editor) {
				editing.addEditor(columnConfig, converter, editor);
			}
		}
		return editing;
	}

}
