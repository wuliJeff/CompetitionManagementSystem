<%@ page language="java" import="java.util.*, com.cms.entity.*,  javax.servlet.http.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>主页</title>

    <link href="../../assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../assets/css/datepicker3.css" rel="stylesheet">
    <link href="../../assets/css/styles.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="../../assets/js/html5shiv.min.js"></script>
    <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><span>赛程管理系统</span></a>
            <div id="loginSuccess">
                <ul class="user-menu">
                    <li class="dropdown pull-right">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <span class="glyphicon glyphicon-user"></span> <span class="caret"></span>
                            <span id="userName"></span>
                        </a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#"><span class="glyphicon glyphicon-user"></span> 个人资料</a></li>
                            <li class="logout"><a href="#"><span class="glyphicon glyphicon-log-out"></span> 注销</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <div id="noLogin"><a href="../index.jsp">
                <ul class="user-menu">
                    <li class="dropdown pull-right">

                        <a href="../index.jsp">
                            <span class="glyphicon glyphicon-user"></span> 登录
                        </a>
                    </li>
                </ul>

            </a>
            </div>
        </div>
    </div><!-- /.container-fluid -->
</nav>

<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
    <form role="search">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Search">
        </div>
    </form>
    <ul class="nav menu">
        <li class="active"><a href="default.jsp"><span class="glyphicon glyphicon-dashboard"></span> 主页 </a></li>
        <li class="parent ">
            <a href="#">
                <span class="glyphicon glyphicon-list"></span> 赛程管理
                <span data-toggle="collapse" href="#sub-item-1" class="icon pull-right">
                    <em class="glyphicon  glyphicon-chevron-down glyphicon-chevron-up"></em>
                </span>
            </a>
            <ul class="children collapse" id="sub-item-1">
                <li>
                    <a class="" href="#">
                        <span class="glyphicon glyphicon-paperclip"></span> 发布赛事
                    </a>
                </li>
                <li>
                    <a class="" href="#">
                        <span class="glyphicon glyphicon-paperclip"></span> 查询赛场
                    </a>
                </li>
                <li>
                    <a class="" href="#">
                        <span class="glyphicon glyphicon-paperclip"></span> 安排赛场
                    </a>
                </li>
                <li>
                    <a class="" href="#">
                        <span class="glyphicon glyphicon-paperclip"></span> 上传赛场秩序册
                    </a>
                </li>
            </ul>
        </li>

        <li class="parent ">
            <a href="#">
                <span class="glyphicon glyphicon-list"></span> 成绩管理
                <span data-toggle="collapse" href="#sub-item-2" class="icon pull-right">
                    <em class="glyphicon glyphicon-chevron-down glyphicon-chevron-up"></em>
                </span>
            </a>
            <ul class="children collapse" id="sub-item-2">
                <li>
                    <a class="" href="#">
                        <span class="glyphicon glyphicon-paperclip"></span> 发布成绩
                    </a>
                </li>
                <li>
                    <a class="" href="#">
                        <span class="glyphicon glyphicon-paperclip"></span> 成绩查询
                    </a>
                </li>
                <li>
                    <a class="" href="#">
                        <span class="glyphicon glyphicon-paperclip"></span> 赛绩分析
                    </a>
                </li>
            </ul>
        </li>
        <li role="presentation" class="divider"></li>
        <div class="logout">
            <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> 注销</a></li>
        </div>
        <div id="login">
            <li><a href="pages/login.jsp"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
        </div>
    </ul>
    <div class="attribution">write by Jeff</div>
</div><!--/.sidebar-->

<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
    <div class="row">
        <ol class="breadcrumb">
            <li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
            <li class="active">主页</li>
        </ol>
    </div><!--/.row-->

    <div class="row">
        <div class="col-lg-12">
            guangximinzudaxue
        </div>
    </div><!--/.row-->

    <div class="copyrights">write by ...小组</div>

    <div class="row">

        <div id="container" style="width: 100%; height: 600px; margin: 0;"></div>
    </div><!--/.row-->

    <div class="row">

    </div><!--/.row-->

    <div class="row">

    </div><!--/.row-->

    <div class="row">

    </div><!--/.row-->
</div><!--/.main-->

<script src="../../assets/js/jquery-1.11.1.min.js"></script>
<script src="../../assets/js/bootstrap.min.js"></script>
<script src="../../assets/js/chart.min.js"></script>
<script src="../../assets/js/chart-data.js"></script>
<script src="../../assets/js/easypiechart.js"></script>
<script src="../../assets/js/easypiechart-data.js"></script>
<script src="../../assets/js/bootstrap-datepicker.js"></script>
<script src="../../assets/js/jquery.cookie.js"></script>

<!-- 饼图 -->
<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts.min.js"></script>
<script type="text/javascript">
    var dom = document.getElementById("container");
    var myChart = echarts.init(dom);
    var app = {};

    app.title = '环形图';

    var option = {
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b}: {c} ({d}%)"
        },
        color:['#93D8A9','#FFB99D','#AF7DCC','#FFD83D','#bbe2e8'],
        legend: {
            orient: 'vertical',
            x: '1000px',
            y: '200px',
            data: ['一等奖', '二等奖', '三等奖', '特等奖', '参与奖']
        },
        series: [{
            name: '访问来源',
            type: 'pie',
            radius: ['30%', '70%'],
            avoidLabelOverlap: false,
            label: {
                normal: {
                    show: false,
                    position: 'center'
                },
                emphasis: {
                    show: true,
                    textStyle: {
                        fontSize: '30',
                        fontWeight: 'bold'
                    }
                }
            },
            labelLine: {
                normal: {
                    show: false
                }
            },
            data: [{
                value: 335,
                name: '一等奖'
            },
                {
                    value: 310,
                    name: '二等奖'
                },
                {
                    value: 234,
                    name: '三等奖'
                },
                {
                    value: 135,
                    name: '特等奖'
                },
                {
                    value: 1548,
                    name: '参与等奖'
                }
            ]
        }]
    };
    if(option && typeof option === "object") {
        myChart.setOption(option, true);
    }
</script>

<script>
    function loan() {
        $.ajax({
            url: "http://120.25.255.183:8088/Curriculum/User/getUser/" + sessionStorage.getItem('userid'),
            type: "GET",
            headers: {
                "TOKEN": sessionStorage.getItem("TOKEN")
            },
            dataType: "json",
            success: function (result) {
                if (result.code == 0) {
                    sessionStorage.setItem("type", result.type);
                    sessionStorage.setItem("user", result.data);
                } else if (result.code == 404) {
                    alert("未登录")
                }
            }
        });

        if (sessionStorage.getItem("username") != null) {
            $("#loginSuccess").show()
            $("#noLogin").hide()
            $("#login").hide()
            $(".logout").show()
            $("#userName").html(sessionStorage.getItem("username"));
        } else {
            $("#loginSuccess").hide()
            $("#noLogin").show()
            $(".login").show()
            $("#logout").hide()
        }

    }
    window.onload = loan;

    $(".logout").click(function () {
        sessionStorage.clear();
        window.location.href="../index.jsp";
    })



    $('#calendar').datepicker({});
    !function ($) {
        $(document).on("click", "ul.nav li.parent > a > span.icon", function () {
            $(this).find('em:first').toggleClass("glyphicon-chevron-down");
        });
        $(".sidebar span.icon").find('em:first').addClass("glyphicon-chevron-up");
    }(window.jQuery);

    $(window).on('resize', function () {
        if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
    })
    $(window).on('resize', function () {
        if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
    })
</script>
</body>

</html>