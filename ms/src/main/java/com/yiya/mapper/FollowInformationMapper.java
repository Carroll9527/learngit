package com.yiya.mapper;

import java.util.List;



import com.yiya.bean.FollowInformation;
import com.yiya.bean.FollowInformationExample;
import com.yiya.bean.Weekly;

public interface FollowInformationMapper<T> extends BaseMapper<T>{
    int deleteByPrimaryKey(Integer[] id);

    int insert(FollowInformation record);

    int insertSelective(FollowInformation record);

    List<FollowInformation> selectByExample(FollowInformationExample example);

    FollowInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowInformation record);

    int updateByPrimaryKey(FollowInformation record);
    
    List<FollowInformation> listFollow(int name);
    
  //联合递归查询
    List<FollowInformation> uqueryslef(Object id,Object name);
    
}