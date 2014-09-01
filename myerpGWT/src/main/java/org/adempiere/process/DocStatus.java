package org.adempiere.process;

public enum DocStatus {
    Drafted("DR"), Completed("CO"), Approved("AP"), Invalid("IN"), NotApproved("NA"), Voided("VO"), Reversed("RE"),
    Closed("CL"), Unknown("??"), InProgress("IP"), WaitingPayment("WP"), WaitingConfirmation("WC");

    private String status;

    private DocStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
