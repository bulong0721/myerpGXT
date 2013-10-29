package org.adempiere.web.client.model;

import java.io.Serializable;

import org.adempiere.model.common.DisplayType;

public class AdProcessParameter implements Serializable, IAdFormField {
	private static final long	serialVersionUID	= 1L;

	private long				adProcessParaId;
	private Integer				adReferenceId;
	private Long				adReferenceValueId;
	private Long				adValRuleId;
	private String				columnname;
	private String				defaultvalue;
	private String				displaylogic;
	private Long				fieldlength;
	private String				isactive;
	private String				iscentrallymaintained;
	private String				ismandatory;
	private String				name;
	private String				readonlylogic;
	private Integer				seqno;
	private String				valuemax;
	private String				valuemin;
	private String				vformat;

	public long getAdProcessParaId() {
		return adProcessParaId;
	}

	public void setAdProcessParaId(long adProcessParaId) {
		this.adProcessParaId = adProcessParaId;
	}

	public Integer getAdReferenceId() {
		return adReferenceId;
	}

	public void setAdReferenceId(Integer adReferenceId) {
		this.adReferenceId = adReferenceId;
	}

	public Long getAdReferenceValueId() {
		return adReferenceValueId;
	}

	public void setAdReferenceValueId(Long adReferenceValueId) {
		this.adReferenceValueId = adReferenceValueId;
	}

	public Long getAdValRuleId() {
		return adValRuleId;
	}

	public void setAdValRuleId(Long adValRuleId) {
		this.adValRuleId = adValRuleId;
	}

	public String getColumnname() {
		return columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}

	public String getDefaultvalue() {
		return defaultvalue;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	public String getDisplaylogic() {
		return displaylogic;
	}

	public void setDisplaylogic(String displaylogic) {
		this.displaylogic = displaylogic;
	}

	public Long getFieldlength() {
		return fieldlength;
	}

	public void setFieldlength(Long fieldlength) {
		this.fieldlength = fieldlength;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIscentrallymaintained() {
		return iscentrallymaintained;
	}

	public void setIscentrallymaintained(String iscentrallymaintained) {
		this.iscentrallymaintained = iscentrallymaintained;
	}

	public String getIsmandatory() {
		return ismandatory;
	}

	public void setIsmandatory(String ismandatory) {
		this.ismandatory = ismandatory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReadonlylogic() {
		return readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
	}

	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public String getValuemax() {
		return valuemax;
	}

	public void setValuemax(String valuemax) {
		this.valuemax = valuemax;
	}

	public String getValuemin() {
		return valuemin;
	}

	public void setValuemin(String valuemin) {
		this.valuemin = valuemin;
	}

	public String getVformat() {
		return vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}

	@Override
	public String getFieldgroup() {
		return null;
	}

	@Override
	public Boolean getIsdisplayed() {
		return true;
	}

	@Override
	public DisplayType getFieldType() {
		return DisplayType.fromInteger(adReferenceId);
	}

	@Override
	public Boolean getIsencryptedfield() {
		return false;
	}

	@Override
	public Boolean getIskey() {
		return false;
	}

}
