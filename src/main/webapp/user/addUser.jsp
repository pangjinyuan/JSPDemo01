<%--
  Created by IntelliJ IDEA.
  User: LSY66
  Date: 2021/6/13
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="addUser" method="get">
        <label for="id">ID</label><input type="text" name="id" id="id"><br>
        <label for="name">姓名</label><input type="text" name="name" id="name"><br>
        <label for="address">地址</label><input type="text" name="address" id="address"><br>
        <input type="submit" value="添加">
    </form>
</body>
</html>
