package org.adempiere.util;

import java.util.StringTokenizer;

import org.adempiere.callout.Callout;
import org.adempiere.callout.CalloutContext;
import org.adempiere.common.CalloutResult;
import org.adempiere.persist.PersistContext;
import org.adempiere.web.client.model.FieldModel;
import org.adempiere.web.client.util.StringUtil;

public class CalloutUtil {

	public static CalloutResult processCallout(PersistContext pCtx, FieldModel field, String json) {
		CalloutContext ctx = createContext(pCtx, field, json);
		CalloutResult result = new CalloutResult();
		String callout = field.getCallout();
		if (StringUtil.isNullOrEmpty(callout))
			return result;
		StringTokenizer st = new StringTokenizer(callout, ";,", false);
		while (st.hasMoreTokens()) {
			String cmd = st.nextToken().trim();
			Callout call = null;
			String method = null;
			int methodStart = cmd.lastIndexOf('.');
			try {
				if (methodStart != -1) {
					Class<?> cClass = Class.forName(cmd.substring(0, methodStart));
					call = (Callout) cClass.newInstance();
					method = cmd.substring(methodStart + 1);
					if (call == null || StringUtil.isNullOrEmpty(method)) {
						throw new IllegalArgumentException("Method not found: " + method);
					}
					call.start(ctx, method, result);
				}
			} catch (Exception e) {
				result.setSuccess(false);
				result.addLog(e.getLocalizedMessage());
				break;
			}
		}
		return result;
	}

	private static CalloutContext createContext(PersistContext pCtx, FieldModel field, String json) {
		CalloutContext ctx = new CalloutContext();
		return ctx;
	}
}
