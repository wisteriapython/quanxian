#初始化数据
#用户
INSERT INTO `sys_user_info` VALUES ('1', '管理员', 'admin', '123');

#系统管理菜单
INSERT INTO `sys_menu` VALUES ('1', '系统管理', null, '0');
INSERT INTO `sys_menu` VALUES ('3', '用户管理', '/sys/userInfoListServlet', '1');
INSERT INTO `sys_menu` VALUES ('4', '角色管理', '/sys/roleListServlet', '1');
INSERT INTO `sys_menu` VALUES ('7', '菜单管理', '/sys/menuListServlet', '1');

#角色
INSERT INTO `sys_role` VALUES ('1', '超级管理员', null);
INSERT INTO `sys_role` VALUES ('2', '市场人员', null);
INSERT INTO `sys_role` VALUES ('3', '咨询师', null);
INSERT INTO `sys_role` VALUES ('4', '教员', null);
INSERT INTO `sys_role` VALUES ('5', '班主任', null);

#用户关联角色
INSERT INTO `sys_user_role` VALUES ('14', '1', '1');
INSERT INTO `sys_user_role` VALUES ('15', '1', '2');
INSERT INTO `sys_user_role` VALUES ('16', '1', '3');
INSERT INTO `sys_user_role` VALUES ('17', '1', '4');
INSERT INTO `sys_user_role` VALUES ('18', '1', '5');

#角色关联菜单
INSERT INTO `sys_role_menu` VALUES ('1', '1', '1');
INSERT INTO `sys_role_menu` VALUES ('2', '3', '1');
INSERT INTO `sys_role_menu` VALUES ('3', '4', '1');
INSERT INTO `sys_role_menu` VALUES ('4', '7', '1');
INSERT INTO `sys_role_menu` VALUES ('5', '2', '1');
INSERT INTO `sys_role_menu` VALUES ('6', '5', '1');
INSERT INTO `sys_role_menu` VALUES ('7', '6', '1');