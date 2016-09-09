<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
  <%@include file="common/head.jsp"%>
  <link href="${ctx}/resources/css/main.css" rel="styleSheet" type="text/css" />
  <title>Book Library</title>
</head>

<body>
<div class="navbar navbar-default navbar-fixed-top" role="navigation" id="menu-nav">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${ctx}">图书馆</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="${ctx}">首页</a></li>
                <li><a href="${ctx}/author/list">作者</a></li>
                <li><a href="${ctx}/book/list">图书</a></li>
                <li><a href="#" data-toggle="modal" data-target="#about-modal">关于</a></li>
            </ul>

<%@include file="common/navbar.jsp"%>
        </div>
       
    </div>
</div>


<!-- 广告轮播 -->
<div id="ad-carousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#ad-carousel" data-slide-to="0" class="active"></li>
        <li data-target="#ad-carousel" data-slide-to="1"></li>
    </ol>
    <div class="carousel-inner">
        <div class="item active">
            <img src="${ctx}/resources/images/home/chrome-big.jpg" alt="1 slide">

            <div class="container">
                <div class="carousel-caption">
                    <h1>Chrome</h1>

                    <p>Google Chrome，又称Google浏览器，是一个由Google（谷歌）公司开发的网页浏览器。</p>

                    <p><a class="btn btn-lg btn-primary" href="http://www.google.cn/intl/zh-CN/chrome/browser/"
                          role="button" target="_blank">点我下载</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img src="${ctx}/resources/images/home/firefox-big.jpg" alt="2 slide">

            <div class="container">
                <div class="carousel-caption">
                    <h1>Firefox</h1>

                    <p>Mozilla Firefox，中文名通常称为“火狐”或“火狐浏览器”，是一个开源网页浏览器。</p>

                    <p><a class="btn btn-lg btn-primary" href="http://www.firefox.com.cn/download/" target="_blank"
                          role="button">点我下载</a></p>
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#ad-carousel" data-slide="prev"><span
            class="glyphicon glyphicon-chevron-left"></span></a>
    <a class="right carousel-control" href="#ad-carousel" data-slide="next"><span
            class="glyphicon glyphicon-chevron-right"></span></a>
</div>

<div class="container summary">

    <!-- 简介 -->
    <div class="row" id="summary-container">
        <div class="col-md-3">

            <img class="lazy" src="${ctx}/resources/images/book/1.jpg">

            <h3>嫌疑犯X的献身</h3>

            <p>在大學時代曾被譽為百年難得一見的數學天才石神，如今只是一名單身、不起眼的高中數學教師。</p>

			<p><a class="btn btn-primary" href="#" role="button">详情</a>
            <a class="btn btn-default" href="#" role="button">下载</a></p>

        </div>
        <div class="col-md-3">

            <img class="img" src="${ctx}/resources/images/book/1.jpg">

            <h3>嫌疑犯X的献身</h3>

            <p>在大學時代曾被譽為百年難得一見的數學天才石神，如今只是一名單身、不起眼的高中數學教師。</p>

			<p><a class="btn btn-primary" href="#" role="button">详情</a>
            <a class="btn btn-default" href="#" role="button">下载</a></p>
        </div>

        <div class="col-md-3">

            <img class="img" src="${ctx}/resources/images/book/1.jpg">

            <h3>嫌疑犯X的献身</h3>

            <p>在大學時代曾被譽為百年難得一見的數學天才石神，如今只是一名單身、不起眼的高中數學教師。</p>

	

			<p><a class="btn btn-primary" href="#" role="button">详情</a>
            <a class="btn btn-default" href="#" role="button">下载</a></p>

        </div>

        <div class="col-md-3">

            <img class="img" src="${ctx}/resources/images/book/1.jpg">

            <h3>嫌疑犯X的献身</h3>

            <p>在大學時代曾被譽為百年難得一見的數學天才石神，如今只是一名單身、不起眼的高中數學教師。</p>

			<p><a class="btn btn-primary" href="#" role="button">详情</a>
            <a class="btn btn-default" href="#" role="button">下载</a></p>

        </div>
    </div>

    <!-- 特性 -->
    <hr class="feature-divider">
</div>



</body>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${ctx}/resources/js/common/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${ctx}/resources/js/common/bootstrap.min.js"></script>
  
</html>