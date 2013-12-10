package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bp_edi database table.
 * 
 */
@Entity
@Table(name="c_bp_edi")
@NamedQuery(name="CBpEdi.findAll", query="SELECT c FROM CBpEdi c")
public class CBpEdi extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBpEdiId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adSequenceId;
	private BigDecimal cBpartnerId;
	private Timestamp created;
	private BigDecimal createdby;
	private String customerno;
	private String description;
	private String editype;
	private String emailErrorTo;
	private String emailFrom;
	private String emailFromPwd;
	private String emailFromUid;
	private String emailInfoTo;
	private String emailTo;
	private String isactive;
	private String isaudited;
	private String isinfosent;
	private BigDecimal mWarehouseId;
	private String name;
	private String receiveinquiryreply;
	private String receiveorderreply;
	private String sendinquiry;
	private String sendorder;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBpEdi() {
	}


	@Id
	@Column(name="C_BP_EDI_ID")
	public long getCBpEdiId() {
		return this.cBpEdiId;
	}

	public void setCBpEdiId(long cBpEdiId) {
		this.cBpEdiId = cBpEdiId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_SEQUENCE_ID")
	public BigDecimal getAdSequenceId() {
		return this.adSequenceId;
	}

	public void setAdSequenceId(BigDecimal adSequenceId) {
		this.adSequenceId = adSequenceId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}


	public String getCustomerno() {
		return this.customerno;
	}

	public void setCustomerno(String customerno) {
		this.customerno = customerno;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getEditype() {
		return this.editype;
	}

	public void setEditype(String editype) {
		this.editype = editype;
	}


	@Column(name="EMAIL_ERROR_TO")
	public String getEmailErrorTo() {
		return this.emailErrorTo;
	}

	public void setEmailErrorTo(String emailErrorTo) {
		this.emailErrorTo = emailErrorTo;
	}


	@Column(name="EMAIL_FROM")
	public String getEmailFrom() {
		return this.emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}


	@Column(name="EMAIL_FROM_PWD")
	public String getEmailFromPwd() {
		return this.emailFromPwd;
	}

	public void setEmailFromPwd(String emailFromPwd) {
		this.emailFromPwd = emailFromPwd;
	}


	@Column(name="EMAIL_FROM_UID")
	public String getEmailFromUid() {
		return this.emailFromUid;
	}

	public void setEmailFromUid(String emailFromUid) {
		this.emailFromUid = emailFromUid;
	}


	@Column(name="EMAIL_INFO_TO")
	public String getEmailInfoTo() {
		return this.emailInfoTo;
	}

	public void setEmailInfoTo(String emailInfoTo) {
		this.emailInfoTo = emailInfoTo;
	}


	@Column(name="EMAIL_TO")
	public String getEmailTo() {
		return this.emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsaudited() {
		return this.isaudited;
	}

	public void setIsaudited(String isaudited) {
		this.isaudited = isaudited;
	}


	public String getIsinfosent() {
		return this.isinfosent;
	}

	public void setIsinfosent(String isinfosent) {
		this.isinfosent = isinfosent;
	}


	@Column(name="M_WAREHOUSE_ID")
	public BigDecimal getMWarehouseId() {
		return this.mWarehouseId;
	}

	public void setMWarehouseId(BigDecimal mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getReceiveinquiryreply() {
		return this.receiveinquiryreply;
	}

	public void setReceiveinquiryreply(String receiveinquiryreply) {
		this.receiveinquiryreply = receiveinquiryreply;
	}


	public String getReceiveorderreply() {
		return this.receiveorderreply;
	}

	public void setReceiveorderreply(String receiveorderreply) {
		this.receiveorderreply = receiveorderreply;
	}


	public String getSendinquiry() {
		return this.sendinquiry;
	}

	public void setSendinquiry(String sendinquiry) {
		this.sendinquiry = sendinquiry;
	}


	public String getSendorder() {
		return this.sendorder;
	}

	public void setSendorder(String sendorder) {
		this.sendorder = sendorder;
	}


	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}

}