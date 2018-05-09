package com.admin.api.manage.logic;

import com.admin.api.entity.ApiInfo;

import java.util.List;

public interface ApiManageLogic {


	List<ApiInfo> getApiList(String keyword);

	void insert(ApiInfo apiInfo);

	int update(ApiInfo apiInfo);
}
