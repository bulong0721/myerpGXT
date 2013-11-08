package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_labelprinterfunction database table.
 * 
 */
@Entity
@Table(name="ad_labelprinterfunction")
@NamedQuery(name="AdLabelprinterfunction.findAll", query="SELECT a FROM AdLabelprinterfunction a")
public class AdLabelprinterfunction extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adLabelprinterfunctionId;
	private BigDecimal adClientId;
	private BigDecimal adLabelprinterId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String functionprefix;
	private String functionsuffix;
	private String isactive;
	private String isxyposition;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String xyseparator;

	public AdLabelprinterfunction() {
	}


	@Id
	@Column(name="AD_LABELPRINTERFUNCTION_ID")
	public long getAdLabelprinterfunctionId() {
		return this.adLabelprinterfunctionId;
	}

	public void setAdLabelprinterfunctionId(long adLabelprinterfunctionId) {
		this.adLabelprinterfunctionId = adLabelprinterfunctionId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_LABELPRINTER_ID")
	public BigDecimal getAdLabelprinterId() {
		return this.adLabelprinterId;
	}

	public void setAdLabelprinterId(BigDecimal adLabelprinterId) {
		this.adLabelprinterId = adLabelprinterId;
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


	public String getFunctionprefix() {
		return this.functionprefix;
	}

	public void setFunctionprefix(String functionprefix) {
		this.functionprefix = functionprefix;
	}


	public String getFunctionsuffix() {
		return this.functionsuffix;
	}

	public void setFunctionsuffix(String functionsuffix) {
		this.functionsuffix = functionsuffix;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsxyposition() {
		return this.isxyposition;
	}

	public void setIsxyposition(String isxyposition) {
		this.isxyposition = isxyposition;
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


	public String getXyseparator() {
		return this.xyseparator;
	}

	public void setXyseparator(String xyseparator) {
		this.xyseparator = xyseparator;
	}

}