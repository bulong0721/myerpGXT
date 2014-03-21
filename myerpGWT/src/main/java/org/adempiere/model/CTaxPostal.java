package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_taxpostal")
public class CTaxPostal extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cTaxID;
	private Integer cTaxPostalID;
	private String created;
	private Integer createdBy;
	private String postal;
	private String postalTo;
	private String updated;
	private Integer updatedBy;

	public CTaxPostal() {
	}

	public CTaxPostal(Integer cTaxPostalID) {
		this.cTaxPostalID = cTaxPostalID;
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
	@Column(name="C_TAX_ID", columnDefinition="INT", nullable=false)
	public Integer getCTaxID() {
		return cTaxID;
	}

	public void setCTaxID(Integer cTaxID) {
		this.cTaxID = cTaxID;
	}

	@Id
	@Column(name="C_TAXPOSTAL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_918", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_TaxPostal", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_918")
	public Integer getCTaxPostalID() {
		return cTaxPostalID;
	}

	public void setCTaxPostalID(Integer cTaxPostalID) {
		this.cTaxPostalID = cTaxPostalID;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}