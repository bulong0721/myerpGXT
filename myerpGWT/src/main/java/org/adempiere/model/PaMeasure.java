package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_measure")
public class PaMeasure extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cProjecttypeId;
	private String calculationclass;
	private String created;
	private Integer createdby;
	private String description;
	private Boolean isactive;
	private BigDecimal manualactual;
	private String manualnote;
	private String measuredatatype;
	private String measuretype;
	private String name;
	private Integer paBenchmarkId;
	private Integer paHierarchyId;
	private Integer paMeasureId;
	private Integer paMeasurecalcId;
	private Integer paRatioId;
	private Integer rRequesttypeId;
	private String updated;
	private Integer updatedby;

	public PaMeasure() {
	}

	public PaMeasure(Integer paMeasureId) {
		this.paMeasureId = paMeasureId;
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
	@Column(name="C_PROJECTTYPE_ID", columnDefinition="INT")
	public Integer getCProjecttypeId() {
		return cProjecttypeId;
	}

	public void setCProjecttypeId(Integer cProjecttypeId) {
		this.cProjecttypeId = cProjecttypeId;
	}

	@Basic
	@Column(length=60)
	public String getCalculationclass() {
		return calculationclass;
	}

	public void setCalculationclass(String calculationclass) {
		this.calculationclass = calculationclass;
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
	public BigDecimal getManualactual() {
		return manualactual;
	}

	public void setManualactual(BigDecimal manualactual) {
		this.manualactual = manualactual;
	}

	@Basic
	@Column(length=2000)
	public String getManualnote() {
		return manualnote;
	}

	public void setManualnote(String manualnote) {
		this.manualnote = manualnote;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getMeasuredatatype() {
		return measuredatatype;
	}

	public void setMeasuredatatype(String measuredatatype) {
		this.measuredatatype = measuredatatype;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getMeasuretype() {
		return measuretype;
	}

	public void setMeasuretype(String measuretype) {
		this.measuretype = measuretype;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name="PA_BENCHMARK_ID", columnDefinition="INT")
	public Integer getPaBenchmarkId() {
		return paBenchmarkId;
	}

	public void setPaBenchmarkId(Integer paBenchmarkId) {
		this.paBenchmarkId = paBenchmarkId;
	}

	@Basic
	@Column(name="PA_HIERARCHY_ID", columnDefinition="INT")
	public Integer getPaHierarchyId() {
		return paHierarchyId;
	}

	public void setPaHierarchyId(Integer paHierarchyId) {
		this.paHierarchyId = paHierarchyId;
	}

	@Id
	@Column(name="PA_MEASURE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_489", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "PA_Measure", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_489")
	public Integer getPaMeasureId() {
		return paMeasureId;
	}

	public void setPaMeasureId(Integer paMeasureId) {
		this.paMeasureId = paMeasureId;
	}

	@Basic
	@Column(name="PA_MEASURECALC_ID", columnDefinition="INT")
	public Integer getPaMeasurecalcId() {
		return paMeasurecalcId;
	}

	public void setPaMeasurecalcId(Integer paMeasurecalcId) {
		this.paMeasurecalcId = paMeasurecalcId;
	}

	@Basic
	@Column(name="PA_RATIO_ID", columnDefinition="INT")
	public Integer getPaRatioId() {
		return paRatioId;
	}

	public void setPaRatioId(Integer paRatioId) {
		this.paRatioId = paRatioId;
	}

	@Basic
	@Column(name="R_REQUESTTYPE_ID", columnDefinition="INT")
	public Integer getRRequesttypeId() {
		return rRequesttypeId;
	}

	public void setRRequesttypeId(Integer rRequesttypeId) {
		this.rRequesttypeId = rRequesttypeId;
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