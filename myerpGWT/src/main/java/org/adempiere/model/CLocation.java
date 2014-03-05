package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_location")
public class CLocation extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private Integer cCityID;
	private Integer cCountryID;
	private Integer cLocationID;
	private Integer cRegionID;
	private String city;
	private String created;
	private Integer createdBy;
	private String postal;
	private String postalAdd;
	private String regionName;
	private String updated;
	private Integer updatedBy;

	public CLocation() {
	}

	public CLocation(Integer cLocationID) {
		this.cLocationID = cLocationID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(length=60)
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Basic
	@Column(length=60)
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Basic
	@Column(length=60)
	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	@Basic
	@Column(length=60)
	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	@Basic
	@Column(name="C_CITY_ID", columnDefinition="INT")
	public Integer getCCityID() {
		return cCityID;
	}

	public void setCCityID(Integer cCityID) {
		this.cCityID = cCityID;
	}

	@Basic
	@Column(name="C_COUNTRY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCountryID() {
		return cCountryID;
	}

	public void setCCountryID(Integer cCountryID) {
		this.cCountryID = cCountryID;
	}

	@Id
	@Column(name="C_LOCATION_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_60", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Location", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_60")
	public Integer getCLocationID() {
		return cLocationID;
	}

	public void setCLocationID(Integer cLocationID) {
		this.cLocationID = cLocationID;
	}

	@Basic
	@Column(name="C_REGION_ID", columnDefinition="INT")
	public Integer getCRegionID() {
		return cRegionID;
	}

	public void setCRegionID(Integer cRegionID) {
		this.cRegionID = cRegionID;
	}

	@Basic
	@Column(length=60)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	@Column(length=10)
	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	@Basic
	@Column(name="POSTAL_ADD", length=10)
	public String getPostalAdd() {
		return postalAdd;
	}

	public void setPostalAdd(String postalAdd) {
		this.postalAdd = postalAdd;
	}

	@Basic
	@Column(length=40)
	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
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
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}