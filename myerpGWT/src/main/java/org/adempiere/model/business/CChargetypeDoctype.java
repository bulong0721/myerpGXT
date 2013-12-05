package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_chargetype_doctype database table.
 * 
 */
@Entity
@Table(name="c_chargetype_doctype")
@NamedQuery(name="CChargetypeDoctype.findAll", query="SELECT c FROM CChargetypeDoctype c")
public class CChargetypeDoctype extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CChargetypeDoctypePK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private String isallownegative;
	private String isallowpositive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CChargetypeDoctype() {
	}


	@EmbeddedId
	public CChargetypeDoctypePK getId() {
		return this.id;
	}

	public void setId(CChargetypeDoctypePK id) {
		this.id = id;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsallownegative() {
		return this.isallownegative;
	}

	public void setIsallownegative(String isallownegative) {
		this.isallownegative = isallownegative;
	}


	public String getIsallowpositive() {
		return this.isallowpositive;
	}

	public void setIsallowpositive(String isallowpositive) {
		this.isallowpositive = isallowpositive;
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