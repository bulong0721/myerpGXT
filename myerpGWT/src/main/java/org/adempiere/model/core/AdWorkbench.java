package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_workbench database table.
 * 
 */
@Entity
@Table(name="ad_workbench")
@NamedQuery(name="AdWorkbench.findAll", query="SELECT a FROM AdWorkbench a")
public class AdWorkbench extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adWorkbenchId;
	private BigDecimal adClientId;
	private BigDecimal adColorId;
	private BigDecimal adColumnId;
	private BigDecimal adImageId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String entitytype;
	private String help;
	private String isactive;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdWorkbench() {
	}


	@Id
	@Column(name="AD_WORKBENCH_ID")
	public long getAdWorkbenchId() {
		return this.adWorkbenchId;
	}

	public void setAdWorkbenchId(long adWorkbenchId) {
		this.adWorkbenchId = adWorkbenchId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_COLOR_ID")
	public BigDecimal getAdColorId() {
		return this.adColorId;
	}

	public void setAdColorId(BigDecimal adColorId) {
		this.adColorId = adColorId;
	}


	@Column(name="AD_COLUMN_ID")
	public BigDecimal getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(BigDecimal adColumnId) {
		this.adColumnId = adColumnId;
	}


	@Column(name="AD_IMAGE_ID")
	public BigDecimal getAdImageId() {
		return this.adImageId;
	}

	public void setAdImageId(BigDecimal adImageId) {
		this.adImageId = adImageId;
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