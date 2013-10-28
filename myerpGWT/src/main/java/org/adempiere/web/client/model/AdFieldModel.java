package org.adempiere.web.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.util.StringUtil;
import org.adempiere.web.shared.adempiere.AdFieldV;
import org.adempiere.web.shared.adempiere.DisplayType;


public class AdFieldModel implements Serializable, IAdFormField {
	private static final long	serialVersionUID	= 1L;
	private Long				adProcessId;
	private Integer				adReferenceId;
	private Long				adReferenceValueId;
	private String				callout;
	private String				columnname;
	private String				defaultvalue;
	private String				fieldgroup;
	private String				fieldgrouptype;
	private Integer				fieldlength;
	private Boolean				isdisplayed;
	private Boolean				isencryptedcolumn;
	private Boolean				isencryptedfield;
	private Boolean				isfieldonly;
	private Boolean				iskey;
	private Boolean				ismandatory;
	private Boolean				isparent;
	private Boolean				isreadonly;
	private Boolean				issameline;
	private String				name;
	private String				readonlylogic;
	private Integer				seqno;
	private Integer				sortno;
	private String				tablename;
	private String				validationcode;
	private String				valuemax;
	private String				valuemin;
	private String				vformat;

	private Long				adFieldId;

	public Long getAdFieldId() {
		return adFieldId;
	}

	public AdFieldModel() {
	}

	public AdFieldModel(AdFieldV fieldEntity) {
		adFieldId = fieldEntity.getAdFieldId();
		adProcessId = fieldEntity.getAdProcessId();
		adReferenceId = fieldEntity.getAdReferenceId();
		adReferenceValueId = fieldEntity.getAdReferenceValueId();
		callout = fieldEntity.getCallout();
		columnname = fieldEntity.getColumnname();
		defaultvalue = fieldEntity.getDefaultvalue();
		fieldgroup = fieldEntity.getFieldgroup();
		fieldgrouptype = fieldEntity.getFieldgrouptype();
		fieldlength = fieldEntity.getFieldlength();
		isdisplayed = StringUtil.isYes(fieldEntity.getIsdisplayed());
		isencryptedcolumn = StringUtil.isYes(fieldEntity.getIsencryptedcolumn());
		isencryptedfield = StringUtil.isYes(fieldEntity.getIsencryptedfield());
		isfieldonly = StringUtil.isYes(fieldEntity.getIsfieldonly());
		iskey = StringUtil.isYes(fieldEntity.getIskey());
		ismandatory = StringUtil.isYes(fieldEntity.getIsmandatory());
		isparent = StringUtil.isYes(fieldEntity.getIsparent());
		isreadonly = StringUtil.isYes(fieldEntity.getIsreadonly());
		name = fieldEntity.getName();
		readonlylogic = fieldEntity.getReadonlylogic();
		seqno = fieldEntity.getSeqno();
		sortno = fieldEntity.getSortno();
		tablename = fieldEntity.getTablename();
		validationcode = fieldEntity.getValidationcode();
		valuemax = fieldEntity.getValuemax();
		valuemin = fieldEntity.getValuemin();
		vformat = fieldEntity.getVformat();
	}

	public DisplayType getFieldType() {
		return DisplayType.fromInteger(adReferenceId);
	}

	public static List<AdFieldModel> from(List<AdFieldV> fieldList) {
		int size = null == fieldList ? 0 : fieldList.size();
		List<AdFieldModel> resultList = new ArrayList<AdFieldModel>(size);
		if (null != fieldList) {
			for (AdFieldV fieldEntity : fieldList) {
				resultList.add(new AdFieldModel(fieldEntity));
			}
		}
		return resultList;
	}

	public Long getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(Long adProcessId) {
		this.adProcessId = adProcessId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getAdReferenceId()
	 */
	@Override
	public Integer getAdReferenceId() {
		return adReferenceId;
	}

	public void setAdReferenceId(Integer adReferenceId) {
		this.adReferenceId = adReferenceId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getAdReferenceValueId()
	 */
	@Override
	public Long getAdReferenceValueId() {
		return adReferenceValueId;
	}

	public void setAdReferenceValueId(Long adReferenceValueId) {
		this.adReferenceValueId = adReferenceValueId;
	}

	public String getCallout() {
		return callout;
	}

	public void setCallout(String callout) {
		this.callout = callout;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getColumnname()
	 */
	@Override
	public String getColumnname() {
		return columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getDefaultvalue()
	 */
	@Override
	public String getDefaultvalue() {
		return defaultvalue;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getFieldgroup()
	 */
	@Override
	public String getFieldgroup() {
		return fieldgroup;
	}

	public void setFieldgroup(String fieldgroup) {
		this.fieldgroup = fieldgroup;
	}

	public String getFieldgrouptype() {
		return fieldgrouptype;
	}

	public void setFieldgrouptype(String fieldgrouptype) {
		this.fieldgrouptype = fieldgrouptype;
	}

	public Integer getFieldlength() {
		return fieldlength;
	}

	public void setFieldlength(Integer fieldlength) {
		this.fieldlength = fieldlength;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getIsdisplayed()
	 */
	@Override
	public Boolean getIsdisplayed() {
		return isdisplayed;
	}

	public void setIsdisplayed(Boolean isdisplayed) {
		this.isdisplayed = isdisplayed;
	}

	public Boolean getIsencryptedcolumn() {
		return isencryptedcolumn;
	}

	public void setIsencryptedcolumn(Boolean isencryptedcolumn) {
		this.isencryptedcolumn = isencryptedcolumn;
	}

	public Boolean getIsencryptedfield() {
		return isencryptedfield;
	}

	public void setIsencryptedfield(Boolean isencryptedfield) {
		this.isencryptedfield = isencryptedfield;
	}

	public Boolean getIsfieldonly() {
		return isfieldonly;
	}

	public void setIsfieldonly(Boolean isfieldonly) {
		this.isfieldonly = isfieldonly;
	}

	public Boolean getIskey() {
		return iskey;
	}

	public void setIskey(Boolean iskey) {
		this.iskey = iskey;
	}

	public Boolean getIsmandatory() {
		return ismandatory;
	}

	public void setIsmandatory(Boolean ismandatory) {
		this.ismandatory = ismandatory;
	}

	public Boolean getIsparent() {
		return isparent;
	}

	public void setIsparent(Boolean isparent) {
		this.isparent = isparent;
	}

	public Boolean getIsreadonly() {
		return isreadonly;
	}

	public void setIsreadonly(Boolean isreadonly) {
		this.isreadonly = isreadonly;
	}

	public Boolean getIssameline() {
		return issameline;
	}

	public void setIssameline(Boolean issameline) {
		this.issameline = issameline;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getReadonlylogic()
	 */
	@Override
	public String getReadonlylogic() {
		return readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getSeqno()
	 */
	@Override
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public Integer getSortno() {
		return sortno;
	}

	public void setSortno(Integer sortno) {
		this.sortno = sortno;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getValidationcode() {
		return validationcode;
	}

	public void setValidationcode(String validationcode) {
		this.validationcode = validationcode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getValuemax()
	 */
	@Override
	public String getValuemax() {
		return valuemax;
	}

	public void setValuemax(String valuemax) {
		this.valuemax = valuemax;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getValuemin()
	 */
	@Override
	public String getValuemin() {
		return valuemin;
	}

	public void setValuemin(String valuemin) {
		this.valuemin = valuemin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdParameter#getVformat()
	 */
	@Override
	public String getVformat() {
		return vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}

}