package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_commissionline database table.
 * 
 */
@Entity
@Table(name="c_commissionline")
@NamedQuery(name="CCommissionline.findAll", query="SELECT c FROM CCommissionline c")
public class CCommissionline extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCommissionlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal amtmultiplier;
	private BigDecimal amtsubtract;
	private BigDecimal cBpGroupId;
	private BigDecimal cBpartnerId;
	private BigDecimal cCommissionId;
	private BigDecimal cSalesregionId;
	private String commissionorders;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String ispositiveonly;
	private BigDecimal line;
	private BigDecimal mProductCategoryId;
	private BigDecimal mProductId;
	private BigDecimal orgId;
	private String paymentrule;
	private BigDecimal qtymultiplier;
	private BigDecimal qtysubtract;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCommissionline() {
	}


	@Id
	@Column(name="C_COMMISSIONLINE_ID")
	public long getCCommissionlineId() {
		return this.cCommissionlineId;
	}

	public void setCCommissionlineId(long cCommissionlineId) {
		this.cCommissionlineId = cCommissionlineId;
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


	public BigDecimal getAmtmultiplier() {
		return this.amtmultiplier;
	}

	public void setAmtmultiplier(BigDecimal amtmultiplier) {
		this.amtmultiplier = amtmultiplier;
	}


	public BigDecimal getAmtsubtract() {
		return this.amtsubtract;
	}

	public void setAmtsubtract(BigDecimal amtsubtract) {
		this.amtsubtract = amtsubtract;
	}


	@Column(name="C_BP_GROUP_ID")
	public BigDecimal getCBpGroupId() {
		return this.cBpGroupId;
	}

	public void setCBpGroupId(BigDecimal cBpGroupId) {
		this.cBpGroupId = cBpGroupId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_COMMISSION_ID")
	public BigDecimal getCCommissionId() {
		return this.cCommissionId;
	}

	public void setCCommissionId(BigDecimal cCommissionId) {
		this.cCommissionId = cCommissionId;
	}


	@Column(name="C_SALESREGION_ID")
	public BigDecimal getCSalesregionId() {
		return this.cSalesregionId;
	}

	public void setCSalesregionId(BigDecimal cSalesregionId) {
		this.cSalesregionId = cSalesregionId;
	}


	public String getCommissionorders() {
		return this.commissionorders;
	}

	public void setCommissionorders(String commissionorders) {
		this.commissionorders = commissionorders;
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


	public String getIspositiveonly() {
		return this.ispositiveonly;
	}

	public void setIspositiveonly(String ispositiveonly) {
		this.ispositiveonly = ispositiveonly;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
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


	@Column(name="ORG_ID")
	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}


	public String getPaymentrule() {
		return this.paymentrule;
	}

	public void setPaymentrule(String paymentrule) {
		this.paymentrule = paymentrule;
	}


	public BigDecimal getQtymultiplier() {
		return this.qtymultiplier;
	}

	public void setQtymultiplier(BigDecimal qtymultiplier) {
		this.qtymultiplier = qtymultiplier;
	}


	public BigDecimal getQtysubtract() {
		return this.qtysubtract;
	}

	public void setQtysubtract(BigDecimal qtysubtract) {
		this.qtysubtract = qtysubtract;
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