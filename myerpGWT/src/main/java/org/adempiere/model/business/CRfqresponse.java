package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_rfqresponse database table.
 * 
 */
@Entity
@Table(name="c_rfqresponse")
@NamedQuery(name="CRfqresponse.findAll", query="SELECT c FROM CRfqresponse c")
public class CRfqresponse extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRfqresponseId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adUserId;
	private BigDecimal cBpartnerId;
	private BigDecimal cBpartnerLocationId;
	private BigDecimal cCurrencyId;
	private BigDecimal cOrderId;
	private BigDecimal cRfqId;
	private String checkcomplete;
	private Timestamp created;
	private BigDecimal createdby;
	private Date dateinvited;
	private Date dateresponse;
	private Date dateworkcomplete;
	private Date dateworkstart;
	private BigDecimal deliverydays;
	private String description;
	private String help;
	private String isactive;
	private String iscomplete;
	private String isselectedwinner;
	private String isselfservice;
	private String name;
	private BigDecimal price;
	private String processed;
	private String processing;
	private BigDecimal ranking;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRfqresponse() {
	}


	@Id
	@Column(name="C_RFQRESPONSE_ID")
	public long getCRfqresponseId() {
		return this.cRfqresponseId;
	}

	public void setCRfqresponseId(long cRfqresponseId) {
		this.cRfqresponseId = cRfqresponseId;
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


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_BPARTNER_LOCATION_ID")
	public BigDecimal getCBpartnerLocationId() {
		return this.cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(BigDecimal cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_ORDER_ID")
	public BigDecimal getCOrderId() {
		return this.cOrderId;
	}

	public void setCOrderId(BigDecimal cOrderId) {
		this.cOrderId = cOrderId;
	}


	@Column(name="C_RFQ_ID")
	public BigDecimal getCRfqId() {
		return this.cRfqId;
	}

	public void setCRfqId(BigDecimal cRfqId) {
		this.cRfqId = cRfqId;
	}


	public String getCheckcomplete() {
		return this.checkcomplete;
	}

	public void setCheckcomplete(String checkcomplete) {
		this.checkcomplete = checkcomplete;
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
	public Date getDateinvited() {
		return this.dateinvited;
	}

	public void setDateinvited(Date dateinvited) {
		this.dateinvited = dateinvited;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateresponse() {
		return this.dateresponse;
	}

	public void setDateresponse(Date dateresponse) {
		this.dateresponse = dateresponse;
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


	public String getIscomplete() {
		return this.iscomplete;
	}

	public void setIscomplete(String iscomplete) {
		this.iscomplete = iscomplete;
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	public BigDecimal getRanking() {
		return this.ranking;
	}

	public void setRanking(BigDecimal ranking) {
		this.ranking = ranking;
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