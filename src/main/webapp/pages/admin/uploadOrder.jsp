<%--
  Created by IntelliJ IDEA.
  User: Jeff
  Date: 2020/7/6
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*, com.cms.entity.*,  javax.servlet.http.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>上传赛场秩序册</title>

    <link href="../../assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../assets/css/datepicker3.css" rel="stylesheet">
    <link href="../../assets/css/styles.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="../../assets/js/html5shiv.min.js"></script>
    <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->
    <!-- 富文本编辑器 -->
    <link href="../../assets/js/umeditor/utf8-jsp/themes/default/css/umeditor.min.css" rel="stylesheet">
    <script type="text/javascript" src="../../assets/js/umeditor/utf8-jsp/third-party/jquery.min.js"></script>
    <script type="text/javascript" src="../../assets/js/umeditor/utf8-jsp/umeditor.config.js"></script>
    <script type="text/javascript" src="../../assets/js/umeditor/utf8-jsp/umeditor.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="../../assets/js/umeditor/utf8-jsp/lang/zh-cn/zh-cn.js"></script>
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
            <div id="noLogin"><a href="../../index.jsp">
                <ul class="user-menu">
                    <li class="dropdown pull-right">
                        <a href="../../index.jsp">
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
    <ul class="nav menu">
        <li><a href="default.jsp"><span class="glyphicon glyphicon-chevron-left"></span> 返回我的赛事 </a></li>
        <li><a href="detail.jsp"><span class="glyphicon glyphicon-leaf"></span> 赛事详情 </a></li>
        <li><a href="arrangePlace.jsp"><span class="glyphicon glyphicon-tags"></span> 赛场管理 </a></li>
        <li class="active"><a href="#"><span class="glyphicon glyphicon-upload"></span> 上传赛场秩序册 </a></li>
        <li><a href="searchLicense.jsp"><span class="glyphicon glyphicon-file"></span> 查询参赛证 </a></li>
        <li><a href="analysisGrade.jsp"><span class="glyphicon glyphicon-stats"></span> 赛绩分析 </a></li>
        <li role="presentation" class="divider"></li>
    </ul>
    <div class="logout">
        <ul class="nav menu">
            <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> 注销</a></li>
        </ul>
    </div>
    <div id="login">
        <ul class="nav menu">
            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
        </ul>
    </div>
    <div class="attribution">write by Jeff</div>
</div><!--/.sidebar-->

<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
    <div class="row">
        <ol class="breadcrumb">
            <li><a href="default.jsp"><span class="glyphicon glyphicon-home"></span></a></li>
            <li class="active"><a href="#"><span class="glyphicon glyphicon-upload"></span> 上传赛场秩序册 </a></li>
        </ol>
    </div><!--/.row-->

    <div class="row">
        <div class="col-lg-12" style="margin-top: 2%;">
            <form id="searchInfo" action="" method="post">
                <div>
                    <input type="text" name="userId" class="form-control input-group-sm" placeholder="标题"/>
                    <div class="clear" style="margin-top: 2%; margin-bottom: 2%;"></div>
                    <!--style给定宽度可以影响编辑器的最终宽度-->
                    <script type="text/plain" id="editor" style="width: 100%; height: 400px;">
                        <p>这里我可以写一些输入提示</p>
                    </script>
                    <!-- 实例化编辑器 -->
                    <script type="text/javascript">
                        var um = UM.getEditor('editor');
                    </script>
                    <div class="clear"></div>
                    <button type="submit" name="submit" class="btn btn-primary btn-outline-primary">提交</button>
                </div>
            </form>
        </div>
    </div><!--/.row-->

    <div class="copyrights">write by ...小组</div>
</div><!--/.main-->

<script src="../../assets/js/jquery-1.11.1.min.js"></script>
<script src="../../assets/js/bootstrap.min.js"></script>
<script src="../../assets/js/chart.min.js"></script>
<script src="../../assets/js/chart-data.js"></script>
<script src="../../assets/js/easypiechart.js"></script>
<script src="../../assets/js/easypiechart-data.js"></script>
<script src="../../assets/js/bootstrap-datepicker.js"></script>
<script src="../../assets/js/jquery.cookie.js"></script>
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
        window.location.href = "../index.jsp";
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