package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_dunning database table.
 * 
 */
@Entity
@Table(name="c_dunning")
@NamedQuery(name="CDunning.findAll", query="SELECT c FROM CDunning c")
public class CDunning extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cDunningId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String createlevelssequentially;
	private String description;
	private String isactive;
	private String isdefault;
	private String name;
	private String senddunningletter;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CDunning() {
	}


	@Id
	@Column(name="C_DUNNING_ID")
	public long getCDunningId() {
		return this.cDunningId;
	}

	public void setCDunningId(long cDunningId) {
		this.cDunningId = cDunningId;
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


	public String getCreatelevelssequentially() {
		return this.createlevelssequentially;
	}

	public void setCreatelevelssequentially(String createlevelssequentially) {
		this.createlevelssequentially = createlevelssequentially;
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


	public String getSenddunningletter() {
		return this.senddunningletter;
	}

	public void setSenddunningletter(String senddunningletter) {
		this.senddunningletter = senddunningletter;
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