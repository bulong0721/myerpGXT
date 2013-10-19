package com.deppon.foss.shared.adempiere;

import java.io.Serializable;
import javax.persistence.*;

import com.deppon.foss.shared.AdEntityBase;

import java.sql.Timestamp;
import java.math.BigDecimal;

/**
 * The persistent class for the ad_tab database table.
 * 
 */
@Entity
@Table(name = "ad_tab")
public class AdTab extends AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adTabId;
	private BigDecimal			adClientId;
	private BigDecimal			adColumnId;
	private BigDecimal			adColumnsortorderId;
	private BigDecimal			adColumnsortyesnoId;
	private BigDecimal			adImageId;
	private BigDecimal			adOrgId;
	private BigDecimal			adProcessId;
	private BigDecimal			adTableId;
	private BigDecimal			adWindowId;
	private String				commitwarning;
	private Timestamp			created;
	private BigDecimal			createdby;
	private String				description;
	private String				displaylogic;
	private String				entitytype;
	private String				hastree;
	private String				help;
	private String				importfields;
	private BigDecimal			includedTabId;
	private String				isactive;
	private String				isadvancedtab;
	private String				isinfotab;
	private String				isinsertrecord;
	private String				isreadonly;
	private String				issinglerow;
	private String				issorttab;
	private String				istranslationtab;
	private String				name;
	private String				orderbyclause;
	private BigDecimal			parentColumnId;
	private String				processing;
	private String				readonlylogic;
	private BigDecimal			seqno;
	private BigDecimal			tablevel;
	private Timestamp			updated;
	private BigDecimal			updatedby;
	private String				whereclause;

	public AdTab() {
	}

	@Id
	@Column(name = "AD_TAB_ID")
	public long getAdTabId() {
		return this.adTabId;
	}

	public void setAdTabId(long adTabId) {
		this.adTabId = adTabId;
	}

	@Column(name = "AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_COLUMN_ID")
	public BigDecimal getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(BigDecimal adColumnId) {
		this.adColumnId = adColumnId;
	}

	@Column(name = "AD_COLUMNSORTORDER_ID")
	public BigDecimal getAdColumnsortorderId() {
		return this.adColumnsortorderId;
	}

	public void setAdColumnsortorderId(BigDecimal adColumnsortorderId) {
		this.adColumnsortorderId = adColumnsortorderId;
	}

	@Column(name = "AD_COLUMNSORTYESNO_ID")
	public BigDecimal getAdColumnsortyesnoId() {
		return this.adColumnsortyesnoId;
	}

	public void setAdColumnsortyesnoId(BigDecimal adColumnsortyesnoId) {
		this.adColumnsortyesnoId = adColumnsortyesnoId;
	}

	@Column(name = "AD_IMAGE_ID")
	public BigDecimal getAdImageId() {
		return this.adImageId;
	}

	public void setAdImageId(BigDecimal adImageId) {
		this.adImageId = adImageId;
	}

	@Column(name = "AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Column(name = "AD_PROCESS_ID")
	public BigDecimal getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(BigDecimal adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Column(name = "AD_TABLE_ID")
	public BigDecimal getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(BigDecimal adTableId) {
		this.adTableId = adTableId;
	}

	@Column(name = "AD_WINDOW_ID")
	public BigDecimal getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(BigDecimal adWindowId) {
		this.adWindowId = adWindowId;
	}

	public String getCommitwarning() {
		return this.commitwarning;
	}

	public void setCommitwarning(String commitwarning) {
		this.commitwarning = commitwarning;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplaylogic() {
		return this.displaylogic;
	}

	public void setDisplaylogic(String displaylogic) {
		this.displaylogic = displaylogic;
	}

	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	public String getHastree() {
		return this.hastree;
	}

	public void setHastree(String hastree) {
		this.hastree = hastree;
	}

	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getImportfields() {
		return this.importfields;
	}

	public void setImportfields(String importfields) {
		this.importfields = importfields;
	}

	@Column(name = "INCLUDED_TAB_ID")
	public BigDecimal getIncludedTabId() {
		return this.includedTabId;
	}

	public void setIncludedTabId(BigDecimal includedTabId) {
		this.includedTabId = includedTabId;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIsadvancedtab() {
		return this.isadvancedtab;
	}

	public void setIsadvancedtab(String isadvancedtab) {
		this.isadvancedtab = isadvancedtab;
	}

	public String getIsinfotab() {
		return this.isinfotab;
	}

	public void setIsinfotab(String isinfotab) {
		this.isinfotab = isinfotab;
	}

	public String getIsinsertrecord() {
		return this.isinsertrecord;
	}

	public void setIsinsertrecord(String isinsertrecord) {
		this.isinsertrecord = isinsertrecord;
	}

	public String getIsreadonly() {
		return this.isreadonly;
	}

	public void setIsreadonly(String isreadonly) {
		this.isreadonly = isreadonly;
	}

	public String getIssinglerow() {
		return this.issinglerow;
	}

	public void setIssinglerow(String issinglerow) {
		this.issinglerow = issinglerow;
	}

	public String getIssorttab() {
		return this.issorttab;
	}

	public void setIssorttab(String issorttab) {
		this.issorttab = issorttab;
	}

	public String getIstranslationtab() {
		return this.istranslationtab;
	}

	public void setIstranslationtab(String istranslationtab) {
		this.istranslationtab = istranslationtab;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrderbyclause() {
		return this.orderbyclause;
	}

	public void setOrderbyclause(String orderbyclause) {
		this.orderbyclause = orderbyclause;
	}

	@Column(name = "PARENT_COLUMN_ID")
	public BigDecimal getParentColumnId() {
		return this.parentColumnId;
	}

	public void setParentColumnId(BigDecimal parentColumnId) {
		this.parentColumnId = parentColumnId;
	}

	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	public String getReadonlylogic() {
		return this.readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
	}

	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
	}

	public BigDecimal getTablevel() {
		return this.tablevel;
	}

	public void setTablevel(BigDecimal tablevel) {
		this.tablevel = tablevel;
	}

	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}

	public String getWhereclause() {
		return this.whereclause;
	}

	public void setWhereclause(String whereclause) {
		this.whereclause = whereclause;
	}

}