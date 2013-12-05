package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_element database table.
 * 
 */
@Entity
@Table(name="c_element")
@NamedQuery(name="CElement.findAll", query="SELECT c FROM CElement c")
public class CElement extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cElementId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adTreeId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String elementtype;
	private String isactive;
	private String isbalancing;
	private String isnaturalaccount;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String vformat;

	public CElement() {
	}


	@Id
	@Column(name="C_ELEMENT_ID")
	public long getCElementId() {
		return this.cElementId;
	}

	public void setCElementId(long cElementId) {
		this.cElementId = cElementId;
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


	@Column(name="AD_TREE_ID")
	public BigDecimal getAdTreeId() {
		return this.adTreeId;
	}

	public void setAdTreeId(BigDecimal adTreeId) {
		this.adTreeId = adTreeId;
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


	public String getElementtype() {
		return this.elementtype;
	}

	public void setElementtype(String elementtype) {
		this.elementtype = elementtype;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsbalancing() {
		return this.isbalancing;
	}

	public void setIsbalancing(String isbalancing) {
		this.isbalancing = isbalancing;
	}


	public String getIsnaturalaccount() {
		return this.isnaturalaccount;
	}

	public void setIsnaturalaccount(String isnaturalaccount) {
		this.isnaturalaccount = isnaturalaccount;
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


	public String getVformat() {
		return this.vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}

}