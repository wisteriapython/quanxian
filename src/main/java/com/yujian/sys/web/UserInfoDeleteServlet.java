package com.yujian.sys.web;

import com.yujian.sys.dao.UserInfoDao;
import com.yujian.util.MybatisHelper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userInfoDeleteServlet",urlPatterns = {"/sys/userInfoDeleteServlet"})
public class UserInfoDeleteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userId=request.getParameter("userId");
        SqlSession sqlSession=MybatisHelper.getSqlSessionFactory().openSession();
        try {
            UserInfoDao userInfoDao=sqlSession.getMapper(UserInfoDao.class);
            userInfoDao.deleteUserInfo(Integer.parseInt(userId));
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
