package com.yiya.test;

import java.util.List;

import org.apache.commons.collections.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.yiya.bean.SiteColumn;
import com.yiya.bean.SiteMain;
import com.yiya.bean.SiteType;
import com.yiya.bean.SysMenu;
import com.yiya.model.SiteMainModel;
import com.yiya.service.SiteColumnService;
import com.yiya.service.SiteMainService;
import com.yiya.service.SiteTypeService;
import com.yiya.service.SysMenuService;

public class SpringTest {
	static ApplicationContext context = new ClassPathXmlApplicationContext(
			new String[]{"spring-*.xml"}); 
	
	SiteMainService<SiteMain> siteMainService = (SiteMainService)context.getBean("siteMainService");
//	UserMainService<UserMain> userMainService = (UserMainService)context.getBean("userMainService");
	SiteTypeService<SiteType> siteTypeService = (SiteTypeService)context.getBean("siteTypeService");
	SiteColumnService<SiteColumn> siteColumnService = (SiteColumnService)context.getBean("siteColumnService");
	private SysMenuService<SysMenu> sysMenuService = (SysMenuService)context.getBean("sysMenuService");
	
	
	public static void main(String[] args) throws Exception {
		SpringTest test = new SpringTest();
//		test.updateSite();
//		test.addColumn();
		test.testList();
	}

	public void testList(){
		List<SysMenu> rootMenus = null;
		List<SysMenu> childMenus = null;
		rootMenus = sysMenuService.getRootMenu(null);// 查询所有根节点
		childMenus = sysMenuService.getChildMenu();//查询所有子节点
		List<SysMenu> newMenus = ListUtils.sum(rootMenus, childMenus);
		System.out.println("rootMenus:"+rootMenus.size() +" childMenus:"+childMenus.size()+" newMenus:"+newMenus.size());
		for(SysMenu menu: newMenus){
			System.out.println(menu.getUrl());
		}
	}
	
	
	
	public void addTypeRel() throws Exception{
		siteMainService.addTypeRel(new Integer[]{1,2,3}, 3);
		siteMainService.addTypeRel(new Integer[]{1,3}, 2);
		siteMainService.addTypeRel(new Integer[]{1,2}, 1);
		siteMainService.delete(new Object[]{3});
	}
	
	
	
	
	
	
	
	
	public void delType() throws Exception{
		siteTypeService.delete();
	}
	
//	
//	public void addUser() throws Exception{
//		UserMain bean = new UserMain();
//		bean.setEmail("35263107@qq.com");
//		bean.setNickName("swing");
//		bean.setState(0);
//		bean.setPassWord("123456");
//		bean.setUserIcon("1.jpg");
//		userMainService.add(bean);
//	}
	
//	public void updateUser() throws Exception{
//		UserMain bean = new UserMain();
//		bean.setId(2);
//		bean.setEmail("yykk520@qq.com");
//		bean.setNickName("yykk");
//		bean.setState(0);
//		bean.setPassWord("123456");
//		bean.setUserIcon("2.jpg");
//		userMainService.update(bean);
//	}
//	
//	
//	public void delUser() throws Exception{
//		userMainService.delete(4);
//	}
//	
//	
//	public void add() throws Exception{
//		com.yiya.bean.SiteMain a;
//		SiteMain bean = new SiteMain();
//		bean.setName("美图阁");
//		bean.setDomain("www.520mm.cc");
//		bean.setLink("http://www.520mm.cc");
//		bean.setDeleted(0);
//		bean.setState(1);
//		bean.setPic("http://image.mn606.com/images/2012/12/12/150_150/2012121220405491043.jpg");
//		siteMainService.add(bean);
//		System.out.println("id"+bean.getId());
//	}
//	
//	
	public void updateSite() throws Exception{
		SiteMain bean = new SiteMain();
		 bean.setId(3);
		bean.setName("美空网");
		bean.setDomain("www.moko.cc");
		bean.setLink("http://www.moko.cc");
		bean.setDeleted(0);
		bean.setState(1);
		bean.setPic("http://image.mn606.com/images/2012/12/12/150_150/2012121220405491043.jpg");
		siteMainService.update(bean);
		System.out.println("id"+bean.getId());
	}
	
	
	
	public void queryByList() throws Exception{
		SiteMainModel model = new SiteMainModel();
		model.getPager().setPageSize(2);
		List<SiteMain> list = siteMainService.queryByList(model);
		System.out.println(list.size());
		System.out.println(model.getPager().getRowCount());
	}
}
