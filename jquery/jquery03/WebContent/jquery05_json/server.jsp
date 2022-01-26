<%@page import="java.io.PrintWriter"%>
<%@page import="org.json.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = "test";
	String pwd = "test1234";
	String email = "test@test.com";
	
	JSONObject json = new JSONObject();
	json.put("id",id);
	json.put("pwd",pwd);
	json.put("email",email);
	
	response.setContentType("text/plain;charset=utf-8");
	PrintWriter pw = response.getWriter();
	pw.print(json);
%>