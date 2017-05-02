<%--
  Created by IntelliJ IDEA.
  User: Qing_L
  Date: 2017/5/1
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<link href="utils/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="css/register.css" rel="stylesheet">
<body>
<div class="container" STYLE="padding-left: 80px;padding-right: 80px">
    <form class="form-signin">
    <div class="panel panel-default" STYLE="padding-left: 40px;padding-right: 40px">
        <div class="page-header">
            <h2>欢迎注册!</h2>
        </div>
        <div class="panel-body">
            <div class="input-group">
                <span class="input-group-addon" id="basic-addon1">用戶名</span>
                <input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
            </div>
            <div class="input-group" style="padding-top: 10px">
                <span class="input-group-addon" id="basic-addon2">密码</span>
                <input type="text" class="form-control" placeholder="password" aria-describedby="basic-addon2">
            </div>
            <div class="input-group" style=" padding-top: 10px">
                <span class="input-group-addon" id="basic-addon3">确认密码</span>
                <input type="text" class="form-control" placeholder="confirm password" aria-describedby="basic-addon3">
            </div>
            <a href="index.jsp" style="padding-top: 10px;padding-bottom: 5px">返回登录</a>
            <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
        </div><!-- end panel-body -->
    </div><!-- end panel -->
        </form>
</div><!-- end container -->

</body>
<script src="utils/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</html>
