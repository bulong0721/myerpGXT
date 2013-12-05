package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_commission database table.
 * 
 */
@Entity
@Table(name="c_commission")
@NamedQuery(name="CCommission.findAll", query="SELECT c FROM CCommission c")
public class CCommission extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCommissionId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBpartnerId;
	private BigDecimal cChargeId;
	private BigDecimal cCurrencyId;
	private Timestamp created;
	private BigDecimal createdby;
	private String createfrom;
	private Date datelastrun;
	private String description;
	private String docbasistype;
	private String frequencytype;
	private String isactive;
	private String listdetails;
	private String name;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCommission() {
	}


	@Id
	@Column(name="C_COMMISSION_ID")
	public long getCCommissionId() {
		return this.cCommissionId;
	}

	public void setCCommissionId(long cCommissionId) {
		this.cCommissionId = cCommissionId;
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


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_CHARGE_ID")
	public BigDecimal getCChargeId() {
		return this.cChargeId;
	}

	public void setCChargeId(BigDecimal cChargeId) {
		this.cChargeId = cChargeId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
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


	public String getCreatefrom() {
		return this.createfrom;
	}

	public void setCreatefrom(String createfrom) {
		this.createfrom = createfrom;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatelastrun() {
		return this.datelastrun;
	}

	public void setDatelastrun(Date datelastrun) {
		this.datelastrun = datelastrun;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getDocbasistype() {
		return this.docbasistype;
	}

	public void setDocbasistype(String docbasistype) {
		this.docbasistype = docbasistype;
	}


	public String getFrequencytype() {
		return this.frequencytype;
	}

	public void setFrequencytype(String frequencytype) {
		this.frequencytype = frequencytype;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getListdetails() {
		return this.listdetails;
	}

	public void setListdetails(String listdetails) {
		this.listdetails = listdetails;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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