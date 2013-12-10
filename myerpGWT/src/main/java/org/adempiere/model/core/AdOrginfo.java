package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_orginfo database table.
 * 
 */
@Entity
@Table(name="ad_orginfo")
@NamedQuery(name="AdOrginfo.findAll", query="SELECT a FROM AdOrginfo a")
public class AdOrginfo extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adOrgId;
	private BigDecimal adClientId;
	private BigDecimal adOrgtypeId;
	private BigDecimal cCalendarId;
	private BigDecimal cLocationId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal dropshipWarehouseId;
	private String duns;
	private String email;
	private String fax;
	private String isactive;
	private BigDecimal logoId;
	private BigDecimal mWarehouseId;
	private BigDecimal paGoalId;
	private BigDecimal parentOrgId;
	private String phone;
	private String phone2;
	private String receiptfootermsg;
	private BigDecimal supervisorId;
	private String taxid;
	private BigDecimal transferbankId;
	private BigDecimal transfercashbookId;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdOrginfo() {
	}


	@Id
	@Column(name="AD_ORG_ID")
	public long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(long adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORGTYPE_ID")
	public BigDecimal getAdOrgtypeId() {
		return this.adOrgtypeId;
	}

	public void setAdOrgtypeId(BigDecimal adOrgtypeId) {
		this.adOrgtypeId = adOrgtypeId;
	}


	@Column(name="C_CALENDAR_ID")
	public BigDecimal getCCalendarId() {
		return this.cCalendarId;
	}

	public void setCCalendarId(BigDecimal cCalendarId) {
		this.cCalendarId = cCalendarId;
	}


	@Column(name="C_LOCATION_ID")
	public BigDecimal getCLocationId() {
		return this.cLocationId;
	}

	public void setCLocationId(BigDecimal cLocationId) {
		this.cLocationId = cLocationId;
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


	@Column(name="DROPSHIP_WAREHOUSE_ID")
	public BigDecimal getDropshipWarehouseId() {
		return this.dropshipWarehouseId;
	}

	public void setDropshipWarehouseId(BigDecimal dropshipWarehouseId) {
		this.dropshipWarehouseId = dropshipWarehouseId;
	}


	public String getDuns() {
		return this.duns;
	}

	public void setDuns(String duns) {
		this.duns = duns;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	@Column(name="LOGO_ID")
	public BigDecimal getLogoId() {
		return this.logoId;
	}

	public void setLogoId(BigDecimal logoId) {
		this.logoId = logoId;
	}


	@Column(name="M_WAREHOUSE_ID")
	public BigDecimal getMWarehouseId() {
		return this.mWarehouseId;
	}

	public void setMWarehouseId(BigDecimal mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}


	@Column(name="PA_GOAL_ID")
	public BigDecimal getPaGoalId() {
		return this.paGoalId;
	}

	public void setPaGoalId(BigDecimal paGoalId) {
		this.paGoalId = paGoalId;
	}


	@Column(name="PARENT_ORG_ID")
	public BigDecimal getParentOrgId() {
		return this.parentOrgId;
	}

	public void setParentOrgId(BigDecimal parentOrgId) {
		this.parentOrgId = parentOrgId;
	}


	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}


	public String getReceiptfootermsg() {
		return this.receiptfootermsg;
	}

	public void setReceiptfootermsg(String receiptfootermsg) {
		this.receiptfootermsg = receiptfootermsg;
	}


	@Column(name="SUPERVISOR_ID")
	public BigDecimal getSupervisorId() {
		return this.supervisorId;
	}

	public void setSupervisorId(BigDecimal supervisorId) {
		this.supervisorId = supervisorId;
	}


	public String getTaxid() {
		return this.taxid;
	}

	public void setTaxid(String taxid) {
		this.taxid = taxid;
	}


	@Column(name="TRANSFERBANK_ID")
	public BigDecimal getTransferbankId() {
		return this.transferbankId;
	}

	public void setTransferbankId(BigDecimal transferbankId) {
		this.transferbankId = transferbankId;
	}


	@Column(name="TRANSFERCASHBOOK_ID")
	public BigDecimal getTransfercashbookId() {
		return this.transfercashbookId;
	}

	public void setTransfercashbookId(BigDecimal transfercashbookId) {
		this.transfercashbookId = transfercashbookId;
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

}