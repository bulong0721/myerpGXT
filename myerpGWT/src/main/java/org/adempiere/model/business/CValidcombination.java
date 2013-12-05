package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_validcombination database table.
 * 
 */
@Entity
@Table(name="c_validcombination")
@NamedQuery(name="CValidcombination.findAll", query="SELECT c FROM CValidcombination c")
public class CValidcombination extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cValidcombinationId;
	private BigDecimal accountId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgtrxId;
	private String alias;
	private BigDecimal cAcctschemaId;
	private BigDecimal cActivityId;
	private BigDecimal cBpartnerId;
	private BigDecimal cCampaignId;
	private BigDecimal cLocfromId;
	private BigDecimal cLoctoId;
	private BigDecimal cProjectId;
	private BigDecimal cSalesregionId;
	private BigDecimal cSubacctId;
	private String combination;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String isfullyqualified;
	private BigDecimal mProductId;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal user1Id;
	private BigDecimal user2Id;
	private BigDecimal userelement1Id;
	private BigDecimal userelement2Id;

	public CValidcombination() {
	}


	@Id
	@Column(name="C_VALIDCOMBINATION_ID")
	public long getCValidcombinationId() {
		return this.cValidcombinationId;
	}

	public void setCValidcombinationId(long cValidcombinationId) {
		this.cValidcombinationId = cValidcombinationId;
	}


	@Column(name="ACCOUNT_ID")
	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
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


	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}


	@Column(name="C_ACCTSCHEMA_ID")
	public BigDecimal getCAcctschemaId() {
		return this.cAcctschemaId;
	}

	public void setCAcctschemaId(BigDecimal cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}


	@Column(name="C_ACTIVITY_ID")
	public BigDecimal getCActivityId() {
		return this.cActivityId;
	}

	public void setCActivityId(BigDecimal cActivityId) {
		this.cActivityId = cActivityId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_CAMPAIGN_ID")
	public BigDecimal getCCampaignId() {
		return this.cCampaignId;
	}

	public void setCCampaignId(BigDecimal cCampaignId) {
		this.cCampaignId = cCampaignId;
	}


	@Column(name="C_LOCFROM_ID")
	public BigDecimal getCLocfromId() {
		return this.cLocfromId;
	}

	public void setCLocfromId(BigDecimal cLocfromId) {
		this.cLocfromId = cLocfromId;
	}


	@Column(name="C_LOCTO_ID")
	public BigDecimal getCLoctoId() {
		return this.cLoctoId;
	}

	public void setCLoctoId(BigDecimal cLoctoId) {
		this.cLoctoId = cLoctoId;
	}


	@Column(name="C_PROJECT_ID")
	public BigDecimal getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(BigDecimal cProjectId) {
		this.cProjectId = cProjectId;
	}


	@Column(name="C_SALESREGION_ID")
	public BigDecimal getCSalesregionId() {
		return this.cSalesregionId;
	}

	public void setCSalesregionId(BigDecimal cSalesregionId) {
		this.cSalesregionId = cSalesregionId;
	}


	@Column(name="C_SUBACCT_ID")
	public BigDecimal getCSubacctId() {
		return this.cSubacctId;
	}

	public void setCSubacctId(BigDecimal cSubacctId) {
		this.cSubacctId = cSubacctId;
	}


	public String getCombination() {
		return this.combination;
	}

	public void setCombination(String combination) {
		this.combination = combination;
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


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsfullyqualified() {
		return this.isfullyqualified;
	}

	public void setIsfullyqualified(String isfullyqualified) {
		this.isfullyqualified = isfullyqualified;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
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


	@Column(name="USERELEMENT1_ID")
	public BigDecimal getUserelement1Id() {
		return this.userelement1Id;
	}

	public void setUserelement1Id(BigDecimal userelement1Id) {
		this.userelement1Id = userelement1Id;
	}


	@Column(name="USERELEMENT2_ID")
	public BigDecimal getUserelement2Id() {
		return this.userelement2Id;
	}

	public void setUserelement2Id(BigDecimal userelement2Id) {
		this.userelement2Id = userelement2Id;
	}

}