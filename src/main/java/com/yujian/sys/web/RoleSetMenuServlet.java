package com.yujian.sys.web;

import com.yujian.sys.model.Menu;
import com.yujian.sys.model.RoleChooseMenu;
import com.yujian.sys.model.RoleMenu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "roleSetMenuServlet",urlPatterns = {"/sys/roleSetMenuServlet"})
public class RoleSetMenuServlet extends HttpServlet {

    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String roleId=request.getParameter("roleId");

        MenuDao menuDao=new MenuDao();
        List<Menu> menuList=menuDao.findMenuList(0);

        RoleMenuDao roleMenuDao=new RoleMenuDao();
        List<RoleMenu> rmList=roleMenuDao.findRoleMenuByRoleId(Integer.parseInt(roleId));
        Map<Integer,Object> rmMap=new HashMap<>();
        for(RoleMenu rm:rmList){
            rmMap.put(rm.getMenuId(),rm);
        }

        List<RoleChooseMenu> rcmList=getRoleChooseMenu(menuList,rmMap);
        request.setAttribute("rcmList",rcmList);
        request.setAttribute("roleId",roleId);
        request.getRequestDispatcher("roleSetMenu.jsp").forward(request,response);
    }

    private List<RoleChooseMenu> getRoleChooseMenu(List<Menu>menuList,Map<Integer,Object> rmMap){
        List<RoleChooseMenu> rcmList=new ArrayList<>();
        for(Menu m:menuList){
            RoleChooseMenu rcm=new RoleChooseMenu();
            rcm.setMenu(m);
            if(null!=rmMap.get(m.getMenuId())){
                rcm.setFlag(1);
            }

            List<Menu> childMenus=m.getChildMenus();
            if(null!=childMenus&&childMenus.size()>0){
                List<RoleChooseMenu> newRcmList=getRoleChooseMenu(childMenus,rmMap);
                rcm.setRoleChooseMenuList(newRcmList);
            }
            rcmList.add(rcm);
        }
        return rcmList;
    }*/
}
