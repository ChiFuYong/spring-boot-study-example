<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学生信息展示</title>
</head>
<body>
    <table border="1" align="center" width="50%">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
        </tr>
        <c:forEach items="${list}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>${student.sex}</td>
                <td>
                    <a href="/student/delete?id=${student.id}">删除</a>
                </td>
                <td>
                    <a href="/student/updatePageLoad?id=${student.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="/student/addStudent">录入学生信息</a>
</body>
</html>
