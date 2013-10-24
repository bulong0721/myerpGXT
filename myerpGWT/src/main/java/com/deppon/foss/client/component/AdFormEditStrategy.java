package com.deppon.foss.client.component;

import java.util.ArrayList;
import java.util.List;

import com.deppon.foss.client.model.AdModelData;
import com.deppon.foss.client.model.IAdFormField;
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
				AdFieldEditStrategy fieldStrategy = new AdFieldEditStrategy(field);
				fieldStrategies.add(fieldStrategy);
			}
		}
	}

	public List<AdFieldEditStrategy> getFieldStrategies() {
		return fieldStrategies;
	}

	public ColumnModel<AdModelData> createColumnModel() {
		List<ColumnConfig<AdModelData, ?>> columnList = new ArrayList<ColumnConfig<AdModelData, ?>>();
		for (AdFieldEditStrategy strategy : fieldStrategies) {
			columnList.add(strategy.getColumnCfg());
		}
		return new ColumnModel<AdModelData>(columnList);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GridEditing<AdModelData> createGridEditing(Grid<AdModelData> editableGrid) {
		GridInlineEditing<AdModelData> editing = new GridInlineEditing<AdModelData>(editableGrid);
		for (AdFieldEditStrategy strategy : fieldStrategies) {
			ColumnConfig<AdModelData, ?> columnConfig = strategy.getColumnCfg();
			Field editor = strategy.getGridEditor();
			Converter converter = strategy.getConverter();
			if (null != editor) {
				editing.addEditor(columnConfig, converter, editor);
			}
		}
		return editing;
	}

}
