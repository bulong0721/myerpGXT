package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_rfq_topicsubscriberonly database table.
 * 
 */
@Entity
@Table(name="c_rfq_topicsubscriberonly")
@NamedQuery(name="CRfqTopicsubscriberonly.findAll", query="SELECT c FROM CRfqTopicsubscriberonly c")
public class CRfqTopicsubscriberonly extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRfqTopicsubscriberonlyId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cRfqTopicsubscriberId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private BigDecimal mProductCategoryId;
	private BigDecimal mProductId;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRfqTopicsubscriberonly() {
	}


	@Id
	@Column(name="C_RFQ_TOPICSUBSCRIBERONLY_ID")
	public long getCRfqTopicsubscriberonlyId() {
		return this.cRfqTopicsubscriberonlyId;
	}

	public void setCRfqTopicsubscriberonlyId(long cRfqTopicsubscriberonlyId) {
		this.cRfqTopicsubscriberonlyId = cRfqTopicsubscriberonlyId;
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


	@Column(name="C_RFQ_TOPICSUBSCRIBER_ID")
	public BigDecimal getCRfqTopicsubscriberId() {
		return this.cRfqTopicsubscriberId;
	}

	public void setCRfqTopicsubscriberId(BigDecimal cRfqTopicsubscriberId) {
		this.cRfqTopicsubscriberId = cRfqTopicsubscriberId;
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


	@Column(name="M_PRODUCT_CATEGORY_ID")
	public BigDecimal getMProductCategoryId() {
		return this.mProductCategoryId;
	}

	public void setMProductCategoryId(BigDecimal mProductCategoryId) {
		this.mProductCategoryId = mProductCategoryId;
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

}