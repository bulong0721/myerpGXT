package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_rfqline database table.
 * 
 */
@Entity
@Table(name="c_rfqline")
@NamedQuery(name="CRfqline.findAll", query="SELECT c FROM CRfqline c")
public class CRfqline extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRfqlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cRfqId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date dateworkcomplete;
	private Date dateworkstart;
	private BigDecimal deliverydays;
	private String description;
	private String help;
	private String isactive;
	private BigDecimal line;
	private BigDecimal mAttributesetinstanceId;
	private BigDecimal mProductId;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRfqline() {
	}


	@Id
	@Column(name="C_RFQLINE_ID")
	public long getCRfqlineId() {
		return this.cRfqlineId;
	}

	public void setCRfqlineId(long cRfqlineId) {
		this.cRfqlineId = cRfqlineId;
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


	@Column(name="C_RFQ_ID")
	public BigDecimal getCRfqId() {
		return this.cRfqId;
	}

	public void setCRfqId(BigDecimal cRfqId) {
		this.cRfqId = cRfqId;
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
	public Date getDateworkcomplete() {
		return this.dateworkcomplete;
	}

	public void setDateworkcomplete(Date dateworkcomplete) {
		this.dateworkcomplete = dateworkcomplete;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateworkstart() {
		return this.dateworkstart;
	}

	public void setDateworkstart(Date dateworkstart) {
		this.dateworkstart = dateworkstart;
	}


	public BigDecimal getDeliverydays() {
		return this.deliverydays;
	}

	public void setDeliverydays(BigDecimal deliverydays) {
		this.deliverydays = deliverydays;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}


	@Column(name="M_ATTRIBUTESETINSTANCE_ID")
	public BigDecimal getMAttributesetinstanceId() {
		return this.mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(BigDecimal mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
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