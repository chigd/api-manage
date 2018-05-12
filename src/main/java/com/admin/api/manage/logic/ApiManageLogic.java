package com.admin.api.manage.logic;

import com.admin.api.entity.ApiInfo;

import java.util.List;
import java.util.Map;

public interface ApiManageLogic {


	List<ApiInfo> getApiList(Map<String,Object> params);

	int saveOrUpdate(ApiInfo apiInfo);

	int update(ApiInfo apiInfo);

	int delById(String id);
}
