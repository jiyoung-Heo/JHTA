<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<%
	String errMsg = (String)request.getAttribute("errMsg");
	String id = (String)request.getAttribute("id");
	//String id = request.getParameter("id");
	String pwd = (String)request.getAttribute("pwd");
	//String pwd = request.getParameter("pwd");
	if (errMsg==null){
		errMsg="";
	}
	if(id==null){
		id="";
	}
	if(pwd==null){
		pwd="";
	}
%>
</head>
<body>
<h1>회원로그인</h1>
<form action="loginOk.jsp">
	아이디<input type="text" name = "id" value="<%=id %>"><br>
	비밀번호<input type="password" name = "pwd" value="<%=pwd %>"><br>
	<div style="color:red;font-size:12px"><%=errMsg %></div>
	<input type="submit" value="로그인"> 
</form>
</body>
</html>