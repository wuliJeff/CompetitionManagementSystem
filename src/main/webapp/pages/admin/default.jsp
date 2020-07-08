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
    <title>我的赛事</title>

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
    <ul class="nav menu">
        <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> 主页 </a></li>
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
            <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span>我的赛事</a></li>
        </ol>
    </div><!--/.row-->

    <div class="row">
        <div class="col-lg-12">
            <div class="row">
                <div class="col-lg-12" style="margin-top: 2%;">

                        <div class="input-group">
                            <input type="text" name="competitionNameSearch" id="competitionNameSearch" class="form-control input-group-sm" style="width: auto;"
                                   placeholder="参赛者id"/>
                            <button id="search" type="submit" name="search" class="btn btn-primary btn-outline-primary">
                                <span class="glyphicon glyphicon-search"></span> 查询
                            </button>
                        </div>


                    <table class="table" id="myTable"
                           style="margin-top: 2%; margin-bottom: 0; width: 90%; font-size: 16px; text-align: center;">
                        <tr style="font-size: 18px; font-family: 'Microsoft YaHei UI';">
                            <td><b>赛事名称</b></td>
                            <td><b>赛事类型</b></td>
                            <td><b>参赛人数</b></td>
                            <td><b>参赛时长</b></td>
                            <td><b>比赛开始时间</b></td>
                            <td><b>比赛结束时间</b></td>
                            <td><b>操作</b></td>
                        </tr>
                    </table>
                    <table class="table" id="page"
                           style="margin-top: 0; width: 90%; font-size: 16px; text-align: center;">
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
            deleteCookie();
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
                        var id=result.data[i].competitionId;
                        if(result.data[i].type=="1"){
                            var eventType="团队赛";
                        }else{
                            var eventType="个人赛";
                        }
                        $("#myTable").append("<tr> " +
                            "<td>"+ result.data[i].competitionName+"</td>" +
                            "<td>"+ eventType +"</td>" +
                            "<td>"+ result.data[i].num +"</td>" +
                            "<td>"+  result.data[i].duration +"</td>" +
                            "<td>"+ result.data[i].startCompetition +"</td>" +
                            "<td>"+ result.data[i].endCompetition +"</td>" +
                            "<td>"+ '<input type="text" name="competitionId" style="display: none" value="'+id+'">' +
                            '<input type="text" name="competitionName" style="display: none" value="'+ result.data[i].competitionName+'">' +
                            '<input type="button" name="seachButton" value="查看详情" class="btn-primary">'+ "</td>" +

                            "</tr>"
                    )
                    }
                } else if (result.code == 404) {
                }

            }
        });

        return false;
    }
    // 清除所有的cookie
    function deleteCookie() {
        var cookies = document.cookie.split(";");
        for (var i = 0; i < cookies.length; i++) {
            var cookie = cookies[i];
            var eqPos = cookie.indexOf("=");
            var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
            document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT; path=/";
        }
        if(cookies.length > 0)
        {
            for (var i = 0; i < cookies.length; i++) {
                var cookie = cookies[i];
                var eqPos = cookie.indexOf("=");
                var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
                var domain = location.host.substr(location.host.indexOf('.'));
                document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT; path=/; domain=" + domain;
            }
        }
    }

    //模糊查询
    $("#search").click(function () {
        $("#myTable tr:gt(0)").empty();
        $("#myTable tr").not(':eq(0)').empty();
        alert($("#competitionNameSearch").val())
        $.ajax({
            url: "http://120.25.255.183:8088/Curriculum/Competition/" + "allCompetition",
            type: "GET",
            data: {
                competitionName: $("#competitionNameSearch").val(),
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
                        var id=result.data[i].competitionId;
                        if(result.data[i].type=="1"){
                            var eventType="团队赛";
                        }else{
                            var eventType="个人赛";
                        }

                        $("#myTable").append("<tr> " +
                            "<td>"+ result.data[i].competitionName+"</td>" +
                            "<td>"+ eventType +"</td>" +
                            "<td>"+ result.data[i].num +"</td>" +
                            "<td>"+  result.data[i].duration +"</td>" +
                            "<td>"+ result.data[i].startCompetition +"</td>" +
                            "<td>"+ result.data[i].endCompetition +"</td>" +
                            "<td>"+ '<input type="text" name="competitionId" style="display: none" value="'+id+'">' +
                            '<input type="text" name="competitionName" style="display: none" value="'+ result.data[i].competitionName+'">' +
                            '<input type="button" name="seachButton" value="查看详情" class="btn-primary">'+ "</td>" +

                            "</tr>"
                        )
                    }
                } else if (result.code == 404) {
                }
console.log($("#competitionNameSearch").val())
            }
        })
    });


    //查看单个竞赛
    $("#myTable").on("click", "input[name='seachButton']", function() {
        var name=$(this).parent().parent().find("input[name='competitionName']").val();
        var id=$(this).parent().parent().find("input[name='competitionId']").val();

        $.ajax({
            url: 'http://120.25.255.183:8088/Curriculum/Competition/findCompetition/'+id,
            type: "get",
            headers: {
                "TOKEN": $.cookie("TOKEN")
            },
            dataType: "json",
            success: function (result) {
                if (result.code == 1001) {
                    $.cookie("eventType",result.data[0].type)
                    $.cookie("eventId",result.data[0].competitionId)
                    $.cookie("eventName",result.data[0].competitionName)
                    $.cookie("event",result.data[0])
                    console.log(result.data[0])
                    sessionStorage.setItem("event",result.data[0])
                    alert(id+name);
                    window.location.href="detail.jsp";
                }
            },
            error: function () {
                alert("查询失败");
            }
        });
        return;
    });

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
