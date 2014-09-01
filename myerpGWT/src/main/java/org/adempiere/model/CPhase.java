package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_phase")
public class CPhase extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cPhaseID;
	private Integer cProjectTypeID;
	private String created;
	private Integer createdBy;
	private String description;
	private String help;
	private Integer mProductID;
	private String name;
	private Integer seqNo;
	private BigDecimal standardQty;
	private String updated;
	private Integer updatedBy;

	public CPhase() {
	}

	public CPhase(Integer cPhaseID) {
		this.cPhaseID = cPhaseID;
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

	@Id
	@Column(name="C_PHASE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_732", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Phase", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_732")
	public Integer getCPhaseID() {
		return cPhaseID;
	}

	public void setCPhaseID(Integer cPhaseID) {
		this.cPhaseID = cPhaseID;
	}

	@Basic
	@Column(name="C_PROJECTTYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getCProjectTypeID() {
		return cProjectTypeID;
	}

	public void setCProjectTypeID(Integer cProjectTypeID) {
		this.cProjectTypeID = cProjectTypeID;
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
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getStandardQty() {
		return standardQty;
	}

	public void setStandardQty(BigDecimal standardQty) {
		this.standardQty = standardQty;
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