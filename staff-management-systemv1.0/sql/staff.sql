/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : staff

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-08-13 10:01:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `m_user`
-- ----------------------------
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE `m_user` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `userName` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `status` varchar(2) DEFAULT '1' COMMENT '员工状态，1-在职，0-离职',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_user
-- ----------------------------
INSERT INTO `m_user` VALUES ('1', 'admin', '21232F297A57A5A743894A0E4A801FC3', '1');

-- ----------------------------
-- Table structure for `project`
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `name` varchar(50) DEFAULT NULL COMMENT '项目名',
  `startTime` varchar(10) DEFAULT NULL COMMENT '开始时间',
  `endTime` varchar(10) DEFAULT NULL COMMENT '结束时间',
  `budget` varchar(8) DEFAULT NULL COMMENT '预算',
  `files` varchar(255) DEFAULT NULL COMMENT '项目文件',
  `principal` varchar(32) DEFAULT NULL COMMENT '负责人',
  `descr` varchar(255) DEFAULT NULL COMMENT '项目描述',
  `location` varchar(255) DEFAULT NULL COMMENT '项目所在地',
  `status` varchar(2) DEFAULT '1' COMMENT '项目状态，0-已完结，1-进行中，2-延期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('01b9fef7bf70433b830b293ab04a2211', '青骊', '2018-08-09', '2018-08-17', '4545545', 'D:\\Workspaces\\staff-management-systemv1.0\\target\\classes\\static\\upload\\3a8b5df1952a467ba41a1664b39255ff简约商务名片.psd', '07fb3e34ede0492d89768ec4f1820d42', '富士达', '阿什顿飞', '1');
