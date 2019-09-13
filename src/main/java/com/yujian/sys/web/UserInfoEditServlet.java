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

@WebServlet(name = "userInfoEditServlet",urlPatterns = {"/sys/userInfoEditServlet"})
public class UserInfoEditServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userId=request.getParameter("userId");
        if(null!=userId&&!"".equals(userId)){
            SqlSession sqlSession=MybatisHelper.getSqlSessionFactory().openSession();
            UserInfoDao userInfoDao=sqlSession.getMapper(UserInfoDao.class);
            UserInfo userInfo=userInfoDao.findUserInfoById(Integer.parseInt(userId));
            sqlSession.close();
            request.setAttribute("userInfo",userInfo);
        }
        request.getRequestDispatcher("/sys/userInfoEdit.jsp").forward(request,response);
    }
}
