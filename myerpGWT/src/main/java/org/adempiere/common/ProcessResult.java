package org.adempiere.common;

import java.io.Serializable;
import java.util.List;

import com.google.gwt.thirdparty.guava.common.collect.Lists;

public class ProcessResult implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean           success          = true;
    private String            pdfUrl;
    private List<String>      logs             = Lists.newArrayList();

    public void setPDFReport(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getPDFReport() {
        return pdfUrl;
    }

    public boolean isSuccess() {
        return success;
    }

    public void addLog(String log) {
        logs.add(log);
    }

    public String[] getLogs() {
        if (null != logs && logs.size() > 0) {
            String[] array = new String[logs.size()];
            return logs.toArray(array);
        }
        return null;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
