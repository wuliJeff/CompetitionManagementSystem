<%@ page language="java" import="java.util.*, com.cms.entity.*, com.cms.service.*, javax.servlet.http.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<center>
    <%
        String account = session.getAttribute("account").toString();
    %>
    <span>welcome! <%=account%></span>
</center>
</body>
</html>