package com.yiya.action;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiya.bean.FollowInformation;
import com.yiya.bean.SysUser;
import com.yiya.bean.Weekly;
import com.yiya.model.WeeklyModel;
import com.yiya.service.FollowInformationService;
import com.yiya.service.SiteFollowInformationService;
import com.yiya.service.SiteWeeklyService;
import com.yiya.service.WeeklyService;
import com.yiya.utils.ExcelUtil;
import com.yiya.utils.HtmlUtil;
import com.yiya.utils.Page;
import com.yiya.utils.SessionUtils;

@Controller
@RequestMapping("/siteWeek")
public class SiteWeeklyAction extends BaseAction {
	@Autowired
	WeeklyService weeklyService;

	@Autowired
	FollowInformationService followInformationService;

	private File userUploadFile;

	public File getUserUploadFile() {
		return userUploadFile;
	}

	public void setUserUploadFile(File userUploadFile) {
		this.userUploadFile = userUploadFile;
	}

	private final static Logger log = Logger.getLogger(SiteWeeklyAction.class);

	@Autowired(required = false)
	private SiteWeeklyService<Weekly> siteWeekly;

	@Autowired
	private SiteFollowInformationService<FollowInformation> follow;
	
	@RequestMapping("/list")
	public ModelAndView list(WeeklyModel model, HttpServletRequest request) throws Exception {
		Map<String, Object> context = getRootMap();
		return forword("siteMain/siteWeekly", context);
	}

	@RequestMapping("/typeListJson")
	public void typeListJson(HttpServletResponse response) throws Exception {
		List<Weekly> dataList = siteWeekly.queryByAll();
		HtmlUtil.writerJson(response, dataList);
	}


	@RequestMapping("/hupdate")
	public void hupdate(@RequestParam String classifications, @RequestParam String mediatypes,
			@RequestParam String specific_positions, @RequestParam String budgets,
			@RequestParam String expected_release_dates, @RequestParam String visit_contents, @RequestParam int id,
			@RequestParam String visit_times, HttpServletResponse response, @RequestParam String next_week_plans,
			HttpServletRequest request, HttpSession httpSession) throws Exception {
		FollowInformation bean = new FollowInformation();
		bean.setId(id);
		bean.setNext_week_plans(next_week_plans);
		bean.setVisit_contents(visit_contents);
		bean.setVisit_times(visit_times);
		bean.setClassifications(classifications);
		bean.setMediatypes(mediatypes);
		bean.setSpecific_positions(specific_positions);
		bean.setBudgets(budgets);
		bean.setExpected_release_dates(expected_release_dates);
		followInformationService.update(bean);
	}

	@RequestMapping("/hsave")
	public void hsave(@RequestParam String isNewRecord, FollowInformation bean, HttpServletResponse response,
			HttpServletRequest request, HttpSession httpSession) throws Exception {
		// 11/4/2018 16:20:20
//		Date date = new SimpleDateFormat("MM/dd/yyyyHH:mm:ss").parse(visit_time);
//		bean.setVisit_times(date);
		// 设置关联的周报表
		int i = (int) httpSession.getAttribute("id");
		bean.setWkid(i);
		if (isNewRecord.length() > 0) {
			followInformationService.add(bean);
		}
	}

	@RequestMapping("/save")
	public void save(Weekly bean, HttpServletResponse response, HttpServletRequest request) throws Exception {
		Map<String, Object> context = new HashMap<String, Object>();
		// 获取登录用户
		SysUser a = SessionUtils.getUser(request);
//		Date now=new Date();
//		SimpleDateFormat sf=new SimpleDateFormat("yyyyMMdd");
//		//获取今天的日期
//		String nowDay=sf.format(now);

		if (bean.getId() == null) {
			bean.setGroupid(a.getId() + "");
			bean.setSpeaker(a.getNickName());
			weeklyService.add(bean);
			sendSuccessMessage(response, "添加成功");
			// 是否是本人周报 &&是否是当天
		}
//		else if (a.getNickName().equals(a.getNickName())&&sf.format(bean.getSubmissionTime()).equals(nowDay)) {
//			weeklyService.update(bean);
//			sendSuccessMessage(response, "成功");
//		} 
		else {
			weeklyService.update(bean);
			sendSuccessMessage(response, "修改成功");
		}
	}

