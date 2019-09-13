/*
Navicat MySQL Data Transfer

Source Server         : localhost_mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : yujian

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-12-13 15:11:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `MENU_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MENU_NAME` varchar(32) DEFAULT NULL,
  `MENU_URL` varchar(256) DEFAULT NULL,
  `MENU_PARENT_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `ROLE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(64) DEFAULT NULL,
  `ROLE_DESC` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='类似工作岗位';

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `ROLE_MENU_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MENU_ID` int(11) DEFAULT NULL,
  `ROLE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ROLE_MENU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_user_info
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_info`;
CREATE TABLE `sys_user_info` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(64) DEFAULT NULL,
  `LOGIN_NAME` varchar(64) DEFAULT NULL,
  `LOGIN_PASS` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `USER_ROLE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) DEFAULT NULL,
  `ROLE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`USER_ROLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;



#学生管理模块
DROP TABLE IF EXISTS STU_PERPAR_PERSON;

/*==============================================================*/
/* Table: STU_PERPAR_PERSON                                     */
/*==============================================================*/
CREATE TABLE STU_PERPAR_PERSON
(
   PERSON_ID            INT NOT NULL AUTO_INCREMENT,
   NAME                 VARCHAR(50),
   SEX                  INT,
   BIRTH                DATETIME,
   ADDRESS              VARCHAR(500),
   SCHOOL               VARCHAR(200),
   EDU                  VARCHAR(50),
   DEPT                 VARCHAR(100),
   PHONE                VARCHAR(200),
   QQ                   VARCHAR(50),
   ROOM_NO              VARCHAR(50),
   HOMETOWN             VARCHAR(50),
   IDCARD               VARCHAR(50),
   ASSO                 VARCHAR(50),
   ASSO_TEL             VARCHAR(50),
   STATE                INT COMMENT '0：未补充资料
            1：补充过资料',
   PRIMARY KEY (PERSON_ID)
);

DROP TABLE IF EXISTS STU_PERPAR_PERSON2;

/*==============================================================*/
/* Table: STU_PERPAR_PERSON2                                    */
/*==============================================================*/
CREATE TABLE STU_PERPAR_PERSON2
(
   PERSON_ID2           INT NOT NULL,
   NAME                 VARCHAR(50),
   SEX                  INT,
   BIRTH                DATETIME,
   ADDRESS              VARCHAR(500),
   SCHOOL               VARCHAR(200),
   EDU                  VARCHAR(50),
   DEPT                 VARCHAR(100),
   PHONE                VARCHAR(200),
   QQ                   VARCHAR(50),
   ROOM_NO              VARCHAR(50),
   HOMETOWN             VARCHAR(50),
   IDCARD               VARCHAR(50),
   ASSO                 VARCHAR(50),
   ASSO_TEL             VARCHAR(50),
   SOURCE               VARCHAR(50) COMMENT '扫寝、宣讲会、招聘会、主动上门、学员介绍、广告效果、招转',
   TALK                 VARCHAR(1000),
   COURSE               VARCHAR(30),
   AUDI_TIME            INT,
   AUDI_CONT            VARCHAR(200),
   REASON               VARCHAR(200),
   STATE                INT COMMENT '0:有效 1:无效',
   PRIMARY KEY (PERSON_ID2)
);
