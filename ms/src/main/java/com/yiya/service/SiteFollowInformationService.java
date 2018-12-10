package com.yiya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiya.bean.FollowInformation;
import com.yiya.bean.Weekly;
import com.yiya.exception.ServiceException;
import com.yiya.mapper.FollowInformationMapper;
import com.yiya.model.WeeklyModel;

@Service("siteFollowInformationService")
public class SiteFollowInformationService<T> extends BaseService<T> {
    
	@Autowired
	private FollowInformationMapper<T> mapper;
	
	public void add(T t) throws Exception{
		
		getMapper().add(t);
	}
	
    public void update(T t) throws Exception{
    	
    	getMapper().update(t);
    }
    
    public void delete(int id) throws Exception{
    	getMapper().delete(id);
    }
    
	@Override
	public FollowInformationMapper<T> getMapper() {
		return mapper;
	}
	

}