	/*
	 * @RequestMapping("/dataList") public void dataList(SiteTypeModel
	 * model,HttpServletResponse response) throws Exception{ List<Weekly>
	 * dataList=siteWeekly.queryByList(model); // Map<String,Object> jsonMap = new
	 * HashMap<String,Object>(); jsonMap.put("total",
	 * model.getPager().getRowCount()); jsonMap.put("rows", dataList);
	 * HtmlUtil.writerJson(response,jsonMap); }
	 */

	@ResponseBody
	@RequestMapping(value = "/dataList", produces = "text/html;charset=UTF-8")
	public String getManyWeekly(Page page, HttpServletRequest request, String name) {
		PageHelper.offsetPage((page.getPage() - 1) * page.getRows(), page.getRows());
		SysUser a = SessionUtils.getUser(request);
		List<Weekly> we = weeklyService.groupid(a.getId(), name);
		int total = (int) new PageInfo<Weekly>(we).getTotal();
		JSONObject result = new JSONObject();
		result.put("rows", we);
		result.put("total", total);
		return result.toJSONString();
	}

	@RequestMapping("/getId")
	public void getId(Integer id, HttpServletResponse response) throws Exception {
		Map<String, Object> context = new HashMap();
		Weekly bean = siteWeekly.queryById(id);
		if (bean == null) {
			sendFailureMessage(response, "未选中记录");
			return;
		}
		context.put(SUCCESS, true);
		context.put("data", bean);
		HtmlUtil.writerJson(response, context);
	}

	@RequestMapping("/delete")
	public void delete(Integer[] id, HttpServletResponse response) throws Exception {
		siteWeekly.delete(id);
		sendSuccessMessage(response, "未选中记录");
	}

	@RequestMapping("/hdelete")
	public void hdelete(Integer[] id, HttpServletResponse response) throws Exception {
		/* followInformationService.delete(id); */
		follow.delete(id);
		sendSuccessMessage(response, "未选中记录");
	}

	@ResponseBody
	@RequestMapping(value = "/history", produces = "text/html;charset=UTF-8")
	public String historys(HttpServletRequest request, Integer id, HttpSession httpSession) throws Exception {
		List<FollowInformation> fi = followInformationService.listbyfullname(id);
		httpSession.setAttribute("id", id);
		JSONObject result = new JSONObject();
		result.put("rows", fi);
		return result.toJSONString();
	}

	/*
	 * 文件下载
	 */
	@RequestMapping("download")
	public ResponseEntity<byte[]> export(HttpServletRequest request) throws IOException {
		ServletContext servletContext = request.getServletContext();// 获取ServletContext的对象 代表当前WEB应用
		String fileName = "模板.xlsx";
		String realPath = servletContext.getRealPath("/Upload/" + fileName);// 得到文件上传目的位置的真实路径
		HttpHeaders headers = new HttpHeaders();
		File file = new File(realPath);
		String fileName1 = new String(fileName.getBytes("UTF-8"), "iso-8859-1");// 解决文件名乱码
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		headers.setContentDispositionFormData("attachment", fileName1);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
	}
	
	@RequestMapping("hdownload")
	public ResponseEntity<byte[]> hexport(HttpServletRequest request) throws IOException {
		ServletContext servletContext = request.getServletContext();// 获取ServletContext的对象 代表当前WEB应用
		String fileName = "周报模板.xlsx";
		String realPath = servletContext.getRealPath("/Upload/" + fileName);// 得到文件上传目的位置的真实路径
		HttpHeaders headers = new HttpHeaders();
		File file = new File(realPath);
		String fileName1 = new String(fileName.getBytes("UTF-8"), "iso-8859-1");// 解决文件名乱码
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		headers.setContentDispositionFormData("attachment", fileName1);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
	}

