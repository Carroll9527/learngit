$package('YiYa.siteWeekly');

// Start
function exportUser() {
	window.open('user!export');
}

function exportUser2() {
	window.open('user!export2');
}

function openUploadFileDialog() {
	$("#dlg2").dialog('open').dialog('setTitle', '批量导入数据');
}

function openHUploadFileDialog() {
	$("#dlg4").dialog('open').dialog('setTitle', '批量导入周报');
}

function downloadTemplate() {
	window.open('download.do');
}

function downloadHTemplate() {
	window.open('hdownload.do');
}

function uploadFile() {
	$("#uploadForm").form("submit", {
		success : function(result) {
			var result = eval('(' + result + ')');
			if (result.errorMsg) {
				$.messager.alert("系统提示", result.errorMsg);
			} else {
				$.messager.alert("系统提示", "上传成功");
				$("#dlg2").dialog("close");
				$("#dg").datagrid("reload");
			} 
		}
	});
}

function startPrint(){
	CreateFormPage('打印测试', $('#data-list'));
}

function huploadFile() {
	$("#huploadForm").form("submit", {
		success : function(result) {
			var result = eval('(' + result + ')');
			if (result.errorMsg) {
				$.messager.alert("系统提示", result.errorMsg);
			} else {
				$.messager.alert("系统提示", "上传成功");
				$("#dlg4").dialog("close");
				$("#dg").datagrid("reload");
			} 
		}
	});
}

/*
 * 
 * {
					field : 'visitContent',
					title : '拜访内容',
					width : 150,
					sortable : true
				}, {
					field : 'classification',
					title : '分类',
					sortable : true
				}, {
					field : 'mediatype',
					title : '媒体类型',
					sortable : true
				}, {
					field : 'specificPosition',
					title : '具体位置',
					width : 200,
					sortable : true
				}, {
					field : 'budget',
					title : '预算',
					sortable : true
				}, {
					field : 'expectedReleaseDate',
					title : '预计发布期',
					sortable : true
				}, {
					field : 'remarks',
					title : '备注',
					sortable : true
				}, {
					field : 'nextWeekPlan',
					title : '下周计划',
					width : 200,
					sortable : true
				}, {
					field : 'groupid',
					title : '区域部门',
					sortable : true
				}
				{
					field : 'submissionTime',
					title : '提交时间',
					sortable : true,
					formatter : function(value, row, index) {
						var unixTimestamp = new Date(value);
						return unixTimestamp.toLocaleString();
					}
				},
				
 * 
*/

// End
YiYa.siteWeekly = function() {
	var _box = null;
	var _this = {
		config : {
			dataGrid : {
				title : '客户列表',
				url : 'dataList.do',
				columns : [ [ {
					field : 'id',
					checkbox : true
				}, {
					field : 'speaker',
					title : '销售经理',
					sortable : true
				},  {
					field : 'fullCustomerName',
					title : '客户全称',
					sortable : true
				}, {
					field : 'mainBrand',
					title : '主品牌',
					sortable : true
				}, {
					field : 'subbrand',
					title : '子品牌',
					align : 'center',
					sortable : true
				},{
					field : 'industry',
					title : '行业',
					align : 'center',
					sortable : true
				}, 
				
				{
					field : 'customerName',
					title : '客户姓名',
					align : 'right',
					width : 80,
					sortable : true
				}, {
					field : 'post',
					title : '职务',
					sortable : true
				}, {
					field : 'visitTime',
					title : '首次拜访时间',
					sortable : true
				}] ],
				
			}
		},
		init : function() {
			_box = new YDataGrid(_this.config);
			_box.init();
		}
	}
	return _this;
}();

function onRowContextMenu(e, rowIndex, rowData){
	   e.preventDefault();
	   var selected=$("#data-list").datagrid('getRows'); //获取所有行集合对象
	   var idValue = selected[rowIndex].id;//index为当前右键行的索引，指向当前行对象
	     $(this).datagrid('selectRecord', idValue);  //通过获取到的id的值做参数选中一行
	    $('#mm').menu('show', {
	        left:e.pageX,
	        top:e.pageY
	    });        
	}
//查看详细
function view(){
	var record = $("#data-list").datagrid('getChecked');;
	$("#dlg3").dialog('open').dialog('setTitle', '历史记录');
	var handler='history.do?id='+record[0].id;
	$('#dg').edatagrid({
		url: handler,
		saveUrl: 'hsave.do',
		updateUrl: 'hupdate.do',
		destroyUrl: 'hdelete.do',
		formatter:myformatter,parser:myparser,
		/*queryParams: {
			id: record[0].id
			
		}*/
	});
}
//时间格式化
function myformatter(date){
	var y = date.getFullYear();
	var m = date.getMonth()+1;
	var d = date.getDate();
	return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
}
function myparser(s){
	if (!s) return new Date();
	var ss = (s.split('-'));
	var y = parseInt(ss[0],10);
	var m = parseInt(ss[1],10);
	var d = parseInt(ss[2],10);
	if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
		return new Date(y,m-1,d);
	} else {
		return new Date();
	}
}

$(function() {
	YiYa.siteWeekly.init();
});