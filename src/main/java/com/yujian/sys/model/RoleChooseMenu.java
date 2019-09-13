package com.yujian.sys.model;

import java.util.List;

/**
 * RoleChooseMenu和Menu 结构要类似
 */
public class RoleChooseMenu {

    private Menu menu;
    private int flag;
    private List<RoleChooseMenu> roleChooseMenuList;

    public List<RoleChooseMenu> getRoleChooseMenuList() {
        return roleChooseMenuList;
    }

    public void setRoleChooseMenuList(List<RoleChooseMenu> roleChooseMenuList) {
        this.roleChooseMenuList = roleChooseMenuList;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
