package org.adempiere.model.core;

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
 * The persistent class for the AD_ORG database table.
 * 
 */
@Entity
@Table(name="AD_ORG")
public class AdOrg extends ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adOrgId;
	private BigDecimal adClientId;
	private BigDecimal adReplicationstrategyId;
	private Date created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String issummary;
	private String name;
	private Date updated;
	private BigDecimal updatedby;
	private String value;

	public AdOrg() {
	}


	@Id
	@Column(name="AD_ORG_ID")
	public long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(long adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_REPLICATIONSTRATEGY_ID")
	public BigDecimal getAdReplicationstrategyId() {
		return this.adReplicationstrategyId;
	}

	public void setAdReplicationstrategyId(BigDecimal adReplicationstrategyId) {
		this.adReplicationstrategyId = adReplicationstrategyId;
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


	@Column(name="VALUE")
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}