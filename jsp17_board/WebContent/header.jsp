<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- header.jsp -->
<div>
	<ul>
		<li><a href="${applicationScope.cp }/home">홈</a></li> <!-- homecontroller에서 servletcontext로 application사용했기 때문에 이렇게 불러옴. applicationscope는 생략가능 -->
		<li><a href="${cp }/board/insert">글작성</a></li>
		<!-- 한 페이지에 글이 10개씩 보여지도록 컨트롤러와 jsp만들어보세요,페이징처리 -->
		<li><a href="${cp }/board/list">글목록</a></li>
	</ul>
</div>