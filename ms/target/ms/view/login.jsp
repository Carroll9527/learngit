<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>沃捷- 用户登录</title>
		<%@include file="/view/resource.jsp" %>
    	<link rel="stylesheet" type="text/css" href="${msUrl}/css/main.css">
    	<link rel="stylesheet" type="text/css" href="${msUrl}/css/user_login.css">
	</head>
	<script>
  window.onload = function(){
    var oForm = document.getElementById('loginForm');
    var oUser = document.getElementById('user');
    var oPswd = document.getElementById('pswd');
    var oRemember = document.getElementById('remember');
    //页面初始化时，如果帐号密码cookie存在则填充
    if(getCookie('user') && getCookie('pswd')){
      oUser.value = getCookie('user');
      oPswd.value = getCookie('pswd');
      oRemember.checked = true;
    }
    //复选框勾选状态发生改变时，如果未勾选则清除cookie
    oRemember.onchange = function(){
      if(!this.checked){
        delCookie('user');
        delCookie('pswd');
      }
    };
    //表单提交事件触发时，如果复选框是勾选状态则保存cookie
    oForm.onsubmit = function(){
      if(remember.checked){ 
        setCookie('user',oUser.value,7); //保存帐号到cookie，有效期7天
        setCookie('pswd',oPswd.value,7); //保存密码到cookie，有效期7天
      }
    };
  };
  //设置cookie
  function setCookie(name,value,day){
    var date = new Date();
    date.setDate(date.getDate() + day);
    document.cookie = name + '=' + value + ';expires='+ date;
  };
  //获取cookie
  function getCookie(name){
    var reg = RegExp(name+'=([^;]+)');
    var arr = document.cookie.match(reg);
    if(arr){
      return arr[1];
    }else{
      return '';
    }
  };
  //删除cookie
  function delCookie(name){
    setCookie(name,null,-1);
  };
</script>
	<form id="loginForm" action="toLogin.do" method="post">
	<body id=userlogin_body>
		<div></div>
		<div id=user_login>
			<dl>
				<dd id=user_top>
					<ul>
						<li class=user_top_l></li>
						<li class=user_top_c></li>
						<li class=user_top_r></li>
					</ul>
				<dd id=user_main>
					<ul>
						<li class=user_main_l></li>
						<li class=user_main_c>
							<div class=user_main_box>
								<ul>
								<li class=user_main_text>
								  用户名：
									</li>
									<li class=user_main_input>
										<input id="user" class="txtusernamecssclass easyui-validatebox"  data-options="required:true,validType:'email',missingMessage:'邮箱不能为空.',invalidMessage:'邮箱格式不正确'" name="email"  >
									</li>
								</ul>
								<ul>
									<li class=user_main_text>
									 密码：
									</li>
									<li class=user_main_input>
										<input id="pswd" class="txtpasswordcssclass easyui-validatebox"   data-options="required:true,missingMessage:'密码不能为空.'" type="password" name="pwd">
									</li>
								</ul>
								<ul>
									<li class=user_main_text>
									验证码：
									</li>
									<li class=user_main_input>
										<img class="vc-pic" width="100" height="32" title="点击刷新验证码" src="ImageServlet?time=new Date().getTime()">
										<input class="vc-text easyui-validatebox" data-options="required:true,missingMessage:'验证码不能为空.'" maxlength="4" type="text" name="verifyCode">
									</li>
								</ul>
								<ul>
							
								
							   <li class=user_main_text>
								记住密码:
								</li>
								<li class=user_main_input>
									<input id="remember" type="checkbox" style="zoom:180%;">
								</li>
								</ul>
							</div>
						</li>
						<li class=user_main_r>
							<input class="ibtnentercssclass"
								style="border-top-width: 0px; border-left-width: 0px; border-bottom-width: 0px; border-right-width: 0px"
								type=image src="images/login/user_botton.gif">
						</li>
					</ul>
				<dd id=user_bottom>
					<ul>
						<li class=user_bottom_l></li>
						<li class=user_bottom_c>
							<!-- <span style="margin-top: 40px">沃捷传媒 <a
								href="http://www.voyagemedia.com.cn/">www.voyagemedia.com</a> 。</span> -->
						</li>
						<li class=user_bottom_r></li>
					</ul>
				</dd>
			</dl>
		</div>
		<div></div>
		</form>
		<script type="text/javascript" src="${msUrl}/js/ux/login.js"></script>
	</body>
</html>
