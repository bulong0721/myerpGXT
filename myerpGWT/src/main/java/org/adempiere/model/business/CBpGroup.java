package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bp_group database table.
 * 
 */
@Entity
@Table(name="c_bp_group")
@NamedQuery(name="CBpGroup.findAll", query="SELECT c FROM CBpGroup c")
public class CBpGroup extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBpGroupId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adPrintcolorId;
	private BigDecimal cDunningId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal creditwatchpercent;
	private String description;
	private String isactive;
	private String isconfidentialinfo;
	private String isdefault;
	private BigDecimal mDiscountschemaId;
	private BigDecimal mPricelistId;
	private String name;
	private BigDecimal poDiscountschemaId;
	private BigDecimal poPricelistId;
	private BigDecimal pricematchtolerance;
	private String prioritybase;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String value;

	public CBpGroup() {
	}


	@Id
	@Column(name="C_BP_GROUP_ID")
	public long getCBpGroupId() {
		return this.cBpGroupId;
	}

	public void setCBpGroupId(long cBpGroupId) {
		this.cBpGroupId = cBpGroupId;
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


	@Column(name="AD_PRINTCOLOR_ID")
	public BigDecimal getAdPrintcolorId() {
		return this.adPrintcolorId;
	}

	public void setAdPrintcolorId(BigDecimal adPrintcolorId) {
		this.adPrintcolorId = adPrintcolorId;
	}


	@Column(name="C_DUNNING_ID")
	public BigDecimal getCDunningId() {
		return this.cDunningId;
	}

	public void setCDunningId(BigDecimal cDunningId) {
		this.cDunningId = cDunningId;
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


	public BigDecimal getCreditwatchpercent() {
		return this.creditwatchpercent;
	}

	public void setCreditwatchpercent(BigDecimal creditwatchpercent) {
		this.creditwatchpercent = creditwatchpercent;
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


	public String getIsconfidentialinfo() {
		return this.isconfidentialinfo;
	}

	public void setIsconfidentialinfo(String isconfidentialinfo) {
		this.isconfidentialinfo = isconfidentialinfo;
	}


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}


	@Column(name="M_DISCOUNTSCHEMA_ID")
	public BigDecimal getMDiscountschemaId() {
		return this.mDiscountschemaId;
	}

	public void setMDiscountschemaId(BigDecimal mDiscountschemaId) {
		this.mDiscountschemaId = mDiscountschemaId;
	}


	@Column(name="M_PRICELIST_ID")
	public BigDecimal getMPricelistId() {
		return this.mPricelistId;
	}

	public void setMPricelistId(BigDecimal mPricelistId) {
		this.mPricelistId = mPricelistId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="PO_DISCOUNTSCHEMA_ID")
	public BigDecimal getPoDiscountschemaId() {
		return this.poDiscountschemaId;
	}

	public void setPoDiscountschemaId(BigDecimal poDiscountschemaId) {
		this.poDiscountschemaId = poDiscountschemaId;
	}


	@Column(name="PO_PRICELIST_ID")
	public BigDecimal getPoPricelistId() {
		return this.poPricelistId;
	}

	public void setPoPricelistId(BigDecimal poPricelistId) {
		this.poPricelistId = poPricelistId;
	}


	public BigDecimal getPricematchtolerance() {
		return this.pricematchtolerance;
	}

	public void setPricematchtolerance(BigDecimal pricematchtolerance) {
		this.pricematchtolerance = pricematchtolerance;
	}


	public String getPrioritybase() {
		return this.prioritybase;
	}

	public void setPrioritybase(String prioritybase) {
		this.prioritybase = prioritybase;
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


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}