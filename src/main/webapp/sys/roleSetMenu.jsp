<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/common.jsp"%>
<%@include file="/common/common.jsp"%>
<html>
<head>
    <title>角色设置菜单</title>
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading">
        <ul class="breadcrumb">
            <li>系统管理</li>
            <li>角色管理</li>
            <li class="active">角色设置菜单</li>
        </ul>
    </div>
    <div class="panel-body">
        <form action="/sys/roleSaveMenuServlet" method="post">
            <input type="hidden" name="roleId" value="${roleId}"/>
            <table  class="table table-bordered">
                <tr>
                    <td>编号</td><td>菜单名称</td><td>是否</td></tr>
                <c:forEach var="rcm" items="${rcmList}">
                    <tr> <td>${rcm.menu.menuId}</td><td>${rcm.menu.menuName}</td><td>
                        <input name="menuId" type="checkbox" value="${rcm.menu.menuId}" <c:if test="${rcm.flag==1}">checked</c:if>>
                    </td></tr>
                    <tr>
                        <td colspan="3">
                            <table  class="table table-bordered">
                                <c:forEach var="twoMenu" items="${rcm.roleChooseMenuList}">
                                <tr><td>${twoMenu.menu.menuId}</td><td>${twoMenu.menu.menuName}</td><td>
                                    <input name="menuId" type="checkbox" value="${twoMenu.menu.menuId}" <c:if test="${twoMenu.flag==1}">checked</c:if>>
                                </td></tr>
                                </c:forEach>
                            </table>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <input type="submit" value="保存" class="btn btn-primary btn-block">
        </form>
    </div>
</div>
</body>
</html>
