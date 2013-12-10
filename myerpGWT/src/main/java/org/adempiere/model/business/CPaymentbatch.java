package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_paymentbatch database table.
 * 
 */
@Entity
@Table(name="c_paymentbatch")
@NamedQuery(name="CPaymentbatch.findAll", query="SELECT c FROM CPaymentbatch c")
public class CPaymentbatch extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPaymentbatchId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cPaymentprocessorId;
	private Timestamp created;
	private BigDecimal createdby;
	private String documentno;
	private String isactive;
	private String name;
	private String processed;
	private String processing;
	private Date processingdate;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CPaymentbatch() {
	}


	@Id
	@Column(name="C_PAYMENTBATCH_ID")
	public long getCPaymentbatchId() {
		return this.cPaymentbatchId;
	}

	public void setCPaymentbatchId(long cPaymentbatchId) {
		this.cPaymentbatchId = cPaymentbatchId;
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


	@Column(name="C_PAYMENTPROCESSOR_ID")
	public BigDecimal getCPaymentprocessorId() {
		return this.cPaymentprocessorId;
	}

	public void setCPaymentprocessorId(BigDecimal cPaymentprocessorId) {
		this.cPaymentprocessorId = cPaymentprocessorId;
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


	public String getDocumentno() {
		return this.documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getProcessingdate() {
		return this.processingdate;
	}

	public void setProcessingdate(Date processingdate) {
		this.processingdate = processingdate;
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