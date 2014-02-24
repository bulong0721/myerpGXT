package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_productoperation")
public class MProductoperation extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String description;
	private String help;
	private Boolean isactive;
	private Integer mProductId;
	private Integer mProductoperationId;
	private String name;
	private BigDecimal setuptime;
	private BigDecimal teardowntime;
	private BigDecimal unitruntime;
	private String updated;
	private Integer updatedby;

	public MProductoperation() {
	}

	public MProductoperation(Integer mProductoperationId) {
		this.mProductoperationId = mProductoperationId;
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
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
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
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Id
	@Column(name="M_PRODUCTOPERATION_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1132", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_ProductOperation", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1132")
	public Integer getMProductoperationId() {
		return mProductoperationId;
	}

	public void setMProductoperationId(Integer mProductoperationId) {
		this.mProductoperationId = mProductoperationId;
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
	public BigDecimal getSetuptime() {
		return setuptime;
	}

	public void setSetuptime(BigDecimal setuptime) {
		this.setuptime = setuptime;
	}

	@Basic
	public BigDecimal getTeardowntime() {
		return teardowntime;
	}

	public void setTeardowntime(BigDecimal teardowntime) {
		this.teardowntime = teardowntime;
	}

	@Basic
	public BigDecimal getUnitruntime() {
		return unitruntime;
	}

	public void setUnitruntime(BigDecimal unitruntime) {
		this.unitruntime = unitruntime;
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