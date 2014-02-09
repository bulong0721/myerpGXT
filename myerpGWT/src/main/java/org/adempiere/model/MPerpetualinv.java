package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_perpetualinv")
public class MPerpetualinv extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String counthighmovement;
	private String created;
	private Integer createdby;
	private String datelastrun;
	private String datenextrun;
	private String description;
	private Boolean isactive;
	private Integer mPerpetualinvId;
	private Integer mProductCategoryId;
	private Integer mWarehouseId;
	private String name;
	private Integer noinventorycount;
	private Integer noproductcount;
	private Integer numberofruns;
	private Boolean processing;
	private String updated;
	private Integer updatedby;

	public MPerpetualinv() {
	}

	public MPerpetualinv(Integer mPerpetualinvId) {
		this.mPerpetualinvId = mPerpetualinvId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getCounthighmovement() {
		return counthighmovement;
	}

	public void setCounthighmovement(String counthighmovement) {
		this.counthighmovement = counthighmovement;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public String getDatelastrun() {
		return datelastrun;
	}

	public void setDatelastrun(String datelastrun) {
		this.datelastrun = datelastrun;
	}

	@Basic
	@Column(nullable=false)
	public String getDatenextrun() {
		return datenextrun;
	}

	public void setDatenextrun(String datenextrun) {
		this.datenextrun = datenextrun;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Id
	@Column(name="M_PERPETUALINV_ID", columnDefinition="INT")
	public Integer getMPerpetualinvId() {
		return mPerpetualinvId;
	}

	public void setMPerpetualinvId(Integer mPerpetualinvId) {
		this.mPerpetualinvId = mPerpetualinvId;
	}

	@Basic
	@Column(name="M_PRODUCT_CATEGORY_ID", columnDefinition="INT")
	public Integer getMProductCategoryId() {
		return mProductCategoryId;
	}

	public void setMProductCategoryId(Integer mProductCategoryId) {
		this.mProductCategoryId = mProductCategoryId;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID", columnDefinition="INT")
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getNoinventorycount() {
		return noinventorycount;
	}

	public void setNoinventorycount(Integer noinventorycount) {
		this.noinventorycount = noinventorycount;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getNoproductcount() {
		return noproductcount;
	}

	public void setNoproductcount(Integer noproductcount) {
		this.noproductcount = noproductcount;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getNumberofruns() {
		return numberofruns;
	}

	public void setNumberofruns(Integer numberofruns) {
		this.numberofruns = numberofruns;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}