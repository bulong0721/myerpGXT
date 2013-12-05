package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_campaign database table.
 * 
 */
@Entity
@Table(name="c_campaign")
@NamedQuery(name="CCampaign.findAll", query="SELECT c FROM CCampaign c")
public class CCampaign extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCampaignId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cChannelId;
	private BigDecimal costs;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private Date enddate;
	private String isactive;
	private String issummary;
	private String name;
	private Date startdate;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String value;

	public CCampaign() {
	}


	@Id
	@Column(name="C_CAMPAIGN_ID")
	public long getCCampaignId() {
		return this.cCampaignId;
	}

	public void setCCampaignId(long cCampaignId) {
		this.cCampaignId = cCampaignId;
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


	@Column(name="C_CHANNEL_ID")
	public BigDecimal getCChannelId() {
		return this.cChannelId;
	}

	public void setCChannelId(BigDecimal cChannelId) {
		this.cChannelId = cChannelId;
	}


	public BigDecimal getCosts() {
		return this.costs;
	}

	public void setCosts(BigDecimal costs) {
		this.costs = costs;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIssummary() {
		return this.issummary;
	}

	public void setIssummary(String issummary) {
		this.issummary = issummary;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
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


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}