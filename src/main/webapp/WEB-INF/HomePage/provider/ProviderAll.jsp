<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head lang="en"><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>超市订单管理系统</title>
   <link type="text/css" rel="stylesheet" href="${ctx}/public/css/style.css">
    <link type="text/css" rel="stylesheet" href="${ctx}/public/css/public.css">
    
    <script type="text/javascript" src="${ctx}/public/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${ctx}/public/js/ProviderAllAjax.js"></script>
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
            <span>供应商管理页面</span>
        </div>
        <div class="search">
				<span>供应商编码：</span>
				<input name="queryProCode" id="ProCode" type="text" value="">
				
				<span>供应商名称：</span>
				<input name="queryProName" id="ProName" type="text" value="">
				
				<input value="查 询" type="button" onclick="ajaxLoad(0)">
				<a href="${ctx}/provider/to_provider_add">添加供应商</a>
        </div>
        <!--供应商操作表格-->
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tbody><tr class="firstTr">
                <th width="10%">供应商编码</th>
                <th width="20%">供应商名称</th>
                <th width="10%">联系人</th>
                <th width="10%">联系电话</th>
                <th width="10%">传真</th>
                <th width="10%">创建时间</th>
                <th width="30%">操作</th>
            </tr>
            </tbody>
            <tbody id="providerList">
			
        	</tbody>
        </table>
        	
        	<div id="page">
			</div>	

    </div>
</section>
<%@ include file="../bottom.jsp" %>

<div style="position: absolute; z-index: 19700; top: -1970px; left: -1970px;"><iframe style="width: 186px; height: 198px;"  frameborder="0" border="0" scrolling="no"></iframe></div></body></html>