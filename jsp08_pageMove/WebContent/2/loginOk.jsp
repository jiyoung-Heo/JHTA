<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginOk.jsp</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	if(id.equals("test") && pwd.equals("1234")){
		session.setAttribute("id", id);
		response.sendRedirect("main.jsp");
	}else{
		request.setAttribute("errMsg","아이디 또는 비밀번호가 맞지 않습니다.");
		request.setAttribute("id",id);
		request.setAttribute("pwd",pwd);
		//request에 담긴 값이 유지되어야 하므로 포워드방식으로 페이지 이동하기
		pageContext.forward("login.jsp");
	}
%>
</body>
</html>