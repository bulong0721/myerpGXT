package org.adempiere.model.core;

import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.adempiere.model.common.AdEntityBase;

/**
 * The persistent class for the ad_printtableformat database table.
 * 
 */
@Entity
@Table(name = "ad_printtableformat")
public class AdPrinttableformat extends AdEntityBase implements Serializable {
	private static final long		serialVersionUID	= 1L;
	private static final BigDecimal	ZERO				= new BigDecimal(0);
	private long					adPrinttableformatId;
	private Long					adClientId;
	private Long					adImageId;
	private Long					adOrgId;
	private String					created;
	private Long					createdby;
	private String					description;
	private String					footercenter;
	private String					footerleft;
	private String					footerright;
	private Long					functPrintfontId;
	private Long					functbgPrintcolorId;
	private Long					functfgPrintcolorId;
	private Long					hdrPrintfontId;
	private Long					hdrlinePrintcolorId;
	private Long					hdrstroke;
	private String					hdrstroketype;
	private Long					hdrtextbgPrintcolorId;
	private Long					hdrtextfgPrintcolorId;
	private String					headercenter;
	private String					headerleft;
	private String					headerright;
	private String					imageisattached;
	private String					imageurl;
	private String					isactive;
	private String					isdefault;
	private String					ismultilineheader;
	private String					ispaintboundarylines;
	private String					ispaintheaderlines;
	private String					ispainthlines;
	private String					ispaintvlines;
	private String					isprintfunctionsymbols;
	private Long					linePrintcolorId;
	private BigDecimal				linestroke;
	private String					linestroketype;
	private String					name;
	private String					updated;
	private Long					updatedby;

	public AdPrinttableformat() {
	}

	@Id
	@Column(name = "AD_PRINTTABLEFORMAT_ID")
	public long getAdPrinttableformatId() {
		return this.adPrinttableformatId;
	}

