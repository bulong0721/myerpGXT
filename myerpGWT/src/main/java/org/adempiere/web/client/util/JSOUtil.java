package org.adempiere.web.client.util;

import java.util.Date;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

public class JSOUtil {

	public static native String getAttribute(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		return (ret == null ? null : String(ret));
	}-*/;

	public static native void setAttribute(JavaScriptObject elem, String attr, String value) /*-{
		elem[attr] = (value == null ? null : String(value));
	}-*/;

	public static native void setObjectAttribute(JavaScriptObject elem, String attr, Object object) /*-{
		elem[attr] = object;
	}-*/;

	public static native void setNullAttribute(JavaScriptObject elem, String attr) /*-{
		elem[attr] = null;
	}-*/;

	public static void setAttribute(JavaScriptObject elem, String attr, Object value) {
		if (value == null) {
			setNullAttribute(elem, attr);
		} else if (value instanceof String || value instanceof Character) {
			setAttribute(elem, attr, value.toString());
		} else if (value instanceof Number) {
			setAttribute(elem, attr, (Number) value);
		} else if (value instanceof Boolean) {
			setAttribute(elem, attr, ((Boolean) value).booleanValue());
		} else if (value instanceof Date) {
			setAttribute(elem, attr, (Date) value);
		} else {
			setObjectAttribute(elem, attr, value);
		}
	}

	public static String[] getKeys(String json) {
		JavaScriptObject jsObject = JSOUtil.eval(json);
		return JSOUtil.getKeys(jsObject);
	}

	public static native String[] getKeys(JavaScriptObject jsObject) /*-{
		var i = 0;
		for ( var key in jsObject) {
			if (jsObject.hasOwnProperty(key)) {
				result[i++] = key;
			}
		}
		return result;
	}-*/;

	public static void setAttribute(JavaScriptObject elem, String attr, Boolean value) {
		if (value == null) {
			setNullAttribute(elem, attr);
		} else {
			setAttribute(elem, attr, value.booleanValue());
		}
	}

	public static native void setAttribute(JavaScriptObject elem, String attr, boolean value) /*-{
		elem[attr] = value;
	}-*/;

	public static JsDate convertToJavaScriptDate(Date date) {
		if (date == null)
			return null;
		return createJavaScriptDate(date.getTime());
	}

	public static void setAttribute(JavaScriptObject elem, String attr, Date value) {
		setAttribute(elem, attr, convertToJavaScriptDate(value));
	}

	public static double doubleValue(Number num) {
		if (num == null)
			return Double.NaN;
		if (num instanceof Float) {
			return Double.parseDouble(num.toString());
		} else if (num instanceof Long) {
			long l = num.longValue();
			final double d = (double) l;
			return d;
		} else {
			return num.doubleValue();
		}
	}

	public static void setAttribute(JavaScriptObject elem, String attr, Number value) {
		if (value == null) {
			setNullAttribute(elem, attr);
		} else {
			setAttribute(elem, attr, doubleValue(value));
		}
	}

	public static native void setAttribute(JavaScriptObject elem, String attr, double value) /*-{
		elem[attr] = value;
	}-*/;

	private static native JsDate createJavaScriptDate(double time) /*-{
		// Use $wnd.Date.create() instead of JsDate.create() so that instance methods like
		// duplicate() are added to the resulting JavaScript date object.
		var jsD = $wnd.Date.create();
		jsD.setTime(time);
		return jsD;
	}-*/;

	public static native Object getAttributeAsObject(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		if (ret === undefined || ret == null)
			return null;
		if (typeof ret === 'number' && isFinite(ret)) {
			return @org.adempiere.web.client.util.JSOUtil::toDouble(D)(ret);
		}
		if (typeof ret === 'boolean')
			return @org.adempiere.web.client.util.JSOUtil::toBoolean(Z)(ret);
		return ret;
	}-*/;

	public static native Double getAttributeAsDouble(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		if (ret === undefined || ret == null) {
			return null;
		} else {
			if (typeof ret == "object") {
				return ret;
			} else {
				return @org.adempiere.web.client.util.JSOUtil::toDouble(D)(ret);
			}
		}
	}-*/;

	public static native Integer getAttributeAsLong(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		return (ret == null ? null
				: @org.adempiere.web.client.util.JSOUtil::toLong(D)(ret));
	}-*/;

	public static native Integer getAttributeAsInteger(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		return (ret == null ? null
				: @org.adempiere.web.client.util.JSOUtil::toInteger(I)(ret));
	}-*/;

	public static Boolean toBoolean(boolean value) {
		return value;
	}

	public static Integer toInteger(int value) {
		return value;
	}

	public static Double toDouble(double value) {
		return value;
	}

	public static Long toLong(double value) {
		return (long) value;
	}

	public static native JavaScriptObject eval(String json) /*-{
		return eval('(' + json + ')');
	}-*/;

	public static native int getArrayLength(JavaScriptObject array) /*-{
		return array.length;
	}-*/;

	public static native int getJavaScriptObjectArraySize(JavaScriptObject elem) /*-{
		var length;
		if (elem)
			length = elem.length;
		if (length == null)
			length = 0;
		return length;
	}-*/;

	public static native JavaScriptObject getValueFromJavaScriptObjectArray(JavaScriptObject elem, int i) /*-{
		return elem[i];
	}-*/;

	public static JavaScriptObject[] toArray(JavaScriptObject array) {
		final int length = getJavaScriptObjectArraySize(array);
		JavaScriptObject[] recs = new JavaScriptObject[length];
		for (int i = 0; i < length; i++) {
			recs[i] = getValueFromJavaScriptObjectArray(array, i);
		}
		return recs;
	}

	public static native String toString(JavaScriptObject jso) /*-{
		var jsonString = JSON.stringify(jso);
		return jsonString;
	}-*/;

	public static JavaScriptObject deepClone(JavaScriptObject jso) {
		String jsonString = toString(jso);
		return JSOUtil.eval(jsonString);
	};

	public static native int arrayLength(JavaScriptObject array) /*-{
		return array.length;
	}-*/;

	public static native Object arrayGet(JavaScriptObject array, int index) /*-{
		return array[index];
	}-*/;

	public static native void arraySet(JavaScriptObject array, int index, Object value) /*-{
		array[index] = value;
	}-*/;

	public static native void arraySet(JavaScriptObject array, int index, JavaScriptObject value) /*-{
		array[index] = value;
	}-*/;

}
