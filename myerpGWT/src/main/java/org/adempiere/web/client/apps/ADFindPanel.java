package org.adempiere.web.client.apps;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.adempiere.model.common.Expression;
import org.adempiere.model.common.Expression.BooleanOperator;
import org.adempiere.model.common.Expression.FieldOperator;
import org.adempiere.model.common.Expression.Predicate;
import org.adempiere.model.common.LookupValue;
import org.adempiere.model.common.QueryCondition;
import org.adempiere.web.client.component.AdFormEditStrategy;
import org.adempiere.web.client.component.AdModelEditor;
import org.adempiere.web.client.event.ConfirmToolListener;
import org.adempiere.web.client.model.AdFieldModel;
import org.adempiere.web.client.model.AdTabModel;
import org.adempiere.web.client.model.IAdFormField;
import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;
import org.adempiere.web.client.util.WidgetUtil;
import org.adempiere.web.client.widget.ConfirmToolBar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.StringLabelProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.button.IconButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.SimpleComboBox;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.editing.GridInlineEditing;
import com.sencha.gxt.widget.core.client.treegrid.TreeGrid;

public class ADFindPanel implements IsWidget, ConfirmToolListener {

	private static FindPanelUiBinder	uiBinder	= GWT.create(FindPanelUiBinder.class);

	interface FindPanelUiBinder extends UiBinder<Widget, ADFindPanel> {
	}

	@UiField(provided = true)
	AdModelEditor						simpleEditor;
	@UiField
	ConfirmToolBar						toolBar;
	@UiField
	Window								window;
	@UiField(provided = true)
	TreeGrid<Expression>				grid;
	@UiField(provided = true)
	SimpleComboBox<String>				cmbFields, cmbProfiles;
	@UiField(provided = true)
	IconButton							btnAdd, btnDelete, btnSave;
	private static final List<String>	LOOKUP_FIELDS	= Arrays.asList("name", "description");
	private Widget						widget			= null;
	private AdTabModel					tabModel;
	private QueryCondition				condition;
	private ConditionLoader				loader;

