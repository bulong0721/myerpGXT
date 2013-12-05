package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_rfq_topic database table.
 * 
 */
@Entity
@Table(name="c_rfq_topic")
@NamedQuery(name="CRfqTopic.findAll", query="SELECT c FROM CRfqTopic c")
public class CRfqTopic extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRfqTopicId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adPrintformatId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String isselfservice;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRfqTopic() {
	}


	@Id
	@Column(name="C_RFQ_TOPIC_ID")
	public long getCRfqTopicId() {
		return this.cRfqTopicId;
	}

	public void setCRfqTopicId(long cRfqTopicId) {
		this.cRfqTopicId = cRfqTopicId;
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


	@Column(name="AD_PRINTFORMAT_ID")
	public BigDecimal getAdPrintformatId() {
		return this.adPrintformatId;
	}

	public void setAdPrintformatId(BigDecimal adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
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


	public String getIsselfservice() {
		return this.isselfservice;
	}

	public void setIsselfservice(String isselfservice) {
		this.isselfservice = isselfservice;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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