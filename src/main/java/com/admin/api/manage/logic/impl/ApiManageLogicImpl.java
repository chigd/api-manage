package com.admin.api.manage.logic.impl;

import com.admin.api.entity.ApiInfo;
import com.admin.api.entity.ApiInfoExample;
import com.admin.api.manage.logic.ApiManageLogic;
import com.admin.api.manage.mapper.ApiInfoMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
	public List<ApiInfo> getApiList(Map<String,Object> params) {
		ApiInfoExample example = new ApiInfoExample();
		String keyword = MapUtils.getString(params, "keyword");
		if (StringUtils.hasLength(keyword)) {
			keyword = "%" + keyword + "%";
			example.createCriteria().andNameLike(keyword);
			example.or().andUrlLike(keyword);
		}
		//使用分页插件,核心代码就这一行
		params.putIfAbsent("pageNum", 1);
		params.putIfAbsent("pageSize", 10);
		PageHelper.startPage(params);
		List<ApiInfo> apiInfos = apiInfoMapper.selectByExample(example);
		return apiInfos;
	}

	@Override
	public int saveOrUpdate(ApiInfo apiInfo) {
		apiInfo.setUpdatetime(new Date());
		apiInfo.setUser("chigd");
		if (StringUtils.hasLength(apiInfo.getId())) {
			return apiInfoMapper.updateByPrimaryKey(apiInfo);
		}
		apiInfo.setId(UUID.randomUUID().toString());
		return apiInfoMapper.insert(apiInfo);
	}

	@Override
	public int update(ApiInfo apiInfo) {
		return apiInfoMapper.updateByPrimaryKey(apiInfo);
	}

	@Override
	public int delById(String id) {
		return apiInfoMapper.deleteByPrimaryKey(id);
	}

}
