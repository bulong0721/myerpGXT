package org.adempiere.callout;

import org.adempiere.common.CalloutResult;

public interface Callout {
	
	void start(CalloutContext ctx, String methodName, final CalloutResult result);
}
