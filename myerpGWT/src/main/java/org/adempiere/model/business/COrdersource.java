package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the c_ordersource database table.
 * 
 */
@Entity
@Table(name="c_ordersource")
@NamedQuery(name="COrdersource.findAll", query="SELECT c FROM COrdersource c")
public class COrdersource extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cOrdersourceId;
	private java.math.BigDecimal adClientId;
	private java.math.BigDecimal adOrgId;
	private Timestamp created;
	private java.math.BigDecimal createdby;
	private String description;
	private String help;
	private String isactive;
	private String name;
	private Timestamp updated;
	private java.math.BigDecimal updatedby;
	private String value;

	public COrdersource() {
	}


	@Id
	@Column(name="C_ORDERSOURCE_ID")
	public long getCOrdersourceId() {
		return this.cOrdersourceId;
	}

	public void setCOrdersourceId(long cOrdersourceId) {
		this.cOrdersourceId = cOrdersourceId;
	}


	@Column(name="AD_CLIENT_ID")
	public java.math.BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(java.math.BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public java.math.BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(java.math.BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


	public java.math.BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(java.math.BigDecimal createdby) {
		this.createdby = createdby;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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


	public java.math.BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(java.math.BigDecimal updatedby) {
		this.updatedby = updatedby;
	}


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}