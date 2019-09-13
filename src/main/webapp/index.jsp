<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/common.jsp"%>
<html>
<body>


<%--<script>window.location="indexServlet"</script>--%>
<div class="container">
<div class="panel panel-default">
    <div class="panel-heading">
            &nbsp;
    </div>
    <div class="panel-body">
        <form id="loginForm" role="form" action="/sys/loginServlet" method="post">
            <div class="form-group">
                <label for="loginName">登录名</label>
                <input type="text" class="form-control" id="loginName" name="loginName"  placeholder="登录名">
            </div>
            <div class="form-group">
                <label for="loginPass">密码</label>
                <input type="text" class="form-control" id="loginPass" name="loginPass"  placeholder="密码">
            </div>
            <button type="submit" class="btn btn-primary btn-block">保存</button>
        </form>
    </div>
</div>
</div>
</body>
</html>
