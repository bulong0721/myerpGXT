package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_bankstatement database table.
 * 
 */
@Entity
@Table(name="c_bankstatement")
@NamedQuery(name="CBankstatement.findAll", query="SELECT c FROM CBankstatement c")
public class CBankstatement extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBankstatementId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal beginningbalance;
	private BigDecimal cBankaccountId;
	private Timestamp created;
	private BigDecimal createdby;
	private String createfrom;
	private String description;
	private String docaction;
	private String docstatus;
	private Date eftstatementdate;
	private String eftstatementreference;
	private BigDecimal endingbalance;
	private String isactive;
	private String isapproved;
	private String ismanual;
	private String matchstatement;
	private String name;
	private String posted;
	private String processed;
	private BigDecimal processedon;
	private String processing;
	private Date statementdate;
	private BigDecimal statementdifference;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBankstatement() {
	}


	@Id
	@Column(name="C_BANKSTATEMENT_ID")
	public long getCBankstatementId() {
		return this.cBankstatementId;
	}

	public void setCBankstatementId(long cBankstatementId) {
		this.cBankstatementId = cBankstatementId;
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


	public BigDecimal getBeginningbalance() {
		return this.beginningbalance;
	}

	public void setBeginningbalance(BigDecimal beginningbalance) {
		this.beginningbalance = beginningbalance;
	}


	@Column(name="C_BANKACCOUNT_ID")
	public BigDecimal getCBankaccountId() {
		return this.cBankaccountId;
	}

	public void setCBankaccountId(BigDecimal cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
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


	public String getCreatefrom() {
		return this.createfrom;
	}

	public void setCreatefrom(String createfrom) {
		this.createfrom = createfrom;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getEftstatementdate() {
		return this.eftstatementdate;
	}

	public void setEftstatementdate(Date eftstatementdate) {
		this.eftstatementdate = eftstatementdate;
	}


	public String getEftstatementreference() {
		return this.eftstatementreference;
	}

	public void setEftstatementreference(String eftstatementreference) {
		this.eftstatementreference = eftstatementreference;
	}


	public BigDecimal getEndingbalance() {
		return this.endingbalance;
	}

	public void setEndingbalance(BigDecimal endingbalance) {
		this.endingbalance = endingbalance;
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


	public String getMatchstatement() {
		return this.matchstatement;
	}

	public void setMatchstatement(String matchstatement) {
		this.matchstatement = matchstatement;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getStatementdate() {
		return this.statementdate;
	}

	public void setStatementdate(Date statementdate) {
		this.statementdate = statementdate;
	}


	public BigDecimal getStatementdifference() {
		return this.statementdifference;
	}

	public void setStatementdifference(BigDecimal statementdifference) {
		this.statementdifference = statementdifference;
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