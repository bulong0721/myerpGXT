package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_color database table.
 * 
 */
@Entity
@Table(name="ad_color")
@NamedQuery(name="AdColor.findAll", query="SELECT a FROM AdColor a")
public class AdColor extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adColorId;
	private BigDecimal adClientId;
	private BigDecimal adImageId;
	private BigDecimal adOrgId;
	private BigDecimal alpha;
	private BigDecimal alpha1;
	private BigDecimal blue;
	private BigDecimal blue1;
	private String colortype;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal green;
	private BigDecimal green1;
	private BigDecimal imagealpha;
	private String isactive;
	private String isdefault;
	private BigDecimal linedistance;
	private BigDecimal linewidth;
	private String name;
	private BigDecimal red;
	private BigDecimal red1;
	private BigDecimal repeatdistance;
	private BigDecimal startpoint;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdColor() {
	}


	@Id
	@Column(name="AD_COLOR_ID")
	public long getAdColorId() {
		return this.adColorId;
	}

	public void setAdColorId(long adColorId) {
		this.adColorId = adColorId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_IMAGE_ID")
	public BigDecimal getAdImageId() {
		return this.adImageId;
	}

	public void setAdImageId(BigDecimal adImageId) {
		this.adImageId = adImageId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	public BigDecimal getAlpha() {
		return this.alpha;
	}

	public void setAlpha(BigDecimal alpha) {
		this.alpha = alpha;
	}


	@Column(name="ALPHA_1")
	public BigDecimal getAlpha1() {
		return this.alpha1;
	}

	public void setAlpha1(BigDecimal alpha1) {
		this.alpha1 = alpha1;
	}


	public BigDecimal getBlue() {
		return this.blue;
	}

	public void setBlue(BigDecimal blue) {
		this.blue = blue;
	}


	@Column(name="BLUE_1")
	public BigDecimal getBlue1() {
		return this.blue1;
	}

	public void setBlue1(BigDecimal blue1) {
		this.blue1 = blue1;
	}


	public String getColortype() {
		return this.colortype;
	}

	public void setColortype(String colortype) {
		this.colortype = colortype;
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


	public BigDecimal getGreen() {
		return this.green;
	}

	public void setGreen(BigDecimal green) {
		this.green = green;
	}


	@Column(name="GREEN_1")
	public BigDecimal getGreen1() {
		return this.green1;
	}

	public void setGreen1(BigDecimal green1) {
		this.green1 = green1;
	}


	public BigDecimal getImagealpha() {
		return this.imagealpha;
	}

	public void setImagealpha(BigDecimal imagealpha) {
		this.imagealpha = imagealpha;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}


	public BigDecimal getLinedistance() {
		return this.linedistance;
	}

	public void setLinedistance(BigDecimal linedistance) {
		this.linedistance = linedistance;
	}


	public BigDecimal getLinewidth() {
		return this.linewidth;
	}

	public void setLinewidth(BigDecimal linewidth) {
		this.linewidth = linewidth;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getRed() {
		return this.red;
	}

	public void setRed(BigDecimal red) {
		this.red = red;
	}


	@Column(name="RED_1")
	public BigDecimal getRed1() {
		return this.red1;
	}

	public void setRed1(BigDecimal red1) {
		this.red1 = red1;
	}


	public BigDecimal getRepeatdistance() {
		return this.repeatdistance;
	}

	public void setRepeatdistance(BigDecimal repeatdistance) {
		this.repeatdistance = repeatdistance;
	}


	public BigDecimal getStartpoint() {
		return this.startpoint;
	}

	public void setStartpoint(BigDecimal startpoint) {
		this.startpoint = startpoint;
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