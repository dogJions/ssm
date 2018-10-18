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
            <span>供应商管理页面 &gt;&gt; 供应商添加页面</span>

        </div>
        <div class="providerAdd">
            <form id="providerForm" name="providerForm" method="post" action="${ctx}/provider/provider_add">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="proCode">供应商编码：</label>
                    <input type="text" name="procode" id="proCode" value="${providerAll.procode}" readonly="readonly"> 
					<!-- 放置提示信息 -->
					<font color="red" style="color: rgb(102, 102, 102);">* 请输入供应商编码</font>
                </div>
                <div>
                    <label for="proName">供应商名称：</label>
                   <input type="text" name="proname" id="proName" value="${providerAll.proname}" readonly="readonly"> 
					<font color="red">*</font>
                </div>
                <div>
                    <label for="proContact">联系人：</label>
                    <input type="text" name="procontact" id="proContact" value="${providerAll.procontact}" readonly="readonly"> 
					<font color="red">*</font>

                </div>
                <div>
                    <label for="proPhone">联系电话：</label>
                    <input type="text" name="prophone" id="proPhone" value="${providerAll.prophone}" readonly="readonly"> 
					<font color="red">*</font>
                </div>
                <div>
                    <label for="proAddress">联系地址：</label>
                    <input type="text" name="proaddress" id="proAddress" value="${providerAll.proaddress}" readonly="readonly"> 
                </div>
                <div>
                    <label for="proFax">传真：</label>
                    <input type="text" name="profax" id="proFax" value="${providerAll.profax}" readonly="readonly"> 
                </div>
                <div>
                    <label for="proDesc">描述：</label>
                    <input type="text" name="prodesc" id="proDesc" value="${providerAll.prodesc}" readonly="readonly"> 
                </div>
                <div>
                    <label for="proDesc">创建日期：</label>
                    <input type="text"    value="<fmt:formatDate value='${providerAll.creationdate}' pattern='yyyy-MM-dd'/>" readonly="readonly"> 
                   
                </div>
                 <div>
                    <label for="proDesc">创建人：</label>
                    <input type="text"   value="${providerCty}" readonly="readonly"> 
                </div>
               
                
                <div class="providerAddBtn">
                    
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