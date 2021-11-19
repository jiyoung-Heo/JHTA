<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application1.jsp</title>
</head>
<body>
<%
	String contextPath=application.getContextPath();//컨텍스트명 얻어오기
	String path1=application.getRealPath("/3_application/login.jsp");
%>
컨텍스트명: <%=contextPath %><br>
path1: <%=path1 %><br>
<%
	//어플리케이션 스코프에 담긴 속성명들 얻어오기
	Enumeration<String> en= application.getAttributeNames();
	// 어트리뷰트 이름만 꺼내오는 메소드
	while(en.hasMoreElements()){
		String attrName = en.nextElement();
		Object value= application.getAttribute(attrName);
		out.print(attrName+"===========>"+value+"<br>");
	}
%>
</body>
</html>