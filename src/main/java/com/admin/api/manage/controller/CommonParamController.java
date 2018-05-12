package com.admin.api.manage.controller;

import com.admin.api.entity.ParamInfo;
import com.admin.api.manage.logic.CommonParamLogic;
import com.admin.api.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**

 * @Title:
 * @author: chigd
 * @date:2018/5/10 16:00
 */
@RestController()
public class CommonParamController {

	@Autowired
	CommonParamLogic commonParamLogic;

	@RequestMapping(value = "/param/save")
	public ResponseBuilder saveOrUpdate(@RequestBody ParamInfo paramInfo) {
		return ResponseBuilder.success(commonParamLogic.saveOrUpdate(paramInfo));
	}
}
