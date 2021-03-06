﻿<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="css/style.css"/>
		<link rel="stylesheet" href="assets/css/ace.min.css" />
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />

		<!--  <link rel="stylesheet" href="font/css/font-awesome.min.css" />-->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>
		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<!-- page specific plugin scripts -->
 
		<script src="assets/layer/layer.js" type="text/javascript" ></script>
<script type="text/javascript" src="js/H-ui.js"></script>
		<title>用户列表</title>
		</head>

		<body>
<div class="page-content clearfix">
          <div id="Member_Ratings">
    <div class="d_Confirm_Order_style">
              <form class="search_style" id="search_form">
        <ul class="search_content clearfix">
                  <li>
            <label class="l_f">用户账号：</label>
            <input name="" type="text"  class="text_add" placeholder="输入用户账号"  />
          </li>
                  <li>
            <label class="l_f">用户姓名：</label>
            <input name="" type="text"  class="text_add" placeholder="输入用户姓名"  />
          </li>
                  <li>
            <label class="l_f">手机号：</label>
            <input name="" type="text"  class="text_add" placeholder="输入手机号"  />
          </li>
                  <li>
            <label class="l_f">部门：</label>
            <select name="" style="width:90px">
                      <option>--所有--</option>
                      <option>部门1</option>
                      <option>部门2</option>
                      <option>部门3</option>
                    </select>
          </li>
                  <li style="width:90px;">
            <button type="button" class="btn_search" onclick="search_user()"><i class="icon-search"></i>查询</button>
          </li>
                </ul>
      </form>
              <!---->
              <div class="border clearfix"> <span class="l_f"> <a href="javascript: " id="member_add" class="btn btn-warning"><i class="icon-plus"></i>添加用户</a>  </span> <span class="r_f">共：<b>2345</b>条</span> </div>
              <!---->
              <div class="table_menu_list">
        <table class="table table-striped table-bordered table-hover" id="sample-table">
                  <thead>
            <tr>
                      <th width="25"><label>
                          <input type="checkbox" class="ace">
                          <span class="lbl"></span></label></th>
                      <th  >账号</th>
                      <th  >名称</th>
                      <th  >年龄</th>
                      <th >电话</th>
                      <th >QQ</th>
                      <th >职务</th>
                      <th >角色</th>
                      <th >添加时间</th>
                      <th >状态</th>
                      <th width="180">操作</th>
                    </tr>
          </thead>
                  <tbody>
                  <c:forEach items="${users}" var="u">
            <tr>
                  <td><label>
                      <input type="checkbox" class="ace">
                      <span class="lbl"></span></label></td>
                  <td>${u.username}</td>
                  <td> ${u.name}</td>
                  <td>${u.age}</td>
                  <td>${u.tel}</td>
                  <td>${u.qq}</td>
                  <td >${u.post}</td>
                  <td>${u.roles}</td>
                  <td>${u.addTime}</td>
                  <td class="td-status"><span class="<c:choose>
                      <c:when test="${u.state==true}">label label-success radius</c:when><c:otherwise>label label-defaunt radius</c:otherwise>
                  </c:choose>"><c:choose>
                      <c:when test="${u.state==true}">已启用</c:when><c:otherwise>已停用</c:otherwise>
                  </c:choose></span></td>
                  <td class="td-manage"><a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a> <a title="编辑" onclick="member_edit(${u.id})" href="javascript:;"  class="btn btn-xs btn-info" ><i class="icon-edit bigger-120"></i></a> <a title="删除" href="javascript:;"  onclick="member_del(this,'1')" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a></td>
            </tr>
                  </c:forEach>
          </tbody>
                </table>
      </div>
            </div>
  </div>
        </div>
