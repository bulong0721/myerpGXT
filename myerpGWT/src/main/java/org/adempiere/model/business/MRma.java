package org.adempiere.model.business;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.adempiere.model.common.ADEntityBase;


/**
 * The persistent class for the M_RMA database table.
 * 
 */
@Entity
@Table(name="M_RMA")
public class MRma extends ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long mRmaId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal amt;
	private BigDecimal cBpartnerId;
	private BigDecimal cCurrencyId;
	private BigDecimal cDoctypeId;
	private BigDecimal cOrderId;
	private Date created;
	private BigDecimal createdby;
	private String description;
	private String docaction;
	private String docstatus;
	private String documentno;
	private String generateto;
	private String help;
	private BigDecimal inoutId;
	private String isactive;
	private String isapproved;
	private String issotrx;
	private BigDecimal mRmatypeId;
	private String name;
	private String processed;
	private String processing;
	private BigDecimal refRmaId;
	private BigDecimal salesrepId;
	private Date updated;
	private BigDecimal updatedby;

	public MRma() {
	}


	@Id
	@Column(name="M_RMA_ID")
	public long getMRmaId() {
		return this.mRmaId;
	}

	public void setMRmaId(long mRmaId) {
		this.mRmaId = mRmaId;
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


	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_DOCTYPE_ID")
	public BigDecimal getCDoctypeId() {
		return this.cDoctypeId;
	}

	public void setCDoctypeId(BigDecimal cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}


	@Column(name="C_ORDER_ID")
	public BigDecimal getCOrderId() {
		return this.cOrderId;
	}

	public void setCOrderId(BigDecimal cOrderId) {
		this.cOrderId = cOrderId;
	}


	@Temporal(TemporalType.DATE)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}


	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
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


	public String getGenerateto() {
		return this.generateto;
	}

	public void setGenerateto(String generateto) {
		this.generateto = generateto;
	}


	@Column(name="HELP")
	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	@Column(name="INOUT_ID")
	public BigDecimal getInoutId() {
		return this.inoutId;
	}

	public void setInoutId(BigDecimal inoutId) {
		this.inoutId = inoutId;
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


	public String getIssotrx() {
		return this.issotrx;
	}

	public void setIssotrx(String issotrx) {
		this.issotrx = issotrx;
	}


	@Column(name="M_RMATYPE_ID")
	public BigDecimal getMRmatypeId() {
		return this.mRmatypeId;
	}

	public void setMRmatypeId(BigDecimal mRmatypeId) {
		this.mRmatypeId = mRmatypeId;
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


	@Column(name="REF_RMA_ID")
	public BigDecimal getRefRmaId() {
		return this.refRmaId;
	}

	public void setRefRmaId(BigDecimal refRmaId) {
		this.refRmaId = refRmaId;
	}


	@Column(name="SALESREP_ID")
	public BigDecimal getSalesrepId() {
		return this.salesrepId;
	}

	public void setSalesrepId(BigDecimal salesrepId) {
		this.salesrepId = salesrepId;
	}


	@Temporal(TemporalType.DATE)
	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}

}