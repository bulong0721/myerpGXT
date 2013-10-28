package org.adempiere.web.shared.adempiere;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the AD_PROCESS_PARA database table.
 * 
 */
@Entity
@Table(name = "AD_PROCESS_PARA")
public class AdProcessPara extends org.adempiere.web.shared.AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adProcessParaId;
	private Long				adClientId;
	private Long				adElementId;
	private Long				adOrgId;
	private Integer				adReferenceId;
	private Long				adReferenceValueId;
	private Long				adValRuleId;
	private String				columnname;
	private String				created;
	private Long				createdby;
	private String				defaultvalue;
	private String				defaultvalue2;
	private String				description;
	private String				displaylogic;
	private String				entitytype;
	private Long				fieldlength;
	private String				help;
	private String				isactive;
	private String				iscentrallymaintained;
	private String				ismandatory;
	private String				isrange;
	private String				name;
	private String				readonlylogic;
	private Integer				seqno;
	private String				updated;
	private Long				updatedby;
	private String				valuemax;
	private String				valuemin;
	private String				vformat;
	private AdProcess			adProcess;

	public AdProcessPara() {
	}

	@Id
	@Column(name = "AD_PROCESS_PARA_ID")
	public long getAdProcessParaId() {
		return this.adProcessParaId;
	}

	public void setAdProcessParaId(long adProcessParaId) {
		this.adProcessParaId = adProcessParaId;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_ELEMENT_ID")
	public Long getAdElementId() {
		return this.adElementId;
	}

	public void setAdElementId(Long adElementId) {
		this.adElementId = adElementId;
	}

	@Column(name = "AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Column(name = "AD_REFERENCE_ID")
	public Integer getAdReferenceId() {
		return this.adReferenceId;
	}

	public void setAdReferenceId(Integer adReferenceId) {
		this.adReferenceId = adReferenceId;
	}

	@Column(name = "AD_REFERENCE_VALUE_ID")
	public Long getAdReferenceValueId() {
		return this.adReferenceValueId;
	}

	public void setAdReferenceValueId(Long adReferenceValueId) {
		this.adReferenceValueId = adReferenceValueId;
	}

	@Column(name = "AD_VAL_RULE_ID")
	public Long getAdValRuleId() {
		return this.adValRuleId;
	}

	public void setAdValRuleId(Long adValRuleId) {
		this.adValRuleId = adValRuleId;
	}

	public String getColumnname() {
		return this.columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public String getDefaultvalue() {
		return this.defaultvalue;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	public String getDefaultvalue2() {
		return this.defaultvalue2;
	}

	public void setDefaultvalue2(String defaultvalue2) {
		this.defaultvalue2 = defaultvalue2;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplaylogic() {
		return this.displaylogic;
	}

	public void setDisplaylogic(String displaylogic) {
		this.displaylogic = displaylogic;
	}

	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	public Long getFieldlength() {
		return this.fieldlength;
	}

	public void setFieldlength(Long fieldlength) {
		this.fieldlength = fieldlength;
	}

	@Column(name = "HELP")
	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIscentrallymaintained() {
		return this.iscentrallymaintained;
	}

	public void setIscentrallymaintained(String iscentrallymaintained) {
		this.iscentrallymaintained = iscentrallymaintained;
	}

	public String getIsmandatory() {
		return this.ismandatory;
	}

	public void setIsmandatory(String ismandatory) {
		this.ismandatory = ismandatory;
	}

	public String getIsrange() {
		return this.isrange;
	}

	public void setIsrange(String isrange) {
		this.isrange = isrange;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReadonlylogic() {
		return this.readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
	}

	public Integer getSeqno() {
		return this.seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Long getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}

	public String getValuemax() {
		return this.valuemax;
	}

	public void setValuemax(String valuemax) {
		this.valuemax = valuemax;
	}

	public String getValuemin() {
		return this.valuemin;
	}

	public void setValuemin(String valuemin) {
		this.valuemin = valuemin;
	}

	public String getVformat() {
		return this.vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}

	// bi-directional many-to-one association to AdProcess
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AD_PROCESS_ID")
	public AdProcess getAdProcess() {
		return this.adProcess;
	}

	public void setAdProcess(AdProcess adProcess) {
		this.adProcess = adProcess;
	}

}