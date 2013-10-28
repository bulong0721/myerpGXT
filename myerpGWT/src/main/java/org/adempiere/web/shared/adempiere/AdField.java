package org.adempiere.web.shared.adempiere;

import java.io.Serializable;
import javax.persistence.*;

import org.adempiere.web.shared.AdEntityBase;


import java.math.BigDecimal;


/**
 * The persistent class for the ad_field database table.
 * 
 */
@Entity
@Table(name="ad_field")
public class AdField extends AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adFieldId;
	private BigDecimal adClientId;
	private BigDecimal adColumnId;
	private BigDecimal adFieldgroupId;
	private BigDecimal adOrgId;
	private BigDecimal adReferenceId;
	private BigDecimal adReferenceValueId;
	private BigDecimal adTabId;
	private BigDecimal adValRuleId;
	private String created;
	private BigDecimal createdby;
	private String defaultvalue;
	private String description;
	private BigDecimal displaylength;
	private String displaylogic;
	private String entitytype;
	private String help;
	private BigDecimal includedTabId;
	private String infofactoryclass;
	private String isactive;
	private String iscentrallymaintained;
	private String isdisplayed;
	private String isencrypted;
	private String isfieldonly;
	private String isheading;
	private String ismandatory;
	private String isreadonly;
	private String issameline;
	private String name;
	private String obscuretype;
	private BigDecimal seqno;
	private BigDecimal sortno;
	private String updated;
	private BigDecimal updatedby;

	public AdField() {
	}


	@Id
	@Column(name="AD_FIELD_ID")
	public long getAdFieldId() {
		return this.adFieldId;
	}

	public void setAdFieldId(long adFieldId) {
		this.adFieldId = adFieldId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_COLUMN_ID")
	public BigDecimal getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(BigDecimal adColumnId) {
		this.adColumnId = adColumnId;
	}


	@Column(name="AD_FIELDGROUP_ID")
	public BigDecimal getAdFieldgroupId() {
		return this.adFieldgroupId;
	}

	public void setAdFieldgroupId(BigDecimal adFieldgroupId) {
		this.adFieldgroupId = adFieldgroupId;
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


	@Column(name="AD_TAB_ID")
	public BigDecimal getAdTabId() {
		return this.adTabId;
	}

	public void setAdTabId(BigDecimal adTabId) {
		this.adTabId = adTabId;
	}


	@Column(name="AD_VAL_RULE_ID")
	public BigDecimal getAdValRuleId() {
		return this.adValRuleId;
	}

	public void setAdValRuleId(BigDecimal adValRuleId) {
		this.adValRuleId = adValRuleId;
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


	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	@Column(name="INCLUDED_TAB_ID")
	public BigDecimal getIncludedTabId() {
		return this.includedTabId;
	}

	public void setIncludedTabId(BigDecimal includedTabId) {
		this.includedTabId = includedTabId;
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


	public String getIscentrallymaintained() {
		return this.iscentrallymaintained;
	}

	public void setIscentrallymaintained(String iscentrallymaintained) {
		this.iscentrallymaintained = iscentrallymaintained;
	}


	public String getIsdisplayed() {
		return this.isdisplayed;
	}

	public void setIsdisplayed(String isdisplayed) {
		this.isdisplayed = isdisplayed;
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


	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
	}


	public BigDecimal getSortno() {
		return this.sortno;
	}

	public void setSortno(BigDecimal sortno) {
		this.sortno = sortno;
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

}