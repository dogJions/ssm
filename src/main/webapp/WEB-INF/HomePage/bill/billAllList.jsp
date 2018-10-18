<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<<c:forEach var="billAll" items="${info.list}">
				<tr>
					<td>
					<span>${billAll.billcode}</span>
					</td>
					<td>
					<span>${billAll.productname}</span>
					</td>
					<td>
					<span>${billAll.provider.proname}</span>
					</td>
					<td>
					<span>${billAll.totalprice}</span>
					</td>
					<td>
					<span>
						<c:if test="${billAll.ispayment==1}">未支付</c:if>
						<c:if test="${billAll.ispayment==2}">已支付</c:if>
					</span>
					</td>
					<td>
					<span>
					<fmt:formatDate value="${billAll.creationdate}" pattern='yyyy-MM-dd'/>  
					</span>
					</td>
					<td>
					<span><a class="viewProvider"   href="${ctx}/bill/to_bill_get?id=${billAll.id}"><img src="${ctx}/public/images/read.png" alt="查看" title="查看"></a></span>
					<span><a class="modifyProvider" href="${ctx}/bill/to_bill_update?id=${billAll.id}"><img src="${ctx}/public/images/xiugai.png" alt="修改" title="修改"></a></span>
					<span><a class="deleteProvider" href="javascript:ajaxLoad(${billAll.id});"><img src="${ctx}/public/images/schu.png" alt="删除" title="删除"></a></span>
					</td>
				</tr>
				
				<tr>
					<td>
						<input type="hidden" id="pageNum" value="${info.pageNum}">
						<input type="hidden" id="pages" value="${info.pages}">
					</td>
				</tr>
		</c:forEach>