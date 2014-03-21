package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="hr_year")
public class HRYear extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cYearID;
	private String created;
	private Integer createdBy;
	private Integer hRPayrollID;
	private Integer hRYearID;
	private Integer netDays;
	private Boolean processed;
	private Boolean processing;
	private Integer qty;
	private String startDate;
	private String updated;
	private Integer updatedBy;

	public HRYear() {
	}

	public HRYear(Integer hRYearID) {
		this.hRYearID = hRYearID;
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
	@Column(name="C_YEAR_ID", columnDefinition="INT", nullable=false)
	public Integer getCYearID() {
		return cYearID;
	}

	public void setCYearID(Integer cYearID) {
		this.cYearID = cYearID;
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
	@Column(name="HR_PAYROLL_ID", columnDefinition="INT", nullable=false)
	public Integer getHRPayrollID() {
		return hRPayrollID;
	}

	public void setHRPayrollID(Integer hRPayrollID) {
		this.hRPayrollID = hRPayrollID;
	}

	@Id
	@Column(name="HR_YEAR_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53114", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "HR_Year", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53114")
	public Integer getHRYearID() {
		return hRYearID;
	}

	public void setHRYearID(Integer hRYearID) {
		this.hRYearID = hRYearID;
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
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Basic
	@Column(nullable=false)
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
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