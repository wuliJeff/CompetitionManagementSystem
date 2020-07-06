<%--
  Created by IntelliJ IDEA.
  User: thrity
  Date: 2020/7/6
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
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
                    <a class="" href="viewEvents.jsp">
                        <span class="glyphicon glyphicon-paperclip"></span> 查看赛事
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
            <div class="row">
                <div class="col-lg-12" style="margin-top: 2%;">
                    <form id="searchInfo" action="" method="post">
                        <div class="input-group">
                            <input type="text" name="userId" class="form-control input-group-sm" style="width: auto;"
                                   placeholder="参赛者id"/>
                            <button type="submit" name="search" class="btn btn-primary btn-outline-primary">
                                <span class="glyphicon glyphicon-search"></span> 查询
                            </button>
                        </div>
                    </form>

                    <table class="table" id="myTable"
                           style="margin-top: 2%; margin-bottom: 0; width: 80%; font-size: 16px; text-align: center;">
                        <tr style="font-size: 18px; font-family: 'Microsoft YaHei UI';">
                            <td><b>赛事名称</b></td>
                            <td><b>赛场号</b></td>
                            <td><b>参赛证号</b></td>
                            <td><b>座位号</b></td>
                            <td><b>成绩</b></td>
                            <td><b>排名</b></td>
                        </tr>
<%--                        <tr>--%>
<%--                            <td>广西民族大学程序设计竞赛</td>--%>
<%--                            <td>1</td>--%>
<%--                            <td>117583010144</td>--%>
<%--                            <td>1</td>--%>
<%--                            <td>80</td>--%>
<%--                            <td>3</td>--%>
<%--                        </tr>--%>
                    </table>
                    <table class="table" id="page"
                           style="margin-top: 0; width: 80%; font-size: 16px; text-align: center;">

                        <tr>
                            <td>
                                <div style="float: right; font-size: 14px;">
                                    <button name="last" class="btn btn-primary btn-outline-primary">
                                        <span class="glyphicon glyphicon-chevron-left"></span>上一页
                                    </button>
                                    <input type="text" style="width: 40px;" readonly="readonly" value="1">
                                    <button name="next" class="btn btn-primary btn-outline-primary">
                                        下一页<span class="glyphicon glyphicon-chevron-right"></span>
                                    </button>
                                </div>
                            </td>
                        </tr>
                    </table>

                </div>
            </div><!--/.row-->

        </div>
    </div><!--/.row-->

    <div class="copyrights">write by ...小组</div>

    <div class="row">

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
<script>
    function loan() {
        console.log(sessionStorage.getItem("username"))
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
        $(".logout").click(function () {
            sessionStorage.clear();
            $.cookie().clear();
            window.location.href = "../../index.jsp";
        })

        $.ajax({
            url: "http://120.25.255.183:8088/Curriculum/Competition/UserCompetition/" + sessionStorage.getItem("userid"),
            type: "GET",
            data: {
                page: 1,
                pagesize: 10
            },
            headers: {
                "TOKEN": $.cookie("TOKEN")
            },
            dataType: "json",
            success: function (result) {
                if (result.code == 0) {
                    $.cookie("eventList", result.data)
                    console.log(result.data)
                    for (var i = 0; i < result.data.length; i++)
                    {
                        $("#myTable").append("<tr> " +
                            "<td>"+ result.data[i].competitionId+"</td>" +
                            "<td>"+  result.data[i].competitionName+"</td>" +
                            "<td>"+ result.data[i].duration +"</td>" +
                            "<td>"+  result.data[i].enrollStartTime+"</td>" +
                            "<td>"+ result.data[i].enrollEndTime +"</td>" +
                            "<td>"+ result.data[i].endCompetition +"</td></tr>"
                    )
                    }
                } else if (result.code == 404) {
                }

            }
        });
        // var json=eval($.cookie("eventList"));
        // $.each(json, function (index, item) {
        //     //循环获取数据
        //     var competitionId =item.competitionId;
        //     var competitionName =item.competitionName;
        //     var duration =item.duration;
        //     var endCompetition =item.endCompetition;
        //     var enrollEndTime =item.enrollEndTime;
        //     var enrollStartTime =item.enrollStartTime;
        //     var isEnrolled =item.isEnrolled;
        //     var num =item.num;
        //     var startCompetition =item.startCompetition;
        //     var teamNum =item.teamNum;
        //     var type =item.type;
        //     var userid =item.userid;
        //
        // }
        return false;
    }

    window.onload = loan;

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
