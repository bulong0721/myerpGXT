package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_acctprocessorlog database table.
 * 
 */
@Entity
@Table(name="c_acctprocessorlog")
@NamedQuery(name="CAcctprocessorlog.findAll", query="SELECT c FROM CAcctprocessorlog c")
public class CAcctprocessorlog extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CAcctprocessorlogPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private byte[] binarydata;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String iserror;
	private String reference;
	private String summary;
	private String textmsg;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CAcctprocessorlog() {
	}


	@EmbeddedId
	public CAcctprocessorlogPK getId() {
		return this.id;
	}

	public void setId(CAcctprocessorlogPK id) {
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


	@Lob
	public byte[] getBinarydata() {
		return this.binarydata;
	}

	public void setBinarydata(byte[] binarydata) {
		this.binarydata = binarydata;
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


	public String getIserror() {
		return this.iserror;
	}

	public void setIserror(String iserror) {
		this.iserror = iserror;
	}


	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}


	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}


	public String getTextmsg() {
		return this.textmsg;
	}

	public void setTextmsg(String textmsg) {
		this.textmsg = textmsg;
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