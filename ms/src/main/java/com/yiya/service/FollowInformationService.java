package com.yiya.service;

import java.util.List;

import com.yiya.bean.FollowInformation;
import com.yiya.bean.Weekly;

public interface FollowInformationService {
	
	//全部查询
	List<FollowInformation> list();
	void add(FollowInformation f);
	void update(FollowInformation f);
	void delete(Integer[] id);
	FollowInformation get(int id);
	int total();
    
	List<FollowInformation> listp(String p, String name);
	List<FollowInformation> groupid(int id, String name);
	List<FollowInformation> listbyfullname(int id);
	
	//多表关联分组查询
    List<FollowInformation> uniongroupid(int id,String name);
}
