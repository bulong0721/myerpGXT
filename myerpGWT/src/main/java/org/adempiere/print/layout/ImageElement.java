package org.adempiere.print.layout;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.adempiere.model.ADImage;
import org.adempiere.print.PrintDataElement;
import org.adempiere.print.PrintUtil;
import org.adempiere.print.model.PrintAttachment;
import org.adempiere.print.model.PrintFormatItem;
import org.adempiere.util.POUtil;

public class ImageElement extends PrintElement {
	private static final int	Format_Table_ID	= 120;

	/**
	 * Create Image from URL
	 * 
	 * @param imageURLString image url
	 * @return image element
	 */
	public static ImageElement get(String imageURLString) {
		Object key = imageURLString;
		ImageElement image = (ImageElement) s_cache.get(key);
		if (image == null) {
			image = new ImageElement(imageURLString);
			s_cache.put(key, image);
		}
		return new ImageElement(image.getImage());
	} // get

	/**
	 * Create Image from URL
	 * 
	 * @param imageURL image url
	 * @return image element
	 */
	public static ImageElement get(URL imageURL) {
		Object key = imageURL;
		ImageElement image = (ImageElement) s_cache.get(key);
		if (image == null) {
			image = new ImageElement(imageURL);
			s_cache.put(key, image);
		}
		return new ImageElement(image.getImage());
	} // get

	/**
	 * Create Image from Attachment
	 * 
	 * @param AD_PrintFormatItem_ID record id
	 * @return image element
	 */
	public static ImageElement get(int AD_PrintFormatItem_ID) {
		Object key = new Long(AD_PrintFormatItem_ID);
		ImageElement image = (ImageElement) s_cache.get(key);
		if (image == null) {
			image = new ImageElement(AD_PrintFormatItem_ID);
			s_cache.put(key, image);
		}
		return new ImageElement(image.getImage());
	} // get

	/**
	 * Create Image from database column
	 * 
	 * @param data the printdataelement, containing the reference
	 * @param imageURLString image url - containing just the AD_Image_ID
	 *            reference
	 * @return image element
	 */
	public static ImageElement get(PrintDataElement data, String imageURLString) {
		Object key = (BigDecimal) data.getValue();
		ImageElement image = (ImageElement) s_cache.get(key);
		if (image == null) {
			BigDecimal imkeybd = (BigDecimal) data.getValue();
			int imkeyint = 0;
			if (imkeybd != null)
				imkeyint = imkeybd.intValue();
			image = new ImageElement(imkeyint, false);
			s_cache.put(key, image);
		}
		return new ImageElement(image.getImage());
	} // get

	/** 60 minute Cache */
	private static Map<Object, ImageElement>	s_cache	= new HashMap<Object, ImageElement>();

	/**************************************************************************
	 * Create from existing Image
	 * 
	 * @param image image
	 */
	public ImageElement(Image image) {
		m_image = image;
	} // ImageElement

	/**
	 * Create Image from URL
	 * 
	 * @param imageURLstring image url
	 */
	private ImageElement(String imageURLstring) {
		URL imageURL = getURL(imageURLstring);
		if (imageURL != null) {
			m_image = Toolkit.getDefaultToolkit().createImage(imageURL);
		}
	} // ImageElement

	/**
	 * Create Image from URL
	 * 
	 * @param imageURL image url
	 */
	private ImageElement(URL imageURL) {
		if (imageURL != null) {
			m_image = Toolkit.getDefaultToolkit().createImage(imageURL);
		}
	} // ImageElement

	/**
	 * Create Image from Attachment
	 * 
	 * @param AD_PrintFormatItem_ID record id
	 */
	private ImageElement(int AD_PrintFormatItem_ID) {
		loadAttachment(AD_PrintFormatItem_ID);
	} // ImageElement

	/**
	 * Create Image from Attachment or Column
	 * 
	 * @param record_ID_ID record id from printformat or column
	 * @param isAttachment flag to indicate if is attachment or is a column from
	 *            DB
	 */
	public ImageElement(int record_ID, boolean isAttachment) {
		if (isAttachment)
			loadAttachment(record_ID);
		else
			loadFromDB(record_ID);
	} // ImageElement

	/** The Image */
	private Image	m_image			= null;
	/** Scale */
	private double	m_scaleFactor	= 1;

	/**************************************************************************
	 * Get URL from String
	 * 
	 * @param urlString url or resource
	 * @return URL or null
	 */
	private URL getURL(String urlString) {
		URL url = null;
		// not a URL - may be a resource
		if (urlString.indexOf("://") == -1) {
			ClassLoader cl = getClass().getClassLoader();
			url = cl.getResource(urlString);
			if (url != null)
				return url;
			return null;
		}
		// load URL
		try {
			url = new URL(urlString);
		} catch (MalformedURLException ex) {
		}
		return url;
	} // getURL;

