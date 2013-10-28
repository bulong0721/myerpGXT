package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_element database table.
 * 
 */
@Entity
@Table(name="ad_element")
public class AdElement extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adElementId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private String columnname;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String entitytype;
	private String help;
	private String isactive;
	private String name;
	private String poDescription;
	private String poHelp;
	private String poName;
	private String poPrintname;
	private String printname;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdElement() {
	}


	@Id
	@Column(name="AD_ELEMENT_ID")
	public long getAdElementId() {
		return this.adElementId;
	}

	public void setAdElementId(long adElementId) {
		this.adElementId = adElementId;
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


	public String getColumnname() {
		return this.columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
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


	@Column(name="PO_DESCRIPTION")
	public String getPoDescription() {
		return this.poDescription;
	}

	public void setPoDescription(String poDescription) {
		this.poDescription = poDescription;
	}


	@Column(name="PO_HELP")
	public String getPoHelp() {
		return this.poHelp;
	}

	public void setPoHelp(String poHelp) {
		this.poHelp = poHelp;
	}


	@Column(name="PO_NAME")
	public String getPoName() {
		return this.poName;
	}

	public void setPoName(String poName) {
		this.poName = poName;
	}


	@Column(name="PO_PRINTNAME")
	public String getPoPrintname() {
		return this.poPrintname;
	}

	public void setPoPrintname(String poPrintname) {
		this.poPrintname = poPrintname;
	}


	public String getPrintname() {
		return this.printname;
	}

	public void setPrintname(String printname) {
		this.printname = printname;
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