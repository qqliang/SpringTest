/*
Navicat MySQL Data Transfer

Source Server         : cy_mysql
Source Server Version : 50716
Source Host           : 192.168.102.143:3306
Source Database       : library_saas

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-05-02 22:01:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for library_user
-- ----------------------------
DROP TABLE IF EXISTS `library_user`;
CREATE TABLE `library_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of library_user
-- ----------------------------
