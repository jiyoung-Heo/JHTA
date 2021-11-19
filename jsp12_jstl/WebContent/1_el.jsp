<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1_el.jsp</title>
</head>
<body>
<%--
	EL (Expression Language) - 수식언어
	1) 형식
		${표현식}
	2) EL연산자
		+,-.*,/,%,empty,not,mod,<,<=,>,>=,=,lt,gt,ge,eq,ne,&&,||,or,....
	3) EL내장객체
		- requestScope,sessionScope,applicationScope,param,pageContext,paramValues
		  header,headerValues,cookie,initParam,...
--%>
안 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;녕<br>
10+20=<%=10+20 %><br>
10+20=${10+20}<br>
10<20=${10<20}<br>
10&lt;20=${10 lt 20}<br>
10>20=${10 gt 20}<br>
<%
	session.setAttribute("id", "hello");
	session.setAttribute("name", "홍길동");
%>
<!-- session에 저장된 아이디와 request에 저장된 name값을 꺼내와 출력해보세요 -->
<%
	String pid = (String)session.getAttribute("id");
	String pname = (String)session.getAttribute("name");
%>
id:<%=pid %>
name:<%=pname %>
<h1>EL내장객체사용해보기</h1>
아이디: ${sessionScope.id }<br>
이름: ${sessionScope.name }<br>
<%
	String a = request.getParameter("a");
	String b = request.getParameter("b");
	//http://localhost:8081/jsp12_jstl/1_el.jsp?a=1&b=2
%>
<h1>EL내장객체사용해보기2</h1>
a: ${param.a }<br>
b: ${param.b }<br>
</body>
</html>