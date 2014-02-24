package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="asp_field")
public class AspField extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adFieldId;
	private Integer adOrgId;
	private Integer aspFieldId;
	private String aspStatus;
	private Integer aspTabId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private String updated;
	private Integer updatedby;

	public AspField() {
	}

	public AspField(Integer aspFieldId) {
		this.aspFieldId = aspFieldId;
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
	@Column(name="AD_FIELD_ID", columnDefinition="INT", nullable=false)
	public Integer getAdFieldId() {
		return adFieldId;
	}

	public void setAdFieldId(Integer adFieldId) {
		this.adFieldId = adFieldId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Id
	@Column(name="ASP_FIELD_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53065", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "ASP_Field", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53065")
	public Integer getAspFieldId() {
		return aspFieldId;
	}

	public void setAspFieldId(Integer aspFieldId) {
		this.aspFieldId = aspFieldId;
	}

	@Basic
	@Column(name="ASP_STATUS", nullable=false, length=1)
	public String getAspStatus() {
		return aspStatus;
	}

	public void setAspStatus(String aspStatus) {
		this.aspStatus = aspStatus;
	}

	@Basic
	@Column(name="ASP_TAB_ID", columnDefinition="INT")
	public Integer getAspTabId() {
		return aspTabId;
	}

	public void setAspTabId(Integer aspTabId) {
		this.aspTabId = aspTabId;
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