<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>movie.jsp</title>
<style type="text/css">
.commBox{width: 400px; height: 100px;border:1px solid #aaa; margin-top:5px;}
</style>
<script type="text/javascript" src = "${pageContext.request.contextPath }/js/jquery-3.6.0.min.js"></script>
</head>

<body>
	<div style="width: 400px; height: 150px; background-color: #bbb">
		<h1>${vo.title }</h1>
		<ul>
			<li>내용:${vo.content}</li>
			<li>감독:${vo.director}</li>
		</ul>
	</div>
	<div>
		<div id="commList"></div>
		<div id="commForm">
			<form action="${pageContext.request.contextPath }/comments.do" method="post">
				<input type="hidden" name= "mnum" value="${vo.mnum }">
				아이디<br> <input type="text" name="id"><br> 
				영화평<br>
				<textarea rows="2" cols="30" name="comments"></textarea>
				<br>
				<input type="submit" value="등록">
			</form>

		</div>
	</div>
</body>
<script type="text/javascript">
	$(function(){
		let mnum = $("input[name='mnum']").val();
		let id = $("input[name='id']").val();
		let comments = $("input[name='comments']").val();
		$("form").submit(function(e){
			e.preventDefault();
			let params=$(this).serialize();
			$.getJSON(
					"${pageContext.request.contextPath }/comments.do"
					,params
					, function() {
					console.log("success")
			})
			list();
		})
		list();
	})
	function list(){
		$("#commList").empty();
		let mnum = $("input[name='mnum']").val();
		$.getJSON("${pageContext.request.contextPath }/list.do", {"mnum":mnum}, function(data) {
			$(data).each(function(i, list) {
				let num = list.num;
				let show = "<div class='commBox'>번호: "+list.num+"<br>아이디: "+list.id+"<br>코멘트: "+list.comments+"<a href='delete.do?num='"+num+"' onclick='delComm(event,"+num+")'>삭제</a></div>";
				$("#commList").append(show);
			});
		});
	}
	function delComm(event,num){
		event.preventDefault();
		$.getJSON('${pageContext.request.contextPath }/delete.do',{"num":num},function(data){
			alert("삭제완료");
			list();
		});
	}
</script>
</html>