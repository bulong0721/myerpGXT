package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_infowindow database table.
 * 
 */
@Entity
@Table(name="ad_infowindow")
@NamedQuery(name="AdInfowindow.findAll", query="SELECT a FROM AdInfowindow a")
public class AdInfowindow extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adInfowindowId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adTableId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String entitytype;
	private String fromclause;
	private String help;
	private String isactive;
	private String name;
	private String otherclause;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdInfowindow() {
	}


	@Id
	@Column(name="AD_INFOWINDOW_ID")
	public long getAdInfowindowId() {
		return this.adInfowindowId;
	}

	public void setAdInfowindowId(long adInfowindowId) {
		this.adInfowindowId = adInfowindowId;
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


	@Column(name="AD_TABLE_ID")
	public BigDecimal getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(BigDecimal adTableId) {
		this.adTableId = adTableId;
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


	public String getFromclause() {
		return this.fromclause;
	}

	public void setFromclause(String fromclause) {
		this.fromclause = fromclause;
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


	public String getOtherclause() {
		return this.otherclause;
	}

	public void setOtherclause(String otherclause) {
		this.otherclause = otherclause;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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