package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_tab")
public class AdTab extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adColumnId;
	private Integer adColumnsortorderId;
	private Integer adColumnsortyesnoId;
	private Integer adImageId;
	private Integer adOrgId;
	private Integer adProcessId;
	private Integer adTabId;
	private Integer adTableId;
	private Integer adWindowId;
	private String commitwarning;
	private String created;
	private Integer createdby;
	private String description;
	private String displaylogic;
	private String entitytype;
	private String hastree;
	private String help;
	private String importfields;
	private Integer includedTabId;
	private String isactive;
	private String isadvancedtab;
	private String isinfotab;
	private String isinsertrecord;
	private String isreadonly;
	private String issinglerow;
	private String issorttab;
	private String istranslationtab;
	private String name;
	private String orderbyclause;
	private Integer parentColumnId;
	private String processing;
	private String readonlylogic;
	private Integer seqno;
	private Integer tablevel;
	private String updated;
	private Integer updatedby;
	private String whereclause;

	public AdTab() {
	}

	public AdTab(Integer adTabId) {
		this.adTabId = adTabId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_COLUMN_ID")
	public Integer getAdColumnId() {
		return adColumnId;
	}

	public void setAdColumnId(Integer adColumnId) {
		this.adColumnId = adColumnId;
	}

	@Basic
	@Column(name="AD_COLUMNSORTORDER_ID")
	public Integer getAdColumnsortorderId() {
		return adColumnsortorderId;
	}

	public void setAdColumnsortorderId(Integer adColumnsortorderId) {
		this.adColumnsortorderId = adColumnsortorderId;
	}

	@Basic
	@Column(name="AD_COLUMNSORTYESNO_ID")
	public Integer getAdColumnsortyesnoId() {
		return adColumnsortyesnoId;
	}

	public void setAdColumnsortyesnoId(Integer adColumnsortyesnoId) {
		this.adColumnsortyesnoId = adColumnsortyesnoId;
	}

	@Basic
	@Column(name="AD_IMAGE_ID")
	public Integer getAdImageId() {
		return adImageId;
	}

	public void setAdImageId(Integer adImageId) {
		this.adImageId = adImageId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_PROCESS_ID")
	public Integer getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(Integer adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Id
	@Column(name="AD_TAB_ID")
	public Integer getAdTabId() {
		return adTabId;
	}

	public void setAdTabId(Integer adTabId) {
		this.adTabId = adTabId;
	}

	@Basic
	@Column(name="AD_TABLE_ID", nullable=false)
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	@Basic
	@Column(name="AD_WINDOW_ID", nullable=false)
	public Integer getAdWindowId() {
		return adWindowId;
	}

	public void setAdWindowId(Integer adWindowId) {
		this.adWindowId = adWindowId;
	}

	@Basic
	@Column(length=2000)
	public String getCommitwarning() {
		return commitwarning;
	}

	public void setCommitwarning(String commitwarning) {
		this.commitwarning = commitwarning;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=2000)
	public String getDisplaylogic() {
		return displaylogic;
	}

	public void setDisplaylogic(String displaylogic) {
		this.displaylogic = displaylogic;
	}

	@Basic
	@Column(nullable=false, length=40)
	public String getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getHastree() {
		return hastree;
	}

	public void setHastree(String hastree) {
		this.hastree = hastree;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Basic
	@Column(length=1)
	public String getImportfields() {
		return importfields;
	}

	public void setImportfields(String importfields) {
		this.importfields = importfields;
	}

	@Basic
	@Column(name="INCLUDED_TAB_ID")
	public Integer getIncludedTabId() {
		return includedTabId;
	}

	public void setIncludedTabId(Integer includedTabId) {
		this.includedTabId = includedTabId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsadvancedtab() {
		return isadvancedtab;
	}

	public void setIsadvancedtab(String isadvancedtab) {
		this.isadvancedtab = isadvancedtab;
	}

	@Basic
	@Column(length=1)
	public String getIsinfotab() {
		return isinfotab;
	}

	public void setIsinfotab(String isinfotab) {
		this.isinfotab = isinfotab;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsinsertrecord() {
		return isinsertrecord;
	}

	public void setIsinsertrecord(String isinsertrecord) {
		this.isinsertrecord = isinsertrecord;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsreadonly() {
		return isreadonly;
	}

	public void setIsreadonly(String isreadonly) {
		this.isreadonly = isreadonly;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIssinglerow() {
		return issinglerow;
	}

	public void setIssinglerow(String issinglerow) {
		this.issinglerow = issinglerow;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIssorttab() {
		return issorttab;
	}

	public void setIssorttab(String issorttab) {
		this.issorttab = issorttab;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIstranslationtab() {
		return istranslationtab;
	}

	public void setIstranslationtab(String istranslationtab) {
		this.istranslationtab = istranslationtab;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(length=2000)
	public String getOrderbyclause() {
		return orderbyclause;
	}

	public void setOrderbyclause(String orderbyclause) {
		this.orderbyclause = orderbyclause;
	}

	@Basic
	@Column(name="PARENT_COLUMN_ID")
	public Integer getParentColumnId() {
		return parentColumnId;
	}

	public void setParentColumnId(Integer parentColumnId) {
		this.parentColumnId = parentColumnId;
	}

	@Basic
	@Column(length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=2000)
	public String getReadonlylogic() {
		return readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
	}

	@Basic
	@Column(nullable=false)
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	@Basic
	@Column(nullable=false)
	public Integer getTablevel() {
		return tablevel;
	}

	public void setTablevel(Integer tablevel) {
		this.tablevel = tablevel;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(length=2000)
	public String getWhereclause() {
		return whereclause;
	}

	public void setWhereclause(String whereclause) {
		this.whereclause = whereclause;
	}
}