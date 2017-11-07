/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : chc

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-07 23:18:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `mobile_nav`
-- ----------------------------
DROP TABLE IF EXISTS `mobile_nav`;
CREATE TABLE `mobile_nav` (
  `nav_id` varchar(32) NOT NULL,
  `nav_name` varchar(16) DEFAULT NULL,
  `link_url` varchar(128) DEFAULT NULL,
  `icon` varchar(128) DEFAULT NULL,
  `sort` int(3) DEFAULT NULL,
  PRIMARY KEY (`nav_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mobile_nav
-- ----------------------------
INSERT INTO `mobile_nav` VALUES ('N000001', '首页', '/index', 'icon-home', '1');
INSERT INTO `mobile_nav` VALUES ('N000002', '预约', '/doctor', 'icon-bubbles4', '2');
INSERT INTO `mobile_nav` VALUES ('N000003', '诊单', '/bill', 'icon-stack', '3');
INSERT INTO `mobile_nav` VALUES ('N000004', '个人中心', '/owner', 'icon-compass2', '4');

-- ----------------------------
-- Table structure for `role_nav`
-- ----------------------------
DROP TABLE IF EXISTS `role_nav`;
CREATE TABLE `role_nav` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` varchar(12) NOT NULL,
  `nav_id` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_nav
-- ----------------------------
INSERT INTO `role_nav` VALUES ('1', '1', 'N000001');
INSERT INTO `role_nav` VALUES ('2', '1', 'N000002');
INSERT INTO `role_nav` VALUES ('3', '1', 'N000003');
INSERT INTO `role_nav` VALUES ('4', '1', 'N000004');

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(32) DEFAULT NULL,
  `login_pass` varchar(32) DEFAULT NULL,
  `user_name` varchar(16) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `mobile_no` varchar(11) DEFAULT NULL,
  `openid` varchar(32) NOT NULL,
  `usertype` varchar(4) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `user_status` varchar(4) DEFAULT NULL,
  `login_count` int(10) DEFAULT NULL,
  `last_login_ip` varchar(16) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`,`openid`),
  UNIQUE KEY `IDX_OPENID` (`openid`) USING BTREE,
  UNIQUE KEY `IDX_MOBILENO` (`mobile_no`) USING BTREE,
  UNIQUE KEY `IDX_LOGINNAME` (`login_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'shinyzo', '123456', null, null, '15501700742', '123456789', '1', '1', '1', '1', '127.0.0.1', '2017-11-07 22:41:31');
INSERT INTO `user_info` VALUES ('2', 'shinyzo1', '1111', null, null, '15501700743', '123456787', '2', '2', '1', '2', '127.0.0.1', '2017-11-07 22:41:32');
