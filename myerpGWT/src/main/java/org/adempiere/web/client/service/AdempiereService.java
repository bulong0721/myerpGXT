package org.adempiere.web.client.service;

import java.util.List;

import org.adempiere.model.common.AdModelKey;
import org.adempiere.model.common.LookupValue;
import org.adempiere.model.core.ADUserContext;
import org.adempiere.model.core.AdTab;
import org.adempiere.web.client.model.AdJSONData;
import org.adempiere.web.client.model.AdLoadConfig;
import org.adempiere.web.client.model.AdMenuModel;
import org.adempiere.web.client.model.AdProcessModel;
import org.adempiere.web.client.model.AdWindowModel;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("adempiere")
public interface AdempiereService extends RemoteService {

	List<AdMenuModel> getAdMenu();

	List<LookupValue> getOptions(String columnName, int type, Long adRefId);

	AdWindowModel getADWindowModel(long windowId);

	AdProcessModel getADProcessModel(long processId);

	AdJSONData getWindowTabData(AdLoadConfig loadCfg);

	Boolean deleteData(List<AdModelKey> keyList, String tableName);

	Boolean selectData(List<AdModelKey> keyList, String tableName);

	Boolean addNewData(AdTab tabModel);

	ADUserContext getADUserContext();

	Boolean logout();
}
