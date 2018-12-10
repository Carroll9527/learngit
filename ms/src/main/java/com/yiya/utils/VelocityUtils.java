package com.yiya.utils;

import org.apache.velocity.VelocityContext;

import com.github.pagehelper.util.StringUtil;

public class VelocityUtils{
	
	public static VelocityContext getContext(){
		VelocityContext context = new VelocityContext();
		context.put("PathUtil", new PathUtil());
		context.put("DateUtil", new DateUtil());
		context.put("StringUtil", new StringUtil());
		context.put("basePath", PathUtil.getBasePath());
		return context;
	}
	
}

