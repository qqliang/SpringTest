<%--
  Created by IntelliJ IDEA.
  User: Qing_L
  Date: 2017/5/1
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <script src="${pageContext.request.contextPath}/utils/jquery/jquery-3.1.0.min.js"></script>
  <link href="${pageContext.request.contextPath}/utils/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
  <%--<link href="css/signin.css" rel="stylesheet">--%>
  <body>
  <div class="container row" style="padding-top: 10%;padding-left: 10%">
      <img src="${pageContext.request.contextPath}/image/login-logo.jpg" class="col-lg-4">
      <div class="panel panel-default col-lg-8">
        <div class="panel-heading">
          <h2 class="form-signin-heading">请登录</h2>
        </div><!-- /panel-heading -->

        <div class="panel-body">
          <div class="input-group">
            <span class="input-group-addon glyphicon glyphicon-user" id="basic-addon1"> 用户名：</span>
            <input type="email" id="user" class="form-control" placeholder="请输入您的邮箱" aria-describedby="basic-addon1" required autofocus>
          </div>

          <div class="input-group" style="padding-top: 10px">
            <span class="input-group-addon glyphicon glyphicon-lock" id="basic-addon2"> 密码：</span>
            <input type="password" id="password" class="form-control" placeholder="请输入密码" required>
          </div>

          <div class="checkbox">
            <label>
              <input type="checkbox" value="remember-me"> 记住我
            </label>
            <a href="/library/regist" style="float: right">注册</a>
          </div>
          <button class="btn btn-lg btn-primary btn-block" id="sign_in_btn">登录</button>
        </div><!-- /panel-body -->
      </div><!-- /panel -->
  </div> <!-- /container -->
  </body>
<script src="${pageContext.request.contextPath}/utils/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/index.js"></script>
</html>
