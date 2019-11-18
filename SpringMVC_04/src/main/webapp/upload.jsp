<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/25
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/upload.action" method="post" enctype="multipart/form-data">
    请选择文件<input type="file" name="multipartFile"><input type="submit" value="上传">
</form>
</body>
</html>
