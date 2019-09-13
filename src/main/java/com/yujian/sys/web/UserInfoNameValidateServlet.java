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
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "userInfoNameValidateServlet",urlPatterns = {"/sys/userInfoNameValidateServlet"})
public class UserInfoNameValidateServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        String loginName = request.getParameter("loginName");
        SqlSession sqlSession=MybatisHelper.getSqlSessionFactory().openSession();
        UserInfoDao userInfoDao = sqlSession.getMapper(UserInfoDao.class);
        List<UserInfo> userInfoList = userInfoDao.findUserInfoByLoginName(loginName);
        sqlSession.close();
        //异步刷新是没有跳转的
        if (userInfoList.size() > 0) {
            out.print(false);
        } else {
            out.print(true);
        }
    }
}