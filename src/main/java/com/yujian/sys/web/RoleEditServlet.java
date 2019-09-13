package com.yujian.sys.web;

import com.yujian.sys.model.Role;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "roleEditServlet",urlPatterns = {"/sys/roleEditServlet"})
public class RoleEditServlet extends HttpServlet {

    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String roleId=request.getParameter("roleId");
        if(null!=roleId&&!"".equals(roleId)){
            RoleDao roleDao=new RoleDao();
            Role role=roleDao.findRoleById(Integer.parseInt(roleId));
            request.setAttribute("role",role);
        }
        request.getRequestDispatcher("roleEdit.jsp").forward(request,response);
    }*/
}