	/**
	 * Load from DB
	 * 
	 * @param record_ID record id
	 */
	private void loadFromDB(int record_ID) {
		// TODO
		ADImage mimage = POUtil.find(null, ADImage.class, record_ID);
		if (mimage == null) {
			return;
		}

		byte[] imageData = mimage.getBinaryData();
		if (imageData != null)
			m_image = Toolkit.getDefaultToolkit().createImage(imageData);
	} // loadFromDB

	/**
	 * Load Attachment
	 * 
	 * @param AD_PrintFormatItem_ID record id
	 */
	private void loadAttachment(int AD_PrintFormatItem_ID) {
		PrintAttachment attachment = PrintUtil.getPrintAttachment(Format_Table_ID, AD_PrintFormatItem_ID);
		if (attachment == null) {
			return;
		}
		if (null == attachment.getBinaryData()) {
			return;
		}
		byte[] imageData = attachment.getBinaryData();
		if (imageData != null)
			m_image = Toolkit.getDefaultToolkit().createImage(imageData);
	} // loadAttachment

	/**************************************************************************
	 * Calculate Image Size. Set p_width & p_height
	 * 
	 * @return true if calculated
	 */
	protected boolean calculateSize() {
		p_width = 0;
		p_height = 0;
		if (m_image == null)
			return true;
		// we have an image
		// if the image was not loaded, consider that there is no image -
		// teo_sarca [ 1674706 ]
		if (waitForLoad(m_image) && m_image != null) {
			p_width = m_image.getWidth(this);
			p_height = m_image.getHeight(this);

			if (p_width * p_height == 0)
				return true; // don't bother scaling and prevent div by 0

			// 0 = unlimited so scale to fit restricted dimension
			/*
			 * teo_sarca, [ 1673548 ] Image is not scaled in a report table cell
			 * if (p_maxWidth * p_maxHeight != 0) // scale to maintain aspect
			 * ratio { if (p_width/p_height > p_maxWidth/p_maxHeight) // image
			 * "fatter" than available area m_scaleFactor = p_maxWidth/p_width;
			 * else m_scaleFactor = p_maxHeight/p_height; }
			 */
			m_scaleFactor = 1;
			if (p_maxWidth != 0 && p_width > p_maxWidth)
				m_scaleFactor = p_maxWidth / p_width;
			if (p_maxHeight != 0 && p_height > p_maxHeight && p_maxHeight / p_height < m_scaleFactor)
				m_scaleFactor = p_maxHeight / p_height;

			p_width = (float) m_scaleFactor * p_width;
			p_height = (float) m_scaleFactor * p_height;
		}
		// If the image is not loaded set it to null.
		// This prevents SecurityException when invoking getWidth() or
		// getHeight(). - teo_sarca [ 1674706 ]
		else {
			m_image = null;
		}

		return true;
	} // calculateSize

	/**
	 * Get the Image
	 * 
	 * @return image
	 */
	public Image getImage() {
		return m_image;
	} // getImage

	/**
	 * Get image scale factor.
	 * 
	 * @author teo_sarca - [ 1673548 ] Image is not scaled in a report table
	 *         cell
	 * @return scale factor
	 */
	public double getScaleFactor() {
		if (!p_sizeCalculated)
			p_sizeCalculated = calculateSize();
		return m_scaleFactor;
	}

	/**
	 * Paint Image
	 * 
	 * @param g2D Graphics
	 * @param pageStart top left Location of page
	 * @param pageNo page number for multi page support (0 = header/footer) -
	 *            ignored
	 * @param ctx print context
	 * @param isView true if online view (IDs are links)
	 */
	public void paint(Graphics2D g2D, int pageNo, Point2D pageStart,boolean isView) {
		if (m_image == null)
			return;

		// Position
		Point2D.Double location = getAbsoluteLocation(pageStart);
		int x = (int) location.x;
		if (PrintFormatItem.FIELDALIGNMENTTYPE_TrailingRight.equals(fieldAlignmentType))
			x += p_maxWidth - p_width;
		else if (PrintFormatItem.FIELDALIGNMENTTYPE_Center.equals(fieldAlignmentType))
			x += (p_maxWidth - p_width) / 2;
		int y = (int) location.y;

		// map a scaled and shifted version of the image to device space
		AffineTransform transform = new AffineTransform();
		transform.translate(x, y);
		transform.scale(m_scaleFactor, m_scaleFactor);
		g2D.drawImage(m_image, transform, this);
	} // paint

} // ImageElement