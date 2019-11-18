<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/25
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${files}" var="f">
        <a href="/downLoad.action?fileName=${f.name}">${f.name}</a><br>
    </c:forEach>
</body>
</html>
