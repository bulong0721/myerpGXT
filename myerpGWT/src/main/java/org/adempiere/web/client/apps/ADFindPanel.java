package org.adempiere.web.client.apps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.adempiere.common.ADExpression;
import org.adempiere.common.LookupValue;
import org.adempiere.common.ADExpression.ADPredicate;
import org.adempiere.common.ADExpression.BooleanOperator;
import org.adempiere.common.ADExpression.FieldOperator;
import org.adempiere.web.client.Messages;
import org.adempiere.web.client.component.ADFieldBuilder;
import org.adempiere.web.client.component.ADFormBuilder;
import org.adempiere.web.client.component.ADModalDialog;
import org.adempiere.web.client.component.AdModelEditor;
import org.adempiere.web.client.event.ConfirmToolListener;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormField;
import org.adempiere.web.client.model.ADTabModel;
import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;
import org.adempiere.web.client.util.StringUtil;
import org.adempiere.web.client.util.WidgetUtil;
import org.adempiere.web.client.widget.ConfirmToolBar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.StringLabelProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.box.AlertMessageBox;
import com.sencha.gxt.widget.core.client.button.IconButton;
import com.sencha.gxt.widget.core.client.event.BeforeStartEditEvent;
import com.sencha.gxt.widget.core.client.event.BeforeStartEditEvent.BeforeStartEditHandler;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.Field;
import com.sencha.gxt.widget.core.client.form.SimpleComboBox;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.editing.GridInlineEditing;
import com.sencha.gxt.widget.core.client.treegrid.TreeGrid;

public class ADFindPanel extends ADModalDialog implements ConfirmToolListener {

	private static final String			OPERATOR_BOOL_OR	= "**Or**";
	private static final String			OPERATOR_BOOL_AND	= "**And**";
	private static FindPanelUiBinder	uiBinder			= GWT.create(FindPanelUiBinder.class);
	private static Messages				i18n				= GWT.create(Messages.class);

	interface FindPanelUiBinder extends UiBinder<Widget, ADFindPanel> {
	}

	@UiField
	TabPanel							tabContainer;
	@UiField(provided = true)
	AdModelEditor						simpleEditor;
	@UiField
	ConfirmToolBar						toolBar;
	@UiField
	Window								window;
	@UiField(provided = true)
	TreeGrid<ADExpression>				grid;
	@UiField(provided = true)
	SimpleComboBox<String>				cmbFields, cmbProfiles;
	@UiField(provided = true)
	IconButton							btnAdd, btnDelete, btnSave;
	private static final List<String>	LOOKUP_FIELDS	= Arrays.asList("name", "description");
	private Widget						widget			= null;
	private TreeStore<ADExpression>		store;
	private ADTabModel					tabModel;
	private ADPredicate					advanceCondition;
	private ADPredicate					simpleConditon;
	private boolean						usingCondition	= false;

