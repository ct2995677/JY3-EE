<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-05-22
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <table border="1px">
      <thead>
        <th>用户名</th>
        <th>密码</th>
        <th>操作</th>
      </thead>
      <c:forEach items="${users}" var="user">
      <tr>
        <td>${user.userName}</td>
        <td>${user.psw}</td>
        <td>${user.cao}</td>
      </tr>
      </c:forEach>


    </table>
  </body>
</html>
