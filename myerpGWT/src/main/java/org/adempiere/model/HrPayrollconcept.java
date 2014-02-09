package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="hr_payrollconcept")
public class HrPayrollconcept extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adRuleId;
	private String created;
	private Integer createdby;
	private Integer hrConceptId;
	private Integer hrPayrollId;
	private Integer hrPayrollconceptId;
	private Boolean isactive;
	private Boolean isdisplayed;
	private Boolean isinclude;
	private Boolean isprinted;
	private String name;
	private Integer seqno;
	private String updated;
	private Integer updatedby;

	public HrPayrollconcept() {
	}

	public HrPayrollconcept(Integer hrPayrollconceptId) {
		this.hrPayrollconceptId = hrPayrollconceptId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_RULE_ID", columnDefinition="INT")
	public Integer getAdRuleId() {
		return adRuleId;
	}

	public void setAdRuleId(Integer adRuleId) {
		this.adRuleId = adRuleId;
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
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(name="HR_CONCEPT_ID", columnDefinition="INT", nullable=false)
	public Integer getHrConceptId() {
		return hrConceptId;
	}

	public void setHrConceptId(Integer hrConceptId) {
		this.hrConceptId = hrConceptId;
	}

	@Basic
	@Column(name="HR_PAYROLL_ID", columnDefinition="INT", nullable=false)
	public Integer getHrPayrollId() {
		return hrPayrollId;
	}

	public void setHrPayrollId(Integer hrPayrollId) {
		this.hrPayrollId = hrPayrollId;
	}

	@Id
	@Column(name="HR_PAYROLLCONCEPT_ID", columnDefinition="INT")
	public Integer getHrPayrollconceptId() {
		return hrPayrollconceptId;
	}

	public void setHrPayrollconceptId(Integer hrPayrollconceptId) {
		this.hrPayrollconceptId = hrPayrollconceptId;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	public Boolean isIsdisplayed() {
		return isdisplayed;
	}

	public void setIsdisplayed(Boolean isdisplayed) {
		this.isdisplayed = isdisplayed;
	}

	@Basic
	public Boolean isIsinclude() {
		return isinclude;
	}

	public void setIsinclude(Boolean isinclude) {
		this.isinclude = isinclude;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsprinted() {
		return isprinted;
	}

	public void setIsprinted(Boolean isprinted) {
		this.isprinted = isprinted;
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
	@Column(columnDefinition="INT")
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}