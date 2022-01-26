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
	//자바스크립트가동작하지않는환경이라면 submit의 최소한의 기능은 실행이 되게 하는게 좋은 방법이다.(웹접근성)
	//ajax많이쓰는거 좋지않음! 적절한 위치에서만 사용하기
	$(function(){
		$("form").submit(function(e){
			e.preventDefault();//submit 중지하기
			//ajax로 데이터 전송하기
			let params=$(this).serialize();
			$.ajax({
				url:"${pageContext.request.contextPath }/comments.do",
				method:"post",
				data:params,
				dataType:"xml",
				success:function(data){
					alert("success")
					list();
				}
			})
		})
		list();
	})
	//페이지가 실행되면 댓글목록을 얻어와 div#commList에 보여보세요
	function list(){
		$("#commList").empty();
		$.ajax({
			url:"${pageContext.request.contextPath }/list.do",
			method:"post",
			data:{"mnum":$("input[name='mnum']").val()},
			dataType:"xml",
			success:function(data){
				$(data).find("comm").each(function() {
					const num = $(this).find("num").text()
					const mnum= $(this).find("mnum").text()
					const id = $(this).find("id").text()
					const comments = $(this).find("comments").text()
					$("#commList").append("<div class='commBox'>아이디: "+id+"<br>코멘트: "+comments+"<a href='delete.do?num='"+num+"' onclick='delComm(event,"+num+")'>삭제</a></div>");
				}) 
			}
		})
	}
	function delComm(event,num){
		event.preventDefault();
		$.get('${pageContext.request.contextPath }/delete.do',{"num":num},function(data){
			alert("삭제완료");
			list();
		},"xml");
	}
</script>
</html>