<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <c:forEach var="userAll" items="${info.list}">
    	<tr>
						<td>
						<span>${userAll.usercode}</span>
						</td>
						<td>
						<span>${userAll.username}</span>
						</td>
						<td>
							<span>
								<c:if test="${userAll.gender==1}">女</c:if>
								<c:if test="${userAll.gender==2}">男</c:if>
							</span>
						</td>
						<td>
						<span>${userAll.age}</span>
						</td>
						<td>
						<span>${userAll.phone}</span>
						</td>
						<td>
							<span>${userAll.role.rolename}</span>
						</td>
						<td>
						
						<span><a class="viewUser" href="${ctx}/user/to_get_user?id=${userAll.id}" ><img src="${ctx}/public/images/read.png" alt="查看" title="查看"></a></span>
						<span><a class="modifyUser" href="${ctx}/user/to_update_user?id=${userAll.id}" ><img src="${ctx}/public/images/xiugai.png" alt="修改" title="修改"></a></span>
						<span><a class="deleteUser" href="javascript:ajaxLoad(${userAll.id});" userid="11" username="孙兴"><img src="${ctx}/public/images/schu.png" alt="删除" title="删除"></a></span>
						</td>
					</tr>
					
					<tr>
						<td>
							<input type="hidden" id="pageNum" value="${info.pageNum}">
							<input type="hidden" id="pages" value="${info.pages}">
						</td>
					</tr>
    </c:forEach>
