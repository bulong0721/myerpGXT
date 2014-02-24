package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="asp_clientlevel")
public class AspClientlevel extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer aspClientlevelId;
	private Integer aspLevelId;
	private Integer aspModuleId;
	private String created;
	private Integer createdby;
	private String help;
	private Boolean isactive;
	private String updated;
	private Integer updatedby;

	public AspClientlevel() {
	}

	public AspClientlevel(Integer aspClientlevelId) {
		this.aspClientlevelId = aspClientlevelId;
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

	@Id
	@Column(name="ASP_CLIENTLEVEL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53073", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "ASP_ClientLevel", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53073")
	public Integer getAspClientlevelId() {
		return aspClientlevelId;
	}

	public void setAspClientlevelId(Integer aspClientlevelId) {
		this.aspClientlevelId = aspClientlevelId;
	}

	@Basic
	@Column(name="ASP_LEVEL_ID", columnDefinition="INT", nullable=false)
	public Integer getAspLevelId() {
		return aspLevelId;
	}

	public void setAspLevelId(Integer aspLevelId) {
		this.aspLevelId = aspLevelId;
	}

	@Basic
	@Column(name="ASP_MODULE_ID", columnDefinition="INT", nullable=false)
	public Integer getAspModuleId() {
		return aspModuleId;
	}

	public void setAspModuleId(Integer aspModuleId) {
		this.aspModuleId = aspModuleId;
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