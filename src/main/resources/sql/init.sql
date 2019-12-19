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
);