package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bpartner_product database table.
 * 
 */
@Entity
@Table(name="c_bpartner_product")
@NamedQuery(name="CBpartnerProduct.findAll", query="SELECT c FROM CBpartnerProduct c")
public class CBpartnerProduct extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CBpartnerProductPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String ismanufacturer;
	private String manufacturer;
	private BigDecimal qualityrating;
	private BigDecimal shelflifemindays;
	private BigDecimal shelflifeminpct;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String vendorcategory;
	private String vendorproductno;

	public CBpartnerProduct() {
	}


	@EmbeddedId
	public CBpartnerProductPK getId() {
		return this.id;
	}

	public void setId(CBpartnerProductPK id) {
		this.id = id;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsmanufacturer() {
		return this.ismanufacturer;
	}

	public void setIsmanufacturer(String ismanufacturer) {
		this.ismanufacturer = ismanufacturer;
	}


	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public BigDecimal getQualityrating() {
		return this.qualityrating;
	}

	public void setQualityrating(BigDecimal qualityrating) {
		this.qualityrating = qualityrating;
	}


	public BigDecimal getShelflifemindays() {
		return this.shelflifemindays;
	}

	public void setShelflifemindays(BigDecimal shelflifemindays) {
		this.shelflifemindays = shelflifemindays;
	}


	public BigDecimal getShelflifeminpct() {
		return this.shelflifeminpct;
	}

	public void setShelflifeminpct(BigDecimal shelflifeminpct) {
		this.shelflifeminpct = shelflifeminpct;
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


	public String getVendorcategory() {
		return this.vendorcategory;
	}

	public void setVendorcategory(String vendorcategory) {
		this.vendorcategory = vendorcategory;
	}


	public String getVendorproductno() {
		return this.vendorproductno;
	}

	public void setVendorproductno(String vendorproductno) {
		this.vendorproductno = vendorproductno;
	}

}