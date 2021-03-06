package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_requestprocessorlog")
@IdClass(org.adempiere.model.RRequestProcessorLogPK.class)
public class RRequestProcessorLog extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private byte[] binaryData;
	private String created;
	private Integer createdBy;
	private String description;
	private Boolean error;
	private Integer rRequestProcessorID;
	private Integer rRequestProcessorLogID;
	private String reference;
	private String summary;
	private String textMsg;
	private String updated;
	private Integer updatedBy;

	public RRequestProcessorLog() {
	}

	public RRequestProcessorLog(Integer rRequestProcessorID, Integer rRequestProcessorLogID) {
		this.rRequestProcessorID = rRequestProcessorID;
		this.rRequestProcessorLogID = rRequestProcessorLogID;
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
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(columnDefinition="LONGBLOB")
	public byte[] getBinaryData() {
		return binaryData;
	}

	public void setBinaryData(byte[] binaryData) {
		this.binaryData = binaryData;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="ISERROR", nullable=false)
	public Boolean isError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	@Id
	@Column(name="R_REQUESTPROCESSOR_ID", columnDefinition="INT")
	public Integer getRRequestProcessorID() {
		return rRequestProcessorID;
	}

	public void setRRequestProcessorID(Integer rRequestProcessorID) {
		this.rRequestProcessorID = rRequestProcessorID;
	}

	@Id
	@Column(name="R_REQUESTPROCESSORLOG_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_834", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "R_RequestProcessorLog", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_834")
	public Integer getRRequestProcessorLogID() {
		return rRequestProcessorLogID;
	}

	public void setRRequestProcessorLogID(Integer rRequestProcessorLogID) {
		this.rRequestProcessorLogID = rRequestProcessorLogID;
	}

	@Basic
	@Column(length=60)
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Basic
	@Column(length=2000)
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Basic
	@Column(length=2000)
	public String getTextMsg() {
		return textMsg;
	}

	public void setTextMsg(String textMsg) {
		this.textMsg = textMsg;
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