package com.admin.api.manage.controller;

import com.admin.api.entity.ApiInfo;
import com.admin.api.manage.logic.ApiManageLogic;
import com.admin.api.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**

 * @Title:
 * @author: chigd
 * @date:2018/5/8 19:34
 */
@RestController
public class ApiManageController {

	@Autowired
	private ApiManageLogic apiManageLogic;

	@RequestMapping(value = "/list")
	public ResponseBuilder method(String keyword) {
		List<ApiInfo> apiList = apiManageLogic.getApiList(keyword);
		return ResponseBuilder.success(apiList);
	}

	@RequestMapping(value = "/save")
	public ResponseBuilder insert(@RequestBody ApiInfo apiInfo) {
		apiManageLogic.insert(apiInfo);
		return ResponseBuilder.success();
	}
	@RequestMapping(value = "/update")
	public ResponseBuilder update(@RequestBody ApiInfo apiInfo) {
		int i = apiManageLogic.update(apiInfo);
		return ResponseBuilder.success();
	}


}
