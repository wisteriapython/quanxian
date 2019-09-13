package com.yujian.sys.web;

import com.yujian.sys.model.Menu;
import com.yujian.util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "menuListServlet",urlPatterns = {"/sys/menuListServlet"})
public class MenuListServlet extends HttpServlet {

    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        MenuDao menuDao=new MenuDao();
        List<Menu> menuList=menuDao.findMenuList(0);
        request.setAttribute("menuList",menuList);
        String json=JsonUtil.object2JsonStr(menuList);
        System.out.println(json);
        //response.getWriter().print(json);
        request.setAttribute("json",json);
        request.getRequestDispatcher("menuList.jsp").forward(request,response);
    }*/
}
