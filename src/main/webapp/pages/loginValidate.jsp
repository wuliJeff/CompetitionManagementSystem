<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>validate</title>
    <link rel="shortcut icon" type="image/x-icon" href="../resources/assets/images/icon-cat.png"/>
</head>
<body>
<center>
    <%
        String msg = session.getAttribute("msg").toString();
        request.getSession().removeAttribute("msg"); //销毁消息变量,只让它生效一次
        if (msg.equals("loginOK")) {
            out.println("<script>alert('登录成功！！！');window.location.href='loginSucceed.jsp';</script>");
        } else if (msg.equals("errorPwd")) {
            out.println("<script>alert('密码错误，请重新登录。');window.location.href='login.jsp';</script>");
        } else {
            out.println("<script>alert('账户不存在，请重新登录。');window.location.href='login.jsp';</script>");
        }
    %>
</center>
</body>
</html>