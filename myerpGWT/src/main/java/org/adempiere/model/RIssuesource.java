package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_issuesource")
public class RIssuesource extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String isactive;
	private String profileinfo;
	private Integer rIssueprojectId;
	private Integer rIssuesourceId;
	private Integer rIssuesystemId;
	private Integer rIssueuserId;
	private String statisticsinfo;
	private String updated;
	private Integer updatedby;

	public RIssuesource() {
	}

	public RIssuesource(Integer rIssuesourceId) {
		this.rIssuesourceId = rIssuesourceId;
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
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(length=60)
	public String getProfileinfo() {
		return profileinfo;
	}

	public void setProfileinfo(String profileinfo) {
		this.profileinfo = profileinfo;
	}

	@Basic
	@Column(name="R_ISSUEPROJECT_ID", columnDefinition="INT", nullable=false)
	public Integer getRIssueprojectId() {
		return rIssueprojectId;
	}

	public void setRIssueprojectId(Integer rIssueprojectId) {
		this.rIssueprojectId = rIssueprojectId;
	}

	@Id
	@Column(name="R_ISSUESOURCE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1203", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "R_IssueSource", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1203")
	public Integer getRIssuesourceId() {
		return rIssuesourceId;
	}

	public void setRIssuesourceId(Integer rIssuesourceId) {
		this.rIssuesourceId = rIssuesourceId;
	}

	@Basic
	@Column(name="R_ISSUESYSTEM_ID", columnDefinition="INT", nullable=false)
	public Integer getRIssuesystemId() {
		return rIssuesystemId;
	}

	public void setRIssuesystemId(Integer rIssuesystemId) {
		this.rIssuesystemId = rIssuesystemId;
	}

	@Basic
	@Column(name="R_ISSUEUSER_ID", columnDefinition="INT", nullable=false)
	public Integer getRIssueuserId() {
		return rIssueuserId;
	}

	public void setRIssueuserId(Integer rIssueuserId) {
		this.rIssueuserId = rIssueuserId;
	}

	@Basic
	@Column(length=60)
	public String getStatisticsinfo() {
		return statisticsinfo;
	}

	public void setStatisticsinfo(String statisticsinfo) {
		this.statisticsinfo = statisticsinfo;
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