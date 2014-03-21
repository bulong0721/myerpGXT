package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="gl_budgetcontrol")
public class GLBudgetControl extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Boolean beforeApproval;
	private String budgetControlScope;
	private Integer cAcctSchemaID;
	private String commitmentType;
	private String created;
	private Integer createdBy;
	private String description;
	private Integer gLBudgetControlID;
	private Integer gLBudgetID;
	private String help;
	private String name;
	private String updated;
	private Integer updatedBy;

	public GLBudgetControl() {
	}

	public GLBudgetControl(Integer gLBudgetControlID) {
		this.gLBudgetControlID = gLBudgetControlID;
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
	@Column(name="ISBEFOREAPPROVAL", nullable=false)
	public Boolean isBeforeApproval() {
		return beforeApproval;
	}

	public void setBeforeApproval(Boolean beforeApproval) {
		this.beforeApproval = beforeApproval;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getBudgetControlScope() {
		return budgetControlScope;
	}

	public void setBudgetControlScope(String budgetControlScope) {
		this.budgetControlScope = budgetControlScope;
	}

	@Basic
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT", nullable=false)
	public Integer getCAcctSchemaID() {
		return cAcctSchemaID;
	}

	public void setCAcctSchemaID(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getCommitmentType() {
		return commitmentType;
	}

	public void setCommitmentType(String commitmentType) {
		this.commitmentType = commitmentType;
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

	@Id
	@Column(name="GL_BUDGETCONTROL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1183", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "GL_BudgetControl", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1183")
	public Integer getGLBudgetControlID() {
		return gLBudgetControlID;
	}

	public void setGLBudgetControlID(Integer gLBudgetControlID) {
		this.gLBudgetControlID = gLBudgetControlID;
	}

	@Basic
	@Column(name="GL_BUDGET_ID", columnDefinition="INT", nullable=false)
	public Integer getGLBudgetID() {
		return gLBudgetID;
	}

	public void setGLBudgetID(Integer gLBudgetID) {
		this.gLBudgetID = gLBudgetID;
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