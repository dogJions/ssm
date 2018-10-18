<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//if(session.getAttribute("user")==null){
    	//	System.out.println("异常进入");
		//	response.sendRedirect(request.getParameter("ctx").toString()+"/login.jsp");
		//	return;
    	//}
    %>
    
	<header class="publicHeader">
        <h1>超市订单管理系统</h1>
        <div class="publicHeaderR">
            <p><span>下午好！</span><span style="color: #fff21b"> ${user.username}</span> , 欢迎你！</p>
            <a href="${ctx}/logout.jsp">退出</a>
        </div>
    </header>
    <!--时间-->
    <section class="publicTime">
        <span id="time"></span>
        <a href="http://localhost:8080/SMBMS/jsp/frame.jsp#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
    </section>