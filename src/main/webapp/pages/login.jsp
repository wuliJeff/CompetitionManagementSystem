<%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.*, javax.servlet.http.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录</title>

    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="../assets/css/datepicker3.css" rel="stylesheet">
    <link href="../assets/css/styles.css" rel="stylesheet">

</head>

<body>

<div class="row">
    <div class="col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
        <div class="login-panel panel panel-default">
            <div class="panel-heading"><b>登录</b></div>
            <div class="panel-body">
                <form role="form" action="../login.do" method="post">
                    <fieldset>
                        <div class="form-group">
                            <input class="form-control" placeholder="账号" name="account" type="Account" autofocus="">
                        </div>
                        <div class="form-group">
                            <input class="form-control" placeholder="密码" name="password" type="password" value="">
                        </div>
                        <div style="float: left;">
                            <a href="forgetPassword.jsp">忘记密码</a>
                        </div>
                        <div style="float: right;">
                            <a href="register.jsp">注册</a>
                        </div>
                        <div style="clear: both;">
                            <br/>
                            <input type="submit" class="btn btn-primary" style="width: 100%;" value="登录">
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div><!-- /.col-->
</div><!-- /.row -->


<script src="../assets/js/jquery-1.11.1.min.js"></script>
<script src="../assets/js/bootstrap.min.js"></script>
<script src="../assets/js/chart.min.js"></script>
<script src="../assets/js/chart-data.js"></script>
<script src="../assets/js/easypiechart.js"></script>
<script src="../assets/js/easypiechart-data.js"></script>
<script src="../assets/js/bootstrap-datepicker.js"></script>
<script>
    !function ($) {
        $(document).on("click", "ul.nav li.parent > a > span.icon", function () {
            $(this).find('em:first').toggleClass("glyphicon-minus");
        });
        $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
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
