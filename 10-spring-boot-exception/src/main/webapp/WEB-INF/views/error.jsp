<%--
  Created by IntelliJ IDEA.
  User: guan
  Date: 17/12/2019
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DefaultException</title>
</head>
<body>
    <h1> 页面异常处理方式一：Default 异常显示页面！</h1>
    <p>
        这是修改后的默认异常页面 error.jsp（名字必须为 error），将它放进 /WEB-INF/views（具体看application.properties配置）里，
        出错了未匹配到异常处理就会跳进此页面！
    </p>
    <span>${errorMessage}</span>
</body>
</html>

