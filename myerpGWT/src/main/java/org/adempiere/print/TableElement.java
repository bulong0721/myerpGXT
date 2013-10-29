package org.adempiere.print;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Properties;

import org.adempiere.print.layout.PrintElement;

public class TableElement extends PrintElement {

	@Override
	public void paint(Graphics2D g2d, int pageNo, Point2D pageStart, Properties ctx, boolean isView) {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean calculateSize() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getPageXCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPageIndex(int pageNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPageYIndex(int pi) {
		// TODO Auto-generated method stub
		return 0;
	}

}
