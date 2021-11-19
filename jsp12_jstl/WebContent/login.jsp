<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<!-- 자동로그인 기능 구현하기
자동로그인에 체크를 하고 로그인을 하면 다음번 접속 시 자동으로 로그인이 됨 -->
<body>
<%
	Cookie[] cook = request.getCookies();
	String id ="";
	String pwd ="";
	for(Cookie c : cook){
		if(c.getName().equals("id")){
			id =c.getValue();
		}else if(c.getName().equals("pwd")){
			pwd =c.getValue();
		}
	}
	
	if(!id.equals("")&&!pwd.equals("")){
		response.sendRedirect("loginOk.jsp");
	}
%>
<form action="loginOk.jsp" method="post">
	아이디<input type="text" name = "id"><br>
	비밀번호<input type="password" name = "pwd"><br>
	<input type="checkbox" name = "checkbox">자동 로그인<br>
	<input type="submit" value="로그인">
</form>
</body>
</html>