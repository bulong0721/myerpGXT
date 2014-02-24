package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="imp_processor")
public class ImpProcessor extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private String account;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String datelastrun;
	private String datenextrun;
	private String description;
	private Integer frequency;
	private String frequencytype;
	private String help;
	private String host;
	private Integer impProcessorId;
	private Integer impProcessorTypeId;
	private Boolean isactive;
	private Integer keeplogdays;
	private String name;
	private String passwordinfo;
	private Integer port;
	private String processing;
	private String updated;
	private Integer updatedby;
	private String value;

	public ImpProcessor() {
	}

	public ImpProcessor(Integer impProcessorId) {
		this.impProcessorId = impProcessorId;
	}

	@Basic
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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
	public String getDatelastrun() {
		return datelastrun;
	}

	public void setDatelastrun(String datelastrun) {
		this.datelastrun = datelastrun;
	}

	@Basic
	public String getDatenextrun() {
		return datenextrun;
	}

	public void setDatenextrun(String datenextrun) {
		this.datenextrun = datenextrun;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getFrequency() {
		return frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getFrequencytype() {
		return frequencytype;
	}

	public void setFrequencytype(String frequencytype) {
		this.frequencytype = frequencytype;
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
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Id
	@Column(name="IMP_PROCESSOR_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53094", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "IMP_Processor", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53094")
	public Integer getImpProcessorId() {
		return impProcessorId;
	}

	public void setImpProcessorId(Integer impProcessorId) {
		this.impProcessorId = impProcessorId;
	}

	@Basic
	@Column(name="IMP_PROCESSOR_TYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getImpProcessorTypeId() {
		return impProcessorTypeId;
	}

	public void setImpProcessorTypeId(Integer impProcessorTypeId) {
		this.impProcessorTypeId = impProcessorTypeId;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getKeeplogdays() {
		return keeplogdays;
	}

	public void setKeeplogdays(Integer keeplogdays) {
		this.keeplogdays = keeplogdays;
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
	public String getPasswordinfo() {
		return passwordinfo;
	}

	public void setPasswordinfo(String passwordinfo) {
		this.passwordinfo = passwordinfo;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	@Basic
	@Column(length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
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

	@Basic
	@Column(nullable=false, length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}