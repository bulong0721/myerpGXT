package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_dunninglevel")
public class CDunningLevel extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cDunningID;
	private Integer cDunningLevelID;
	private Integer cPaymentTermID;
	private Boolean chargeFee;
	private Boolean chargeInterest;
	private String created;
	private Integer createdBy;
	private Integer daysAfterDue;
	private Integer daysBetweenDunning;
	private String description;
	private Integer dunningPrintFormatID;
	private BigDecimal feeAmt;
	private BigDecimal interestPercent;
	private String invoiceCollectionType;
	private String name;
	private String note;
	private String printName;
	private Boolean setCreditStop;
	private Boolean setPaymentTerm;
	private Boolean showAllDue;
	private Boolean showNotDue;
	private Boolean statement;
	private String updated;
	private Integer updatedBy;

	public CDunningLevel() {
	}

	public CDunningLevel(Integer cDunningLevelID) {
		this.cDunningLevelID = cDunningLevelID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(name="C_DUNNING_ID", columnDefinition="INT", nullable=false)
	public Integer getCDunningID() {
		return cDunningID;
	}

	public void setCDunningID(Integer cDunningID) {
		this.cDunningID = cDunningID;
	}

	@Id
	@Column(name="C_DUNNINGLEVEL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_258", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_DunningLevel", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_258")
	public Integer getCDunningLevelID() {
		return cDunningLevelID;
	}

	public void setCDunningLevelID(Integer cDunningLevelID) {
		this.cDunningLevelID = cDunningLevelID;
	}

	@Basic
	@Column(name="C_PAYMENTTERM_ID", columnDefinition="INT")
	public Integer getCPaymentTermID() {
		return cPaymentTermID;
	}

	public void setCPaymentTermID(Integer cPaymentTermID) {
		this.cPaymentTermID = cPaymentTermID;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isChargeFee() {
		return chargeFee;
	}

	public void setChargeFee(Boolean chargeFee) {
		this.chargeFee = chargeFee;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isChargeInterest() {
		return chargeInterest;
	}

	public void setChargeInterest(Boolean chargeInterest) {
		this.chargeInterest = chargeInterest;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getDaysAfterDue() {
		return daysAfterDue;
	}

	public void setDaysAfterDue(Integer daysAfterDue) {
		this.daysAfterDue = daysAfterDue;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getDaysBetweenDunning() {
		return daysBetweenDunning;
	}

	public void setDaysBetweenDunning(Integer daysBetweenDunning) {
		this.daysBetweenDunning = daysBetweenDunning;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="DUNNING_PRINTFORMAT_ID", columnDefinition="INT")
	public Integer getDunningPrintFormatID() {
		return dunningPrintFormatID;
	}

	public void setDunningPrintFormatID(Integer dunningPrintFormatID) {
		this.dunningPrintFormatID = dunningPrintFormatID;
	}

	@Basic
	public BigDecimal getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(BigDecimal feeAmt) {
		this.feeAmt = feeAmt;
	}

	@Basic
	public BigDecimal getInterestPercent() {
		return interestPercent;
	}

	public void setInterestPercent(BigDecimal interestPercent) {
		this.interestPercent = interestPercent;
	}

	@Basic
	@Column(length=1)
	public String getInvoiceCollectionType() {
		return invoiceCollectionType;
	}

	public void setInvoiceCollectionType(String invoiceCollectionType) {
		this.invoiceCollectionType = invoiceCollectionType;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(length=2000)
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	@Basic
	@Column(name="ISSETCREDITSTOP", nullable=false)
	public Boolean isSetCreditStop() {
		return setCreditStop;
	}

	public void setSetCreditStop(Boolean setCreditStop) {
		this.setCreditStop = setCreditStop;
	}

	@Basic
	@Column(name="ISSETPAYMENTTERM", nullable=false)
	public Boolean isSetPaymentTerm() {
		return setPaymentTerm;
	}

	public void setSetPaymentTerm(Boolean setPaymentTerm) {
		this.setPaymentTerm = setPaymentTerm;
	}

	@Basic
	@Column(name="ISSHOWALLDUE", nullable=false)
	public Boolean isShowAllDue() {
		return showAllDue;
	}

	public void setShowAllDue(Boolean showAllDue) {
		this.showAllDue = showAllDue;
	}

	@Basic
	@Column(name="ISSHOWNOTDUE", nullable=false)
	public Boolean isShowNotDue() {
		return showNotDue;
	}

	public void setShowNotDue(Boolean showNotDue) {
		this.showNotDue = showNotDue;
	}

	@Basic
	@Column(name="ISSTATEMENT", nullable=false)
	public Boolean isStatement() {
		return statement;
	}

	public void setStatement(Boolean statement) {
		this.statement = statement;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}