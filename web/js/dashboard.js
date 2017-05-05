/**
 * Created by Qing_L on 2017/5/4.
 */
$(window).ready(function () {
   $("#logout_btn").click(function () {
       $.ajax({
           type: "post",
           url: "/library/logout",
           success: function (data) {
               if(data=="true")
                   window.location.href="/library/login";
               else
                   alert("退出错误！");
           },
           error: function () {
               alert("退出错误!");
           }
       });
   }) ;

    $.ajax({
        type:"post",
        url: "/library/queryAllUser",
        success: function (data) {
            alert(data);
        },
        error: function () {
            alert("查询用户错误!");
        }
    });

});