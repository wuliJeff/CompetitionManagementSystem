<%@ page language="java" import="java.util.*, com.cms.entity.*, com.cms.service.*, javax.servlet.http.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>主页</title>
    <link rel="shortcut icon" type="image/x-icon" href="resources/assets/images/icon-cat.png"/>
    <link rel="stylesheet" type="text/css" href="resources/assets/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="resources/assets/css/mycss.css"/>
    <script type="text/javascript" src="resources/assets/js/jquery-1.6.4.min.js"></script>
    <script type="text/javascript" src="resources/assets/js/ddsmoothmenu.js"></script>
    <script type="text/javascript" src="resources/assets/js/jquery.jcarousel.js"></script>
    <script type="text/javascript" src="resources/assets/js/carousel.js"></script>
    <script type="text/javascript" src="resources/assets/js/jquery.flexslider-min.js"></script>
    <script type="text/javascript" src="resources/assets/js/jquery.masonry.min.js"></script>
    <script type="text/javascript" src="resources/assets/js/jquery.slickforms.js"></script>
    <script type="text/javascript">
        function f() {
            alert("请先登录！");
            window.location.href = "pages/login.jsp";
        }
    </script>
</head>
<body>
<div id="wrapper">
    <div id="sidebar">
        <div id="logo">
            <div style="font-size: 16px; color: #fff; padding-left: 10px;">
                <a href="pages/login.jsp">点我登录>></a>
            </div>
        </div>
        <div id="menu" class="menu-v">
            <ul>
                <li><a href="#" class="active">list1</a></li>
                <li><a href="#" onclick="f()">list2</a></li>
                <li>
                    <a href="#" onclick="f()">list3</a>
                    <ul>
                        <li><a href="#" onclick="f()">item1</a></li>
                        <li><a href="#" onclick="f()">item2</a></li>
                    </ul>
                </li>
                <li><a href="#" onclick="f()">list4</a></li>
            </ul>
        </div>
    </div>
    <div id="content">
        <div style="clear: both;">
        </div>
        <div class="line" style="clear: both;"></div>
        <div class="intro">
        </div>
    </div>
</div>
<div class="clear"></div>
<script type="text/javascript" src="resources/assets/js/scripts.js"></script>
<script type="text/javascript" src="resources/assets/js/jquery.corner.js"></script>
</body>
</html>