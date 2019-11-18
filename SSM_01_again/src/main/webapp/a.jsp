<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/26
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script>
    $(function (){
        alert("");
        $.ajax({
            url: "https://wis.qq.com/weather/common",
            type:"get",
            data:{source:"pc",weather_type:"observe",province:"陕西",city:"汉中",county:"镇巴",_:"1569490663183"},
            dataType:"json",
            success: function(msg){
                alert(msg);
            }
        });
    });
</script>

<body>

<a href="https://wis.qq.com/weather/common?source=pc&weather_type=observe&province=陕西&city=汉中&county=镇巴&_=1569490663183">天气获取</a>
</body>
</html>
