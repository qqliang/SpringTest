/**
 * Created by Qing_L on 2017/5/2.
 */
$(document).ready(function(){
    $('#sign_in_btn').click(function(){
        user = $("#user").val();
        password = $("#password").val();
        $.ajax({
            type: "post",
            dataType: "json",
            data:{user:user,password:password},
            url: "/library/User",
            success: function (data) {
                alert(data);
            },
            error: function () {
                
            }
        })
    });
});