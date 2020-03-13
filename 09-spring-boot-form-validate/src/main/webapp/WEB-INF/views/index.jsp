<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>添加学生</title>
</head>

<body>

    <h1><font color="red">${resultMessage}</font></h1>
    <%--显示错误信息--%>
    <c:if test="${allErrors != null}">
        <c:forEach items="${allErrors}" var="error">
            <font color="red">${error.defaultMessage}</font><br/>
        </c:forEach>
    </c:if>

    <form action="/student/add" method="post">
        学生姓名<input type="text" name="name" value="${student.name}"><br/>
        学生年龄<input type="text" name="age" value="${student.age}"><br/>
        学生性别<input type="text" name="sex" value="${student.sex}"><br/>
        <input type="submit" value="确认">
    </form>

</body>
</html>
