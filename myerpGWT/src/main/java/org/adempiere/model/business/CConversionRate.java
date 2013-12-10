package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_conversion_rate database table.
 * 
 */
@Entity
@Table(name="c_conversion_rate")
@NamedQuery(name="CConversionRate.findAll", query="SELECT c FROM CConversionRate c")
public class CConversionRate extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cConversionRateId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cConversiontypeId;
	private BigDecimal cCurrencyId;
	private BigDecimal cCurrencyIdTo;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal dividerate;
	private String isactive;
	private BigDecimal multiplyrate;
	private Timestamp updated;
	private BigDecimal updatedby;
	private Date validfrom;
	private Date validto;

	public CConversionRate() {
	}


	@Id
	@Column(name="C_CONVERSION_RATE_ID")
	public long getCConversionRateId() {
		return this.cConversionRateId;
	}

	public void setCConversionRateId(long cConversionRateId) {
		this.cConversionRateId = cConversionRateId;
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


	@Column(name="C_CONVERSIONTYPE_ID")
	public BigDecimal getCConversiontypeId() {
		return this.cConversiontypeId;
	}

	public void setCConversiontypeId(BigDecimal cConversiontypeId) {
		this.cConversiontypeId = cConversiontypeId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_CURRENCY_ID_TO")
	public BigDecimal getCCurrencyIdTo() {
		return this.cCurrencyIdTo;
	}

	public void setCCurrencyIdTo(BigDecimal cCurrencyIdTo) {
		this.cCurrencyIdTo = cCurrencyIdTo;
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


	public BigDecimal getDividerate() {
		return this.dividerate;
	}

	public void setDividerate(BigDecimal dividerate) {
		this.dividerate = dividerate;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public BigDecimal getMultiplyrate() {
		return this.multiplyrate;
	}

	public void setMultiplyrate(BigDecimal multiplyrate) {
		this.multiplyrate = multiplyrate;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidfrom() {
		return this.validfrom;
	}

	public void setValidfrom(Date validfrom) {
		this.validfrom = validfrom;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidto() {
		return this.validto;
	}

	public void setValidto(Date validto) {
		this.validto = validto;
	}

}