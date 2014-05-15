package org.adempiere.web.client.service;

import java.util.List;

import org.adempiere.common.ADModelKey;
import org.adempiere.common.ADUserContext;
import org.adempiere.common.LookupValue;
import org.adempiere.common.ProcessResult;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormModel;
import org.adempiere.web.client.model.ADJSONData;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.ADLoginModel;
import org.adempiere.web.client.model.ADNodeModel;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.model.ADSequenceModel;
import org.adempiere.web.client.model.ADWindowModel;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("adempiere")
public interface AdempiereService extends RemoteService {

	List<ADNodeModel> getMenuNodes(int parentID);

	List<ADNodeModel> getTreeNodes(int adTreeId, ADNodeModel loadCfg);

	List<LookupValue> getOptions(String columnName, int type, Integer adRefId);

	List<ADSequenceModel> getSequences(ADLoadConfig loadCfg);

	void updateSequences(List<ADSequenceModel> seqList, String tableName);

	ADWindowModel getADWindowModel(Integer windowId);

	ADFormModel getADFormModel(Integer formId);

	ADProcessModel getADProcessModel(Integer processId);

	ADProcessModel getProcessWithFormModel(Integer processId);

	// acl
	ADJSONData getWindowTabData(ADLoadConfig loadCfg);

	// acl
	void deleteData(List<ADModelKey> keyList, String tableName);

	void selectData(List<ADModelKey> keyList, String tableName);

	// acl
	void updateData(String json, String tableName);

	ADUserContext getADUserContext();

	// acl
	String processCallout(ADFieldModel field, String rowJson);

	// acl
	ProcessResult executeProcess(ADProcessModel pModel, String rowJson, String paramJson);

	Boolean logout();

	Boolean login(ADLoginModel loginModel);
}
