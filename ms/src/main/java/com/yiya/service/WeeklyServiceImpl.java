package com.yiya.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiya.bean.Weekly;
import com.yiya.bean.WeeklyExample;
import com.yiya.bean.WeeklyExample.Criteria;
import com.yiya.mapper.WeeklyMapper;

@Service
public class WeeklyServiceImpl implements WeeklyService {
	@Autowired
	WeeklyMapper<?> weeklyMapper;

	@Override
	public void add(Weekly w) {
		weeklyMapper.insertSelective(w);
	}

	@Override
	public void update(Weekly w) {
		weeklyMapper.updateByPrimaryKeySelective(w);
	}

	@Override
	public void delete(int id) {
		weeklyMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Weekly get(int id) {
		return weeklyMapper.selectByPrimaryKey(id);
	}
	@Override
	public int total() {
		return weeklyMapper.total();
	}

	@Override
	public List<Weekly> listp(String p, String name) {
		WeeklyExample example = new WeeklyExample();
		Criteria criteria = example.createCriteria();
		// 返回基于参数p的模糊查询
		if (name.equals("fullName")) {
			criteria.andFull_customer_nameLike("%" + p + "%");
		} else if (name.equals("mainbrand")) {
			criteria.andMain_brandLike("%" + p + "%");
		} else if (name.equals("subbrand")) {
			criteria.andSubbrandLike("%" + p + "%");
		} else {
		}
		return weeklyMapper.selectByExample(example);
	}

	@Override
	public List<Weekly> list() {
		WeeklyExample example = new WeeklyExample();
		return weeklyMapper.selectByExample(example);
	}

	@Override
	public List<Weekly> groupid(int id,String name) {
		return weeklyMapper.queryslef(id, name);
	/*	WeeklyExample example = new WeeklyExample();
		WeeklyExample.Criteria criteria = example.createCriteria();
		if (!(id.equals("") || id == null)) {
			criteria.andGroupidEqualTo(id);
		}
		return weeklyMapper.selectByExample(example);*/
	}

	@Override
	public List<Weekly> uniongroupid(int id, String name) {
		// TODO Auto-generated method stub
		return weeklyMapper.uqueryslef(id, name);
	}
}
