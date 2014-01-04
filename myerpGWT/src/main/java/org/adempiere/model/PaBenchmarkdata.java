package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_benchmarkdata")
public class PaBenchmarkdata extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String benchmarkdate;
	private BigDecimal benchmarkvalue;
	private String created;
	private Integer createdby;
	private String description;
	private String isactive;
	private String name;
	private Integer paBenchmarkId;
	private Integer paBenchmarkdataId;
	private String updated;
	private Integer updatedby;

	public PaBenchmarkdata() {
	}

	public PaBenchmarkdata(Integer paBenchmarkdataId) {
		this.paBenchmarkdataId = paBenchmarkdataId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(nullable=false)
	public String getBenchmarkdate() {
		return benchmarkdate;
	}

	public void setBenchmarkdate(String benchmarkdate) {
		this.benchmarkdate = benchmarkdate;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getBenchmarkvalue() {
		return benchmarkvalue;
	}

	public void setBenchmarkvalue(BigDecimal benchmarkvalue) {
		this.benchmarkvalue = benchmarkvalue;
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
	@Column(nullable=false)
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
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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
	@Column(name="PA_BENCHMARK_ID", nullable=false)
	public Integer getPaBenchmarkId() {
		return paBenchmarkId;
	}

	public void setPaBenchmarkId(Integer paBenchmarkId) {
		this.paBenchmarkId = paBenchmarkId;
	}

	@Id
	@Column(name="PA_BENCHMARKDATA_ID")
	public Integer getPaBenchmarkdataId() {
		return paBenchmarkdataId;
	}

	public void setPaBenchmarkdataId(Integer paBenchmarkdataId) {
		this.paBenchmarkdataId = paBenchmarkdataId;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}