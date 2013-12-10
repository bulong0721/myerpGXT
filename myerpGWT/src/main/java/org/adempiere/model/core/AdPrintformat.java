package org.adempiere.model.core;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.adempiere.common.Language;
import org.adempiere.model.common.ADEntityBase;

/**
 * The persistent class for the ad_printformat database table.
 * 
 */
@Entity
@Table(name = "ad_printformat")
public class AdPrintformat extends ADEntityBase implements Serializable {
	private static final long		serialVersionUID	= 1L;
	private long					adPrintformatId;
	private Long					adClientId;
	private Long					adOrgId;
	private Long					adPrintcolorId;
	private Long					adPrintfontId;
	private Long					adPrintpaperId;
	private Long					adPrinttableformatId;
	private Long					adReportviewId;
	private Long					adTableId;
	private String					args;
	private String					classname;
	private String					createcopy;
	private String					created;
	private Long					createdby;
	private String					description;
	private Long					footermargin;
	private Long					headermargin;
	private String					isactive;
	private String					isdefault;
	private String					isform;
	private String					isstandardheaderfooter;
	private String					istablebased;
	private Long					jasperprocessId;
	private String					name;
	private String					printername;
	private String					updated;
	private Long					updatedby;
	private List<AdPrintformatitem>	adPrintformatitems;

	public AdPrintformat() {
	}

	@Id
	@Column(name = "AD_PRINTFORMAT_ID")
	public long getAdPrintformatId() {
		return this.adPrintformatId;
	}

	public void setAdPrintformatId(long adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Column(name = "AD_PRINTCOLOR_ID")
	public Long getAdPrintcolorId() {
		return this.adPrintcolorId;
	}

	public void setAdPrintcolorId(Long adPrintcolorId) {
		this.adPrintcolorId = adPrintcolorId;
	}

	@Column(name = "AD_PRINTFONT_ID")
	public Long getAdPrintfontId() {
		return this.adPrintfontId;
	}

	public void setAdPrintfontId(Long adPrintfontId) {
		this.adPrintfontId = adPrintfontId;
	}

	@Column(name = "AD_PRINTPAPER_ID")
	public Long getAdPrintpaperId() {
		return this.adPrintpaperId;
	}

	public void setAdPrintpaperId(Long adPrintpaperId) {
		this.adPrintpaperId = adPrintpaperId;
	}

	@Column(name = "AD_PRINTTABLEFORMAT_ID")
	public Long getAdPrinttableformatId() {
		return this.adPrinttableformatId;
	}

	public void setAdPrinttableformatId(Long adPrinttableformatId) {
		this.adPrinttableformatId = adPrinttableformatId;
	}

	@Column(name = "AD_REPORTVIEW_ID")
	public Long getAdReportviewId() {
		return this.adReportviewId;
	}

	public void setAdReportviewId(Long adReportviewId) {
		this.adReportviewId = adReportviewId;
	}

	@Column(name = "AD_TABLE_ID")
	public Long getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(Long adTableId) {
		this.adTableId = adTableId;
	}

	public String getArgs() {
		return this.args;
	}

	public void setArgs(String args) {
		this.args = args;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getCreatecopy() {
		return this.createcopy;
	}

	public void setCreatecopy(String createcopy) {
		this.createcopy = createcopy;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getFootermargin() {
		return this.footermargin;
	}

	public void setFootermargin(Long footermargin) {
		this.footermargin = footermargin;
	}

	public Long getHeadermargin() {
		return this.headermargin;
	}

	public void setHeadermargin(Long headermargin) {
		this.headermargin = headermargin;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	public String getIsform() {
		return this.isform;
	}

	public void setIsform(String isform) {
		this.isform = isform;
	}

	public String getIsstandardheaderfooter() {
		return this.isstandardheaderfooter;
	}

	public void setIsstandardheaderfooter(String isstandardheaderfooter) {
		this.isstandardheaderfooter = isstandardheaderfooter;
	}

	public String getIstablebased() {
		return this.istablebased;
	}

	public void setIstablebased(String istablebased) {
		this.istablebased = istablebased;
	}

	@Column(name = "JASPERPROCESS_ID")
	public Long getJasperprocessId() {
		return this.jasperprocessId;
	}

	public void setJasperprocessId(Long jasperprocessId) {
		this.jasperprocessId = jasperprocessId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrintername() {
		return this.printername;
	}

	public void setPrintername(String printername) {
		this.printername = printername;
	}

	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Long getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}

	// bi-directional many-to-one association to AdPrintformatitem
	@OneToMany(mappedBy = "adPrintformat")
	public List<AdPrintformatitem> getAdPrintformatitems() {
		return this.adPrintformatitems;
	}

	public void setAdPrintformatitems(List<AdPrintformatitem> adPrintformatitems) {
		this.adPrintformatitems = adPrintformatitems;
	}

	public AdPrintformatitem addAdPrintformatitem(AdPrintformatitem adPrintformatitem) {
		getAdPrintformatitems().add(adPrintformatitem);
		adPrintformatitem.setAdPrintformat(this);

		return adPrintformatitem;
	}

	public AdPrintformatitem removeAdPrintformatitem(AdPrintformatitem adPrintformatitem) {
		getAdPrintformatitems().remove(adPrintformatitem);
		adPrintformatitem.setAdPrintformat(null);

		return adPrintformatitem;
	}

	public int getItemCount() {
		if (null != adPrintformatitems) {
			return adPrintformatitems.size();
		}
		return 0;
	}

	public AdPrintformatitem getItem(int col) {
		if (null != adPrintformatitems) {
			return adPrintformatitems.get(col);
		}
		return null;
	}

	public Language getLanguage() {
		// TODO Auto-generated method stub
		return null;
	}

	public AdPrinttableformat getTableFormat() {
		// TODO Auto-generated method stub
		return null;
	}

}