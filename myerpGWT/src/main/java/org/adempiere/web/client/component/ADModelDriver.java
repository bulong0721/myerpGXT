package org.adempiere.web.client.component;

import org.adempiere.web.client.model.ADMapData;

import com.google.gwt.editor.client.EditorContext;
import com.google.gwt.editor.client.EditorDelegate;
import com.google.gwt.editor.client.EditorVisitor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;

public interface ADModelDriver extends SimpleBeanEditorDriver<ADMapData, AdModelEditor> {
	public static class ChangesAcceptor extends EditorVisitor {

		@Override
		public <T> void endVisit(EditorContext<T> ctx) {
			EditorDelegate<T> delegate = ctx.getEditorDelegate();
			if (delegate != null) {
				delegate.setDirty(false);
			}
		}
	}
}
