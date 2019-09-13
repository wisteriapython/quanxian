<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="/common/common.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div class="panel panel-default">
        <div class="panel-heading">
            <ul class="breadcrumb">
                <li>系统管理</li>
                <li>用户管理</li>
                <li class="active">用户分配角色</li>
            </ul>
        </div>
        <div class="panel-body">
<form action="/sys/userInfoSaveRoleServlet" method="post">
    <input type="hidden" name="userId" value="${userId}"/>
<table  class="table table-bordered">
    <tr>
    <td>编号</td><td>角色名称</td><td>是否</td></tr>
    <c:forEach var="ucr" items="${ucrList}">
    <tr> <td>${ucr.role.roleId}</td><td>${ucr.role.roleName}</td><td>
        <input name="roleId" type="checkbox" value="${ucr.role.roleId}" <c:if test="${ucr.flag==1}">checked</c:if>>
    </td></tr>
    </c:forEach>
</table>
    <input type="submit" value="保存" class="btn btn-primary btn-block">
</form>
        </div>
    </div>
</body>
</html>
