package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_taxdefinition database table.
 * 
 */
@Entity
@Table(name="c_taxdefinition")
@NamedQuery(name="CTaxdefinition.findAll", query="SELECT c FROM CTaxdefinition c")
public class CTaxdefinition extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cTaxdefinitionId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgtypeId;
	private BigDecimal cBpGroupId;
	private BigDecimal cBpartnerId;
	private BigDecimal cTaxId;
	private BigDecimal cTaxbaseId;
	private BigDecimal cTaxgroupId;
	private BigDecimal cTaxtypeId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String help;
	private String isactive;
	private String isinvoiced;
	private BigDecimal mProductCategoryId;
	private BigDecimal mProductId;
	private BigDecimal maxtaxable;
	private BigDecimal mintaxable;
	private String name;
	private BigDecimal seqno;
	private Timestamp updated;
	private BigDecimal updatedby;
	private Date validfrom;
	private Date validto;
	private String value;
	private CTaxcategory CTaxcategory;

	public CTaxdefinition() {
	}


	@Id
	@Column(name="C_TAXDEFINITION_ID")
	public long getCTaxdefinitionId() {
		return this.cTaxdefinitionId;
	}

	public void setCTaxdefinitionId(long cTaxdefinitionId) {
		this.cTaxdefinitionId = cTaxdefinitionId;
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


	@Column(name="AD_ORGTYPE_ID")
	public BigDecimal getAdOrgtypeId() {
		return this.adOrgtypeId;
	}

	public void setAdOrgtypeId(BigDecimal adOrgtypeId) {
		this.adOrgtypeId = adOrgtypeId;
	}


	@Column(name="C_BP_GROUP_ID")
	public BigDecimal getCBpGroupId() {
		return this.cBpGroupId;
	}

	public void setCBpGroupId(BigDecimal cBpGroupId) {
		this.cBpGroupId = cBpGroupId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_TAX_ID")
	public BigDecimal getCTaxId() {
		return this.cTaxId;
	}

	public void setCTaxId(BigDecimal cTaxId) {
		this.cTaxId = cTaxId;
	}


	@Column(name="C_TAXBASE_ID")
	public BigDecimal getCTaxbaseId() {
		return this.cTaxbaseId;
	}

	public void setCTaxbaseId(BigDecimal cTaxbaseId) {
		this.cTaxbaseId = cTaxbaseId;
	}


	@Column(name="C_TAXGROUP_ID")
	public BigDecimal getCTaxgroupId() {
		return this.cTaxgroupId;
	}

	public void setCTaxgroupId(BigDecimal cTaxgroupId) {
		this.cTaxgroupId = cTaxgroupId;
	}


	@Column(name="C_TAXTYPE_ID")
	public BigDecimal getCTaxtypeId() {
		return this.cTaxtypeId;
	}

	public void setCTaxtypeId(BigDecimal cTaxtypeId) {
		this.cTaxtypeId = cTaxtypeId;
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


	public String getIsinvoiced() {
		return this.isinvoiced;
	}

	public void setIsinvoiced(String isinvoiced) {
		this.isinvoiced = isinvoiced;
	}


	@Column(name="M_PRODUCT_CATEGORY_ID")
	public BigDecimal getMProductCategoryId() {
		return this.mProductCategoryId;
	}

	public void setMProductCategoryId(BigDecimal mProductCategoryId) {
		this.mProductCategoryId = mProductCategoryId;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
	}


	public BigDecimal getMaxtaxable() {
		return this.maxtaxable;
	}

	public void setMaxtaxable(BigDecimal maxtaxable) {
		this.maxtaxable = maxtaxable;
	}


	public BigDecimal getMintaxable() {
		return this.mintaxable;
	}

	public void setMintaxable(BigDecimal mintaxable) {
		this.mintaxable = mintaxable;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidfrom() {
		return this.validfrom;
	}

	public void setValidfrom(Date validfrom) {
		this.validfrom = validfrom;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidto() {
		return this.validto;
	}

	public void setValidto(Date validto) {
		this.validto = validto;
	}


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}


	//bi-directional many-to-one association to CTaxcategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="C_TAXCATEGORY_ID")
	public CTaxcategory getCTaxcategory() {
		return this.CTaxcategory;
	}

	public void setCTaxcategory(CTaxcategory CTaxcategory) {
		this.CTaxcategory = CTaxcategory;
	}

}