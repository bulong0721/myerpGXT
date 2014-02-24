package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_cyclestep")
public class CCyclestep extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cCycleId;
	private Integer cCyclestepId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private String name;
	private BigDecimal relativeweight;
	private Integer seqno;
	private String updated;
	private Integer updatedby;

	public CCyclestep() {
	}

	public CCyclestep(Integer cCyclestepId) {
		this.cCyclestepId = cCyclestepId;
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
	@Column(name="C_CYCLE_ID", columnDefinition="INT", nullable=false)
	public Integer getCCycleId() {
		return cCycleId;
	}

	public void setCCycleId(Integer cCycleId) {
		this.cCycleId = cCycleId;
	}

	@Id
	@Column(name="C_CYCLESTEP_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_745", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_CycleStep", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_745")
	public Integer getCCyclestepId() {
		return cCyclestepId;
	}

	public void setCCyclestepId(Integer cCyclestepId) {
		this.cCyclestepId = cCyclestepId;
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
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
	@Column(nullable=false)
	public BigDecimal getRelativeweight() {
		return relativeweight;
	}

	public void setRelativeweight(BigDecimal relativeweight) {
		this.relativeweight = relativeweight;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}