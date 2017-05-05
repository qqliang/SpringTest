<%--
  Created by IntelliJ IDEA.
  User: Qing_L
  Date: 2017/5/5
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<link href="${pageContext.request.contextPath}/utils/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">--%>
<link href="${pageContext.request.contextPath}/css/userManage.css" rel="stylesheet">
    <h1 class="page-header">用户管理</h1>
    <div class="row placeholders">
        <%--列表--%>
        <div class="list col-lg-12">
            <%--列名--%>
            <div class="list-title col-lg-12">
                <div class="list-item-div col-lg-2">用户昵称</div>
                <div class="list-item-div col-lg-3">电话</div>
                <div class="list-item-div col-lg-3">邮件</div>
                <div class="list-item-div col-lg-3">加入时间</div>
                <div class="list-button-add col-lg-1" onclick="addUser()">添加</div>
            </div>
            <%--列表主体--%>
            <div class="list-content"></div>
            <div class="page-box"></div>
        </div>
    </div>
<script src="${pageContext.request.contextPath}/js/userManage.js"></script>

