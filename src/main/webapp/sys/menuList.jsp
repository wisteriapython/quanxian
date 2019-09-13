<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/common.jsp"%>
<link href="css/bootstrap-treeview.min.css" rel="stylesheet" />
<script src="js/bootstrap-treeview.min.js"></script>
<html>
<head>
    <title>菜单列表</title>
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading">
        <ul class="breadcrumb">
            <li>系统管理</li>
            <li>菜单管理</li>
            <li class="active">菜单列表</li>
        </ul>
    </div>
    <div class="panel-body">
        <a href="/sys/menuEditServlet" class="btn btn-primary btn-xs">添加菜单</a>
    </div>
    <div class="panel-body">

        <c:forEach var="oneMenu" items="${menuList}">
            <div class="panel panel-default">
                <div class="panel-heading">
                        ${oneMenu.menuName}
                </div>
                <div class="panel-body">
                    <table class="table table-bordered">
                        <c:forEach var="twoMenu" items="${oneMenu.childMenus}">
                            <tr><td width="180">${twoMenu.menuName}</td><td width="400">${twoMenu.menuUrl}</td><td>
                                <a href="#">编辑</a>&nbsp;&nbsp;
                                <a href="#">删除</a>
                            </td></tr>

                            <tr><td colspan="3">
                                <table class="table table-bordered">
                                    <c:forEach var="three" items="${twoMenu.childMenus}">
                                        <tr><td width="180">${three.menuName}</td><td width="400">${three.menuUrl}</td><td>
                                            <a href="#">编辑</a>&nbsp;&nbsp;
                                            <a href="#">删除</a>
                                        </td></tr>
                                    </c:forEach>
                                </table>
                            </td></tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

</body>
</html>