	public ADFindPanel(ADTabModel tabModel) {
		this.tabModel = tabModel;
		this.initWidget(tabModel);
		this.asWidget();
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
			window.setHeadingText(i18n.findPanel_Title(tabModel.getName()));
			toolBar.setToolbarListener(this);
		}
		return widget;
	}

	public Window getWindow() {
		return window;
	}

	@UiHandler({ "btnAdd" })
	void onAddSelected(SelectEvent event) {
		ADExpression item = grid.getSelectionModel().getSelectedItem();
		if (null == item || !item.isParent()) {
			AlertMessageBox dialog = new AlertMessageBox(i18n.adempiere_System(), i18n.findPanel_MsgAdd());
			dialog.show();
			return;
		}
		ADPredicate parent = (ADPredicate) item;
		ADExpression child = createExprBySelect();
		parent.getExpressions().add(child);
		store.add(parent, child);
		grid.getView().refresh(true);
	}

	private ADExpression createExprBySelect() {
		String value = cmbFields.getValue();
		if (OPERATOR_BOOL_AND.equalsIgnoreCase(value)) {
			return new ADPredicate(BooleanOperator.And);
		}
		if (OPERATOR_BOOL_OR.equalsIgnoreCase(value)) {
			return new ADPredicate(BooleanOperator.Or);
		}
		String columnName = tabModel.getFieldByName(value).getPropertyName();
		return new ADExpression(columnName);
	}

	@UiHandler({ "btnDelete" })
	void onDeleteSelected(SelectEvent event) {
		ADExpression childNode = grid.getSelectionModel().getSelectedItem();
		if (null == childNode) {
			AlertMessageBox dialog = new AlertMessageBox(i18n.adempiere_System(), i18n.findPanel_MsgDel());
			dialog.show();
			return;
		}
		ADPredicate parentNode = (ADPredicate) store.getParent(childNode);
		if (null == parentNode) {
			AlertMessageBox mbox = new AlertMessageBox(i18n.adempiere_System(), i18n.findPanel_MsgCannotDel());
			mbox.show();
			return;
		}
		parentNode.remove(childNode);
		store.remove(childNode);
	}

	@UiHandler({ "btnSave" })
	void onSaveSelected(SelectEvent event) {

	}

	@UiHandler({ "cmbProfiles" })
	void onProfileSelected(SelectionEvent<LookupValue> event) {
	}

	private void initWidget(final ADTabModel tabModel) {
		List<? extends ADFormField> fieldList = pickSimpleFields(tabModel);
		ADFormBuilder formStrategy = new ADFormBuilder(fieldList);
		formStrategy.setCreateGridEditor(false);
		formStrategy.setDisableKey(false);
		simpleEditor = new AdModelEditor(formStrategy);
		simpleEditor.setLabelWidth(85);
		simpleEditor.setLayoutWidth(0.62d);

		store = new TreeStore<ADExpression>(new XKeyProvider());
		ColumnConfig<ADExpression, String> nameColumn = new ColumnConfig<ADExpression, String>(new XValueProvider<String>("columnName"));
		nameColumn.setHeader(i18n.findPanel_ColColumn());
		ColumnConfig<ADExpression, FieldOperator> operatorColumn = new ColumnConfig<ADExpression, FieldOperator>(
				new XValueProvider<FieldOperator>("fieldOperator"));
		operatorColumn.setHeader(i18n.findPanel_ColOperator());
		final ColumnConfig<ADExpression, ?> value1Column = new ColumnConfig<ADExpression, Object>(new XValueProvider<Object>("value1"));
		value1Column.setHeader(i18n.findPanel_ColValue1());
		final ColumnConfig<ADExpression, ?> value2Column = new ColumnConfig<ADExpression, Object>(new XValueProvider<Object>("value2"));
		value2Column.setHeader(i18n.findPanel_ColValue2());
		List<ColumnConfig<ADExpression, ?>> columns = new ArrayList<ColumnConfig<ADExpression, ?>>();
		columns.add(nameColumn);
		columns.add(operatorColumn);
		columns.add(value1Column);
		columns.add(value2Column);

		advanceCondition = new ADPredicate(BooleanOperator.And);
		store.add(advanceCondition);

		ColumnModel<ADExpression> cm = new ColumnModel<ADExpression>(columns);
		Images imgs = ResourcesFactory.createImages();
		grid = new TreeGrid<ADExpression>(store, cm, nameColumn);
		grid.getStyle().setNodeOpenIcon(imgs.mOpen());
		grid.getStyle().setNodeCloseIcon(imgs.mClosed());
		grid.getStyle().setLeafIcon(imgs.function16());
		grid.getView().setAutoExpandColumn(nameColumn);

		final GridInlineEditing<ADExpression> editing = new GridInlineEditing<ADExpression>(grid);
		LabelProvider<FieldOperator> labelProvider = new StringLabelProvider<FieldOperator>();
		SimpleComboBox<FieldOperator> opComboBox = new SimpleComboBox<FieldOperator>(labelProvider);
		opComboBox.add(Arrays.asList(FieldOperator.values()));
		opComboBox.setForceSelection(true);
		opComboBox.setTriggerAction(TriggerAction.ALL);
		opComboBox.setEditable(false);
		editing.addEditor(operatorColumn, opComboBox);

		final ADFormBuilder gridStrategy = new ADFormBuilder(tabModel.getFieldList());
		gridStrategy.setDisableKey(false);
		editing.addBeforeStartEditHandler(new BeforeStartEditHandler<ADExpression>() {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			@Override
			public void onBeforeStartEdit(BeforeStartEditEvent<ADExpression> event) {
				ADExpression item = grid.getSelectionModel().getSelectedItem();
				if (item.isParent()) {
					event.setCancelled(true);
					return;
				}
				ADFieldBuilder fieldStrategy = gridStrategy.getFieldStrategy(item.getColumnName());
				if (null != fieldStrategy) {
					Field value1Editor = fieldStrategy.getGridEditor();
					editing.addEditor(value1Column, fieldStrategy.getConverter(), value1Editor);
					// editing.addEditor(value2Column,
					// fieldStrategy.getConverter(), value1Editor);
				}
			}
		});
		initAdvToolBar();
	}

	private void initAdvToolBar() {
		btnAdd = WidgetUtil.createIconButton("images/icons/New24.png");
		btnDelete = WidgetUtil.createIconButton("images/icons/Delete24.png");
		btnSave = WidgetUtil.createIconButton("images/icons/Save24.png");

		LabelProvider<String> labelProvider = new StringLabelProvider<String>();
		cmbFields = new SimpleComboBox<String>(labelProvider);
		cmbFields.add(OPERATOR_BOOL_AND);
		cmbFields.add(OPERATOR_BOOL_OR);
		for (ADFieldModel field : tabModel.getFieldList()) {
			cmbFields.add(field.getName());
		}
		cmbFields.setForceSelection(true);
		cmbFields.setTriggerAction(TriggerAction.ALL);
		cmbFields.setEditable(false);
		cmbFields.setValue(OPERATOR_BOOL_AND);

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

	List<? extends ADFormField> pickSimpleFields(ADTabModel tabModel) {
		List<ADFieldModel> fieldList = new ArrayList<ADFieldModel>(5);
		if (null != tabModel && null != tabModel.getFieldList()) {
			for (ADFieldModel fieldModel : tabModel.getFieldList()) {
				if (fieldModel.isSelectionColumn() || fieldModel.isKey() || LOOKUP_FIELDS.contains(fieldModel.getName().toLowerCase())) {
					fieldList.add(fieldModel);
				}
			}
		}
		return fieldList;
	}

	public void setConfirmToolListener(ConfirmToolListener listener) {
		toolBar.setToolbarListener(listener);
	}

	public ADExpression getCondition() {
		if (!usingCondition) {
			return null;
		}
		Widget widget = tabContainer.getActiveWidget();
		if (0 == tabContainer.getWidgetIndex(widget)) {
			createSimpleConditon();
			return simpleConditon;
		} else {
			store.commitChanges();
			toCamel(advanceCondition);
			return advanceCondition;
		}
	}

	private void toCamel(ADExpression expr) {
		if (expr.isParent()) {
			ADPredicate pred = (ADPredicate) expr;
			for (ADExpression subExpr : pred.getExpressions()) {
				toCamel(subExpr);
			}
		} else {
			expr.setColumnName(expr.getColumnName());
		}
	}

	private void createSimpleConditon() {
		simpleConditon = new ADPredicate(BooleanOperator.Or);
		for (ADFieldBuilder fieldStrategy : simpleEditor.getFieldList()) {
			String columnName = fieldStrategy.getField().getPropertyName();
			String value = StringUtil.toString(fieldStrategy.getFormEditor().getValue());
			if (StringUtil.isNullOrEmpty(value)) {
				continue;
			}
			FieldOperator fOp = FieldOperator.Equal;
			if (fieldStrategy.getFieldType().isText()) {
				fOp = FieldOperator.Like;
			}
			ADExpression expr = new ADExpression(columnName, fOp, value);
			simpleConditon.add(expr);
		}
	}

	@Override
	public void onHelp() {
	}

	@Override
	public void onOK() {
		usingCondition = true;
		super.hide();
	}

	@Override
	public void onCancel() {
		super.hide();
	}

	public static class XKeyProvider implements ModelKeyProvider<ADExpression> {
		@Override
		public String getKey(ADExpression ex) {
			return Integer.toString(ex.hashCode());
		}
	}

	@SuppressWarnings("unchecked")
	public static class XValueProvider<T> implements ValueProvider<ADExpression, T> {
		private String	path;

		public XValueProvider(String path) {
			super();
			this.path = path;
		}

		@Override
		public T getValue(ADExpression ex) {
			Object result = null;
			if (ex.isParent() && !"columnName".equals(path)) {
				result = "";
			} else if ("columnName".equals(path)) {
				result = ex.getColumnName();
			} else if ("fieldOperator".equals(path)) {
				result = ex.getFieldOperator();
			} else if ("value1".equals(path)) {
				result = ex.getValue1();
			} else if ("value2".equals(path)) {
				result = ex.getValue2();
			}
			return (T) result;
		}

		@Override
		public void setValue(ADExpression ex, T value) {
			if (ex.isParent() && !"columnName".equals(path)) {
				return;
			} else if ("columnName".equals(path)) {
				ex.setColumnName((String) value);
			} else if ("fieldOperator".equals(path)) {
				ex.setFieldOperator((FieldOperator) value);
			} else if ("value1".equals(path)) {
				ex.setValue1(toString(value));
			} else if ("value2".equals(path)) {
				ex.setValue2(toString(value));
			}
		}

		public String toString(T value) {
			if (null != value) {
				return value.toString();
			}
			return "";
		}

		@Override
		public String getPath() {
			return path;
		}

	}

}
