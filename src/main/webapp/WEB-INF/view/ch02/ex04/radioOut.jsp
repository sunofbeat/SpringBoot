<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<c:if test='${agree == "yes"}'>
	약관에 동의합니다.
</c:if>
<c:if test='${agree == "no"}'>
	약관에 동의 안합니다.
</c:if>
<hr>
<% 
	String msg = "약관에 동의";
%>
<c:choose>
	<c:when test='${param.agree == "yes"}'>
		<%= msg %> 합니다.</c:when>
	<c:when test='${param.agree == "no"}'>
		<%= msg %> 안합니다.</c:when>
</c:choose>
<hr>
약관에 동의
<c:choose>
	<c:when test='${agree == "yes" }'>합니다</c:when>
	
	<c:otherwise>
	안합니다.
	</c:otherwise>
</c:choose>