package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_conversiontype database table.
 * 
 */
@Entity
@Table(name="c_conversiontype")
@NamedQuery(name="CConversiontype.findAll", query="SELECT c FROM CConversiontype c")
public class CConversiontype extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cConversiontypeId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String isdefault;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String value;

	public CConversiontype() {
	}


	@Id
	@Column(name="C_CONVERSIONTYPE_ID")
	public long getCConversiontypeId() {
		return this.cConversiontypeId;
	}

	public void setCConversiontypeId(long cConversiontypeId) {
		this.cConversiontypeId = cConversiontypeId;
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


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
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


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}