<!--添加用户图层-->
<form class="add_menber" id="add_menber_style" style="display:none" action="/addUser.do" method="post">
<ul class=" page-content">
          <li>
    <label class="label_name">用户账号：</label>
    <span class="add_name">
            <input value="" name="username" type="text"  class="text_add"/>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li>
    <label class="label_name">用户姓名：</label>
    <span class="add_name">
            <input name="name" type="text"  class="text_add"/>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li>
    <label class="label_name">所属部门：</label>
    <span class="add_name">
            <select name="post" class="text_add" style="width:160px; margin-left:9px;">
      <option value="部门1">部门1</option>
      <option value="部门2">部门2</option>
      <option value="部门3">部门3</option>
    </select>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li>
    <label class="label_name"> QQ：</label>
    <span class="add_name">
            <input name="qq" type="text"  class="text_add"/>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li>
    <label class="label_name">联系电话：</label>
    <span class="add_name">
            <input name="tel" type="text"  class="text_add"/>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li>
    <label class="label_name">用户年龄：</label>
    <span class="add_name">
            <input name="age" type="text"  class="text_add"/>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li >
    <label class="label_name">初始密码：</label>
    <span class="add_name">
            <input name="password" type="text"  class="text_add" />
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li >
    <label class="label_name">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
    <span class="add_name">
            <label>
      <input name="sex" type="radio" checked="checked" value="false" class="ace">
      <span class="lbl">男</span></label>
            &nbsp;&nbsp;&nbsp;
            <label>
      <input name="sex" type="radio" class="ace" value="true">
      <span class="lbl">女</span></label>
            &nbsp;&nbsp;&nbsp; </span>
    <div class="prompt r_f"></div>
  </li> 
  <li style="width:60%;">
    <label class="label_name">用户组：</label>
    <span class="add_name">
            <label>
      <input name="roleid" type="radio" checked="checked" class="ace">
      <span class="lbl">普通用户</span></label>
            &nbsp;&nbsp;&nbsp;
            <label>
      <input name="roleid" type="radio" class="ace">
      <span class="lbl">管理员</span></label>
            &nbsp;&nbsp;<label>
             <input name="roleid" type="radio"  class="ace">
      <span class="lbl">超级管理员</span></label>
            &nbsp;&nbsp;&nbsp;</span>
      <label>
    <div class="prompt r_f"></div></label>
  </li>
        </ul>
</form>




<!--修改用户图层-->
<form class="update_menber" id="update_menber_style" style="display:none" action="/updateUser.do" method="post">
    <ul class=" page-content">
        <li>
            <label class="label_name">用户账号：</label>
            <span class="add_name">
            <input value="" name="username" id="username" type="text"  class="text_add"/>
            </span>
            <div class="prompt r_f"></div>
        </li>
        <li>
            <label class="label_name">用户姓名：</label>
            <span class="add_name">
            <input name="name" type="text" id="name" class="text_add"/>
            </span>
            <div class="prompt r_f"></div>
        </li>
        <li>
            <label class="label_name">所属部门：</label>
            <span class="add_name">
            <select name="post" id="post" class="text_add" style="width:160px; margin-left:9px;">
      <option value="部门1">部门1</option>
      <option value="部门2">部门2</option>
      <option value="部门3">部门3</option>
    </select>
            </span>
            <div class="prompt r_f"></div>
        </li>
        <li>
            <label class="label_name"> QQ：</label>
            <span class="add_name">
            <input name="qq" type="text" id="qq" class="text_add"/>
            </span>
            <div class="prompt r_f"></div>
        </li>
        <li>
            <label class="label_name">联系电话：</label>
            <span class="add_name">
            <input name="tel" type="text" id="tel" class="text_add"/>
            </span>
            <div class="prompt r_f"></div>
        </li>
        <li>
            <label class="label_name">用户年龄：</label>
            <span class="add_name">
            <input name="age" type="text" id="age" class="text_add"/>
            </span>
            <div class="prompt r_f"></div>
        </li>

        <li >
            <label class="label_name">初始密码：</label>
            <span class="add_name">
            <input name="password" type="text" id="password" class="text_add" />
            </span>
            <div class="prompt r_f"></div>
        </li>
        <li >
            <label class="label_name">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
            <span class="add_name">
            <label>
      <input name="sex" type="radio" id="sex_man" value="true" class="ace">
      <span class="lbl">男</span></label>
            &nbsp;&nbsp;&nbsp;
            <label>
      <input name="sex" type="radio" id="sex_woman" class="ace" value="false">
      <span class="lbl">女</span></label>
            &nbsp;&nbsp;&nbsp; </span>
            <div class="prompt r_f"></div>
        </li>
        <li style="width:60%;">
            <label class="label_name">用户组：</label>
            <span class="add_name">
            <label>
      <input name="" type="radio" checked="checked" class="ace">
      <span class="lbl">普通用户</span></label>
            &nbsp;&nbsp;&nbsp;
            <label>
      <input name="" type="radio" class="ace">
      <span class="lbl">管理员</span></label>
            &nbsp;&nbsp;<label>
             <input name="" type="radio"  class="ace">
      <span class="lbl">超级管理员</span></label>
            &nbsp;&nbsp;&nbsp;</span>
            <label>
                <div class="prompt r_f"></div></label>
        </li>
    </ul>
    <input name="id" type="hidden" id="id" class="text_add" />
