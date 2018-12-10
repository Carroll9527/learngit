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

<script type="text/javascript">
	/* $(function(){
	 $('#dg').edatagrid({
	 url: 'history.do',
	 saveUrl: 'save.do',
	 updateUrl: 'update_user.php',
	 destroyUrl: 'destroy_user.php',
	 queryParams: {
	 name: 'easyui',
	 subject: 'datagrid',
	 }
	 });
	 }); */
</script>
</head>
<body style="width:100%;height:100%;">
	<div class="warp easyui-panel" data-options="border:false">
		<!-- Search panel start -->
		<div class="easyui-panel ui-search-panel" title="搜索栏"
			data-options="striped: true,collapsible:true,iconCls:'icon-search'">
			<form id="searchForm">
				<p class="ui-fields">
					<!-- <label class="ui-label">Name:</label> -->
					<input name="name" class="easyui-box ui-text" style="width: 100px;">
				</p>
				<a href="#" id="btn-search" class="easyui-linkbutton"
					iconCls="icon-search">搜索</a> <a href="#" id="btn-search"
					class="easyui-linkbutton" iconCls="icon-import"
					onclick="openUploadFileDialog()">导入</a> <a href=""></a>
			</form>
		</div>
		<!--Search panel end -->

		<!-- Export Start -->
		<div id="dlg2" class="easyui-dialog"
			style="width: 400px; height: 180px; padding: 10px 20px" closed="true"
			buttons="#dlg-buttons2">
			<form id="uploadForm" action="upload.do" method="post"
				enctype="multipart/form-data">
				<table>
					<tr>
						<a href="javascript:void(0)" class="easyui-linkbutton"
							onclick="downloadTemplate()">下载模版 </a>
						<!-- onclick="downloadTemplate()"-->
					</tr>
					<tr>
						<td><input type="file" name="excelFile"></td>
					</tr>
				</table>
			</form>
		</div>

		<div id="dlg-buttons2">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-ok" onclick="uploadFile()">上传</a> <a
				href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-cancel"
				onclick="javascript:$('#dlg2').dialog('close')">关闭</a>
		</div>
		<!-- Export End -->

		<!-- Export2 Start -->
		<div id="dlg4" class="easyui-dialog"
			style="width: 400px; height: 180px; padding: 10px 20px" closed="true"
			buttons="#dlg-buttons3">
			<form id="huploadForm" action="hupload.do" method="post"
				enctype="multipart/form-data">
				<table>
					<tr>
						<a href="javascript:void(0)" class="easyui-linkbutton"
							onclick="downloadHTemplate()">下载模版 </a>
						<!-- onclick="downloadTemplate()"-->
					</tr>
					<tr>
						<td><input type="file" name="excelFile"></td>
					</tr>
				</table>
			</form>
		</div>

		<div id="dlg-buttons3">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-ok" onclick="huploadFile()">上传周报</a> <a
				href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-cancel"
				onclick="javascript:$('#dlg4').dialog('close')">关闭</a>
		</div>
		<!-- Export2 End -->

		<!-- 右键 开始 -->
		<div id="mm" class="easyui-menu" style="width: 120px;">
			<div onClick="view()" data-options="iconCls:'icon-search'">查看</div>
			<!-- <div onClick="add()" data-options="iconCls:'icon-add'">新增</div>
			<div onClick="edit()" data-options="iconCls:'icon-edit'">编辑</div>
			<div onClick="del()" data-options="iconCls:'icon-remove'">删除</div> -->
			<div class="menu-sep"></div>
			<div onClick="startPrint()" data-options="iconCls:'icon-print'">打印</div>
			<div onClick="reload()" data-options="iconCls:'icon-reload'">刷新</div>
			<!--     <div iconCls="icon-delete" onclick="onDelete()">删除</div>   
      <div iconCls="icon-xiaoxi" onclick="onAdds()">发送个人消息</div> -->
			     
			<!--  <div>   
          <span>其它添加方式</span>   
          <div>   
              <div iconCls="icon-commbook" onclick="saveToGroup()">存通讯录</div>   
              <div iconCls="icon-qunzu" onclick="deptImport()">导入</div>   
          </div>   
      </div>   -->
			 
		</div>
		<!-- 弹出框开始 -->
		<div id="dlg3" class="easyui-dialog"
			style="width: 1000px; height: 300px;" closed="true"
			buttons="#dlg-buttons2">
			<table id="dg" toolbar="#toolbar" idField="id" rownumbers="true"
				fitColumns="true" singleSelect="true">
				<thead>
					<tr>
						<th field="visit_times" editor="{type:'datetimebox',options:{}}" >拜访时间</th>
						<th field="visit_contents"
							editor="{type:'validatebox',options:{}}">拜访内容</th>
						<th field="classifications"
							editor="{type:'validatebox',options:{}}">分类</th>
						<th field="mediatypes" editor="{type:'validatebox',options:{}}">媒体类型</th>
						<th field="specific_positions"
							editor="{type:'validatebox',options:{}}">具体位置</th>
						<th field="budgets" editor="{type:'validatebox',options:{}}">预算</th>
						<th field="expected_release_dates"
							editor="{type:'validatebox',options:{}}">发布期</th>
						<th field="next_week_plans"
							editor="{type:'validatebox',options:{}}">下周计划</th>
						<!-- <th field="phone" width="50" editor="text">Phone</th>
			<th field="email" width="50" editor="{type:'validatebox',options:{validType:'email'}}">Email</th> -->
					</tr>
				</thead>
			</table>
			<div id="toolbar">
				<a href="#" class="easyui-linkbutton" iconCls="icon-add"
					plain="true" onclick="javascript:$('#dg').edatagrid('addRow')">添加</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-remove"
					plain="true" onclick="javascript:$('#dg').edatagrid('destroyRow')">删除</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save"
					plain="true" onclick="javascript:$('#dg').edatagrid('saveRow')">保存</a>
				<!-- 	<a href="#" class="easyui-linkbutton" iconCls="icon-save"
					plain="true" onclick="javascript:$('#dg').edatagrid('editRow')">更新</a>-->
				<a href="#" class="easyui-linkbutton" iconCls="icon-undo"
					plain="true" onclick="javascript:$('#dg').edatagrid('cancelRow')">撤销</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-import"
					plain="true" onclick="openHUploadFileDialog()">导入</a>
			</div>
		</div>

		<div id="dlg-buttons2">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-ok" onclick="javascript:$('#dg').edatagrid('saveRow')">保存</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-cancel"
				onclick="javascript:$('#dlg3').dialog('close')">关闭</a>
		</div>

		<!-- 弹出框结束 -->
		<!-- 右键结束 -->
		<!-- Data List -->
		<form id="listForm" method="post">
			<table id="data-list"
				data-options="onRowContextMenu: function (e, rowIndex, rowData) {     
 $('#mm').menu('show', { left: e.pageX, top: e.pageY }); e.preventDefault();
}"></table>
		</form>


		<!-- Edit Win&Form -->
		<div id="edit-win" class="easyui-dialog" title="Basic window"
			data-options="closed:true,iconCls:'icon-save',modal:true"
			style="width: 800px; height: 600px;">
			<form id="editForm" class="ui-form" method="post">
				<input class="hidden" name="id">
				<div class="ui-edit">
					<div class="ftitle">客户信息</div>
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
						<label>行业:</label>
						<!-- <input class="easyui-combobox" type="text"  name="mediatype" > -->
						<select class="easyui-combobox" style="width: 200px"
							name="industry" data-options="required:true">
							<option value="互联网" selected="selected">互联网</option>
							<option value="化妆品">化妆品</option>
							<option value="食品饮料">食品饮料</option>
							<option value="餐饮娱乐">餐饮娱乐</option>
							<option value="机械制造">机械制造</option>
							<option value="奢侈品">奢侈品</option>
							<option value="邮电通讯">邮电通讯</option>
							<option value="生活服务">生活服务</option>
							<option value="服饰箱包">服饰箱包</option>
							<option value="金融保险">金融保险</option>
							<option value="文化传媒">文化传媒</option>
							<option value="广告会展">广告会展</option>
							<option value="政府公益">政府公益</option>
							<option value="科教文卫">科教文卫</option>
							<option value="日用快消">日用快消</option>
							<option value="家居建材">家居建材</option>
							<option value="商业贸易">商业贸易</option>
							<option value="烟酒粮油">烟酒粮油</option>
							<option value="医疗保健">医疗保健</option>
							<option value="数码家电">数码家电</option>
							<option value="旅游">旅游</option>
							<option value="交通物流">交通物流</option>
							<option value="能源化工">能源化工</option>
						</select>
					</div>
					<div class="fitem">
						<label>客户姓名:</label> <input class="easyui-validatebox" type="text"
							name="customerName">
					</div>
					<div class="fitem">
						<label>职务:</label> <input class="easyui-validatebox" type="text"
							name="post">
					</div>
					<div class="fitem">
						<label>拜访时间:</label><input class="easyui-datetimebox" type="text"
							name="visitTime">
						<!-- 	</div>
					<div class="fitem">
						<label>拜访内容:</label>
						<textarea class="easyui-validatebox" name="visitContent"></textarea>
					</div>

					 <div class="fitem">  
		               <label>分类:</label>
		               <input class="easyui-validatebox" type="text"  name="classification" >
		           </div> 
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
						<input class="easyui-combobox" type="text"  name="mediatype" >
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
							<option value="市区灯箱">市区灯箱</option>
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
					<!-- <label>区域部门:</label>  -->
						<input type="hidden" class="easyui-validatebox" type="text"
							name="nextWeekPlan">
					</div>
					<div class="fitem">
						<!-- <label>报告人:</label> -->
						<input type="hidden" class="easyui-validatebox" type="text"
							name="speaker">
					</div>
					<div class="fitem">
						<!-- <label>提交时间:</label> -->
						<input type="hidden" class="easyui-validatebox" type="text"
							name="submissionTime">
					</div>

					<!--<div class="fitem">  
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
	<script type="text/javascript"
		src="${msUrl}/js/ux/siteMain/jquery.edatagrid.js"></script>
	<script type="text/javascript"
		src="${msUrl}/js/ux/siteMain/print.js"></script>	
	<script type="text/javascript" src="${msUrl}/js/ux/siteMain/extend.js"></script>
</body>
</html>
