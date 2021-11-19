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
	//세션시간설정하기(초단위로 설정)
	session.setMaxInactiveInterval(2*60);//세션유지시간 2분 설정

	//세션에 값 저장하기
	session.setAttribute("id",id);
	session.setAttribute("pwd", pwd);
	//세션에 저장된값 꺼내오기
	//리턴타입 Object이기 때문에 형변환 해줘야한다.
	String sid = (String)session.getAttribute("id");
	String spwd = (String)session.getAttribute("pwd");
%>
세션에 저장된 id: <%=sid %><br>
세션에 저장된 pwd: <%=spwd %><br>
<a href="next.jsp">다음페이지로 이동</a>
</body>
</html>