package com.admin.api.manage.mapper;

import com.admin.api.entity.ParamInfo;
import com.admin.api.entity.ParamInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ParamInfoMapper {
    int countByExample(ParamInfoExample example);

    int deleteByExample(ParamInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ParamInfo record);

    int insertSelective(ParamInfo record);

    List<ParamInfo> selectByExample(ParamInfoExample example);

    ParamInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ParamInfo record, @Param("example") ParamInfoExample example);

    int updateByExample(@Param("record") ParamInfo record, @Param("example") ParamInfoExample example);

    int updateByPrimaryKeySelective(ParamInfo record);

    int updateByPrimaryKey(ParamInfo record);
}