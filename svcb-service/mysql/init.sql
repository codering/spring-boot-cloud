CREATE TABLE `user` (
  `id` int(13) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(33) DEFAULT NULL COMMENT '姓名',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机',
  `email` varchar(50)DEFAULT NULL COMMENT '邮箱',
  `birthday` date NULL DEFAULT NULL COMMENT '生日',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8


INSERT INTO `user`(`id`, `name`, `mobile`, `email`, `birthday`) VALUES (1, '张三', '333', NULL, NULL);
INSERT INTO `user`(`id`, `name`, `mobile`, `email`, `birthday`) VALUES (2, 'Jim', '1000232', 'jim@google.com', '2019-04-23');