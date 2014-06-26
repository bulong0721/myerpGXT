package org.adempiere.web.client.event;

import org.adempiere.web.client.model.FormField;

import com.sencha.gxt.widget.core.client.form.Field;

public class FieldEvent {
	protected FieldAction	action;
	protected FormField		field;
	protected Field<?>		editor;

	public FieldEvent(FieldAction action, FormField field) {
		this(action, field, null);
	}

	public FieldEvent(FieldAction action, FormField field, Field<?> editor) {
		super();
		this.action = action;
		this.field = field;
		this.editor = editor;
	}

	public FieldAction getAction() {
		return action;
	}

	public FormField getField() {
		return field;
	}

	public Field<?> getEditor() {
		return editor;
	}

	public enum FieldAction {
		ButtionClick(1), ValueChange(2);

		private int	action;

		FieldAction(int action) {
			this.action = action;
		}

		public boolean isButtionClick() {
			return ButtionClick.action == action;
		}

		public boolean isValueChange() {
			return ValueChange.action == action;
		}
	}
}
