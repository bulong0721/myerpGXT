package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_commission")
public class CCommission extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cBPartnerID;
	private Integer cChargeID;
	private Integer cCommissionID;
	private Integer cCurrencyID;
	private Boolean createFrom;
	private String created;
	private Integer createdBy;
	private String dateLastRun;
	private String description;
	private String docBasisType;
	private String frequencyType;
	private Boolean listDetails;
	private String name;
	private Boolean processing;
	private String updated;
	private Integer updatedBy;

	public CCommission() {
	}

	public CCommission(Integer cCommissionID) {
		this.cCommissionID = cCommissionID;
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
	@Column(name="C_BPARTNER_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
	}

	@Basic
	@Column(name="C_CHARGE_ID", columnDefinition="INT", nullable=false)
	public Integer getCChargeID() {
		return cChargeID;
	}

	public void setCChargeID(Integer cChargeID) {
		this.cChargeID = cChargeID;
	}

	@Id
	@Column(name="C_COMMISSION_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_366", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Commission", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_366")
	public Integer getCCommissionID() {
		return cCommissionID;
	}

	public void setCCommissionID(Integer cCommissionID) {
		this.cCommissionID = cCommissionID;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
	}

	@Basic
	public Boolean isCreateFrom() {
		return createFrom;
	}

	public void setCreateFrom(Boolean createFrom) {
		this.createFrom = createFrom;
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
	public String getDateLastRun() {
		return dateLastRun;
	}

	public void setDateLastRun(String dateLastRun) {
		this.dateLastRun = dateLastRun;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getDocBasisType() {
		return docBasisType;
	}

	public void setDocBasisType(String docBasisType) {
		this.docBasisType = docBasisType;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getFrequencyType() {
		return frequencyType;
	}

	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isListDetails() {
		return listDetails;
	}

	public void setListDetails(Boolean listDetails) {
		this.listDetails = listDetails;
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
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
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