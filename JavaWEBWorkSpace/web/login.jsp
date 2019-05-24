<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/17 0017
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>

    <form action="/login.do" method="get">
        用户名:<input type="text"  name="username"><br>
        密码:<input type="password" name="password"><br>
        <button type="submit">登录</button>
    </form>
</body>
</html>
