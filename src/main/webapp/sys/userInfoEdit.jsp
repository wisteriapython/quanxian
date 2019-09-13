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
                <li>用户管理</li>
                <li class="active">用户资料编辑</li>
            </ul>
        </div>
        <div class="panel-body">
            <form role="form" id="userInfoForm" name="userInfoForm" action="/sys/userInfoSaveServlet" method="post">
                <div class="form-group">
                    <label for="userName">用户姓名</label>
                    <input type="hidden" name="userId" value="${userInfo.userId}">
                    <input type="text" class="form-control" id="userName" name="userName" value="${userInfo.userName}" placeholder="请输入用户姓名">
                </div>
                <div class="form-group">
                    <label for="loginName">登录名</label>
                    <input type="text" class="form-control" id="loginName" name="loginName" value="${userInfo.loginName}" placeholder="请输入登录名">

                </div>
                <div class="form-group">
                    <label for="loginPass">登录密码</label>
                    <input type="text" class="form-control" id="loginPass" name="loginPass" value="${userInfo.loginPass}" placeholder="请输入登录密码">

                </div>
                <button type="submit" class="btn btn-primary btn-block">保存</button>
            </form>
        </div>
    </div>

</body>

<script>
    //起手式,$()代表封装成jQuery对象，jQuery对象不是html元素对象
    //document.onload=function(){}在页面加载到浏览器内存的时候调用事件方法，相当于在内存里初始化
    //onBlur事件方法，表示元素失去焦点
    $(function(){
        /*$("#loginName").blur(function(){
            //发起一个异步请求
            $.post("/sys/userInfoNameValidateServlet",
                {
                    loginName:$("#loginName").val()
                },
                function(data,status){
                    alert("数据: \n" + data + "\n状态: " + status);
                    if(data=="true"){
                        alert()
                        $("#loginName").after("<div class='error1' style='color:red;'>用户名已经被使用过</div>");
                    }
                });
        });*/

        $("#userInfoForm").validate({
            rules:{loginName:{required:true,remote:"/sys/userInfoNameValidateServlet"},
                userName:{required:true},
                loginPass:{required:true}
            }
        });
    })
</script>
</html>
