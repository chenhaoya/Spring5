<%--
  Created by IntelliJ IDEA.
  User: CH
  Date: 2022/2/5
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/test/1/2">
    <input type="submit" value="数值提交">
</form>
<br>
<form method="get" action="${pageContext.request.contextPath}/test/1/2">
    <input type="submit" value="字符提交">
</form>
</body>
</html>
