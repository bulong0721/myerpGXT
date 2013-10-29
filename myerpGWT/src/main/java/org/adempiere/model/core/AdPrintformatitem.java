package org.adempiere.model.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.adempiere.model.common.AdEntityBase;

/**
 * The persistent class for the ad_printformatitem database table.
 * 
 */
@Entity
@Table(name = "ad_printformatitem")
public class AdPrintformatitem extends AdEntityBase implements Serializable {
	/** FieldAlignmentType AD_Reference_ID=253 */
	public static final int FIELDALIGNMENTTYPE_AD_Reference_ID=253;
	/** Default = D */
	public static final String FIELDALIGNMENTTYPE_Default = "D";
	/** Leading (left) = L */
	public static final String FIELDALIGNMENTTYPE_LeadingLeft = "L";
	/** Trailing (right) = T */
	public static final String FIELDALIGNMENTTYPE_TrailingRight = "T";
	/** Block = B */
	public static final String FIELDALIGNMENTTYPE_Block = "B";
	/** Center = C */
	public static final String FIELDALIGNMENTTYPE_Center = "C";
	/** BarcodeType AD_Reference_ID=377 */
	public static final int BARCODETYPE_AD_Reference_ID=377;
	/** Codabar 2 of 7 linear = 2o9 */
	public static final String BARCODETYPE_Codabar2Of7Linear = "2o9";
	/** Code 39  3 of 9 linear w/o Checksum = 3o9 */
	public static final String BARCODETYPE_Code393Of9LinearWOChecksum = "3o9";
	/** Codeabar linear = COD */
	public static final String BARCODETYPE_CodeabarLinear = "COD";
	/** Code 128 dynamically switching = C28 */
	public static final String BARCODETYPE_Code128DynamicallySwitching = "C28";
	/** Code 128 A character set = 28A */
	public static final String BARCODETYPE_Code128ACharacterSet = "28A";
	/** Code 128 B character set = 28B */
	public static final String BARCODETYPE_Code128BCharacterSet = "28B";
	/** Code 128 C character set = 28C */
	public static final String BARCODETYPE_Code128CCharacterSet = "28C";
	/** Code 39 linear with Checksum = C39 */
	public static final String BARCODETYPE_Code39LinearWithChecksum = "C39";
	/** EAN 128 = E28 */
	public static final String BARCODETYPE_EAN128 = "E28";
	/** Global Trade Item No GTIN UCC/EAN 128 = GTN */
	public static final String BARCODETYPE_GlobalTradeItemNoGTINUCCEAN128 = "GTN";
	/** Codabar Monarch linear = MON */
	public static final String BARCODETYPE_CodabarMonarchLinear = "MON";
	/** Codabar NW-7 linear = NW7 */
	public static final String BARCODETYPE_CodabarNW_7Linear = "NW7";
	/** PDF417 two dimensional = 417 */
	public static final String BARCODETYPE_PDF417TwoDimensional = "417";
	/** SCC-14 shipping code UCC/EAN 128 = C14 */
	public static final String BARCODETYPE_SCC_14ShippingCodeUCCEAN128 = "C14";
	/** Shipment ID number UCC/EAN 128 = SID */
	public static final String BARCODETYPE_ShipmentIDNumberUCCEAN128 = "SID";
	/** UCC 128 = U28 */
	public static final String BARCODETYPE_UCC128 = "U28";
	/** Code 39 USD3 with Checksum = US3 */
	public static final String BARCODETYPE_Code39USD3WithChecksum = "US3";
	/** Codabar USD-4 linear = US4 */
	public static final String BARCODETYPE_CodabarUSD_4Linear = "US4";
	/** US Postal Service UCC/EAN 128 = USP */
	public static final String BARCODETYPE_USPostalServiceUCCEAN128 = "USP";
	/** SSCC-18 number UCC/EAN 128 = C18 */
	public static final String BARCODETYPE_SSCC_18NumberUCCEAN128 = "C18";
	/** Code 39 USD3 w/o Checksum = us3 */
	public static final String BARCODETYPE_Code39USD3WOChecksum = "us3";
	/** Code 39  3 of 9 linear with Checksum = 3O9 */
	public static final String BARCODETYPE_Code393Of9LinearWithChecksum = "3O9";
	/** Code 39 linear w/o Checksum = c39 */
	public static final String BARCODETYPE_Code39LinearWOChecksum = "c39";
	/** EAN 13 = E13 */
	public static final String BARCODETYPE_EAN13 = "E13";
	/** ShapeType AD_Reference_ID=333 */
	public static final int SHAPETYPE_AD_Reference_ID=333;
	/** 3D Rectangle = 3 */
	public static final String SHAPETYPE_3DRectangle = "3";
	/** Oval = O */
	public static final String SHAPETYPE_Oval = "O";
	/** Round Rectangle = R */
	public static final String SHAPETYPE_RoundRectangle = "R";
	/** Normal Rectangle = N */
	public static final String SHAPETYPE_NormalRectangle = "N";
	/** PrintFormatType AD_Reference_ID=255 */
	public static final int PRINTFORMATTYPE_AD_Reference_ID=255;
	/** Field = F */
	public static final String PRINTFORMATTYPE_Field = "F";
	/** Text = T */
	public static final String PRINTFORMATTYPE_Text = "T";
	/** Print Format = P */
	public static final String PRINTFORMATTYPE_PrintFormat = "P";
	/** Image = I */
	public static final String PRINTFORMATTYPE_Image = "I";
	/** Rectangle = R */
	public static final String PRINTFORMATTYPE_Rectangle = "R";
	/** Line = L */
	public static final String PRINTFORMATTYPE_Line = "L";
	
