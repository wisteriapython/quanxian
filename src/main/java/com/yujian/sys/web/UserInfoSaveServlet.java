package com.yujian.sys.web;

import com.yujian.sys.dao.UserInfoDao;
import com.yujian.sys.model.UserInfo;
import com.yujian.util.MybatisHelper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userInfoSaveServlet",urlPatterns = {"/sys/userInfoSaveServlet"})
public class UserInfoSaveServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String userId=request.getParameter("userId");
        String userName=request.getParameter("userName");
        String loginName=request.getParameter("loginName");
        String loginPass=request.getParameter("loginPass");

        UserInfo userInfo=new UserInfo();
        SqlSession sqlSession=MybatisHelper.getSqlSessionFactory().openSession();
        try {
            UserInfoDao userInfoDao=sqlSession.getMapper(UserInfoDao.class);
            userInfo.setUserName(userName);
            userInfo.setLoginName(loginName);
            userInfo.setLoginPass(loginPass);
            if(null!=userId&&!"".equals(userId)){
                userInfo.setUserId(Integer.parseInt(userId));
                userInfoDao.updateUserInfo(userInfo);
            }else{
                userInfoDao.insertUserInfo(userInfo);
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
        response.sendRedirect("/sys/userInfoListServlet");
    }
}
