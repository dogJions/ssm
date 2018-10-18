<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

     <div class="left">
         <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
         <nav>
             <ul class="list">
              <li><a href="${ctx}/bill/to_bill_all">订单管理</a></li>
              <li><a href="${ctx}/provider/to_provider_All">供应商管理</a></li>
              <li><a href="${ctx}/user/to_user_all">用户管理</a></li>
              <li><a href="${ctx}/user/to_revise_psw">密码修改</a></li>
              <li><a href="${ctx}/logout.jsp">退出系统</a></li>
             </ul>
         </nav>
     </div>
     <input type="hidden" id="path" name="path" value="/SMBMS">
     <input type="hidden" id="referer" name="referer" value="http://localhost:8080/SMBMS/login.jsp">