package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="hr_payrollconcept")
public class HRPayrollConcept extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDRuleID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private Boolean displayed;
	private Integer hRConceptID;
	private Integer hRPayrollConceptID;
	private Integer hRPayrollID;
	private Boolean include;
	private String name;
	private Boolean printed;
	private Integer seqNo;
	private String updated;
	private Integer updatedBy;

	public HRPayrollConcept() {
	}

	public HRPayrollConcept(Integer hRPayrollConceptID) {
		this.hRPayrollConceptID = hRPayrollConceptID;
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
	@Column(name="AD_RULE_ID", columnDefinition="INT")
	public Integer getADRuleID() {
		return aDRuleID;
	}

	public void setADRuleID(Integer aDRuleID) {
		this.aDRuleID = aDRuleID;
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
	@Column(name="ISDISPLAYED")
	public Boolean isDisplayed() {
		return displayed;
	}

	public void setDisplayed(Boolean displayed) {
		this.displayed = displayed;
	}

	@Basic
	@Column(name="HR_CONCEPT_ID", columnDefinition="INT", nullable=false)
	public Integer getHRConceptID() {
		return hRConceptID;
	}

	public void setHRConceptID(Integer hRConceptID) {
		this.hRConceptID = hRConceptID;
	}

	@Id
	@Column(name="HR_PAYROLLCONCEPT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53115", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "HR_PayrollConcept", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53115")
	public Integer getHRPayrollConceptID() {
		return hRPayrollConceptID;
	}

	public void setHRPayrollConceptID(Integer hRPayrollConceptID) {
		this.hRPayrollConceptID = hRPayrollConceptID;
	}

	@Basic
	@Column(name="HR_PAYROLL_ID", columnDefinition="INT", nullable=false)
	public Integer getHRPayrollID() {
		return hRPayrollID;
	}

	public void setHRPayrollID(Integer hRPayrollID) {
		this.hRPayrollID = hRPayrollID;
	}

	@Basic
	@Column(name="ISINCLUDE")
	public Boolean isInclude() {
		return include;
	}

	public void setInclude(Boolean include) {
		this.include = include;
	}

	@Basic
	@Column(length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name="ISPRINTED", nullable=false)
	public Boolean isPrinted() {
		return printed;
	}

	public void setPrinted(Boolean printed) {
		this.printed = printed;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
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