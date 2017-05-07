/**
 * Created by Qing_L on 2017/5/5.
 */
/************** 用户管理 ********************/
//@ sourceURL=userManage.js
$(window).ready(function () {
    getUser();
    /**
     * 获取用户列表
     */
    function getUser() {
        $.ajax({
            type:"post",
            url: "/user/queryAllUser",
            success: function (data) {
                var obj = JSON.parse(data);
                var list = $(".list-content");
                for(var i=0; i<obj.length;i++){
                    var item = $('<div><div class="list-item-div col-lg-2">'+obj[i].userName+'</div>'+
                                '<div class="list-item-div col-lg-3" >'+obj[i].userTel+'</div>'+
                                '<div class="list-item-div col-lg-3" >'+obj[i].userEmail+'</div>'+
                                '<div class="list-item-div col-lg-3" >'+obj[i].createTime+'</div>' +
                                '<div class="list-button-quit col-lg-1" onclick="deleteUser(obj[i].id)">删除</div></div>');
                    list.append(item);
                }
            },
            error: function () {
                alert("查询用户错误!");
            }
        });
    }

    /**
     * 添加用户
     */
    $('#add-user-btn').click(function () {
       $('#saveUser').modal('show');
        $('#save-user-btn').click(function () {
            addUser();
        });
    });

    function addUser() {
        var username = $('#username').val();
        if(username==""){
            alert("请输入用户名！");
            return null;
        }
        var password = $('#password').val();
        if(password==""){
            alert("请输入密码！");
            return null;
        }
        var confirm_pwd = $('#confirm-password').val();
        if(confirm_pwd==""){
            alert("请输入确认密码！");
            return null;
        }else if(confirm_pwd!=password){
            alert("两次输入的密码不正确，请重新输入！");
            return null;
        }
        var user_tel = $('#user-telephone').val();
        if(user_tel==""){
            alert("请输入联系电话！");
            return null;
        }
        var user_mail = $('#user-mail').val();
        if(user_mail==""){
            alert("请输入邮箱！");
            return null;
        }

        $.ajax({
           type:"post",
           dataType:"text",
           data:{
               username:username,
               password:password,
               user_tel:user_tel,
               user_mail:user_mail
            },
            url:"/user/insertUser",
            success:function (data) {
                if(data == true ){
                    alert("添加用户成功!");
                }else {
                    alert("添加用户失败！");
                }
                $('#saveUser').modal('close');
            },
            error:function () {
                alert("添加用户失败！");
                $('#saveUser').modal('close');
            }
        });
    }

    /**
     * 删除用户
     */
    function deleteUser(id) {

    }
});
