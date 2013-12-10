package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_commissionrun database table.
 * 
 */
@Entity
@Table(name="c_commissionrun")
@NamedQuery(name="CCommissionrun.findAll", query="SELECT c FROM CCommissionrun c")
public class CCommissionrun extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCommissionrunId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cCommissionId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String documentno;
	private BigDecimal grandtotal;
	private String isactive;
	private String processed;
	private String processing;
	private Date startdate;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCommissionrun() {
	}


	@Id
	@Column(name="C_COMMISSIONRUN_ID")
	public long getCCommissionrunId() {
		return this.cCommissionrunId;
	}

	public void setCCommissionrunId(long cCommissionrunId) {
		this.cCommissionrunId = cCommissionrunId;
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


	@Column(name="C_COMMISSION_ID")
	public BigDecimal getCCommissionId() {
		return this.cCommissionId;
	}

	public void setCCommissionId(BigDecimal cCommissionId) {
		this.cCommissionId = cCommissionId;
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


	public String getDocumentno() {
		return this.documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}


	public BigDecimal getGrandtotal() {
		return this.grandtotal;
	}

	public void setGrandtotal(BigDecimal grandtotal) {
		this.grandtotal = grandtotal;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
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