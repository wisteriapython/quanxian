
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/common.jsp"%>
<html>
<head>
    <title>角色管理</title>
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading">
        <ul class="breadcrumb">
            <li>系统管理</li>
            <li>角色管理</li>
            <li class="active">角色列表</li>
        </ul>
    </div>
    <div class="panel-body">
        <a href="/sys/roleEditServlet" class="btn btn-primary btn-xs">添加角色</a>
    </div>
    <div class="panel-body">

        <table class="table table-bordered">
            <tr><td>角色编号</td><td>角色名称</td><td>说明</td><td></td></tr>
            <c:forEach items="${roleList}" var="role">
                <tr><td>${role.roleId}</td>
                    <td><a href="/sys/roleEditServlet?roleId=${role.roleId}">${role.roleName}</a></td><td>${role.roleDesc}</td>
                    <td>
                        <a href="/sys/roleDeleteServlet?roleId=${role.roleId}">删除</a> &nbsp;
                        <a href="/sys/roleSetMenuServlet?roleId=${role.roleId}" class="btn btn-xs btn btn-primary">分配菜单权限</a>
                    </td></tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
