package org.adempiere.web.client.model;

import org.adempiere.common.DisplayType;
import org.adempiere.web.client.util.JSOUtil;

import com.google.gwt.core.client.JavaScriptObject;

public class JSOEntry implements GwtSerializable, MapEntry {
	private JavaScriptObject	jso;

	public JSOEntry() {
		jso = JavaScriptObject.createObject();
	}

	public JSOEntry(JavaScriptObject jso) {
		this.jso = jso;
	}

	/* (non-Javadoc)
	 * @see org.adempiere.web.client.model.MapAccessable#setValue(java.lang.String, java.lang.Object)
	 */
	@Override
	public void setValue(String path, Object value) {
		JSOUtil.setAttribute(jso, path, value);
	}

	/* (non-Javadoc)
	 * @see org.adempiere.web.client.model.MapAccessable#getValue(java.lang.String, org.adempiere.model.common.DisplayType)
	 */
	@Override
	public Object getValue(String path, DisplayType fieldType) {
		if (fieldType.isInteger()) {
			return JSOUtil.getAttributeAsInteger(jso, path);
		}
		if (fieldType.isID()) {
			if (isStringKey(path, fieldType)) {
				return JSOUtil.getAttributeAsObject(jso, path);
			}
			return JSOUtil.getAttributeAsInteger(jso, path);
		}
		if (fieldType.isFloat()) {
			return JSOUtil.getAttributeAsDouble(jso, path);
		}
		return JSOUtil.getAttributeAsObject(jso, path);
	}

	private boolean isStringKey(String path, DisplayType fieldType) {
		if ("adLanguage".equals(path) || "calendaryear".equals(path)) {
			return true;
		}
		return false;
	}

	public JavaScriptObject getJso() {
		return jso;
	}
	
	@Override
	public String toString() {
		return JSOUtil.toString(jso);
	}

	/* (non-Javadoc)
	 * @see org.adempiere.web.client.model.MapAccessable#deepClone()
	 */
	@Override
	public JSOEntry deepClone() {
		JavaScriptObject newJso = JSOUtil.deepClone(jso);
		return new JSOEntry(newJso);
	}

	public static ADModelKeyProvider createKeyProvider(TabModel tabModel) {
		return new ADModelKeyProvider(tabModel);
	}
}
