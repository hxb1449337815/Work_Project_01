<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/23
  Time: 5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="http://www.java1234.com/jquery-easyui-1.3.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.java1234.com/jquery-easyui-1.3.3/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="http://www.java1234.com/jquery-easyui-1.3.3/demo/demo.css">
    <script type="text/javascript" src="http://www.java1234.com/jquery-easyui-1.3.3/jquery.min.js"></script>
    <script type="text/javascript" src="http://www.java1234.com/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="http://www.java1234.com/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
    <script>

        $(function(){
            $('#td').datagrid({
                url: 'getJson.action',
                loadMsg : '数据加载中请稍后……',
                columns: [[
                    {
                        field: 'uid',
                        title: 'ID',
                        align: 'center',
                        width: 50
                    },
                    {
                        field: 'uname',
                        title: '名字',
                        align: 'center',
                        width: 50
                    }
                ]]
            })
        })

    </script>
</head>
<body>
<table id="td"></table>
</body>
</html>
