<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/20
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="updateUser.action" method="post">
        <table>
            <tr>
                <td>姓名：</td>
                <td><input type="text" name="uname" value="${user.uname}"/><input type="hidden" name="uid" value="${user.uid}"/></td>
            </tr>
            <tr>
                <td rowspan="2"><input type="submit"></td>
            </tr>
        </table>
    </form>
</body>
</html>
