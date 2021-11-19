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
	String ischecked = request.getParameter("ischecked");
	Cookie cookId = new Cookie("id",id);
	Cookie cookPwd = new Cookie("pwd",pwd);
	if(ischecked==null){
		cookId.setMaxAge(0);
		cookPwd.setMaxAge(0);
	}else{
		cookId.setMaxAge(60*60);
		cookPwd.setMaxAge(60*60);
	}
	response.addCookie(cookId);
	response.addCookie(cookPwd);
%>
	id: <%=id %>
	pwd: <%=pwd %>
</body>
</html>