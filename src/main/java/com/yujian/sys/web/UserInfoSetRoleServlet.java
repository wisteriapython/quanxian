package com.yujian.sys.web;

import com.yujian.sys.model.Role;
import com.yujian.sys.model.UserChooseRole;
import com.yujian.sys.model.UserRole;

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

@WebServlet(name ="userInfoSetRoleServlet",urlPatterns = {"/sys/userInfoSetRoleServlet"})
public class UserInfoSetRoleServlet extends HttpServlet {
    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userId=request.getParameter("userId");

        UserRoleDao userRoleDao=new UserRoleDao();
        List<UserRole> rulist=userRoleDao.findUserRoleByUserId(Integer.parseInt(userId));

        Map<Integer,Object> urMap=new HashMap<>();
        for(UserRole ur:rulist){
            urMap.put(ur.getRoleId(),ur);
        }

        RoleDao roleDao=new RoleDao();
        List<Role> roleList=roleDao.findRoleList();

        List<UserChooseRole> ucrList=new ArrayList<>();
        for(Role r:roleList){
            UserChooseRole ucr=new UserChooseRole();
            ucr.setRole(r);
            if(null!=urMap.get(r.getRoleId())){
                ucr.setFlag(1);
            }
            ucrList.add(ucr);
        }
        request.setAttribute("ucrList",ucrList);
        request.setAttribute("userId",userId);
        request.getRequestDispatcher("/sys/userSetRole.jsp").forward(request,response);
    }*/
}
