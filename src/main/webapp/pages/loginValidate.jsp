<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>validate</title>
</head>
<body>
<center>
    <%
        String msg = session.getAttribute("msg").toString();
        request.getSession().removeAttribute("msg"); //销毁消息变量,只让它生效一次
        if (msg.equals("loginOK")) {
            out.println("<script>alert('登录成功！！！');");
            response.sendRedirect("../index.jsp");
        } else if (msg.equals("errorPwd")) {
            out.println("<script>alert('密码错误，请重新登录。');window.location.href='login.jsp';</script>");
        } else {
            out.println("<script>alert('账户不存在，请重新登录。');window.location.href='login.jsp';</script>");
        }
    %>
</center>
</body>
</html>