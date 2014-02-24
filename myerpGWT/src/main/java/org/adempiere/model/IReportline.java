package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="i_reportline")
public class IReportline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String amounttype;
	private Integer cElementvalueId;
	private String calculationtype;
	private String created;
	private Integer createdby;
	private String description;
	private String elementvalue;
	private String iErrormsg;
	private Boolean iIsimported;
	private Integer iReportlineId;
	private Boolean isactive;
	private Boolean isprinted;
	private Boolean issummary;
	private String linetype;
	private String name;
	private Integer paReportlineId;
	private Integer paReportlinesetId;
	private Integer paReportsourceId;
	private String paamounttype;
	private String paperiodtype;
	private String postingtype;
	private Boolean processed;
	private Boolean processing;
	private String reportlinesetname;
	private Integer seqno;
	private String updated;
	private Integer updatedby;

	public IReportline() {
	}

	public IReportline(Integer iReportlineId) {
		this.iReportlineId = iReportlineId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT")
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT")
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(length=2)
	public String getAmounttype() {
		return amounttype;
	}

	public void setAmounttype(String amounttype) {
		this.amounttype = amounttype;
	}

	@Basic
	@Column(name="C_ELEMENTVALUE_ID", columnDefinition="INT")
	public Integer getCElementvalueId() {
		return cElementvalueId;
	}

	public void setCElementvalueId(Integer cElementvalueId) {
		this.cElementvalueId = cElementvalueId;
	}

	@Basic
	@Column(length=1)
	public String getCalculationtype() {
		return calculationtype;
	}

	public void setCalculationtype(String calculationtype) {
		this.calculationtype = calculationtype;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=40)
	public String getElementvalue() {
		return elementvalue;
	}

	public void setElementvalue(String elementvalue) {
		this.elementvalue = elementvalue;
	}

	@Basic
	@Column(name="I_ERRORMSG", length=2000)
	public String getIErrormsg() {
		return iErrormsg;
	}

	public void setIErrormsg(String iErrormsg) {
		this.iErrormsg = iErrormsg;
	}

	@Basic
	@Column(name="I_ISIMPORTED", nullable=false)
	public Boolean isIIsimported() {
		return iIsimported;
	}

	public void setIIsimported(Boolean iIsimported) {
		this.iIsimported = iIsimported;
	}

	@Id
	@Column(name="I_REPORTLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_635", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "I_ReportLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_635")
	public Integer getIReportlineId() {
		return iReportlineId;
	}

	public void setIReportlineId(Integer iReportlineId) {
		this.iReportlineId = iReportlineId;
	}

	@Basic
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	public Boolean isIsprinted() {
		return isprinted;
	}

	public void setIsprinted(Boolean isprinted) {
		this.isprinted = isprinted;
	}

	@Basic
	public Boolean isIssummary() {
		return issummary;
	}

	public void setIssummary(Boolean issummary) {
		this.issummary = issummary;
	}

	@Basic
	@Column(length=1)
	public String getLinetype() {
		return linetype;
	}

	public void setLinetype(String linetype) {
		this.linetype = linetype;
	}

	@Basic
	@Column(length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name="PA_REPORTLINE_ID", columnDefinition="INT")
	public Integer getPaReportlineId() {
		return paReportlineId;
	}

	public void setPaReportlineId(Integer paReportlineId) {
		this.paReportlineId = paReportlineId;
	}

	@Basic
	@Column(name="PA_REPORTLINESET_ID", columnDefinition="INT")
	public Integer getPaReportlinesetId() {
		return paReportlinesetId;
	}

	public void setPaReportlinesetId(Integer paReportlinesetId) {
		this.paReportlinesetId = paReportlinesetId;
	}

	@Basic
	@Column(name="PA_REPORTSOURCE_ID", columnDefinition="INT")
	public Integer getPaReportsourceId() {
		return paReportsourceId;
	}

	public void setPaReportsourceId(Integer paReportsourceId) {
		this.paReportsourceId = paReportsourceId;
	}

	@Basic
	@Column(length=1)
	public String getPaamounttype() {
		return paamounttype;
	}

	public void setPaamounttype(String paamounttype) {
		this.paamounttype = paamounttype;
	}

	@Basic
	@Column(length=1)
	public String getPaperiodtype() {
		return paperiodtype;
	}

	public void setPaperiodtype(String paperiodtype) {
		this.paperiodtype = paperiodtype;
	}

	@Basic
	@Column(length=1)
	public String getPostingtype() {
		return postingtype;
	}

	public void setPostingtype(String postingtype) {
		this.postingtype = postingtype;
	}

	@Basic
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=60)
	public String getReportlinesetname() {
		return reportlinesetname;
	}

	public void setReportlinesetname(String reportlinesetname) {
		this.reportlinesetname = reportlinesetname;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}