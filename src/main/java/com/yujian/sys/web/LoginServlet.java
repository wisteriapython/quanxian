package com.yujian.sys.web;

import com.yujian.sys.dao.UserInfoDao;
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


@WebServlet(name = "loginServlet",urlPatterns = {"/sys/loginServlet"})
public class LoginServlet extends HttpServlet {

    private Logger log= Logger.getLogger(this.getClass());
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String loginName=request.getParameter("loginName");
        String loginPass=request.getParameter("loginPass");

        log.debug("loginName:"+loginName+"--->loginPass:"+loginPass);

        SqlSession sqlSession=MybatisHelper.getSqlSessionFactory().openSession();
        UserInfoDao userInfoDao=sqlSession.getMapper(UserInfoDao.class);
        UserInfo userInfo=userInfoDao.findUserInfoByNameAndPass(loginName,loginPass);
        sqlSession.close();

        if(null!=userInfo){
            HttpSession session=request.getSession();
            session.setAttribute("user",userInfo);
            response.sendRedirect("/sys/indexServlet");
            log.debug("用户登录成功");
            return;
        }
        log.debug("用户登录失败");
        response.sendRedirect("/index.jsp");
    }
}
