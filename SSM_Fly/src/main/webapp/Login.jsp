﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>航班系统登录</title>

<link rel="stylesheet" type="text/css" href="css/style_login.css">

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/vector.js"></script>

</head>
<body>

<div id="container">
	<div id="output">
		<div class="containerT">
			<h1>用户登录</h1>
			<form class="form" id="entry_form" action="/login.do" method="post">
				<input type="text" placeholder="用户名" id="entry_name" name="username">
				<input type="password" placeholder="密码" id="entry_password" name="password">
				<button type="submit" id="entry_btn">登录</button>
				<div id="prompt" class="prompt"></div>
			</form>
		</div>
	</div>
</div>

<script type="text/javascript">
    $(function(){
        Victor("container", "output");   //登录背景函数
        $("#entry_name").focus();
        $(document).keydown(function(event){
            if(event.keyCode==13){
                $("#entry_btn").click();
            }
        });
    });
</script>
<div style="text-align:center;">
</div>
</body>
</html>