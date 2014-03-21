package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bp_relation")
public class CBPRelation extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Boolean billTo;
	private Integer cBPRelationID;
	private Integer cBPartnerID;
	private Integer cBPartnerLocationID;
	private Integer cBPartnerRelationID;
	private Integer cBPartnerRelationLocationID;
	private String created;
	private Integer createdBy;
	private String description;
	private String name;
	private Boolean payFrom;
	private Boolean remitTo;
	private Boolean shipTo;
	private String updated;
	private Integer updatedBy;

	public CBPRelation() {
	}

	public CBPRelation(Integer cBPRelationID) {
		this.cBPRelationID = cBPRelationID;
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
	@Column(name="ISBILLTO", nullable=false)
	public Boolean isBillTo() {
		return billTo;
	}

	public void setBillTo(Boolean billTo) {
		this.billTo = billTo;
	}

	@Id
	@Column(name="C_BP_RELATION_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_853", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_BP_Relation", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_853")
	public Integer getCBPRelationID() {
		return cBPRelationID;
	}

	public void setCBPRelationID(Integer cBPRelationID) {
		this.cBPRelationID = cBPRelationID;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
	}

	@Basic
	@Column(name="C_BPARTNER_LOCATION_ID", columnDefinition="INT")
	public Integer getCBPartnerLocationID() {
		return cBPartnerLocationID;
	}

	public void setCBPartnerLocationID(Integer cBPartnerLocationID) {
		this.cBPartnerLocationID = cBPartnerLocationID;
	}

	@Basic
	@Column(name="C_BPARTNERRELATION_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerRelationID() {
		return cBPartnerRelationID;
	}

	public void setCBPartnerRelationID(Integer cBPartnerRelationID) {
		this.cBPartnerRelationID = cBPartnerRelationID;
	}

	@Basic
	@Column(name="C_BPARTNERRELATION_LOCATION_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerRelationLocationID() {
		return cBPartnerRelationLocationID;
	}

	public void setCBPartnerRelationLocationID(Integer cBPartnerRelationLocationID) {
		this.cBPartnerRelationLocationID = cBPartnerRelationLocationID;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	@Column(name="ISPAYFROM", nullable=false)
	public Boolean isPayFrom() {
		return payFrom;
	}

	public void setPayFrom(Boolean payFrom) {
		this.payFrom = payFrom;
	}

	@Basic
	@Column(name="ISREMITTO", nullable=false)
	public Boolean isRemitTo() {
		return remitTo;
	}

	public void setRemitTo(Boolean remitTo) {
		this.remitTo = remitTo;
	}

	@Basic
	@Column(name="ISSHIPTO", nullable=false)
	public Boolean isShipTo() {
		return shipTo;
	}

	public void setShipTo(Boolean shipTo) {
		this.shipTo = shipTo;
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