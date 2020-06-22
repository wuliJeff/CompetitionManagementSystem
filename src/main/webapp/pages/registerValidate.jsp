<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>registerValidate</title>
    <link rel="shortcut icon" type="image/x-icon" href="../resources/assets/images/icon-cat.png"/>
</head>
<body>
<%
    String msg = (String) session.getAttribute("msg");
    request.getSession().removeAttribute("msg"); //销毁消息变量,只让它生效一次
    if (msg.equals("existAccount")) {
        out.println("<script>alert('账户已存在，注册失败！');window.location.href='register.html';</script>");
    } else if (msg.equals("registerOK")) {
        out.println("<script>alert('注册成功！');window.location.href='login.jsp';</script>");
    } else {
        out.println("<script>alert('无效注册信息');window.location.href='../index.jsp';</script>");
    }
%>
</body>
</html>