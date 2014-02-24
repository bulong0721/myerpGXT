package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_revenuerecognition_plan")
public class CRevenuerecognitionPlan extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private Integer cCurrencyId;
	private Integer cInvoicelineId;
	private Integer cRevenuerecognitionId;
	private Integer cRevenuerecognitionPlanId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private Integer pRevenueAcct;
	private BigDecimal recognizedamt;
	private BigDecimal totalamt;
	private Integer unearnedrevenueAcct;
	private String updated;
	private Integer updatedby;

	public CRevenuerecognitionPlan() {
	}

	public CRevenuerecognitionPlan(Integer cRevenuerecognitionPlanId) {
		this.cRevenuerecognitionPlanId = cRevenuerecognitionPlanId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT", nullable=false)
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_INVOICELINE_ID", columnDefinition="INT", nullable=false)
	public Integer getCInvoicelineId() {
		return cInvoicelineId;
	}

	public void setCInvoicelineId(Integer cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
	}

	@Basic
	@Column(name="C_REVENUERECOGNITION_ID", columnDefinition="INT", nullable=false)
	public Integer getCRevenuerecognitionId() {
		return cRevenuerecognitionId;
	}

	public void setCRevenuerecognitionId(Integer cRevenuerecognitionId) {
		this.cRevenuerecognitionId = cRevenuerecognitionId;
	}

	@Id
	@Column(name="C_REVENUERECOGNITION_PLAN_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_493", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_RevenueRecognition_Plan", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_493")
	public Integer getCRevenuerecognitionPlanId() {
		return cRevenuerecognitionPlanId;
	}

	public void setCRevenuerecognitionPlanId(Integer cRevenuerecognitionPlanId) {
		this.cRevenuerecognitionPlanId = cRevenuerecognitionPlanId;
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
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
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
	public BigDecimal getRecognizedamt() {
		return recognizedamt;
	}

	public void setRecognizedamt(BigDecimal recognizedamt) {
		this.recognizedamt = recognizedamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getTotalamt() {
		return totalamt;
	}

	public void setTotalamt(BigDecimal totalamt) {
		this.totalamt = totalamt;
	}

	@Basic
	@Column(name="UNEARNEDREVENUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getUnearnedrevenueAcct() {
		return unearnedrevenueAcct;
	}

	public void setUnearnedrevenueAcct(Integer unearnedrevenueAcct) {
		this.unearnedrevenueAcct = unearnedrevenueAcct;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}