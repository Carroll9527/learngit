$package('YiYa.siteWeekly');

// 扩展
/**
 * 扩展方法 使datagrid的列中能显示row中的对象里的属性 无需调用自动执行 Field：Staff.JoinDate
 */
$.fn.datagrid.defaults.view = $
		.extend(
				{},
				$.fn.datagrid.defaults.view,
				{
					renderRow : function(target, fields, frozen, rowIndex,
							rowData) {
						var opts = $.data(target, 'datagrid').options;
						var cc = [];
						if (frozen && opts.rownumbers) {
							var rownumber = rowIndex + 1;
							if (opts.pagination) {
								rownumber += (opts.pageNumber - 1)
										* opts.pageSize;
							}
							cc
									.push('<td class="datagrid-td-rownumber"><div class="datagrid-cell-rownumber">'
											+ rownumber + '</div></td>');
						}
						for (var i = 0; i < fields.length; i++) {
							var field = fields[i];
							var col = $(target).datagrid('getColumnOption',
									field);
							var fieldSp = field.split(".");
							var dta = rowData[fieldSp[0]];
							for (var j = 1; j < fieldSp.length; j++) {
								dta = dta[fieldSp[j]];
							}
							if (col) {
								// get the cell style attribute
								var styleValue = col.styler ? (col.styler(dta,
										rowData, rowIndex) || '') : '';
								var style = col.hidden ? 'style="display:none;'
										+ styleValue + '"'
										: (styleValue ? 'style="' + styleValue
												+ '"' : '');

								cc.push('<td field="' + field + '" ' + style
										+ '>');

								var style = 'width:' + (col.boxWidth) + 'px;';
								style += 'text-align:' + (col.align || 'left')
										+ ';';
								style += opts.nowrap == false ? 'white-space:normal;'
										: '';

								cc.push('<div style="' + style + '" ');
								if (col.checkbox) {
									cc.push('class="datagrid-cell-check ');
								} else {
									cc.push('class="datagrid-cell ');
								}
								cc.push('">');

								if (col.checkbox) {
									cc
											.push("<input type=\"checkbox\" "
													+ (rowData.checked ? "checked=\"checked\""
															: ""));
									cc.push(" name=\"" + field + "\" value=\""
											+ (dta != undefined ? dta : "")
											+ "\">");
								} else if (col.formatter) {
									cc.push(col.formatter(dta, rowData,
											rowIndex));
								} else {
									cc.push(dta);
								}

								cc.push('</div>');
								cc.push('</td>');
							}
						}
						return cc.join('');
					}
				});

// end

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
 * , { field : 'groupid', title : '区域部门', sortable : true } { field : 'remarks',
 * title : '备注', sortable : true },
 */
// End
YiYa.siteWeekly = function() {
	var _box = null;
	var _this = {
		config : {
			dataGrid : {
				title : '周报列表',
				url : 'dataList.do',
				columns : [ [ {
					field : 'id',
					checkbox : true
				}, {
					field : 'weekly.speaker',
					title : '销售经理',
					
					sortable : true
				}, {
					field : 'submission_times',
					title : '提交时间',
				    width:150,
					sortable : true,
					formatter : function(value, row, index) {
						var unixTimestamp = new Date(value);
						return unixTimestamp.toLocaleString();
					}
				}, {
					field : 'weekly.fullCustomerName',
					title : '客户全称',
					width:150,
					sortable : true
				}, {
					field : 'weekly.mainBrand',
					title : '主品牌',
					width:80,
					sortable : true
				}, {
					field : 'weekly.subbrand',
					title : '子品牌',
					width:80,
					align : 'center',
					sortable : true
				}, {
					field : 'weekly.industry',
					title : '行业',
					width:50,
					align : 'center',
					sortable : true
				},

				{
					field : 'weekly.customerName',
					title : '客户姓名',
					align : 'right',
					width:50,
					sortable : true
				}, {
					field : 'weekly.post',
					title : '职务',
					width:80,
					sortable : true
				}, {
					field : 'visit_times',
					title : '拜访时间',
					 width:150,
					sortable : true

				}, {
					field : 'visit_contents',
					title : '拜访内容',
					width:200,
					sortable : true,
					formatter:function format(val,row){if (val){return '<span title="' + val + '">' + val + '</span>';} else {return val;}}
				}, {
					field : 'classifications',
					title : '分类',
					width:80,
					sortable : true
				}, {
					field : 'mediatypes',
					title : '媒体类型',
					width:80,
					sortable : true
				}, {
					field : 'specific_positions',
					title : '具体位置',
					width:200,
					sortable : true,
					formatter:function format(val,row){if (val){return '<span title="' + val + '">' + val + '</span>';} else {return val;}}
				}, {
					field : 'budgets',
					title : '预算',
					width:80,
					sortable : true

				}, {
					field : 'expected_release_dates',
					title : '预计发布期',
					width:150,
					sortable : true

				}, {
					field : 'next_week_plans',
					title : '下周计划',
					width:200,
					sortable : true,
					formatter:function format(val,row){if (val){return '<span title="' + val + '">' + val + '</span>';} else {return val;}}
				} ] ],
			}
		},
		init : function() {
			_box = new YDataGrid(_this.config);
			_box.init();
		}
	}
	return _this;
}();

function onRowContextMenu(e, rowIndex, rowData) {
	e.preventDefault();
	var selected = $("#data-list").datagrid('getRows'); // 获取所有行集合对象
	var idValue = selected[rowIndex].id;// index为当前右键行的索引，指向当前行对象
	$(this).datagrid('selectRecord', idValue); // 通过获取到的id的值做参数选中一行
	$('#mm').menu('show', {
		left : e.pageX,
		top : e.pageY
	});
}
// 查看详细
function view() {
	var record = $("#data-list").datagrid('getChecked');
	;
	$("#dlg3").dialog('open').dialog('setTitle', '历史记录');
	var handler = 'history.do?id=' + record[0].id;
	$('#dg').edatagrid({
		url : handler,
		saveUrl : 'hsave.do',
		updateUrl : 'hupdate.do',
		destroyUrl : 'hdelete.do',
		formatter : myformatter,
		parser : myparser,
	/*
	 * queryParams: { id: record[0].id }
	 */
	});
}
// 时间格式化
function myformatter(date) {
	var y = date.getFullYear();
	var m = date.getMonth() + 1;
	var d = date.getDate();
	return y + '-' + (m < 10 ? ('0' + m) : m) + '-' + (d < 10 ? ('0' + d) : d);
}
function myparser(s) {
	if (!s)
		return new Date();
	var ss = (s.split('-'));
	var y = parseInt(ss[0], 10);
	var m = parseInt(ss[1], 10);
	var d = parseInt(ss[2], 10);
	if (!isNaN(y) && !isNaN(m) && !isNaN(d)) {
		return new Date(y, m - 1, d);
	} else {
		return new Date();
	}
}

$(function() {
	YiYa.siteWeekly.init();
});