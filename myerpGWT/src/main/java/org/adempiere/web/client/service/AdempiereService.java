package org.adempiere.web.client.service;

import java.util.List;

import org.adempiere.model.common.ADUserContext;
import org.adempiere.model.common.ADModelKey;
import org.adempiere.model.common.LookupValue;
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

	List<LookupValue> getOptions(String columnName, int type, Long adRefId);

	ADWindowModel getADWindowModel(long windowId);
	
	ADFormModel getADFormModel(long formId);

	ADProcessModel getADProcessModel(long processId);
	
	ADResultPair<ADProcessModel, ADFormModel> getProcessWithFormModel(long processId);

	ADJSONData getWindowTabData(ADLoadConfig loadCfg);

	ADResultWithError deleteData(List<ADModelKey> keyList, String tableName);

	ADResultWithError selectData(List<ADModelKey> keyList, String tableName);

//	AdResultWithError addNewData(AdTab tabModel);
	
	ADResultWithError updateData(String json, String tableName);

	ADUserContext getADUserContext();

	Boolean logout();
}
