package org.adempiere.web.client.service;

import java.util.List;

import org.adempiere.model.common.ADUserContext;
import org.adempiere.model.common.AdModelKey;
import org.adempiere.model.common.LookupValue;
import org.adempiere.web.client.model.AdFormModel;
import org.adempiere.web.client.model.AdJSONData;
import org.adempiere.web.client.model.AdLoadConfig;
import org.adempiere.web.client.model.AdMenuModel;
import org.adempiere.web.client.model.AdProcessModel;
import org.adempiere.web.client.model.AdResultWithError;
import org.adempiere.web.client.model.AdWindowModel;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("adempiere")
public interface AdempiereService extends RemoteService {

	List<AdMenuModel> getAdMenuModels();

	List<LookupValue> getOptions(String columnName, int type, Long adRefId);

	AdWindowModel getADWindowModel(long windowId);
	
	AdFormModel getADFormModel(long formId);

	AdProcessModel getADProcessModel(long processId);

	AdJSONData getWindowTabData(AdLoadConfig loadCfg);

	AdResultWithError deleteData(List<AdModelKey> keyList, String tableName);

	AdResultWithError selectData(List<AdModelKey> keyList, String tableName);

//	AdResultWithError addNewData(AdTab tabModel);
	
	AdResultWithError updateData(String json, String tableName);

	ADUserContext getADUserContext();

	Boolean logout();
}
