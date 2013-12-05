package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_payselection database table.
 * 
 */
@Entity
@Table(name="c_payselection")
@NamedQuery(name="CPayselection.findAll", query="SELECT c FROM CPayselection c")
public class CPayselection extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPayselectionId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBankaccountId;
	private Timestamp created;
	private BigDecimal createdby;
	private String createfrom;
	private String description;
	private String isactive;
	private String isapproved;
	private String name;
	private Date paydate;
	private String processed;
	private String processing;
	private BigDecimal totalamt;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CPayselection() {
	}


	@Id
	@Column(name="C_PAYSELECTION_ID")
	public long getCPayselectionId() {
		return this.cPayselectionId;
	}

	public void setCPayselectionId(long cPayselectionId) {
		this.cPayselectionId = cPayselectionId;
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


	@Column(name="C_BANKACCOUNT_ID")
	public BigDecimal getCBankaccountId() {
		return this.cBankaccountId;
	}

	public void setCBankaccountId(BigDecimal cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
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


	public String getCreatefrom() {
		return this.createfrom;
	}

	public void setCreatefrom(String createfrom) {
		this.createfrom = createfrom;
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


	public String getIsapproved() {
		return this.isapproved;
	}

	public void setIsapproved(String isapproved) {
		this.isapproved = isapproved;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getPaydate() {
		return this.paydate;
	}

	public void setPaydate(Date paydate) {
		this.paydate = paydate;
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


	public BigDecimal getTotalamt() {
		return this.totalamt;
	}

	public void setTotalamt(BigDecimal totalamt) {
		this.totalamt = totalamt;
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