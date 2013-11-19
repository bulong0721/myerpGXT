package org.adempiere.web.client.model;

import java.io.Serializable;

import org.adempiere.model.common.DisplayType;
import org.adempiere.web.client.util.JSOUtil;

import com.google.gwt.core.client.JavaScriptObject;

public class AdModelData implements Serializable, MapAccessable {
	private static final long	serialVersionUID	= 1L;
	private JavaScriptObject	jso;

	public AdModelData() {
		jso = JavaScriptObject.createObject();
	}

	public AdModelData(JavaScriptObject jso) {
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
		if (fieldType.isID() || fieldType.isInteger()) {
			return JSOUtil.getAttributeAsInteger(jso, path);
		}
		if (fieldType.isFloat()) {
			return JSOUtil.getAttributeAsDouble(jso, path);
		}
		return JSOUtil.getAttributeAsObject(jso, path);
	}

	public JavaScriptObject getJso() {
		return jso;
	}

	/* (non-Javadoc)
	 * @see org.adempiere.web.client.model.MapAccessable#deepClone()
	 */
	@Override
	public AdModelData deepClone() {
		JavaScriptObject newJso = JSOUtil.deepClone(jso);
		return new AdModelData(newJso);
	}

	public static AdModelKeyProvider createKeyProvider(AdTabModel tabModel) {
		return new AdModelKeyProvider(tabModel);
	}
}
