package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="gl_budgetcontrol")
public class GlBudgetcontrol extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String budgetcontrolscope;
	private Integer cAcctschemaId;
	private String commitmenttype;
	private String created;
	private Integer createdby;
	private String description;
	private Integer glBudgetId;
	private Integer glBudgetcontrolId;
	private String help;
	private Boolean isactive;
	private Boolean isbeforeapproval;
	private String name;
	private String updated;
	private Integer updatedby;

	public GlBudgetcontrol() {
	}

	public GlBudgetcontrol(Integer glBudgetcontrolId) {
		this.glBudgetcontrolId = glBudgetcontrolId;
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
	@Column(nullable=false, length=1)
	public String getBudgetcontrolscope() {
		return budgetcontrolscope;
	}

	public void setBudgetcontrolscope(String budgetcontrolscope) {
		this.budgetcontrolscope = budgetcontrolscope;
	}

	@Basic
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT", nullable=false)
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getCommitmenttype() {
		return commitmenttype;
	}

	public void setCommitmenttype(String commitmenttype) {
		this.commitmenttype = commitmenttype;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="GL_BUDGET_ID", columnDefinition="INT", nullable=false)
	public Integer getGlBudgetId() {
		return glBudgetId;
	}

	public void setGlBudgetId(Integer glBudgetId) {
		this.glBudgetId = glBudgetId;
	}

	@Id
	@Column(name="GL_BUDGETCONTROL_ID", columnDefinition="INT")
	public Integer getGlBudgetcontrolId() {
		return glBudgetcontrolId;
	}

	public void setGlBudgetcontrolId(Integer glBudgetcontrolId) {
		this.glBudgetcontrolId = glBudgetcontrolId;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
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
	@Column(nullable=false)
	public Boolean isIsbeforeapproval() {
		return isbeforeapproval;
	}

	public void setIsbeforeapproval(Boolean isbeforeapproval) {
		this.isbeforeapproval = isbeforeapproval;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}