	public void setAdPrinttableformatId(long adPrinttableformatId) {
		this.adPrinttableformatId = adPrinttableformatId;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_IMAGE_ID")
	public Long getAdImageId() {
		return this.adImageId;
	}

	public void setAdImageId(Long adImageId) {
		this.adImageId = adImageId;
	}

	@Column(name = "AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
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

	public String getFootercenter() {
		return this.footercenter;
	}

	public void setFootercenter(String footercenter) {
		this.footercenter = footercenter;
	}

	public String getFooterleft() {
		return this.footerleft;
	}

	public void setFooterleft(String footerleft) {
		this.footerleft = footerleft;
	}

	public String getFooterright() {
		return this.footerright;
	}

	public void setFooterright(String footerright) {
		this.footerright = footerright;
	}

	@Column(name = "FUNCT_PRINTFONT_ID")
	public Long getFunctPrintfontId() {
		return this.functPrintfontId;
	}

	public void setFunctPrintfontId(Long functPrintfontId) {
		this.functPrintfontId = functPrintfontId;
	}

	@Column(name = "FUNCTBG_PRINTCOLOR_ID")
	public Long getFunctbgPrintcolorId() {
		return this.functbgPrintcolorId;
	}

	public void setFunctbgPrintcolorId(Long functbgPrintcolorId) {
		this.functbgPrintcolorId = functbgPrintcolorId;
	}

	@Column(name = "FUNCTFG_PRINTCOLOR_ID")
	public Long getFunctfgPrintcolorId() {
		return this.functfgPrintcolorId;
	}

	public void setFunctfgPrintcolorId(Long functfgPrintcolorId) {
		this.functfgPrintcolorId = functfgPrintcolorId;
	}

	@Column(name = "HDR_PRINTFONT_ID")
	public Long getHdrPrintfontId() {
		return this.hdrPrintfontId;
	}

	public void setHdrPrintfontId(Long hdrPrintfontId) {
		this.hdrPrintfontId = hdrPrintfontId;
	}

	@Column(name = "HDRLINE_PRINTCOLOR_ID")
	public Long getHdrlinePrintcolorId() {
		return this.hdrlinePrintcolorId;
	}

	public void setHdrlinePrintcolorId(Long hdrlinePrintcolorId) {
		this.hdrlinePrintcolorId = hdrlinePrintcolorId;
	}

	public Long getHdrstroke() {
		return this.hdrstroke;
	}

	public void setHdrstroke(Long hdrstroke) {
		this.hdrstroke = hdrstroke;
	}

	public String getHdrstroketype() {
		return this.hdrstroketype;
	}

	public void setHdrstroketype(String hdrstroketype) {
		this.hdrstroketype = hdrstroketype;
	}

	@Column(name = "HDRTEXTBG_PRINTCOLOR_ID")
	public Long getHdrtextbgPrintcolorId() {
		return this.hdrtextbgPrintcolorId;
	}

	public void setHdrtextbgPrintcolorId(Long hdrtextbgPrintcolorId) {
		this.hdrtextbgPrintcolorId = hdrtextbgPrintcolorId;
	}

	@Column(name = "HDRTEXTFG_PRINTCOLOR_ID")
	public Long getHdrtextfgPrintcolorId() {
		return this.hdrtextfgPrintcolorId;
	}

	public void setHdrtextfgPrintcolorId(Long hdrtextfgPrintcolorId) {
		this.hdrtextfgPrintcolorId = hdrtextfgPrintcolorId;
	}

	public String getHeadercenter() {
		return this.headercenter;
	}

	public void setHeadercenter(String headercenter) {
		this.headercenter = headercenter;
	}

	public String getHeaderleft() {
		return this.headerleft;
	}

	public void setHeaderleft(String headerleft) {
		this.headerleft = headerleft;
	}

	public String getHeaderright() {
		return this.headerright;
	}

	public void setHeaderright(String headerright) {
		this.headerright = headerright;
	}

	public String getImageisattached() {
		return this.imageisattached;
	}

	public void setImageisattached(String imageisattached) {
		this.imageisattached = imageisattached;
	}

	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
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

	public String getIsmultilineheader() {
		return this.ismultilineheader;
	}

	public void setIsmultilineheader(String ismultilineheader) {
		this.ismultilineheader = ismultilineheader;
	}

	public String getIspaintboundarylines() {
		return this.ispaintboundarylines;
	}

	public void setIspaintboundarylines(String ispaintboundarylines) {
		this.ispaintboundarylines = ispaintboundarylines;
	}

	public String getIspaintheaderlines() {
		return this.ispaintheaderlines;
	}

	public void setIspaintheaderlines(String ispaintheaderlines) {
		this.ispaintheaderlines = ispaintheaderlines;
	}

	public String getIspainthlines() {
		return this.ispainthlines;
	}

	public void setIspainthlines(String ispainthlines) {
		this.ispainthlines = ispainthlines;
	}

	public String getIspaintvlines() {
		return this.ispaintvlines;
	}

	public void setIspaintvlines(String ispaintvlines) {
		this.ispaintvlines = ispaintvlines;
	}

	public String getIsprintfunctionsymbols() {
		return this.isprintfunctionsymbols;
	}

	public void setIsprintfunctionsymbols(String isprintfunctionsymbols) {
		this.isprintfunctionsymbols = isprintfunctionsymbols;
	}

	@Column(name = "LINE_PRINTCOLOR_ID")
	public Long getLinePrintcolorId() {
		return this.linePrintcolorId;
	}

	public void setLinePrintcolorId(Long linePrintcolorId) {
		this.linePrintcolorId = linePrintcolorId;
	}

	public BigDecimal getLinestroke() {
		return this.linestroke;
	}

	public void setLinestroke(BigDecimal linestroke) {
		this.linestroke = linestroke;
	}

	public String getLinestroketype() {
		return this.linestroketype;
	}

	public void setLinestroketype(String linestroketype) {
		this.linestroketype = linestroketype;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Font getParameter_Font() {
		// TODO Auto-generated method stub
		return null;
	}

	public Font getPageHeader_Font() {
		// TODO Auto-generated method stub
		return null;
	}

	public Paint getPageHeaderFG_Color() {
		// TODO Auto-generated method stub
		return null;
	}

	public Paint getParameter_Color() {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal getVLineStroke() {
		BigDecimal retValue = this.getLinestroke();
		if (retValue == null || ZERO.compareTo(retValue) <= 0)
			retValue = new BigDecimal(1.0);
		return retValue;
	} // getVLineStroke

	public Paint getVLine_Color() {
		// TODO Auto-generated method stub
		return null;
	}

	public Stroke getVLine_Stroke() {
		// TODO Auto-generated method stub
		return null;
	}

	public Paint getHeaderLine_Color() {
		// TODO Auto-generated method stub
		return null;
	}

	public Stroke getHeader_Stroke() {
		// TODO Auto-generated method stub
		return null;
	}

	public Stroke getHLine_Stroke() {
		// TODO Auto-generated method stub
		return null;
	}

	public Color getFunctFG_Color() {
		// TODO Auto-generated method stub
		return null;
	}

	public Paint getHLine_Color() {
		// TODO Auto-generated method stub
		return null;
	}

	public Color getHeaderBG_Color() {
		// TODO Auto-generated method stub
		return null;
	}

	public Color getHeaderFG_Color() {
		// TODO Auto-generated method stub
		return null;
	}

	public Font getHeader_Font() {
		// TODO Auto-generated method stub
		return null;
	}

	public Font getFunct_Font() {
		// TODO Auto-generated method stub
		return null;
	}

	public Color getFunctBG_Color() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setStandard_Font(Font font) {
		// TODO Auto-generated method stub
		
	}

}