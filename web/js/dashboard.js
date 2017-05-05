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

    /**
     * 侧边栏点击事件
     */
    $("#sidebar li").click(function () {
        $("#sidebar li").removeClass("active");
        $(this).addClass("active");

        page = $(this).attr("id");
        if(page=="user-manage"){
            $("#main-panel").load("/library/usermanage",null,function (response,status,xhr) {});
        }else if(page=="book-manage"){
            $("#main-panel").load("/library/bookmanage",null,function (response,status,xhr) {});
        }
    });

    $("#main-panel").load("/library/usermanage",null,function (response,status,xhr) {});
});