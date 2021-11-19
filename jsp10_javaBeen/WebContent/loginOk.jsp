<%@page import="test.vo.UsersVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginOk.jsp</title>
</head>
<body>
<%--
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	UsersVo vo = new UsersVo();
	vo.setId(id);
	vo.setPwd(pwd);
--%>
<jsp:useBean id="vo" class="test.vo.UsersVo"/><!-- 12줄과 동일 -->
<jsp:setProperty property="id" name="vo"/><!-- 파라미터이름과 (property)변수이름이 같으면 자동으로 넘겨준다. -->
<jsp:setProperty property="pwd" name="vo"/>
<h1>파라미터로 전송된 데이터</h1>
아이디: <jsp:getProperty property="id" name="vo"/><br>
비밀번호: <jsp:getProperty property="pwd" name="vo"/><br>
</body>
</html>
