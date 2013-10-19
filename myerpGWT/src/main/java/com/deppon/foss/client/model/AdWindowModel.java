package com.deppon.foss.client.model;

import java.io.Serializable;
import java.util.List;

import com.deppon.foss.shared.adempiere.AdWindow;

public class AdWindowModel implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private List<AdTabModel>	tabList;
	private long				activeTabId;
	private long				adWindowId;
	private String				name;
	private String				processing;
	private String				windowtype;

	public AdWindowModel() {
	}

	public AdWindowModel(AdWindow entity) {
	}

	public List<AdTabModel> getTabList() {
		return tabList;
	}

	public void setTabList(List<AdTabModel> tabList) {
		this.tabList = tabList;
	}

	public long getAdWindowId() {
		return adWindowId;
	}

	public void setAdWindowId(long adWindowId) {
		this.adWindowId = adWindowId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	public String getWindowtype() {
		return windowtype;
	}

	public void setWindowtype(String windowtype) {
		this.windowtype = windowtype;
	}

	public long getActiveTabId() {
		return activeTabId;
	}

	public void setActiveTabId(long activeTabId) {
		this.activeTabId = activeTabId;
	}

}
