<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册</title>

    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="../assets/css/datepicker3.css" rel="stylesheet">
    <link href="../assets/css/styles.css" rel="stylesheet">

</head>

<body>

<div class="row">
    <div class="col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
        <div class="login-panel panel panel-default">
            <div class="panel-heading"><b>注册</b></div>
            <div class="panel-body">
                <form id="registerInfo" action="../register.do" method="post">
                    <fieldset>
                        <div class="form-group">
                            <input type="text" class="form-control" id="account" name="account" placeholder="账号(必填)">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" id="password" name="password"
                                   placeholder="密码(必填)">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" id="rePwd" name="rePwd" placeholder="确认密码(必填)">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="tel" name="tel" placeholder="联系方式(必填)">
                        </div>
                        <div>
                            <a href="login.jsp">返回</a>
                            <br/><br/>
                            <input type="button" class="btn btn-primary" value="确认注册" style="width: 100%;"
                                   onclick="validate()">
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

<script type="text/javascript">
    function validate() {
        var account = document.getElementById("account").value;
        var pwd = document.getElementById("password").value;
        var rePwd = document.getElementById("rePwd").value;
        var tel = document.getElementById("tel").value;
        var registerInfo = document.getElementById("registerInfo");
        if (account == "") {
            window.alert("请输入用户名！");
            account.focus();
            return false;
        } else if (tel == "") {
            window.alert("请输入联系方式，便于找回密码！");
            tel.focus();
            return false;
        } else if (pwd == "") {
            window.alert("密码不能为空！");
            pwd.focus();
            return false;
        } else if (pwd != rePwd) {
            window.alert("两次输入的密码不一致！");
            rePwd.focus();
            return false;
        }
        registerInfo.submit();
        return true;
    }
</script>
</body>

</html>
