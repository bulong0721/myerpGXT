package org.adempiere.web.client.component;

import java.text.ParseException;

import org.adempiere.web.client.apps.InfoPanel;
import org.adempiere.web.client.model.FieldModel;

import com.google.gwt.cell.client.ValueUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.text.shared.SafeHtmlRenderer;
import com.sencha.gxt.cell.core.client.form.TriggerFieldCell;
import com.sencha.gxt.cell.core.client.form.TriggerFieldCell.TriggerFieldAppearance;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.event.HideEvent;
import com.sencha.gxt.widget.core.client.event.HideEvent.HideHandler;
import com.sencha.gxt.widget.core.client.form.PropertyEditor;
import com.sencha.gxt.widget.core.client.form.TriggerField;

public class LookupField<T> extends TriggerField<T> {

    public LookupField(ListStore<T> store, LabelProvider<? super T> labelProvider){
        super(new LookupCell<T>(store, labelProvider));
    }

    public interface LookupCellAppearance extends TriggerFieldAppearance {

    }

    public static class LookupCell<T> extends TriggerFieldCell<T> {

        private final LabelProvider<? super T> labelProvider;
        protected ListStore<T>                 store;
        protected InfoPanel                    infoPanel;

        public LookupCell(ListStore<T> store, LabelProvider<? super T> labelProvider){
            this(store, labelProvider, null, GWT.<LookupCellDefaultAppearance> create(LookupCellDefaultAppearance.class));
        }

        public LookupCell(ListStore<T> store, LabelProvider<? super T> labelProvider,
                          final SafeHtmlRenderer<T> renderer, LookupCellAppearance appearance){
            super(appearance);
            this.labelProvider = labelProvider;
            setPropertyEditor(new LookupPropertyEditor());
        }

        public LabelProvider<? super T> getLabelProvider() {
            return labelProvider;
        }

        private InfoPanel getInfoPanel() {
            if (null == infoPanel) {
                FieldModel field = null;
                infoPanel = InfoPanel.create(field);
                infoPanel.addHideHandler(new HideHandler() {

                    @Override
                    public void onHide(HideEvent event) {
                    }
                });
            }
            return infoPanel;
        }

        @Override
        protected void onNavigationKey(Context context, Element parent, T value, NativeEvent event,
                                       ValueUpdater<T> valueUpdater) {
            if (event.getKeyCode() == KeyCodes.KEY_DOWN) {
                event.stopPropagation();
                event.preventDefault();
                onTriggerClick(context, parent.<XElement> cast(), event, value, valueUpdater);
            }
        }

        @Override
        protected void onTriggerClick(Context context, XElement parent, NativeEvent event, T value,
                                      ValueUpdater<T> updater) {
            super.onTriggerClick(context, parent, event, value, updater);

            if (!isReadOnly() && !isDisabled()) {
                getInfoPanel().show();
            }
        }

        private String getRenderedValue(T item) {
            return getPropertyEditor().render(item);
        }

        protected T getByValue(String value) {
            int count = store.size();
            for (int i = 0; i < count; i++) {
                T item = store.get(i);
                String v = getRenderedValue(item);
                if (v != null && v.equals(value)) {
                    return item;
                }
            }
            return null;
        }

        private class LookupPropertyEditor extends PropertyEditor<T> {

            @Override
            public String render(T object) {
                if (object == null) {
                    return "";
                }
                LabelProvider<? super T> provider = getLabelProvider();
                return provider == null ? object.toString() : provider.getLabel(object);
            }

            @Override
            public T parse(CharSequence text) throws ParseException {
                return getByValue(text == null ? "" : text.toString());
            }

        }
    }
}
