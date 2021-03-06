package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_revenuerecognition_plan")
public class CRevenueRecognitionPlan extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cAcctSchemaID;
	private Integer cCurrencyID;
	private Integer cInvoiceLineID;
	private Integer cRevenueRecognitionID;
	private Integer cRevenueRecognitionPlanID;
	private String created;
	private Integer createdBy;
	private Integer pRevenueAcct;
	private BigDecimal recognizedAmt;
	private BigDecimal totalAmt;
	private Integer unEarnedRevenueAcct;
	private String updated;
	private Integer updatedBy;

	public CRevenueRecognitionPlan() {
	}

	public CRevenueRecognitionPlan(Integer cRevenueRecognitionPlanID) {
		this.cRevenueRecognitionPlanID = cRevenueRecognitionPlanID;
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
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT", nullable=false)
	public Integer getCAcctSchemaID() {
		return cAcctSchemaID;
	}

	public void setCAcctSchemaID(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
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
	@Column(name="C_INVOICELINE_ID", columnDefinition="INT", nullable=false)
	public Integer getCInvoiceLineID() {
		return cInvoiceLineID;
	}

	public void setCInvoiceLineID(Integer cInvoiceLineID) {
		this.cInvoiceLineID = cInvoiceLineID;
	}

	@Basic
	@Column(name="C_REVENUERECOGNITION_ID", columnDefinition="INT", nullable=false)
	public Integer getCRevenueRecognitionID() {
		return cRevenueRecognitionID;
	}

	public void setCRevenueRecognitionID(Integer cRevenueRecognitionID) {
		this.cRevenueRecognitionID = cRevenueRecognitionID;
	}

	@Id
	@Column(name="C_REVENUERECOGNITION_PLAN_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_493", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_RevenueRecognition_Plan", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_493")
	public Integer getCRevenueRecognitionPlanID() {
		return cRevenueRecognitionPlanID;
	}

	public void setCRevenueRecognitionPlanID(Integer cRevenueRecognitionPlanID) {
		this.cRevenueRecognitionPlanID = cRevenueRecognitionPlanID;
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
	@Column(name="P_REVENUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPRevenueAcct() {
		return pRevenueAcct;
	}

	public void setPRevenueAcct(Integer pRevenueAcct) {
		this.pRevenueAcct = pRevenueAcct;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getRecognizedAmt() {
		return recognizedAmt;
	}

	public void setRecognizedAmt(BigDecimal recognizedAmt) {
		this.recognizedAmt = recognizedAmt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	@Basic
	@Column(name="UNEARNEDREVENUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getUnEarnedRevenueAcct() {
		return unEarnedRevenueAcct;
	}

	public void setUnEarnedRevenueAcct(Integer unEarnedRevenueAcct) {
		this.unEarnedRevenueAcct = unEarnedRevenueAcct;
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