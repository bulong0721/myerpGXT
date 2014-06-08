package org.adempiere.common;

import java.io.Serializable;
import java.util.List;

public class ADUserContext implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private Integer				aDClientID;
	private Integer				aDOrgID;
	private Integer				aDUserID;
	private String				birthday;
	private String				eMail;
	private String				name;
	private String				notificationType;
	private String				phone;
	private String				phone2;
	private Integer				aDRoleID;
	private List<Integer>		userRoles;

	public Integer getADRoleID() {
		return aDRoleID;
	}

	public void setADRoleID(Integer aDRoleID) {
		this.aDRoleID = aDRoleID;
	}

	public List<Integer> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<Integer> userRoles) {
		this.userRoles = userRoles;
	}

	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

}
