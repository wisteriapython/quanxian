package com.yujian.sys.web;

import com.yujian.sys.model.Role;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "roleSaveServlet",urlPatterns = {"/sys/roleSaveServlet"})
public class RoleSaveServlet extends HttpServlet {
    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String roleId=request.getParameter("roleId");
        String roleName=request.getParameter("roleName");
        String roleDesc=request.getParameter("roleDesc");

        RoleDao roleDao=new RoleDao();
        Role role=new Role();
        role.setRoleName(roleName);
        role.setRoleDesc(roleDesc);
        if(null!=roleId&&!"".equals(roleId)){
            role.setRoleId(Integer.parseInt(roleId));
            roleDao.updateRole(role);
        }else{
            roleDao.insertRole(role);
        }

        response.sendRedirect("/sys/roleListServlet");
    }*/
}
