package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_dunninglevel database table.
 * 
 */
@Entity
@Table(name="c_dunninglevel")
@NamedQuery(name="CDunninglevel.findAll", query="SELECT c FROM CDunninglevel c")
public class CDunninglevel extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cDunninglevelId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cDunningId;
	private BigDecimal cPaymenttermId;
	private String chargefee;
	private String chargeinterest;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal daysafterdue;
	private BigDecimal daysbetweendunning;
	private String description;
	private BigDecimal dunningPrintformatId;
	private BigDecimal feeamt;
	private BigDecimal interestpercent;
	private String invoicecollectiontype;
	private String isactive;
	private String issetcreditstop;
	private String issetpaymentterm;
	private String isshowalldue;
	private String isshownotdue;
	private String isstatement;
	private String name;
	private String note;
	private String printname;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CDunninglevel() {
	}


	@Id
	@Column(name="C_DUNNINGLEVEL_ID")
	public long getCDunninglevelId() {
		return this.cDunninglevelId;
	}

	public void setCDunninglevelId(long cDunninglevelId) {
		this.cDunninglevelId = cDunninglevelId;
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


	@Column(name="C_DUNNING_ID")
	public BigDecimal getCDunningId() {
		return this.cDunningId;
	}

	public void setCDunningId(BigDecimal cDunningId) {
		this.cDunningId = cDunningId;
	}


	@Column(name="C_PAYMENTTERM_ID")
	public BigDecimal getCPaymenttermId() {
		return this.cPaymenttermId;
	}

	public void setCPaymenttermId(BigDecimal cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
	}


	public String getChargefee() {
		return this.chargefee;
	}

	public void setChargefee(String chargefee) {
		this.chargefee = chargefee;
	}


	public String getChargeinterest() {
		return this.chargeinterest;
	}

	public void setChargeinterest(String chargeinterest) {
		this.chargeinterest = chargeinterest;
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


	public BigDecimal getDaysafterdue() {
		return this.daysafterdue;
	}

	public void setDaysafterdue(BigDecimal daysafterdue) {
		this.daysafterdue = daysafterdue;
	}


	public BigDecimal getDaysbetweendunning() {
		return this.daysbetweendunning;
	}

	public void setDaysbetweendunning(BigDecimal daysbetweendunning) {
		this.daysbetweendunning = daysbetweendunning;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(name="DUNNING_PRINTFORMAT_ID")
	public BigDecimal getDunningPrintformatId() {
		return this.dunningPrintformatId;
	}

	public void setDunningPrintformatId(BigDecimal dunningPrintformatId) {
		this.dunningPrintformatId = dunningPrintformatId;
	}


	public BigDecimal getFeeamt() {
		return this.feeamt;
	}

	public void setFeeamt(BigDecimal feeamt) {
		this.feeamt = feeamt;
	}


	public BigDecimal getInterestpercent() {
		return this.interestpercent;
	}

	public void setInterestpercent(BigDecimal interestpercent) {
		this.interestpercent = interestpercent;
	}


	public String getInvoicecollectiontype() {
		return this.invoicecollectiontype;
	}

	public void setInvoicecollectiontype(String invoicecollectiontype) {
		this.invoicecollectiontype = invoicecollectiontype;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIssetcreditstop() {
		return this.issetcreditstop;
	}

	public void setIssetcreditstop(String issetcreditstop) {
		this.issetcreditstop = issetcreditstop;
	}


	public String getIssetpaymentterm() {
		return this.issetpaymentterm;
	}

	public void setIssetpaymentterm(String issetpaymentterm) {
		this.issetpaymentterm = issetpaymentterm;
	}


	public String getIsshowalldue() {
		return this.isshowalldue;
	}

	public void setIsshowalldue(String isshowalldue) {
		this.isshowalldue = isshowalldue;
	}


	public String getIsshownotdue() {
		return this.isshownotdue;
	}

	public void setIsshownotdue(String isshownotdue) {
		this.isshownotdue = isshownotdue;
	}


	public String getIsstatement() {
		return this.isstatement;
	}

	public void setIsstatement(String isstatement) {
		this.isstatement = isstatement;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}


	public String getPrintname() {
		return this.printname;
	}

	public void setPrintname(String printname) {
		this.printname = printname;
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