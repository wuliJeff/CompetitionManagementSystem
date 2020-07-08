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
    <title>我的参赛证</title>

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
        <li><a href="analysisGrade.jsp"><span class="glyphicon glyphicon-stats"></span> 赛绩分析 </a></li>
        <li class="active"><a href="#"><span class="glyphicon glyphicon-file"></span> 我的参赛证 </a></li>
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
            <li class="active"><a href="#"><span class="glyphicon glyphicon-file"></span> 我的参赛证 </a></li>
        </ol>
    </div><!--/.row-->

    <div class="row">
        <div class="col-lg-12">
            <div id="myLicense" class="row" style="margin-top: 2%;width: 90%; margin-left: 2%; background-color: #ffffff;">
                <table class="table" id="myTable"
                       style=" margin-bottom: 0; width: 100%; font-size: 16px;">
                    <tr>
                        <td colspan="3"><b>赛事编号：202006180303</b></td>
                    </tr>
                    <tr style="font-size: 18px; font-family: 'Microsoft YaHei UI'; text-align: center;">
                        <td colspan="3"><h2><b>广西大学生程序设计竞赛(GXCPC)<br/>参赛证</b></h2></td>
                    </tr>
                    <tr>
                        <td style="width: 33%;">
                            <b style="margin-left: 50px;">
                                参赛者编号：117583010102
                            </b>
                        </td>
                        <td style="width: 33%;">
                            <b style="margin-left: 50px;">姓名：陈欢成</b>
                        </td>
                        <td style="width: 33%;"></td>
                    </tr>
                    <tr>
                        <td style="width: 33%;">
                            <b style="margin-left: 50px;">
                                赛事地点：广西民族大学
                            </b>
                        </td>
                        <td style="width: 33%;">
                            <b style="margin-left: 50px;">赛场：1</b>
                        </td>
                        <td style="width: 33%;">
                            <b style="margin-left: 50px;">座位号：1</b>
                        </td>
                    </tr>
                    <tr style="text-align: center;">
                        <td colspan="3">
                            <b>赛场秩序册</b>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3">
                            竞赛细则<br/>
                            1、选手在参赛时携带个人证件。<br/>
                            2、竞赛以上机为比赛方式。<br/>
                            3、竞赛中至少命题6题，至多命题9题，上机比赛时间为4个小时，中间不休息。<br/>
                            4、参赛选手可以携带诸如书籍、字典、手册、程序清单等文字性参考资料。<br/>
                            5、参赛选手不能携带任何可用计算机处理的软件或数据(不允许任何私人携带的磁盘或计算器)。<br/>
                            6、参赛选手不能携带任何类型的通讯工具，包括无线电接收器、移动电话等。<br/>
                            7、选手未解决全部题目不得提前离场<br/>
                            8、竞赛的预定时间为4小时，但当竞赛进行一定时间后，竞赛裁判可以因为出现不可预见的事件而调整比赛时间长度，一旦比赛时间长度发生改变，将会以及时并且统一的方式通告所有参赛选手。<br/>
                            9、当参赛选手出现妨碍比赛正常进行的行为时，诸如擅自移动赛场中的设备，未经授权修改比赛软硬件，干扰他人比赛等，都将会被竞赛裁判剥夺参赛资格。<br/>
                            <br/>
                            竞赛评分<br/>
                            1、正确解答中等数量以上试题的队伍会根据解题数目进行排名，解题数在中等数量以下的队伍只发布解题数量，不进行排名。<br/>
                            2、在进行排名时，如果多人解题数量相同，则根据总用时加上惩罚时间进行排名。<br/>
                            总用时和惩罚时间由每道解答正确的试题的用时之和加上惩罚时间之和而成。每道试题用时将从竞赛开始到试题解答被判定为正确为止，期间每一次错误的运行将被加罚20分钟时间。未正确解答的试题不记时，对应的错误运行也不计入惩罚时间。<br/>
                            3、选手在比赛期间能看到排名表和他人的成绩、解决的问题。<br/>
                            4、比赛中每一道题目对应一种颜色的气球(颜色的对应在试题中注明)。在选手正确解答出某道题目后，工作人员将会把对应颜色的气球插到此同学的位置旁。<br/>
                            5、比赛结束前一个小时内，将不再为正确的解答摆放气球。<br/>
                            6、请注意竞赛裁判决定解答提交是否正确需要一定的时间。<br/>
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
    // 注销
    $(".logout").click(function () {
        sessionStorage.clear();
        $.cookie().clear();
        window.location.href = "../../index.jsp";
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
                        doc.addImage(imgData, 'JPEG', 20, 70, 555.28, 592.28/canvas.width * canvas.height );
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
