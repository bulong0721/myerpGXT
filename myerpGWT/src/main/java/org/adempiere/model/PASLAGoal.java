package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_sla_goal")
public class PASLAGoal extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cBPartnerID;
	private String created;
	private Integer createdBy;
	private String dateLastRun;
	private String description;
	private String help;
	private BigDecimal measureActual;
	private BigDecimal measureTarget;
	private String name;
	private Integer pASLACriteriaID;
	private Integer pASLAGoalID;
	private Boolean processed;
	private Boolean processing;
	private String updated;
	private Integer updatedBy;
	private String validFrom;
	private String validTo;

	public PASLAGoal() {
	}

	public PASLAGoal(Integer pASLAGoalID) {
		this.pASLAGoalID = pASLAGoalID;
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
	@Column(name="C_BPARTNER_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
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
	public String getDateLastRun() {
		return dateLastRun;
	}

	public void setDateLastRun(String dateLastRun) {
		this.dateLastRun = dateLastRun;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	public BigDecimal getMeasureActual() {
		return measureActual;
	}

	public void setMeasureActual(BigDecimal measureActual) {
		this.measureActual = measureActual;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getMeasureTarget() {
		return measureTarget;
	}

	public void setMeasureTarget(BigDecimal measureTarget) {
		this.measureTarget = measureTarget;
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
	@Column(name="PA_SLA_CRITERIA_ID", columnDefinition="INT", nullable=false)
	public Integer getPASLACriteriaID() {
		return pASLACriteriaID;
	}

	public void setPASLACriteriaID(Integer pASLACriteriaID) {
		this.pASLACriteriaID = pASLACriteriaID;
	}

	@Id
	@Column(name="PA_SLA_GOAL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_992", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "PA_SLA_Goal", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_992")
	public Integer getPASLAGoalID() {
		return pASLAGoalID;
	}

	public void setPASLAGoalID(Integer pASLAGoalID) {
		this.pASLAGoalID = pASLAGoalID;
	}

	@Basic
	@Column(nullable=false)
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
	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}
}