package com.yujian;

import com.yujian.sys.dao.UserInfoDao;
import com.yujian.sys.model.UserInfo;
import com.yujian.util.MybatisHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserInfoTest {

    @Test
    public void testFindUserInfoList(){
        SqlSession sqlSession=MybatisHelper.getSqlSessionFactory().openSession();
        UserInfoDao userInfoDao=sqlSession.getMapper(UserInfoDao.class);
        List<UserInfo> list=userInfoDao.findUserInfoList();
        System.out.println(list);
    }
}
