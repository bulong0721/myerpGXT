package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_package_exp_detail")
public class ADPackageExpDetail extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDEntityTypeID;
	private Integer aDFormID;
	private Integer aDImpFormatID;
	private Integer aDMenuID;
	private Integer aDMessageID;
	private Integer aDModelValidatorID;
	private Integer aDOrgID;
	private String aDPackageCodeNew;
	private String aDPackageCodeOld;
	private Integer aDPackageExpDetailID;
	private Integer aDPackageExpID;
	private Integer aDPrintFormatID;
	private Integer aDProcessID;
	private Integer aDReferenceID;
	private Integer aDReportViewID;
	private Integer aDRoleID;
	private Integer aDTableID;
	private Integer aDValRuleID;
	private Integer aDWindowID;
	private Integer aDWorkbenchID;
	private Integer aDWorkflowID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String dBType;
	private String description;
	private String destinationDirectory;
	private String destinationFileName;
	private String fileDirectory;
	private String fileName;
	private BigDecimal line;
	private String name2;
	private Boolean processed;
	private Boolean processing;
	private String releaseNo;
	private String sQLStatement;
	private String targetDirectory;
	private String type;
	private String updated;
	private BigDecimal updatedBy;

	public ADPackageExpDetail() {
	}

	public ADPackageExpDetail(Integer aDPackageExpDetailID) {
		this.aDPackageExpDetailID = aDPackageExpDetailID;
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
	@Column(name="AD_ENTITYTYPE_ID", columnDefinition="INT")
	public Integer getADEntityTypeID() {
		return aDEntityTypeID;
	}

	public void setADEntityTypeID(Integer aDEntityTypeID) {
		this.aDEntityTypeID = aDEntityTypeID;
	}

	@Basic
	@Column(name="AD_FORM_ID", columnDefinition="INT")
	public Integer getADFormID() {
		return aDFormID;
	}

	public void setADFormID(Integer aDFormID) {
		this.aDFormID = aDFormID;
	}

	@Basic
	@Column(name="AD_IMPFORMAT_ID", columnDefinition="INT")
	public Integer getADImpFormatID() {
		return aDImpFormatID;
	}

	public void setADImpFormatID(Integer aDImpFormatID) {
		this.aDImpFormatID = aDImpFormatID;
	}

	@Basic
	@Column(name="AD_MENU_ID", columnDefinition="INT")
	public Integer getADMenuID() {
		return aDMenuID;
	}

	public void setADMenuID(Integer aDMenuID) {
		this.aDMenuID = aDMenuID;
	}

	@Basic
	@Column(name="AD_MESSAGE_ID", columnDefinition="INT")
	public Integer getADMessageID() {
		return aDMessageID;
	}

	public void setADMessageID(Integer aDMessageID) {
		this.aDMessageID = aDMessageID;
	}

	@Basic
	@Column(name="AD_MODELVALIDATOR_ID", columnDefinition="INT")
	public Integer getADModelValidatorID() {
		return aDModelValidatorID;
	}

	public void setADModelValidatorID(Integer aDModelValidatorID) {
		this.aDModelValidatorID = aDModelValidatorID;
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
	@Column(name="AD_PACKAGE_CODE_NEW", length=2000)
	public String getADPackageCodeNew() {
		return aDPackageCodeNew;
	}

	public void setADPackageCodeNew(String aDPackageCodeNew) {
		this.aDPackageCodeNew = aDPackageCodeNew;
	}

	@Basic
	@Column(name="AD_PACKAGE_CODE_OLD", length=2000)
	public String getADPackageCodeOld() {
		return aDPackageCodeOld;
	}

	public void setADPackageCodeOld(String aDPackageCodeOld) {
		this.aDPackageCodeOld = aDPackageCodeOld;
	}

	@Id
	@Column(name="AD_PACKAGE_EXP_DETAIL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_50006", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_Package_Exp_Detail", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_50006")
	public Integer getADPackageExpDetailID() {
		return aDPackageExpDetailID;
	}

	public void setADPackageExpDetailID(Integer aDPackageExpDetailID) {
		this.aDPackageExpDetailID = aDPackageExpDetailID;
	}

	@Basic
	@Column(name="AD_PACKAGE_EXP_ID", columnDefinition="INT", nullable=false)
	public Integer getADPackageExpID() {
		return aDPackageExpID;
	}

	public void setADPackageExpID(Integer aDPackageExpID) {
		this.aDPackageExpID = aDPackageExpID;
	}

	@Basic
	@Column(name="AD_PRINTFORMAT_ID", columnDefinition="INT")
	public Integer getADPrintFormatID() {
		return aDPrintFormatID;
	}

	public void setADPrintFormatID(Integer aDPrintFormatID) {
		this.aDPrintFormatID = aDPrintFormatID;
	}

	@Basic
	@Column(name="AD_PROCESS_ID", columnDefinition="INT")
	public Integer getADProcessID() {
		return aDProcessID;
	}

	public void setADProcessID(Integer aDProcessID) {
		this.aDProcessID = aDProcessID;
	}

	@Basic
	@Column(name="AD_REFERENCE_ID", columnDefinition="INT")
	public Integer getADReferenceID() {
		return aDReferenceID;
	}

	public void setADReferenceID(Integer aDReferenceID) {
		this.aDReferenceID = aDReferenceID;
	}

	@Basic
	@Column(name="AD_REPORTVIEW_ID", columnDefinition="INT")
	public Integer getADReportViewID() {
		return aDReportViewID;
	}

	public void setADReportViewID(Integer aDReportViewID) {
		this.aDReportViewID = aDReportViewID;
	}

	@Basic
	@Column(name="AD_ROLE_ID", columnDefinition="INT")
	public Integer getADRoleID() {
		return aDRoleID;
	}

	public void setADRoleID(Integer aDRoleID) {
		this.aDRoleID = aDRoleID;
	}

	@Basic
	@Column(name="AD_TABLE_ID", columnDefinition="INT")
	public Integer getADTableID() {
		return aDTableID;
	}

	public void setADTableID(Integer aDTableID) {
		this.aDTableID = aDTableID;
	}

	@Basic
	@Column(name="AD_VAL_RULE_ID", columnDefinition="INT")
	public Integer getADValRuleID() {
		return aDValRuleID;
	}

	public void setADValRuleID(Integer aDValRuleID) {
		this.aDValRuleID = aDValRuleID;
	}

	@Basic
	@Column(name="AD_WINDOW_ID", columnDefinition="INT")
	public Integer getADWindowID() {
		return aDWindowID;
	}

	public void setADWindowID(Integer aDWindowID) {
		this.aDWindowID = aDWindowID;
	}

	@Basic
	@Column(name="AD_WORKBENCH_ID", columnDefinition="INT")
	public Integer getADWorkbenchID() {
		return aDWorkbenchID;
	}

	public void setADWorkbenchID(Integer aDWorkbenchID) {
		this.aDWorkbenchID = aDWorkbenchID;
	}

	@Basic
	@Column(name="AD_WORKFLOW_ID", columnDefinition="INT")
	public Integer getADWorkflowID() {
		return aDWorkflowID;
	}

	public void setADWorkflowID(Integer aDWorkflowID) {
		this.aDWorkflowID = aDWorkflowID;
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
	@Column(nullable=false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	@Column(length=22)
	public String getDBType() {
		return dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
	}

	@Basic
	@Column(nullable=false, length=1000)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="DESTINATION_DIRECTORY")
	public String getDestinationDirectory() {
		return destinationDirectory;
	}

	public void setDestinationDirectory(String destinationDirectory) {
		this.destinationDirectory = destinationDirectory;
	}

	@Basic
	@Column(name="DESTINATION_FILENAME")
	public String getDestinationFileName() {
		return destinationFileName;
	}

	public void setDestinationFileName(String destinationFileName) {
		this.destinationFileName = destinationFileName;
	}

	@Basic
	@Column(name="FILE_DIRECTORY")
	public String getFileDirectory() {
		return fileDirectory;
	}

	public void setFileDirectory(String fileDirectory) {
		this.fileDirectory = fileDirectory;
	}

	@Basic
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Basic
	public BigDecimal getLine() {
		return line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}

	@Basic
	@Column(length=60)
	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	@Basic
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=20)
	public String getReleaseNo() {
		return releaseNo;
	}

	public void setReleaseNo(String releaseNo) {
		this.releaseNo = releaseNo;
	}

	@Basic
	@Column(length=2000)
	public String getSQLStatement() {
		return sQLStatement;
	}

	public void setSQLStatement(String sQLStatement) {
		this.sQLStatement = sQLStatement;
	}

	@Basic
	@Column(name="TARGET_DIRECTORY")
	public String getTargetDirectory() {
		return targetDirectory;
	}

	public void setTargetDirectory(String targetDirectory) {
		this.targetDirectory = targetDirectory;
	}

	@Basic
	@Column(nullable=false, length=10)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	@Column(nullable=false)
	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}
}