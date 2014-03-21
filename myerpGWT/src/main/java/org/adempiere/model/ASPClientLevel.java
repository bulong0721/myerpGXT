package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="asp_clientlevel")
public class ASPClientLevel extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aSPClientLevelID;
	private Integer aSPLevelID;
	private Integer aSPModuleID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String help;
	private String updated;
	private Integer updatedBy;

	public ASPClientLevel() {
	}

	public ASPClientLevel(Integer aSPClientLevelID) {
		this.aSPClientLevelID = aSPClientLevelID;
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

	@Id
	@Column(name="ASP_CLIENTLEVEL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53073", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "ASP_ClientLevel", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53073")
	public Integer getASPClientLevelID() {
		return aSPClientLevelID;
	}

	public void setASPClientLevelID(Integer aSPClientLevelID) {
		this.aSPClientLevelID = aSPClientLevelID;
	}

	@Basic
	@Column(name="ASP_LEVEL_ID", columnDefinition="INT", nullable=false)
	public Integer getASPLevelID() {
		return aSPLevelID;
	}

	public void setASPLevelID(Integer aSPLevelID) {
		this.aSPLevelID = aSPLevelID;
	}

	@Basic
	@Column(name="ASP_MODULE_ID", columnDefinition="INT", nullable=false)
	public Integer getASPModuleID() {
		return aSPModuleID;
	}

	public void setASPModuleID(Integer aSPModuleID) {
		this.aSPModuleID = aSPModuleID;
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
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
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