INSERT INTO `project` VALUES ('4251d8ca80784e13b6ad5639402041e0', 'kkklkk', '2018-08-08', '2018-08-16', '55454545', 'D:\\Workspaces\\staff-management-systemv1.0\\target\\classes\\static\\upload\\0cd72f0d35214b94a408a4d433c839a7Word_minpian.rar', '07fb3e34ede0492d89768ec4f1820d42', '公司梵蒂冈', '谁的风格', '1');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` varchar(32) NOT NULL COMMENT '主键id',
  `name` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `descr` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `status` varchar(2) DEFAULT '1' COMMENT '角色状态',
  `comments` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('19327c11369e40c980d2afa1906594e1', '总经理', '负责公司日常管理，及一般事务的决策，并向董事长述职', '1', '');
INSERT INTO `role` VALUES ('2e18b862a2cd4ef9ac5293c780f2b58d', '项目部经理', '负责项目部日常事务，统筹项目资源', '1', '');
INSERT INTO `role` VALUES ('2fee58d915024416a94d5f770668b5f7', '保安', '负责公司安保工作', '0', '');
INSERT INTO `role` VALUES ('75f81eb804d84adbabd0bc91e268f0fb', '人力资源管理专员', '负责员工招聘', '1', '');
INSERT INTO `role` VALUES ('8f92ea4c27a54abb89c93dc6915d47f1', '财务', '公司财务管理，配合其他职能部门', '1', '');
INSERT INTO `role` VALUES ('90930738be144ce3b501b6622d832c9f', 'Java工程师', 'java开发', '1', '');
INSERT INTO `role` VALUES ('ca0f62206ab54d9585981ff8f23836b5', '保洁', '负责公司清洁', '1', '');
INSERT INTO `role` VALUES ('d9da468109f841078069fb550631f899', '董事长', '负责公司重大决策及公司战略目标制定', '1', '');
INSERT INTO `role` VALUES ('e322408acbed4a338843dbd6cd62507a', '前台', '负责前台接待', '1', '');

-- ----------------------------
-- Table structure for `staff`
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `name` varchar(20) NOT NULL COMMENT '员工姓名',
  `age` varchar(2) DEFAULT NULL COMMENT '年龄',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `phoneNum` varchar(11) DEFAULT NULL COMMENT '手机号',
  `censusRegister` varchar(255) DEFAULT NULL COMMENT '户籍',
  `position` varchar(32) DEFAULT NULL COMMENT '职位',
  `comments` varchar(255) DEFAULT NULL COMMENT '备注',
  `status` varchar(2) DEFAULT '1' COMMENT '员工状态，1-在职，0-离职',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES ('07fb3e34ede0492d89768ec4f1820d42', '王泽华', '25', '1', '河南省郑州市', '15265478921', '河南省郑州市', '19327c11369e40c980d2afa1906594e1', '', '0');
INSERT INTO `staff` VALUES ('0870bf5bdb95487685aa07d7a87ead5e', '李红梅', '23', '0', '河南省郑州市', '15265478921', '河南省郑州市', '8f92ea4c27a54abb89c93dc6915d47f1', '', '1');
INSERT INTO `staff` VALUES ('0c6c3dd9853048cb8b2fff42aeab65c2', '卡罗拉', '27', '0', '河南省郑州市', '15265478921', '河南省郑州市', '8f92ea4c27a54abb89c93dc6915d47f1', '', '1');
INSERT INTO `staff` VALUES ('0ca0b5a9cc6d4177a5ea43b79bd7cc72', '李准基', '28', '1', '河南省郑州市', '15265478921', '河南省郑州市', '2fee58d915024416a94d5f770668b5f7', '', '1');
INSERT INTO `staff` VALUES ('1bf4d69cb25848a7b8100b51ed7c7dc4', '张无忌', '28', '0', '河南省郑州市', '15265478921', '河南省郑州市', '2fee58d915024416a94d5f770668b5f7', '', '1');
INSERT INTO `staff` VALUES ('45dfe42c6a1a422e87b12a0a3ba17bc0', '李文龙', '28', '0', '河南省郑州市', '13791358951', '河南省郑州市', '75f81eb804d84adbabd0bc91e268f0fb', '', '1');
INSERT INTO `staff` VALUES ('6e3c02a2c0404864be90cd72348c104d', '林羽墨', '25', '0', '河南省郑州市', '15265478921', '河南省郑州市', 'e322408acbed4a338843dbd6cd62507a', '', '1');
INSERT INTO `staff` VALUES ('7d7ad0072ffd4accaf8abfebdec4df08', '阿斯顿', '25', '1', '河南省郑州市', '15265478921', '河南省郑州市', 'd9da468109f841078069fb550631f899', '', '1');
INSERT INTO `staff` VALUES ('8e876f55e02644f69e007f1c640528cb', '候雨欣', '25', '0', '河南省郑州市', '15265478921', '河南省郑州市', 'ca0f62206ab54d9585981ff8f23836b5', '', '1');
INSERT INTO `staff` VALUES ('9cdb238794c64cdd84d57864ef8f6149', '朱之文', '32', '1', '河南省郑州市', '15265478921', '河南省郑州市', '2e18b862a2cd4ef9ac5293c780f2b58d', '', '1');
INSERT INTO `staff` VALUES ('c54d8587be7241deaca2091c89569fdd', '赵丽娜', '28', '0', '河南省郑州市', '135878563', '河南省郑州市', '8f92ea4c27a54abb89c93dc6915d47f1', 'afasdf', '0');
INSERT INTO `staff` VALUES ('e03fe6e3b36f46f08ba1a2edfd09bcb9', '李志强', '25', '1', '河南省郑州市', '15627878878', '河南省郑州市', '75f81eb804d84adbabd0bc91e268f0fb', 'asdfsdfsd', '0');
INSERT INTO `staff` VALUES ('ef732545565a44acb1ec4c6c62564a9a', '张晓楠', '25', '1', '河南省郑州市', '1357886545', '河南省郑州市', 'ca0f62206ab54d9585981ff8f23836b5', 'adfsdafdsa', '1');
