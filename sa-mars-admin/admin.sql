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
  `creator` bigint(20) NOT NULL COMMENT '创建人',
  `modifier` bigint(20) NOT NULL COMMENT '修改人',
  `gmt_created` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='系统用户表';



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
  `creator` bigint(20) NOT NULL COMMENT '创建人',
  `modifier` bigint(20) NOT NULL COMMENT '修改人',
  `gmt_created` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='系统部门表';


-- ----------------------------
--  系统角色表
-- ----------------------------
DROP TABLE IF EXISTS `sa_role`;
CREATE TABLE `sa_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色主键',
  `role_name` varchar(100) NOT NULL COMMENT '角色名称',
  `role_code` varchar(100) NOT NULL COMMENT '角色编号',
  `role_type` char(1) NOT NULL COMMENT '角色类型',
  `status` char(1) DEFAULT NULL COMMENT '角色状态',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `creator` bigint(20) NOT NULL COMMENT '创建人',
  `modifier` bigint(20) NOT NULL COMMENT '修改人',
  `gmt_created` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='系统角色表';


-- ----------------------------
--  系统用户-角色关系表
-- ----------------------------
DROP TABLE IF EXISTS `sa_user_role`;
CREATE TABLE `sa_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色主键',
  `role_id` varchar(100) NOT NULL COMMENT '角色表主键ID',
  `user_id` char(1) NOT NULL COMMENT '用户表主键ID',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `creator` bigint(20) NOT NULL COMMENT '创建人',
  `modifier` bigint(20) NOT NULL COMMENT '修改人',
  `gmt_created` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='系统用户角色关系表';


-- ----------------------------
--  系统用户-系统菜单表
-- ----------------------------
DROP TABLE IF EXISTS `sa_menu`;
CREATE TABLE `sa_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单主键',
  `menu_name` varchar(100) NOT NULL COMMENT '菜单名称',
  `menu_url` varchar(100) NOT NULL COMMENT '菜单url',
  `parent_id` bigint(20) NOT NULL COMMENT '上级菜单ID',
  `sort` bigint(20) NOT NULL COMMENT '用户表主键ID',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `creator` bigint(20) NOT NULL COMMENT '创建人',
  `modifier` bigint(20) NOT NULL COMMENT '修改人',
  `gmt_created` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='系统菜单表';


-- ----------------------------
--  系统用户-系统权限表
-- ----------------------------
DROP TABLE IF EXISTS `sa_privilege`;
CREATE TABLE `sa_privilege` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '权限主键',
  `privilege_type` varchar(100) NOT NULL COMMENT '权限分类',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `creator` bigint(20) NOT NULL COMMENT '创建人',
  `modifier` bigint(20) NOT NULL COMMENT '修改人',
  `gmt_created` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='系统权限表';


-- ----------------------------
--  系统用户-系统菜单权限表
-- ----------------------------
DROP TABLE IF EXISTS `sa_menu_privilege`;
CREATE TABLE `sa_menu_privilege` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '权限主键',
  `privilege_id` varchar(100) NOT NULL COMMENT '权限主键id',
  `menu_id` varchar(100) NOT NULL COMMENT '菜单主键id',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `creator` bigint(20) NOT NULL COMMENT '创建人',
  `modifier` bigint(20) NOT NULL COMMENT '修改人',
  `gmt_created` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='系统菜单权限表';



-- ----------------------------
--  系统用户-系统操作日志表
-- ----------------------------
DROP TABLE IF EXISTS `sa_log`;
CREATE TABLE `sa_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志主键',
  `type` int(11) NOT NULL DEFAULT '0' COMMENT '权限更新的类型，1：部门，2：用户，3：权限模块，4：权限，5：角色，6：角色用户关系，7：角色权限关系',
  `target_id` int(11) NOT NULL COMMENT '基于type后指定的对象id，比如用户、权限、角色等表的主键',
  `old_value` text COMMENT '旧值',
  `new_value` text COMMENT '新值',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '当前是否复原过，0：没有，1：复原过',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `creator` bigint(20) NOT NULL COMMENT '创建人',
  `modifier` bigint(20) NOT NULL COMMENT '修改人',
  `gmt_created` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='系统操作日志表';








