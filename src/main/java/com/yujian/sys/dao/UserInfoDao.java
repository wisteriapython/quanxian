package com.yujian.sys.dao;

import com.yujian.sys.model.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserInfoDao {

    @Results(id = "userInfo",value = {
            @Result(column = "user_id",property = "userId"),
            @Result(column = "user_name",property = "userName"),
            @Result(column = "login_name",property = "loginName"),
            @Result(column = "login_pass",property = "loginPass")
    })
    @Select("select * from sys_user_info")
    List<UserInfo> findUserInfoList();

    @Select("select * from sys_user_info " +
            "where login_name=#{param1} and login_pass=#{param2}")
    @ResultMap("userInfo")
    UserInfo findUserInfoByNameAndPass(String loginName,String loginPass);

    @Select("select * from sys_user_info where user_id=#{userId}")
    @ResultMap("userInfo")
    UserInfo findUserInfoById(int userId);

    @Update("update sys_user_info set login_name=#{loginName}," +
            "login_pass=#{loginPass},user_name=#{userName} where user_id=#{userId}")
    void updateUserInfo(UserInfo userInfo);

    @Insert("insert into sys_user_info(user_name,login_name,login_pass)" +
            "values(#{userName},#{loginName},#{loginPass})")
    void insertUserInfo(UserInfo userInfo);

    @Select("select * from sys_user_info where login_name=#{name}")
    @ResultMap("userInfo")
    List<UserInfo> findUserInfoByLoginName(String name);

    @Delete("delete from sys_user_info where user_id=#{userId}")
    void deleteUserInfo(int userId);
}
