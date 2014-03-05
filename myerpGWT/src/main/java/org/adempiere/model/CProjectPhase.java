package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_projectphase")
public class CProjectPhase extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cOrderID;
	private Integer cPhaseID;
	private Integer cProjectID;
	private Integer cProjectPhaseID;
	private Boolean commitCeiling;
	private BigDecimal committedAmt;
	private Boolean complete;
	private String created;
	private Integer createdBy;
	private String description;
	private String endDate;
	private Boolean generateOrder;
	private String help;
	private Integer mProductID;
	private String name;
	private BigDecimal plannedAmt;
	private BigDecimal priceActual;
	private String projInvoiceRule;
	private BigDecimal qty;
	private Integer seqNo;
	private String startDate;
	private String updated;
	private Integer updatedBy;

	public CProjectPhase() {
	}

	public CProjectPhase(Integer cProjectPhaseID) {
		this.cProjectPhaseID = cProjectPhaseID;
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
	@Column(name="C_ORDER_ID", columnDefinition="INT")
	public Integer getCOrderID() {
		return cOrderID;
	}

	public void setCOrderID(Integer cOrderID) {
		this.cOrderID = cOrderID;
	}

	@Basic
	@Column(name="C_PHASE_ID", columnDefinition="INT")
	public Integer getCPhaseID() {
		return cPhaseID;
	}

	public void setCPhaseID(Integer cPhaseID) {
		this.cPhaseID = cPhaseID;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT", nullable=false)
	public Integer getCProjectID() {
		return cProjectID;
	}

	public void setCProjectID(Integer cProjectID) {
		this.cProjectID = cProjectID;
	}

	@Id
	@Column(name="C_PROJECTPHASE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_731", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_ProjectPhase", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_731")
	public Integer getCProjectPhaseID() {
		return cProjectPhaseID;
	}

	public void setCProjectPhaseID(Integer cProjectPhaseID) {
		this.cProjectPhaseID = cProjectPhaseID;
	}

	@Basic
	@Column(name="ISCOMMITCEILING", nullable=false)
	public Boolean isCommitCeiling() {
		return commitCeiling;
	}

	public void setCommitCeiling(Boolean commitCeiling) {
		this.commitCeiling = commitCeiling;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCommittedAmt() {
		return committedAmt;
	}

	public void setCommittedAmt(BigDecimal committedAmt) {
		this.committedAmt = committedAmt;
	}

	@Basic
	@Column(name="ISCOMPLETE", nullable=false)
	public Boolean isComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
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
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Basic
	public Boolean isGenerateOrder() {
		return generateOrder;
	}

	public void setGenerateOrder(Boolean generateOrder) {
		this.generateOrder = generateOrder;
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
	@Column(nullable=false)
	public BigDecimal getPlannedAmt() {
		return plannedAmt;
	}

	public void setPlannedAmt(BigDecimal plannedAmt) {
		this.plannedAmt = plannedAmt;
	}

	@Basic
	public BigDecimal getPriceActual() {
		return priceActual;
	}

	public void setPriceActual(BigDecimal priceActual) {
		this.priceActual = priceActual;
	}

	@Basic
	@Column(length=1)
	public String getProjInvoiceRule() {
		return projInvoiceRule;
	}

	public void setProjInvoiceRule(String projInvoiceRule) {
		this.projInvoiceRule = projInvoiceRule;
	}

	@Basic
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
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
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
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