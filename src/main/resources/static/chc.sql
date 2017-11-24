/*
Navicat MySQL Data Transfer

Source Server         : webapp.localhost
Source Server Version : 50168
Source Host           : localhost:3306
Source Database       : chc

Target Server Type    : MYSQL
Target Server Version : 50168
File Encoding         : 65001

Date: 2017-11-24 13:07:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `city`
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `city_id` varchar(12) NOT NULL,
  `city_name` varchar(32) DEFAULT NULL,
  `parent_id` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------

-- ----------------------------
-- Table structure for `corp_info`
-- ----------------------------
DROP TABLE IF EXISTS `corp_info`;
CREATE TABLE `corp_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id自增长',
  `corp_id` varchar(20) DEFAULT NULL COMMENT '企业帐号',
  `corp_name` varchar(100) DEFAULT NULL COMMENT '企业名称',
  `business_code` varchar(40) DEFAULT NULL COMMENT '营业执照号',
  `artificial_name` varchar(100) DEFAULT NULL COMMENT '法人姓名',
  `id_card_no` varchar(40) NOT NULL COMMENT '法人身份证号',
  `corp_phone` varchar(20) DEFAULT NULL COMMENT '企业电话',
  `corp_logo` varchar(40) DEFAULT NULL COMMENT '商户Logo',
  `lat` varchar(12) DEFAULT NULL,
  `lng` varchar(12) DEFAULT NULL,
  `corp_address` varchar(100) DEFAULT NULL COMMENT '商户地址',
  `expire_date` varchar(10) DEFAULT NULL COMMENT '到期日',
  `corp_status` varchar(4) DEFAULT '0',
  `open_status` varchar(4) DEFAULT '0' COMMENT '是否为平台内开放商户，0：否，1：是',
  `desc` varchar(1000) DEFAULT NULL COMMENT '备注信息,企业简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of corp_info
-- ----------------------------
INSERT INTO `corp_info` VALUES ('69', '0000', '企萌科技-后台管理系统', null, null, '360622198809201536', '15501700742', null, null, null, null, null, '0001', '0', null);
INSERT INTO `corp_info` VALUES ('72', 'H000001', '海南裕兴昌药业股份有限公司', '11111111', '邓总', '360622198809201534', '15644337766', null, null, null, '', null, '0005', '0', null);
INSERT INTO `corp_info` VALUES ('74', 'BGT', '海南百广堂药业有限公司', '11111111111', '小白', '345645654454323', '15501700733', null, null, null, '', null, '0000', '0', null);
INSERT INTO `corp_info` VALUES ('75', 'SQYY', '社区医院（）', '111111111', '张三', '353323434332232', '15678988765', null, null, null, '111111', null, '0005', '0', null);

-- ----------------------------
-- Table structure for `doctor_info`
-- ----------------------------
DROP TABLE IF EXISTS `doctor_info`;
CREATE TABLE `doctor_info` (
  `doctor_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统主键',
  `user_id` int(11) NOT NULL COMMENT '登录账号',
  `doctor_name` varchar(20) NOT NULL COMMENT '医生姓名',
  `sex` varchar(2) NOT NULL COMMENT '性别',
  `birthday` varchar(20) DEFAULT NULL COMMENT '生日',
  `id_card_no` varchar(20) NOT NULL DEFAULT '' COMMENT '身份证号',
  `avatar` varchar(100) DEFAULT NULL COMMENT '头像图片',
  `qafca_cert_no` varchar(40) NOT NULL COMMENT '医师资格证书编号',
  `qafca_cert_img` varchar(100) DEFAULT NULL COMMENT '医师资格证书图片',
  `qafca_cert_sign_date` varchar(14) DEFAULT NULL COMMENT '发证日期',
  `pract_cert_no` varchar(20) NOT NULL COMMENT '执业资格证书',
  `pract_cert_img` varchar(100) DEFAULT NULL COMMENT '执业资格证书图片',
  `pract_cert_register_date` varchar(20) DEFAULT NULL COMMENT '执业资格证书注册日期',
  `hospital_id` int(11) DEFAULT NULL COMMENT '医院',
  `hospital_name` varchar(100) DEFAULT NULL,
  `subject_id` varchar(20) DEFAULT NULL COMMENT '科室',
  `subject_name` varchar(40) DEFAULT NULL,
  `level_id` varchar(40) DEFAULT NULL COMMENT '职务级别',
  `level_name` varchar(40) DEFAULT NULL,
  `doctor_no` varchar(40) DEFAULT NULL COMMENT '医师编号',
  `college_name` varchar(100) DEFAULT NULL COMMENT '大学名称',
  `work_age` varchar(3) DEFAULT NULL COMMENT '工作年限',
  `fav_subject` varchar(100) DEFAULT NULL COMMENT '擅长领域',
  `office_phone` varchar(20) DEFAULT NULL COMMENT '办公电话-固话',
  `personal_phone` varchar(20) DEFAULT NULL COMMENT '个人电话',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `input_type` varchar(1) DEFAULT '1' COMMENT '数据录入方式1：内部录入，0：个人注册',
  `desc` varchar(1000) DEFAULT NULL COMMENT '医师简介',
  `score` float(11,2) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`doctor_id`,`id_card_no`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctor_info
-- ----------------------------
INSERT INTO `doctor_info` VALUES ('1', '1', '张医师', '男', '1988-09-20', '360622198809201536', null, 'A3423432432423', null, '2017-09-20', '1232132132', null, '2017-09-20', '1', null, '2', null, '1', null, null, null, '2', null, null, null, '0', '1', null, '0.00', null, null);
INSERT INTO `doctor_info` VALUES ('2', '2', '李医师', '女 ', '1985-07-11', '360622198809201532', null, '22312321321', null, '2017-09-20', '1232132132', null, '2017-09-20', '1', null, '2', null, '3', null, null, null, '4', '眼科', '2321321321', '1111111', '0', '1', '32132132132132132', '0.00', null, null);

-- ----------------------------
-- Table structure for `doctor_level`
-- ----------------------------
DROP TABLE IF EXISTS `doctor_level`;
CREATE TABLE `doctor_level` (
  `level_id` int(10) NOT NULL AUTO_INCREMENT,
  `level_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`level_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctor_level
-- ----------------------------
INSERT INTO `doctor_level` VALUES ('1', '专家');
INSERT INTO `doctor_level` VALUES ('2', '主任医师');
INSERT INTO `doctor_level` VALUES ('3', '副主任医师');
INSERT INTO `doctor_level` VALUES ('4', '医师');
INSERT INTO `doctor_level` VALUES ('5', '助理');
INSERT INTO `doctor_level` VALUES ('6', '实习医师');

-- ----------------------------
-- Table structure for `hospital`
-- ----------------------------
DROP TABLE IF EXISTS `hospital`;
CREATE TABLE `hospital` (
  `hospital_id` int(11) NOT NULL AUTO_INCREMENT,
  `hospital_name` varchar(128) DEFAULT NULL,
  `hospital_type` varchar(20) DEFAULT NULL,
  `hospital_level` varchar(4) DEFAULT NULL,
  `telnum` varchar(16) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `lat` varchar(12) DEFAULT NULL,
  `lng` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`hospital_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hospital
-- ----------------------------
INSERT INTO `hospital` VALUES ('1', '海南省人民医院', '三级甲等', '1', '0898-222222', '海南省人民医院', '222', '2222');
INSERT INTO `hospital` VALUES ('2', '海南省中医院', '三级甲等', '2', '0898-333333', '海南省中医院', '33333', '33333');

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
INSERT INTO `mobile_nav` VALUES ('N000003', '诊单', '/order', 'icon-stack', '3');
INSERT INTO `mobile_nav` VALUES ('N000004', '个人中心', '/owner', 'icon-compass2', '4');

-- ----------------------------
-- Table structure for `order_detail`
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `detail_id` varchar(16) NOT NULL COMMENT '订单明细id',
  `order_id` varchar(16) DEFAULT NULL COMMENT '主订单id',
  `product_id` varchar(12) DEFAULT NULL COMMENT '产品id',
  `product_name` varchar(100) DEFAULT NULL COMMENT '产品名称',
  `category_id` varchar(12) DEFAULT NULL COMMENT '产品类别id',
  `count` int(9) DEFAULT NULL COMMENT '数量',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `total_price` decimal(10,2) DEFAULT NULL COMMENT '总金额',
  PRIMARY KEY (`detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `order_master`
-- ----------------------------
DROP TABLE IF EXISTS `order_master`;
CREATE TABLE `order_master` (
  `order_id` varchar(16) NOT NULL DEFAULT '订单id',
  `reserve_id` varchar(12) DEFAULT NULL COMMENT '预约单号',
  `from_userid` int(11) DEFAULT NULL COMMENT '预约者id',
  `to_userid` int(11) DEFAULT NULL COMMENT '被预约者id',
  `condition_description` varchar(400) DEFAULT NULL COMMENT '病情描述',
  `diagnosis_opinion` varchar(400) DEFAULT NULL COMMENT '诊断意见',
  `attachment` varchar(100) DEFAULT NULL COMMENT '附件',
  `signname` varchar(20) DEFAULT NULL COMMENT '医师签名',
  `orderAmt` decimal(10,2) DEFAULT NULL COMMENT '订单金额',
  `order_status` varchar(4) DEFAULT NULL COMMENT '订单状态',
  `pay_status` varchar(4) DEFAULT NULL COMMENT '支付状态',
  `next_id` varchar(16) DEFAULT NULL COMMENT '下一个流程id,0 标识已完结',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_master
-- ----------------------------

-- ----------------------------
-- Table structure for `plat_nav`
-- ----------------------------
DROP TABLE IF EXISTS `plat_nav`;
CREATE TABLE `plat_nav` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `plat_type` varchar(1) NOT NULL,
  `nav_id` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plat_nav
-- ----------------------------
INSERT INTO `plat_nav` VALUES ('1', 'P', 'N000001');
INSERT INTO `plat_nav` VALUES ('2', 'P', 'N000002');
INSERT INTO `plat_nav` VALUES ('3', 'P', 'N000003');
INSERT INTO `plat_nav` VALUES ('4', 'P', 'N000004');

-- ----------------------------
-- Table structure for `product_category`
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
  `category_id` varchar(12) NOT NULL,
  `category_name` varchar(64) DEFAULT NULL,
  `icon` varchar(100) DEFAULT NULL,
  `parent_id` varchar(12) NOT NULL DEFAULT '0',
  `status` varchar(1) DEFAULT '0' COMMENT '0:显示，1：已删除',
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `index_corpid_protypename` (`category_name`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_category
-- ----------------------------
INSERT INTO `product_category` VALUES ('16', '生活用品1', 'icon-home', '17', '0');
INSERT INTO `product_category` VALUES ('17', '建材1', null, '0', '0');
INSERT INTO `product_category` VALUES ('18', '建材', '', '0', '0');
INSERT INTO `product_category` VALUES ('19', '家用建材', '', '18', '0');
INSERT INTO `product_category` VALUES ('20', '小家建材', '', '19', '0');
INSERT INTO `product_category` VALUES ('21', '智能家居', '', '19', '0');
INSERT INTO `product_category` VALUES ('22', '户外旅游', '', '4', '0');
INSERT INTO `product_category` VALUES ('24', '男装', '', '5', '0');
INSERT INTO `product_category` VALUES ('25', '咳嗽药类', null, '0', '0');
INSERT INTO `product_category` VALUES ('26', '医疗器械-器械', null, '0', '0');
INSERT INTO `product_category` VALUES ('27', '咳嗽糖浆类', null, '0', '0');
INSERT INTO `product_category` VALUES ('28', '处方药类', null, '0', '0');
INSERT INTO `product_category` VALUES ('29', '眼药水及鼻剂类', null, '0', '0');
INSERT INTO `product_category` VALUES ('30', '搽剂类', null, '0', '0');
INSERT INTO `product_category` VALUES ('31', '保健食品', null, '0', '0');
INSERT INTO `product_category` VALUES ('32', '贴膏类', null, '0', '0');
INSERT INTO `product_category` VALUES ('33', '非处方药', null, '0', '0');
INSERT INTO `product_category` VALUES ('34', '妇科类', null, '0', '0');
INSERT INTO `product_category` VALUES ('35', '清热解毒类', null, '0', '0');
INSERT INTO `product_category` VALUES ('36', '补肾益气类', null, '0', '0');
INSERT INTO `product_category` VALUES ('37', '成人感冒药', null, '0', '0');
INSERT INTO `product_category` VALUES ('38', '胃肠道类', null, '0', '0');
INSERT INTO `product_category` VALUES ('39', '风湿关节类', null, '0', '0');
INSERT INTO `product_category` VALUES ('4', '旅行休闲', null, '0', '0');
INSERT INTO `product_category` VALUES ('40', '非处方外用药类', null, '0', '0');
INSERT INTO `product_category` VALUES ('41', '外用喷剂类', null, '0', '0');
INSERT INTO `product_category` VALUES ('42', '抗生素类', null, '0', '0');
INSERT INTO `product_category` VALUES ('43', '心脑血管类', null, '0', '0');
INSERT INTO `product_category` VALUES ('44', '小儿感冒药', null, '0', '0');
INSERT INTO `product_category` VALUES ('45', '维生素矿物质类', null, '0', '0');
INSERT INTO `product_category` VALUES ('46', '凉茶类', null, '0', '0');
INSERT INTO `product_category` VALUES ('47', '含片类', null, '0', '0');
INSERT INTO `product_category` VALUES ('48', '外用处方药类', null, '0', '0');
INSERT INTO `product_category` VALUES ('49', '抗过敏类', null, '0', '0');
INSERT INTO `product_category` VALUES ('5', '服装服饰', null, '0', '0');
INSERT INTO `product_category` VALUES ('50', '中药饮片类', null, '0', '0');
INSERT INTO `product_category` VALUES ('51', '中药参茸类', null, '0', '0');
INSERT INTO `product_category` VALUES ('52', '日用品类', null, '0', '0');
INSERT INTO `product_category` VALUES ('53', '保健礼品', null, '0', '0');
INSERT INTO `product_category` VALUES ('54', '药酒类', null, '0', '0');
INSERT INTO `product_category` VALUES ('55', '2222', null, '26', '0');
INSERT INTO `product_category` VALUES ('6', '数码3C', null, '0', '0');
INSERT INTO `product_category` VALUES ('7', '小吃零食', null, '0', '0');
INSERT INTO `product_category` VALUES ('8', '饮料', null, '0', '0');

-- ----------------------------
-- Table structure for `product_ku`
-- ----------------------------
DROP TABLE IF EXISTS `product_ku`;
CREATE TABLE `product_ku` (
  `product_id` varchar(12) NOT NULL COMMENT '产品id,系统唯一',
  `product_name` varchar(100) NOT NULL COMMENT '产品名称',
  `product_code` varchar(40) NOT NULL COMMENT '产品条码',
  `product_no` varchar(20) DEFAULT NULL,
  `category_id` varchar(12) DEFAULT NULL COMMENT '分类id',
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`product_id`,`product_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_ku
-- ----------------------------
INSERT INTO `product_ku` VALUES ('5900', '止咳祛痰颗粒-九连山', '6927749300151', '00002', '25', null);
INSERT INTO `product_ku` VALUES ('5901', '杜斯邦加倍润滑避孕套（创美）', '6944553181493', '00009', '26', null);
INSERT INTO `product_ku` VALUES ('5902', '小儿咳喘灵口服液（维萃）', '6941734700047', '00010', '27', null);
INSERT INTO `product_ku` VALUES ('5903', '辛芩颗粒（康裕）', '6924426568194', '00029', '28', null);
INSERT INTO `product_ku` VALUES ('5904', '熊胆视清护理液（创美）', '6970101010076', '00032', '29', null);
INSERT INTO `product_ku` VALUES ('5905', '海马抑菌油-创美', '6970101011417', '00040', '30', null);

-- ----------------------------
-- Table structure for `reserve`
-- ----------------------------
DROP TABLE IF EXISTS `reserve`;
CREATE TABLE `reserve` (
  `reserve_id` varchar(12) NOT NULL,
  `from_userid` int(11) DEFAULT NULL,
  `to_userid` int(11) DEFAULT NULL,
  `doctor_id` int(11) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` varchar(4) DEFAULT NULL,
  `reserve_time` varchar(6) DEFAULT NULL,
  `reserve_date` date DEFAULT NULL,
  `reserve_address` varchar(100) DEFAULT NULL,
  `lat` varchar(12) DEFAULT NULL,
  `lng` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`reserve_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reserve
-- ----------------------------

-- ----------------------------
-- Table structure for `rights`
-- ----------------------------
DROP TABLE IF EXISTS `rights`;
CREATE TABLE `rights` (
  `right_id` varchar(20) NOT NULL COMMENT '菜单编号',
  `right_name` varchar(30) NOT NULL DEFAULT '' COMMENT '菜单名称',
  `right_icon` varchar(40) DEFAULT '' COMMENT '菜单链接classname',
  `link_url` varchar(100) DEFAULT '' COMMENT '菜单访问url，相当于actionname',
  `menu_type` varchar(1) NOT NULL DEFAULT '0' COMMENT '0.根节点 1.菜单 2.按钮',
  `oper_type` varchar(2) DEFAULT NULL,
  `parent_id` varchar(20) NOT NULL DEFAULT '0' COMMENT '菜单父节点',
  `request_url` varchar(100) DEFAULT '' COMMENT '对应的actionname',
  `status` varchar(4) DEFAULT '0' COMMENT '是否启用 0：启用，1：不启用',
  `sort` int(3) DEFAULT '255' COMMENT '菜单排序，255排在最后，0最前',
  PRIMARY KEY (`right_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of rights
-- ----------------------------
INSERT INTO `rights` VALUES ('M001', '权限管理', 'icon-setting', '', '1', null, '0', '', '0', '255');
INSERT INTO `rights` VALUES ('M001001', '菜单管理', 'icon-menu', '', '0', null, '0', '', '0', '255');
INSERT INTO `rights` VALUES ('M002', '商户管理', '', '', '0', null, '0', '', '0', '255');
INSERT INTO `rights` VALUES ('M002001', '商户管理', '', '', '0', null, '0', '', '0', '255');
INSERT INTO `rights` VALUES ('M002002', '社区医院', '', '', '0', null, '0', '', '0', '255');
INSERT INTO `rights` VALUES ('M003', '用户管理', '', '', '0', null, '0', '', '0', '255');
INSERT INTO `rights` VALUES ('M004', '参数设置', '', '', '0', null, '0', '', '0', '255');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `ifmodify` varchar(1) DEFAULT '0' COMMENT '可否修改1，不可修改，0：可以修改',
  `ifdelete` varchar(1) DEFAULT '0' COMMENT '可否删除 1，不可删除，0：可以删除',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '系统管理员', '0', '1');
INSERT INTO `role` VALUES ('2', '社区医院', '0', '0');
INSERT INTO `role` VALUES ('3', '个人用户-（医师）', '0', '0');
INSERT INTO `role` VALUES ('4', '个人用户-（患者）', '0', '0');
INSERT INTO `role` VALUES ('5', '药品供应商', '0', '0');

-- ----------------------------
-- Table structure for `rolerights`
-- ----------------------------
DROP TABLE IF EXISTS `rolerights`;
CREATE TABLE `rolerights` (
  `role_id` int(11) NOT NULL,
  `right_id` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rolerights
-- ----------------------------

-- ----------------------------
-- Table structure for `subject`
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `subject_id` varchar(10) NOT NULL DEFAULT '',
  `subject_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES ('S000001', '骨科');
INSERT INTO `subject` VALUES ('S000002', '儿科');
INSERT INTO `subject` VALUES ('S000003', '妇科');
INSERT INTO `subject` VALUES ('S000004', '脑外科');
INSERT INTO `subject` VALUES ('S000005', '肿瘤科');
INSERT INTO `subject` VALUES ('S000006', '皮肤科');
INSERT INTO `subject` VALUES ('S000007', '心外科');
INSERT INTO `subject` VALUES ('S000008', '放射科');

-- ----------------------------
-- Table structure for `travel_schedule`
-- ----------------------------
DROP TABLE IF EXISTS `travel_schedule`;
CREATE TABLE `travel_schedule` (
  `travel_id` int(11) NOT NULL AUTO_INCREMENT,
  `doctor_id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `business_date` date NOT NULL,
  `begin_time` varchar(6) DEFAULT NULL,
  `end_time` varchar(6) DEFAULT NULL,
  `travel_address` varchar(100) DEFAULT NULL,
  `lat` varchar(12) DEFAULT NULL,
  `lng` varchar(12) DEFAULT NULL,
  `status` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`travel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of travel_schedule
-- ----------------------------
INSERT INTO `travel_schedule` VALUES ('1', '1', null, '2017-11-21', '7:00', '11:00', '海南省人民医院', '0.33311', '2.3312112', '1');

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
  `email` varchar(64) DEFAULT NULL,
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
INSERT INTO `user_info` VALUES ('1', 'shinyzo', 'e997ae2621ca17c838a4f0aa6648ee2a', null, null, '15501700742', '123456789', '1', '1', null, '1', '1', '127.0.0.1', '2017-11-21 10:23:09');
INSERT INTO `user_info` VALUES ('2', 'shinyzo1', 'e997ae2621ca17c838a4f0aa6648ee2a', null, null, '15501700743', '123456787', '2', '2', null, '1', '2', '127.0.0.1', '2017-11-21 10:23:11');
