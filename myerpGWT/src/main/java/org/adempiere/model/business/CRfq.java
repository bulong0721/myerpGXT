package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_rfq database table.
 * 
 */
@Entity
@Table(name="c_rfq")
@NamedQuery(name="CRfq.findAll", query="SELECT c FROM CRfq c")
public class CRfq extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRfqId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adUserId;
	private BigDecimal cBpartnerId;
	private BigDecimal cBpartnerLocationId;
	private BigDecimal cCurrencyId;
	private BigDecimal cOrderId;
	private BigDecimal cRfqTopicId;
	private String copylines;
	private Timestamp created;
	private BigDecimal createdby;
	private String createpo;
	private String createso;
	private Date dateresponse;
	private Date dateworkcomplete;
	private Date dateworkstart;
	private BigDecimal deliverydays;
	private String description;
	private String documentno;
	private String help;
	private String isactive;
	private String isinvitedvendorsonly;
	private String isquoteallqty;
	private String isquotetotalamt;
	private String isrfqresponseaccepted;
	private String isselfservice;
	private BigDecimal margin;
	private String name;
	private String processed;
	private String processing;
	private String publishrfq;
	private String quotetype;
	private String rankrfq;
	private BigDecimal salesrepId;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRfq() {
	}


	@Id
	@Column(name="C_RFQ_ID")
	public long getCRfqId() {
		return this.cRfqId;
	}

	public void setCRfqId(long cRfqId) {
		this.cRfqId = cRfqId;
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


	@Column(name="C_RFQ_TOPIC_ID")
	public BigDecimal getCRfqTopicId() {
		return this.cRfqTopicId;
	}

	public void setCRfqTopicId(BigDecimal cRfqTopicId) {
		this.cRfqTopicId = cRfqTopicId;
	}


	public String getCopylines() {
		return this.copylines;
	}

	public void setCopylines(String copylines) {
		this.copylines = copylines;
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


	public String getCreatepo() {
		return this.createpo;
	}

	public void setCreatepo(String createpo) {
		this.createpo = createpo;
	}


	public String getCreateso() {
		return this.createso;
	}

	public void setCreateso(String createso) {
		this.createso = createso;
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


	public String getDocumentno() {
		return this.documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
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


	public String getIsinvitedvendorsonly() {
		return this.isinvitedvendorsonly;
	}

	public void setIsinvitedvendorsonly(String isinvitedvendorsonly) {
		this.isinvitedvendorsonly = isinvitedvendorsonly;
	}


	public String getIsquoteallqty() {
		return this.isquoteallqty;
	}

	public void setIsquoteallqty(String isquoteallqty) {
		this.isquoteallqty = isquoteallqty;
	}


	public String getIsquotetotalamt() {
		return this.isquotetotalamt;
	}

	public void setIsquotetotalamt(String isquotetotalamt) {
		this.isquotetotalamt = isquotetotalamt;
	}


	public String getIsrfqresponseaccepted() {
		return this.isrfqresponseaccepted;
	}

	public void setIsrfqresponseaccepted(String isrfqresponseaccepted) {
		this.isrfqresponseaccepted = isrfqresponseaccepted;
	}


	public String getIsselfservice() {
		return this.isselfservice;
	}

	public void setIsselfservice(String isselfservice) {
		this.isselfservice = isselfservice;
	}


	public BigDecimal getMargin() {
		return this.margin;
	}

	public void setMargin(BigDecimal margin) {
		this.margin = margin;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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


	public String getPublishrfq() {
		return this.publishrfq;
	}

	public void setPublishrfq(String publishrfq) {
		this.publishrfq = publishrfq;
	}


	public String getQuotetype() {
		return this.quotetype;
	}

	public void setQuotetype(String quotetype) {
		this.quotetype = quotetype;
	}


	public String getRankrfq() {
		return this.rankrfq;
	}

	public void setRankrfq(String rankrfq) {
		this.rankrfq = rankrfq;
	}


	@Column(name="SALESREP_ID")
	public BigDecimal getSalesrepId() {
		return this.salesrepId;
	}

	public void setSalesrepId(BigDecimal salesrepId) {
		this.salesrepId = salesrepId;
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