package com.yujian.sys.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "roleSaveMenuServlet",urlPatterns = {"/sys/roleSaveMenuServlet"})
public class RoleSaveMenuServlet extends HttpServlet {

    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String roleId=request.getParameter("roleId");
        String[] menuIds=request.getParameterValues("menuId");

        RoleMenuDao roleMenuDao=new RoleMenuDao();
        roleMenuDao.updateRoleSetMenu(roleId,menuIds);

        response.sendRedirect("/sys/roleSetMenuServlet?roleId="+roleId);
    }*/
}
