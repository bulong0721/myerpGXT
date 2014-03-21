package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_printlabelline")
public class ADPrintLabelLine extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDColumnID;
	private Integer aDLabelPrinterFunctionID;
	private Integer aDOrgID;
	private Integer aDPrintLabelID;
	private Integer aDPrintLabelLineID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String labelFormatType;
	private String name;
	private String printName;
	private Integer seqNo;
	private String updated;
	private Integer updatedBy;
	private Integer xPosition;
	private Integer yPosition;

	public ADPrintLabelLine() {
	}

	public ADPrintLabelLine(Integer aDPrintLabelLineID) {
		this.aDPrintLabelLineID = aDPrintLabelLineID;
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
	@Column(name="AD_LABELPRINTERFUNCTION_ID", columnDefinition="INT", nullable=false)
	public Integer getADLabelPrinterFunctionID() {
		return aDLabelPrinterFunctionID;
	}

	public void setADLabelPrinterFunctionID(Integer aDLabelPrinterFunctionID) {
		this.aDLabelPrinterFunctionID = aDLabelPrinterFunctionID;
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
	@Column(name="AD_PRINTLABEL_ID", columnDefinition="INT", nullable=false)
	public Integer getADPrintLabelID() {
		return aDPrintLabelID;
	}

	public void setADPrintLabelID(Integer aDPrintLabelID) {
		this.aDPrintLabelID = aDPrintLabelID;
	}

	@Id
	@Column(name="AD_PRINTLABELLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_724", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_PrintLabelLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_724")
	public Integer getADPrintLabelLineID() {
		return aDPrintLabelLineID;
	}

	public void setADPrintLabelLineID(Integer aDPrintLabelLineID) {
		this.aDPrintLabelLineID = aDPrintLabelLineID;
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
	@Column(nullable=false, length=1)
	public String getLabelFormatType() {
		return labelFormatType;
	}

	public void setLabelFormatType(String labelFormatType) {
		this.labelFormatType = labelFormatType;
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
	@Column(length=60)
	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
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

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getXPosition() {
		return xPosition;
	}

	public void setXPosition(Integer xPosition) {
		this.xPosition = xPosition;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getYPosition() {
		return yPosition;
	}

	public void setYPosition(Integer yPosition) {
		this.yPosition = yPosition;
	}
}