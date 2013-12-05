package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bpartner_location database table.
 * 
 */
@Entity
@Table(name="c_bpartner_location")
@NamedQuery(name="CBpartnerLocation.findAll", query="SELECT c FROM CBpartnerLocation c")
public class CBpartnerLocation extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBpartnerLocationId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBpartnerId;
	private BigDecimal cLocationId;
	private BigDecimal cSalesregionId;
	private Timestamp created;
	private BigDecimal createdby;
	private String fax;
	private String isactive;
	private String isbillto;
	private String isdn;
	private String ispayfrom;
	private String isremitto;
	private String isshipto;
	private String name;
	private String phone;
	private String phone2;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBpartnerLocation() {
	}


	@Id
	@Column(name="C_BPARTNER_LOCATION_ID")
	public long getCBpartnerLocationId() {
		return this.cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(long cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
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


	@Column(name="C_LOCATION_ID")
	public BigDecimal getCLocationId() {
		return this.cLocationId;
	}

	public void setCLocationId(BigDecimal cLocationId) {
		this.cLocationId = cLocationId;
	}


	@Column(name="C_SALESREGION_ID")
	public BigDecimal getCSalesregionId() {
		return this.cSalesregionId;
	}

	public void setCSalesregionId(BigDecimal cSalesregionId) {
		this.cSalesregionId = cSalesregionId;
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


	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsbillto() {
		return this.isbillto;
	}

	public void setIsbillto(String isbillto) {
		this.isbillto = isbillto;
	}


	public String getIsdn() {
		return this.isdn;
	}

	public void setIsdn(String isdn) {
		this.isdn = isdn;
	}


	public String getIspayfrom() {
		return this.ispayfrom;
	}

	public void setIspayfrom(String ispayfrom) {
		this.ispayfrom = ispayfrom;
	}


	public String getIsremitto() {
		return this.isremitto;
	}

	public void setIsremitto(String isremitto) {
		this.isremitto = isremitto;
	}


	public String getIsshipto() {
		return this.isshipto;
	}

	public void setIsshipto(String isshipto) {
		this.isshipto = isshipto;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
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