	@RequestMapping("/upload")
	public void upload(@RequestParam("excelFile") MultipartFile excelFile, HttpServletResponse response,
			HttpServletRequest request) throws Exception {
		System.out.println("通过传统方式form表单提交方式导入excel文件！");
		InputStream inputStream = excelFile.getInputStream();
//		POIFSFileSystem fs=new POIFSFileSystem(inputStream);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet hssfSheet = wb.getSheetAt(0);
		if (hssfSheet != null) {
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				XSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if (hssfRow == null) {
					continue;
				}
				SysUser a = SessionUtils.getUser(request);
				Weekly bean = new Weekly();
				bean.setGroupid(a.getId() + "");
				bean.setSpeaker(a.getNickName());
				bean.setFullCustomerName(ExcelUtil.formatCell(hssfRow.getCell(0)));
				bean.setMainBrand(ExcelUtil.formatCell(hssfRow.getCell(1)));
				bean.setSubbrand(ExcelUtil.formatCell(hssfRow.getCell(2)));
				bean.setIndustry(ExcelUtil.formatCell(hssfRow.getCell(3)));
				bean.setCustomerName(ExcelUtil.formatCell(hssfRow.getCell(4)));
				bean.setPost(ExcelUtil.formatCell(hssfRow.getCell(5)));
				bean.setVisitTime(ExcelUtil.formatCell(hssfRow.getCell(6)));
				/*bean.setVisitContent(ExcelUtil.formatCell(hssfRow.getCell(6)));
				bean.setClassification(ExcelUtil.formatCell(hssfRow.getCell(7)));
				bean.setMediatype(ExcelUtil.formatCell(hssfRow.getCell(8)));
				bean.setSpecificPosition(ExcelUtil.formatCell(hssfRow.getCell(9)));
				bean.setBudget(ExcelUtil.formatCell(hssfRow.getCell(10)));
				bean.setExpectedReleaseDate(ExcelUtil.formatCell(hssfRow.getCell(11)));
				bean.setRemarks(ExcelUtil.formatCell(hssfRow.getCell(12)));
				bean.setNextWeekPlan(ExcelUtil.formatCell(hssfRow.getCell(13)));*/
				weeklyService.add(bean);
//				Connection con=null;
//				try{
//					con=dbUtil.getCon();
//					userDao.userAdd(con, user);
//				}catch(Exception e){
//					e.printStackTrace();
//				}finally{
//					dbUtil.closeCon(con);
//				}
			}
		}
//		JSONObject result=new JSONObject();
//		result.put("success", "true");
//		ResponseUtil.write(ServletActionContext.getResponse(), result);
		sendSuccessMessage(response, "导入成功");
	}

	@RequestMapping("/hupload")
	public void hupload(@RequestParam("excelFile") MultipartFile excelFile, HttpServletResponse response,
			HttpServletRequest request, HttpSession httpSession) throws Exception {
		System.out.println("通过传统方式form表单提交方式导周报excel文件！");
		InputStream inputStream = excelFile.getInputStream();
//		POIFSFileSystem fs=new POIFSFileSystem(inputStream);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet hssfSheet = wb.getSheetAt(0);
		int i = (int) httpSession.getAttribute("id");
		if (hssfSheet != null) {
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				XSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if (hssfRow == null) {
					continue;
				}
				FollowInformation bean = new FollowInformation();
				bean.setWkid(i);
				bean.setVisit_times(ExcelUtil.formatCell(hssfRow.getCell(0)));
				bean.setVisit_contents(ExcelUtil.formatCell(hssfRow.getCell(1)));
				bean.setClassifications(ExcelUtil.formatCell(hssfRow.getCell(2)));
				bean.setMediatypes(ExcelUtil.formatCell(hssfRow.getCell(3)));
				bean.setSpecific_positions(ExcelUtil.formatCell(hssfRow.getCell(4)));
				bean.setBudgets(ExcelUtil.formatCell(hssfRow.getCell(5)));
				bean.setExpected_release_dates(ExcelUtil.formatCell(hssfRow.getCell(6)));
				bean.setNext_week_plans(ExcelUtil.formatCell(hssfRow.getCell(7)));
				followInformationService.add(bean);
			}
		}
		sendSuccessMessage(response, "导入成功");
	}
}
