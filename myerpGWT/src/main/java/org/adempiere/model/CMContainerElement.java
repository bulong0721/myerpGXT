package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_container_element")
public class CMContainerElement extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cMContainerElementID;
	private Integer cMContainerID;
	private String contentHTML;
	private String created;
	private Integer createdBy;
	private String description;
	private String help;
	private String name;
	private String updated;
	private Integer updatedBy;
	private String valid;

	public CMContainerElement() {
	}

	public CMContainerElement(Integer cMContainerElementID) {
		this.cMContainerElementID = cMContainerElementID;
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

	@Id
	@Column(name="CM_CONTAINER_ELEMENT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1241", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "CM_Container_Element", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1241")
	public Integer getCMContainerElementID() {
		return cMContainerElementID;
	}

	public void setCMContainerElementID(Integer cMContainerElementID) {
		this.cMContainerElementID = cMContainerElementID;
	}

	@Basic
	@Column(name="CM_CONTAINER_ID", columnDefinition="INT", nullable=false)
	public Integer getCMContainerID() {
		return cMContainerID;
	}

	public void setCMContainerID(Integer cMContainerID) {
		this.cMContainerID = cMContainerID;
	}

	@Basic
	@Column(columnDefinition="LONGTEXT")
	public String getContentHTML() {
		return contentHTML;
	}

	public void setContentHTML(String contentHTML) {
		this.contentHTML = contentHTML;
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
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
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

	@Basic
	@Column(name="ISVALID", nullable=false, length=1)
	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}
}