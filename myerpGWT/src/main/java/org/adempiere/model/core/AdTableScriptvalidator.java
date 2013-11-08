package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_table_scriptvalidator database table.
 * 
 */
@Entity
@Table(name="ad_table_scriptvalidator")
@NamedQuery(name="AdTableScriptvalidator.findAll", query="SELECT a FROM AdTableScriptvalidator a")
public class AdTableScriptvalidator extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adTableScriptvalidatorId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adRuleId;
	private BigDecimal adTableId;
	private Timestamp created;
	private BigDecimal createdby;
	private String eventmodelvalidator;
	private String isactive;
	private BigDecimal seqno;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdTableScriptvalidator() {
	}


	@Id
	@Column(name="AD_TABLE_SCRIPTVALIDATOR_ID")
	public long getAdTableScriptvalidatorId() {
		return this.adTableScriptvalidatorId;
	}

	public void setAdTableScriptvalidatorId(long adTableScriptvalidatorId) {
		this.adTableScriptvalidatorId = adTableScriptvalidatorId;
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


	@Column(name="AD_RULE_ID")
	public BigDecimal getAdRuleId() {
		return this.adRuleId;
	}

	public void setAdRuleId(BigDecimal adRuleId) {
		this.adRuleId = adRuleId;
	}


	@Column(name="AD_TABLE_ID")
	public BigDecimal getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(BigDecimal adTableId) {
		this.adTableId = adTableId;
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


	public String getEventmodelvalidator() {
		return this.eventmodelvalidator;
	}

	public void setEventmodelvalidator(String eventmodelvalidator) {
		this.eventmodelvalidator = eventmodelvalidator;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
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