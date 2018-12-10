package com.yiya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiya.bean.FollowInformation;
import com.yiya.bean.FollowInformationExample;
import com.yiya.bean.Weekly;
import com.yiya.mapper.FollowInformationMapper;

@Service
public class FolllowInfollowmationServiceImpl implements FollowInformationService {

	@Autowired
	FollowInformationMapper<?> FollowMapper;
	
	@Override
	public List<FollowInformation> list() {
		FollowInformationExample example = new  FollowInformationExample();
		return FollowMapper.selectByExample(example) ;
	}

	@Override
	public List<FollowInformation> listbyfullname(int name) {
		return FollowMapper.listFollow(name);
	}

	@Override
	public void add(FollowInformation f) {
		FollowMapper.insertSelective(f);
	}
    
	@Override
	public FollowInformation get(int id) {
		return FollowMapper.selectByPrimaryKey(id);
	}

	@Override
	public int total() {
		return 0;
	}

	@Override
	public List<FollowInformation> listp(String p, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FollowInformation> groupid(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(FollowInformation f) {
		FollowMapper.updateByPrimaryKeySelective(f);
	}

	@Override
	public void delete(Integer[] id) {
		// TODO Auto-generated method stub
		FollowMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<FollowInformation> uniongroupid(int id, String name) {
		// TODO Auto-generated method stub
		return FollowMapper.uqueryslef(id, name);
	}


}
