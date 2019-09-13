package com.yujian.sys.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userInfoSaveRoleServlet",urlPatterns = {"/sys/userInfoSaveRoleServlet"})
public class UserInfoSaveRoleServlet extends HttpServlet {
    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId=request.getParameter("userId");
        String[] roleIds=request.getParameterValues("roleId");

        //更新角色配置
        UserRoleDao userRoleDao=new UserRoleDao();
        userRoleDao.updateUserRole(Integer.parseInt(userId),roleIds);

        //重新查询配置的角色
        response.sendRedirect("/sys/userInfoSetRoleServlet?userId="+userId);
    }*/
}
