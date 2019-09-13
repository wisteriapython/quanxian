package com.yujian.sys.web;

import com.yujian.sys.model.Role;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "roleListServlet",urlPatterns = {"/sys/roleListServlet"})
public class RoleListServlet extends HttpServlet {

    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        RoleDao roleDao=new RoleDao();
        List<Role> roleList=roleDao.findRoleList();
        request.setAttribute("roleList",roleList);
        request.getRequestDispatcher("/sys/roleList.jsp").forward(request,response);
    }*/
}
