<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@include file="/view/resource.jsp"%>
<style type="text/css">
input {
	width: 300px
}
</style>
</head>
<body>
	<div class="warp easyui-panel" data-options="border:false">

		<!-- Search panel start -->
		<div class="easyui-panel ui-search-panel" title="Search box"
			data-options="striped: true,collapsible:true,iconCls:'icon-search'">
			<form id="searchForm">
				<p class="ui-fields">
					<label class="ui-label">Name:</label> <input name="name"
						class="easyui-box ui-text" style="width: 100px;">
				</p>
				<a href="#" id="btn-search" class="easyui-linkbutton"
					iconCls="icon-search">Search</a>
			</form>
		</div>
		<!--  Search panel end -->

		<!-- Data List -->
		<form id="listForm" method="post">
			<table id="data-list"></table>
		</form>

		<!-- Edit Win&Form -->
		<div id="edit-win" class="easyui-dialog" title="Basic window"
			data-options="closed:true,iconCls:'icon-save',modal:true"
			style="width: 800px; height: 600px;">
			<form id="editForm" class="ui-form" method="post">
				<input class="hidden" name="id">
				<div class="ui-edit">
					<div class="ftitle">周报信息</div>
					<div class="fitem">
						<label>客户全称:</label> <input class="easyui-validatebox" type="text"
							name="fullCustomerName">
					</div>
					<div class="fitem">
						<label>主品牌:</label> <input class="easyui-validatebox" type="text"
							name="mainBrand">
					</div>
					<div class="fitem">
						<label>子品牌:</label> <input class="easyui-validatebox" type="text"
							name="subbrand">
					</div>
					<div class="fitem">
						<label>客户名称:</label> <input class="easyui-validatebox" type="text"
							name="customerName">
					</div>
					<div class="fitem">
						<label>职务:</label> <input class="easyui-validatebox" type="text"
							name="post">
					</div>
					<div class="fitem">
						<!-- <label>拜访时间:</label> --> <input type="hidden" class="easyui-validatebox" type="text"
							name="visitTime">
					</div>
					<div class="fitem">
						<label>拜访内容:</label>
						<textarea class="easyui-validatebox" 
							name="visitContent"></textarea>
					</div>

					<!--  <div class="fitem">  
		               <label>分类:</label>  
		               <input class="easyui-validatebox" type="text"  name="classification" >
		           </div>  -->
					<div class="fitem">
						<label>分类:</label> <select class="easyui-combobox"
							style="width: 200px" name="classification"
							data-options="required:true">
							<option value="自有" selected="selected">自有</option>
							<option value="代理">代理</option>
						</select>
					</div>
					<div class="fitem">
						<label>媒体类型:</label>
						<!-- <input class="easyui-combobox" type="text"  name="mediatype" > -->
						<select class="easyui-combobox" style="width: 200px"
							name="mediatype" data-options="required:true">
							<option value="机场单立柱" selected="selected">机场单立柱</option>
							<option value="机场廊桥">机场廊桥</option>
							<option value="机场灯箱">机场灯箱</option>
							<option value="机场展位">机场展位</option>
							<option value="机场LED立柱">机场LED立柱</option>
							<option value="市区大牌">市区大牌</option>
							<option value="自有地铁">自有地铁</option>
							<option value="北京公交">北京公交</option>
							<option value="机场">机场</option>
							<option value="市区大牌">市区大牌</option>
							<option value="高速路">高速路</option>
							<option value="地铁">地铁</option>
							<option value="公交车身">公交车身</option>
							<option value="候车亭">候车亭</option>
							<option value="高铁/火车站">高铁/火车站</option>
							<option value="电梯海报">电梯海报</option>
							<option value="网络/新媒体">网络/新媒体</option>
							<option value="公关">公关</option>
							<option value="策划">策划</option>
							<option value="其他">其他</option>
						</select>
					</div>

					<div class="fitem">
						<label>具体位置:</label> <input class="easyui-validatebox" type="text"
							name="specificPosition"">
					</div>

					<div class="fitem">
						<label>预算:</label> <input class="easyui-validatebox" type="text"
							name="budget">

					</div>
					<div class="fitem">
						<label>预计发布期:</label> <input class="easyui-validatebox"
							type="text" name="expectedReleaseDate">
					</div>
				</div>
				<div class="fitem">
					<label>备注:</label> <input class="easyui-validatebox" type="text"
						name="remarks">
				</div>
					<div class="fitem">
					<label>下周计划:</label> <input class="easyui-validatebox" type="text"
						name="nextWeekPlan">
				</div>
					<div class="fitem">
					<!-- <label>区域部门:</label>  --><input type="hidden" class="easyui-validatebox" type="text"
						name="nextWeekPlan">
				</div>
				<div class="fitem">
						<!-- <label>报告人:</label> --> <input type="hidden" class="easyui-validatebox" type="text"
							name="speaker">
					</div>
					<div class="fitem">
						<!-- <label>提交时间:</label> --> <input type="hidden" class="easyui-validatebox" type="text"
							name="submissionTime">
					</div>

				<!--   <div class="fitem">  
		               <label>State:</label>  
		               <select class="easyui-combobox" name="state" >
	                    	<option value="0" selected="selected">可用</option>
	                    	<option value="1">禁用</option>
                    	</select>
		           </div> 
		           <div class="fitem">  
		               <label>Description:</label>  
		               <textarea class="easyui-validatebox" data-options="length:[0,100]" name="descr"></textarea>
		           </div>  -->
		</div>
		</form>
	</div>
	</div>
	<!-- Js Start -->
	<script type="text/javascript" src="${msUrl}/js/commons/YDataGrid.js"></script>
	<script type="text/javascript"
		src="${msUrl}/js/ux/siteMain/siteWeekly.js"></script>
</body>
</html>
