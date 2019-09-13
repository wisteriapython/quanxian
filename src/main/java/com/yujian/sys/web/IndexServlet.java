package com.yujian.sys.web;

import com.yujian.sys.dao.MenuDao;
import com.yujian.sys.model.Menu;
import com.yujian.sys.model.UserInfo;
import com.yujian.util.MybatisHelper;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "indexServlet",urlPatterns = {"/sys/indexServlet"})
public class IndexServlet extends HttpServlet {

    private Logger log = Logger.getLogger(this.getClass());

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession sqlSession=MybatisHelper.getSqlSessionFactory().openSession();
        MenuDao menuDao=sqlSession.getMapper(MenuDao.class);
        List<Menu> menuList=menuDao.findMenuList(0);
        log.debug("从Menu映射器查询获得菜单集合menuList:"+menuList);
        HttpSession session=request.getSession();
        UserInfo userInfo=(UserInfo)session.getAttribute("user");
        log.debug("从session里面获得user:"+userInfo);
        //获得用户拥有菜单的权限，也就是说查询出menuId号
        List<Integer> menuIds=menuDao.findUserSetMenuIds(userInfo.getUserId());
        sqlSession.close();
        List<Menu> userMenuList=filterUserMenu(menuList,menuIds);


        request.setAttribute("menuList",userMenuList);
        request.getRequestDispatcher("/main.jsp").forward(request,response);
    }

   public List<Menu> filterUserMenu(List<Menu> menuList,List<Integer> menuIds){
        List<Menu> resultMenu=new ArrayList<>();
        for(Menu m:menuList){
            if(menuIds.contains(m.getMenuId())){
                List<Menu> childMenus=m.getChildMenus();
                if(null!=childMenus&&childMenus.size()>0){
                    List<Menu> newChildMenus=filterUserMenu(childMenus,menuIds);
                    m.setChildMenus(newChildMenus);
                }
                resultMenu.add(m);
            }
        }
        return resultMenu;
    }
}
