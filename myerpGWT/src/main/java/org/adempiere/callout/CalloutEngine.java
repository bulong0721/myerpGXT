package org.adempiere.callout;

import java.lang.reflect.Method;

import org.adempiere.common.CalloutResult;

public abstract class CalloutEngine implements Callout {

	@Override
	public void start(CalloutContext ctx, String methodName, CalloutResult result) {
		Method method;
		try {
			method = getClass().getDeclaredMethod(methodName, CalloutContext.class, CalloutResult.class);
			if (method == null)
				throw new IllegalArgumentException("Method not found: " + methodName);
			method.invoke(this, ctx, result);
		} catch (Exception e) {
			result.setSuccess(false);
			result.addLog(e.getLocalizedMessage());
		}
	}

}
