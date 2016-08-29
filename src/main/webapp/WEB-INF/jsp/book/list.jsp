<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
  <%@include file="../common/head.jsp"%>
  <link href="${ctx}/resources/css/main.css" rel="styleSheet" type="text/css" />
  <title>Book List</title>
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
                <li><a href="${ctx}/author/list">作者</a></li>
                <li class="active"><a href="${ctx}/book/list">图书</a></li>
                <li><a href="#" data-toggle="modal" data-target="#about-modal">关于</a></li>
            </ul>

        <form class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" placeholder="书名、作者" class="form-control">
            </div>
            <button type="submit" class="btn btn-default">查询</button>
          </form>
        </div>
       
    </div>
</div>

	<div class="container">
		<div class="booklist">
			<c:forEach var="book" items="${list}">
				<div class="bookinfo">
					<div class="pic">
						<a href="${book.id}/detail"> 
							<img src="${ctx}/resources/images/book/${book.id}.jpg">
						</a>
					</div>
					<div class="description">
						<h4>
							<a href="${book.id}/detail">${book.name} </a>
						</h4>
						<h5><span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>&nbsp;${book.author.name}</h5>
						<p class="des"><span class="glyphicon glyphicon-book" aria-hidden="true"></span>&nbsp;${book.description}</p>
						<div>
							<a class="btn btn-primary btn-xs" href="${book.id}/detail"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>&nbsp;详情</a>
							<a class="btn btn-primary btn-xs" href="${book.id}/download"><span class="glyphicon glyphicon-download-alt" aria-hidden="true"></span>&nbsp;下载</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
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
</html>