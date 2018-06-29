DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_uuid` varchar(32) NOT NULL,
  `nick_name` varchar(22) DEFAULT NULL COMMENT '昵称',
  `user_name` varchar(22) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `status` int(2) DEFAULT '1' COMMENT '通用状态 0:删除,1:正常',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_uid` varchar(36) DEFAULT NULL COMMENT '创建人uuid',
  `update_uid` varchar(36) DEFAULT NULL COMMENT '更新人uuid',
  `remark` varchar(255) DEFAULT NULL COMMENT '通用备注',
  `sort` int(8) DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_uuid` (`user_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';
insert into user(user_uuid,user_name,password) values(replace(UUID(),'-',''),'admin','admin');


DROP TABLE IF EXISTS `novel`;
CREATE TABLE `novel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `novel_uuid` varchar(32) NOT NULL,
  `novel_name` varchar(50) DEFAULT NULL COMMENT '小说名',
  `autor` varchar(50) NOT NULL COMMENT '作者',
  `category` varchar(22) DEFAULT NULL COMMENT '分类',
  `img_url` varchar(100) DEFAULT NULL COMMENT '封面',
  `intro` TEXT DEFAULT NULL COMMENT '简介',
  `lastchapter` varchar(50) DEFAULT NULL COMMENT '最新章节',
  `chapters` INT(4) DEFAULT NULL COMMENT '章节数',
  `size` INT(11) DEFAULT '0' COMMENT '字数',
  `lastupdate` timestamp NOT NULL COMMENT '最后更新时间',
  `status` int(2) DEFAULT '1' COMMENT '通用状态 0:删除,1:正常',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_uid` varchar(36) DEFAULT NULL COMMENT '创建人uuid',
  `update_uid` varchar(36) DEFAULT NULL COMMENT '更新人uuid',
  `remark` varchar(255) DEFAULT NULL COMMENT '通用备注',
  `sort` int(8) DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_novel_uuid` (`novel_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='小说表';


DROP TABLE IF EXISTS `chapter`;
CREATE TABLE `chapter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `chapter_uuid` varchar(32) NOT NULL,
  `chapter_name` varchar(50) DEFAULT NULL COMMENT '章节名',
  `chapter_url` varchar(100) DEFAULT NULL COMMENT '章节内容链接',
  `size` INT(11) DEFAULT '0' COMMENT '字数',
  `status` int(2) DEFAULT '1' COMMENT '通用状态 0:删除,1:正常',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_uid` varchar(36) DEFAULT NULL COMMENT '创建人uuid',
  `update_uid` varchar(36) DEFAULT NULL COMMENT '更新人uuid',
  `remark` varchar(255) DEFAULT NULL COMMENT '通用备注',
  `sort` int(8) DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_chapter_uuid` (`chapter_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='章节表';
