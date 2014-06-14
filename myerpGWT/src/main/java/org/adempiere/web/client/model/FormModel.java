package org.adempiere.web.client.model;

public class FormModel implements ExchangeModel {
	private Integer	adFormId;
	private String	accesslevel;
	private Integer	adClientId;
	private Integer	adOrgId;
	private String	classname;
	private String	description;
	private String	help;
	private Boolean	isActive;
	private Boolean	isBetafunctionality;
	private String	jspurl;
	private String	name;

	public Integer getAdFormId() {
		return adFormId;
	}

	public void setAdFormId(Integer adFormId) {
		this.adFormId = adFormId;
	}

	public String getAccesslevel() {
		return accesslevel;
	}

	public void setAccesslevel(String accesslevel) {
		this.accesslevel = accesslevel;
	}

	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsBetafunctionality() {
		return isBetafunctionality;
	}

	public void setIsBetafunctionality(Boolean isBetafunctionality) {
		this.isBetafunctionality = isBetafunctionality;
	}

	public String getJspurl() {
		return jspurl;
	}

	public void setJspurl(String jspurl) {
		this.jspurl = jspurl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
