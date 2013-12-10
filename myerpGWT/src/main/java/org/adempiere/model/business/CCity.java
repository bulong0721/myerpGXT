package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_city database table.
 * 
 */
@Entity
@Table(name="c_city")
@NamedQuery(name="CCity.findAll", query="SELECT c FROM CCity c")
public class CCity extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCityId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private String areacode;
	private BigDecimal cCountryId;
	private BigDecimal cRegionId;
	private String coordinates;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private String locode;
	private String name;
	private String postal;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCity() {
	}


	@Id
	@Column(name="C_CITY_ID")
	public long getCCityId() {
		return this.cCityId;
	}

	public void setCCityId(long cCityId) {
		this.cCityId = cCityId;
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


	public String getAreacode() {
		return this.areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
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


	public String getCoordinates() {
		return this.coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
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


	public String getLocode() {
		return this.locode;
	}

	public void setLocode(String locode) {
		this.locode = locode;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPostal() {
		return this.postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
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