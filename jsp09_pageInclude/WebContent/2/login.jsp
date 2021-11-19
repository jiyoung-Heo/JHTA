<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="content">
<%
	String errMsg = (String)request.getAttribute("errMsg");
	if(errMsg==null){
		errMsg="";
	}
%>
<form action="loginOk.jsp" method="post">
아이디<input type="text" name = "id">
비밀번호<input type="password" name = "pwd">
<div><%=errMsg %></div>
<input type="submit" value="로그인">
</form>
</div>