package com.yujian.sys.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "roleDeleteServlet",urlPatterns = {"/sys/roleDeleteServlet"})
public class RoleDeleteServlet extends HttpServlet {

   /* @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String roleId=request.getParameter("roleId");
        RoleDao roleDao=new RoleDao();
        roleDao.deleteRole(Integer.parseInt(roleId));
        response.sendRedirect("/sys/roleListServlet");
    }*/
}
