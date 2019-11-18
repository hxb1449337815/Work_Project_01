<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/20
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>编号</td>
        <td>姓名</td>
    </tr>
    <s:iterator value="list" var="li">
        <tr>
            <td><s:property value="#li.uid"/></td>
            <td><s:property value="#li.uname"/></td>
        </tr>
    </s:iterator>
</table>

<a href="testAction_test?pageNum=<s:property value="pageNum-1"/> ">上一页</a>&nbsp;<a href="testAction_test?pageNum=<s:property value="pageNum+1"/>">下一页</a>

</body>
</html>
