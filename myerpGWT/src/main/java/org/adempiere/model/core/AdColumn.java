package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

import org.adempiere.model.common.AdEntityBase;


import java.math.BigDecimal;


/**
 * The persistent class for the ad_column database table.
 * 
 */
@Entity
@Table(name="ad_column")
public class AdColumn extends AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adColumnId;
	private BigDecimal adClientId;
	private BigDecimal adElementId;
	private BigDecimal adOrgId;
	private BigDecimal adProcessId;
	private BigDecimal adReferenceId;
	private BigDecimal adReferenceValueId;
	private BigDecimal adTableId;
	private BigDecimal adValRuleId;
	private String callout;
	private String columnname;
	private String columnsql;
	private String created;
	private BigDecimal createdby;
	private String defaultvalue;
	private String description;
	private String entitytype;
	private BigDecimal fieldlength;
	private String formatpattern;
	private String help;
	private String infofactoryclass;
	private String isactive;
	private String isallowlogging;
	private String isalwaysupdateable;
	private String isautocomplete;
	private String isencrypted;
	private String isidentifier;
	private String iskey;
	private String ismandatory;
	private String isparent;
	private String isselectioncolumn;
	private String issyncdatabase;
	private String istranslated;
	private String isupdateable;
	private String mandatorylogic;
	private String name;
	private String readonlylogic;
	private BigDecimal seqno;
	private String updated;
	private BigDecimal updatedby;
	private String valuemax;
	private String valuemin;
	private BigDecimal version;
	private String vformat;

	public AdColumn() {
	}


	@Id
	@Column(name="AD_COLUMN_ID")
	public long getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(long adColumnId) {
		this.adColumnId = adColumnId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ELEMENT_ID")
	public BigDecimal getAdElementId() {
		return this.adElementId;
	}

	public void setAdElementId(BigDecimal adElementId) {
		this.adElementId = adElementId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_PROCESS_ID")
	public BigDecimal getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(BigDecimal adProcessId) {
		this.adProcessId = adProcessId;
	}


	@Column(name="AD_REFERENCE_ID")
	public BigDecimal getAdReferenceId() {
		return this.adReferenceId;
	}

	public void setAdReferenceId(BigDecimal adReferenceId) {
		this.adReferenceId = adReferenceId;
	}


	@Column(name="AD_REFERENCE_VALUE_ID")
	public BigDecimal getAdReferenceValueId() {
		return this.adReferenceValueId;
	}

	public void setAdReferenceValueId(BigDecimal adReferenceValueId) {
		this.adReferenceValueId = adReferenceValueId;
	}


	@Column(name="AD_TABLE_ID")
	public BigDecimal getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(BigDecimal adTableId) {
		this.adTableId = adTableId;
	}


	@Column(name="AD_VAL_RULE_ID")
	public BigDecimal getAdValRuleId() {
		return this.adValRuleId;
	}

	public void setAdValRuleId(BigDecimal adValRuleId) {
		this.adValRuleId = adValRuleId;
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


	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}


	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}


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


	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}


	public BigDecimal getFieldlength() {
		return this.fieldlength;
	}

	public void setFieldlength(BigDecimal fieldlength) {
		this.fieldlength = fieldlength;
	}


	public String getFormatpattern() {
		return this.formatpattern;
	}

	public void setFormatpattern(String formatpattern) {
		this.formatpattern = formatpattern;
	}


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	public String getInfofactoryclass() {
		return this.infofactoryclass;
	}

	public void setInfofactoryclass(String infofactoryclass) {
		this.infofactoryclass = infofactoryclass;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsallowlogging() {
		return this.isallowlogging;
	}

	public void setIsallowlogging(String isallowlogging) {
		this.isallowlogging = isallowlogging;
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


	public String getIsencrypted() {
		return this.isencrypted;
	}

	public void setIsencrypted(String isencrypted) {
		this.isencrypted = isencrypted;
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


	public String getIsselectioncolumn() {
		return this.isselectioncolumn;
	}

	public void setIsselectioncolumn(String isselectioncolumn) {
		this.isselectioncolumn = isselectioncolumn;
	}


	public String getIssyncdatabase() {
		return this.issyncdatabase;
	}

	public void setIssyncdatabase(String issyncdatabase) {
		this.issyncdatabase = issyncdatabase;
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


	public String getReadonlylogic() {
		return this.readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
	}


	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
	}


	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
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


	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}


	public String getVformat() {
		return this.vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}

}