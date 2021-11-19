<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
<h1>판매물품목록</h1>
<ul>
	<li><a href="1.jsp">냉장고</a></li>
	<li><a href="2.jsp">tv</a></li>
	<li><a href="3.jsp">컴퓨터</a></li>
</ul>
<div>
	<h2>최근본상품</h2>
<%
	//최근 본 상품명에 해당하는 쿠키를 출력해보세요
	Cookie[] cooks = request.getCookies();
	if(cooks!=null){
		for(Cookie c : cooks){
			String sellName = c.getValue();
			String sellId = c.getName();
			if(sellId.contains("item")){
				out.print(sellName);
				out.print("<a href='delete.jsp?id="+sellId+"'>삭제</a><br>");
			}
		}
	}else{
%>
		<h1> 상품이 없습니다.</h1>
<%
	}
%>
</div>
</body>
</html>