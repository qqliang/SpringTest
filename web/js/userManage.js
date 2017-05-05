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
            url: "/library/queryAllUser",
            success: function (data) {
                var obj = JSON.parse(data);
                var list = $(".list-content");
                for(var i=0; i<obj.length;i++){
                    var item = $('<div><div class="list-item-div col-lg-2">'+obj[i].userName+'</div>'+
                                '<div class="list-item-div col-lg-3" >'+obj[i].userTel+'</div>'+
                                '<div class="list-item-div col-lg-3" >'+obj[i].userEmail+'</div>'+
                                '<div class="list-item-div col-lg-3" >'+obj[i].createTime+'</div>' +
                                '<div class="list-button-quit col-lg-1" onclick="deleteUser()">删除</div></div>');
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
    function addUser() {

    }

    /**
     * 删除用户
     */
    function deleteUser() {

    }
});
