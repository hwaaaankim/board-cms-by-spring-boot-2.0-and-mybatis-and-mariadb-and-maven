<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%-- <%@ page import = "java.util.*" %>
<%@ page import = "com.hwan.boot01board.dto.Article" %>   
 
<% 
	List<Article> list = (List<Article>)request.getAttribute("list"); 
%> --%>
<c:set var="pageName" value="게시물 리스트"/>
<%@include file="../part/head.jspf" %>
	<%-- <h1>게시물 리스트.v1</h1>
	
		<% 
			for( int i=0; i<list.size(); i++){ 
		%>	
		<% 			
			Article article = list.get(i);
		%>	
		<section>
			번호 : <%=article.getId() %>,
			제목 : <%=article.getTitle()%>
		</section>
		<hr>
		<%
			}
		%>	 --%>
	<h2 class="con">전체 게시물 개수 : ${totalCount}</h2>
	
	<!-- el의 장점은 request.getAttribute("article")할 필요가 없음 -->
	<div class="con">
		<c:forEach items="${list}" var= "article">
			<section>
				<a href="./detail?id=${article.id}">번호 : ${article.id},
				제목 : ${article.title}</a>
			</section>
			<hr>
		</c:forEach>
	</div>
	<div class="btns con">
		<a href="./add">게시물 추가 </a>
	</div>
<%@include file="../part/foot.jspf" %>



















