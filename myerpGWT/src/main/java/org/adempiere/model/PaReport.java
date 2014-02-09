package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_report")
public class PaReport extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adPrintformatId;
	private Integer cAcctschemaId;
	private Integer cCalendarId;
	private String created;
	private Integer createdby;
	private String description;
	private Boolean isactive;
	private Integer jasperprocessId;
	private String jasperprocessing;
	private String listsources;
	private String listtrx;
	private String name;
	private Integer paReportId;
	private Integer paReportcolumnsetId;
	private Integer paReportcubeId;
	private Integer paReportlinesetId;
	private Boolean processing;
	private String updated;
	private Integer updatedby;

	public PaReport() {
	}

	public PaReport(Integer paReportId) {
		this.paReportId = paReportId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
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
	@Column(name="AD_PRINTFORMAT_ID", columnDefinition="INT")
	public Integer getAdPrintformatId() {
		return adPrintformatId;
	}

	public void setAdPrintformatId(Integer adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
	}

	@Basic
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT", nullable=false)
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Basic
	@Column(name="C_CALENDAR_ID", columnDefinition="INT", nullable=false)
	public Integer getCCalendarId() {
		return cCalendarId;
	}

	public void setCCalendarId(Integer cCalendarId) {
		this.cCalendarId = cCalendarId;
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
	@Column(columnDefinition="INT", nullable=false)
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(name="JASPERPROCESS_ID", columnDefinition="INT")
	public Integer getJasperprocessId() {
		return jasperprocessId;
	}

	public void setJasperprocessId(Integer jasperprocessId) {
		this.jasperprocessId = jasperprocessId;
	}

	@Basic
	@Column(length=1)
	public String getJasperprocessing() {
		return jasperprocessing;
	}

	public void setJasperprocessing(String jasperprocessing) {
		this.jasperprocessing = jasperprocessing;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getListsources() {
		return listsources;
	}

	public void setListsources(String listsources) {
		this.listsources = listsources;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getListtrx() {
		return listtrx;
	}

	public void setListtrx(String listtrx) {
		this.listtrx = listtrx;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@Column(name="PA_REPORT_ID", columnDefinition="INT")
	public Integer getPaReportId() {
		return paReportId;
	}

	public void setPaReportId(Integer paReportId) {
		this.paReportId = paReportId;
	}

	@Basic
	@Column(name="PA_REPORTCOLUMNSET_ID", columnDefinition="INT", nullable=false)
	public Integer getPaReportcolumnsetId() {
		return paReportcolumnsetId;
	}

	public void setPaReportcolumnsetId(Integer paReportcolumnsetId) {
		this.paReportcolumnsetId = paReportcolumnsetId;
	}

	@Basic
	@Column(name="PA_REPORTCUBE_ID", columnDefinition="INT")
	public Integer getPaReportcubeId() {
		return paReportcubeId;
	}

	public void setPaReportcubeId(Integer paReportcubeId) {
		this.paReportcubeId = paReportcubeId;
	}

	@Basic
	@Column(name="PA_REPORTLINESET_ID", columnDefinition="INT", nullable=false)
	public Integer getPaReportlinesetId() {
		return paReportlinesetId;
	}

	public void setPaReportlinesetId(Integer paReportlinesetId) {
		this.paReportlinesetId = paReportlinesetId;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}