</form>

</body>
</html>
<script> 
/*用户-添加*/
 $('#member_add').on('click', function(){
    layer.open({
        type: 1,
        title: '添加用户',
		maxmin: true, 
		shadeClose: true, //点击遮罩关闭层
        area : ['800px' , ''],
        content:$('#add_menber_style'),
		btn:['提交','取消'],
		yes:function(index,layero){	
		 var num=0;
		 var str="";
     $(".add_menber input[type$='text']").each(function(n){
          if($(this).val()=="")
          {
               
			   layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
                title: '提示框',				
				icon:0,								
          }); 
		    num++;
            return false;            
          } 
		 });
		  if(num>0){  return false;}	 	
          else{
			  $('#add_menber_style').submit();
			  layer.alert('添加成功！',{
               title: '提示框',				
			icon:1,		
			  });
			   layer.close(index);
              location.replace(location.href);
		  }		  		     				
		}
    });
});
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url+'#?='+id,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="icon-ok  bigger-120"></i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
	
}
/*用户查询*/
function search_user(){
	$("#search_form").submit();

}
/*用户-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!',{icon: 6,time:1000});
	});
}
/*用户-编辑*/
function member_edit(id){

    $.ajax({
        url:"/getUserById.do",
        data:{id:id},
        dataType:"json",
        success:function (user) {
            $("#username").val(user.username);
            $("#qq").val(user.qq);
            if (user.sex==true){
                $("#sex_man").attr("checked",true);
            } else{
                $("#sex_woman").attr("checked",true);
            }
            $("#post").val(user.post);
            $("#name").val(user.name);
            $("#tel").val(user.tel);
            $("#password").val(user.password);
            $("#age").val(user.age);
            $("#id").val(user.id);
        }
    });

	  layer.open({
        type: 1,
        title: '修改用户信息',
		maxmin: true, 
		shadeClose:false, //点击遮罩关闭层
        area : ['800px' , ''],
        content:$('#update_menber_style'),
		btn:['提交','取消'],
		yes:function(index,layero){	
		 var num=0;
		 var str="";
     $(".update_menber input[type$='text']").each(function(n){
          if($(this).val()=="")
          {
               
			   layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
                title: '提示框',				
				icon:0,								
          }); 
		    num++;
            return false;            
          } 
		 });
		  if(num>0){  return false;}	 	
          else{
			  $('#update_menber_style').submit();
			  layer.alert('添加成功！',{
               title: '提示框',				
			icon:1,		
			  });
			   layer.close(index);
              location.replace(location.href);
		  }		  		     				
		}
    });
}
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}
 

</script>