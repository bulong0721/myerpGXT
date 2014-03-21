package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_requestupdate")
public class RRequestUpdate extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String confidentialTypeEntry;
	private String created;
	private Integer createdBy;
	private String endTime;
	private Integer mProductSpentID;
	private BigDecimal qtyInvoiced;
	private BigDecimal qtySpent;
	private Integer rRequestID;
	private Integer rRequestUpdateID;
	private String result;
	private String startTime;
	private String updated;
	private Integer updatedBy;

	public RRequestUpdate() {
	}

	public RRequestUpdate(Integer rRequestUpdateID) {
		this.rRequestUpdateID = rRequestUpdateID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getConfidentialTypeEntry() {
		return confidentialTypeEntry;
	}

	public void setConfidentialTypeEntry(String confidentialTypeEntry) {
		this.confidentialTypeEntry = confidentialTypeEntry;
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
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Basic
	@Column(name="M_PRODUCTSPENT_ID", columnDefinition="INT")
	public Integer getMProductSpentID() {
		return mProductSpentID;
	}

	public void setMProductSpentID(Integer mProductSpentID) {
		this.mProductSpentID = mProductSpentID;
	}

	@Basic
	public BigDecimal getQtyInvoiced() {
		return qtyInvoiced;
	}

	public void setQtyInvoiced(BigDecimal qtyInvoiced) {
		this.qtyInvoiced = qtyInvoiced;
	}

	@Basic
	public BigDecimal getQtySpent() {
		return qtySpent;
	}

	public void setQtySpent(BigDecimal qtySpent) {
		this.qtySpent = qtySpent;
	}

	@Basic
	@Column(name="R_REQUEST_ID", columnDefinition="INT", nullable=false)
	public Integer getRRequestID() {
		return rRequestID;
	}

	public void setRRequestID(Integer rRequestID) {
		this.rRequestID = rRequestID;
	}

	@Id
	@Column(name="R_REQUESTUPDATE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1141", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "R_RequestUpdate", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1141")
	public Integer getRRequestUpdateID() {
		return rRequestUpdateID;
	}

	public void setRRequestUpdateID(Integer rRequestUpdateID) {
		this.rRequestUpdateID = rRequestUpdateID;
	}

	@Basic
	@Column(length=2000)
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Basic
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
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
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}