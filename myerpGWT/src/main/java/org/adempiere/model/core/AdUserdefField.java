package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_userdef_field database table.
 * 
 */
@Entity
@Table(name="ad_userdef_field")
@NamedQuery(name="AdUserdefField.findAll", query="SELECT a FROM AdUserdefField a")
public class AdUserdefField extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adUserdefFieldId;
	private BigDecimal adClientId;
	private BigDecimal adFieldId;
	private BigDecimal adOrgId;
	private BigDecimal adUserdefTabId;
	private Timestamp created;
	private BigDecimal createdby;
	private String defaultvalue;
	private String description;
	private BigDecimal displaylength;
	private String displaylogic;
	private String help;
	private String isactive;
	private String isdisplayed;
	private String isreadonly;
	private String issameline;
	private String isupdateable;
	private String name;
	private BigDecimal seqno;
	private BigDecimal sortno;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdUserdefField() {
	}


	@Id
	@Column(name="AD_USERDEF_FIELD_ID")
	public long getAdUserdefFieldId() {
		return this.adUserdefFieldId;
	}

	public void setAdUserdefFieldId(long adUserdefFieldId) {
		this.adUserdefFieldId = adUserdefFieldId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_FIELD_ID")
	public BigDecimal getAdFieldId() {
		return this.adFieldId;
	}

	public void setAdFieldId(BigDecimal adFieldId) {
		this.adFieldId = adFieldId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_USERDEF_TAB_ID")
	public BigDecimal getAdUserdefTabId() {
		return this.adUserdefTabId;
	}

	public void setAdUserdefTabId(BigDecimal adUserdefTabId) {
		this.adUserdefTabId = adUserdefTabId;
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


	public String getIsdisplayed() {
		return this.isdisplayed;
	}

	public void setIsdisplayed(String isdisplayed) {
		this.isdisplayed = isdisplayed;
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


	public BigDecimal getSortno() {
		return this.sortno;
	}

	public void setSortno(BigDecimal sortno) {
		this.sortno = sortno;
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

}