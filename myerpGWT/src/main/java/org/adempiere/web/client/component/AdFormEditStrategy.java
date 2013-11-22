package org.adempiere.web.client.component;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.event.FieldButtonListener;
import org.adempiere.web.client.model.IAdFormField;
import org.adempiere.web.client.model.MapAccessable;

import com.sencha.gxt.data.shared.Converter;
import com.sencha.gxt.widget.core.client.form.Field;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.editing.GridEditing;
import com.sencha.gxt.widget.core.client.grid.editing.GridInlineEditing;

public class AdFormEditStrategy {
	private List<? extends IAdFormField>	fieldList;
	private List<AdFieldEditStrategy>		fieldStrategies;
	private boolean							disableKey			= true;
	private boolean							createFormEditor	= true;
	private boolean							createGridEditor	= true;
	private FieldButtonListener				fieldButtonListener;

	public AdFormEditStrategy(List<? extends IAdFormField> fieldList) {
		super();
		this.fieldList = fieldList;
		this.init();
	}

	private void init() {
		int size = fieldList.size();
		fieldStrategies = new ArrayList<AdFieldEditStrategy>(size);
		for (IAdFormField field : fieldList) {
			if (field.getIsdisplayed() || field.getIskey()) {
				AdFieldEditStrategy fieldStrategy = new AdFieldEditStrategy(this, field);
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

	public List<AdFieldEditStrategy> getFieldStrategies() {
		return fieldStrategies;
	}

	public FieldButtonListener getFieldButtonListener() {
		return fieldButtonListener;
	}

	public void setFieldButtonListener(FieldButtonListener fieldButtonListener) {
		this.fieldButtonListener = fieldButtonListener;
	}

	public ColumnModel<MapAccessable> createColumnModel() {
		List<ColumnConfig<MapAccessable, ?>> columnList = new ArrayList<ColumnConfig<MapAccessable, ?>>();
		for (AdFieldEditStrategy strategy : fieldStrategies) {
			columnList.add(strategy.getColumnCfg());
		}
		return new ColumnModel<MapAccessable>(columnList);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GridEditing<MapAccessable> createGridEditing(Grid<MapAccessable> editableGrid) {
		GridInlineEditing<MapAccessable> editing = new GridInlineEditing<MapAccessable>(editableGrid);
		for (AdFieldEditStrategy strategy : fieldStrategies) {
			ColumnConfig<MapAccessable, ?> columnConfig = strategy.getColumnCfg();
			Field editor = strategy.getGridEditor();
			Converter converter = strategy.getConverter();
			if (null != editor) {
				editing.addEditor(columnConfig, converter, editor);
			}
		}
		return editing;
	}

}
