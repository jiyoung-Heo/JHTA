<%@page import="java.io.PrintWriter"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="test.vo.MyUsersVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	//userlist.jsp
	ArrayList<MyUsersVo> list=new ArrayList<>();
	list.add(new MyUsersVo("aa","1234","aa@test.com"));
	list.add(new MyUsersVo("bb","5678","bb@test.com"));
	list.add(new MyUsersVo("cc","0000","cc@test.com"));
	//json을 배열로 담기위한 객체 생성
	JSONArray jsonArr=new JSONArray();
	for(MyUsersVo vo:list){
		//VO객체정보를 JSON객체에 저장해서 JSON배열에 추가
		JSONObject json=new JSONObject();
		json.put("id",vo.getId());
		json.put("pwd",vo.getPwd());
		json.put("email",vo.getEmail());
		jsonArr.put(json);
	}
	response.setContentType("text/plain;charset=utf-8");
	PrintWriter pw=response.getWriter();
	pw.print(jsonArr);
%>