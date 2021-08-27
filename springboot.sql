/*
 Navicat MySQL Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 26/02/2021 16:43:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1');
INSERT INTO `test` VALUES ('2');
INSERT INTO `test` VALUES ('3');
INSERT INTO `test` VALUES ('4');
INSERT INTO `test` VALUES ('5');
INSERT INTO `test` VALUES ('6');
INSERT INTO `test` VALUES ('7');
INSERT INTO `test` VALUES ('8');
INSERT INTO `test` VALUES ('9');
INSERT INTO `test` VALUES ('10');
INSERT INTO `test` VALUES ('11');

-- ----------------------------
-- View structure for test_view
-- ----------------------------
DROP VIEW IF EXISTS `test_view`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `test_view` AS select `test`.`id` AS `id` from `test`;

SET FOREIGN_KEY_CHECKS = 1;
