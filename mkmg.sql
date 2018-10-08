/*
 Navicat Premium Data Transfer

 Source Server         : fruit
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : 192.168.99.100:3306
 Source Schema         : mkmg

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 03/10/2018 11:19:33
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_share
-- ----------------------------
DROP TABLE IF EXISTS `t_share`;
CREATE TABLE `t_share`  (
  `id` int(11) NOT NULL COMMENT 'db\'s autoincrement id',
  `open_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'user\'s wechat openid',
  `share_to_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'share to openid',
  `product_id` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'produt catagory',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'user\'s share url',
  `status` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'user\'s share status.shared-have shared activated-have activated expired-have expired',
  `create_time` timestamp(0) NOT NULL COMMENT 'create time',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT 'update time',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `index_open_id`(`open_id`) USING BTREE COMMENT 'open_id_index',
  INDEX `index_share_to_id`(`share_to_id`) USING BTREE COMMENT 'share_to_id_index'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_share
-- ----------------------------
INSERT INTO `t_share` VALUES (1, 'hhskfhjdajfdljslfdjsjfdj', 'fjdlsjfldjslfdjdlsjfdluogfioio', '1', 'www.test.com', 'shared', '2018-10-02 13:31:41', NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL COMMENT 'autoincrement id',
  `user_id` int(11) NOT NULL COMMENT 'user\'s id with the min value of 10000000000\r\n',
  `name` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'user\'s name',
  `mobile` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'user\'s mobile',
  `gender` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'user\'s gender with default value of 2. 0-male 1-female 2-unknown',
  `age` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'user\'s age',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'user\'s address',
  `open_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'user\'s wechat openid',
  `create_time` timestamp(0) NOT NULL COMMENT 'create time',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT 'update time',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `index_mobile`(`mobile`) USING BTREE COMMENT 'index_mobile',
  UNIQUE INDEX `unique_user_id`(`user_id`) USING BTREE COMMENT 'unique_user_id'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1000000000, 1000000000, 'testUser', '18934345545', 'M', '6', 'baiyanglu 199nong pudong shanghai', '12345678901234567890', '2018-09-25 19:05:00', '2018-09-25 19:05:00');

SET FOREIGN_KEY_CHECKS = 1;