	private static final long	serialVersionUID	= 1L;
	private long				adPrintformatitemId;
	private Long				adClientId;
	private Long				adColumnId;
	private Long				adOrgId;
	private Long				adPrintcolorId;
	private Long				adPrintfontId;
	private Long				adPrintformatchildId;
	private Long				adPrintgraphId;
	private Integer				arcdiameter;
	private String				barcodetype;
	private Long				belowcolumn;
	private String				created;
	private Long				createdby;
	private String				fieldalignmenttype;
	private String				formatpattern;
	private String				imageisattached;
	private String				imageurl;
	private String				isactive;
	private String				isaveraged;
	private String				iscentrallymaintained;
	private String				iscounted;
	private String				isdeviationcalc;
	private String				isfilledrectangle;
	private String				isfixedwidth;
	private String				isgroupby;
	private String				isheightoneline;
	private String				isimagefield;
	private String				ismaxcalc;
	private String				ismincalc;
	private String				isnextline;
	private String				isnextpage;
	private String				isorderby;
	private String				ispagebreak;
	private String				isprinted;
	private String				isrelativeposition;
	private String				isrunningtotal;
	private String				issetnlposition;
	private String				issummarized;
	private String				issuppressnull;
	private String				issuppressrepeats;
	private String				isvariancecalc;
	private String				linealignmenttype;
	private Integer				linewidth;
	private Integer				maxheight;
	private Integer				maxwidth;
	private String				name;
	private String				printareatype;
	private String				printformattype;
	private String				printname;
	private String				printnamesuffix;
	private Integer				runningtotallines;
	private Integer				seqno;
	private String				shapetype;
	private Integer				sortno;
	private String				updated;
	private Long				updatedby;
	private Integer				xposition;
	private Integer				xspace;
	private Integer				yposition;
	private Integer				yspace;
	private AdPrintformat		adPrintformat;

	public AdPrintformatitem() {
	}

	@Id
	@Column(name = "AD_PRINTFORMATITEM_ID")
	public long getAdPrintformatitemId() {
		return this.adPrintformatitemId;
	}

