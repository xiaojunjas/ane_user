-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        4.1.22-community-nt - MySQL Community Edition (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 user 的数据库结构
CREATE DATABASE IF NOT EXISTS `user` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `user`;

-- 导出  表 user.film_movies_t 结构
CREATE TABLE IF NOT EXISTS `film_movies_t` (
  `id` bigint(20) NOT NULL auto_increment,
  `film_id` bigint(20) default NULL,
  `movies_id` bigint(20) default NULL,
  `is_deleted` int(2) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='电影影院关系表';

-- 正在导出表  user.film_movies_t 的数据：~14 rows (大约)
/*!40000 ALTER TABLE `film_movies_t` DISABLE KEYS */;
INSERT INTO `film_movies_t` (`id`, `film_id`, `movies_id`, `is_deleted`) VALUES
	(13, 1, 1, 0),
	(14, 2, 1, 0),
	(15, 3, 1, 0),
	(16, 1, 2, 0),
	(17, 2, 2, 0),
	(18, 4, 1, 0),
	(19, 5, 1, 0),
	(20, 6, 1, 0),
	(21, 7, 1, 0),
	(22, 8, 1, 0),
	(23, 9, 1, 0),
	(24, 10, 1, 0),
	(25, 11, 1, 0),
	(26, 12, 1, 0);
/*!40000 ALTER TABLE `film_movies_t` ENABLE KEYS */;

-- 导出  表 user.film_seats_t 结构
CREATE TABLE IF NOT EXISTS `film_seats_t` (
  `id` bigint(20) NOT NULL auto_increment,
  `sell_ickets` varchar(50) default NULL COMMENT '影院位置',
  `film_id` bigint(20) default NULL COMMENT '电影id',
  `user_id` bigint(20) default NULL COMMENT '用户id',
  `is_deleted` int(2) default '0',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购票信息表';

-- 正在导出表  user.film_seats_t 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `film_seats_t` DISABLE KEYS */;
INSERT INTO `film_seats_t` (`id`, `sell_ickets`, `film_id`, `user_id`, `is_deleted`) VALUES
	(1, '1_10', 1, 1, 0),
	(2, '1_9', 1, 1, 0),
	(3, '1_8', 1, 1, 0);
/*!40000 ALTER TABLE `film_seats_t` ENABLE KEYS */;

-- 导出  表 user.film_t 结构
CREATE TABLE IF NOT EXISTS `film_t` (
  `id` bigint(20) NOT NULL auto_increment,
  `name` varchar(50) default NULL COMMENT '电影名称',
  `director` varchar(50) default NULL COMMENT '导演',
  `to_star` varchar(50) default NULL COMMENT '主演',
  `release_time` varchar(50) default NULL COMMENT '上映时间',
  `score` varchar(50) default NULL COMMENT '评分',
  `is_deleted` int(11) NOT NULL default '0',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='电影信息表';

-- 正在导出表  user.film_t 的数据：~12 rows (大约)
/*!40000 ALTER TABLE `film_t` DISABLE KEYS */;
INSERT INTO `film_t` (`id`, `name`, `director`, `to_star`, `release_time`, `score`, `is_deleted`) VALUES
	(1, '大话西游', '肖军', '肖军', '2017-10-24 15:10', NULL, 0),
	(2, '速度与激情', '张三', '张三', NULL, NULL, 0),
	(3, '羞羞的铁拳', NULL, NULL, NULL, NULL, 0),
	(4, '追龙', NULL, NULL, NULL, NULL, 0),
	(5, '空天猎', NULL, NULL, NULL, NULL, 0),
	(6, '英伦对决', NULL, NULL, NULL, NULL, 0),
	(7, '反转星球', NULL, NULL, NULL, NULL, 0),
	(8, '看不见的客人', NULL, NULL, NULL, NULL, 0),
	(9, '大护法', NULL, NULL, NULL, NULL, 0),
	(10, '死侍', NULL, NULL, NULL, NULL, 0),
	(11, '出租车司机', NULL, NULL, NULL, NULL, 0),
	(12, '王牌特工2：黄金圈', NULL, NULL, NULL, NULL, 0);
/*!40000 ALTER TABLE `film_t` ENABLE KEYS */;

-- 导出  表 user.movies_address_t 结构
CREATE TABLE IF NOT EXISTS `movies_address_t` (
  `id` bigint(20) NOT NULL auto_increment,
  `name` varchar(50) default NULL COMMENT '影院名称',
  `address` varchar(50) default NULL COMMENT '影院地址',
  `longitude` varchar(50) default NULL COMMENT '经度',
  `latitude` varchar(50) default NULL COMMENT '纬度',
  `is_deleted` int(2) default '0' COMMENT '是否删除',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='影院地点表';

-- 正在导出表  user.movies_address_t 的数据：~11 rows (大约)
/*!40000 ALTER TABLE `movies_address_t` DISABLE KEYS */;
INSERT INTO `movies_address_t` (`id`, `name`, `address`, `longitude`, `latitude`, `is_deleted`) VALUES
	(1, '万达影院（五角场影院）', '上海市杨浦区五角场', '121.521339', '31.303776', 0),
	(2, '上海庆春电影城', '上海市青浦区', '121.482586', '31.238783', 0),
	(3, '万裕国际影城(淮海店)', NULL, NULL, NULL, 0),
	(4, '太平洋电影城(松江店)', NULL, NULL, NULL, 0),
	(5, '大光明剧场(儿艺店)', NULL, NULL, NULL, 0),
	(6, 'iMovie影院视听馆（静安店）', NULL, NULL, NULL, 0),
	(7, '兰馨电影院', NULL, NULL, NULL, 0),
	(8, '华谊兄弟上海影院', NULL, NULL, NULL, 0),
	(9, 'SFC上影(南桥百联店)', NULL, NULL, NULL, 0),
	(10, '浙江电影院', NULL, NULL, NULL, 0),
	(11, '上海兰生影剧院', NULL, NULL, NULL, 0);
/*!40000 ALTER TABLE `movies_address_t` ENABLE KEYS */;

-- 导出  表 user.permission_t 结构
CREATE TABLE IF NOT EXISTS `permission_t` (
  `id` bigint(20) NOT NULL auto_increment COMMENT '主键',
  `code` varchar(50) default NULL COMMENT '编号',
  `title` varchar(50) default NULL COMMENT '名称',
  `url` varchar(50) default NULL COMMENT '访问路径',
  `type` int(2) default NULL COMMENT '类型 0 模块 1功能项',
  `pid` bigint(20) default NULL COMMENT '上级菜单编号',
  `leaf` int(2) default NULL COMMENT '有无下级菜单(1有，0无)',
  `path` varchar(50) default NULL COMMENT '菜单上级关联关系',
  `sort` int(2) default NULL COMMENT '排序',
  `is_deleted` int(2) default '0' COMMENT '数据有效标识 0有效 1无效/删除',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- 正在导出表  user.permission_t 的数据：~6 rows (大约)
/*!40000 ALTER TABLE `permission_t` DISABLE KEYS */;
INSERT INTO `permission_t` (`id`, `code`, `title`, `url`, `type`, `pid`, `leaf`, `path`, `sort`, `is_deleted`) VALUES
	(1, '010000', '购物影院后台', NULL, 0, 0, 1, NULL, -1, 0),
	(8, '010100', '用户管理', NULL, 0, 1, 1, '1.', 0, 0),
	(9, '010101', '用户信息', '/aspc/user', 0, 8, 0, '1.8.', 0, 0),
	(10, '010102', '角色信息', '/aspc/role', 0, 8, 0, '1.8.', 1, 0),
	(11, '020000', '影院信息', '/aspc/cinema', 0, 1, 0, '1.', 1, 0),
	(12, '030000', '售票信息', '/aspc/ticket', 0, 1, 0, '1.', 2, 0);
/*!40000 ALTER TABLE `permission_t` ENABLE KEYS */;

-- 导出  表 user.role_permission_t 结构
CREATE TABLE IF NOT EXISTS `role_permission_t` (
  `id` bigint(20) NOT NULL auto_increment,
  `permission_id` bigint(20) default NULL COMMENT '权限id',
  `type` int(11) default NULL COMMENT '类型 1 角色权限关联，,2用户与权限关联',
  `ref_id` bigint(20) default NULL COMMENT '对应类型 type=1 (角色编号role_t.id)，type=2（用户编号user_t.id）',
  `is_deleted` bigint(20) NOT NULL default '0',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  user.role_permission_t 的数据：~9 rows (大约)
/*!40000 ALTER TABLE `role_permission_t` DISABLE KEYS */;
INSERT INTO `role_permission_t` (`id`, `permission_id`, `type`, `ref_id`, `is_deleted`) VALUES
	(32, 11, 2, 2, 1),
	(33, 1, 2, 2, 1),
	(34, 12, 2, 2, 1),
	(35, 1, 2, 2, 0),
	(36, 8, 2, 2, 1),
	(37, 9, 2, 2, 1),
	(38, 10, 2, 2, 1),
	(39, 11, 2, 2, 0),
	(40, 12, 2, 2, 0);
/*!40000 ALTER TABLE `role_permission_t` ENABLE KEYS */;

-- 导出  表 user.role_t 结构
CREATE TABLE IF NOT EXISTS `role_t` (
  `id` bigint(20) NOT NULL auto_increment,
  `name` varchar(50) default NULL COMMENT '角色名称',
  `type` bigint(20) default NULL COMMENT '角色类型',
  `remark` varchar(50) default NULL COMMENT '备注说明',
  `is_deleted` int(2) NOT NULL default '0' COMMENT '数据有效标识:0有效 1无效/删除',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  user.role_t 的数据：~11 rows (大约)
/*!40000 ALTER TABLE `role_t` DISABLE KEYS */;
INSERT INTO `role_t` (`id`, `name`, `type`, `remark`, `is_deleted`) VALUES
	(1, '管理员', 1, '能查看所有信息', 0),
	(2, '一般用户', 2, '不能查看用户管理', 0),
	(13, '1', NULL, NULL, 0),
	(14, '2', NULL, NULL, 0),
	(15, '3', NULL, NULL, 0),
	(16, '4', NULL, NULL, 0),
	(17, '5', NULL, NULL, 0),
	(18, '6', NULL, NULL, 0),
	(19, '7', NULL, NULL, 0),
	(20, '8', NULL, NULL, 0),
	(21, '9', NULL, NULL, 0);
/*!40000 ALTER TABLE `role_t` ENABLE KEYS */;

-- 导出  表 user.user_role_t 结构
CREATE TABLE IF NOT EXISTS `user_role_t` (
  `id` bigint(20) NOT NULL auto_increment,
  `user_id` bigint(20) default NULL COMMENT '用户编号(user_t.id)',
  `type` bigint(20) default NULL COMMENT '类型 1 用户关联角色 ',
  `ref_id` bigint(20) default NULL COMMENT '对应类型 type=1 (角色编号role_t.id)',
  `is_deleted` bigint(20) default NULL COMMENT '数据有效标识 0有效 1无效/删除',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  user.user_role_t 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `user_role_t` DISABLE KEYS */;
INSERT INTO `user_role_t` (`id`, `user_id`, `type`, `ref_id`, `is_deleted`) VALUES
	(11, 1, 1, 1, 0),
	(12, 2, 1, 2, 0);
/*!40000 ALTER TABLE `user_role_t` ENABLE KEYS */;

-- 导出  表 user.user_t 结构
CREATE TABLE IF NOT EXISTS `user_t` (
  `id` bigint(20) NOT NULL auto_increment,
  `login_name` varchar(50) NOT NULL default '0',
  `password` varchar(100) default NULL,
  `avatar` varchar(50) default NULL,
  `type` varchar(50) default NULL,
  `name` varchar(50) default NULL,
  `telephone` varchar(50) default NULL,
  `status` varchar(50) default NULL,
  `create_time` timestamp NULL default NULL,
  `is_deleted` int(2) default '0',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  user.user_t 的数据：~11 rows (大约)
/*!40000 ALTER TABLE `user_t` DISABLE KEYS */;
INSERT INTO `user_t` (`id`, `login_name`, `password`, `avatar`, `type`, `name`, `telephone`, `status`, `create_time`, `is_deleted`) VALUES
	(1, 'admin', '$2a$10$6LZEa1NVFMCQsifldN0wm.KLUyMpVq9MUzCcxc3EdewFsmYJm0KCy', NULL, NULL, NULL, '男', NULL, NULL, 0),
	(2, 'xiaojun', '$2a$10$6LZEa1NVFMCQsifldN0wm.KLUyMpVq9MUzCcxc3EdewFsmYJm0KCy', NULL, NULL, NULL, '男', NULL, NULL, 0),
	(3, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
	(4, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
	(5, '3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
	(6, '4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
	(7, '5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
	(8, '6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
	(9, '7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
	(10, '8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
	(11, '9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
/*!40000 ALTER TABLE `user_t` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
