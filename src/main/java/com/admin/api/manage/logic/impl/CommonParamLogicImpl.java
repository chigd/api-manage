package com.admin.api.manage.logic.impl;

import com.admin.api.entity.ParamInfo;
import com.admin.api.manage.logic.CommonParamLogic;
import com.admin.api.manage.mapper.ParamInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;

/**

 * @Title:
 * @author: chigd
 * @date:2018/5/10 16:04
 */
@Service
public class CommonParamLogicImpl implements CommonParamLogic {

	@Autowired
	private ParamInfoMapper paramInfoMapper;

	@Override public int saveOrUpdate(ParamInfo paramInfo) {
		if (StringUtils.hasLength(paramInfo.getId())) {
			paramInfoMapper.updateByPrimaryKey(paramInfo);
		}
		paramInfo.setId(UUID.randomUUID().toString());
		return paramInfoMapper.insert(paramInfo);
	}
}
