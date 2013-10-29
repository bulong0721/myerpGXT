package org.adempiere.print.layout;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.geom.Point2D;
import java.awt.image.ImageObserver;
import java.util.Properties;

import org.adempiere.model.core.AdPrintformatitem;

public abstract class PrintElement implements ImageObserver {
	public static final Color	LINK_COLOR		= Color.blue;
	protected float				width			= 0f;
	protected float				height			= 0f;
	protected boolean			sizeCalculated	= false;
	protected float				maxWidth		= 0f;
	protected float				maxHeight		= 0f;
	protected String			fieldAlignmentType;
	protected Point2D.Double	pageLocation	= null;
	private boolean				imageNotLoaded	= true;

	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		// copied from java.awt.component
		imageNotLoaded = (infoflags & (ALLBITS | ABORT)) == 0;
		return imageNotLoaded;
	}

	public abstract void paint(Graphics2D g2D, int pageNo, Point2D pageStart, Properties ctx, boolean isView);

	protected abstract boolean calculateSize();

	protected Point2D.Double getAbsoluteLocation(Point2D pageStart) {
		Point2D.Double retValue = new Point2D.Double(pageLocation.x + pageStart.getX(), pageLocation.y
				+ pageStart.getY());
		return retValue;
	}

	public float getWidth() {
		if (!sizeCalculated)
			sizeCalculated = calculateSize();
		return width;
	} // getWidth

	/**
	 * Get Calculated Height
	 * 
	 * @return Height
	 */
	public float getHeight() {
		if (!sizeCalculated)
			sizeCalculated = calculateSize();
		return height;
	} // getHeight

	/**
	 * Get Calculated Height on page
	 * 
	 * @param pageNo page number
	 * @return Height
	 */
	public float getHeight(int pageNo) {
		return getHeight();
	} // getHeight

	public void setMaxHeight(float maxHeight) {
		this.maxHeight = maxHeight;
	} // setMaxHeight

	/**
	 * Set Maximum Width
	 * 
	 * @param maxWidth maximum width (0) is no limit
	 */
	public void setMaxWidth(float maxWidth) {
		this.maxWidth = maxWidth;
	} // setMaxWidth

	/**
	 * Set Location within page. Called from LayoutEngine.layoutForm(),
	 * lauout(), createStandardFooterHeader()
	 * 
	 * @param pageLocation location within page
	 */
	public void setLocation(Point2D pageLocation) {
		pageLocation = new Point2D.Double(pageLocation.getX(), pageLocation.getY());
	} // setLocation

	/**
	 * Get Location within page
	 * 
	 * @return location within page
	 */
	public Point2D getLocation() {
		return pageLocation;
	} // getLocation

	/**
	 * Get number of pages
	 * 
	 * @return page count (1)
	 */
	public int getPageCount() {
		return 1;
	} // getPageCount

	public boolean waitForLoad(Image image) {
		// long start = System.currentTimeMillis();
		Thread.yield();
		int count = 0;
		try {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			while (!toolkit.prepareImage(image, -1, -1, this)) {
				if (count > 1000) {
					return false;
				}
				try {
					if (count < 10)
						Thread.sleep(10);
					else if (count < 100)
						Thread.sleep(15);
					else
						Thread.sleep(20);
				} catch (InterruptedException ex) {
					break;
				}
				count++;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	} // waitForLoad

	public void layout(float maxWidth, float maxHeight, boolean isHeightOneLine, String FieldAlignmentType) {
		if (isHeightOneLine)
			maxHeight = -1f;
		else if (maxHeight > 0f)
			this.maxHeight = maxHeight;
		this.maxWidth = maxWidth;
		//
		fieldAlignmentType = FieldAlignmentType;
		if (fieldAlignmentType == null || fieldAlignmentType.equals(AdPrintformatitem.FIELDALIGNMENTTYPE_Default))
			fieldAlignmentType = AdPrintformatitem.FIELDALIGNMENTTYPE_LeadingLeft;
		//
		sizeCalculated = calculateSize();
	}

	public Rectangle getBounds() {
		if (pageLocation == null)
			return new Rectangle(0, 0, (int) width, (int) height);
		return new Rectangle((int) pageLocation.x, (int) pageLocation.y, (int) width, (int) height);
	}

	public void translate(Properties ctx) {
		// noop
	} // translate

	/**
	 * Content is translated
	 * 
	 * @return false
	 */
	public boolean isTranslated() {
		return false;
	}

	/**
	 * Get Detail Info from Sub-Class
	 * 
	 * @return detail info
	 */
	protected String getDetailInfo() {
		return "";
	} // getDetailInfo

	/**
	 * String Representation
	 * 
	 * @return info
	 */
	public String toString() {
		String cn = getClass().getName();
		StringBuffer sb = new StringBuffer();
		sb.append(cn.substring(cn.lastIndexOf('.') + 1)).append("[");
		sb.append("Bounds=").append(getBounds()).append(",Height=").append(height).append("(").append(maxHeight)
				.append("),Width=").append(width).append("(").append(maxHeight).append("),PageLocation=")
				.append(pageLocation);
		sb.append("]");
		return sb.toString();
	} // toString
}
