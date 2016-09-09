<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<form class="navbar-form navbar-right" action="${ctx}/book/list" method="post">
	<div class="form-group">
		<input type="text" name="searchinfo" placeholder="书名、作者" class="form-control" value=${searchinfo}>
	</div>
	<button type="submit" class="btn btn-default">查询</button>
</form>

