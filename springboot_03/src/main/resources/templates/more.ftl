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
		<div class="top-nav" id="cityBox">
	        <a href="#" class="logo-box">
	            <span class="icon-sprite logo"></span>
	            啄木鸟家庭
	        </a>
	        <div class="located-city" id="showCity">
	            <span class="city-name">北京市</span>
	        </div>
	    </div>
		<section class="content-box">		
			<ul class="mui-table-view">
				<#list productList as pro>
				<li class="mui-table-view-cell mui-media">
					<a href="javascript:;" class="">
						<img class="mui-media-object mui-pull-left" src="images/${pro.pic}">
						<div class="mui-media-body">
							${pro.name}
							<p class="mui-ellipsis">${pro.remark!"..."}</p>
							<p class="price-inner"> <span class="rmb-icon">￥</span> <span class="price-now">${pro.price}</span></p>
						</div>
					</a>
				</li>
				</#list>
			</ul>		
		</section>
		<script src="js/mui.min.js"></script>
		<script src="js/swiper.min.js"></script>
		<script src="js/common.js"></script>
	</body>

</html>