package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_freight")
public class MFreight extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cCountryId;
	private Integer cCurrencyId;
	private Integer cRegionId;
	private String created;
	private Integer createdby;
	private BigDecimal freightamt;
	private Boolean isactive;
	private Integer mFreightId;
	private Integer mFreightcategoryId;
	private Integer mShipperId;
	private Integer toCountryId;
	private Integer toRegionId;
	private String updated;
	private Integer updatedby;
	private String validfrom;

	public MFreight() {
	}

	public MFreight(Integer mFreightId) {
		this.mFreightId = mFreightId;
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
	@Column(name="C_COUNTRY_ID", columnDefinition="INT")
	public Integer getCCountryId() {
		return cCountryId;
	}

	public void setCCountryId(Integer cCountryId) {
		this.cCountryId = cCountryId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_REGION_ID", columnDefinition="INT")
	public Integer getCRegionId() {
		return cRegionId;
	}

	public void setCRegionId(Integer cRegionId) {
		this.cRegionId = cRegionId;
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
	@Column(nullable=false)
	public BigDecimal getFreightamt() {
		return freightamt;
	}

	public void setFreightamt(BigDecimal freightamt) {
		this.freightamt = freightamt;
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
	@Column(name="M_FREIGHT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_751", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_Freight", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_751")
	public Integer getMFreightId() {
		return mFreightId;
	}

	public void setMFreightId(Integer mFreightId) {
		this.mFreightId = mFreightId;
	}

	@Basic
	@Column(name="M_FREIGHTCATEGORY_ID", columnDefinition="INT", nullable=false)
	public Integer getMFreightcategoryId() {
		return mFreightcategoryId;
	}

	public void setMFreightcategoryId(Integer mFreightcategoryId) {
		this.mFreightcategoryId = mFreightcategoryId;
	}

	@Basic
	@Column(name="M_SHIPPER_ID", columnDefinition="INT", nullable=false)
	public Integer getMShipperId() {
		return mShipperId;
	}

	public void setMShipperId(Integer mShipperId) {
		this.mShipperId = mShipperId;
	}

	@Basic
	@Column(name="TO_COUNTRY_ID", columnDefinition="INT")
	public Integer getToCountryId() {
		return toCountryId;
	}

	public void setToCountryId(Integer toCountryId) {
		this.toCountryId = toCountryId;
	}

	@Basic
	@Column(name="TO_REGION_ID", columnDefinition="INT")
	public Integer getToRegionId() {
		return toRegionId;
	}

	public void setToRegionId(Integer toRegionId) {
		this.toRegionId = toRegionId;
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

	@Basic
	@Column(nullable=false)
	public String getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}
}