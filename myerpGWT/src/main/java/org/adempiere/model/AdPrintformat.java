package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_printformat")
public class AdPrintformat extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adPrintcolorId;
	private Integer adPrintfontId;
	private Integer adPrintformatId;
	private Integer adPrintpaperId;
	private Integer adPrinttableformatId;
	private Integer adReportviewId;
	private Integer adTableId;
	private String args;
	private String classname;
	private String createcopy;
	private String created;
	private Integer createdby;
	private String description;
	private Integer footermargin;
	private Integer headermargin;
	private Boolean isactive;
	private Boolean isdefault;
	private Boolean isform;
	private Boolean isstandardheaderfooter;
	private Boolean istablebased;
	private Integer jasperprocessId;
	private String name;
	private String printername;
	private String updated;
	private Integer updatedby;

	public AdPrintformat() {
	}

	public AdPrintformat(Integer adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
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
	@Column(name="AD_PRINTCOLOR_ID", columnDefinition="INT", nullable=false)
	public Integer getAdPrintcolorId() {
		return adPrintcolorId;
	}

	public void setAdPrintcolorId(Integer adPrintcolorId) {
		this.adPrintcolorId = adPrintcolorId;
	}

	@Basic
	@Column(name="AD_PRINTFONT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdPrintfontId() {
		return adPrintfontId;
	}

	public void setAdPrintfontId(Integer adPrintfontId) {
		this.adPrintfontId = adPrintfontId;
	}

	@Id
	@Column(name="AD_PRINTFORMAT_ID", columnDefinition="INT")
	public Integer getAdPrintformatId() {
		return adPrintformatId;
	}

	public void setAdPrintformatId(Integer adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
	}

	@Basic
	@Column(name="AD_PRINTPAPER_ID", columnDefinition="INT", nullable=false)
	public Integer getAdPrintpaperId() {
		return adPrintpaperId;
	}

	public void setAdPrintpaperId(Integer adPrintpaperId) {
		this.adPrintpaperId = adPrintpaperId;
	}

	@Basic
	@Column(name="AD_PRINTTABLEFORMAT_ID", columnDefinition="INT")
	public Integer getAdPrinttableformatId() {
		return adPrinttableformatId;
	}

	public void setAdPrinttableformatId(Integer adPrinttableformatId) {
		this.adPrinttableformatId = adPrinttableformatId;
	}

	@Basic
	@Column(name="AD_REPORTVIEW_ID", columnDefinition="INT")
	public Integer getAdReportviewId() {
		return adReportviewId;
	}

	public void setAdReportviewId(Integer adReportviewId) {
		this.adReportviewId = adReportviewId;
	}

	@Basic
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
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
	@Column(length=1)
	public String getCreatecopy() {
		return createcopy;
	}

	public void setCreatecopy(String createcopy) {
		this.createcopy = createcopy;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getFootermargin() {
		return footermargin;
	}

	public void setFootermargin(Integer footermargin) {
		this.footermargin = footermargin;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getHeadermargin() {
		return headermargin;
	}

	public void setHeadermargin(Integer headermargin) {
		this.headermargin = headermargin;
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
	@Column(nullable=false)
	public Boolean isIsdefault() {
		return isdefault;
	}

	public void setIsdefault(Boolean isdefault) {
		this.isdefault = isdefault;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsform() {
		return isform;
	}

	public void setIsform(Boolean isform) {
		this.isform = isform;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsstandardheaderfooter() {
		return isstandardheaderfooter;
	}

	public void setIsstandardheaderfooter(Boolean isstandardheaderfooter) {
		this.isstandardheaderfooter = isstandardheaderfooter;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIstablebased() {
		return istablebased;
	}

	public void setIstablebased(Boolean istablebased) {
		this.istablebased = istablebased;
	}

	@Basic
	@Column(name="JASPERPROCESS_ID", columnDefinition="INT")
	public Integer getJasperprocessId() {
		return jasperprocessId;
	}

	public void setJasperprocessId(Integer jasperprocessId) {
		this.jasperprocessId = jasperprocessId;
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
	public String getPrintername() {
		return printername;
	}

	public void setPrintername(String printername) {
		this.printername = printername;
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