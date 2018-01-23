-- ----------------------------
--  系统用户表
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sa_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `dept_id` bigint(20) NOT NULL COMMENT '归属部门',
  `login_name` varchar(100) NOT NULL COMMENT '登录名',
  `password` varchar(100) NOT NULL COMMENT '登录密码',
  `user_name` varchar(100) NOT NULL COMMENT '用户姓名',
  `email` varchar(100) DEFAULT NULL COMMENT '用户邮箱',
  `phone` varchar(100) DEFAULT NULL COMMENT '联系方式',
  `login_ip` varchar(100) DEFAULT NULL COMMENT '最后登录IP',
  `last_login_date` datetime DEFAULT NULL COMMENT '最后登录时间',
  `login_flag` varchar(64) DEFAULT NULL COMMENT '是否可登录',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `creator_id` bigint(20) NOT NULL COMMENT '创建人',
  `modifier_id` bigint(20) NOT NULL COMMENT '修改人',
  `gmt_created` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8 COMMENT='系统用户表';



-- ----------------------------
--  系统部门表
-- ----------------------------
DROP TABLE IF EXISTS `sa_dept`;
CREATE TABLE `sa_dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门主键',
  `dept_name` varchar(100) NOT NULL COMMENT '部门名称',
  `parent_id` varchar(100) NOT NULL COMMENT '上级部门id',
  `level` varchar(100) DEFAULT NULL COMMENT '部门层级',
  `sort` int(11) DEFAULT NULL COMMENT '部门在当前层级下的顺序，由小到大',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `creator_id` bigint(20) NOT NULL COMMENT '创建人',
  `modifier_id` bigint(20) NOT NULL COMMENT '修改人',
  `gmt_created` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8 COMMENT='系统部门表';




