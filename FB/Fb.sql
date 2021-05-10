/*
 Navicat Premium Data Transfer

 Source Server         : MySQL database
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : fb

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 10/05/2021 22:22:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for messages
-- ----------------------------
DROP TABLE IF EXISTS `messages`;
CREATE TABLE `messages`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `senderID` int NOT NULL,
  `receiverID` int NOT NULL,
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `timeCreated` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of messages
-- ----------------------------
INSERT INTO `messages` VALUES (9, 1, 2, 'heelooo', '2021-05-09 00:18:41');
INSERT INTO `messages` VALUES (12, 1, 2, 'hello', '2021-05-10 19:48:46');
INSERT INTO `messages` VALUES (13, 2, 1, 'hêheheheheh', '2021-05-10 20:15:13');
INSERT INTO `messages` VALUES (14, 2, 1, 'adjskadjaksdjsak', '2021-05-10 20:15:18');
INSERT INTO `messages` VALUES (15, 1, 2, 'helllllo', '2021-05-10 20:15:28');
INSERT INTO `messages` VALUES (16, 3, 4, 'alooo', '2021-05-10 22:20:34');
INSERT INTO `messages` VALUES (17, 4, 3, 'bellooo', '2021-05-10 22:20:39');
INSERT INTO `messages` VALUES (18, 3, 4, 'block nhé', '2021-05-10 22:20:48');
INSERT INTO `messages` VALUES (19, 4, 3, 'hí hí', '2021-05-10 22:20:54');

-- ----------------------------
-- Table structure for relationship
-- ----------------------------
DROP TABLE IF EXISTS `relationship`;
CREATE TABLE `relationship`  (
  `userID` int UNSIGNED NOT NULL,
  `friendID` int UNSIGNED NOT NULL,
  `status` enum('Friend','Unfriend','Wait') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`userID`, `friendID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of relationship
-- ----------------------------
INSERT INTO `relationship` VALUES (1, 2, 'Friend');
INSERT INTO `relationship` VALUES (1, 3, 'Wait');
INSERT INTO `relationship` VALUES (1, 4, 'Wait');
INSERT INTO `relationship` VALUES (1, 5, 'Friend');
INSERT INTO `relationship` VALUES (2, 1, 'Friend');
INSERT INTO `relationship` VALUES (3, 4, 'Friend');
INSERT INTO `relationship` VALUES (4, 1, 'Wait');
INSERT INTO `relationship` VALUES (4, 3, 'Friend');
INSERT INTO `relationship` VALUES (5, 1, 'Friend');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `userID` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `passWord` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userID`) USING BTREE,
  UNIQUE INDEX `userName`(`userName`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'user1', '123456789', 'Ahii');
INSERT INTO `users` VALUES (2, 'user2', '123456789', 'HIhi');
INSERT INTO `users` VALUES (3, 'user3', '123456789', 'Haha');
INSERT INTO `users` VALUES (4, 'user4', '123456789', 'Không có tên');
INSERT INTO `users` VALUES (5, 'user5', '123456789', 'Unknown');
INSERT INTO `users` VALUES (15, 'trung1', '123456', 'Trung1');
INSERT INTO `users` VALUES (16, 'trung2', '1234564', 'Trung2');

SET FOREIGN_KEY_CHECKS = 1;
