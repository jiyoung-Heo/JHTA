<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application2.jsp</title>
</head>
<body>
<%
	//web.xml에 설정된 DBServer값을 읽어와 화면에 출력해보세요
	//ServletContext sc = getServletContext();
	//String a = (String)sc.getInitParameter("DBServer");
	String a = application.getInitParameter("DBServer");
%>
<h1><%=a %></h1>
</body>
</html>