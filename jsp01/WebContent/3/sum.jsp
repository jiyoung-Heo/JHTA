<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sum.jsp</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String a = request.getParameter("a");
	String b = request.getParameter("b");
	int sum = Integer.parseInt(a)+Integer.parseInt(b);
	out.print(a+"+"+b+"="+sum);
%>
<h1>두수합</h1>
<%-- <%=num1%> ===> <%out.print(num1);%> 두개는 동일한 코드임--%>
<%-- 표현식: 변수값 출력 이렇게 써주면 css주기 편함 --%>
<%=a %>+<%=b %>=<span style="color:red"><%=sum %></span>
</body>
</html>