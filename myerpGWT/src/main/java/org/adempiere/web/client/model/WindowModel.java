package org.adempiere.web.client.model;

import java.util.List;

public class WindowModel implements GwtSerializable {

    private List<TabModel> tabList;
    private long           activeTabId;
    private long           adWindowId;
    private String         name;
    private String         processing;
    private String         windowtype;

    public List<TabModel> getTabList() {
        return tabList;
    }

    public void setTabList(List<TabModel> tabList) {
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
