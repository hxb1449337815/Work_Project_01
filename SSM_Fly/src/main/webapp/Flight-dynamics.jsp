<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
			
		</script><script src="assets/layer/layer.js" type="text/javascript" ></script>
<script type="text/javascript" src="js/H-ui.js"></script>
<script>
    function AirLineInfo() {
        var startCity = $("#startCity").val();
        var lastCity = $("#lastCity").val();
        var theDate = $("#theDate").val();
        $.ajax({
            url:"/AirLineInfo.do",
            data:{startCity:startCity,lastCity:lastCity,theDate:theDate},
            dataType:"json",
            success:function(msg){
                alert(msg.length);
                for(var i=0;i<msg.length;i++){
                    var tr="<tr>"+
                        "<td>"+msg[i].company+"</td>"+
                        "<td>"+msg[i].airlineCode+"</td>"+
                        "<td>"+msg[i].startDrome+"</td>"+
                        "<td>"+msg[i].arriveDrome+"</td>"+
                        "<td>"+msg[i].startTime+"</td>"+
                        "<td>"+msg[i].arriveTime+"</td>"+
                        "<td>"+msg[i].mode+"</td>"+
                        "<td>"+msg[i].airlineStop+"</td>"+
                        "<td>"+msg[i].week+"</td>"+
                        "<td>订票</td>"+
                        +"</tr>";
                    $("#trInfo").append(tr);
                }

                $("#sample-table").show();
            }
        })
    }
</script>

<title>航班动态信息</title>
</head>
<style>
.add_menber  li{width:33%;}
.add_menber li .label_name, .member_content li .label_name{ width:100px !important;}
</style>
<body>
<div class="page-content clearfix">
  <div id="Member_Ratings">
    <div class="d_Confirm_Order_style">
  
       <form id="search_form" action="AirLineInfo.do">
      <div class="search_style">
        <ul class="search_content clearfix">
          <li>
            <label class="l_f">出发地点：</label>
            <input name="startCity" type="text" id="startCity"  class="text_add" placeholder="输入出发地点"  style=" width:190px"/>
          </li>
          <li>
            <label class="l_f">抵达地点：</label>
            <input name="lastCity" type="text" id="lastCity" class="text_add" placeholder="输入抵达地点"  style=" width:190px"/>
          </li>
          <li>
            <label class="l_f">出发时间（年-月-日）：</label>
            <input name="theDate" class="inline laydate-icon" id="theDate" style=" margin-left:10px;">
          </li>
          <li>
            <button type="button" class="btn_search" onclick="AirLineInfo()"><i class="icon-search"  ></i>查询</button>
          </li>
        </ul>
      </div>
      <%--<div class="search_style">
        <ul class="search_content clearfix">
          <li>
            <label class="l_f">所有航班：</label>
            <select name="" style=" width:110px">
              <option>---所有---</option>
              <option>始发航班--</option>
            </select>
          </li>
          <li>
            <label class="l_f">进出港：</label>
            <select name="" style=" width:110px">
              <option>---所有---</option>
              <option>进港</option>
              </option>
              <option>出港</option>
            </select>
          </li>
          <li>
            <label class="l_f">航空公司：</label>
            <select name="" style=" width:110px">
              <option>---航空公司---</option>
              <option>东航</option>
              <option>南航</option>
              <option>江西南昌航空公司</option>
            </select>
          </li>
          <li>
            <label class="l_f">国内/外航班：</label>
            <select name="" style=" width:110px">
              <option>---所有---</option>
              <option>国内航班</option>
              <option>国外航班</option>
            </select>
          </li>
          <li>
            <label class="l_f">航班状态：</label>
            <select name="" style=" width:110px">
              <option>---所有---</option>
              <option>延误</option>
              <option>正常</option>
              <option>取消</option>
            </select>
          </li>
        </ul>
      </div>--%>
	  </form>
      <!---->
      
      <div class="table_menu_list">
        <table class="table table-striped table-bordered table-hover" id="sample-table" style="display: none">
          <thead>
            <tr>
              <th >航空公司</th>
              <th >航班号</th>
              <th >出发机场</th>
              <th >到达机场</th>
              <th >出发时间</th>
              <th >到达时间</th>
              <th >机型</th>
              <th >经停</th>
              <th >飞行周期</th>
                <th>操作</th>
            </tr>
          </thead>
          <tbody id="trInfo">


          </tbody>
        </table>
        <div style=" float:right; margin-right:20px;">
          <%--<nav aria-label="Page navigation">
            <ul class="pagination">
              <li> <a href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span> </a> </li>
              <li class="active" ><a href="#">1</a></li>
              <li><a href="#">2</a></li>
              <li><a href="#">3</a></li>
              <li><a href="#">4</a></li>
              <li><a href="#">5</a></li>
              <li> <a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span> </a> </li>
            </ul>
          </nav>--%>
        </div>
      </div>
    </div>
  </div>
