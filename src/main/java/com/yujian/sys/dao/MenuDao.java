package com.yujian.sys.dao;

import com.yujian.sys.model.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MenuDao {

    @Results(id = "menu",value = {
        @Result(column = "menu_id",property = "menuId"),
            @Result(column = "menu_name",property = "menuName"),
            @Result(column = "menu_url",property = "menuUrl"),
           /* @Result(column = "menu_parent_id",property = "parentMenu",
            one = @One(select = "com.yujian.sys.dao.MenuDao.findMenuById")),*/
            @Result(column = "parent_id",property = "parentMenu.menuId"),
            @Result(column = "parent_name",property = "parentMenu.menuName"),
            @Result(column = "menu_id",property = "childMenus",
            many = @Many(select = "com.yujian.sys.dao.MenuDao.findMenuList"))
    })
    @Select("select s1.MENU_ID,s1.MENU_NAME,s1.MENU_URL,\n" +
            "s2.MENU_ID parent_id,s2.MENU_NAME parent_name\n" +
            "from sys_menu s1 LEFT join sys_menu s2 \n" +
            "on s1.MENU_PARENT_ID=s2.MENU_ID where s1.menu_parent_id=#{parentId}")
    List<Menu> findMenuList(int parentId);

    @Select("select * from sys_menu where menu_id=#{menuId}")
    @ResultMap("menu")
    Menu findMenuById(int menuId);

    /**
     * 根据用户的编号，查询该用户拥有哪些菜单可以操作
     * @param userId
     * @return
     */
    @Select({"select DISTINCT m.MENU_ID\n" +
            "from sys_user_info u,sys_role r,sys_user_role su,\n" +
            "sys_menu m,sys_role_menu sm\n" +
            "where u.USER_ID=su.USER_ID and r.ROLE_ID=su.ROLE_ID\n" +
            "and m.MENU_ID=sm.MENU_ID and r.ROLE_ID=sm.ROLE_ID"})
    List<Integer> findUserSetMenuIds(int userId);
}
