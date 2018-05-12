package com.admin.api.manage.controller;

import com.admin.api.util.ResponseBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**

 * @Title:
 * @author: chigd
 * @date:2018/5/9 0:18
 */
@RestController
public class IndexController {

	@GetMapping(value = "/ping")
	public ResponseBuilder index() {
		return ResponseBuilder.success("hellowrold3223");
	}
}