	public void setAdPrintformatitemId(long adPrintformatitemId) {
		this.adPrintformatitemId = adPrintformatitemId;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_COLUMN_ID")
	public Long getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(Long adColumnId) {
		this.adColumnId = adColumnId;
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

	@Column(name = "AD_PRINTFORMATCHILD_ID")
	public Long getAdPrintformatchildId() {
		return this.adPrintformatchildId;
	}

	public void setAdPrintformatchildId(Long adPrintformatchildId) {
		this.adPrintformatchildId = adPrintformatchildId;
	}

	@Column(name = "AD_PRINTGRAPH_ID")
	public Long getAdPrintgraphId() {
		return this.adPrintgraphId;
	}

	public void setAdPrintgraphId(Long adPrintgraphId) {
		this.adPrintgraphId = adPrintgraphId;
	}

	public Integer getArcdiameter() {
		return this.arcdiameter;
	}

	public void setArcdiameter(Integer arcdiameter) {
		this.arcdiameter = arcdiameter;
	}

	public String getBarcodetype() {
		return this.barcodetype;
	}

	public void setBarcodetype(String barcodetype) {
		this.barcodetype = barcodetype;
	}

	public Long getBelowcolumn() {
		return this.belowcolumn;
	}

	public void setBelowcolumn(Long belowcolumn) {
		this.belowcolumn = belowcolumn;
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

	public String getFieldalignmenttype() {
		return this.fieldalignmenttype;
	}

	public void setFieldalignmenttype(String fieldalignmenttype) {
		this.fieldalignmenttype = fieldalignmenttype;
	}

	public String getFormatpattern() {
		return this.formatpattern;
	}

	public void setFormatpattern(String formatpattern) {
		this.formatpattern = formatpattern;
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

	public String getIsaveraged() {
		return this.isaveraged;
	}

	public void setIsaveraged(String isaveraged) {
		this.isaveraged = isaveraged;
	}

	public String getIscentrallymaintained() {
		return this.iscentrallymaintained;
	}

	public void setIscentrallymaintained(String iscentrallymaintained) {
		this.iscentrallymaintained = iscentrallymaintained;
	}

	public String getIscounted() {
		return this.iscounted;
	}

	public void setIscounted(String iscounted) {
		this.iscounted = iscounted;
	}

	public String getIsdeviationcalc() {
		return this.isdeviationcalc;
	}

	public void setIsdeviationcalc(String isdeviationcalc) {
		this.isdeviationcalc = isdeviationcalc;
	}

	public String getIsfilledrectangle() {
		return this.isfilledrectangle;
	}

	public void setIsfilledrectangle(String isfilledrectangle) {
		this.isfilledrectangle = isfilledrectangle;
	}

	public String getIsfixedwidth() {
		return this.isfixedwidth;
	}

	public void setIsfixedwidth(String isfixedwidth) {
		this.isfixedwidth = isfixedwidth;
	}

	public String getIsgroupby() {
		return this.isgroupby;
	}

	public void setIsgroupby(String isgroupby) {
		this.isgroupby = isgroupby;
	}

	public String getIsheightoneline() {
		return this.isheightoneline;
	}

	public void setIsheightoneline(String isheightoneline) {
		this.isheightoneline = isheightoneline;
	}

	public String getIsimagefield() {
		return this.isimagefield;
	}

	public void setIsimagefield(String isimagefield) {
		this.isimagefield = isimagefield;
	}

	public String getIsmaxcalc() {
		return this.ismaxcalc;
	}

	public void setIsmaxcalc(String ismaxcalc) {
		this.ismaxcalc = ismaxcalc;
	}

	public String getIsmincalc() {
		return this.ismincalc;
	}

	public void setIsmincalc(String ismincalc) {
		this.ismincalc = ismincalc;
	}

	public String getIsnextline() {
		return this.isnextline;
	}

	public void setIsnextline(String isnextline) {
		this.isnextline = isnextline;
	}

	public String getIsnextpage() {
		return this.isnextpage;
	}

	public void setIsnextpage(String isnextpage) {
		this.isnextpage = isnextpage;
	}

	public String getIsorderby() {
		return this.isorderby;
	}

	public void setIsorderby(String isorderby) {
		this.isorderby = isorderby;
	}

	public String getIspagebreak() {
		return this.ispagebreak;
	}

	public void setIspagebreak(String ispagebreak) {
		this.ispagebreak = ispagebreak;
	}

	public String getIsprinted() {
		return this.isprinted;
	}

	public void setIsprinted(String isprinted) {
		this.isprinted = isprinted;
	}

	public String getIsrelativeposition() {
		return this.isrelativeposition;
	}

	public void setIsrelativeposition(String isrelativeposition) {
		this.isrelativeposition = isrelativeposition;
	}

	public String getIsrunningtotal() {
		return this.isrunningtotal;
	}

	public void setIsrunningtotal(String isrunningtotal) {
		this.isrunningtotal = isrunningtotal;
	}

	public String getIssetnlposition() {
		return this.issetnlposition;
	}

	public void setIssetnlposition(String issetnlposition) {
		this.issetnlposition = issetnlposition;
	}

	public String getIssummarized() {
		return this.issummarized;
	}

	public void setIssummarized(String issummarized) {
		this.issummarized = issummarized;
	}

	public String getIssuppressnull() {
		return this.issuppressnull;
	}

	public void setIssuppressnull(String issuppressnull) {
		this.issuppressnull = issuppressnull;
	}

	public String getIssuppressrepeats() {
		return this.issuppressrepeats;
	}

	public void setIssuppressrepeats(String issuppressrepeats) {
		this.issuppressrepeats = issuppressrepeats;
	}

	public String getIsvariancecalc() {
		return this.isvariancecalc;
	}

	public void setIsvariancecalc(String isvariancecalc) {
		this.isvariancecalc = isvariancecalc;
	}

	public String getLinealignmenttype() {
		return this.linealignmenttype;
	}

	public void setLinealignmenttype(String linealignmenttype) {
		this.linealignmenttype = linealignmenttype;
	}

	public Integer getLinewidth() {
		return this.linewidth;
	}

	public void setLinewidth(Integer linewidth) {
		this.linewidth = linewidth;
	}

	public Integer getMaxheight() {
		return this.maxheight;
	}

	public void setMaxheight(Integer maxheight) {
		this.maxheight = maxheight;
	}

	public Integer getMaxwidth() {
		return this.maxwidth;
	}

	public void setMaxwidth(Integer maxwidth) {
		this.maxwidth = maxwidth;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrintareatype() {
		return this.printareatype;
	}

	public void setPrintareatype(String printareatype) {
		this.printareatype = printareatype;
	}

	public String getPrintformattype() {
		return this.printformattype;
	}

	public void setPrintformattype(String printformattype) {
		this.printformattype = printformattype;
	}

	public String getPrintname() {
		return this.printname;
	}

	public void setPrintname(String printname) {
		this.printname = printname;
	}

	public String getPrintnamesuffix() {
		return this.printnamesuffix;
	}

	public void setPrintnamesuffix(String printnamesuffix) {
		this.printnamesuffix = printnamesuffix;
	}

	public Integer getRunningtotallines() {
		return this.runningtotallines;
	}

	public void setRunningtotallines(Integer runningtotallines) {
		this.runningtotallines = runningtotallines;
	}

	public Integer getSeqno() {
		return this.seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public String getShapetype() {
		return this.shapetype;
	}

	public void setShapetype(String shapetype) {
		this.shapetype = shapetype;
	}

	public Integer getSortno() {
		return this.sortno;
	}

	public void setSortno(Integer sortno) {
		this.sortno = sortno;
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

	public Integer getXposition() {
		return this.xposition;
	}

	public void setXposition(Integer xposition) {
		this.xposition = xposition;
	}

	public Integer getXspace() {
		return this.xspace;
	}

	public void setXspace(Integer xspace) {
		this.xspace = xspace;
	}

	public Integer getYposition() {
		return this.yposition;
	}

	public void setYposition(Integer yposition) {
		this.yposition = yposition;
	}

	public Integer getYspace() {
		return this.yspace;
	}

	public void setYspace(Integer yspace) {
		this.yspace = yspace;
	}

	// bi-directional many-to-one association to AdPrintformat
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AD_PRINTFORMAT_ID")
	public AdPrintformat getAdPrintformat() {
		return this.adPrintformat;
	}

	public void setAdPrintformat(AdPrintformat adPrintformat) {
		this.adPrintformat = adPrintformat;
	}

}