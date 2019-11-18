<!DOCTYPE html>
<html class="ui-page-login">

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title></title>
		<link href="css/mui.min.css" rel="stylesheet" />
		<link href="css/swiper.min.css" rel="stylesheet" />
		<link href="css/common.css" rel="stylesheet" />
	</head>

	<body>
		<div class="top-nav nob" id="cityBox">
	        <a href="#" class="logo-box">
	            <span class="icon-sprite logo"></span>
	            啄木鸟家庭
	        </a>
	        <div class="located-city" id="showCity">
	            <span class="city-name">北京市</span>
	        </div>
	    </div>
	    <img src="images/unlock_index_banner.png" alt="">
	    <section class="content-box">	
			<ul class="content-box mui-table-view mui-grid-view mui-grid-9">
				<#list unlookList as un>
	            <li class="mui-table-view-cell mui-media mui-col-xs-4">
	            	<a href="#">
	                    <span class="${un.pic}"></span>
	                    <div class="mui-media-body">${un.name}</div>
	                </a>
	            </li>
				</#list>
	        </ul>
    	</section>
		<section class="content-box">	
			<div class="service-con">
            	<p class="title">我们的承诺</p>
	            <div class="con service-description2">
	                <p><span class="icon-service icon-ser2"></span>价格公开</p>
	                <p class="second-p"><span class="icon-service icon-ser1"></span>营业资质</p>
	                <p class="last"><span class="icon-service icon-ser4"></span>专业技师</p>
	                <p class="last"><span class="icon-service icon-ser3"></span>急速上门</p>
	            </div>
	        </div>
		</section>        
		<script src="js/mui.min.js"></script>
		<script src="js/swiper.min.js"></script>
		<script src="js/common.js"></script>
	</body>

</html>