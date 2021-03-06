package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="asp_process_para")
public class ASPProcessPara extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDProcessParaID;
	private Integer aSPProcessID;
	private Integer aSPProcessParaID;
	private String aSPStatus;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String updated;
	private Integer updatedBy;

	public ASPProcessPara() {
	}

	public ASPProcessPara(Integer aSPProcessParaID) {
		this.aSPProcessParaID = aSPProcessParaID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="AD_PROCESS_PARA_ID", columnDefinition="INT", nullable=false)
	public Integer getADProcessParaID() {
		return aDProcessParaID;
	}

	public void setADProcessParaID(Integer aDProcessParaID) {
		this.aDProcessParaID = aDProcessParaID;
	}

	@Basic
	@Column(name="ASP_PROCESS_ID", columnDefinition="INT")
	public Integer getASPProcessID() {
		return aSPProcessID;
	}

	public void setASPProcessID(Integer aSPProcessID) {
		this.aSPProcessID = aSPProcessID;
	}

	@Id
	@Column(name="ASP_PROCESS_PARA_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53067", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "ASP_Process_Para", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53067")
	public Integer getASPProcessParaID() {
		return aSPProcessParaID;
	}

	public void setASPProcessParaID(Integer aSPProcessParaID) {
		this.aSPProcessParaID = aSPProcessParaID;
	}

	@Basic
	@Column(name="ASP_STATUS", nullable=false, length=1)
	public String getASPStatus() {
		return aSPStatus;
	}

	public void setASPStatus(String aSPStatus) {
		this.aSPStatus = aSPStatus;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
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
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}