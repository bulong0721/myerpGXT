package org.adempiere.model.common;

import java.io.File;
import java.io.Serializable;

import org.adempiere.web.client.model.ADProcessArgModel;

public class ProcessInfo implements Serializable {

	private static final long	serialVersionUID	= 1L;

	public boolean isBatch() {
		// TODO Auto-generated method stub
		return false;
	}

	public ADProcessArgModel[] getParameter() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPDFReport(File pDF) {
		// TODO Auto-generated method stub
		
	}

	public int getRecord_ID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
