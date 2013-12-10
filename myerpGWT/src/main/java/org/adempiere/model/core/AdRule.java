package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_rule database table.
 * 
 */
@Entity
@Table(name="ad_rule")
@NamedQuery(name="AdRule.findAll", query="SELECT a FROM AdRule a")
public class AdRule extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adRuleId;
	private String accesslevel;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String entitytype;
	private String eventtype;
	private String help;
	private String isactive;
	private String name;
	private String ruletype;
	private String script;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String value;

	public AdRule() {
	}


	@Id
	@Column(name="AD_RULE_ID")
	public long getAdRuleId() {
		return this.adRuleId;
	}

	public void setAdRuleId(long adRuleId) {
		this.adRuleId = adRuleId;
	}


	public String getAccesslevel() {
		return this.accesslevel;
	}

	public void setAccesslevel(String accesslevel) {
		this.accesslevel = accesslevel;
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


	public String getEventtype() {
		return this.eventtype;
	}

	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getRuletype() {
		return this.ruletype;
	}

	public void setRuletype(String ruletype) {
		this.ruletype = ruletype;
	}


	public String getScript() {
		return this.script;
	}

	public void setScript(String script) {
		this.script = script;
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


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}