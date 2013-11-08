package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_attribute database table.
 * 
 */
@Entity
@Table(name="ad_attribute")
@NamedQuery(name="AdAttribute.findAll", query="SELECT a FROM AdAttribute a")
public class AdAttribute extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adAttributeId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adReferenceId;
	private BigDecimal adReferenceValueId;
	private BigDecimal adTableId;
	private BigDecimal adValRuleId;
	private String callout;
	private Timestamp created;
	private BigDecimal createdby;
	private String defaultvalue;
	private String description;
	private BigDecimal displaylength;
	private String displaylogic;
	private BigDecimal fieldlength;
	private String help;
	private String isactive;
	private String isencrypted;
	private String isfieldonly;
	private String isheading;
	private String ismandatory;
	private String isreadonly;
	private String issameline;
	private String isupdateable;
	private String name;
	private BigDecimal seqno;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String valuemax;
	private String valuemin;
	private String vformat;

	public AdAttribute() {
	}


	@Id
	@Column(name="AD_ATTRIBUTE_ID")
	public long getAdAttributeId() {
		return this.adAttributeId;
	}

	public void setAdAttributeId(long adAttributeId) {
		this.adAttributeId = adAttributeId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
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


	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
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


	public BigDecimal getDisplaylength() {
		return this.displaylength;
	}

	public void setDisplaylength(BigDecimal displaylength) {
		this.displaylength = displaylength;
	}


	public String getDisplaylogic() {
		return this.displaylogic;
	}

	public void setDisplaylogic(String displaylogic) {
		this.displaylogic = displaylogic;
	}


	public BigDecimal getFieldlength() {
		return this.fieldlength;
	}

	public void setFieldlength(BigDecimal fieldlength) {
		this.fieldlength = fieldlength;
	}


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsencrypted() {
		return this.isencrypted;
	}

	public void setIsencrypted(String isencrypted) {
		this.isencrypted = isencrypted;
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


	public String getIsmandatory() {
		return this.ismandatory;
	}

	public void setIsmandatory(String ismandatory) {
		this.ismandatory = ismandatory;
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


	public String getIsupdateable() {
		return this.isupdateable;
	}

	public void setIsupdateable(String isupdateable) {
		this.isupdateable = isupdateable;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
	}


	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
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


	public String getVformat() {
		return this.vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}

}