<%--
  Created by IntelliJ IDEA.
  User: CH
  Date: 2022/2/9
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script>
        function a1() {
            $.post({
                url: "${pageContext.request.contextPath}/u1",
                data: {"name11": $("#name").val()},
                success: function (data) {
                    console.log(data)
                    let html = `<h3 style="color: red"> \${data} </h3>`
                    $("#userInfo").html(html)
                }
            })
        }

        function a2() {
            $.post({
                url: "${pageContext.request.contextPath}/u1",
                data: {"pwd11": $("#pwd").val()},
                success: function (data) {
                    console.log(data)
                    let html = `<h3 style="color: red"> \${data} </h3>`
                    $("#pwdInfo").html(html)
                }
            })
        }
    </script>

</head>
<body>
<p>
    用户名：<input type="text" id="name" onblur="a1()">
    <span id="userInfo"></span>
</p>
<p>
    密码：<input type="text" id="pwd" onblur="a2()">
    <span id="pwdInfo"></span>
</p>

</body>
</html>
