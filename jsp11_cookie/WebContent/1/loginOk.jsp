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
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	Cookie cook1 = new Cookie("id",id);
	//경로 안쓰면 해당 디렉토리(폴더)안에서만 사용 가능하다.
	// 경로에 /만 쓰면 전체경로에서 사용한다는 의미이다.(모든루트)
	cook1.setPath("/"); 
	cook1.setMaxAge(60*2);//쿠키유지시간 2분
	response.addCookie(cook1);
	
	Cookie cook2 = new Cookie("pwd",pwd);
	cook2.setMaxAge(60*2);
	response.addCookie(cook2);
%>
<h1>쿠키에 사용자정보 저장완료</h1>
<a href="main.jsp">메인으로이동</a>
</body>
</html>