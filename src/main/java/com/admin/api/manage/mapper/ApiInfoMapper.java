package com.admin.api.manage.mapper;

import com.admin.api.entity.ApiInfo;
import com.admin.api.entity.ApiInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ApiInfoMapper {
    int countByExample(ApiInfoExample example);

    int deleteByExample(ApiInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApiInfo record);

    int insertSelective(ApiInfo record);

    List<ApiInfo> selectByExample(ApiInfoExample example);

    ApiInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApiInfo record, @Param("example") ApiInfoExample example);

    int updateByExample(@Param("record") ApiInfo record, @Param("example") ApiInfoExample example);

    int updateByPrimaryKeySelective(ApiInfo record);

    int updateByPrimaryKey(ApiInfo record);
}