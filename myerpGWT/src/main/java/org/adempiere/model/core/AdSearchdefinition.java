package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_searchdefinition database table.
 * 
 */
@Entity
@Table(name="ad_searchdefinition")
@NamedQuery(name="AdSearchdefinition.findAll", query="SELECT a FROM AdSearchdefinition a")
public class AdSearchdefinition extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adSearchdefinitionId;
	private BigDecimal adClientId;
	private BigDecimal adColumnId;
	private BigDecimal adOrgId;
	private BigDecimal adTableId;
	private BigDecimal adWindowId;
	private Timestamp created;
	private BigDecimal createdby;
	private String datatype;
	private String description;
	private String isactive;
	private String isdefault;
	private String name;
	private BigDecimal poWindowId;
	private String query;
	private String searchtype;
	private String transactioncode;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdSearchdefinition() {
	}


	@Id
	@Column(name="AD_SEARCHDEFINITION_ID")
	public long getAdSearchdefinitionId() {
		return this.adSearchdefinitionId;
	}

	public void setAdSearchdefinitionId(long adSearchdefinitionId) {
		this.adSearchdefinitionId = adSearchdefinitionId;
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


	@Column(name="AD_WINDOW_ID")
	public BigDecimal getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(BigDecimal adWindowId) {
		this.adWindowId = adWindowId;
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


	public String getDatatype() {
		return this.datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
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


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
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


	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}


	public String getSearchtype() {
		return this.searchtype;
	}

	public void setSearchtype(String searchtype) {
		this.searchtype = searchtype;
	}


	public String getTransactioncode() {
		return this.transactioncode;
	}

	public void setTransactioncode(String transactioncode) {
		this.transactioncode = transactioncode;
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