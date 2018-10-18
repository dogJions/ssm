<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head lang="en"><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>超市订单管理系统</title>
    <link type="text/css" rel="stylesheet" href="${ctx}/public/css/style.css">
    <link type="text/css" rel="stylesheet" href="${ctx}/public/css/public.css">
    <link type="text/css" rel="stylesheet" href="${ctx}/public/js/Validform/style.css">
    <script type="text/javascript" src="${ctx}/public/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${ctx}/public/js/My97DatePicker/WdatePicker.js"></script>
     <script type="text/javascript" src="${ctx}/public/js/Validform/Validform_v5.3.2_min.js"></script>
    <script type="text/javascript">
    	$(function(){
    		$(".userForm").Validform();
    	})
    </script>
<body>
<!--头部-->
    <%@ include file="../header.jsp" %>
 <!--主体内容-->
 <section class="publicMian ">
  	<%@ include file="../life.jsp" %>
     

<div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面 &gt;&gt; 用户添加页面</span>
        </div>
        <div class="providerAdd">
            <form id="userForm" name="userForm" class="userForm" method="post" action="${ctx}/user/add_user">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div>
                    <label for="userCode">用户编码：</label>
                    <input type="text" name="usercode" id="userCode" value="" datatype="*6-15" nullmsg="请填入用户码编">  
					<!-- 放置提示信息 -->
					<font color="red" style="color: rgb(102, 102, 102);">* 用户编码是您登录系统的账号 6-15 字符</font>
                </div>
                <div>
                    <label for="userName">用户名称：</label>
                    <input type="text" name="username" id="userName" value="" datatype="s1-8" nullmsg="请填入用户名称"> 
					<font color="red">*1-8 位字符</font>
                </div>
                <div>
                    <label for="userPassword">用户密码：</label>
                    <input type="password" name="userpassword" id="userPassword" value="" datatype="*6-15" nullmsg="请填入信息"> 
					<font color="red">*</font>
                </div>
                <div>
                    <label for="ruserPassword">确认密码：</label>
                    <input type="password" name="ruserPassword" id="ruserPassword" value="" datatype="*6-15" nullmsg="请填入信息" recheck="userpassword"> 
					<font color="red">*两次密码需一致</font>
                </div>
                <div>
                    <label>用户性别：</label>
					<select name="gender" id="gender">
					    <option value="1" selected="selected">女</option>
					    <option value="2">男</option>
					 </select>
                </div>
                <div>
                    <label for="birthday">出生日期：</label>
                    <input type="data" class="Wdate" id="birthday" name="birthday" readonly="readonly" onclick="WdatePicker();">
					<font color="red">*</font>
                </div>
                <div>
                    <label for="phone">用户电话：</label>
                    <input type="text" name="phone" id="phone" value="" datatype="m" nullmsg="请填入信息"> 
					<font color="red">*</font>
                </div>
                <div>
                    <label for="address">用户地址：</label>
                   <input name="address" id="address" value="" datatype="s1-15" nullmsg="请填入信息">
                </div>
                <div>
                    <label>用户角色：</label>
                    <!-- 列出所有的角色分类 -->
					<select name="userrole" id="userRole">
						<option value="1">系统管理员</option>
						<option value="2">经理</option>
						<option value="3">普通员工</option>
					</select>
	        		<font color="red">*</font>
                </div>
                <div class="providerAddBtn">
                    <input type="submit"  value="保存">
                    <a href="${ctx}/user/to_user_all">
					<input type="button"  value="返回">
					</a>
                </div>
            </form>
        </div>
</div>
</section>


<%@ include file="../bottom.jsp" %>

<div style="position: absolute; z-index: 19700; top: -1970px; left: -1970px;"><iframe style="width: 186px; height: 198px;"  frameborder="0" border="0" scrolling="no"></iframe></div></body></html>