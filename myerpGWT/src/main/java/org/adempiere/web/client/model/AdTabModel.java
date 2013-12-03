package org.adempiere.web.client.model;

import java.io.Serializable;
import java.util.List;

public class AdTabModel implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private List<AdFieldModel>	fieldList;
	private long				adTabId;
	private Long				adColumnId;
	private Long				adTableId;
	private Long				parentColumnId;
	private Long				seqno;
	private Integer				tablevel;
	private Boolean				isinfotab;
	private Boolean				isinsertrecord;
	private Boolean				isreadonly;
	private Boolean				issinglerow;
	private Boolean				hasTree;
	private String				name;
	private String				readonlylogic;
	private String				tablename;

	public List<AdFieldModel> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<AdFieldModel> fieldList) {
		this.fieldList = fieldList;
	}

	public Boolean getHasTree() {
		return hasTree;
	}

	public void setHasTree(Boolean hasTree) {
		this.hasTree = hasTree;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public long getAdTabId() {
		return adTabId;
	}

	public void setAdTabId(long adTabId) {
		this.adTabId = adTabId;
	}

	public Long getAdColumnId() {
		return adColumnId;
	}

	public void setAdColumnId(Long adColumnId) {
		this.adColumnId = adColumnId;
	}

	public Long getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Long adTableId) {
		this.adTableId = adTableId;
	}

	public Long getParentColumnId() {
		return parentColumnId;
	}

	public void setParentColumnId(Long parentColumnId) {
		this.parentColumnId = parentColumnId;
	}

	public Long getSeqno() {
		return seqno;
	}

	public void setSeqno(Long seqno) {
		this.seqno = seqno;
	}

	public Integer getTablevel() {
		return tablevel;
	}

	public void setTablevel(Integer tablevel) {
		this.tablevel = tablevel;
	}

	public Boolean getIsinfotab() {
		return isinfotab;
	}

	public void setIsinfotab(Boolean isinfotab) {
		this.isinfotab = isinfotab;
	}

	public Boolean getIsinsertrecord() {
		return isinsertrecord;
	}

	public void setIsinsertrecord(Boolean isinsertrecord) {
		this.isinsertrecord = isinsertrecord;
	}

	public Boolean getIsreadonly() {
		return isreadonly;
	}

	public void setIsreadonly(Boolean isreadonly) {
		this.isreadonly = isreadonly;
	}

	public Boolean getIssinglerow() {
		return issinglerow;
	}

	public void setIssinglerow(Boolean issinglerow) {
		this.issinglerow = issinglerow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReadonlylogic() {
		return readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
	}

}
