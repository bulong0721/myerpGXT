package org.adempiere.print.layout;

import java.awt.Dimension;
import java.awt.geom.Dimension2D;

/**
 * 2D Dimesnion Implementation
 * 
 * @author Jorg Janke
 * @version $Id: Dimension2DImpl.java,v 1.3 2006/07/30 00:53:02 jjanke Exp $
 */
public class Dimension2DImpl extends Dimension2D {
	/**
	 * Constructor 0/0
	 */
	public Dimension2DImpl() {
	} // Dimension2DImpl

	/**
	 * Constructor 0/0
	 * 
	 * @param dim
	 *            dimension
	 */
	public Dimension2DImpl(Dimension dim) {
		setSize(dim);
	} // Dimension2DImpl

	/**
	 * Constructor 0/0
	 * 
	 * @param Width
	 *            width
	 * @param Height
	 *            height
	 */
	public Dimension2DImpl(double Width, double Height) {
		setSize(Width, Height);
	} // Dimension2DImpl

	/** Width */
	public double	width	= 0;
	/** Height */
	public double	height	= 0;

	/**
	 * Set Size
	 * 
	 * @param Width
	 *            width
	 * @param Height
	 *            height
	 */
	public void setSize(double Width, double Height) {
		this.width = Width;
		this.height = Height;
	} // setSize

	/**
	 * Set Size
	 * 
	 * @param dim
	 *            dimension
	 */
	public void setSize(Dimension dim) {
		this.width = dim.getWidth();
		this.height = dim.getHeight();
	} // setSize

	/**
	 * Add Size below existing
	 * 
	 * @param dWidth
	 *            width to increase if below
	 * @param dHeight
	 *            height to add
	 */
	public void addBelow(double dWidth, double dHeight) {
		if (this.width < dWidth)
			this.width = dWidth;
		this.height += dHeight;
	} // addBelow

	/**
	 * Add Size below existing
	 * 
	 * @param dim
	 *            add dimension
	 */
	public void addBelow(Dimension dim) {
		addBelow(dim.width, dim.height);
	} // addBelow

	/**
	 * Round to next Int value
	 */
	public void roundUp() {
		width = Math.ceil(width);
		height = Math.ceil(height);
	} // roundUp

	/**
	 * Get Width
	 * 
	 * @return width
	 */
	public double getWidth() {
		return width;
	} // getWidth

	/**
	 * Get Height
	 * 
	 * @return height
	 */
	public double getHeight() {
		return height;
	} // getHeight

	/*************************************************************************/

	/**
	 * Hash Code
	 * 
	 * @return hash code
	 */
	public int hashCode() {
		long bits = Double.doubleToLongBits(width);
		bits ^= Double.doubleToLongBits(height) * 31;
		return (((int) bits) ^ ((int) (bits >> 32)));
	} // hashCode

	/**
	 * Equals
	 * 
	 * @param obj
	 *            object
	 * @return true if w/h is same
	 */
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Dimension2D) {
			Dimension2D d = (Dimension2D) obj;
			if (d.getWidth() == width && d.getHeight() == height)
				return true;
		}
		return false;
	} // equals

	/**
	 * String Representation
	 * 
	 * @return info
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Dimension2D[w=").append(width).append(",h=").append(height).append("]");
		return sb.toString();
	} // toString

} // Dimension2DImpl
