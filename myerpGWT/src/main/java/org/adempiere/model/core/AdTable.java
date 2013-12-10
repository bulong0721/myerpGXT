package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

import org.adempiere.model.common.ADEntityBase;


import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_table database table.
 * 
 */
@Entity
@Table(name="ad_table")
public class AdTable extends ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adTableId;
	private String accesslevel;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adValRuleId;
	private BigDecimal adWindowId;
	private String copycolumnsfromtable;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String entitytype;
	private String help;
	private String importtable;
	private String isactive;
	private String iscentrallymaintained;
	private String ischangelog;
	private String isdeleteable;
	private String ishighvolume;
	private String issecurityenabled;
	private String isview;
	private BigDecimal loadseq;
	private String name;
	private BigDecimal poWindowId;
	private String replicationtype;
	private String tablename;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdTable() {
	}


	@Id
	@Column(name="AD_TABLE_ID")
	public long getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(long adTableId) {
		this.adTableId = adTableId;
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


	@Column(name="AD_VAL_RULE_ID")
	public BigDecimal getAdValRuleId() {
		return this.adValRuleId;
	}

	public void setAdValRuleId(BigDecimal adValRuleId) {
		this.adValRuleId = adValRuleId;
	}


	@Column(name="AD_WINDOW_ID")
	public BigDecimal getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(BigDecimal adWindowId) {
		this.adWindowId = adWindowId;
	}


	public String getCopycolumnsfromtable() {
		return this.copycolumnsfromtable;
	}

	public void setCopycolumnsfromtable(String copycolumnsfromtable) {
		this.copycolumnsfromtable = copycolumnsfromtable;
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


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	public String getImporttable() {
		return this.importtable;
	}

	public void setImporttable(String importtable) {
		this.importtable = importtable;
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


	public String getIschangelog() {
		return this.ischangelog;
	}

	public void setIschangelog(String ischangelog) {
		this.ischangelog = ischangelog;
	}


	public String getIsdeleteable() {
		return this.isdeleteable;
	}

	public void setIsdeleteable(String isdeleteable) {
		this.isdeleteable = isdeleteable;
	}


	public String getIshighvolume() {
		return this.ishighvolume;
	}

	public void setIshighvolume(String ishighvolume) {
		this.ishighvolume = ishighvolume;
	}


	public String getIssecurityenabled() {
		return this.issecurityenabled;
	}

	public void setIssecurityenabled(String issecurityenabled) {
		this.issecurityenabled = issecurityenabled;
	}


	public String getIsview() {
		return this.isview;
	}

	public void setIsview(String isview) {
		this.isview = isview;
	}


	public BigDecimal getLoadseq() {
		return this.loadseq;
	}

	public void setLoadseq(BigDecimal loadseq) {
		this.loadseq = loadseq;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="PO_WINDOW_ID")
	public BigDecimal getPoWindowId() {
		return this.poWindowId;
	}

	public void setPoWindowId(BigDecimal poWindowId) {
		this.poWindowId = poWindowId;
	}


	public String getReplicationtype() {
		return this.replicationtype;
	}

	public void setReplicationtype(String replicationtype) {
		this.replicationtype = replicationtype;
	}


	public String getTablename() {
		return this.tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
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