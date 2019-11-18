<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/20
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="l">
    <tr>
        <td>${l.uid}</td>
        <td>${l.uname}</td>
        <td><a href="deleteUser.action?uid=${l.uid}">删除</a>&nbsp;<a href="byid.action?uid=${l.uid}">修改</a></td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
