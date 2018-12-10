package com.yiya.service;

import java.util.List;

import com.yiya.bean.Weekly;


public interface WeeklyService {
	
	
	
	//全部查询
	List<Weekly> list();
	void add(Weekly w);
	void update(Weekly w);
	void delete(int id);
	Weekly get(int id);
	int total();
	
	List<Weekly> listp(String p, String name);
	List<Weekly> groupid(int id, String name);
	
	//多表关联分组查询
	List<Weekly> uniongroupid(int id,String name);
}

