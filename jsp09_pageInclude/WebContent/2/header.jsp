<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 다른 html안에 넣을거기때문에 다른것들은 다 지워준다. -->
<!-- header.jsp -->
<div>
	<ul>
		<li><a href="layout.jsp?spage=home.jsp">홈</a>
		<!-- 로그인 기능을 추가해 보세요 -->
<%
			String id = (String)session.getAttribute("id");
			if(id==null){
%>
				<li><a href="layout.jsp?spage=login.jsp">로그인</a>
<%
			}else{
%>
				<li> [<%=id %>]님 반갑습니다 <a href="logout.jsp">로그아웃</a>
<%
			}
%>
		<li><a href="layout.jsp?spage=main.jsp">교육센터소개</a>
		<li><a href="layout.jsp?spage=edu.jsp">교육과정소개</a>
	</ul>
</div>