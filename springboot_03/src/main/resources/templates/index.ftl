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
<div class="swiper-container" id="swiper-container1">
    <div class="swiper-wrapper">
        <div class="swiper-slide">
            <a href="#"><img src="images/slide1.jpg" alt=""></a>
        </div>
        <div class="swiper-slide">
            <a href="#"><img src="images/slide2.jpg" alt=""></a>
        </div>
    </div>
    <!-- 如果需要分页器 -->
    <div class="swiper-pagination"></div>
</div>
<div class="mui-content">
    <ul class="mui-row myGroup">
        <li class="mui-col-xs-3">
            <a href="#">
                <span class="icon icon-clean"></span>
                <div class="title">家电清洗</div>
            </a>
        </li>
        <li class="mui-col-xs-3">
            <a href="#">
                <span class="icon icon-repair"></span>
                <div class="title">家电维修</div>
            </a>
        </li>
        <li class="mui-col-xs-3">
            <a href="#">
                <span class="icon icon-install"></span>
                <div class="title">家电安装</div>
            </a>
        </li>
        <li class="mui-col-xs-3">
            <a href="#">
                <span class="icon icon-sofa"></span>
                <div class="title">沙发翻新</div>
            </a>
        </li>
        <li class="mui-col-xs-3">
            <a href="#">
                <span class="icon icon-pipe"></span>
                <div class="title">管道疏通</div>
            </a>
        </li>
        <li class="mui-col-xs-3">
            <a href="#">
                <span class="icon icon-unlock"></span>
                <div class="title">开锁换锁</div>
            </a>
        </li>
        <li class="mui-col-xs-3">
            <a href="#">
                <span class="icon icon-door"></span>
                <div class="title">家具门窗</div>
            </a>
        </li>
        <li class="mui-col-xs-3">
            <a href="#">
                <span class="icon icon-electric"></span>
                <div class="title">水电维修</div>
            </a>
        </li>
    </ul>
</div>
<section class="content-box">
    <div class="find-new-inner">
        <span class="icon tit"></span>
        <span class="arrow-find"><span class="icon icon-find-inner"></span></span>
        <div class="swiper-container" id="swiper-container2">
            <div class="swiper-wrapper">
                <#list newsList as news>
                <div class="swiper-slide">
                    <a href="#">${news.title}</a>
                </div>
                </#list>
            </div>
        </div>
    </div>
</section>
<section class="content-box">
    <div class="title-main">
        <div class="title-main-inner"></div>
    </div>
    <div class="more">
        <a href="#" class="more-inner">更多优惠</a>
    </div>
    <div class="product-list swiper-container" id="swiper-container3" data-swiper="[object Object]">
        <ul class="product-list-inner swiper-wrapper">

            <#list discountList as discount>
            <li class="li-inner swiper-slide">
                <div class="img"><img src="images/${discount.pic}"></div>
                <div class="p-detail">
                    <p class="name">${discount.name}</p>
                    <p class="price-inner"><span class="rmb-icon">￥</span> <span class="price-now">${discount.cutprice}</span> <span class="price-original">￥${discount.price}</span> </p>
                </div>
            </li>
            </#list>

        </ul>
    </div>
</section>
<section class="content-box box-hot">
    <div class="title-main">
        <div class="title-main-inner"></div>
    </div>
    <div class="more">
        <a href="#" class="more-inner">更多推荐</a>
    </div>
    <ul class="mui-table-view">
        <#list hotList as hot>
        <li class="mui-table-view-cell mui-media">
            <a href="javascript:;" class="">
                <img class="mui-media-object mui-pull-left" src="images/${hot.pic}">
                <div class="mui-media-body">
                    ${hot.name}
                    <p class="mui-ellipsis">${hot.remark!"......"}</p>
                    <p class="price-inner"> <span class="rmb-icon">￥</span> <span class="price-now">${hot.price}</span></p>
                </div>
            </a>
        </li>
        </#list>
    </ul>
</section>
<section class="content-box box-join">
    <div class="title-main">
        <div class="title-main-inner"></div>
    </div>
    <div class="join-us-detail">
        <div class="detail-inner">
            <div class="img master-img"><img class="" src="images/master.png"></div>
            <div class="con">
                家电维修、家电清洗、管道疏通、水电维修、沙发翻新、开锁换锁、家具门窗......一切跟家庭有关的服务我们都期待您的加入！
            </div>
            <div class="btn-inner">
                <a href="#" class="mui-btn mui-btn-warning mui-btn-block myBtn">立即加入</a>
            </div>
        </div>
    </div>
</section>
<script src="js/mui.min.js"></script>
<script src="js/swiper.min.js"></script>
<script src="js/common.js"></script>
<script>
    var mySwiper1 = new Swiper('#swiper-container1', {

        // 如果需要分页器
        pagination: {
            el: '.swiper-pagination',
        },
        autoplay:true
    });
    var mySwiper2 = new Swiper('#swiper-container2', {
        direction: 'vertical',
        loop: true,
        autoplay:true
    });
    var mySwiper3 = new Swiper('#swiper-container3', {
        slidesPerView: 2.5,
        spaceBetween: 0
    });
</script>
</body>

</html>