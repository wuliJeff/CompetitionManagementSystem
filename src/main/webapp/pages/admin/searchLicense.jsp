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
    <div class="attribution">Copyright &copy; 2020 陈欢成小组</div>
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
            <div class="input-group">
                <input type="text" name="competitorIdSearch" id="competitorIdSearch"
                       class="form-control input-group-sm" style="width: auto;"
                       placeholder="参赛者id"/>
                <button id="search" type="button" name="search" class="btn btn-primary btn-outline-primary" data-loading-text="查询中...">
                    <span class="glyphicon glyphicon-search"></span> 查询
                </button>
            </div>
            <div id="myLicense" class="row"
                 style="margin-top: 2%;width: 90%; margin-left: 2%; background-color: #ffffff;">
                <table class="table" id="myTable"
                       style=" margin-bottom: 0; width: 100%; font-size: 16px;">
                    <tr>
                        <td colspan="3"><b>赛事编号：<span id="competitionId"></span></b></td>
                    </tr>
                    <tr style="font-size: 18px; font-family: 'Microsoft YaHei UI'; text-align: center;">
                        <td colspan="3"><h2><b><span id="competitionName"></span><br/>参赛证</b></h2></td>
                    </tr>
                    <tr>
                        <td style="width: 33%;">
                            <b style="margin-left: 50px;">
                                参赛者编号：<span id="competitorId"></span>
                            </b>
                        </td>
                        <td style="width: 33%;">
                            <b style="margin-left: 50px;">姓名：<span id="competitorName"></span></b>
                        </td>
                        <td style="width: 33%;"><b style="margin-left: 50px;"><span id="teamName"></span></b></td>
                    </tr>
                    <tr>
                        <td style="width: 33%;">
                            <b style="margin-left: 50px;">
                                赛事地点：<span id="school"></span>
                            </b>
                        </td>
                        <td style="width: 33%;">
                            <b style="margin-left: 50px;">赛场：<span id="pname"></span><span id="pnum"></span></b>
                        </td>
                        <td style="width: 33%;">
                            <b style="margin-left: 50px;">座位号：<span id="seat"></span></b>
                        </td>
                    </tr>
                    <tr style="text-align: center;">
                        <td colspan="3">
                            <b>赛场秩序册</b>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" style="width: 100%; word-break:break-all;">
                            <div id="order"></div>
                        </td>
                    </tr>
                </table>
            </div><!--/.row-->
            <br/>
            <button id="printLicense" class="btn btn-default active" style="margin-left: 2%;"><span
                    class="glyphicon glyphicon-print"></span> 点击打印
            </button>
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
<script src="../../assets/js/html2canvas-0.4.1.js"></script>
<script src="../../assets/js/canvg2.js"></script>
<script src="../../assets/js/html2canvas-0.4.1.js"></script>
<script src="../../assets/js/jspdf.min.js"></script>
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

    // 清除所有的cookie
    function deleteCookie() {
        var cookies = document.cookie.split(";");
        for (var i = 0; i < cookies.length; i++) {
            var cookie = cookies[i];
            var eqPos = cookie.indexOf("=");
            var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
            document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT; path=/";
        }
        if (cookies.length > 0) {
            for (var i = 0; i < cookies.length; i++) {
                var cookie = cookies[i];
                var eqPos = cookie.indexOf("=");
                var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
                var domain = location.host.substr(location.host.indexOf('.'));
                document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT; path=/; domain=" + domain;
            }
        }
    }

    $(".logout").click(function () {
        sessionStorage.clear();
        deleteCookie();
        window.location.href = "../../index.jsp";
    })

    // 根据id获取参赛证部分内容
    function getLicense(competitorId, cid) {
        $.ajax({
            url: "http://localhost:8080/CompetitionManagementSystem/License/getLicense",
            type: "POST",
            data: {competitorId : competitorId, cid: cid},
            dataType: "json",
            success: function (result) {
                console.log(result)
                $("#competitionId").html(result.data[0].cid);
                $("#competitionName").html(result.data[0].cname);
                $("#competitorId").html(result.data[0].competitorId);
                $("#competitorName").html(result.data[0].name);
                $("#school").html(result.data[0].school);
                if (result.data[0].teamName != null && result.data[0].teamName !== ""){
                    $("#teamName").html("团队名："+result.data[0].teamName);
                }
                getSeat(result.data[0].cid, result.data[0].competitorId);
                getPlace(result.data[0].pid);
                getOrder(result.data[0].cid);
            }
        });
    }
    // 查询座位
    function getSeat(cid, competitorId) {
        $.ajax({
            url: "http://localhost:8080/CompetitionManagementSystem/Schedule/findSeat",
            type: "POST",
            data: {cid : cid, competitorId : competitorId},
            dataType: "json",
            success: function (result) {
                console.log(result)
                $("#seat").html(result.data[0].seat);
            }
        });
    }

    // 通过pid获取当前竞赛的地点
    function getPlace(pid) {
        $.ajax({
            url: "http://localhost:8080/CompetitionManagementSystem/Place/getPlaceByPid",
            type: "POST",
            data: {pid : pid},
            dataType: "json",
            success: function (result) {
                console.log(result)
                $("#pname").html(result.data[0].pname);
                $("#pnum").html(result.data[0].pnum);
            }
        });
    }

    function getOrder(cid) {
        $.ajax({
            url: "http://localhost:8080/CompetitionManagementSystem/CompetitionOrder/getOrderByCid",
            type: "POST",
            data: {cid : cid},
            dataType: "json",
            success: function (result) {
                console.log(result)
                $("#order").html(result.data[0].detail);
            }
        });
    }

    $("#search").click(function () {
        var event = $.cookie("event");
        event = JSON.parse(event)
        var competitorId = document.getElementById("competitorIdSearch");
        var cid = event.competitionId;
        console.log(competitorId)
        console.log(cid)
        $(this).button('loading').delay(3000).queue(function() {
            $(this).button('reset');
            $(this).dequeue();
        });
        getLicense(competitorId.value, cid);
    })

    $(function () {
        $("#printLicense").click(function () {
            var targetDom = $("#myLicense");
            //把需要导出的pdf内容clone一份，这样对它进行转换、微调等操作时才不会影响原来界面
            var copyDom = targetDom.clone();
            //新的div宽高跟原来一样，高度设置成自适应，这样才能完整显示节点中的所有内容（比如说表格滚动条中的内容）
            copyDom.width(targetDom.width() + "px");
            copyDom.height(targetDom.height() + "px");

            $('#myLicense').append(copyDom);//ps:这里一定要先把copyDom append到body下，然后再进行后续的glyphicons2canvas处理，不然会导致图标为空

            svg2canvas(copyDom);
            html2canvas(copyDom, {
                onrendered: function (canvas) {
                    var imgData = canvas.toDataURL('image/jpeg', 1.0);
                    var img = new Image();
                    img.src = imgData;
                    //根据图片的尺寸设置pdf的规格，要在图片加载成功时执行，之所以要*0.225是因为比例问题
                    img.onload = function () {
                        //方向默认竖直，尺寸ponits，格式a4[595.28,841.89]
                        var doc = new jsPDF('', 'pt', 'a4');
                        //addImage后两个参数控制添加图片的尺寸，此处将页面高度按照a4纸宽高比列进行压缩
                        doc.addImage(imgData, 'JPEG', 20, 70, 555.28, 592.28 / canvas.width * canvas.height);
                        //根据下载保存成不同的文件名
                        doc.save('参赛证.pdf');
                    };
                    //删除复制出来的div
                    copyDom.remove();
                },
                background: "#ffffff",
                //这里给生成的图片默认背景，不然的话，如果你的html根节点没设置背景的话，会用黑色填充。
                allowTaint: true //避免一些不识别的图片干扰，默认为false，遇到不识别的图片干扰则会停止处理html2canvas
            });
        });
    });

    function svg2canvas(targetElem) {
        var svgElem = targetElem.find('svg');
        svgElem.each(function (index, node) {
            var parentNode = node.parentNode;
            //由于现在的IE不支持直接对svg标签node取内容，所以需要在当前标签外面套一层div，通过外层div的innerHTML属性来获取
            var tempNode = document.createElement('div');
            tempNode.appendChild(node);
            var svg = tempNode.innerHTML;
            var canvas = document.createElement('canvas');
            //转换
            canvg(canvas, svg);
            parentNode.appendChild(canvas);
        });
    }
</script>

</body>

</html>