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
import java.util.List;

@WebServlet(name = "userInfoListServlet",urlPatterns = {"/sys/userInfoListServlet"})
public class UserInfoListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession sqlSession=MybatisHelper.getSqlSessionFactory().openSession();
        UserInfoDao userInfoDao=sqlSession.getMapper(UserInfoDao.class);
        List<UserInfo> userInfoList=userInfoDao.findUserInfoList();
        sqlSession.close();
        request.setAttribute("userInfoList",userInfoList);
        request.getRequestDispatcher("/sys/userList.jsp").forward(request,response);
    }
}
