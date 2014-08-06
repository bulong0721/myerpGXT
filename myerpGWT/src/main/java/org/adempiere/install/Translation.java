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

import java.io.File;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.adempiere.common.ADEntityBase;
import org.adempiere.service.PersistContext;
import org.adempiere.util.CLogger;
import org.adempiere.util.Msg;
import org.adempiere.util.POUtil;

/**
 * Translation Table Import + Export
 * 
 * @author Jorg Janke
 * @version $Id: Translation.java,v 1.3 2006/07/30 00:51:28 jjanke Exp $
 */
public class Translation {

    public Translation(Properties ctx, PersistContext pCtx){
        this.m_ctx = ctx;
        this.pCtx = pCtx;
    } // Translation

    /** DTD */
    public static final String DTD                          = "<!DOCTYPE adempiereTrl PUBLIC \"-//ComPiere, Inc.//DTD Adempiere Translation 1.0//EN\" \"http://www.adempiere.com/dtd/adempiereTrl.dtd\">";
    /** XML Element Tag */
    public static final String XML_TAG                      = "adempiereTrl";
    public static final String XML_TAG2                     = "compiereTrl";
    /** XML Attribute Table */
    public static final String XML_ATTRIBUTE_TABLE          = "table";
    /** XML Attribute Language */
    public static final String XML_ATTRIBUTE_LANGUAGE       = "language";

    /** XML Row Tag */
    public static final String XML_ROW_TAG                  = "row";
    /** XML Row Attribute ID */
    public static final String XML_ROW_ATTRIBUTE_ID         = "id";
    /** XML Row Attribute Translated */
    public static final String XML_ROW_ATTRIBUTE_TRANSLATED = "trl";

    /** XML Value Tag */
    public static final String XML_VALUE_TAG                = "value";
    /** XML Value Column */
    public static final String XML_VALUE_ATTRIBUTE_COLUMN   = "column";
    /** XML Value Original */
    public static final String XML_VALUE_ATTRIBUTE_ORIGINAL = "original";

    /** Logger */
    private static CLogger     log                          = CLogger.getCLogger(Translation.class);
    /** Properties */
    private Properties         m_ctx                        = null;
    private PersistContext     pCtx;

    /**
     * Import Translation. Uses TranslationHandler to update translation
     * 
     * @param directory file directory
     * @param AD_Client_ID only certain client if id >= 0
     * @param AD_Language language
     * @param Trl_Table table
     * @return status message
     */
    public String importTrl(String directory, int AD_Client_ID, String AD_Language, String Trl_Table) {
        String fileName = directory + File.separator + Trl_Table + "_" + AD_Language + ".xml";
        log.info(fileName);
        File in = new File(fileName);
        if (!in.exists()) {
            String msg = "File does not exist: " + fileName;
            log.log(Level.SEVERE, msg);
            return msg;
        }
        try {
            TranslationHandler handler = new TranslationHandler(AD_Client_ID);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            parser.parse(in, handler);
            List<ADEntityBase> entityList = handler.getEntityList();
            POUtil.mergeAll(pCtx, entityList);
            log.info("Updated=" + entityList.size());
            return Msg.getMsg(m_ctx, "Updated") + "=" + entityList.size();
        } catch (Exception e) {
            log.log(Level.SEVERE, "importTrl", e);
            return e.toString();
        }
    } // importTrl

    public static void main(String[] args) {
        PersistContext pCtx = new PersistContext();
        Translation trl = new Translation(null, pCtx);
        trl.importTrl("f:/zh_CN (2012翻译-Jerry)4.20", 0, "zh_CN", "AD_Element_Trl");
    }

    public String exportTrl(String directory, int AD_Client_ID, String AD_Language, String Trl_Table) {

        return "";
    } // exportTrl

} // Translation
