//package org.adempiere.print.layout;
//
//import java.awt.Font;
//import java.awt.Graphics2D;
//import java.awt.Paint;
//import java.awt.font.FontRenderContext;
//import java.awt.font.LineBreakMeasurer;
//import java.awt.font.TextAttribute;
//import java.awt.font.TextLayout;
//import java.awt.geom.Point2D;
//import java.text.AttributedCharacterIterator;
//import java.text.AttributedString;
//import java.text.CharacterIterator;
//import java.util.Properties;
//import java.util.regex.Pattern;
//
//import org.adempiere.model.AdPrintformatitem;
//import org.adempiere.print.LayoutEngine;
//import org.adempiere.web.client.util.StringUtil;
//
//public class StringElement extends PrintElement {
//	private AttributedString[]	stringView		= null;
//	private AttributedString[]	stringPaper		= null;
//	private String				originalString	= null;
//	private Font				font			= null;
//	private Paint				paint			= null;
//	private Boolean				check			= null;
//
//	public StringElement(String inText, Font font, Paint paint, boolean translateText) {
//		super();
//		this.font = font;
//		this.paint = paint;
//		if (translateText) {
//			int count = StringUtil.getCount(inText, '@');
//			if (count > 0 && count % 2 == 0) {
//				this.originalString = inText;
//				// inText = Msg.parseTranslation(Env.getCtx(),
//				// this.m_originalString);
//			}
//		}
//		String[] lines = Pattern.compile("$", Pattern.MULTILINE).split(inText);
//		this.stringPaper = new AttributedString[lines.length];
//		this.stringView = new AttributedString[lines.length];
//		for (int i = 0; i < lines.length; i++) {
//			String line = StringUtil.removeCRLF(lines[i]);
//			this.stringPaper[i] = new AttributedString(line);
//			if (line.length() == 0)
//				continue;
//			this.stringPaper[i].addAttribute(TextAttribute.FONT, font);
//			this.stringPaper[i].addAttribute(TextAttribute.FOREGROUND, paint);
//			if (i == 0) // first line only - create special
//						// Attributed String
//			{
//				this.stringView[i] = new AttributedString(line);
//				this.stringView[i].addAttribute(TextAttribute.FONT, font);
//				int endIndex = line.length();
//				this.stringView[i].addAttribute(TextAttribute.FOREGROUND, LINK_COLOR);
//				this.stringView[i].addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_LOW_ONE_PIXEL, 0,
//						endIndex);
//			} else
//				this.stringView[i] = this.stringPaper[i];
//		}
//		// Load Image
//		waitForLoad(LayoutEngine.IMAGE_TRUE);
//		waitForLoad(LayoutEngine.IMAGE_FALSE);
//	} // StringElement
//
//	/**
//	 * Attributed String Constructor
//	 * 
//	 * @param string attributed string
//	 */
//	public StringElement(AttributedString string) {
//		super();
//		this.stringPaper = new AttributedString[] { string };
//		this.stringView = this.stringPaper;
//	} // StringElement
//
//	/**
//	 * Field Constructor. Created in LayoutEngine
//	 * 
//	 * @param content text or boolean
//	 * @param font font
//	 * @param paint paint
//	 * @param ID optional ID (null if document)
//	 * @param label optional label
//	 * @param labelSuffix optional label suffix
//	 */
//	public StringElement(Object content, Font font, Paint paint, String label, String labelSuffix) {
//		super();
//		this.font = font;
//		this.paint = paint;
//		int startIndex = 0;
//		int endOffset = 0;
//
//		StringBuffer text = new StringBuffer();
//		if (label != null && label.length() > 0) {
//			text.append(label).append(" ");
//			startIndex = label.length() + 1;
//		}
//		if (content instanceof Boolean)
//			this.check = (Boolean) content;
//		else
//			text.append(content);
//		if (labelSuffix != null && labelSuffix.length() > 0) {
//			text.append(labelSuffix);
//			endOffset = labelSuffix.length();
//		}
//		String[] lines = Pattern.compile("$", Pattern.MULTILINE).split(text);
//		this.stringPaper = new AttributedString[lines.length];
//		this.stringView = new AttributedString[lines.length];
//		for (int i = 0; i < lines.length; i++) {
//			String line = StringUtil.removeCRLF(lines[i]);
//			this.stringPaper[i] = new AttributedString(line);
//			if (line.length() == 0)
//				continue;
//			this.stringPaper[i].addAttribute(TextAttribute.FONT, font);
//			this.stringPaper[i].addAttribute(TextAttribute.FOREGROUND, paint);
//			if (i == 0) // first line only - create special
//						// Attributed String
//			{
//				this.stringView[i] = new AttributedString(line);
//				this.stringView[i].addAttribute(TextAttribute.FONT, font);
//				this.stringView[i].addAttribute(TextAttribute.FOREGROUND, paint);
//				int endIndex = line.length() - endOffset;
//				if (endIndex > startIndex) {
//					this.stringView[i].addAttribute(TextAttribute.FOREGROUND, LINK_COLOR, startIndex, endIndex);
//					this.stringView[i].addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_LOW_ONE_PIXEL,
//							startIndex, endIndex);
//				}
//			} else
//				this.stringView[i] = this.stringPaper[i];
//		}
//	} // StringElement
//
//	@Override
//	public void paint(Graphics2D g2D, int pageNo, Point2D pageStart, Properties ctx, boolean isView) {
//		Point2D.Double location = getAbsoluteLocation(pageStart);
//		//
//		if (this.originalString != null)
//			translate(ctx);
//
//		AttributedString aString = null;
//		AttributedCharacterIterator iter = null;
//		float xPos = (float) location.x;
//		float yPos = (float) location.y;
//		float yPen = 0f;
//		float height = 0f;
//		float width = 0f;
//		// for all lines
//		for (int i = 0; i < this.stringPaper.length; i++) {
//			// Get Text
//			if (isView) {
//				if (this.stringView[i] == null)
//					continue;
//				aString = this.stringView[i];
//			} else {
//				if (this.stringPaper[i] == null)
//					continue;
//				aString = this.stringPaper[i];
//			}
//			iter = aString.getIterator();
//			// Zero Length
//			if (iter.getBeginIndex() == iter.getEndIndex())
//				continue;
//
//			// Check for Tab (just first) and 16 bit characters
//			int tabPos = -1;
//			boolean is8Bit = true;
//			for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
//				if (c == '\t' && tabPos == -1)
//					tabPos = iter.getIndex();
//				if (c > 255)
//					is8Bit = false;
//			}
//
//			TextLayout layout = null;
//			float xPen = xPos;
//
//			// No Limit
//			if (p_maxWidth == 0f) {
//				if (tabPos == -1) {
//					layout = new TextLayout(iter, g2D.getFontRenderContext());
//					yPen = yPos + layout.getAscent();
//					// layout.draw(g2D, xPen, yPen);
//					g2D.setFont(this.font);
//					g2D.setPaint(this.paint);
//					g2D.drawString(iter, xPen, yPen);
//					//
//					yPos += layout.getAscent() + layout.getDescent() + layout.getLeading();
//					if (width < layout.getAdvance())
//						width = layout.getAdvance();
//				} else // we have a tab
//				{
//					LineBreakMeasurer measurer = new LineBreakMeasurer(iter, g2D.getFontRenderContext());
//					layout = measurer.nextLayout(9999, tabPos, false);
//					float lineHeight_1 = layout.getAscent() + layout.getDescent() + layout.getLeading();
//					yPen = yPos + layout.getAscent();
//					layout.draw(g2D, xPen, yPen); // first part before tab
//					xPen = getTabPos(xPos, layout.getAdvance());
//					float lineWidth = xPen - xPos;
//					layout = measurer.nextLayout(9999);// , iter.getEndIndex(),
//														// true);
//					float lineHeight_2 = layout.getAscent() + layout.getDescent() + layout.getLeading();
//					layout.draw(g2D, xPen, yPen); // second part after tab
//					//
//					yPos += Math.max(lineHeight_1, lineHeight_2);
//					lineWidth += layout.getAdvance();
//					if (width < lineWidth)
//						width = lineWidth;
//				}
//			}
//			// Size Limits
//			else {
//				boolean fastDraw = LayoutEngine.s_FASTDRAW;
//				if (fastDraw && !isView && !is8Bit)
//					fastDraw = false;
//				LineBreakMeasurer measurer = new LineBreakMeasurer(iter, g2D.getFontRenderContext());
//				while (measurer.getPosition() < iter.getEndIndex()) {
//					if (tabPos == -1) {
//						layout = measurer.nextLayout(p_maxWidth);
//						if (measurer.getPosition() < iter.getEndIndex())
//							fastDraw = false;
//					} else // tab
//					{
//						fastDraw = false;
//						layout = measurer.nextLayout(p_maxWidth, tabPos, false);
//					}
//					// Line Height
//					float lineHeight = layout.getAscent() + layout.getDescent() + layout.getLeading();
//					if (p_maxHeight == -1f && i == 0) // one line only
//						p_maxHeight = lineHeight;
//					// If we have hight left over
//					if (p_maxHeight == 0f || (height + lineHeight) <= p_maxHeight) {
//						yPen = (float) location.y + height + layout.getAscent();
//						// Tab in Text
//						if (tabPos != -1) {
//							layout.draw(g2D, xPen, yPen); // first part before
//															// tab
//							xPen = getTabPos(xPos, layout.getAdvance());
//							layout = measurer.nextLayout(width, iter.getEndIndex(), true);
//							tabPos = -1; // reset (just one tab)
//						} else if ((AdPrintformatitem.FIELDALIGNMENTTYPE_TrailingRight.equals(fieldAlignmentType) && layout
//								.isLeftToRight())
//								|| (AdPrintformatitem.FIELDALIGNMENTTYPE_LeadingLeft.equals(fieldAlignmentType) && !layout
//										.isLeftToRight()))
//							xPen += p_maxWidth - layout.getAdvance();
//						else if (AdPrintformatitem.FIELDALIGNMENTTYPE_Center.equals(fieldAlignmentType))
//							xPen += (p_maxWidth - layout.getAdvance()) / 2;
//						else if (AdPrintformatitem.FIELDALIGNMENTTYPE_Block.equals(fieldAlignmentType)
//								&& measurer.getPosition() < iter.getEndIndex()) {
//							layout = layout.getJustifiedLayout(p_maxWidth);
//							fastDraw = false;
//						}
//						if (fastDraw) {
//							g2D.setFont(this.font);
//							g2D.setPaint(this.paint);
//							g2D.drawString(iter, xPen, yPen);
//							height += lineHeight;
//							break;
//						} else {
//							layout.draw(g2D, xPen, yPen);
//						}
//						height += lineHeight;
//					}
//				}
//				width = p_maxWidth;
//			} // size limits
//		} // for all strings
//		if (this.check != null) {
//			int x = (int) (location.x + width + 1);
//			int y = (int) (location.y);
//			g2D.drawImage(this.check.booleanValue() ? LayoutEngine.IMAGE_TRUE : LayoutEngine.IMAGE_FALSE, x, y, this);
//		}
//	}
//
//	private float getTabPos(float xPos, float length) {
//		float retValue = xPos + length;
//		int iLength = (int) Math.ceil(length);
//		int tabSpace = iLength % 30;
//		retValue += (30 - tabSpace);
//		return retValue;
//	} // getTabPos
//
//	@Override
//	protected boolean calculateSize() {
//		if (p_sizeCalculated)
//			return true;
//		//
//		FontRenderContext frc = new FontRenderContext(null, true, true);
//		TextLayout layout = null;
//		p_height = 0f;
//		p_width = 0f;
//
//		// No Limit
//		if (p_maxWidth == 0f && p_maxHeight == 0f) {
//			for (int i = 0; i < this.stringPaper.length; i++) {
//				AttributedCharacterIterator iter = this.stringPaper[i].getIterator();
//				if (iter.getBeginIndex() == iter.getEndIndex())
//					continue;
//
//				// Check for Tab (just first)
//				int tabPos = -1;
//				for (char c = iter.first(); c != CharacterIterator.DONE && tabPos == -1; c = iter.next()) {
//					if (c == '\t')
//						tabPos = iter.getIndex();
//				}
//
//				if (tabPos == -1) {
//					layout = new TextLayout(iter, frc);
//					p_height += layout.getAscent() + layout.getDescent() + layout.getLeading();
//					if (p_width < layout.getAdvance())
//						p_width = layout.getAdvance();
//				} else // with tab
//				{
//					LineBreakMeasurer measurer = new LineBreakMeasurer(iter, frc);
//					layout = measurer.nextLayout(9999, tabPos, false);
//					p_height += layout.getAscent() + layout.getDescent() + layout.getLeading();
//					float width = getTabPos(0, layout.getAdvance());
//					layout = measurer.nextLayout(9999, iter.getEndIndex(), true);
//					width += layout.getAdvance();
//					if (this.p_width < width)
//						this.p_width = width;
//				}
//			} // for all strings
//
//			// Add CheckBox Size
//			if (this.check != null) {
//				p_width += LayoutEngine.IMAGE_SIZE.width;
//				if (p_height < LayoutEngine.IMAGE_SIZE.height)
//					p_height = LayoutEngine.IMAGE_SIZE.height;
//			}
//		}
//		// Size Limits
//		else {
//			p_width = p_maxWidth;
//			for (int i = 0; i < this.stringPaper.length; i++) {
//				AttributedCharacterIterator iter = this.stringPaper[i].getIterator();
//				if (iter.getBeginIndex() == iter.getEndIndex())
//					continue;
//				LineBreakMeasurer measurer = new LineBreakMeasurer(iter, frc);
//				while (measurer.getPosition() < iter.getEndIndex()) {
//					// no need to expand tab space for limited space
//					layout = measurer.nextLayout(p_maxWidth);
//					float lineHeight = layout.getAscent() + layout.getDescent() + layout.getLeading();
//					if (p_maxHeight == -1f && i == 0) // one line only
//						p_maxHeight = lineHeight;
//					if (p_maxHeight == 0f || (p_height + lineHeight) <= p_maxHeight)
//						p_height += lineHeight;
//				}
//			} // for all strings
//
//			// Add CheckBox Size
//			if (this.check != null) {
//				if (p_height < LayoutEngine.IMAGE_SIZE.height)
//					p_height = LayoutEngine.IMAGE_SIZE.height;
//			}
//		}
////		// Enlarge Size when aligned and max size is given
////		if (fieldAlignmentType != null) {
////			boolean changed = false;
////			if (p_height < p_maxHeight) {
////				p_height = p_maxHeight;
////				changed = true;
////			}
////			if (p_width < p_maxWidth) {
////				p_width = p_maxWidth;
////				changed = true;
////			}
////		}
//		return true;
//	}
//
//	public String getOriginalString() {
//		return this.originalString;
//	} // getOrig
//
//}
