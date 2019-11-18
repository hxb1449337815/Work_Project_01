<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/24
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="toUpdateStudent.action" modelAttribute="stu">
        <form:hidden path="id"></form:hidden><br>
        姓名：<form:input path="name"></form:input><br>
        性别：<form:radiobutton path="sex" label="男" value="男"></form:radiobutton>&nbsp;<form:radiobutton path="sex" label="女" value="女"></form:radiobutton><br>
        年龄：<form:input path="age"></form:input><br>
        城市：<form:select path="city">
                <form:options items="${cities}" itemLabel="name" itemValue="ID"></form:options>
              </form:select>
        <input type="submit" value="修改"/>
    </form:form>
</body>
</html>
