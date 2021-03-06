package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="hr_list")
public class HRList extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String description;
	private Boolean employee;
	private Integer hRDepartmentID;
	private Integer hREmployeeID;
	private Integer hRListID;
	private Integer hRListTypeID;
	private Integer hRPayrollID;
	private String name;
	private String updated;
	private Integer updatedBy;
	private String validFrom;
	private String value;

	public HRList() {
	}

	public HRList(Integer hRListID) {
		this.hRListID = hRListID;
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
	@Column(name="ISEMPLOYEE")
	public Boolean isEmployee() {
		return employee;
	}

	public void setEmployee(Boolean employee) {
		this.employee = employee;
	}

	@Basic
	@Column(name="HR_DEPARTMENT_ID", columnDefinition="INT")
	public Integer getHRDepartmentID() {
		return hRDepartmentID;
	}

	public void setHRDepartmentID(Integer hRDepartmentID) {
		this.hRDepartmentID = hRDepartmentID;
	}

	@Basic
	@Column(name="HR_EMPLOYEE_ID", columnDefinition="INT")
	public Integer getHREmployeeID() {
		return hREmployeeID;
	}

	public void setHREmployeeID(Integer hREmployeeID) {
		this.hREmployeeID = hREmployeeID;
	}

	@Id
	@Column(name="HR_LIST_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53118", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "HR_List", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53118")
	public Integer getHRListID() {
		return hRListID;
	}

	public void setHRListID(Integer hRListID) {
		this.hRListID = hRListID;
	}

	@Basic
	@Column(name="HR_LISTTYPE_ID", columnDefinition="INT")
	public Integer getHRListTypeID() {
		return hRListTypeID;
	}

	public void setHRListTypeID(Integer hRListTypeID) {
		this.hRListTypeID = hRListTypeID;
	}

	@Basic
	@Column(name="HR_PAYROLL_ID", columnDefinition="INT")
	public Integer getHRPayrollID() {
		return hRPayrollID;
	}

	public void setHRPayrollID(Integer hRPayrollID) {
		this.hRPayrollID = hRPayrollID;
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

	@Basic
	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	@Basic
	@Column(length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}