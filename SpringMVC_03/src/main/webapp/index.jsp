<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/24
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${students}" var="stu">
            <tr>
                <td>${stu.id}</td>
                <td>${stu.name}</td>
                <td>${stu.age}</td>
                <td><a href="updateStudent.action?id=${stu.id}">修改</a></td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
