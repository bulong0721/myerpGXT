package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_revenuerecognition_plan database table.
 * 
 */
@Entity
@Table(name="c_revenuerecognition_plan")
@NamedQuery(name="CRevenuerecognitionPlan.findAll", query="SELECT c FROM CRevenuerecognitionPlan c")
public class CRevenuerecognitionPlan extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRevenuerecognitionPlanId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cAcctschemaId;
	private BigDecimal cCurrencyId;
	private BigDecimal cInvoicelineId;
	private BigDecimal cRevenuerecognitionId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private BigDecimal pRevenueAcct;
	private BigDecimal recognizedamt;
	private BigDecimal totalamt;
	private BigDecimal unearnedrevenueAcct;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRevenuerecognitionPlan() {
	}


	@Id
	@Column(name="C_REVENUERECOGNITION_PLAN_ID")
	public long getCRevenuerecognitionPlanId() {
		return this.cRevenuerecognitionPlanId;
	}

	public void setCRevenuerecognitionPlanId(long cRevenuerecognitionPlanId) {
		this.cRevenuerecognitionPlanId = cRevenuerecognitionPlanId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="C_ACCTSCHEMA_ID")
	public BigDecimal getCAcctschemaId() {
		return this.cAcctschemaId;
	}

	public void setCAcctschemaId(BigDecimal cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_INVOICELINE_ID")
	public BigDecimal getCInvoicelineId() {
		return this.cInvoicelineId;
	}

	public void setCInvoicelineId(BigDecimal cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
	}


	@Column(name="C_REVENUERECOGNITION_ID")
	public BigDecimal getCRevenuerecognitionId() {
		return this.cRevenuerecognitionId;
	}

	public void setCRevenuerecognitionId(BigDecimal cRevenuerecognitionId) {
		this.cRevenuerecognitionId = cRevenuerecognitionId;
	}


	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	@Column(name="P_REVENUE_ACCT")
	public BigDecimal getPRevenueAcct() {
		return this.pRevenueAcct;
	}

	public void setPRevenueAcct(BigDecimal pRevenueAcct) {
		this.pRevenueAcct = pRevenueAcct;
	}


	public BigDecimal getRecognizedamt() {
		return this.recognizedamt;
	}

	public void setRecognizedamt(BigDecimal recognizedamt) {
		this.recognizedamt = recognizedamt;
	}


	public BigDecimal getTotalamt() {
		return this.totalamt;
	}

	public void setTotalamt(BigDecimal totalamt) {
		this.totalamt = totalamt;
	}


	@Column(name="UNEARNEDREVENUE_ACCT")
	public BigDecimal getUnearnedrevenueAcct() {
		return this.unearnedrevenueAcct;
	}

	public void setUnearnedrevenueAcct(BigDecimal unearnedrevenueAcct) {
		this.unearnedrevenueAcct = unearnedrevenueAcct;
	}


	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}

}