package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_printformat")
public class ADPrintFormat extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDPrintColorID;
	private Integer aDPrintFontID;
	private Integer aDPrintFormatID;
	private Integer aDPrintPaperID;
	private Integer aDPrintTableFormatID;
	private Integer aDReportViewID;
	private Integer aDTableID;
	private Boolean active;
	private String args;
	private String classname;
	private Boolean createCopy;
	private String created;
	private Integer createdBy;
	private String description;
	private Integer footerMargin;
	private Boolean form;
	private Integer headerMargin;
	private Boolean isDefault;
	private Integer jasperProcessID;
	private String name;
	private String printerName;
	private Boolean standardHeaderFooter;
	private Boolean tableBased;
	private String updated;
	private Integer updatedBy;

	public ADPrintFormat() {
	}

	public ADPrintFormat(Integer aDPrintFormatID) {
		this.aDPrintFormatID = aDPrintFormatID;
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
	@Column(name="AD_PRINTCOLOR_ID", columnDefinition="INT", nullable=false)
	public Integer getADPrintColorID() {
		return aDPrintColorID;
	}

	public void setADPrintColorID(Integer aDPrintColorID) {
		this.aDPrintColorID = aDPrintColorID;
	}

	@Basic
	@Column(name="AD_PRINTFONT_ID", columnDefinition="INT", nullable=false)
	public Integer getADPrintFontID() {
		return aDPrintFontID;
	}

	public void setADPrintFontID(Integer aDPrintFontID) {
		this.aDPrintFontID = aDPrintFontID;
	}

	@Id
	@Column(name="AD_PRINTFORMAT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_579", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_PrintFormat", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_579")
	public Integer getADPrintFormatID() {
		return aDPrintFormatID;
	}

	public void setADPrintFormatID(Integer aDPrintFormatID) {
		this.aDPrintFormatID = aDPrintFormatID;
	}

	@Basic
	@Column(name="AD_PRINTPAPER_ID", columnDefinition="INT", nullable=false)
	public Integer getADPrintPaperID() {
		return aDPrintPaperID;
	}

	public void setADPrintPaperID(Integer aDPrintPaperID) {
		this.aDPrintPaperID = aDPrintPaperID;
	}

	@Basic
	@Column(name="AD_PRINTTABLEFORMAT_ID", columnDefinition="INT")
	public Integer getADPrintTableFormatID() {
		return aDPrintTableFormatID;
	}

	public void setADPrintTableFormatID(Integer aDPrintTableFormatID) {
		this.aDPrintTableFormatID = aDPrintTableFormatID;
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
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
	public Integer getADTableID() {
		return aDTableID;
	}

	public void setADTableID(Integer aDTableID) {
		this.aDTableID = aDTableID;
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
	@Column(length=480)
	public String getArgs() {
		return args;
	}

	public void setArgs(String args) {
		this.args = args;
	}

	@Basic
	@Column(length=240)
	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	@Basic
	public Boolean isCreateCopy() {
		return createCopy;
	}

	public void setCreateCopy(Boolean createCopy) {
		this.createCopy = createCopy;
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

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getFooterMargin() {
		return footerMargin;
	}

	public void setFooterMargin(Integer footerMargin) {
		this.footerMargin = footerMargin;
	}

	@Basic
	@Column(name="ISFORM", nullable=false)
	public Boolean isForm() {
		return form;
	}

	public void setForm(Boolean form) {
		this.form = form;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getHeaderMargin() {
		return headerMargin;
	}

	public void setHeaderMargin(Integer headerMargin) {
		this.headerMargin = headerMargin;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Basic
	@Column(name="JASPERPROCESS_ID", columnDefinition="INT")
	public Integer getJasperProcessID() {
		return jasperProcessID;
	}

	public void setJasperProcessID(Integer jasperProcessID) {
		this.jasperProcessID = jasperProcessID;
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
	@Column(length=40)
	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	@Basic
	@Column(name="ISSTANDARDHEADERFOOTER", nullable=false)
	public Boolean isStandardHeaderFooter() {
		return standardHeaderFooter;
	}

	public void setStandardHeaderFooter(Boolean standardHeaderFooter) {
		this.standardHeaderFooter = standardHeaderFooter;
	}

	@Basic
	@Column(name="ISTABLEBASED", nullable=false)
	public Boolean isTableBased() {
		return tableBased;
	}

	public void setTableBased(Boolean tableBased) {
		this.tableBased = tableBased;
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