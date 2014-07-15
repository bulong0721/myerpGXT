package org.adempiere.common;

import java.io.Serializable;

public class ProcessResult implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean           success          = true;
    private String            pdfUrl;
    private String            summary          = "";

    public void setPDFReport(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getPDFReport() {
        return pdfUrl;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSummary(String log) {
        this.summary = log;
    }

    public String getSummary() {
        return summary;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
