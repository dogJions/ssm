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
<!--头部-->
    <%@ include file="../header.jsp" %>
 <!--主体内容-->
 <section class="publicMian ">
  	<%@ include file="../life.jsp" %>

<div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>密码修改页面</span>
            </div>
            <div class="providerAdd">
                <form id="userForm" class="userForm" name="userForm" method="post" action="${ctx}/user/revise_psw">
                    <input type="hidden" name="method" value="savepwd">
                    <!--div的class 为error是验证错误，ok是验证成功-->
                    <div class="info"></div>
                    <div class="">
                        <label for="oldPassword">旧密码：</label>
                        <input type="password" name="oldpassword" id="oldpassword" value="" datatype="*6-15" nullmsg="请填入用户oldPsw"> 
						<font color="red">*</font>
                    </div>
                    <div>
                        <label for="newPassword">新密码：</label>
                        <input type="password" name="newpassword" id="newpassword" value="" datatype="*6-15" nullmsg="请填入用户newPsw"> 
						<font color="red">*</font>
                    </div>
                    <div>
                        <label for="reNewPassword">确认新密码：</label>
                        <input type="password" name="rnewpassword" id="rnewpassword" value="" datatype="*6-15" nullmsg="请填入用户newPsw" recheck="newpassword"> 
						<font color="red">*</font>
                    </div>
                    <div class="providerAddBtn">
                        <!--<a href="#">保存</a>-->
                        <input type="submit" name="save" id="save" value="保存" class="input-button">
                    </div>
                </form>
            </div>
        </div>
    </section>



<%@ include file="../bottom.jsp" %>

<div style="position: absolute; z-index: 19700; top: -1970px; left: -1970px;"><iframe style="width: 186px; height: 198px;"  frameborder="0" border="0" scrolling="no"></iframe></div></body></html>