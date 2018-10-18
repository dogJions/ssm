<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<c:forEach var="providerAll" items="${info.list}">
				<tr>
					<td>
					<span>${providerAll.procode}</span>
					</td>
					<td>
					<span>${providerAll.proname}</span>
					</td>
					<td>
					<span>${providerAll.procontact}</span>
					</td>
					<td>
					<span>${providerAll.prophone}</span>
					</td>
					<td>
					<span>${providerAll.profax}</span>
					</td>
					<td>
					<span>
					<fmt:formatDate value="${providerAll.creationdate}" pattern='yyyy-MM-dd'/>  
					</span>
					</td>
					<td>
					<span><a class="viewProvider"   href="${ctx}/provider/to_provider_get?id=${providerAll.id}"><img src="${ctx}/public/images/read.png" alt="查看" title="查看"></a></span>
					<span><a class="modifyProvider" href="${ctx}/provider/to_provider_update?id=${providerAll.id}"><img src="${ctx}/public/images/xiugai.png" alt="修改" title="修改"></a></span>
					<span><a class="deleteProvider" href="javascript:ajaxLoad(${providerAll.id});"><img src="${ctx}/public/images/schu.png" alt="删除" title="删除"></a></span>
					</td>
				</tr>
				
				<tr>
					<td>
						<input type="hidden" id="pageNum" value="${info.pageNum}">
						<input type="hidden" id="pages" value="${info.pages}">
					</td>
				</tr>
	</c:forEach>