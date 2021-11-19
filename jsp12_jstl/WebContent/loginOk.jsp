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
	Cookie[] cook = request.getCookies();
	String id ="";
	String pwd ="";
	String checkbox=""; 
	for(Cookie c : cook){
		if(c.getName().equals("id")){
			id =c.getValue();
		}else if(c.getName().equals("pwd")){
			pwd =c.getValue();
		}
	}
	
	if(id.equals("")&&pwd.equals("")){
		id=request.getParameter("id"); 
		pwd=request.getParameter("pwd"); 
		checkbox =request.getParameter("checkbox");
		Cookie cookId = new Cookie("id",id);
		Cookie cookPwd = new Cookie("pwd",pwd);
		
		if(checkbox==null){
			cookId.setMaxAge(0);
			cookPwd.setMaxAge(0);
		}else{
			cookId.setMaxAge(60*60);
			cookPwd.setMaxAge(60*60);
		}
		response.addCookie(cookId);
		response.addCookie(cookPwd);
	}
%>
<h1>로그인완료</h1>
<a href="delete.jsp?id=<%=id%>&pwd=<%=pwd%>">로그아웃</a>
</body>
</html>