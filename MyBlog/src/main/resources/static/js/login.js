function checkUser() {
    var username = $("#username").val();
    var password = $("#password").val();
    $.ajax({
        type:"POST",
        url: "/checkPassword",
        data: {"username":username,"password":password},
        dataType:"json",
        success(data){
            if(data)
                alert("登录成功");
            else
                alert("登录失败");
        }
    })
}