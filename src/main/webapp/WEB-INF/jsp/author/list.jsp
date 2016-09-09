<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
  <%@include file="../common/head.jsp"%>
  <link href="${ctx}/resources/css/main.css" rel="styleSheet" type="text/css" />
  <title>Author List</title>
</head>

<body>
<div class="navbar navbar-default navbar-fixed-top" role="navigation" id="menu-nav">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${ctx}">图书馆</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="${ctx}">首页</a></li>
                <li class="active"><a href="${ctx}/author/list">作者</a></li>
                <li><a href="${ctx}/book/list">图书</a></li>
                <li><a href="#" data-toggle="modal" data-target="#about-modal">关于</a></li>
            </ul>

		<%@include file="../common/navbar.jsp"%>
        </div>
       
    </div>
</div>

	<div class="container">
	<form class="navbar-form" id="navbar-form" method="post">
		<div class="booklist">
			<c:forEach var="author" items="${list}">
				<div class="bookinfo">
					<div class="pic">
						<a href="${author.id}/detail"> 
						<c:choose>
						<c:when test="!empty ${ctx}/resources/images/author/${author.id}.jpg">
							<img src="${ctx}/resources/images/author/${author.id}.jpg">
						</c:when>
						<c:otherwise>
							<img src="${ctx}/resources/images/author/default.jpg">
						</c:otherwise>					
						</c:choose>
						</a>
					</div>
					<div class="description">
						<h4>
							<a href="${author.id}/detail">${author.name} </a>
						</h4>
						<p class="des"><span class="glyphicon glyphicon-book" aria-hidden="true"></span>&nbsp;${author.description}</p>
						<div>
							<a class="btn btn-primary btn-xs" href="${author.id}/detail"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>&nbsp;详情</a>
						</div>
					</div>
				</div>
			</c:forEach>
			

		<%@include file="../common/pagination.jsp"%>
		<input type="hidden" name="currentPage" id="currentPage" value="${page.currentPage}"/>
		</div>
	</form>

		
		<div class="righttag">

				<img class="lazy" src="${ctx}/resources/images/book/1.jpg">

				<h3>嫌疑犯X的献身</h3>

				<p>在大學時代曾被譽為百年難得一見的數學天才石神，如今只是一名單身、不起眼的高中數學教師。</p>

				<p>
					<a class="btn btn-primary" href="#" role="button">详情</a> <a
						class="btn btn-default" href="#" role="button">下载</a>
				</p>
		</div>
</body>
<%@include file="../common/footer.jsp"%>

</html>