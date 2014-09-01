package org.adempiere.process;

public enum DocAction {
    Complete("CO"), WaitComplete("WC"), Approve("AP"), Reject("RJ"), Post("PO"), Void("VO"), Close("CL"),
    Reverse_Correct("RC"), Reverse_Accrual("RA"), ReActivate("RE"), None("--"), Prepare("PR"), Unlock("XL"),
    Invalidate("IN"), ReOpen("OP");

    private String action;

    private DocAction(String action){
        this.action = action;
    }

    public String getAction() {
        return action;
    }

}
