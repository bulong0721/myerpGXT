package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_accessstage")
@IdClass(org.adempiere.model.CMAccessStagePK.class)
public class CMAccessStage extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private String active;
	private Integer cMAccessProfileID;
	private Integer cMCStageID;
	private String created;
	private Integer createdBy;
	private String updated;
	private Integer updatedBy;

	public CMAccessStage() {
	}

	public CMAccessStage(Integer cMAccessProfileID, Integer cMCStageID) {
		this.cMAccessProfileID = cMAccessProfileID;
		this.cMCStageID = cMCStageID;
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
	@Column(name="ISACTIVE", nullable=false, length=1)
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Id
	@Column(name="CM_ACCESSPROFILE_ID", columnDefinition="INT")
	public Integer getCMAccessProfileID() {
		return cMAccessProfileID;
	}

	public void setCMAccessProfileID(Integer cMAccessProfileID) {
		this.cMAccessProfileID = cMAccessProfileID;
	}

	@Id
	@Column(name="CM_CSTAGE_ID", columnDefinition="INT")
	public Integer getCMCStageID() {
		return cMCStageID;
	}

	public void setCMCStageID(Integer cMCStageID) {
		this.cMCStageID = cMCStageID;
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