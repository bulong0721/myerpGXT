package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_taxpostal")
public class CTaxpostal extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cTaxId;
	private Integer cTaxpostalId;
	private String created;
	private Integer createdby;
	private String isactive;
	private String postal;
	private String postalTo;
	private String updated;
	private Integer updatedby;

	public CTaxpostal() {
	}

	public CTaxpostal(Integer cTaxpostalId) {
		this.cTaxpostalId = cTaxpostalId;
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
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="C_TAX_ID", nullable=false)
	public Integer getCTaxId() {
		return cTaxId;
	}

	public void setCTaxId(Integer cTaxId) {
		this.cTaxId = cTaxId;
	}

	@Id
	@Column(name="C_TAXPOSTAL_ID")
	public Integer getCTaxpostalId() {
		return cTaxpostalId;
	}

	public void setCTaxpostalId(Integer cTaxpostalId) {
		this.cTaxpostalId = cTaxpostalId;
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
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false, length=10)
	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	@Basic
	@Column(name="POSTAL_TO", length=10)
	public String getPostalTo() {
		return postalTo;
	}

	public void setPostalTo(String postalTo) {
		this.postalTo = postalTo;
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
}