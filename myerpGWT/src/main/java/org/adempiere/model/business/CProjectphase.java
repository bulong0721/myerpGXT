package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_projectphase database table.
 * 
 */
@Entity
@Table(name="c_projectphase")
@NamedQuery(name="CProjectphase.findAll", query="SELECT c FROM CProjectphase c")
public class CProjectphase extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cProjectphaseId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cOrderId;
	private BigDecimal cPhaseId;
	private BigDecimal cProjectId;
	private BigDecimal committedamt;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private Date enddate;
	private String generateorder;
	private String help;
	private String isactive;
	private String iscommitceiling;
	private String iscomplete;
	private BigDecimal mProductId;
	private String name;
	private BigDecimal plannedamt;
	private BigDecimal priceactual;
	private String projinvoicerule;
	private BigDecimal qty;
	private BigDecimal seqno;
	private Date startdate;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CProjectphase() {
	}


	@Id
	@Column(name="C_PROJECTPHASE_ID")
	public long getCProjectphaseId() {
		return this.cProjectphaseId;
	}

	public void setCProjectphaseId(long cProjectphaseId) {
		this.cProjectphaseId = cProjectphaseId;
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


	@Column(name="C_ORDER_ID")
	public BigDecimal getCOrderId() {
		return this.cOrderId;
	}

	public void setCOrderId(BigDecimal cOrderId) {
		this.cOrderId = cOrderId;
	}


	@Column(name="C_PHASE_ID")
	public BigDecimal getCPhaseId() {
		return this.cPhaseId;
	}

	public void setCPhaseId(BigDecimal cPhaseId) {
		this.cPhaseId = cPhaseId;
	}


	@Column(name="C_PROJECT_ID")
	public BigDecimal getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(BigDecimal cProjectId) {
		this.cProjectId = cProjectId;
	}


	public BigDecimal getCommittedamt() {
		return this.committedamt;
	}

	public void setCommittedamt(BigDecimal committedamt) {
		this.committedamt = committedamt;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	public String getGenerateorder() {
		return this.generateorder;
	}

	public void setGenerateorder(String generateorder) {
		this.generateorder = generateorder;
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


	public String getIscommitceiling() {
		return this.iscommitceiling;
	}

	public void setIscommitceiling(String iscommitceiling) {
		this.iscommitceiling = iscommitceiling;
	}


	public String getIscomplete() {
		return this.iscomplete;
	}

	public void setIscomplete(String iscomplete) {
		this.iscomplete = iscomplete;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getPlannedamt() {
		return this.plannedamt;
	}

	public void setPlannedamt(BigDecimal plannedamt) {
		this.plannedamt = plannedamt;
	}


	public BigDecimal getPriceactual() {
		return this.priceactual;
	}

	public void setPriceactual(BigDecimal priceactual) {
		this.priceactual = priceactual;
	}


	public String getProjinvoicerule() {
		return this.projinvoicerule;
	}

	public void setProjinvoicerule(String projinvoicerule) {
		this.projinvoicerule = projinvoicerule;
	}


	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}


	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
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