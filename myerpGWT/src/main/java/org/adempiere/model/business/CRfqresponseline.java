package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_rfqresponseline database table.
 * 
 */
@Entity
@Table(name="c_rfqresponseline")
@NamedQuery(name="CRfqresponseline.findAll", query="SELECT c FROM CRfqresponseline c")
public class CRfqresponseline extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRfqresponselineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cRfqlineId;
	private BigDecimal cRfqresponseId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date dateworkcomplete;
	private Date dateworkstart;
	private BigDecimal deliverydays;
	private String description;
	private String help;
	private String isactive;
	private String isselectedwinner;
	private String isselfservice;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRfqresponseline() {
	}


	@Id
	@Column(name="C_RFQRESPONSELINE_ID")
	public long getCRfqresponselineId() {
		return this.cRfqresponselineId;
	}

	public void setCRfqresponselineId(long cRfqresponselineId) {
		this.cRfqresponselineId = cRfqresponselineId;
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


	@Column(name="C_RFQLINE_ID")
	public BigDecimal getCRfqlineId() {
		return this.cRfqlineId;
	}

	public void setCRfqlineId(BigDecimal cRfqlineId) {
		this.cRfqlineId = cRfqlineId;
	}


	@Column(name="C_RFQRESPONSE_ID")
	public BigDecimal getCRfqresponseId() {
		return this.cRfqresponseId;
	}

	public void setCRfqresponseId(BigDecimal cRfqresponseId) {
		this.cRfqresponseId = cRfqresponseId;
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


	public String getIsselectedwinner() {
		return this.isselectedwinner;
	}

	public void setIsselectedwinner(String isselectedwinner) {
		this.isselectedwinner = isselectedwinner;
	}


	public String getIsselfservice() {
		return this.isselfservice;
	}

	public void setIsselfservice(String isselfservice) {
		this.isselfservice = isselfservice;
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