</div>
<!--修改图层-->
<form id="add_menber_form">
	<div class="add_menber" id="add_menber_style" style="display:none; width:900px !important;">
   <ul class=" page-content">
    <li >
              <label class="label_name">成人数量：</label>
              <span class="add_name">
      <input value="" name="adultNum" type="text"  class="text_add adultNum"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">儿童数量：</label>
              <span class="add_name">
      <input name="childNum" type="text"  class="text_add childNum"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">婴儿数量：</label>
              <span class="add_name"> 
      <input name="babyNum" type="text"  class="text_add babyNum"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">计划起飞时间：</label>
              <span class="add_name">
      <input name="planTakeTime" type="text"  class="text_add planTakeTime"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">实际起飞时间：</label>
              <span class="add_name">
      <input name="realTakeTime" type="text"  class="text_add realTakeTime"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">行李件数：</label>
              <span class="add_name">
      <input name="luggageNum" type="text"  class="text_add luggageNum"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">货邮重量：</label>
              <span class="add_name">
      <input name="cargoWeight" type="text"  class="text_add cargoWeight"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">撒轮挡时间：</label>
              <span class="add_name">
      <input name="removeTime" type="text"  class="text_add removeTime"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">计划落地时间：</label>
              <span class="add_name">
      <input name="planLandTime" type="text"  class="text_add planLandTime"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">航班号：</label>
              <span class="add_name">
      <input name="flightNo" type="text"  class="text_add flightNo"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">机位：</label>
              <span class="add_name">
      <input name="seat" type="text"  class="text_add seat"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">实际落地时间：</label>
              <span class="add_name">
      <input name="realLandTime" type="text"  class="text_add realLandTime"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">挡轮挡时间：</label>
              <span class="add_name">
      <input name="blockTime" type="text"  class="text_add blockTime"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">执行日期：</label>
              <span class="add_name">
      <input name="doDate" type="text"  class="text_add doDate"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">登机口：</label>
              <span class="add_name">
      <input name="gate" type="text"  class="text_add gate"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">二字码：</label>
              <span class="add_name">
      <input name="airCode" type="text"  class="text_add airCode"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">行李转盘：</label>
              <span class="add_name">
      <input name="luggageTurntable" type="text"  class="text_add luggageTurntable"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">航空公司：</label>
              <span class="add_name">
      <input name="airlineCompany" type="text"  class="text_add airlineCompany" readonly="readonly" value=""/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">起飞机场：</label> 
              <span class="add_name">
      <input name="airportStart" type="text"  class="text_add airportStart"/>
      </span>
              <div class="prompt r_f"></div> 
            </li>
    <li>
              <label class="label_name">机号：</label>
              <span class="add_name">
      <input name="no" type="text"  class="text_add no"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">机型：</label>
              <span class="add_name">
      <input name="机型" type="text"  class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">备降机场：</label>
              <span class="add_name">
      <input name="airportEndSpare" type="text"  class="text_add airportEndSpare"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">关联航班ID：</label>
              <span class="add_name">
      <input name="relationId" type="text"  class="text_add relationId"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">航站楼：</label>
              <span class="add_name">
      <input name="terminal" type="text"  class="text_add terminal"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">航班代理：</label>
              <span class="add_name">
      <input name="flightAgent" type="text"  class="text_add flightAgent"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">是否始发航班：</label>
              <select name="" style=" width:156px; margin-left:10px;">
        <option>始发航班</option>
        <option>非始发航班</option>
      </select>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">航班状态：</label>
              <select name="" style=" width:156px; margin-left:10px;">
        <option>延误</option>
        <option>正常</option>
        <option>取消</option>
        <option>备降</option>
        <option>返航</option>
      </select>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">国内/外航班：</label>
              <select name="nature" style=" width:156px ; margin-left:10px;">
        <option>国内航班</option>
        <option>国外航班</option>
      </select>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">不正常原因：</label>
              <select name="" style=" width:156px; margin-left:10px;">
        <option>无</option>
        <option>天气</option>
        <option>飞机</option>
        <option>乘客</option>
      </select>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">进/出港：</label>
              <select name="" style=" width:156px; margin-left:10px;">
        <option>进港</option>
        <option>出港</option>
      </select>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">任务性质：</label>
              <select name="" style=" width:156px; margin-left:10px;">
        <option>退航</option>
        <option>正班</option>
        <option>补班</option>
        <option>专机</option>
        <option>转场</option>
        <option>训练</option>
      </select>
              <div class="prompt r_f"></div>
            </li>
  </ul>
  </div>
