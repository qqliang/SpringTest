<%--
  Created by IntelliJ IDEA.
  User: Qing_L
  Date: 2017/5/3
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.library.common.sign.UserSession" %>
<%
    UserSession session1 = (UserSession)request.getSession().getAttribute("userInfo");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>资源管理</title>

    <link href="${pageContext.request.contextPath}/utils/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/dashboard.css" rel="stylesheet">
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">资源管理</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">欢迎<% session1.getUsername(); %>用户</a></li>
                <li><a href="#" id="logout_btn">退出</a></li>
                <li><a href="#">设置</a></li>
                <li><a href="#">帮助</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul id="sidebar" class="nav nav-sidebar">
                <li id="user-manage" class="active"><a>用户管理 <span class="sr-only">(current)</span></a></li>
                <li id="book-manage"><a>书籍管理</a></li>
            </ul><!-- 侧边栏 -->
        </div>

        <div id="main-panel" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

        </div><!-- 面板 -->
    </div><!-- row -->
</div><!-- container -->

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="${pageContext.request.contextPath}/utils/jquery/jquery-3.1.0.min.js"></script>
<script src="${pageContext.request.contextPath}/utils/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/dashboard.js"></script>
</body>
</html>

