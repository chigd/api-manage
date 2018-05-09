package com.admin.api.manage.logic.impl;

import com.admin.api.entity.ApiInfo;
import com.admin.api.entity.ApiInfoExample;
import com.admin.api.manage.logic.ApiManageLogic;
import com.admin.api.manage.mapper.ApiInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**

 * @Title:
 * @author: chigd
 * @date:2018/5/8 19:41
 */
@Service
public class ApiManageLogicImpl implements ApiManageLogic {
	@Autowired
	private ApiInfoMapper apiInfoMapper;

	@Override
	public List<ApiInfo> getApiList(String keyword) {
		ApiInfoExample example = new ApiInfoExample();
		if (StringUtils.hasLength(keyword)) {
			example.createCriteria().andNameLike(keyword);
			example.or().andUrlLike(keyword);
		}
		List<ApiInfo> apiInfos = apiInfoMapper.selectByExample(example);
		return apiInfos;
	}

	@Override
	public void insert(ApiInfo apiInfo) {
		apiInfoMapper.insert(apiInfo);
	}

	@Override
	public int update(ApiInfo apiInfo) {
		return apiInfoMapper.updateByPrimaryKey(apiInfo);
	}

}
