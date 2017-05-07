<%--
  Created by IntelliJ IDEA.
  User: Qing_L
  Date: 2017/5/5
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<link href="${pageContext.request.contextPath}/utils/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">--%>
<%--<script src="${pageContext.request.contextPath}/utils/jquery/jquery-3.1.0.min.js"></script>--%>
<%--<link href="${pageContext.request.contextPath}/utils/materialize/css/materialize.min.css">--%>
<link href="${pageContext.request.contextPath}/css/userManage.css" rel="stylesheet">

<%--<script src="${pageContext.request.contextPath}/utils/materialize/js/materialize.min.js"></script>--%>
<script src="${pageContext.request.contextPath}/js/userManage.js"></script>
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
            <div class="list-button-add col-lg-1"  id="add-user-btn">添加</div>
        </div>
        <%--列表主体--%>
        <div class="list-content"></div>
        <div class="page-box"></div>
    </div>
</div>

<!--保存弹出框-->
<div id="saveUser" class="modal fade row" tableindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">添加用户</h4>
            </div>
            <div class="modal-body">
                <div class="input-group col-lg-12">
                    <span class="input-group-addon" style="width: 20%">用户名</span>
                    <input id="username" type="text" class="form-control">
                </div>
                <div class="input-group col-lg-12" style="padding-top: 10px">
                    <span class="input-group-addon" style="width: 20%">密码</span>
                    <input id="password" type="text" class="form-control">
                </div>
                <div class="input-group col-lg-12" style="padding-top: 10px">
                    <span class="input-group-addon" style="width: 20%">确认密码</span>
                    <input id="confirm-password" type="text" class="form-control">
                </div>
                <div class="input-group col-lg-12" style="padding-top: 10px">
                    <span class="input-group-addon" style="width: 20%">电话</span>
                    <input id="user-telephone" type="text" class="form-control">
                </div>
                <div class="input-group col-lg-12" style="padding-top: 10px">
                    <span class="input-group-addon" style="width: 20%">邮箱</span>
                    <input id="user-mail" type="text" class="form-control">
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="save-user-btn">保存</button>
            </div>
        </div><!-- modal-content -->
    </div><!-- modal-dialog -->
</div><!-- modal -->



