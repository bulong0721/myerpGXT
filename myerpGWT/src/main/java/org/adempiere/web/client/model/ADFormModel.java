package org.adempiere.web.client.model;

import java.io.Serializable;

public class ADFormModel implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adFormId;
	private String				accesslevel;
	private Long				adClientId;
	private Long				adOrgId;
	private String				classname;
	private String				description;
	private String				help;
	private Boolean				isActive;
	private Boolean				isBetafunctionality;
	private String				jspurl;
	private String				name;

	public long getAdFormId() {
		return adFormId;
	}

	public void setAdFormId(long adFormId) {
		this.adFormId = adFormId;
	}

	public String getAccesslevel() {
		return accesslevel;
	}

	public void setAccesslevel(String accesslevel) {
		this.accesslevel = accesslevel;
	}

	public Long getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	public Long getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
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
