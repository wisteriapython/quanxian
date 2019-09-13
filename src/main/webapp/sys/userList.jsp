<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="/common/common.jsp"%>
<html>
<head>
    <title>用户列表</title>
</head>
<body>

    <div class="panel panel-default">
        <div class="panel-heading">
            <ul class="breadcrumb">
                <li>系统管理</li>
                <li>用户管理</li>
                <li class="active">用户列表</li>
            </ul>
        </div>
        <div class="panel-body">
            <a href="/sys/userInfoEditServlet" class="btn btn-primary btn-xs">添加用户</a>
        </div>
        <div class="panel-body">

<table class="table table-bordered">
    <tr><td>编号</td><td>姓名</td><td>登录名</td><td></td></tr>
    <c:forEach items="${userInfoList}" var="userInfo">
        <tr><td>${userInfo.userId}</td>
            <td><a href="/sys/userInfoEditServlet?userId=${userInfo.userId}">${userInfo.userName}</a></td><td>${userInfo.loginName}</td>
            <td>
                <a href="/sys/userInfoDeleteServlet?userId=${userInfo.userId}">删除</a> &nbsp;
                <a href="/sys/userInfoSetRoleServlet?userId=${userInfo.userId}" class="btn btn-xs btn btn-primary">设置角色</a>
            </td></tr>
    </c:forEach>
</table>
        </div>
    </div>

</body>
</html>
