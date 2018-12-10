package com.yiya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiya.bean.Weekly;
import com.yiya.exception.ServiceException;
import com.yiya.mapper.WeeklyMapper;
import com.yiya.model.WeeklyModel;


@Service("siteWeeklyService")
public class SiteWeeklyService<T> extends BaseService<T> {
	
	@Autowired
	private WeeklyMapper<T> mapper;
	
	public void add(T t) throws Exception{
		validation(t,0);
		getMapper().add(t);
	}
	
    public void update(T t) throws Exception{
    	validation(t,1);
    	getMapper().update(t);
    }
    
    public void delete(int id) throws Exception{
    	getMapper().delete(id);
    }
    
	@Override
	public WeeklyMapper<T> getMapper() {
		return mapper;
	}
   
	public List<T> queryByAll() throws Exception{
		return getMapper().queryByAll();		
	}
	
	private void validation(T t,int num) throws Exception{
		Weekly bean=(Weekly) t;
		//验证name是否重复
		WeeklyModel model=new WeeklyModel();
		model.setFullCustomerName(bean.getFullCustomerName());
		int count=getMapper().queryByCount(model);
		if(count>num){
			throw new ServiceException("customername is can't be duplicate");
		}
	}
}
