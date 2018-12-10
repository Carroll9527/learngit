 $.extend($.fn.datagrid.defaults.editors, {
            label: {
                init: function (container, options) {
                    var input = $('<div></div>').appendTo(container);
                    return input;
                },
                destroy: function (target) {

                },
                getValue: function (target) {
                    return $(target).html();
                },
                setValue: function (target, value) {
                    $(target).html(value);
                },
                resize: function (target, width) {
                }
            },
             //扩展dategrid的editors的类型
            datetimebox: {
                init: function (container, options) {
                    var input = $('<input type="text" class="easyui-datetimebox">')
                      .appendTo(container);
                    //编辑框延迟加载
                    window.setTimeout(function () {
                        input.datetimebox($.extend({ editable: false }, options));
                    }, 10);                 
                    return input;
                },
                getValue: function (target) {
                    return $(target).datetimebox('getValue');
                },
                setValue: function (target, value) {
                    $(target).val(value);
                    window.setTimeout(function () {
                        $(target).datetimebox('setValue', value);
                    }, 150);
                },
                resize: function (target, width) {
                    var input = $(target);
                    if ($.boxModel == true) {
                        input.width(width - (input.outerWidth()-input.width()));
                    } else {
                        input.width(width);
                  }
               }
            }
        }); 
 

 $.extend($.fn.datagrid.defaults.editors, {
     timespinner: {
         init: function (container, options) {
             var input = $('<input/>').appendTo(container);
             input.timespinner(options);
             return input
         },
         getValue: function (target) {
             var val = $(target).timespinner('getValue');
         },
         setValue: function (target, value) {
             $(target).timespinner('setValue', value);
         },
         resize: function (target, width) {
             var input = $(target);
             if ($.boxModel == true) {
                 input.resize('resize', width - (input.outerWidth() - input.width()));
             } else {
                 input.resize('resize', width);
             }
         }
     }
 });
//时间格式化
 Date.prototype.format = function (format) {
     /*
     * eg:format="yyyy-MM-dd hh:mm:ss";
     */
     if (!format) {
         format = "yyyy-MM-dd hh:mm:ss";
     }
  
     var o = {
         "M+": this.getMonth() + 1, // month
         "d+": this.getDate(), // day
         "h+": this.getHours(), // hour
         "m+": this.getMinutes(), // minute
         "s+": this.getSeconds(), // second
         "q+": Math.floor((this.getMonth() + 3) / 3), // quarter
         "S": this.getMilliseconds()
         // millisecond
     };
  
     if (/(y+)/.test(format)) {
         format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
     }
  
     for (var k in o) {
         if (new RegExp("(" + k + ")").test(format)) {
             format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
         }
     }
     return format;
 };