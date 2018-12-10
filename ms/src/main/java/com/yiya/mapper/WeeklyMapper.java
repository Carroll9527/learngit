package com.yiya.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yiya.bean.Weekly;
import com.yiya.bean.WeeklyExample;

public interface WeeklyMapper<T> extends BaseMapper<T>{

	public void addEmps(@Param("weeklys")List<Weekly> weeklys); 
	
    int deleteByPrimaryKey(Integer weeklyId);

    int insert(Weekly record);

    int insertSelective(Weekly record);
        
    int insertForeach(Weekly record);

    List<Weekly> selectByExample(WeeklyExample example);
    
    List<Weekly> queryslef(Object id,Object name);
    
    //联合递归查询
    List<Weekly> uqueryslef(Object id,Object name);

	public List<T> queryByAll();
	
	public List<T> listFormation(); 

    int updateByPrimaryKeySelective(Weekly record);

    int updateByPrimaryKey(Weekly record);
	
    int total();
	
	public Weekly selectByPrimaryKey(int id);
		
}