package org.adempiere.model;

import java.math.*;

import javax.persistence.*;

import org.adempiere.common.DisplayType;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_column")
public class ADColumn extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDColumnID;
	private Integer aDElementID;
	private Integer aDOrgID;
	private Integer aDProcessID;
	private Integer aDReferenceID;
	private Integer aDReferenceValueID;
	private Integer aDTableID;
	private Integer aDValRuleID;
	private Boolean active;
	private Boolean allowLogging;
	private Boolean alwaysUpdateable;
	private Boolean autocomplete;
	private String callout;
	private String columnName;
	private String columnSQL;
	private String created;
	private Integer createdBy;
	private String defaultValue;
	private String description;
	private Boolean encrypted;
	private String entityType;
	private Integer fieldLength;
	private String formatPattern;
	private String help;
	private Boolean identifier;
	private String infoFactoryClass;
	private Boolean key;
	private Boolean mandatory;
	private String mandatoryLogic;
	private String name;
	private Boolean parent;
	private String propertyName;
	private String readOnlyLogic;
	private Boolean selectionColumn;
	private Integer seqNo;
	private Boolean syncDatabase;
	private Boolean translated;
	private Boolean updateable;
	private String updated;
	private Integer updatedBy;
	private String vFormat;
	private String valueMax;
	private String valueMin;
	private BigDecimal version;

	public ADColumn() {
	}

	public ADColumn(Integer aDColumnID) {
		this.aDColumnID = aDColumnID;
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
	@Column(name="AD_COLUMN_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_3", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_Column", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_3")
	public Integer getADColumnID() {
		return aDColumnID;
	}

	public void setADColumnID(Integer aDColumnID) {
		this.aDColumnID = aDColumnID;
	}

	@Basic
	@Column(name="AD_ELEMENT_ID", columnDefinition="INT")
	public Integer getADElementID() {
		return aDElementID;
	}

	public void setADElementID(Integer aDElementID) {
		this.aDElementID = aDElementID;
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
	@Column(name="AD_PROCESS_ID", columnDefinition="INT")
	public Integer getADProcessID() {
		return aDProcessID;
	}

	public void setADProcessID(Integer aDProcessID) {
		this.aDProcessID = aDProcessID;
	}

	@Basic
	@Column(name="AD_REFERENCE_ID", columnDefinition="INT", nullable=false)
	public Integer getADReferenceID() {
		return aDReferenceID;
	}

	public void setADReferenceID(Integer aDReferenceID) {
		this.aDReferenceID = aDReferenceID;
	}

	@Basic
	@Column(name="AD_REFERENCE_VALUE_ID", columnDefinition="INT")
	public Integer getADReferenceValueID() {
		return aDReferenceValueID;
	}

	public void setADReferenceValueID(Integer aDReferenceValueID) {
		this.aDReferenceValueID = aDReferenceValueID;
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
	@Column(name="AD_VAL_RULE_ID", columnDefinition="INT")
	public Integer getADValRuleID() {
		return aDValRuleID;
	}

	public void setADValRuleID(Integer aDValRuleID) {
		this.aDValRuleID = aDValRuleID;
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
	@Column(name="ISALLOWLOGGING")
	public Boolean isAllowLogging() {
		return allowLogging;
	}

	public void setAllowLogging(Boolean allowLogging) {
		this.allowLogging = allowLogging;
	}

	@Basic
	@Column(name="ISALWAYSUPDATEABLE", nullable=false)
	public Boolean isAlwaysUpdateable() {
		return alwaysUpdateable;
	}

	public void setAlwaysUpdateable(Boolean alwaysUpdateable) {
		this.alwaysUpdateable = alwaysUpdateable;
	}

	@Basic
	@Column(name="ISAUTOCOMPLETE", nullable=false)
	public Boolean isAutocomplete() {
		return autocomplete;
	}

	public void setAutocomplete(Boolean autocomplete) {
		this.autocomplete = autocomplete;
	}

	@Basic
	public String getCallout() {
		return callout;
	}

	public void setCallout(String callout) {
		this.callout = callout;
	}

	@Basic
	@Column(nullable=false, length=30)
	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Basic
	@Column(length=2000)
	public String getColumnSQL() {
		return columnSQL;
	}

	public void setColumnSQL(String columnSQL) {
		this.columnSQL = columnSQL;
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
	@Column(length=2000)
	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="ISENCRYPTED", nullable=false)
	public Boolean isEncrypted() {
		return encrypted;
	}

	public void setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
	}

	@Basic
	@Column(nullable=false, length=40)
	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getFieldLength() {
		return fieldLength;
	}

	public void setFieldLength(Integer fieldLength) {
		this.fieldLength = fieldLength;
	}

	@Basic
	@Column(length=22)
	public String getFormatPattern() {
		return formatPattern;
	}

	public void setFormatPattern(String formatPattern) {
		this.formatPattern = formatPattern;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Basic
	@Column(name="ISIDENTIFIER", nullable=false)
	public Boolean isIdentifier() {
		return identifier;
	}

	public void setIdentifier(Boolean identifier) {
		this.identifier = identifier;
	}

	@Basic
	public String getInfoFactoryClass() {
		return infoFactoryClass;
	}

	public void setInfoFactoryClass(String infoFactoryClass) {
		this.infoFactoryClass = infoFactoryClass;
	}

	@Basic
	@Column(name="ISKEY", nullable=false)
	public Boolean isKey() {
		return key;
	}

	public void setKey(Boolean key) {
		this.key = key;
	}

	@Basic
	@Column(name="ISMANDATORY", nullable=false)
	public Boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(Boolean mandatory) {
		this.mandatory = mandatory;
	}

	@Basic
	@Column(length=2000)
	public String getMandatoryLogic() {
		return mandatoryLogic;
	}

	public void setMandatoryLogic(String mandatoryLogic) {
		this.mandatoryLogic = mandatoryLogic;
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
	@Column(name="ISPARENT", nullable=false)
	public Boolean isParent() {
		return parent;
	}

	public void setParent(Boolean parent) {
		this.parent = parent;
	}

	@Basic
	@Column(nullable=false, length=30)
	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	@Basic
	@Column(length=2000)
	public String getReadOnlyLogic() {
		return readOnlyLogic;
	}

	public void setReadOnlyLogic(String readOnlyLogic) {
		this.readOnlyLogic = readOnlyLogic;
	}

	@Basic
	@Column(name="ISSELECTIONCOLUMN", nullable=false)
	public Boolean isSelectionColumn() {
		return selectionColumn;
	}

	public void setSelectionColumn(Boolean selectionColumn) {
		this.selectionColumn = selectionColumn;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	@Basic
	@Column(name="ISSYNCDATABASE")
	public Boolean isSyncDatabase() {
		return syncDatabase;
	}

	public void setSyncDatabase(Boolean syncDatabase) {
		this.syncDatabase = syncDatabase;
	}

	@Basic
	@Column(name="ISTRANSLATED", nullable=false)
	public Boolean isTranslated() {
		return translated;
	}

	public void setTranslated(Boolean translated) {
		this.translated = translated;
	}

	@Basic
	@Column(name="ISUPDATEABLE", nullable=false)
	public Boolean isUpdateable() {
		return updateable;
	}

	public void setUpdateable(Boolean updateable) {
		this.updateable = updateable;
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
	@Column(length=60)
	public String getVFormat() {
		return vFormat;
	}

	public void setVFormat(String vFormat) {
		this.vFormat = vFormat;
	}

	@Basic
	@Column(length=20)
	public String getValueMax() {
		return valueMax;
	}

	public void setValueMax(String valueMax) {
		this.valueMax = valueMax;
	}

	@Basic
	@Column(length=20)
	public String getValueMin() {
		return valueMin;
	}

	public void setValueMin(String valueMin) {
		this.valueMin = valueMin;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public void setADReferenceID(DisplayType type) {
		setADReferenceID(type.getValue());
	}
}