	public ADFindPanel(AdTabModel tabModel, ConditionLoader loader) {
		super();
		this.tabModel = tabModel;
		this.loader = loader;
		this.initWidget(tabModel);
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
			window.setHeadingText("Lookup Record:" + tabModel.getName());
			toolBar.setToolbarListener(this);
		}
		return widget;
	}

	@UiHandler({ "btnAdd" })
	void onAddSelected(SelectEvent event) {

	}

	@UiHandler({ "btnDelete" })
	void onDeleteSelected(SelectEvent event) {

	}

	@UiHandler({ "btnSave" })
	void onSaveSelected(SelectEvent event) {

	}

	@UiHandler({ "cmbProfiles" })
	void onProfileSelected(SelectionEvent<LookupValue> event) {
	}

	private void initWidget(AdTabModel tabModel) {
		List<? extends IAdFormField> fieldList = pickSimpleFields(tabModel);
		AdFormEditStrategy formStrategy = new AdFormEditStrategy(fieldList);
		formStrategy.setCreateGridEditor(false);
		formStrategy.setDisableKey(false);
		simpleEditor = new AdModelEditor(formStrategy);
		simpleEditor.setLabelWidth(85);
		simpleEditor.setLayoutWidth(0.62d);

		TreeStore<Expression> store = new TreeStore<Expression>(new XKeyProvider());
		ColumnConfig<Expression, String> nameColumn = new ColumnConfig<Expression, String>(new XValueProvider<String>("columnName"));
		nameColumn.setHeader("Column");
		ColumnConfig<Expression, String> operatorColumn = new ColumnConfig<Expression, String>(new XValueProvider<String>("fieldOperator"));
		operatorColumn.setHeader("Operator");
		ColumnConfig<Expression, String> value1Column = new ColumnConfig<Expression, String>(new XValueProvider<String>("value2"));
		value1Column.setHeader("Value1");
		ColumnConfig<Expression, String> value2Column = new ColumnConfig<Expression, String>(new XValueProvider<String>("value2"));
		value2Column.setHeader("Value2");
		List<ColumnConfig<Expression, ?>> columns = new ArrayList<ColumnConfig<Expression, ?>>();
		columns.add(nameColumn);
		columns.add(operatorColumn);
		columns.add(value1Column);
		columns.add(value2Column);

		Predicate root = new Predicate();
		root.setBooleanOperator(BooleanOperator.And);
		store.add(root);
		Expression child = new Expression();
		child.setColumnName("Name");
		child.setFieldOperator(FieldOperator.Equal);
		child.setValue1("123456");
		store.add(root, child);

		ColumnModel<Expression> cm = new ColumnModel<Expression>(columns);
		Images imgs = ResourcesFactory.createImages();
		grid = new TreeGrid<Expression>(store, cm, nameColumn);
		grid.getStyle().setNodeOpenIcon(imgs.mOpen());
		grid.getStyle().setNodeCloseIcon(imgs.mClosed());
		grid.getStyle().setLeafIcon(imgs.function16());
		grid.getView().setAutoExpandColumn(nameColumn);

		GridInlineEditing<Expression> editing = new GridInlineEditing<Expression>(grid);

		LabelProvider<String> labelProvider = new StringLabelProvider<String>();
		SimpleComboBox<String> opComboBox = new SimpleComboBox<String>(labelProvider);
		opComboBox.add(Arrays.asList(FieldOperator.allNames()));
		opComboBox.setForceSelection(true);
		opComboBox.setTriggerAction(TriggerAction.ALL);
		opComboBox.setEditable(false);
		editing.addEditor(operatorColumn, opComboBox);
		editing.addEditor(value1Column, new TextField());
		editing.addEditor(value2Column, new TextField());
		initAdvToolBar();
	}

	private void initAdvToolBar() {
		btnAdd = WidgetUtil.createIconButton("images/icons/New24.png");
		btnDelete = WidgetUtil.createIconButton("images/icons/Delete24.png");
		btnSave = WidgetUtil.createIconButton("images/icons/Save24.png");

		LabelProvider<String> labelProvider = new StringLabelProvider<String>();
		cmbFields = new SimpleComboBox<String>(labelProvider);
		cmbFields.add("AND");
		cmbFields.add("OR");
		for (AdFieldModel field : tabModel.getFieldList()) {
			cmbFields.add(field.getName());
		}
		cmbFields.setForceSelection(true);
		cmbFields.setTriggerAction(TriggerAction.ALL);
		cmbFields.setEditable(true);
		cmbFields.setValue("AND");

		labelProvider = new StringLabelProvider<String>();
		cmbProfiles = new SimpleComboBox<String>(labelProvider);

		// ListStore<LookupValue> formatStore = CommonUtil.createDataSource();
		// cmbProfiles = createComboBox(formatStore, labelProvider);
	}

	<T> ComboBox<T> createComboBox(ListStore<T> listStore, LabelProvider<T> labelProvider) {
		ComboBox<T> comboBox = new ComboBox<T>(listStore, labelProvider);
		comboBox.setEditable(false);
		comboBox.setForceSelection(true);
		comboBox.setTriggerAction(TriggerAction.ALL);
		return comboBox;
	}

	List<? extends IAdFormField> pickSimpleFields(AdTabModel tabModel) {
		List<AdFieldModel> fieldList = new ArrayList<AdFieldModel>(5);
		if (null != tabModel && null != tabModel.getFieldList()) {
			for (AdFieldModel fieldModel : tabModel.getFieldList()) {
				if (fieldModel.getIskey() || LOOKUP_FIELDS.contains(fieldModel.getName().toLowerCase())) {
					fieldList.add(fieldModel);
				}
			}
		}
		return fieldList;
	}

	public void setConfirmToolListener(ConfirmToolListener listener) {
		toolBar.setToolbarListener(listener);
	}

	public QueryCondition getCondition() {
		return condition;
	}

	public interface ConditionLoader {
		void load(QueryCondition condition);
	}

	public void show() {
		asWidget();
		window.show();
	}

	@Override
	public void onHelp() {
	}

	@Override
	public void onOK() {
		loader.load(condition);
		window.hide();
	}

	@Override
	public void onCancel() {
		window.hide();
	}

	public static class XKeyProvider implements ModelKeyProvider<Expression> {
		@Override
		public String getKey(Expression ex) {
			return Integer.toString(ex.hashCode());
		}
	}

	@SuppressWarnings("unchecked")
	public static class XValueProvider<T> implements ValueProvider<Expression, T> {
		private String	path;

		public XValueProvider(String path) {
			super();
			this.path = path;
		}

		@Override
		public T getValue(Expression ex) {
			Object result = null;
			if (ex.isParent() && !"columnName".equals(path)) {
				result = "";
			} else if ("columnName".equals(path)) {
				result = ex.getColumnName();
			} else if ("fieldOperator".equals(path)) {
				result = ex.getFieldOperator();
			} else if ("value1".equals(path)) {
				result = ex.getValue1();
			} else if ("value1".equals(path)) {
				result = ex.getValue2();
			}
			return (T) result;
		}

		@Override
		public void setValue(Expression ex, T value) {
			if (ex.isParent() && !"columnName".equals(path)) {
				return;
			} else if ("columnName".equals(path)) {
				ex.setColumnName((String) value);
			} else if ("fieldOperator".equals(path)) {
				ex.setFieldOperator((FieldOperator) value);
			} else if ("value1".equals(path)) {
				ex.setValue1((Serializable) value);
			} else if ("value1".equals(path)) {
				ex.setValue2((Serializable) value);
			}
		}

		@Override
		public String getPath() {
			return path;
		}

	}

}
