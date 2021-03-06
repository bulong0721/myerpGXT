package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_reportview_col")
public class ADReportViewCol extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDColumnID;
	private Integer aDOrgID;
	private Integer aDReportViewColID;
	private Integer aDReportViewID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String functionColumn;
	private Boolean groupFunction;
	private String updated;
	private Integer updatedBy;

	public ADReportViewCol() {
	}

	public ADReportViewCol(Integer aDReportViewColID) {
		this.aDReportViewColID = aDReportViewColID;
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
	@Column(name="AD_COLUMN_ID", columnDefinition="INT")
	public Integer getADColumnID() {
		return aDColumnID;
	}

	public void setADColumnID(Integer aDColumnID) {
		this.aDColumnID = aDColumnID;
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
	@Column(name="AD_REPORTVIEW_COL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_365", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_ReportView_Col", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_365")
	public Integer getADReportViewColID() {
		return aDReportViewColID;
	}

	public void setADReportViewColID(Integer aDReportViewColID) {
		this.aDReportViewColID = aDReportViewColID;
	}

	@Basic
	@Column(name="AD_REPORTVIEW_ID", columnDefinition="INT", nullable=false)
	public Integer getADReportViewID() {
		return aDReportViewID;
	}

	public void setADReportViewID(Integer aDReportViewID) {
		this.aDReportViewID = aDReportViewID;
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
	@Column(nullable=false, length=60)
	public String getFunctionColumn() {
		return functionColumn;
	}

	public void setFunctionColumn(String functionColumn) {
		this.functionColumn = functionColumn;
	}

	@Basic
	@Column(name="ISGROUPFUNCTION", nullable=false)
	public Boolean isGroupFunction() {
		return groupFunction;
	}

	public void setGroupFunction(Boolean groupFunction) {
		this.groupFunction = groupFunction;
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