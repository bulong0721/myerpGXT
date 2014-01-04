package org.adempiere.web.client.service;

import java.util.List;

import org.adempiere.common.ADModelKey;
import org.adempiere.common.ADUserContext;
import org.adempiere.common.LookupValue;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormModel;
import org.adempiere.web.client.model.ADJSONData;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.model.ADResultPair;
import org.adempiere.web.client.model.ADResultWithError;
import org.adempiere.web.client.model.ADWindowModel;
import org.adempiere.web.client.model.ADTreeNode;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("adempiere")
public interface AdempiereService extends RemoteService {

	List<ADTreeNode> getAdMenuModels();

	List<LookupValue> getOptions(String columnName, int type, Integer adRefId);

	ADWindowModel getADWindowModel(Integer windowId);
	
	ADFormModel getADFormModel(Integer formId);

	ADProcessModel getADProcessModel(Integer processId);
	
	ADResultPair<ADProcessModel, ADFormModel> getProcessWithFormModel(Integer processId);

	ADJSONData getWindowTabData(ADLoadConfig loadCfg);

	ADResultWithError deleteData(List<ADModelKey> keyList, String tableName);

	ADResultWithError selectData(List<ADModelKey> keyList, String tableName);

//	AdResultWithError addNewData(AdTab tabModel);
	
	ADResultWithError updateData(String json, String tableName);

	ADUserContext getADUserContext();
	
	String processCallout(ADFieldModel field, String rowJson);
	
	String executeProcess(ADProcessModel pModel, String paramJson);

	Boolean logout();
}
