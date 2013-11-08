package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_location database table.
 * 
 */
@Entity
@Table(name="c_location")
@NamedQuery(name="CLocation.findAll", query="SELECT c FROM CLocation c")
public class CLocation extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cLocationId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private BigDecimal cCityId;
	private BigDecimal cCountryId;
	private BigDecimal cRegionId;
	private String city;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private String postal;
	private String postalAdd;
	private String regionname;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CLocation() {
	}


	@Id
	@Column(name="C_LOCATION_ID")
	public long getCLocationId() {
		return this.cLocationId;
	}

	public void setCLocationId(long cLocationId) {
		this.cLocationId = cLocationId;
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


	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}


	public String getAddress4() {
		return this.address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}


	@Column(name="C_CITY_ID")
	public BigDecimal getCCityId() {
		return this.cCityId;
	}

	public void setCCityId(BigDecimal cCityId) {
		this.cCityId = cCityId;
	}


	@Column(name="C_COUNTRY_ID")
	public BigDecimal getCCountryId() {
		return this.cCountryId;
	}

	public void setCCountryId(BigDecimal cCountryId) {
		this.cCountryId = cCountryId;
	}


	@Column(name="C_REGION_ID")
	public BigDecimal getCRegionId() {
		return this.cRegionId;
	}

	public void setCRegionId(BigDecimal cRegionId) {
		this.cRegionId = cRegionId;
	}


	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getPostal() {
		return this.postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}


	@Column(name="POSTAL_ADD")
	public String getPostalAdd() {
		return this.postalAdd;
	}

	public void setPostalAdd(String postalAdd) {
		this.postalAdd = postalAdd;
	}


	public String getRegionname() {
		return this.regionname;
	}

	public void setRegionname(String regionname) {
		this.regionname = regionname;
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