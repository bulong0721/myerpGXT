/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.adempiere.install;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.adempiere.common.ADEntityBase;
import org.adempiere.util.CLogger;
import org.adempiere.util.EnvUtil;
import org.adempiere.util.POUtil;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TranslationHandler extends DefaultHandler {
	public TranslationHandler(int AD_Client_ID) {
		clientID = AD_Client_ID;
	} // TranslationHandler

	/** Client */
	private int					clientID		= -1;
	/** Language */
	private String				language		= null;
	/** Is Base Language */
	private boolean				isBaseLanguage	= false;
	/** Table */
	private String				tableName		= null;
	/** Current ID */
	private String				curKey			= null;
	/** Translated Flag */
	private String				translate		= null;
	/** Current ColumnName */
	private String				curColumn		= null;
	/** Current Value */
	private String				curValue		= null;
	private Timestamp			time			= new Timestamp(System.currentTimeMillis());
	private List<ADEntityBase>	entityList		= new ArrayList<ADEntityBase>();
	private TranslateProxy		trlProxy;
	private static CLogger		log				= CLogger.getCLogger(TranslationHandler.class);

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws org.xml.sax.SAXException {
		if (qName.equals(Translation.XML_TAG) || qName.equals(Translation.XML_TAG2)) {
			language = attributes.getValue(Translation.XML_ATTRIBUTE_LANGUAGE);
			isBaseLanguage = EnvUtil.isBaseLanguage(language);
			tableName = attributes.getValue(Translation.XML_ATTRIBUTE_TABLE);
			log.fine("AD_Language=" + language + ", Base=" + isBaseLanguage + ", TableName=" + tableName);
		} else if (qName.equals(Translation.XML_ROW_TAG)) {
			curKey = attributes.getValue(Translation.XML_ROW_ATTRIBUTE_ID);
			translate = attributes.getValue(Translation.XML_ROW_ATTRIBUTE_TRANSLATED);
			trlProxy = new TranslateProxy(tableName);
			entityList.add(trlProxy.getEntity());
			trlProxy.setKey(curKey);
		} else if (qName.equals(Translation.XML_VALUE_TAG)) {
			curColumn = attributes.getValue(Translation.XML_VALUE_ATTRIBUTE_COLUMN);
		} else
			log.severe("UNKNOWN TAG: " + qName);
	} // startElement

	public void characters(char ch[], int start, int length) throws SAXException {
		curValue = new String(ch, start, length);
	} // characters

	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals(Translation.XML_ROW_TAG)) {
			trlProxy.setADClientID(0);
			trlProxy.setADOrgID(0);
			trlProxy.setCreatedBy(100);
			trlProxy.setCreated(POUtil.toString(time, false));
			trlProxy.setUpdatedBy(100);
			trlProxy.setUpdated(POUtil.toString(time, false));
			trlProxy.setActive(true);
			trlProxy.setValue("ADLanguageID", Integer.class, EnvUtil.getLanguageID(language));
			trlProxy.setValue("Translated", Boolean.class, "Y".equalsIgnoreCase(translate));
			if (clientID >= 0)
				trlProxy.setADClientID(clientID);
		} else if (qName.equals(Translation.XML_VALUE_TAG)) {
			trlProxy.setValue(curColumn, String.class, curValue.toString());
		}
	} // endElement

	public List<ADEntityBase> getEntityList() {
		return entityList;
	} // getEntityList

}
