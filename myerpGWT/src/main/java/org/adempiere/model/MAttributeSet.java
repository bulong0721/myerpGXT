package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_attributeset")
public class MAttributeSet extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String description;
	private Boolean guaranteeDate;
	private Boolean guaranteeDateMandatory;
	private Integer guaranteeDays;
	private Boolean instanceAttribute;
	private Boolean lot;
	private String lotCharEOverwrite;
	private String lotCharSOverwrite;
	private Boolean lotMandatory;
	private Integer mAttributeSetID;
	private Integer mLotCtlID;
	private Integer mSerNoCtlID;
	private String mandatoryType;
	private String name;
	private Boolean serNo;
	private String serNoCharEOverwrite;
	private String serNoCharSOverwrite;
	private Boolean serNoMandatory;
	private String updated;
	private Integer updatedBy;

	public MAttributeSet() {
	}

	public MAttributeSet(Integer mAttributeSetID) {
		this.mAttributeSetID = mAttributeSetID;
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
	@Column(name="ISGUARANTEEDATE", nullable=false)
	public Boolean isGuaranteeDate() {
		return guaranteeDate;
	}

	public void setGuaranteeDate(Boolean guaranteeDate) {
		this.guaranteeDate = guaranteeDate;
	}

	@Basic
	@Column(name="ISGUARANTEEDATEMANDATORY", nullable=false)
	public Boolean isGuaranteeDateMandatory() {
		return guaranteeDateMandatory;
	}

	public void setGuaranteeDateMandatory(Boolean guaranteeDateMandatory) {
		this.guaranteeDateMandatory = guaranteeDateMandatory;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getGuaranteeDays() {
		return guaranteeDays;
	}

	public void setGuaranteeDays(Integer guaranteeDays) {
		this.guaranteeDays = guaranteeDays;
	}

	@Basic
	@Column(name="ISINSTANCEATTRIBUTE", nullable=false)
	public Boolean isInstanceAttribute() {
		return instanceAttribute;
	}

	public void setInstanceAttribute(Boolean instanceAttribute) {
		this.instanceAttribute = instanceAttribute;
	}

	@Basic
	@Column(name="ISLOT", nullable=false)
	public Boolean isLot() {
		return lot;
	}

	public void setLot(Boolean lot) {
		this.lot = lot;
	}

	@Basic
	@Column(length=1)
	public String getLotCharEOverwrite() {
		return lotCharEOverwrite;
	}

	public void setLotCharEOverwrite(String lotCharEOverwrite) {
		this.lotCharEOverwrite = lotCharEOverwrite;
	}

	@Basic
	@Column(length=1)
	public String getLotCharSOverwrite() {
		return lotCharSOverwrite;
	}

	public void setLotCharSOverwrite(String lotCharSOverwrite) {
		this.lotCharSOverwrite = lotCharSOverwrite;
	}

	@Basic
	@Column(name="ISLOTMANDATORY", nullable=false)
	public Boolean isLotMandatory() {
		return lotMandatory;
	}

	public void setLotMandatory(Boolean lotMandatory) {
		this.lotMandatory = lotMandatory;
	}

	@Id
	@Column(name="M_ATTRIBUTESET_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_689", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_AttributeSet", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_689")
	public Integer getMAttributeSetID() {
		return mAttributeSetID;
	}

	public void setMAttributeSetID(Integer mAttributeSetID) {
		this.mAttributeSetID = mAttributeSetID;
	}

	@Basic
	@Column(name="M_LOTCTL_ID", columnDefinition="INT")
	public Integer getMLotCtlID() {
		return mLotCtlID;
	}

	public void setMLotCtlID(Integer mLotCtlID) {
		this.mLotCtlID = mLotCtlID;
	}

	@Basic
	@Column(name="M_SERNOCTL_ID", columnDefinition="INT")
	public Integer getMSerNoCtlID() {
		return mSerNoCtlID;
	}

	public void setMSerNoCtlID(Integer mSerNoCtlID) {
		this.mSerNoCtlID = mSerNoCtlID;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getMandatoryType() {
		return mandatoryType;
	}

	public void setMandatoryType(String mandatoryType) {
		this.mandatoryType = mandatoryType;
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
	@Column(name="ISSERNO", nullable=false)
	public Boolean isSerNo() {
		return serNo;
	}

	public void setSerNo(Boolean serNo) {
		this.serNo = serNo;
	}

	@Basic
	@Column(length=1)
	public String getSerNoCharEOverwrite() {
		return serNoCharEOverwrite;
	}

	public void setSerNoCharEOverwrite(String serNoCharEOverwrite) {
		this.serNoCharEOverwrite = serNoCharEOverwrite;
	}

	@Basic
	@Column(length=1)
	public String getSerNoCharSOverwrite() {
		return serNoCharSOverwrite;
	}

	public void setSerNoCharSOverwrite(String serNoCharSOverwrite) {
		this.serNoCharSOverwrite = serNoCharSOverwrite;
	}

	@Basic
	@Column(name="ISSERNOMANDATORY", nullable=false)
	public Boolean isSerNoMandatory() {
		return serNoMandatory;
	}

	public void setSerNoMandatory(Boolean serNoMandatory) {
		this.serNoMandatory = serNoMandatory;
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