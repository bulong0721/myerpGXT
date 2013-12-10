package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_allocationhdr database table.
 * 
 */
@Entity
@Table(name="c_allocationhdr")
@NamedQuery(name="CAllocationhdr.findAll", query="SELECT c FROM CAllocationhdr c")
public class CAllocationhdr extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cAllocationhdrId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal approvalamt;
	private BigDecimal cCurrencyId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date dateacct;
	private Date datetrx;
	private String description;
	private String docaction;
	private String docstatus;
	private String documentno;
	private String isactive;
	private String isapproved;
	private String ismanual;
	private String posted;
	private String processed;
	private BigDecimal processedon;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CAllocationhdr() {
	}


	@Id
	@Column(name="C_ALLOCATIONHDR_ID")
	public long getCAllocationhdrId() {
		return this.cAllocationhdrId;
	}

	public void setCAllocationhdrId(long cAllocationhdrId) {
		this.cAllocationhdrId = cAllocationhdrId;
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


	public BigDecimal getApprovalamt() {
		return this.approvalamt;
	}

	public void setApprovalamt(BigDecimal approvalamt) {
		this.approvalamt = approvalamt;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateacct() {
		return this.dateacct;
	}

	public void setDateacct(Date dateacct) {
		this.dateacct = dateacct;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatetrx() {
		return this.datetrx;
	}

	public void setDatetrx(Date datetrx) {
		this.datetrx = datetrx;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getDocaction() {
		return this.docaction;
	}

	public void setDocaction(String docaction) {
		this.docaction = docaction;
	}


	public String getDocstatus() {
		return this.docstatus;
	}

	public void setDocstatus(String docstatus) {
		this.docstatus = docstatus;
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


	public String getIsapproved() {
		return this.isapproved;
	}

	public void setIsapproved(String isapproved) {
		this.isapproved = isapproved;
	}


	public String getIsmanual() {
		return this.ismanual;
	}

	public void setIsmanual(String ismanual) {
		this.ismanual = ismanual;
	}


	public String getPosted() {
		return this.posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public BigDecimal getProcessedon() {
		return this.processedon;
	}

	public void setProcessedon(BigDecimal processedon) {
		this.processedon = processedon;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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