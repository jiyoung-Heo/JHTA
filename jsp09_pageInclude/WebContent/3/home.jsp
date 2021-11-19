<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
</head>
<body>
<div>
	<div class="header">
	<!-- jsp코드자체가 삽입되는거라서 이코드 안의 변수나 이런것도 사용가능
	자체가 결합해서 서블릿?으로 만들어지기때문에 용량도 더 작다. -->
		<%@include file="header.jsp" %>
	</div>
	<div class="content">
		<%--
			<h1><%=name%></h1>==>오류발생. include지시어 선언해주고 해야함.
		 --%>
		<h1>우리우리교육센터방문을 환영합니다.</h1>
		<img src = "../images/1.png">
		<br>
		컨텍스트명: <%=context %><br>
		<a href="<%=context %>/1/main.jsp">main.jsp</a>
	</div>
	<div class="footer">
		<%@include file="footer.jsp" %>
	</div>
</div>
</body>
</html>