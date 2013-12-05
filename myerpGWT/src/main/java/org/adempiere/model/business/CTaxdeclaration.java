package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_taxdeclaration database table.
 * 
 */
@Entity
@Table(name="c_taxdeclaration")
@NamedQuery(name="CTaxdeclaration.findAll", query="SELECT c FROM CTaxdeclaration c")
public class CTaxdeclaration extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cTaxdeclarationId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date datefrom;
	private Date dateto;
	private Date datetrx;
	private String description;
	private String isactive;
	private String name;
	private String processed;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CTaxdeclaration() {
	}


	@Id
	@Column(name="C_TAXDECLARATION_ID")
	public long getCTaxdeclarationId() {
		return this.cTaxdeclarationId;
	}

	public void setCTaxdeclarationId(long cTaxdeclarationId) {
		this.cTaxdeclarationId = cTaxdeclarationId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatefrom() {
		return this.datefrom;
	}

	public void setDatefrom(Date datefrom) {
		this.datefrom = datefrom;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateto() {
		return this.dateto;
	}

	public void setDateto(Date dateto) {
		this.dateto = dateto;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatetrx() {
		return this.datetrx;
	}

	public void setDatetrx(Date datetrx) {
		this.datetrx = datetrx;
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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