<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<%
	Cookie[] cook = request.getCookies();
	String cookieID ="";
	String cookiePWD="";
	boolean checked = false;
	for(Cookie c : cook){
		if(c.getName().equals("id")){
			cookieID= c.getValue();
			checked=true;
		}
		if(c.getName().equals("pwd")){
			cookiePWD= c.getValue();
		}
	}
%>
<form method = "post" action="loginOk.jsp">
	아이디<input type="text" name = "id" value="<%=cookieID %>"><br>
	비밀번호<input type="password" name = "pwd" value="<%=cookiePWD %>"><br>
<%
	if (checked==true){
%>
	<input type="checkbox" name = "ischecked" checked="checked">자동채우기<br>
<%		
	}else{
%>
	<input type="checkbox" name = "ischecked">자동채우기<br>
<%
	}
%>
	<input type="submit" value="로그인">
</form>
</body>
</html>