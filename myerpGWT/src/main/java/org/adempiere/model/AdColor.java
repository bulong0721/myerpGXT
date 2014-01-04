package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_color")
public class AdColor extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adColorId;
	private Integer adImageId;
	private Integer adOrgId;
	private Integer alpha;
	private Integer alpha1;
	private Integer blue;
	private Integer blue1;
	private String colortype;
	private String created;
	private Integer createdby;
	private Integer green;
	private Integer green1;
	private BigDecimal imagealpha;
	private String isactive;
	private String isdefault;
	private Integer linedistance;
	private Integer linewidth;
	private String name;
	private Integer red;
	private Integer red1;
	private Integer repeatdistance;
	private Integer startpoint;
	private String updated;
	private Integer updatedby;

	public AdColor() {
	}

	public AdColor(Integer adColorId) {
		this.adColorId = adColorId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Id
	@Column(name="AD_COLOR_ID")
	public Integer getAdColorId() {
		return adColorId;
	}

	public void setAdColorId(Integer adColorId) {
		this.adColorId = adColorId;
	}

	@Basic
	@Column(name="AD_IMAGE_ID")
	public Integer getAdImageId() {
		return adImageId;
	}

	public void setAdImageId(Integer adImageId) {
		this.adImageId = adImageId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(nullable=false)
	public Integer getAlpha() {
		return alpha;
	}

	public void setAlpha(Integer alpha) {
		this.alpha = alpha;
	}

	@Basic
	@Column(name="ALPHA_1")
	public Integer getAlpha1() {
		return alpha1;
	}

	public void setAlpha1(Integer alpha1) {
		this.alpha1 = alpha1;
	}

	@Basic
	@Column(nullable=false)
	public Integer getBlue() {
		return blue;
	}

	public void setBlue(Integer blue) {
		this.blue = blue;
	}

	@Basic
	@Column(name="BLUE_1")
	public Integer getBlue1() {
		return blue1;
	}

	public void setBlue1(Integer blue1) {
		this.blue1 = blue1;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getColortype() {
		return colortype;
	}

	public void setColortype(String colortype) {
		this.colortype = colortype;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(nullable=false)
	public Integer getGreen() {
		return green;
	}

	public void setGreen(Integer green) {
		this.green = green;
	}

	@Basic
	@Column(name="GREEN_1")
	public Integer getGreen1() {
		return green1;
	}

	public void setGreen1(Integer green1) {
		this.green1 = green1;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getImagealpha() {
		return imagealpha;
	}

	public void setImagealpha(BigDecimal imagealpha) {
		this.imagealpha = imagealpha;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	@Basic
	public Integer getLinedistance() {
		return linedistance;
	}

	public void setLinedistance(Integer linedistance) {
		this.linedistance = linedistance;
	}

	@Basic
	public Integer getLinewidth() {
		return linewidth;
	}

	public void setLinewidth(Integer linewidth) {
		this.linewidth = linewidth;
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
	@Column(nullable=false)
	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

	@Basic
	@Column(name="RED_1")
	public Integer getRed1() {
		return red1;
	}

	public void setRed1(Integer red1) {
		this.red1 = red1;
	}

	@Basic
	public Integer getRepeatdistance() {
		return repeatdistance;
	}

	public void setRepeatdistance(Integer repeatdistance) {
		this.repeatdistance = repeatdistance;
	}

	@Basic
	public Integer getStartpoint() {
		return startpoint;
	}

	public void setStartpoint(Integer startpoint) {
		this.startpoint = startpoint;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}