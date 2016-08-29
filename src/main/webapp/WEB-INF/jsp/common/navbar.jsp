<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="navbar navbar-default navbar-fixed-top" role="navigation" id="menu-nav">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${ctx}">图书馆</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="${ctx}">首页</a></li>
                <li><a href="${ctx}/author/list">作者</a></li>
                <li><a href="${ctx}/book/list">图书</a></li>
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
