package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_reportcube")
public class PaReportcube extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cCalendarId;
	private String created;
	private Integer createdby;
	private String description;
	private Boolean isactive;
	private Boolean isactivitydim;
	private Boolean isbpartnerdim;
	private Boolean iscampaigndim;
	private Boolean isglbudgetdim;
	private Boolean islocfromdim;
	private Boolean isloctodim;
	private Boolean isorgtrxdim;
	private Boolean isproductdim;
	private Boolean isprojectdim;
	private Boolean isprojectphasedim;
	private Boolean isprojecttaskdim;
	private Boolean issalesregiondim;
	private Boolean issubacctdim;
	private Boolean isuser1dim;
	private Boolean isuser2dim;
	private Boolean isuserelement1dim;
	private Boolean isuserelement2dim;
	private String lastrecalculated;
	private String name;
	private Integer paReportcubeId;
	private Boolean processing;
	private String updated;
	private Integer updatedby;

	public PaReportcube() {
	}

	public PaReportcube(Integer paReportcubeId) {
		this.paReportcubeId = paReportcubeId;
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
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
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
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	public Boolean isIsactivitydim() {
		return isactivitydim;
	}

	public void setIsactivitydim(Boolean isactivitydim) {
		this.isactivitydim = isactivitydim;
	}

	@Basic
	public Boolean isIsbpartnerdim() {
		return isbpartnerdim;
	}

	public void setIsbpartnerdim(Boolean isbpartnerdim) {
		this.isbpartnerdim = isbpartnerdim;
	}

	@Basic
	public Boolean isIscampaigndim() {
		return iscampaigndim;
	}

	public void setIscampaigndim(Boolean iscampaigndim) {
		this.iscampaigndim = iscampaigndim;
	}

	@Basic
	public Boolean isIsglbudgetdim() {
		return isglbudgetdim;
	}

	public void setIsglbudgetdim(Boolean isglbudgetdim) {
		this.isglbudgetdim = isglbudgetdim;
	}

	@Basic
	public Boolean isIslocfromdim() {
		return islocfromdim;
	}

	public void setIslocfromdim(Boolean islocfromdim) {
		this.islocfromdim = islocfromdim;
	}

	@Basic
	public Boolean isIsloctodim() {
		return isloctodim;
	}

	public void setIsloctodim(Boolean isloctodim) {
		this.isloctodim = isloctodim;
	}

	@Basic
	public Boolean isIsorgtrxdim() {
		return isorgtrxdim;
	}

	public void setIsorgtrxdim(Boolean isorgtrxdim) {
		this.isorgtrxdim = isorgtrxdim;
	}

	@Basic
	public Boolean isIsproductdim() {
		return isproductdim;
	}

	public void setIsproductdim(Boolean isproductdim) {
		this.isproductdim = isproductdim;
	}

	@Basic
	public Boolean isIsprojectdim() {
		return isprojectdim;
	}

	public void setIsprojectdim(Boolean isprojectdim) {
		this.isprojectdim = isprojectdim;
	}

	@Basic
	public Boolean isIsprojectphasedim() {
		return isprojectphasedim;
	}

	public void setIsprojectphasedim(Boolean isprojectphasedim) {
		this.isprojectphasedim = isprojectphasedim;
	}

	@Basic
	public Boolean isIsprojecttaskdim() {
		return isprojecttaskdim;
	}

	public void setIsprojecttaskdim(Boolean isprojecttaskdim) {
		this.isprojecttaskdim = isprojecttaskdim;
	}

	@Basic
	public Boolean isIssalesregiondim() {
		return issalesregiondim;
	}

	public void setIssalesregiondim(Boolean issalesregiondim) {
		this.issalesregiondim = issalesregiondim;
	}

	@Basic
	public Boolean isIssubacctdim() {
		return issubacctdim;
	}

	public void setIssubacctdim(Boolean issubacctdim) {
		this.issubacctdim = issubacctdim;
	}

	@Basic
	public Boolean isIsuser1dim() {
		return isuser1dim;
	}

	public void setIsuser1dim(Boolean isuser1dim) {
		this.isuser1dim = isuser1dim;
	}

	@Basic
	public Boolean isIsuser2dim() {
		return isuser2dim;
	}

	public void setIsuser2dim(Boolean isuser2dim) {
		this.isuser2dim = isuser2dim;
	}

	@Basic
	public Boolean isIsuserelement1dim() {
		return isuserelement1dim;
	}

	public void setIsuserelement1dim(Boolean isuserelement1dim) {
		this.isuserelement1dim = isuserelement1dim;
	}

	@Basic
	public Boolean isIsuserelement2dim() {
		return isuserelement2dim;
	}

	public void setIsuserelement2dim(Boolean isuserelement2dim) {
		this.isuserelement2dim = isuserelement2dim;
	}

	@Basic
	public String getLastrecalculated() {
		return lastrecalculated;
	}

	public void setLastrecalculated(String lastrecalculated) {
		this.lastrecalculated = lastrecalculated;
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
	@Column(name="PA_REPORTCUBE_ID", columnDefinition="INT")
	public Integer getPaReportcubeId() {
		return paReportcubeId;
	}

	public void setPaReportcubeId(Integer paReportcubeId) {
		this.paReportcubeId = paReportcubeId;
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