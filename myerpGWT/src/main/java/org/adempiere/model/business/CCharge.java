package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_charge database table.
 * 
 */
@Entity
@Table(name="c_charge")
@NamedQuery(name="CCharge.findAll", query="SELECT c FROM CCharge c")
public class CCharge extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cChargeId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBpartnerId;
	private BigDecimal cChargetypeId;
	private BigDecimal cTaxcategoryId;
	private BigDecimal chargeamt;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String issamecurrency;
	private String issametax;
	private String istaxincluded;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCharge() {
	}


	@Id
	@Column(name="C_CHARGE_ID")
	public long getCChargeId() {
		return this.cChargeId;
	}

	public void setCChargeId(long cChargeId) {
		this.cChargeId = cChargeId;
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


	@Column(name="C_CHARGETYPE_ID")
	public BigDecimal getCChargetypeId() {
		return this.cChargetypeId;
	}

	public void setCChargetypeId(BigDecimal cChargetypeId) {
		this.cChargetypeId = cChargetypeId;
	}


	@Column(name="C_TAXCATEGORY_ID")
	public BigDecimal getCTaxcategoryId() {
		return this.cTaxcategoryId;
	}

	public void setCTaxcategoryId(BigDecimal cTaxcategoryId) {
		this.cTaxcategoryId = cTaxcategoryId;
	}


	public BigDecimal getChargeamt() {
		return this.chargeamt;
	}

	public void setChargeamt(BigDecimal chargeamt) {
		this.chargeamt = chargeamt;
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


	public String getIssamecurrency() {
		return this.issamecurrency;
	}

	public void setIssamecurrency(String issamecurrency) {
		this.issamecurrency = issamecurrency;
	}


	public String getIssametax() {
		return this.issametax;
	}

	public void setIssametax(String issametax) {
		this.issametax = issametax;
	}


	public String getIstaxincluded() {
		return this.istaxincluded;
	}

	public void setIstaxincluded(String istaxincluded) {
		this.istaxincluded = istaxincluded;
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