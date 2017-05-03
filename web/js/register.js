/**
 * Created by Qing_L on 2017/5/3.
 */
$(document).ready(function(){
    $('#sign_up_btn').click(function(){
        user = $("#username").val();
        if(user==""){
            alert("请输入用户名！");
            return null;
        }
        password = $("#password").val();
        if(password==""){
            alert("请输入密码！");
            return null;
        }
        confirm_password = $("#confirm_password").val();
        if(confirm_password==""){
            alert("请输入确认密码！");
            return null;
        }
        if(password!=confirm_password){
            alert("两次输入的密码不一致，请重新输入！");
            return null;
        }

        $.ajax({
            type: "post",
            dataType: "json",
            data:{user:user,password:password},
            url: "/library/checkRegist",
            success: function (data) {
                window.location.href="/library/login";
            },
            error: function () {
                alert("注册错误！");
            }
        })
    });
});