</form>
</body>
</html>
<script src="http://ajax.aspnetcdn.com/ajax/jquery/jquery-2.1.4.min.js"></script>
<script>
/*查询*/
function search_flight(){
	
	$("#search_form").submit();
}

/*-编辑*/
function member_edit(id){

    $.ajax({
        url:'/selectByPrimaryKey.do',
        data:"id="+id,
        success:function(msg){
            $("#add_menber_style .no").val(msg.no);
            $("#add_menber_style .adultNum").val(msg.adultNum);
            $("#add_menber_style .childNum").val(msg.childNum);
            $("#add_menber_style .babyNum").val(msg.babyNum);
            var d=new Date(msg.planTakeTime);
            $("#add_menber_style .planTakeTime").val(d.getFullYear()+"-"+(d.getMonth()+1)+"-"+d.getDate());
            $("#add_menber_style .realTakeTime").val(msg.realTakeTime);
            $("#add_menber_style .luggageNum").val(msg.luggageNum);

            $("#add_menber_style .cargoWeight").val(msg.cargoWeight);
            $("#add_menber_style .removeTime").val(msg.removeTime);
            d=new Date(msg.planLandTime);
            $("#add_menber_style .planLandTime").val(d.getFullYear()+"-"+(d.getMonth()+1)+"-"+d.getDate());
            $("#add_menber_style .flightNo").val(msg.flightNo);
            $("#add_menber_style .seat").val(msg.seat);
            $("#add_menber_style .realLandTime").val(msg.realLandTime);

            $("#add_menber_style .blockTime").val(msg.blockTime);
            $("#add_menber_style .doDate").val(msg.doDate);
            $("#add_menber_style .gate").val(msg.gate);
            $("#add_menber_style .luggageTurntable").val(msg.luggageTurntable);
            $("#add_menber_style .airportStart").val(msg.airportStart);

            $("#add_menber_style .airportEndSpare").val(msg.airportEndSpare);
            $("#add_menber_style .relationId").val(msg.relationId);
            $("#add_menber_style .airCode").val(msg.airCode);

            $("#add_menber_style .airlineCompany").val(msg.airlineCompany);
            $("#add_menber_style .terminal").val(msg.terminal);
            $("#add_menber_style .flightAgent").val(msg.flightAgent);
        }
    });

	  layer.open({
        type: 1,
        title: '修改航班动态信息',
		maxmin: true, 
		shadeClose:false, //点击遮罩关闭层
        area : ['920px' , ''],
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
			$("#add_menber_form").submit();
			  layer.alert('编辑成功！',{
               title: '提示框',				
			icon:1,	
			  });	
			   layer.close(index);
		  }		  		     				
		}
    });
	
}


/*-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}
 

</script>