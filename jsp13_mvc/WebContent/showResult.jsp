<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showResult.jsp</title>
</head>
<body>
<%--오늘의 운세를 출력해보세요 --%>
<%--
<%
	String result = (String)request.getAttribute("result");
%>
--%>
<%-- 
<h1>오늘의 운세: <%=result %></h1>
 --%>
<h1>오늘의 운세</h1>
${requestScope.result }
</body>
</html>