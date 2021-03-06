package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_invoiceschedule")
public class CInvoiceSchedule extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Boolean amount;
	private BigDecimal amt;
	private Integer cInvoiceScheduleID;
	private String created;
	private Integer createdBy;
	private String description;
	private Boolean evenInvoiceWeek;
	private Integer invoiceDay;
	private Integer invoiceDayCutoff;
	private String invoiceFrequency;
	private String invoiceWeekDay;
	private String invoiceWeekDayCutoff;
	private Boolean isDefault;
	private String name;
	private String updated;
	private Integer updatedBy;

	public CInvoiceSchedule() {
	}

	public CInvoiceSchedule(Integer cInvoiceScheduleID) {
		this.cInvoiceScheduleID = cInvoiceScheduleID;
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
	@Column(name="ISAMOUNT", nullable=false)
	public Boolean isAmount() {
		return amount;
	}

	public void setAmount(Boolean amount) {
		this.amount = amount;
	}

	@Basic
	public BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	@Id
	@Column(name="C_INVOICESCHEDULE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_231", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_InvoiceSchedule", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_231")
	public Integer getCInvoiceScheduleID() {
		return cInvoiceScheduleID;
	}

	public void setCInvoiceScheduleID(Integer cInvoiceScheduleID) {
		this.cInvoiceScheduleID = cInvoiceScheduleID;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	public Boolean isEvenInvoiceWeek() {
		return evenInvoiceWeek;
	}

	public void setEvenInvoiceWeek(Boolean evenInvoiceWeek) {
		this.evenInvoiceWeek = evenInvoiceWeek;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getInvoiceDay() {
		return invoiceDay;
	}

	public void setInvoiceDay(Integer invoiceDay) {
		this.invoiceDay = invoiceDay;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getInvoiceDayCutoff() {
		return invoiceDayCutoff;
	}

	public void setInvoiceDayCutoff(Integer invoiceDayCutoff) {
		this.invoiceDayCutoff = invoiceDayCutoff;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getInvoiceFrequency() {
		return invoiceFrequency;
	}

	public void setInvoiceFrequency(String invoiceFrequency) {
		this.invoiceFrequency = invoiceFrequency;
	}

	@Basic
	@Column(length=1)
	public String getInvoiceWeekDay() {
		return invoiceWeekDay;
	}

	public void setInvoiceWeekDay(String invoiceWeekDay) {
		this.invoiceWeekDay = invoiceWeekDay;
	}

	@Basic
	@Column(length=1)
	public String getInvoiceWeekDayCutoff() {
		return invoiceWeekDayCutoff;
	}

	public void setInvoiceWeekDayCutoff(String invoiceWeekDayCutoff) {
		this.invoiceWeekDayCutoff = invoiceWeekDayCutoff;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
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