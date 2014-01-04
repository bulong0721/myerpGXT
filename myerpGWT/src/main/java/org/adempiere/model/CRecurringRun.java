package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_recurring_run")
public class CRecurringRun extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cInvoiceId;
	private Integer cOrderId;
	private Integer cPaymentId;
	private Integer cProjectId;
	private Integer cRecurringId;
	private Integer cRecurringRunId;
	private String created;
	private Integer createdby;
	private String datedoc;
	private Integer glJournalbatchId;
	private String isactive;
	private String updated;
	private Integer updatedby;

	public CRecurringRun() {
	}

	public CRecurringRun(Integer cRecurringRunId) {
		this.cRecurringRunId = cRecurringRunId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="C_INVOICE_ID")
	public Integer getCInvoiceId() {
		return cInvoiceId;
	}

	public void setCInvoiceId(Integer cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}

	@Basic
	@Column(name="C_ORDER_ID")
	public Integer getCOrderId() {
		return cOrderId;
	}

	public void setCOrderId(Integer cOrderId) {
		this.cOrderId = cOrderId;
	}

	@Basic
	@Column(name="C_PAYMENT_ID")
	public Integer getCPaymentId() {
		return cPaymentId;
	}

	public void setCPaymentId(Integer cPaymentId) {
		this.cPaymentId = cPaymentId;
	}

	@Basic
	@Column(name="C_PROJECT_ID")
	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Basic
	@Column(name="C_RECURRING_ID", nullable=false)
	public Integer getCRecurringId() {
		return cRecurringId;
	}

	public void setCRecurringId(Integer cRecurringId) {
		this.cRecurringId = cRecurringId;
	}

	@Id
	@Column(name="C_RECURRING_RUN_ID")
	public Integer getCRecurringRunId() {
		return cRecurringRunId;
	}

	public void setCRecurringRunId(Integer cRecurringRunId) {
		this.cRecurringRunId = cRecurringRunId;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public String getDatedoc() {
		return datedoc;
	}

	public void setDatedoc(String datedoc) {
		this.datedoc = datedoc;
	}

	@Basic
	@Column(name="GL_JOURNALBATCH_ID")
	public Integer getGlJournalbatchId() {
		return glJournalbatchId;
	}

	public void setGlJournalbatchId(Integer glJournalbatchId) {
		this.glJournalbatchId = glJournalbatchId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}