package org.adempiere.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.adempiere.common.ADEntityBase;

/**
 * The persistent class for the ad_field_v database table.
 * 
 */
@Entity
@Table(name = "ad_field_v")
public class AdFieldV extends ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer adColumnId;
	private Integer adFieldId;
	private Integer adProcessId;
	private Integer adReferenceId;
	private Integer adReferenceValueId;
	private Integer adTabId;
	private Integer adTableId;
	private Integer adValRuleId;
	private Integer adWindowId;
	private String callout;
	private String columnname;
	private String columnsql;
	private String defaultvalue;
	private String description;
	private Integer displaylength;
	private String displaylogic;
	private String fieldgroup;
	private String fieldgrouptype;
	private Integer fieldlength;
	private String help;
	private Integer includedTabId;
	private String infofactoryclass;
	private Boolean isalwaysupdateable;
	private Boolean isautocomplete;
	private Boolean iscollapsedbydefault;
	private Boolean isdisplayed;
	private Boolean isencryptedcolumn;
	private Boolean isencryptedfield;
	private Boolean isfieldonly;
	private Boolean isheading;
	private Boolean isidentifier;
	private Boolean iskey;
	private Boolean ismandatory;
	private Boolean isparent;
	private Boolean isreadonly;
	private Boolean issameline;
	private Boolean isselectioncolumn;
	private Boolean istranslated;
	private Boolean isupdateable;
	private String mandatorylogic;
	private String name;
	private String obscuretype;
	private String readonlylogic;
	private Integer seqno;
	private Integer sortno;
	private String tablename;
	private String validationcode;
	private String valuemax;
	private String valuemin;
	private String vformat;

	public AdFieldV() {
	}


	@Column(name="AD_COLUMN_ID")
	public Integer getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(Integer adColumnId) {
		this.adColumnId = adColumnId;
	}

	@Id
	@Column(name="AD_FIELD_ID")
	public Integer getAdFieldId() {
		return this.adFieldId;
	}

	public void setAdFieldId(Integer adFieldId) {
		this.adFieldId = adFieldId;
	}


	@Column(name="AD_PROCESS_ID")
	public Integer getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(Integer adProcessId) {
		this.adProcessId = adProcessId;
	}


	@Column(name="AD_REFERENCE_ID")
	public Integer getAdReferenceId() {
		return this.adReferenceId;
	}

	public void setAdReferenceId(Integer adReferenceId) {
		this.adReferenceId = adReferenceId;
	}


	@Column(name="AD_REFERENCE_VALUE_ID")
	public Integer getAdReferenceValueId() {
		return this.adReferenceValueId;
	}

	public void setAdReferenceValueId(Integer adReferenceValueId) {
		this.adReferenceValueId = adReferenceValueId;
	}


	@Column(name="AD_TAB_ID")
	public Integer getAdTabId() {
		return this.adTabId;
	}

	public void setAdTabId(Integer adTabId) {
		this.adTabId = adTabId;
	}


	@Column(name="AD_TABLE_ID")
	public Integer getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}


	@Column(name="AD_VAL_RULE_ID")
	public Integer getAdValRuleId() {
		return this.adValRuleId;
	}

	public void setAdValRuleId(Integer adValRuleId) {
		this.adValRuleId = adValRuleId;
	}


	@Column(name="AD_WINDOW_ID")
	public Integer getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(Integer adWindowId) {
		this.adWindowId = adWindowId;
	}


	public String getCallout() {
		return this.callout;
	}

	public void setCallout(String callout) {
		this.callout = callout;
	}


	public String getColumnname() {
		return this.columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}


	public String getColumnsql() {
		return this.columnsql;
	}

	public void setColumnsql(String columnsql) {
		this.columnsql = columnsql;
	}


	@Lob
	public String getDefaultvalue() {
		return this.defaultvalue;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getDisplaylength() {
		return this.displaylength;
	}

	public void setDisplaylength(Integer displaylength) {
		this.displaylength = displaylength;
	}


	public String getDisplaylogic() {
		return this.displaylogic;
	}

	public void setDisplaylogic(String displaylogic) {
		this.displaylogic = displaylogic;
	}


	public String getFieldgroup() {
		return this.fieldgroup;
	}

	public void setFieldgroup(String fieldgroup) {
		this.fieldgroup = fieldgroup;
	}


	public String getFieldgrouptype() {
		return this.fieldgrouptype;
	}

	public void setFieldgrouptype(String fieldgrouptype) {
		this.fieldgrouptype = fieldgrouptype;
	}


	public Integer getFieldlength() {
		return this.fieldlength;
	}

	public void setFieldlength(Integer fieldlength) {
		this.fieldlength = fieldlength;
	}


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	@Column(name="INCLUDED_TAB_ID")
	public Integer getIncludedTabId() {
		return this.includedTabId;
	}

	public void setIncludedTabId(Integer includedTabId) {
		this.includedTabId = includedTabId;
	}


	public String getInfofactoryclass() {
		return this.infofactoryclass;
	}

	public void setInfofactoryclass(String infofactoryclass) {
		this.infofactoryclass = infofactoryclass;
	}


	public Boolean getIsalwaysupdateable() {
		return this.isalwaysupdateable;
	}

	public void setIsalwaysupdateable(Boolean isalwaysupdateable) {
		this.isalwaysupdateable = isalwaysupdateable;
	}


	public Boolean getIsautocomplete() {
		return this.isautocomplete;
	}

	public void setIsautocomplete(Boolean isautocomplete) {
		this.isautocomplete = isautocomplete;
	}


	public Boolean getIscollapsedbydefault() {
		return this.iscollapsedbydefault;
	}

	public void setIscollapsedbydefault(Boolean iscollapsedbydefault) {
		this.iscollapsedbydefault = iscollapsedbydefault;
	}


	public Boolean getIsdisplayed() {
		return this.isdisplayed;
	}

	public void setIsdisplayed(Boolean isdisplayed) {
		this.isdisplayed = isdisplayed;
	}


	public Boolean getIsencryptedcolumn() {
		return this.isencryptedcolumn;
	}

	public void setIsencryptedcolumn(Boolean isencryptedcolumn) {
		this.isencryptedcolumn = isencryptedcolumn;
	}


	public Boolean getIsencryptedfield() {
		return this.isencryptedfield;
	}

	public void setIsencryptedfield(Boolean isencryptedfield) {
		this.isencryptedfield = isencryptedfield;
	}


	public Boolean getIsfieldonly() {
		return this.isfieldonly;
	}

	public void setIsfieldonly(Boolean isfieldonly) {
		this.isfieldonly = isfieldonly;
	}


	public Boolean getIsheading() {
		return this.isheading;
	}

	public void setIsheading(Boolean isheading) {
		this.isheading = isheading;
	}


	public Boolean getIsidentifier() {
		return this.isidentifier;
	}

	public void setIsidentifier(Boolean isidentifier) {
		this.isidentifier = isidentifier;
	}


	public Boolean getIskey() {
		return this.iskey;
	}

	public void setIskey(Boolean iskey) {
		this.iskey = iskey;
	}


	public Boolean getIsmandatory() {
		return this.ismandatory;
	}

	public void setIsmandatory(Boolean ismandatory) {
		this.ismandatory = ismandatory;
	}


	public Boolean getIsparent() {
		return this.isparent;
	}

	public void setIsparent(Boolean isparent) {
		this.isparent = isparent;
	}


	public Boolean getIsreadonly() {
		return this.isreadonly;
	}

	public void setIsreadonly(Boolean isreadonly) {
		this.isreadonly = isreadonly;
	}


	public Boolean getIssameline() {
		return this.issameline;
	}

	public void setIssameline(Boolean issameline) {
		this.issameline = issameline;
	}


	public Boolean getIsselectioncolumn() {
		return this.isselectioncolumn;
	}

	public void setIsselectioncolumn(Boolean isselectioncolumn) {
		this.isselectioncolumn = isselectioncolumn;
	}


	public Boolean getIstranslated() {
		return this.istranslated;
	}

	public void setIstranslated(Boolean istranslated) {
		this.istranslated = istranslated;
	}


	public Boolean getIsupdateable() {
		return this.isupdateable;
	}

	public void setIsupdateable(Boolean isupdateable) {
		this.isupdateable = isupdateable;
	}


	public String getMandatorylogic() {
		return this.mandatorylogic;
	}

	public void setMandatorylogic(String mandatorylogic) {
		this.mandatorylogic = mandatorylogic;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getObscuretype() {
		return this.obscuretype;
	}

	public void setObscuretype(String obscuretype) {
		this.obscuretype = obscuretype;
	}


	public String getReadonlylogic() {
		return this.readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
	}


	public Integer getSeqno() {
		return this.seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}


	public Integer getSortno() {
		return this.sortno;
	}

	public void setSortno(Integer sortno) {
		this.sortno = sortno;
	}


	public String getTablename() {
		return this.tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}


	public String getValidationcode() {
		return this.validationcode;
	}

	public void setValidationcode(String validationcode) {
		this.validationcode = validationcode;
	}


	public String getValuemax() {
		return this.valuemax;
	}

	public void setValuemax(String valuemax) {
		this.valuemax = valuemax;
	}


	public String getValuemin() {
		return this.valuemin;
	}

	public void setValuemin(String valuemin) {
		this.valuemin = valuemin;
	}


	public String getVformat() {
		return this.vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}

}