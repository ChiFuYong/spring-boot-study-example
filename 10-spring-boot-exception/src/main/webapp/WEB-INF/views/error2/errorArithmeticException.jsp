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
    <title>ArithmeticException</title>
</head>
<body>
    <h1>页面异常处理方式二：算术异常！</h1>
    <span>${errorMessage}</span>
    <p>
        @ExceptionHandler 注解异常，代码请看TestController2，TestController2里报的算术异常将会到这里。
    </p>
</body>
</html>

