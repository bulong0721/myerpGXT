package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_payschedule")
public class CPaySchedule extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cPayScheduleID;
	private Integer cPaymentTermID;
	private String created;
	private Integer createdBy;
	private BigDecimal discount;
	private Integer discountDays;
	private Integer graceDays;
	private String netDay;
	private Integer netDays;
	private BigDecimal percentage;
	private String updated;
	private Integer updatedBy;
	private Boolean valid;

	public CPaySchedule() {
	}

	public CPaySchedule(Integer cPayScheduleID) {
		this.cPayScheduleID = cPayScheduleID;
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

	@Id
	@Column(name="C_PAYSCHEDULE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_677", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_PaySchedule", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_677")
	public Integer getCPayScheduleID() {
		return cPayScheduleID;
	}

	public void setCPayScheduleID(Integer cPayScheduleID) {
		this.cPayScheduleID = cPayScheduleID;
	}

	@Basic
	@Column(name="C_PAYMENTTERM_ID", columnDefinition="INT", nullable=false)
	public Integer getCPaymentTermID() {
		return cPaymentTermID;
	}

	public void setCPaymentTermID(Integer cPaymentTermID) {
		this.cPaymentTermID = cPaymentTermID;
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
	@Column(nullable=false)
	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getDiscountDays() {
		return discountDays;
	}

	public void setDiscountDays(Integer discountDays) {
		this.discountDays = discountDays;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getGraceDays() {
		return graceDays;
	}

	public void setGraceDays(Integer graceDays) {
		this.graceDays = graceDays;
	}

	@Basic
	@Column(length=1)
	public String getNetDay() {
		return netDay;
	}

	public void setNetDay(String netDay) {
		this.netDay = netDay;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getNetDays() {
		return netDays;
	}

	public void setNetDays(Integer netDays) {
		this.netDays = netDays;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getPercentage() {
		return percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
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

	@Basic
	@Column(name="ISVALID", nullable=false)
	public Boolean isValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
}