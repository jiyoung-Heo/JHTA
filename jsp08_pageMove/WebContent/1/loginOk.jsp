<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginOk.jsp</title>
</head>
<body>
<h1>loginOk.jsp</h1>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	request.setAttribute("id", id);
	request.setAttribute("pwd", pwd);
	//리다이렉트 방식으로 페이지 이동하기
	//response.sendRedirect("result.jsp");
	RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
    rd.forward(request,response);
%>
<!-- 포워드방식으로 이동하기 
<jsp:forward page="result.jsp"/> -->
</body>
</html>