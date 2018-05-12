package com.admin.api.manage.controller;

import com.admin.api.entity.ApiInfo;
import com.admin.api.manage.logic.ApiManageLogic;
import com.admin.api.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**

 * @Title:
 * @author: chigd
 * @date:2018/5/8 19:34
 */
@RestController
public class ApiManageController {

	@Autowired
	private ApiManageLogic apiManageLogic;

	/**
	 *
	 * @param param keyword pageSize pageNum
	 * @return
	 */
	@RequestMapping(value = "/list")
	public ResponseBuilder method(@RequestParam Map<String,Object> params) {
		return ResponseBuilder.success(apiManageLogic.getApiList(params));
	}

	@RequestMapping(value = "/save")
	public ResponseBuilder saveOrUpdate(@RequestBody ApiInfo apiInfo) {
		return ResponseBuilder.success(apiManageLogic.saveOrUpdate(apiInfo));
	}

	@RequestMapping(value = "/update")
	public ResponseBuilder update(@RequestBody ApiInfo apiInfo) {
		return ResponseBuilder.success(apiManageLogic.update(apiInfo));
	}

	@RequestMapping(value = "/delete")
	public ResponseBuilder delById(String id) {
		return ResponseBuilder.success(apiManageLogic.delById(id));
	}


}
