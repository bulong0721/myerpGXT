package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_paymentbatch")
public class CPaymentbatch extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cPaymentbatchId;
	private Integer cPaymentprocessorId;
	private String created;
	private Integer createdby;
	private String documentno;
	private String isactive;
	private String name;
	private String processed;
	private String processing;
	private String processingdate;
	private String updated;
	private Integer updatedby;

	public CPaymentbatch() {
	}

	public CPaymentbatch(Integer cPaymentbatchId) {
		this.cPaymentbatchId = cPaymentbatchId;
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

	@Id
	@Column(name="C_PAYMENTBATCH_ID")
	public Integer getCPaymentbatchId() {
		return cPaymentbatchId;
	}

	public void setCPaymentbatchId(Integer cPaymentbatchId) {
		this.cPaymentbatchId = cPaymentbatchId;
	}

	@Basic
	@Column(name="C_PAYMENTPROCESSOR_ID")
	public Integer getCPaymentprocessorId() {
		return cPaymentprocessorId;
	}

	public void setCPaymentprocessorId(Integer cPaymentprocessorId) {
		this.cPaymentprocessorId = cPaymentprocessorId;
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
	@Column(length=30)
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
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
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	@Basic
	public String getProcessingdate() {
		return processingdate;
	}

	public void setProcessingdate(String processingdate) {
		this.processingdate = processingdate;
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