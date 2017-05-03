/**
 * Created by Qing_L on 2017/5/2.
 */
$(document).ready(function(){
    $('#sign_in_btn').click(function(){
        user = $("#user").val();
        if(user=="") {
            alert("请输入用户名！");
            return null;
        }
        password = $("#password").val();
        if(password==""){
            alert("请输入密码！");
            return null;
        }
        $.ajax({
            type: "post",
            dataType: "json",
            data:{user:user,password:password},
            url: "/library/checkLogin",
            success: function (data) {
                window.location.href="/library/dashboard";
            },
            error: function () {
                alert("用户名或密码错误!");
            }
        })
    });
});