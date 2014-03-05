package org.adempiere.print.layout;

import java.util.Properties;

import org.adempiere.common.ADExpression;
import org.adempiere.model.ADPrintTableFormat;

public class ParameterElement extends GridElement {
	/**
	 * Parameter Element.
	 * 
	 * <pre>
	 *  Parameter fromValue - toValue
	 * </pre>
	 * 
	 * @param query query
	 * @param ctx context
	 * @param tFormat Table Format
	 */
	public ParameterElement(ADExpression query, Properties ctx, ADPrintTableFormat tFormat) {
		super(0, 4);
//		setData(0, 0, "Parameter:", tFormat.getPageHeader_Font(), tFormat.getPageHeaderFG_Color());
//		for (int r = 0; r < query.getRestrictionCount(); r++) {
//			setData(r, 1, query.getInfoName(r), tFormat.getParameter_Font(), tFormat.getParameter_Color());
//			setData(r, 2, query.getInfoOperator(r), tFormat.getParameter_Font(), tFormat.getParameter_Color());
//			setData(r, 3, query.getInfoDisplayAll(r), tFormat.getParameter_Font(), tFormat.getParameter_Color());
//		}
	} // ParameterElement

} // ParameterElement

