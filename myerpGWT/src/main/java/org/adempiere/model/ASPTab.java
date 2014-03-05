package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="asp_tab")
public class ASPTab extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDTabID;
	private String aSPStatus;
	private Integer aSPTabID;
	private Integer aSPWindowID;
	private Boolean active;
	private Boolean allFields;
	private String created;
	private Integer createdBy;
	private Boolean processing;
	private String updated;
	private Integer updatedBy;

	public ASPTab() {
	}

	public ASPTab(Integer aSPTabID) {
		this.aSPTabID = aSPTabID;
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
	@Column(name="AD_TAB_ID", columnDefinition="INT", nullable=false)
	public Integer getADTabID() {
		return aDTabID;
	}

	public void setADTabID(Integer aDTabID) {
		this.aDTabID = aDTabID;
	}

	@Basic
	@Column(name="ASP_STATUS", nullable=false, length=1)
	public String getASPStatus() {
		return aSPStatus;
	}

	public void setASPStatus(String aSPStatus) {
		this.aSPStatus = aSPStatus;
	}

	@Id
	@Column(name="ASP_TAB_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53064", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "ASP_Tab", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53064")
	public Integer getASPTabID() {
		return aSPTabID;
	}

	public void setASPTabID(Integer aSPTabID) {
		this.aSPTabID = aSPTabID;
	}

	@Basic
	@Column(name="ASP_WINDOW_ID", columnDefinition="INT")
	public Integer getASPWindowID() {
		return aSPWindowID;
	}

	public void setASPWindowID(Integer aSPWindowID) {
		this.aSPWindowID = aSPWindowID;
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
	public Boolean isAllFields() {
		return allFields;
	}

	public void setAllFields(Boolean allFields) {
		this.allFields = allFields;
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
}