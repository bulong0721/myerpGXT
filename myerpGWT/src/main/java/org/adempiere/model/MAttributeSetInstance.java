package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_attributesetinstance")
public class MAttributeSetInstance extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String description;
	private String guaranteeDate;
	private String lot;
	private Integer mAttributeSetID;
	private Integer mAttributeSetInstanceID;
	private Integer mLotID;
	private String serNo;
	private String updated;
	private Integer updatedBy;

	public MAttributeSetInstance() {
	}

	public MAttributeSetInstance(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
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
	public String getGuaranteeDate() {
		return guaranteeDate;
	}

	public void setGuaranteeDate(String guaranteeDate) {
		this.guaranteeDate = guaranteeDate;
	}

	@Basic
	@Column(length=40)
	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	@Basic
	@Column(name="M_ATTRIBUTESET_ID", columnDefinition="INT")
	public Integer getMAttributeSetID() {
		return mAttributeSetID;
	}

	public void setMAttributeSetID(Integer mAttributeSetID) {
		this.mAttributeSetID = mAttributeSetID;
	}

	@Id
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_688", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_AttributeSetInstance", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_688")
	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	@Basic
	@Column(name="M_LOT_ID", columnDefinition="INT")
	public Integer getMLotID() {
		return mLotID;
	}

	public void setMLotID(Integer mLotID) {
		this.mLotID = mLotID;
	}

	@Basic
	@Column(length=40)
	public String getSerNo() {
		return serNo;
	}

	public void setSerNo(String serNo) {
		this.serNo = serNo;
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