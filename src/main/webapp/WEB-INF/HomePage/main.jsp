<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html><head lang="en"><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>超市订单管理系统</title>
    <link type="text/css" rel="stylesheet" href="${ctx}/public/css/style.css">
    <link type="text/css" rel="stylesheet" href="${ctx}/public/css/public.css">
<body>
<!--头部-->
    <%@ include file="header.jsp" %>

    
 <!--主体内容-->
 <section class="publicMian ">
 	<%@ include file="life.jsp" %>
 
    <div class="right">
        <img class="wColck" src="${ctx}/public/images/clock.jpg" alt="">
        <div class="wFont">
            <h2>${user.username}</h2>
            <p>欢迎来到超市订单管理系统!</p>
        </div>
    </div>
</section>

<%@ include file="bottom.jsp" %>


<script type="text/javascript" src="${ctx}/public/js/jquery-1.8.3.min.js"></script>



<div style="position: absolute; z-index: 19700; top: -1970px; left: -1970px;"><iframe style="width: 186px; height: 198px;" src="./登录后界面_files/My97DatePicker.html" frameborder="0" border="0" scrolling="no"></iframe></div></body></html>