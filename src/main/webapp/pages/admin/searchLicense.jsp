<%--
  Created by IntelliJ IDEA.
  User: Jeff
  Date: 2020/7/7
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*, com.cms.entity.*,  javax.servlet.http.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>查询参赛证</title>

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
        <li><a href="uploadOrder.jsp"><span class="glyphicon glyphicon-upload"></span> 上传赛场秩序册 </a></li>
        <li class="active"><a href="#"><span class="glyphicon glyphicon-file"></span> 查询参赛证 </a></li>
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
            <li><a href="../../index.jsp"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
        </ul>
    </div>
    <div class="attribution">Copyright &copy; 2020 陈欢成小组 </div>
</div><!--/.sidebar-->

<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
    <div class="row">
        <ol class="breadcrumb">
            <li><a href="default.jsp"><span class="glyphicon glyphicon-home"></span></a></li>
            <li class="active"><a href="#"><span class="glyphicon glyphicon-file"></span> 查询参赛证 </a></li>
        </ol>
    </div><!--/.row-->

    <div class="row">
        <div class="col-lg-12">
            <div id="myLicense" class="row">
                <p>搜索框位置</p>
                <p>参赛证信息位置</p>
            </div><!--/.row-->
        </div>
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
                    sessionStorage.setItem("user", result.data);
                } else if (result.code == 404) {

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
        $.cookie().clear();
        window.location.href="../../index.jsp";
    })
</script>

</body>

</html>