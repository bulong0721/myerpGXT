package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bp_relation database table.
 * 
 */
@Entity
@Table(name="c_bp_relation")
@NamedQuery(name="CBpRelation.findAll", query="SELECT c FROM CBpRelation c")
public class CBpRelation extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBpRelationId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBpartnerId;
	private BigDecimal cBpartnerLocationId;
	private BigDecimal cBpartnerrelationId;
	private BigDecimal cBpartnerrelationLocationId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String isbillto;
	private String ispayfrom;
	private String isremitto;
	private String isshipto;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBpRelation() {
	}


	@Id
	@Column(name="C_BP_RELATION_ID")
	public long getCBpRelationId() {
		return this.cBpRelationId;
	}

	public void setCBpRelationId(long cBpRelationId) {
		this.cBpRelationId = cBpRelationId;
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


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_BPARTNER_LOCATION_ID")
	public BigDecimal getCBpartnerLocationId() {
		return this.cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(BigDecimal cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}


	@Column(name="C_BPARTNERRELATION_ID")
	public BigDecimal getCBpartnerrelationId() {
		return this.cBpartnerrelationId;
	}

	public void setCBpartnerrelationId(BigDecimal cBpartnerrelationId) {
		this.cBpartnerrelationId = cBpartnerrelationId;
	}


	@Column(name="C_BPARTNERRELATION_LOCATION_ID")
	public BigDecimal getCBpartnerrelationLocationId() {
		return this.cBpartnerrelationLocationId;
	}

	public void setCBpartnerrelationLocationId(BigDecimal cBpartnerrelationLocationId) {
		this.cBpartnerrelationLocationId = cBpartnerrelationLocationId;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsbillto() {
		return this.isbillto;
	}

	public void setIsbillto(String isbillto) {
		this.isbillto = isbillto;
	}


	public String getIspayfrom() {
		return this.ispayfrom;
	}

	public void setIspayfrom(String ispayfrom) {
		this.ispayfrom = ispayfrom;
	}


	public String getIsremitto() {
		return this.isremitto;
	}

	public void setIsremitto(String isremitto) {
		this.isremitto = isremitto;
	}


	public String getIsshipto() {
		return this.isshipto;
	}

	public void setIsshipto(String isshipto) {
		this.isshipto = isshipto;
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