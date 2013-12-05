package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_doctypecounter database table.
 * 
 */
@Entity
@Table(name="c_doctypecounter")
@NamedQuery(name="CDoctypecounter.findAll", query="SELECT c FROM CDoctypecounter c")
public class CDoctypecounter extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cDoctypecounterId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cDoctypeId;
	private BigDecimal counterCDoctypeId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String docaction;
	private String isactive;
	private String iscreatecounter;
	private String isvalid;
	private String name;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CDoctypecounter() {
	}


	@Id
	@Column(name="C_DOCTYPECOUNTER_ID")
	public long getCDoctypecounterId() {
		return this.cDoctypecounterId;
	}

	public void setCDoctypecounterId(long cDoctypecounterId) {
		this.cDoctypecounterId = cDoctypecounterId;
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


	@Column(name="C_DOCTYPE_ID")
	public BigDecimal getCDoctypeId() {
		return this.cDoctypeId;
	}

	public void setCDoctypeId(BigDecimal cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}


	@Column(name="COUNTER_C_DOCTYPE_ID")
	public BigDecimal getCounterCDoctypeId() {
		return this.counterCDoctypeId;
	}

	public void setCounterCDoctypeId(BigDecimal counterCDoctypeId) {
		this.counterCDoctypeId = counterCDoctypeId;
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


	public String getDocaction() {
		return this.docaction;
	}

	public void setDocaction(String docaction) {
		this.docaction = docaction;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIscreatecounter() {
		return this.iscreatecounter;
	}

	public void setIscreatecounter(String iscreatecounter) {
		this.iscreatecounter = iscreatecounter;
	}


	public String getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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