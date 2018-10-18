<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head lang="en"><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>超市订单管理系统</title>
    <link type="text/css" rel="stylesheet" href="${ctx}/public/css/style.css">
    <link type="text/css" rel="stylesheet" href="${ctx}/public/css/public.css">
    <script type="text/javascript" src="${ctx}/public/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${ctx}/public/js/BillAllAjax.js"></script>
	<script type="text/javascript" src="${ctx}/public/js/laypage/laypage.js"></script>
<body>
<!--头部-->
   <%@ include file="../header.jsp" %>

 <!--主体内容-->
 <section class="publicMian ">
    <%@ include file="../life.jsp" %>
    
<div class="right">
       <div class="location">
           <strong>你现在所在的位置是:</strong>
           <span>订单管理页面</span>
       </div>
       <div class="search">
       
			<input name="method" value="query" class="input-text" type="hidden">
			<span>商品名称：</span>
			<input name="queryProductName" id="proName" type="text" value="">
			 
			<span>供应商：</span>
			<select name="queryProviderId" id="proId">
				
				   <option value="0">--请选择--</option>
				   <c:forEach var="providerList" items="${providerList}">
				   		<option value="${providerList.id}">${providerList.proname}</option>
				   </c:forEach>
       		</select>
			 
			<span>是否付款：</span>
			<select name="queryIsPayment" id="isPayment">
				<option value="0">--请选择--</option>
				<option value="1">未付款</option>
				<option value="2">已付款</option>
       		</select>
			
			 <input value="查 询" type="button" onclick="ajaxLoad(0)">
			 <a href="${ctx}/bill/to_bill_add">添加订单</a>
		
       </div>
       <!--账单表格 样式和供应商公用-->
      <table class="providerTable" cellpadding="0" cellspacing="0">
          <tbody><tr class="firstTr">
              <th width="10%">订单编码</th>
              <th width="20%">商品名称</th>
              <th width="10%">供应商</th>
              <th width="10%">订单金额</th>
              <th width="10%">是否付款</th>
              <th width="10%">创建时间</th>
              <th width="30%">操作</th>
          </tr>
          </tbody>
          <tbody id="billList">
          	
          </tbody>
      </table>
      <div id="page">      </div>
  </div>
</section>

<%@ include file="../bottom.jsp" %>

<div style="position: absolute; z-index: 19700; top: -1970px; left: -1970px;">
<iframe style="width: 186px; height: 198px;" frameborder="0" border="0" scrolling="no"></iframe></div></body></html>