//package org.adempiere.print.layout;
//
//import java.awt.Graphics2D;
//import java.awt.Point;
//import java.awt.Rectangle;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Properties;
//
//
//public class HeaderFooter {
//	private List<PrintElement>	elementList	= new ArrayList<PrintElement>();
//	private PrintElement[]		elements	= null;
//
//	public HeaderFooter(Properties m_printCtx) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void paint(Graphics2D g2D, Rectangle bounds, boolean isView) {
//		Point pageStart = new Point(bounds.getLocation());
//		getElements();
//		for (int i = 0; i < elements.length; i++)
//			elements[i].paint(g2D, 0, pageStart, null, isView);
//	}
//
//	public void addElement(PrintElement element) {
//		if (element != null)
//			elementList.add(element);
//		elements = null;
//	}
//
//	public PrintElement[] getElements() {
//		if (elements == null) {
//			elements = new PrintElement[elementList.size()];
//			elementList.toArray(elements);
//		}
//		return elements;
//	}
//}
