package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_interorg_acct database table.
 * 
 */
@Entity
@Table(name="c_interorg_acct")
@NamedQuery(name="CInterorgAcct.findAll", query="SELECT c FROM CInterorgAcct c")
public class CInterorgAcct extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CInterorgAcctPK id;
	private BigDecimal adClientId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal intercompanyduefromAcct;
	private BigDecimal intercompanyduetoAcct;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CInterorgAcct() {
	}


	@EmbeddedId
	public CInterorgAcctPK getId() {
		return this.id;
	}

	public void setId(CInterorgAcctPK id) {
		this.id = id;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
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


	@Column(name="INTERCOMPANYDUEFROM_ACCT")
	public BigDecimal getIntercompanyduefromAcct() {
		return this.intercompanyduefromAcct;
	}

	public void setIntercompanyduefromAcct(BigDecimal intercompanyduefromAcct) {
		this.intercompanyduefromAcct = intercompanyduefromAcct;
	}


	@Column(name="INTERCOMPANYDUETO_ACCT")
	public BigDecimal getIntercompanyduetoAcct() {
		return this.intercompanyduetoAcct;
	}

	public void setIntercompanyduetoAcct(BigDecimal intercompanyduetoAcct) {
		this.intercompanyduetoAcct = intercompanyduetoAcct;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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