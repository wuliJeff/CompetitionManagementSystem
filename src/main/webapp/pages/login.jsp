<%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.*, javax.servlet.http.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
    <link rel="shortcut icon" type="image/x-icon" href="../resources/assets/images/icon-cat.png"/>
    <link rel="stylesheet" href="../resources/assets/css/login.css">
</head>
<body>
<section class="signin popup-in">
    <div class="container">
        <div class="sign-content popup-in-content">
            <div class="popup-in-txt">
                <h2>登录</h2>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="signin-form">
                            <form action="../login.do" method="post">
                                <div class="form-group">
                                    <input type="text" class="form-control" id="account" name="account"
                                           placeholder="账户">
                                </div>
                                <div class="form-group">
                                    <br>
                                    <input type="password" class="form-control" id="password" name="password"
                                           placeholder="密码">
                                </div>
                                <input type="submit" class="btn signin_btn signin_btn_two"
                                       value="登录">
                                <input type="button" class="btn signin_btn" value="注册新用户"
                                       onclick="window.location.href='register.html'">
                            </form>
                            <br>
                            <div>
                                <a href="../index.jsp" style="float: left;">返回主页>></a>
                                <a href="forgetPassword.html" style="float: right;">找回密码</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>