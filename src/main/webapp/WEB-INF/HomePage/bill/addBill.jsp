<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    		$(".billForm").Validform();
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
         	<span>订单管理页面 &gt;&gt; 订单添加页面</span>
        </div>
        <div class="providerAdd">
           <form id="billForm" name="billForm" class="billForm" method="post" action="${ctx}/bill/bill_add">
             <!--div的class 为error是验证错误，ok是验证成功-->
             <input type="hidden" name="method" value="add">
             <div class="">
                 <label for="billCode">订单编码：</label>
                 <input type="text" name="billcode" class="text" id="billCode" value="" datatype="*6-15" nullmsg="请填入数据"> 
				 <!-- 放置提示信息 -->
				 
             </div>
             <div>
                 <label for="productName">商品名称：</label>
                 <input type="text" name="productname" id="productName" value="" datatype="s1-10" nullmsg="请填入数据"> 
				 <font color="red">*</font>
             </div>
             <div>
                 <label for="productUnit">商品单位：</label>
                 <input type="text" name="productunit" id="productUnit" value="" datatype="*1-2" nullmsg="请填入数据"> 
				 <font color="red">*</font>
             </div>
             <div>
                 <label for="productCount">商品数量：</label>
                 <input type="text" name="productcount" id="productCount" value="" datatype="n" nullmsg="请填入数据"> 
				 <font color="red">*</font>
             </div>
             <div>
                 <label for="totalPrice">总金额：</label>
                 <input type="text" name="totalprice" id="totalPrice" value="" datatype="n" nullmsg="请填入数据"> 
				 <font color="red">*</font>
             </div>
             <div>
                 <label>供应商：</label>
                 <select name="providerId" id="providerId">
                  <c:forEach var="providerList" items="${providerList}">
				   		<option value="${providerList.id}">${providerList.proname}</option>
				   </c:forEach>
                 
                 </select>
				 <font color="red">*</font>
             </div>
             <div>
                 <label>是否付款：</label>
                 <input type="radio" name="ispayment" value="1" checked="checked">未付款
				 <input type="radio" name="ispayment" value="2">已付款
             </div>
             <div class="providerAddBtn">
                   <input type="submit"  value="保存">
                    <a href="${ctx}/bill/to_bill_all">
					<input type="button"  value="返回">
					</a>
             </div>
         </form>
           
            
        </div>
</div>
</section>


<%@ include file="../bottom.jsp" %>

<div style="position: absolute; z-index: 19700; top: -1970px; left: -1970px;"><iframe style="width: 186px; height: 198px;"  frameborder="0" border="0" scrolling="no"></iframe></div></body></html>