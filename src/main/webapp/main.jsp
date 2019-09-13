<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="common/common.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-3 column">
            LOGO
        </div>
        <div class="col-md-9 column">
            <div style="height: 100px;"></div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-3 column">


                    <div class="panel-group" id="panel-682621">
                        <c:forEach var="menu" items="${menuList}" varStatus="status">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <a class="panel-title" data-toggle="collapse" data-parent="#panel-682621" href="#panel-element-${menu.menuId}">${menu.menuName}</a>
                                </div>
                                <div id="panel-element-${menu.menuId}" class="panel-collapse collapse <c:if test="${status.first}">in</c:if>">

                                        <ul class="list-group">
                                            <c:forEach var="childMenu" items="${menu.childMenus}">
                                            <li class="list-group-item"><a href="${childMenu.menuUrl}" target="content1">${childMenu.menuName}</a></li>
                                            </c:forEach>
                                        </ul>

                                </div>
                            </div>
                        </c:forEach>
                    </div>


        </div>
        <div class="col-md-9 column">
            <div class="panel panel-default">
                <div class="panel-body">
                    <iframe name="content1" src="/default.jsp" width="100%" height="100%" frameborder="0"></iframe>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
