DROP DATABASE IF EXISTS `mtodolist`;
CREATE DATABASE `mtodolist` DEFAULT CHARACTER SET utf8;

USE `mtodolist`;

-- ----------------------------
-- Table structure for task
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` text COMMENT 'description of task',
  `dueDate` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '0 represent Done，1 represents Ready, 2 represents Pending',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=122 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task
-- ----------------------------
INSERT INTO `task` VALUES ('1', 'Meet Doc Joey', 'Need to discuss my essay with Dr Joey', '2019-12-24 09:00:00', '0');
INSERT INTO `task` VALUES ('2', 'Discuss Saleforce with John', 'Bring notebook and contract', '2019-12-25 11:00:00', '1');
INSERT INTO `task` VALUES ('3', 'Cancel plane', 'Prepare service number', '2019-12-03 11:00:00', '1');
INSERT INTO `task` VALUES ('4', 'Snowblower prepare', 'Pick up at next monday', '2019-12-22 14:00:00', '1');
INSERT INTO `task` VALUES ('5', 'Take AI course', 'Take AI course on with mike', '2019-12-27 11:00:00', '2');