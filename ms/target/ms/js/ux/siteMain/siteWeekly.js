$package('YiYa.siteWeekly');


YiYa.siteWeekly = function(){
	var _box = null;
	var _this = {
		config:{
  			dataGrid:{ 				
  				title:'周报列表',
	   			url:'dataList.do',	   			
	   			columns:[[
					{field:'id',checkbox:true},
					{field:'fullCustomerName',title:'客户全称',sortable:true},
					{field:'mainBrand',title:'主品牌',sortable:true},
					{field:'subbrand',title:'子品牌',align:'center',sortable:true},
					{field:'customerName',title:'客户姓名',align:'right',width:80,sortable:true},					
					{field:'post',title:'职务',sortable:true},
					{field:'visitTime',title:'拜访时间',sortable:true,
						 formatter:function(value,row,index){
			        		 var unixTimestamp = new Date(value);
			        		 return unixTimestamp.toLocaleString();
			        		 }},
					{field:'visitContent',title:'拜访内容',width:150,sortable:true},
					{field:'classification',title:'分类',sortable:true},
					{field:'mediatype',title:'媒体类型',sortable:true},
					{field:'specificPosition',title:'具体位置',width:200,sortable:true},
					{field:'budget',title:'预算',sortable:true},
					{field:'expectedReleaseDate',title:'预计发布期',sortable:true},
					{field:'remarks',title:'备注',sortable:true},	
					{field:'nextWeekPlan',title:'下周计划',width:200,sortable:true},
					{field:'groupid',title:'区域部门',sortable:true},
					{field:'speaker',title:'报告人',sortable:true},
					{field:'submissionTime',title:'提交时间',sortable:true,
						 formatter:function(value,row,index){
			        		 var unixTimestamp = new Date(value);
			        		 return unixTimestamp.toLocaleString();
			        		 }}
				]]
			}
		},
		init:function(){
			_box = new YDataGrid(_this.config); 
			_box.init();
		}
	}
	return _this;
}();

$(function(){
	YiYa.siteWeekly.init();
});		