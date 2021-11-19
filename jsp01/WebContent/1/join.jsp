<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join.jsp</title>
</head>
<body>
<h1>join.jsp페이지입니다</h1>
<div>회원가입완료~</div>
<%//스크립트릿-자바코드 작성
	request.setCharacterEncoding("utf-8");//post방식으로 전송되는 경우 한글이 깨지지않도록 인코딩 설정
	//date import 하면 제일 위에 <%@page .. 로 추가한다.
	Date d = new Date();
	out.print("가입날짜:"+d+"<br>");// out: 클라이언트 브라우져에 출력가능(html태그방식으로 ex)\n->x <br>->o )

	//사용자가 보내온 정보(name값의 정보)를 DB에 저장하기(회원가입)
	
	//사용자가 보내온 정보 읽어오기. 모두 string 타입으로 받아와진다.
	String num=request.getParameter("num");
	String name=request.getParameter("name");
	String phone=request.getParameter("phone");
	String addr=request.getParameter("addr");
	//사용자가 보내온 정보를 화면에 출력하기
	out.print("회원번호: "+num+"<br>");
	out.print("회원이름: "+name+"<br>");
	out.print("전화번호: "+phone+"<br>");
	out.print("주소: "+addr+"<br>");
%>
</body>
</html>