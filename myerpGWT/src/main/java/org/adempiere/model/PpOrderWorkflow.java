package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pp_order_workflow")
public class PpOrderWorkflow extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private String accesslevel;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adTableId;
	private Integer adWfNodeId;
	private Integer adWfResponsibleId;
	private Integer adWorkflowId;
	private Integer adWorkflowprocessorId;
	private String author;
	private BigDecimal cost;
	private String created;
	private Integer createdby;
	private String description;
	private String documentno;
	private Integer duration;
	private String durationunit;
	private String entitytype;
	private String help;
	private Boolean isactive;
	private Boolean isdefault;
	private Integer limit;
	private Integer movingtime;
	private String name;
	private BigDecimal overlapunits;
	private Integer ppOrderId;
	private Integer ppOrderNodeId;
	private Integer ppOrderWorkflowId;
	private Integer priority;
	private String processtype;
	private String publishstatus;
	private BigDecimal qtybatchsize;
	private Integer queuingtime;
	private Integer sResourceId;
	private Integer setuptime;
	private BigDecimal unitscycles;
	private String updated;
	private Integer updatedby;
	private String validateworkflow;
	private String validfrom;
	private String validto;
	private String value;
	private Integer version;
	private Integer waitingtime;
	private String workflowtype;
	private Integer workingtime;
	private Integer yield;

	public PpOrderWorkflow() {
	}

	public PpOrderWorkflow(Integer ppOrderWorkflowId) {
		this.ppOrderWorkflowId = ppOrderWorkflowId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getAccesslevel() {
		return accesslevel;
	}

	public void setAccesslevel(String accesslevel) {
		this.accesslevel = accesslevel;
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
	@Column(name="AD_TABLE_ID", columnDefinition="INT")
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	@Basic
	@Column(name="AD_WF_NODE_ID", columnDefinition="INT")
	public Integer getAdWfNodeId() {
		return adWfNodeId;
	}

	public void setAdWfNodeId(Integer adWfNodeId) {
		this.adWfNodeId = adWfNodeId;
	}

	@Basic
	@Column(name="AD_WF_RESPONSIBLE_ID", columnDefinition="INT")
	public Integer getAdWfResponsibleId() {
		return adWfResponsibleId;
	}

	public void setAdWfResponsibleId(Integer adWfResponsibleId) {
		this.adWfResponsibleId = adWfResponsibleId;
	}

	@Basic
	@Column(name="AD_WORKFLOW_ID", columnDefinition="INT", nullable=false)
	public Integer getAdWorkflowId() {
		return adWorkflowId;
	}

	public void setAdWorkflowId(Integer adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
	}

	@Basic
	@Column(name="AD_WORKFLOWPROCESSOR_ID", columnDefinition="INT")
	public Integer getAdWorkflowprocessorId() {
		return adWorkflowprocessorId;
	}

	public void setAdWorkflowprocessorId(Integer adWorkflowprocessorId) {
		this.adWorkflowprocessorId = adWorkflowprocessorId;
	}

	@Basic
	@Column(nullable=false, length=20)
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Basic
	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=32)
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getDurationunit() {
		return durationunit;
	}

	public void setDurationunit(String durationunit) {
		this.durationunit = durationunit;
	}

	@Basic
	@Column(nullable=false, length=40)
	public String getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	public Boolean isIsdefault() {
		return isdefault;
	}

	public void setIsdefault(Boolean isdefault) {
		this.isdefault = isdefault;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getMovingtime() {
		return movingtime;
	}

	public void setMovingtime(Integer movingtime) {
		this.movingtime = movingtime;
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
	public BigDecimal getOverlapunits() {
		return overlapunits;
	}

	public void setOverlapunits(BigDecimal overlapunits) {
		this.overlapunits = overlapunits;
	}

	@Basic
	@Column(name="PP_ORDER_ID", columnDefinition="INT", nullable=false)
	public Integer getPpOrderId() {
		return ppOrderId;
	}

	public void setPpOrderId(Integer ppOrderId) {
		this.ppOrderId = ppOrderId;
	}

	@Basic
	@Column(name="PP_ORDER_NODE_ID", columnDefinition="INT")
	public Integer getPpOrderNodeId() {
		return ppOrderNodeId;
	}

	public void setPpOrderNodeId(Integer ppOrderNodeId) {
		this.ppOrderNodeId = ppOrderNodeId;
	}

	@Id
	@Column(name="PP_ORDER_WORKFLOW_ID", columnDefinition="INT")
	public Integer getPpOrderWorkflowId() {
		return ppOrderWorkflowId;
	}

	public void setPpOrderWorkflowId(Integer ppOrderWorkflowId) {
		this.ppOrderWorkflowId = ppOrderWorkflowId;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Basic
	@Column(length=2)
	public String getProcesstype() {
		return processtype;
	}

	public void setProcesstype(String processtype) {
		this.processtype = processtype;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPublishstatus() {
		return publishstatus;
	}

	public void setPublishstatus(String publishstatus) {
		this.publishstatus = publishstatus;
	}

	@Basic
	public BigDecimal getQtybatchsize() {
		return qtybatchsize;
	}

	public void setQtybatchsize(BigDecimal qtybatchsize) {
		this.qtybatchsize = qtybatchsize;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getQueuingtime() {
		return queuingtime;
	}

	public void setQueuingtime(Integer queuingtime) {
		this.queuingtime = queuingtime;
	}

	@Basic
	@Column(name="S_RESOURCE_ID", columnDefinition="INT")
	public Integer getSResourceId() {
		return sResourceId;
	}

	public void setSResourceId(Integer sResourceId) {
		this.sResourceId = sResourceId;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSetuptime() {
		return setuptime;
	}

	public void setSetuptime(Integer setuptime) {
		this.setuptime = setuptime;
	}

	@Basic
	public BigDecimal getUnitscycles() {
		return unitscycles;
	}

	public void setUnitscycles(BigDecimal unitscycles) {
		this.unitscycles = unitscycles;
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
	@Column(length=1)
	public String getValidateworkflow() {
		return validateworkflow;
	}

	public void setValidateworkflow(String validateworkflow) {
		this.validateworkflow = validateworkflow;
	}

	@Basic
	public String getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}

	@Basic
	public String getValidto() {
		return validto;
	}

	public void setValidto(String validto) {
		this.validto = validto;
	}

	@Basic
	@Column(length=240)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getWaitingtime() {
		return waitingtime;
	}

	public void setWaitingtime(Integer waitingtime) {
		this.waitingtime = waitingtime;
	}

	@Basic
	@Column(length=1)
	public String getWorkflowtype() {
		return workflowtype;
	}

	public void setWorkflowtype(String workflowtype) {
		this.workflowtype = workflowtype;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getWorkingtime() {
		return workingtime;
	}

	public void setWorkingtime(Integer workingtime) {
		this.workingtime = workingtime;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getYield() {
		return yield;
	}

	public void setYield(Integer yield) {
		this.yield = yield;
	}
}