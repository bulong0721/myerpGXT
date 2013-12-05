package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_project database table.
 * 
 */
@Entity
@Table(name="c_project")
@NamedQuery(name="CProject.findAll", query="SELECT c FROM CProject c")
public class CProject extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cProjectId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adUserId;
	private BigDecimal cBpartnerId;
	private BigDecimal cBpartnerLocationId;
	private BigDecimal cBpartnersrId;
	private BigDecimal cCampaignId;
	private BigDecimal cCurrencyId;
	private BigDecimal cPaymenttermId;
	private BigDecimal cPhaseId;
	private BigDecimal cProjecttypeId;
	private BigDecimal committedamt;
	private BigDecimal committedqty;
	private String copyfrom;
	private Timestamp created;
	private BigDecimal createdby;
	private Date datecontract;
	private Date datefinish;
	private String description;
	private String generateto;
	private BigDecimal invoicedamt;
	private BigDecimal invoicedqty;
	private String isactive;
	private String iscommitceiling;
	private String iscommitment;
	private String issummary;
	private BigDecimal mPricelistVersionId;
	private BigDecimal mWarehouseId;
	private String name;
	private String note;
	private BigDecimal plannedamt;
	private BigDecimal plannedmarginamt;
	private BigDecimal plannedqty;
	private String poreference;
	private String processed;
	private String processing;
	private BigDecimal projectbalanceamt;
	private String projectcategory;
	private String projectlinelevel;
	private String projinvoicerule;
	private BigDecimal salesrepId;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String value;

	public CProject() {
	}


	@Id
	@Column(name="C_PROJECT_ID")
	public long getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(long cProjectId) {
		this.cProjectId = cProjectId;
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


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
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


	@Column(name="C_BPARTNERSR_ID")
	public BigDecimal getCBpartnersrId() {
		return this.cBpartnersrId;
	}

	public void setCBpartnersrId(BigDecimal cBpartnersrId) {
		this.cBpartnersrId = cBpartnersrId;
	}


	@Column(name="C_CAMPAIGN_ID")
	public BigDecimal getCCampaignId() {
		return this.cCampaignId;
	}

	public void setCCampaignId(BigDecimal cCampaignId) {
		this.cCampaignId = cCampaignId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_PAYMENTTERM_ID")
	public BigDecimal getCPaymenttermId() {
		return this.cPaymenttermId;
	}

	public void setCPaymenttermId(BigDecimal cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
	}


	@Column(name="C_PHASE_ID")
	public BigDecimal getCPhaseId() {
		return this.cPhaseId;
	}

	public void setCPhaseId(BigDecimal cPhaseId) {
		this.cPhaseId = cPhaseId;
	}


	@Column(name="C_PROJECTTYPE_ID")
	public BigDecimal getCProjecttypeId() {
		return this.cProjecttypeId;
	}

	public void setCProjecttypeId(BigDecimal cProjecttypeId) {
		this.cProjecttypeId = cProjecttypeId;
	}


	public BigDecimal getCommittedamt() {
		return this.committedamt;
	}

	public void setCommittedamt(BigDecimal committedamt) {
		this.committedamt = committedamt;
	}


	public BigDecimal getCommittedqty() {
		return this.committedqty;
	}

	public void setCommittedqty(BigDecimal committedqty) {
		this.committedqty = committedqty;
	}


	public String getCopyfrom() {
		return this.copyfrom;
	}

	public void setCopyfrom(String copyfrom) {
		this.copyfrom = copyfrom;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatecontract() {
		return this.datecontract;
	}

	public void setDatecontract(Date datecontract) {
		this.datecontract = datecontract;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatefinish() {
		return this.datefinish;
	}

	public void setDatefinish(Date datefinish) {
		this.datefinish = datefinish;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getGenerateto() {
		return this.generateto;
	}

	public void setGenerateto(String generateto) {
		this.generateto = generateto;
	}


	public BigDecimal getInvoicedamt() {
		return this.invoicedamt;
	}

	public void setInvoicedamt(BigDecimal invoicedamt) {
		this.invoicedamt = invoicedamt;
	}


	public BigDecimal getInvoicedqty() {
		return this.invoicedqty;
	}

	public void setInvoicedqty(BigDecimal invoicedqty) {
		this.invoicedqty = invoicedqty;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIscommitceiling() {
		return this.iscommitceiling;
	}

	public void setIscommitceiling(String iscommitceiling) {
		this.iscommitceiling = iscommitceiling;
	}


	public String getIscommitment() {
		return this.iscommitment;
	}

	public void setIscommitment(String iscommitment) {
		this.iscommitment = iscommitment;
	}


	public String getIssummary() {
		return this.issummary;
	}

	public void setIssummary(String issummary) {
		this.issummary = issummary;
	}


	@Column(name="M_PRICELIST_VERSION_ID")
	public BigDecimal getMPricelistVersionId() {
		return this.mPricelistVersionId;
	}

	public void setMPricelistVersionId(BigDecimal mPricelistVersionId) {
		this.mPricelistVersionId = mPricelistVersionId;
	}


	@Column(name="M_WAREHOUSE_ID")
	public BigDecimal getMWarehouseId() {
		return this.mWarehouseId;
	}

	public void setMWarehouseId(BigDecimal mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}


	public BigDecimal getPlannedamt() {
		return this.plannedamt;
	}

	public void setPlannedamt(BigDecimal plannedamt) {
		this.plannedamt = plannedamt;
	}


	public BigDecimal getPlannedmarginamt() {
		return this.plannedmarginamt;
	}

	public void setPlannedmarginamt(BigDecimal plannedmarginamt) {
		this.plannedmarginamt = plannedmarginamt;
	}


	public BigDecimal getPlannedqty() {
		return this.plannedqty;
	}

	public void setPlannedqty(BigDecimal plannedqty) {
		this.plannedqty = plannedqty;
	}


	public String getPoreference() {
		return this.poreference;
	}

	public void setPoreference(String poreference) {
		this.poreference = poreference;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	public BigDecimal getProjectbalanceamt() {
		return this.projectbalanceamt;
	}

	public void setProjectbalanceamt(BigDecimal projectbalanceamt) {
		this.projectbalanceamt = projectbalanceamt;
	}


	public String getProjectcategory() {
		return this.projectcategory;
	}

	public void setProjectcategory(String projectcategory) {
		this.projectcategory = projectcategory;
	}


	public String getProjectlinelevel() {
		return this.projectlinelevel;
	}

	public void setProjectlinelevel(String projectlinelevel) {
		this.projectlinelevel = projectlinelevel;
	}


	public String getProjinvoicerule() {
		return this.projinvoicerule;
	}

	public void setProjinvoicerule(String projinvoicerule) {
		this.projinvoicerule = projinvoicerule;
	}


	@Column(name="SALESREP_ID")
	public BigDecimal getSalesrepId() {
		return this.salesrepId;
	}

	public void setSalesrepId(BigDecimal salesrepId) {
		this.salesrepId = salesrepId;
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