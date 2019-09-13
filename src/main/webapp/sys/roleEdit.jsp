
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <li>角色管理</li>
            <li class="active">角色编辑</li>
        </ul>
    </div>
    <div class="panel-body">
        <form id="roleForm" role="form" action="/sys/roleSaveServlet" method="post">
            <div class="form-group">
                <label for="roleName">角色名称</label>
                <input type="hidden" name="roleId" value="${role.roleId}">
                <input type="text" class="form-control required" id="roleName" name="roleName" value="${role.roleName}" placeholder="请输入角色名称">
            </div>
            <div class="form-group">
                <label for="roleDesc">角色描述</label>
                <input type="text" class="form-control" id="roleDesc" name="roleDesc" value="${role.roleDesc}" placeholder="请输入角色简要描述说明">
            </div>

            <button type="submit" class="btn btn-primary btn-block">保存</button>
        </form>
    </div>
</div>
</body>
<script>
    $(function(){
        $("#roleForm").validate();
    });
</script>
</html>
