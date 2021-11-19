<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getCookie.jsp</title>
</head>
<body>
<%

	//쿠키 꺼내오기
	Cookie[] cooks = request.getCookies();
	if(cooks!=null){
		for (Cookie c : cooks){
			String cookieName = c.getName();
			String cookieValue = c.getValue();
			out.print(cookieName+":"+cookieValue+"<br>");
		}
	}else{
		out.print("<h1>쿠키가 없습니다...</h1>");
	}
%>
</body>
</html>