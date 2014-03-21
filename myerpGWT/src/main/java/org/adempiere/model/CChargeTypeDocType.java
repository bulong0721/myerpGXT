package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_chargetype_doctype")
@IdClass(org.adempiere.model.CChargeTypeDocTypePK.class)
public class CChargeTypeDocType extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Boolean allowNegative;
	private Boolean allowPositive;
	private Integer cChargeTypeID;
	private Integer cDocTypeID;
	private String created;
	private Integer createdBy;
	private String updated;
	private Integer updatedBy;

	public CChargeTypeDocType() {
	}

	public CChargeTypeDocType(Integer cChargeTypeID, Integer cDocTypeID) {
		this.cChargeTypeID = cChargeTypeID;
		this.cDocTypeID = cDocTypeID;
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
	@Column(name="ISALLOWNEGATIVE", nullable=false)
	public Boolean isAllowNegative() {
		return allowNegative;
	}

	public void setAllowNegative(Boolean allowNegative) {
		this.allowNegative = allowNegative;
	}

	@Basic
	@Column(name="ISALLOWPOSITIVE", nullable=false)
	public Boolean isAllowPositive() {
		return allowPositive;
	}

	public void setAllowPositive(Boolean allowPositive) {
		this.allowPositive = allowPositive;
	}

	@Id
	@Column(name="C_CHARGETYPE_ID", columnDefinition="INT")
	public Integer getCChargeTypeID() {
		return cChargeTypeID;
	}

	public void setCChargeTypeID(Integer cChargeTypeID) {
		this.cChargeTypeID = cChargeTypeID;
	}

	@Id
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT")
	public Integer getCDocTypeID() {
		return cDocTypeID;
	}

	public void setCDocTypeID(Integer cDocTypeID) {
		this.cDocTypeID = cDocTypeID;
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