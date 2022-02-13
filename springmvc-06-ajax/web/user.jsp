<%--
  Created by IntelliJ IDEA.
  User: CH
  Date: 2022/2/9
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.post("${pageContext.request.contextPath}/a2", function (data) {
                    var html = ""

                    for (let i = 0; i < data.length; i++) {
                        /*这里使用了：模板字符串，注意点：需要使用\转义*/
                        html += `<tr><td> \${data[i].name} </td><td> \${data[i].age} </td><td> \${data[i].sex} </td></tr>`
                    }

                    $("#content").html(html)
                })
            })
        })
    </script>
</head>
<body>
<input type="button" value="加载数据" id="btn">
<table>
    <tr>
        <td>姓名：</td>
        <td>年龄：</td>
        <td>性别：</td>
    </tr>
    <tbody id="content">

    </tbody>
</table>
</body>
</html>
