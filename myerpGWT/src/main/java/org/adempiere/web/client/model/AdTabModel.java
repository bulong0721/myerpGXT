package org.adempiere.web.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.adempiere.model.core.AdTabV;
import org.adempiere.web.client.util.StringUtil;


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
	private String				name;
	private String				readonlylogic;
	private String				tablename;

	public AdTabModel() {
	}

	public AdTabModel(AdTabV tabEntity) {
		adTabId = tabEntity.getAdTabId();
		adColumnId = tabEntity.getAdColumnId();
		adTableId = tabEntity.getAdTableId();
		parentColumnId = tabEntity.getParentColumnId();
		seqno = tabEntity.getSeqno();
		tablevel = tabEntity.getTablevel();
		isinfotab = StringUtil.isYes(tabEntity.getIsinfotab());
		isreadonly = StringUtil.isYes(tabEntity.getIsreadonly());
		issinglerow = StringUtil.isYes(tabEntity.getIssinglerow());
		name = tabEntity.getName();
		readonlylogic = tabEntity.getReadonlylogic();
		tablename = tabEntity.getTablename();
	}

	public static List<AdTabModel> from(List<AdTabV> tabList) {
		int size = null == tabList ? 0 : tabList.size();
		List<AdTabModel> resultList = new ArrayList<AdTabModel>(size);
		if (null != tabList) {
			for (AdTabV tabEntity : tabList) {
				resultList.add(new AdTabModel(tabEntity));
			}
		}
		return resultList;
	}

	public List<AdFieldModel> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<AdFieldModel> fieldList) {
		this.fieldList = fieldList;
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
