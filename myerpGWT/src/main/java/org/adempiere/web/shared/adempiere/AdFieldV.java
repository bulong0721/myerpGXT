package org.adempiere.web.shared.adempiere;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.adempiere.web.shared.AdEntityBase;


/**
 * The persistent class for the ad_field_v database table.
 * 
 */
@Entity
@Table(name = "ad_field_v")
public class AdFieldV extends AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private Long				adColumnId;
	private Long				adFieldId;
	private Long				adProcessId;
	private Integer				adReferenceId;
	private Long				adReferenceValueId;
	private Long				adTabId;
	private Long				adTableId;
	private Long				adValRuleId;
	private Long				adWindowId;
	private String				callout;
	private String				columnname;
	private String				columnsql;
	private String				defaultvalue;
	private String				description;
	private Long				displaylength;
	private String				displaylogic;
	private String				fieldgroup;
	private String				fieldgrouptype;
	private Integer				fieldlength;
	private String				help;
	private Long				includedTabId;
	private String				infofactoryclass;
	private String				isalwaysupdateable;
	private String				isautocomplete;
	private String				iscollapsedbydefault;
	private String				isdisplayed;
	private String				isencryptedcolumn;
	private String				isencryptedfield;
	private String				isfieldonly;
	private String				isheading;
	private String				isidentifier;
	private String				iskey;
	private String				ismandatory;
	private String				isparent;
	private String				isreadonly;
	private String				issameline;
	private String				isselectioncolumn;
	private String				istranslated;
	private String				isupdateable;
	private String				mandatorylogic;
	private String				name;
	private String				obscuretype;
	private String				readonlylogic;
	private Integer				seqno;
	private Integer				sortno;
	private String				tablename;
	private String				validationcode;
	private String				valuemax;
	private String				valuemin;
	private String				vformat;

	public AdFieldV() {
	}

	@Column(name = "AD_COLUMN_ID")
	public Long getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(Long adColumnId) {
		this.adColumnId = adColumnId;
	}

	@Id
	@Column(name = "AD_FIELD_ID")
	public Long getAdFieldId() {
		return this.adFieldId;
	}

	public void setAdFieldId(Long adFieldId) {
		this.adFieldId = adFieldId;
	}

	@Column(name = "AD_PROCESS_ID")
	public Long getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(Long adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Column(name = "AD_REFERENCE_ID")
	public Integer getAdReferenceId() {
		return this.adReferenceId;
	}

	public void setAdReferenceId(Integer adReferenceId) {
		this.adReferenceId = adReferenceId;
	}

	@Column(name = "AD_REFERENCE_VALUE_ID")
	public Long getAdReferenceValueId() {
		return this.adReferenceValueId;
	}

	public void setAdReferenceValueId(Long adReferenceValueId) {
		this.adReferenceValueId = adReferenceValueId;
	}

	@Column(name = "AD_TAB_ID")
	public Long getAdTabId() {
		return this.adTabId;
	}

	public void setAdTabId(Long adTabId) {
		this.adTabId = adTabId;
	}

	@Column(name = "AD_TABLE_ID")
	public Long getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(Long adTableId) {
		this.adTableId = adTableId;
	}

	@Column(name = "AD_VAL_RULE_ID")
	public Long getAdValRuleId() {
		return this.adValRuleId;
	}

	public void setAdValRuleId(Long adValRuleId) {
		this.adValRuleId = adValRuleId;
	}

	@Column(name = "AD_WINDOW_ID")
	public Long getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(Long adWindowId) {
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

	public Long getDisplaylength() {
		return this.displaylength;
	}

	public void setDisplaylength(Long displaylength) {
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

	@Column(name = "INCLUDED_TAB_ID")
	public Long getIncludedTabId() {
		return this.includedTabId;
	}

	public void setIncludedTabId(Long includedTabId) {
		this.includedTabId = includedTabId;
	}

	public String getInfofactoryclass() {
		return this.infofactoryclass;
	}

	public void setInfofactoryclass(String infofactoryclass) {
		this.infofactoryclass = infofactoryclass;
	}

	public String getIsalwaysupdateable() {
		return this.isalwaysupdateable;
	}

	public void setIsalwaysupdateable(String isalwaysupdateable) {
		this.isalwaysupdateable = isalwaysupdateable;
	}

	public String getIsautocomplete() {
		return this.isautocomplete;
	}

	public void setIsautocomplete(String isautocomplete) {
		this.isautocomplete = isautocomplete;
	}

	public String getIscollapsedbydefault() {
		return this.iscollapsedbydefault;
	}

	public void setIscollapsedbydefault(String iscollapsedbydefault) {
		this.iscollapsedbydefault = iscollapsedbydefault;
	}

	public String getIsdisplayed() {
		return this.isdisplayed;
	}

	public void setIsdisplayed(String isdisplayed) {
		this.isdisplayed = isdisplayed;
	}

	public String getIsencryptedcolumn() {
		return this.isencryptedcolumn;
	}

	public void setIsencryptedcolumn(String isencryptedcolumn) {
		this.isencryptedcolumn = isencryptedcolumn;
	}

	public String getIsencryptedfield() {
		return this.isencryptedfield;
	}

	public void setIsencryptedfield(String isencryptedfield) {
		this.isencryptedfield = isencryptedfield;
	}

	public String getIsfieldonly() {
		return this.isfieldonly;
	}

	public void setIsfieldonly(String isfieldonly) {
		this.isfieldonly = isfieldonly;
	}

	public String getIsheading() {
		return this.isheading;
	}

	public void setIsheading(String isheading) {
		this.isheading = isheading;
	}

	public String getIsidentifier() {
		return this.isidentifier;
	}

	public void setIsidentifier(String isidentifier) {
		this.isidentifier = isidentifier;
	}

	public String getIskey() {
		return this.iskey;
	}

	public void setIskey(String iskey) {
		this.iskey = iskey;
	}

	public String getIsmandatory() {
		return this.ismandatory;
	}

	public void setIsmandatory(String ismandatory) {
		this.ismandatory = ismandatory;
	}

	public String getIsparent() {
		return this.isparent;
	}

	public void setIsparent(String isparent) {
		this.isparent = isparent;
	}

	public String getIsreadonly() {
		return this.isreadonly;
	}

	public void setIsreadonly(String isreadonly) {
		this.isreadonly = isreadonly;
	}

	public String getIssameline() {
		return this.issameline;
	}

	public void setIssameline(String issameline) {
		this.issameline = issameline;
	}

	public String getIsselectioncolumn() {
		return this.isselectioncolumn;
	}

	public void setIsselectioncolumn(String isselectioncolumn) {
		this.isselectioncolumn = isselectioncolumn;
	}

	public String getIstranslated() {
		return this.istranslated;
	}

	public void setIstranslated(String istranslated) {
		this.istranslated = istranslated;
	}

	public String getIsupdateable() {
		return this.isupdateable;
	}

	public void setIsupdateable(String isupdateable) {
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