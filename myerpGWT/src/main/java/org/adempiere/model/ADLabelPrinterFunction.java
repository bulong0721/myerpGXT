package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_labelprinterfunction")
public class ADLabelPrinterFunction extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDLabelPrinterFunctionID;
	private Integer aDLabelPrinterID;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String description;
	private String functionPrefix;
	private String functionSuffix;
	private String name;
	private String updated;
	private Integer updatedBy;
	private Boolean xYPosition;
	private String xYSeparator;

	public ADLabelPrinterFunction() {
	}

	public ADLabelPrinterFunction(Integer aDLabelPrinterFunctionID) {
		this.aDLabelPrinterFunctionID = aDLabelPrinterFunctionID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Id
	@Column(name="AD_LABELPRINTERFUNCTION_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_793", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_LabelPrinterFunction", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_793")
	public Integer getADLabelPrinterFunctionID() {
		return aDLabelPrinterFunctionID;
	}

	public void setADLabelPrinterFunctionID(Integer aDLabelPrinterFunctionID) {
		this.aDLabelPrinterFunctionID = aDLabelPrinterFunctionID;
	}

	@Basic
	@Column(name="AD_LABELPRINTER_ID", columnDefinition="INT", nullable=false)
	public Integer getADLabelPrinterID() {
		return aDLabelPrinterID;
	}

	public void setADLabelPrinterID(Integer aDLabelPrinterID) {
		this.aDLabelPrinterID = aDLabelPrinterID;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=40)
	public String getFunctionPrefix() {
		return functionPrefix;
	}

	public void setFunctionPrefix(String functionPrefix) {
		this.functionPrefix = functionPrefix;
	}

	@Basic
	@Column(length=40)
	public String getFunctionSuffix() {
		return functionSuffix;
	}

	public void setFunctionSuffix(String functionSuffix) {
		this.functionSuffix = functionSuffix;
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
	@Column(name="ISXYPOSITION", nullable=false)
	public Boolean isXYPosition() {
		return xYPosition;
	}

	public void setXYPosition(Boolean xYPosition) {
		this.xYPosition = xYPosition;
	}

	@Basic
	@Column(length=20)
	public String getXYSeparator() {
		return xYSeparator;
	}

	public void setXYSeparator(String xYSeparator) {
		this.xYSeparator = xYSeparator;
	}
}