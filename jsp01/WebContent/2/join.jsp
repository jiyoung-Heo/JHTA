<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join.jsp</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String num = request.getParameter("num");
	out.print("전송된 번호: "+num+"<br>");
	//같은이름으로 전송된 파라미터들을 배열로 얻어옴
	String[] hobby = request.getParameterValues("hobby");
	out.print("전송된 취미: ");
	if(hobby!=null){
		for(String h: hobby){
			out.print(h+" ");
		}
	}else{
		out.print("없음...");
	}
	String job = request.getParameter("job");
	out.print("<br>직업: "+job);
%>
</body>
</html>