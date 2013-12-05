package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_cash database table.
 * 
 */
@Entity
@Table(name="c_cash")
@NamedQuery(name="CCash.findAll", query="SELECT c FROM CCash c")
public class CCash extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCashId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgtrxId;
	private BigDecimal beginningbalance;
	private BigDecimal cActivityId;
	private BigDecimal cCampaignId;
	private BigDecimal cCashbookId;
	private BigDecimal cProjectId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date dateacct;
	private String description;
	private String docaction;
	private String docstatus;
	private BigDecimal endingbalance;
	private String isactive;
	private String isapproved;
	private String name;
	private String posted;
	private String processed;
	private BigDecimal processedon;
	private String processing;
	private Date statementdate;
	private BigDecimal statementdifference;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal user1Id;
	private BigDecimal user2Id;

	public CCash() {
	}


	@Id
	@Column(name="C_CASH_ID")
	public long getCCashId() {
		return this.cCashId;
	}

	public void setCCashId(long cCashId) {
		this.cCashId = cCashId;
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


	@Column(name="AD_ORGTRX_ID")
	public BigDecimal getAdOrgtrxId() {
		return this.adOrgtrxId;
	}

	public void setAdOrgtrxId(BigDecimal adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}


	public BigDecimal getBeginningbalance() {
		return this.beginningbalance;
	}

	public void setBeginningbalance(BigDecimal beginningbalance) {
		this.beginningbalance = beginningbalance;
	}


	@Column(name="C_ACTIVITY_ID")
	public BigDecimal getCActivityId() {
		return this.cActivityId;
	}

	public void setCActivityId(BigDecimal cActivityId) {
		this.cActivityId = cActivityId;
	}


	@Column(name="C_CAMPAIGN_ID")
	public BigDecimal getCCampaignId() {
		return this.cCampaignId;
	}

	public void setCCampaignId(BigDecimal cCampaignId) {
		this.cCampaignId = cCampaignId;
	}


	@Column(name="C_CASHBOOK_ID")
	public BigDecimal getCCashbookId() {
		return this.cCashbookId;
	}

	public void setCCashbookId(BigDecimal cCashbookId) {
		this.cCashbookId = cCashbookId;
	}


	@Column(name="C_PROJECT_ID")
	public BigDecimal getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(BigDecimal cProjectId) {
		this.cProjectId = cProjectId;
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


	@Column(name="USER1_ID")
	public BigDecimal getUser1Id() {
		return this.user1Id;
	}

	public void setUser1Id(BigDecimal user1Id) {
		this.user1Id = user1Id;
	}


	@Column(name="USER2_ID")
	public BigDecimal getUser2Id() {
		return this.user2Id;
	}

	public void setUser2Id(BigDecimal user2Id) {
		this.user2Id = user2Id;
	}

}