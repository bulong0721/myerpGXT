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
	private Boolean hastree;
	private String help;
	private Boolean importfields;
	private Integer includedTabId;
	private Boolean isactive;
	private Boolean isadvancedtab;
	private Boolean isinfotab;
	private Boolean isinsertrecord;
	private Boolean isreadonly;
	private Boolean issinglerow;
	private Boolean issorttab;
	private Boolean istranslationtab;
	private String name;
	private String orderbyclause;
	private Integer parentColumnId;
	private Boolean processing;
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
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_COLUMN_ID", columnDefinition="INT")
	public Integer getAdColumnId() {
		return adColumnId;
	}

	public void setAdColumnId(Integer adColumnId) {
		this.adColumnId = adColumnId;
	}

	@Basic
	@Column(name="AD_COLUMNSORTORDER_ID", columnDefinition="INT")
	public Integer getAdColumnsortorderId() {
		return adColumnsortorderId;
	}

	public void setAdColumnsortorderId(Integer adColumnsortorderId) {
		this.adColumnsortorderId = adColumnsortorderId;
	}

	@Basic
	@Column(name="AD_COLUMNSORTYESNO_ID", columnDefinition="INT")
	public Integer getAdColumnsortyesnoId() {
		return adColumnsortyesnoId;
	}

	public void setAdColumnsortyesnoId(Integer adColumnsortyesnoId) {
		this.adColumnsortyesnoId = adColumnsortyesnoId;
	}

	@Basic
	@Column(name="AD_IMAGE_ID", columnDefinition="INT")
	public Integer getAdImageId() {
		return adImageId;
	}

	public void setAdImageId(Integer adImageId) {
		this.adImageId = adImageId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_PROCESS_ID", columnDefinition="INT")
	public Integer getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(Integer adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Id
	@Column(name="AD_TAB_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_19", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_Tab", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_19")
	public Integer getAdTabId() {
		return adTabId;
	}

	public void setAdTabId(Integer adTabId) {
		this.adTabId = adTabId;
	}

	@Basic
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	@Basic
	@Column(name="AD_WINDOW_ID", columnDefinition="INT", nullable=false)
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
	@Column(columnDefinition="INT", nullable=false)
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
	@Column(nullable=false)
	public Boolean isHastree() {
		return hastree;
	}

	public void setHastree(Boolean hastree) {
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
	public Boolean isImportfields() {
		return importfields;
	}

	public void setImportfields(Boolean importfields) {
		this.importfields = importfields;
	}

	@Basic
	@Column(name="INCLUDED_TAB_ID", columnDefinition="INT")
	public Integer getIncludedTabId() {
		return includedTabId;
	}

	public void setIncludedTabId(Integer includedTabId) {
		this.includedTabId = includedTabId;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsadvancedtab() {
		return isadvancedtab;
	}

	public void setIsadvancedtab(Boolean isadvancedtab) {
		this.isadvancedtab = isadvancedtab;
	}

	@Basic
	public Boolean isIsinfotab() {
		return isinfotab;
	}

	public void setIsinfotab(Boolean isinfotab) {
		this.isinfotab = isinfotab;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsinsertrecord() {
		return isinsertrecord;
	}

	public void setIsinsertrecord(Boolean isinsertrecord) {
		this.isinsertrecord = isinsertrecord;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsreadonly() {
		return isreadonly;
	}

	public void setIsreadonly(Boolean isreadonly) {
		this.isreadonly = isreadonly;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIssinglerow() {
		return issinglerow;
	}

	public void setIssinglerow(Boolean issinglerow) {
		this.issinglerow = issinglerow;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIssorttab() {
		return issorttab;
	}

	public void setIssorttab(Boolean issorttab) {
		this.issorttab = issorttab;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIstranslationtab() {
		return istranslationtab;
	}

	public void setIstranslationtab(Boolean istranslationtab) {
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
	@Column(name="PARENT_COLUMN_ID", columnDefinition="INT")
	public Integer getParentColumnId() {
		return parentColumnId;
	}

	public void setParentColumnId(Integer parentColumnId) {
		this.parentColumnId = parentColumnId;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
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
	@Column(columnDefinition="INT", nullable=false)
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