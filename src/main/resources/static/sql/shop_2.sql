/*
Navicat MariaDB Data Transfer

Source Server         : mariaKwbbin
Source Server Version : 100500
Source Host           : localhost:3307
Source Database       : shop_2

Target Server Type    : MariaDB
Target Server Version : 100500
File Encoding         : 65001

Date: 2020-04-26 20:45:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ad
-- ----------------------------
DROP TABLE IF EXISTS `ad`;
CREATE TABLE `ad` (
  `ad_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(30) NOT NULL,
  `img_url` bigint(20) DEFAULT NULL,
  `ad_position` int(11) DEFAULT NULL,
  `ad_start_date` datetime DEFAULT NULL,
  `ad_end_date` datetime DEFAULT NULL,
  `ad_sort` int(11) DEFAULT NULL,
  ` ad_click_num` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`ad_id`),
  KEY `f_image_url_ad` (`img_url`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='广告表';

-- ----------------------------
-- Records of ad
-- ----------------------------

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `user_id` bigint(20) NOT NULL COMMENT '管理员id',
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `birthday` datetime(6) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `last_login_date` datetime(6) DEFAULT NULL,
  `login_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `registerdate` datetime(6) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `true_name` varchar(255) DEFAULT NULL,
  `user_form` int(11) DEFAULT NULL,
  `user_money` int(11) DEFAULT NULL,
  `user_photo` varchar(255) DEFAULT NULL,
  `user_qq` varchar(255) DEFAULT NULL,
  `user_score` int(11) DEFAULT NULL,
  `user_status` int(11) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='管理员表';

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('9', '1', null, null, null, 'kwbbin', 'e10adc3949ba59abbe56e057f20f883e', null, null, null, null, null, null, null, null, null, null, '1BE86C18971BB3663FFD0219621BC6E9');

-- ----------------------------
-- Table structure for coupon
-- ----------------------------
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE `coupon` (
  `coupon_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '优惠券自增id',
  `name` char(30) DEFAULT '' COMMENT '优惠券名字',
  `get_price` int(11) DEFAULT NULL COMMENT '优惠券优惠的价值',
  `reach_price` int(10) DEFAULT NULL COMMENT '优惠券需满足多少才优惠',
  `date_start` datetime DEFAULT NULL COMMENT '优惠券开始时间',
  `date_end` datetime DEFAULT NULL COMMENT '优惠券结束时间',
  `status` int(11) DEFAULT NULL COMMENT '优惠券状态',
  `desc` char(100) DEFAULT '' COMMENT '优惠券描述',
  `create_date` datetime DEFAULT NULL COMMENT '优惠券发布时间',
  PRIMARY KEY (`coupon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优惠券表';

-- ----------------------------
-- Records of coupon
-- ----------------------------

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goods_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品栏自增id',
  `goods_number` char(30) DEFAULT '' COMMENT '商品编号',
  `name` char(30) DEFAULT '' COMMENT '商品名称',
  `goods_sort_id` int(11) DEFAULT NULL COMMENT '商品二级分类',
  `collected` int(11) DEFAULT NULL COMMENT '收藏数',
  `goods_stock` int(11) DEFAULT NULL COMMENT '商品库存',
  `is_sale` int(11) DEFAULT NULL COMMENT '是否上架',
  `is_hot` int(11) DEFAULT NULL COMMENT '是否是热销产品',
  `is_new` int(11) DEFAULT NULL COMMENT '是否是新产品',
  `goods_desc` char(50) DEFAULT '' COMMENT '商品描述',
  `sale_total` int(11) DEFAULT NULL COMMENT '以及销售总量',
  `price` decimal(15,2) DEFAULT NULL COMMENT '商品价格',
  `sale_date` datetime DEFAULT NULL COMMENT '上架时间',
  `visit_num` int(11) DEFAULT NULL COMMENT '浏览量',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `spec` varchar(10) DEFAULT '' COMMENT '规格',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=144 DEFAULT CHARSET=utf8 COMMENT='物品表';

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('72', '72', '老坛酸菜', '132', '0', '996', '1', '1', '1', '舒服舒服', '444', '3.50', '2020-02-16 12:23:39', '0', '2020-02-16 12:23:39', '袋');
INSERT INTO `goods` VALUES ('73', '73', '香菇炖鸡泡面', '132', '0', '500', '1', '1', '1', '方便面', '34', '3.50', '2020-02-16 12:26:50', '0', '2020-02-16 12:26:50', '袋');
INSERT INTO `goods` VALUES ('74', '74', '香辣牛肉面', '132', '0', '500', '1', '1', '1', '方便面', '3453', '3.50', '2020-02-16 12:28:33', '0', '2020-02-16 12:28:33', '桶');
INSERT INTO `goods` VALUES ('75', '75', '旺仔小馒头', '153', '0', '4999', '1', '1', '1', '好吃', '5635', '1.00', '2020-02-16 12:32:09', '0', '2020-02-16 12:32:09', '包');
INSERT INTO `goods` VALUES ('76', '76', '蛋黄派', '153', '0', '500', '1', '1', '1', '有蛋', '2423', '3.00', '2020-02-16 12:35:26', '0', '2020-02-16 12:35:26', '袋');
INSERT INTO `goods` VALUES ('77', '77', '', '153', '0', '500', '1', '1', '1', '', '678', '6.00', '2020-02-16 13:53:11', '0', '2020-02-16 13:53:11', '');
INSERT INTO `goods` VALUES ('78', '78', '', '153', '0', '500', '1', '1', '1', '', '1234', '8.00', '2020-02-16 13:55:00', '0', '2020-02-16 13:55:00', '');
INSERT INTO `goods` VALUES ('79', '79', '一条龙辣条', '154', '0', '496', '1', '1', '1', '辣条', '4543', '1.50', '2020-02-16 17:32:11', '0', '2020-02-16 17:32:11', '包');
INSERT INTO `goods` VALUES ('80', '80', '啦啦干脆面', '154', '0', '500', '1', '1', '1', '干脆面', '33', '2.50', '2020-02-16 17:32:58', '0', '2020-02-16 17:32:58', '包');
INSERT INTO `goods` VALUES ('81', '81', '金龙火腿肠', '154', '0', '499', '1', '1', '1', '火腿肠', '45', '2.50', '2020-02-16 17:34:15', '0', '2020-02-16 17:34:15', '个');
INSERT INTO `goods` VALUES ('82', '82', '苹果', '159', '0', '50', '1', '1', '1', '苹果', '976', '10.00', '2020-02-16 17:34:54', '0', '2020-02-16 17:34:54', 'kg');
INSERT INTO `goods` VALUES ('83', '83', '橘子', '159', '0', '50', '1', '1', '1', '橘子', '454', '10.00', '2020-02-16 17:35:23', '0', '2020-02-16 17:35:23', 'kg');
INSERT INTO `goods` VALUES ('84', '84', '芒果', '159', '0', '50', '1', '1', '1', '芒果', '342', '20.00', '2020-02-16 17:35:56', '0', '2020-02-16 17:35:56', 'kg');
INSERT INTO `goods` VALUES ('85', '85', '榴莲', '159', '0', '50', '1', '1', '1', '榴莲', '234', '50.00', '2020-02-16 17:36:53', '0', '2020-02-16 17:36:53', 'kg');
INSERT INTO `goods` VALUES ('86', '86', '蛋黄派', '133', '0', '50', '1', '1', '1', '有蛋', '2342', '15.00', '2020-02-16 17:42:57', '0', '2020-02-16 17:42:57', '袋');
INSERT INTO `goods` VALUES ('87', '87', '港饼', '133', '0', '50', '1', '1', '1', '黄石港饼', '123', '15.00', '2020-02-16 17:44:08', '0', '2020-02-16 17:44:08', '盒');
INSERT INTO `goods` VALUES ('88', '88', '辣小子', '133', '0', '50', '1', '1', '1', '莱小镇', '543', '2.50', '2020-02-16 17:44:47', '0', '2020-02-16 17:44:47', '包');
INSERT INTO `goods` VALUES ('89', '89', '理论干子', '133', '0', '50', '1', '1', '1', '干子', '262', '1.50', '2020-02-16 17:45:35', '0', '2020-02-16 17:45:35', '袋');
INSERT INTO `goods` VALUES ('90', '90', '麻辣王子', '133', '0', '50', '1', '1', '1', '零售', '2424', '1.00', '2020-02-16 17:46:27', '0', '2020-02-16 17:46:27', '包');
INSERT INTO `goods` VALUES ('91', '91', '团子', '133', '0', '50', '1', '1', '1', '食品', '243', '2.00', '2020-02-16 17:47:20', '0', '2020-02-16 17:47:20', '包');
INSERT INTO `goods` VALUES ('92', '92', '袋鼠', '133', '0', '50', '1', '1', '1', '舒服舒服', '24', '3.00', '2020-02-16 17:48:02', '0', '2020-02-16 17:48:02', '袋');
INSERT INTO `goods` VALUES ('93', '93', '建立及', '133', '0', '50', '1', '1', '1', '爽肤水', '2', '3.00', '2020-02-16 17:48:36', '0', '2020-02-16 17:48:36', 'kg');
INSERT INTO `goods` VALUES ('94', '94', '了计算机', '133', '0', '50', '1', '1', '1', '零售', '4', '2.50', '2020-02-16 17:49:04', '0', '2020-02-16 17:49:04', 'kg');
INSERT INTO `goods` VALUES ('95', '95', '讲述了法律', '133', '0', '43', '1', '1', '1', '把·', '243233', '3.50', '2020-02-16 17:49:26', '0', '2020-02-16 17:49:26', 'kg');
INSERT INTO `goods` VALUES ('96', '96', '真=辣条', '133', '0', '50', '1', '1', '1', '放松放松', '2342', '2.50', '2020-02-16 17:50:08', '0', '2020-02-16 17:50:08', 'kg');
INSERT INTO `goods` VALUES ('97', '97', '啦啦啦啦', '133', '0', '50', '1', '1', '1', '舒服舒服·', '2423', '3.60', '2020-02-16 17:50:38', '0', '2020-02-16 17:50:38', '包');
INSERT INTO `goods` VALUES ('98', '98', '爽肤水·', '133', '0', '50', '1', '1', '1', '是否·', '2432', '3.00', '2020-02-16 17:51:07', '0', '2020-02-16 17:51:07', '是否');
INSERT INTO `goods` VALUES ('99', '99', '爽肤水', '133', '0', '50', '1', '1', '1', '爽肤水', '2342', '3.60', '2020-02-16 17:51:27', '0', '2020-02-16 17:51:27', '是否');
INSERT INTO `goods` VALUES ('100', '100', '桃子', '159', '0', '50', '1', '1', '1', '天天', '2342', '15.00', '2020-02-16 17:53:44', '0', '2020-02-16 17:53:44', 'kg');
INSERT INTO `goods` VALUES ('101', '101', '葡萄', '159', '0', '50', '1', '1', '1', '是否', '2342', '25.00', '2020-02-16 17:54:40', '0', '2020-02-16 17:54:40', 'kg');
INSERT INTO `goods` VALUES ('102', '102', '西瓜', '159', '0', '50', '1', '1', '1', '大西瓜', '54', '10.00', '2020-02-16 17:55:27', '0', '2020-02-16 17:55:27', 'kg');
INSERT INTO `goods` VALUES ('103', '103', '欧莱雅', '135', '0', '15', '1', '1', '1', '水电费', '1', '38.50', '2020-03-16 12:31:08', '0', '2020-03-16 12:31:08', '盒');
INSERT INTO `goods` VALUES ('104', '104', '石田葡萄酒', '148', '0', '15', '1', '1', '1', '水电费', '2', '2222.80', '2020-03-16 12:32:01', '0', '2020-03-16 12:32:01', '瓶');
INSERT INTO `goods` VALUES ('105', '105', '大米面粉1', '139', '0', '15', '1', '1', '1', '发师德师风', '3', '45.00', '2020-03-16 12:32:41', '0', '2020-03-16 12:32:41', '袋');
INSERT INTO `goods` VALUES ('106', '106', '佳洁士', '135', '0', '12', '1', '1', '1', '爽肤水', '45', '22.00', '2020-03-21 11:44:48', '0', '2020-03-21 11:44:48', '盒');
INSERT INTO `goods` VALUES ('107', '107', '爽肤水', '135', '0', '12', '1', '1', '1', '胜多负少是非法的', '46', '12.00', '2020-03-21 11:45:26', '0', '2020-03-21 11:45:26', 'kg');
INSERT INTO `goods` VALUES ('108', '108', '大师傅', '135', '0', '12', '1', '1', '1', '双方都第三方', '34', '54.00', '2020-03-21 11:45:53', '0', '2020-03-21 11:45:53', 'kg');
INSERT INTO `goods` VALUES ('109', '109', '宝宝金水', '135', '0', '12', '1', '1', '1', '是否', '567', '45.00', '2020-03-21 11:46:22', '0', '2020-03-21 11:46:22', 'kg');
INSERT INTO `goods` VALUES ('110', '110', '爱皮肤', '137', '0', '12', '1', '1', '1', '', '456', '34.00', '2020-03-21 11:46:55', '0', '2020-03-21 11:46:55', '盒');
INSERT INTO `goods` VALUES ('111', '111', '美丽丽', '138', '0', '12', '1', '1', '1', '大师傅', '453', '45.00', '2020-03-21 11:47:19', '0', '2020-03-21 11:47:19', '盒');
INSERT INTO `goods` VALUES ('112', '112', '拉布', '137', '0', '12', '1', '1', '1', '是否', '32', '43.90', '2020-03-21 11:49:48', '0', '2020-03-21 11:49:48', '爽肤水');
INSERT INTO `goods` VALUES ('113', '113', '生鲜水', '136', '0', '12', '1', '1', '1', 'sdfsdf', '246', '123.00', '2020-03-21 11:50:25', '0', '2020-03-21 11:50:25', 'g');
INSERT INTO `goods` VALUES ('114', '114', '双方都', '136', '0', '12', '1', '1', '1', '是否', '45', '34.00', '2020-03-21 11:50:44', '0', '2020-03-21 11:50:44', '和');
INSERT INTO `goods` VALUES ('115', '115', '是否', '136', '0', '12', '1', '1', '1', '分', '24', '34.00', '2020-03-21 11:51:01', '0', '2020-03-21 11:51:01', '是否s');
INSERT INTO `goods` VALUES ('116', '116', '是否', '136', '0', '12', '1', '1', '1', '是否', '34', '67.00', '2020-03-21 11:51:15', '0', '2020-03-21 11:51:15', '4让');
INSERT INTO `goods` VALUES ('117', '117', '是否', '135', '0', '12', '1', '1', '1', '固定', '4', '4.00', '2020-03-21 11:51:53', '0', '2020-03-21 11:51:53', '是');
INSERT INTO `goods` VALUES ('118', '118', '六六六', '136', '0', '12', '1', '1', '1', '是否', '5', '56.00', '2020-03-21 11:52:37', '0', '2020-03-21 11:52:37', '是否');
INSERT INTO `goods` VALUES ('119', '119', '是否', '136', '0', '12', '1', '1', '1', '是否', '32', '34.00', '2020-03-21 11:52:57', '0', '2020-03-21 11:52:57', 'g');
INSERT INTO `goods` VALUES ('120', '120', '是否', '136', '0', '12', '1', '1', '1', '是否', '55', '3.00', '2020-03-21 11:53:27', '0', '2020-03-21 11:53:27', '是否');
INSERT INTO `goods` VALUES ('121', '121', '是水', '134', '0', '12', '1', '1', '1', '地方', '56', '3.00', '2020-03-21 11:54:22', '0', '2020-03-21 11:54:22', '是否');
INSERT INTO `goods` VALUES ('122', '122', 'qq水', '134', '0', '12', '1', '1', '1', '1', '443', '4.00', '2020-03-21 11:54:42', '0', '2020-03-21 11:54:42', 'g');
INSERT INTO `goods` VALUES ('123', '123', 't水', '134', '0', '12', '1', '1', '1', '水电费', '456', '43.00', '2020-03-21 11:55:03', '0', '2020-03-21 11:55:03', 'g');
INSERT INTO `goods` VALUES ('124', '124', 'a水', '134', '0', '12', '1', '1', '1', '', '214', '3.00', '2020-03-21 11:55:24', '0', '2020-03-21 11:55:24', 'g');
INSERT INTO `goods` VALUES ('125', '125', 'k水', '134', '0', '12', '1', '1', '1', '是否1', '236', '5.00', '2020-03-21 11:55:40', '0', '2020-03-21 11:55:40', 'g');
INSERT INTO `goods` VALUES ('126', '126', 'a葡萄酒', '148', '0', '12', '1', '1', '1', 'sf', '234', '45.00', '2020-03-21 11:56:05', '0', '2020-03-21 11:56:05', 'sf');
INSERT INTO `goods` VALUES ('127', '127', 'rrr葡萄酒', '148', '0', '12', '1', '1', '1', 'sfsf', '345', '456.00', '2020-03-21 11:56:27', '0', '2020-03-21 11:56:27', 'g');
INSERT INTO `goods` VALUES ('128', '128', 'yyy葡萄酒', '148', '0', '12', '1', '1', '1', 'sfdffw', '379', '457.00', '2020-03-21 11:56:46', '0', '2020-03-21 11:56:46', 'g');
INSERT INTO `goods` VALUES ('129', '129', '13葡萄酒', '148', '0', '12', '1', '1', '1', 'sfsa', '528', '78.00', '2020-03-21 11:57:02', '0', '2020-03-21 11:57:02', 'g');
INSERT INTO `goods` VALUES ('130', '130', 'gt葡萄酒', '148', '0', '12', '1', '1', '1', 'sf', '369', '564.00', '2020-03-21 11:57:20', '0', '2020-03-21 11:57:20', 'g');
INSERT INTO `goods` VALUES ('131', '131', 'ste酒', '150', '0', '12', '1', '1', '1', 'ere', '358', '432.00', '2020-03-21 11:57:50', '0', '2020-03-21 11:57:50', 'tt');
INSERT INTO `goods` VALUES ('132', '132', 'sfsf酒', '150', '0', '12', '1', '1', '1', 'sfs', '383', '12.00', '2020-03-21 11:58:06', '0', '2020-03-21 11:58:06', 'er');
INSERT INTO `goods` VALUES ('133', '133', '5653酒', '150', '0', '12', '1', '1', '1', 'tr', '260', '65.00', '2020-03-21 11:58:25', '0', '2020-03-21 11:58:25', 'tr');
INSERT INTO `goods` VALUES ('134', '134', 'sf1酒', '150', '0', '12', '1', '2', '1', 'sf', '463', '43.00', '2020-03-21 11:59:27', '0', '2020-03-21 11:59:27', 'sf');
INSERT INTO `goods` VALUES ('135', '135', 'tr酒', '150', '0', '12', '1', '2', '1', 'sf1', '733', '41.00', '2020-03-21 11:59:44', '0', '2020-03-21 11:59:44', 'sf1');
INSERT INTO `goods` VALUES ('136', '136', 'uu酒', '150', '0', '12', '1', '2', '1', 'ytu', '372', '90.00', '2020-03-21 12:00:03', '0', '2020-03-21 12:00:03', 'g');
INSERT INTO `goods` VALUES ('137', '137', 'gh酒', '151', '0', '12', '1', '2', '1', 'sf', '435', '666.00', '2020-03-21 12:00:24', '0', '2020-03-21 12:00:24', 'sf');
INSERT INTO `goods` VALUES ('138', '138', 'sff酒', '151', '0', '12', '1', '2', '2', 'sf', '46', '544.00', '2020-03-21 12:00:45', '0', '2020-03-21 12:00:45', 'sf');
INSERT INTO `goods` VALUES ('139', '139', 'wsf', '135', '0', '12', '1', '2', '2', 'sf', '392', '44.00', '2020-03-21 12:03:29', '0', '2020-03-21 12:03:29', 'sf');
INSERT INTO `goods` VALUES ('140', '140', 'sfsffs', '135', '0', '12', '1', '2', '2', '', '203', '43.00', '2020-03-21 12:03:41', '0', '2020-03-21 12:03:41', 'sf');
INSERT INTO `goods` VALUES ('141', '141', 'ff汁', '146', '0', '12', '1', '2', '2', 'sf', '107', '33.00', '2020-03-21 12:04:21', '0', '2020-03-21 12:04:21', 's');
INSERT INTO `goods` VALUES ('142', '142', '33汁', '146', '0', '12', '1', '2', '2', 'sf', '3543', '78.00', '2020-03-21 12:04:38', '0', '2020-03-21 12:04:38', 'sf');
INSERT INTO `goods` VALUES ('143', '143', '哈哈洗面奶', '135', '0', '34', '1', '1', '1', '水电费第三方第三方', '0', '34.00', '2020-04-24 10:35:48', '0', '2020-04-24 10:35:48', '盒');

-- ----------------------------
-- Table structure for goods_shop
-- ----------------------------
DROP TABLE IF EXISTS `goods_shop`;
CREATE TABLE `goods_shop` (
  `shop_id` int(11) NOT NULL COMMENT '店铺外键id',
  `goods_id` bigint(11) NOT NULL COMMENT '商品外键id',
  PRIMARY KEY (`shop_id`,`goods_id`),
  KEY `f_goods_shop_goods` (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品所属店家关系表';

-- ----------------------------
-- Records of goods_shop
-- ----------------------------

-- ----------------------------
-- Table structure for goods_sort
-- ----------------------------
DROP TABLE IF EXISTS `goods_sort`;
CREATE TABLE `goods_sort` (
  `goods_id` bigint(20) NOT NULL,
  `goods_sort_two` int(11) NOT NULL COMMENT '二级分类id',
  PRIMARY KEY (`goods_id`,`goods_sort_two`),
  KEY `f_goods_sort_sort` (`goods_sort_two`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品和分类关系表';

-- ----------------------------
-- Records of goods_sort
-- ----------------------------

-- ----------------------------
-- Table structure for goods_sort_one
-- ----------------------------
DROP TABLE IF EXISTS `goods_sort_one`;
CREATE TABLE `goods_sort_one` (
  `goods_sort_one_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品一级分类id',
  `sort_name` char(30) DEFAULT '' COMMENT '一级分类名称',
  `state` tinyint(4) NOT NULL DEFAULT 0 COMMENT '0为上架，1位下架',
  PRIMARY KEY (`goods_sort_one_id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='物品分类一级目录';

-- ----------------------------
-- Records of goods_sort_one
-- ----------------------------
INSERT INTO `goods_sort_one` VALUES ('25', '食品', '0');
INSERT INTO `goods_sort_one` VALUES ('26', '酒品饮料', '0');
INSERT INTO `goods_sort_one` VALUES ('27', '美容护理', '0');
INSERT INTO `goods_sort_one` VALUES ('28', '粮油副食', '0');

-- ----------------------------
-- Table structure for goods_sort_one_two
-- ----------------------------
DROP TABLE IF EXISTS `goods_sort_one_two`;
CREATE TABLE `goods_sort_one_two` (
  `goods_sort_one_id` int(11) NOT NULL COMMENT '一级分类的id',
  `good_sort_two_id` int(11) NOT NULL COMMENT '二级分类id',
  PRIMARY KEY (`goods_sort_one_id`,`good_sort_two_id`),
  KEY `f_goods_sort_one_two` (`goods_sort_one_id`),
  KEY `f_goods_sort_two_one` (`good_sort_two_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品分类一级二级关系目录';

-- ----------------------------
-- Records of goods_sort_one_two
-- ----------------------------
INSERT INTO `goods_sort_one_two` VALUES ('25', '132');
INSERT INTO `goods_sort_one_two` VALUES ('25', '133');
INSERT INTO `goods_sort_one_two` VALUES ('25', '152');
INSERT INTO `goods_sort_one_two` VALUES ('25', '153');
INSERT INTO `goods_sort_one_two` VALUES ('25', '154');
INSERT INTO `goods_sort_one_two` VALUES ('25', '155');
INSERT INTO `goods_sort_one_two` VALUES ('25', '156');
INSERT INTO `goods_sort_one_two` VALUES ('25', '157');
INSERT INTO `goods_sort_one_two` VALUES ('25', '158');
INSERT INTO `goods_sort_one_two` VALUES ('25', '159');
INSERT INTO `goods_sort_one_two` VALUES ('26', '134');
INSERT INTO `goods_sort_one_two` VALUES ('26', '146');
INSERT INTO `goods_sort_one_two` VALUES ('26', '147');
INSERT INTO `goods_sort_one_two` VALUES ('26', '148');
INSERT INTO `goods_sort_one_two` VALUES ('26', '149');
INSERT INTO `goods_sort_one_two` VALUES ('26', '150');
INSERT INTO `goods_sort_one_two` VALUES ('26', '151');
INSERT INTO `goods_sort_one_two` VALUES ('27', '135');
INSERT INTO `goods_sort_one_two` VALUES ('27', '136');
INSERT INTO `goods_sort_one_two` VALUES ('27', '137');
INSERT INTO `goods_sort_one_two` VALUES ('27', '138');
INSERT INTO `goods_sort_one_two` VALUES ('28', '139');
INSERT INTO `goods_sort_one_two` VALUES ('28', '141');
INSERT INTO `goods_sort_one_two` VALUES ('28', '142');
INSERT INTO `goods_sort_one_two` VALUES ('28', '143');
INSERT INTO `goods_sort_one_two` VALUES ('28', '144');
INSERT INTO `goods_sort_one_two` VALUES ('28', '145');

-- ----------------------------
-- Table structure for goods_sort_two
-- ----------------------------
DROP TABLE IF EXISTS `goods_sort_two`;
CREATE TABLE `goods_sort_two` (
  `goods_sort_two_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品二级标题自增id',
  `sort_name` char(30) DEFAULT '' COMMENT '二级标题',
  `hot_num` int(11) unsigned DEFAULT 0 COMMENT '1为热门，0为正常',
  `state` tinyint(255) NOT NULL DEFAULT 0 COMMENT '是否有效，1位无效，0为有效',
  PRIMARY KEY (`goods_sort_two_id`)
) ENGINE=InnoDB AUTO_INCREMENT=160 DEFAULT CHARSET=utf8 COMMENT='物品分类二级目录';

-- ----------------------------
-- Records of goods_sort_two
-- ----------------------------
INSERT INTO `goods_sort_two` VALUES ('132', '方便食品', '1', '0');
INSERT INTO `goods_sort_two` VALUES ('133', '休闲食品', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('134', '碳酸饮料', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('135', '洗面奶', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('136', '男士护理', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('137', '女性护理', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('138', '美容护肤', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('139', '大米面粉', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('141', '菌菇干货', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('142', '健康杂粮', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('143', '调味酱', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('144', '食用油', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('145', '厨房调料', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('146', '果蔬汁饮料', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('147', '功能饮料', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('148', '葡萄酒', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('149', '红酒', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('150', '白酒', '1', '0');
INSERT INTO `goods_sort_two` VALUES ('151', '药酒', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('152', '饼干薯片', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('153', '膨化食品', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('154', '休闲零食', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('155', '糖果巧克力', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('156', '冲饮食品', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('157', '罐头食品', '0', '0');
INSERT INTO `goods_sort_two` VALUES ('158', '蔬菜', '1', '0');
INSERT INTO `goods_sort_two` VALUES ('159', '水果', '1', '0');

-- ----------------------------
-- Table structure for images
-- ----------------------------
DROP TABLE IF EXISTS `images`;
CREATE TABLE `images` (
  `image_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图片自增id',
  `image_url` char(200) DEFAULT '' COMMENT '商品图片url',
  `image_desc` char(200) DEFAULT '' COMMENT '图片描述',
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8 COMMENT='所有图片';

-- ----------------------------
-- Records of images
-- ----------------------------
INSERT INTO `images` VALUES ('56', 'F://shop//images//goods//1261ba92-9be5-480c-83c7-ab39ca783b50.jpg', '图片');
INSERT INTO `images` VALUES ('57', 'F://shop//images//goods//32738246-943d-43ad-8b93-fbdcfc50323d.png', '图片');
INSERT INTO `images` VALUES ('58', 'F://shop//images//goods//cc6fbea4-c53b-4f85-880b-0fa3fc92f392.jpg', '图片');
INSERT INTO `images` VALUES ('59', 'F://shop//images//goods//75d54335-f908-4492-b021-0644cd75f237.png', '图片');
INSERT INTO `images` VALUES ('60', 'F://shop//images//goods//7534e505-6d08-400b-b13e-47ee82d26ace.png', '图片');
INSERT INTO `images` VALUES ('61', 'F://shop//images//goods//2ab6a1ed-70d2-4871-b645-c14d38cfbedb.png', '图片');
INSERT INTO `images` VALUES ('62', 'F://shop//images//goods//ad862812-292a-4de3-bce6-bad382b98814.jpg', '图片');
INSERT INTO `images` VALUES ('63', 'F://shop//images//goods//cf085915-9e81-4f56-a5ae-f9fe88e1ed3c.jpg', '图片');
INSERT INTO `images` VALUES ('64', 'F://shop//images//goods//9c7efaa2-f576-41e5-9c1b-3f03f152b18a.jpg', '图片');
INSERT INTO `images` VALUES ('65', 'F://shop//images//goods//61f72e1a-6a25-492c-b022-319c78b5aca8.jpg', '图片');
INSERT INTO `images` VALUES ('66', 'F://shop//images//goods//f5078a23-d204-4608-b0cd-8853425108f1.jpg', '图片');
INSERT INTO `images` VALUES ('67', 'F://shop//images//goods//69fdacb8-c048-410b-a6e6-850922f447d2.jpg', '图片');
INSERT INTO `images` VALUES ('68', 'F://shop//images//goods//da98278c-d7b8-4fdf-a4b5-720f26295b03.png', '图片');
INSERT INTO `images` VALUES ('69', 'F://shop//images//goods//868818e2-bed0-411f-ad44-7b8c475b34f2.jpg', '图片');
INSERT INTO `images` VALUES ('70', 'F://shop//images//goods//74355a6b-e372-4384-8b9d-65eb2cd228b2.png', '图片');
INSERT INTO `images` VALUES ('71', 'F://shop//images//goods//72726197-c3e1-476d-bc65-2195b663e3df.jpg', '图片');
INSERT INTO `images` VALUES ('72', 'F://shop//images//goods//0b0eeeda-79af-4e27-bf03-8c3ad1b69035.jpg', '图片');
INSERT INTO `images` VALUES ('73', 'F://shop//images//goods//4f6cec35-1ec9-4882-8e41-88c1e018845d.png', '图片');
INSERT INTO `images` VALUES ('74', 'F://shop//images//goods//a65ad747-afd3-468f-823b-8b98187a8855.jpg', '图片');
INSERT INTO `images` VALUES ('75', 'F://shop//images//goods//5102e7b1-ff02-4a87-932a-203891645487.png', '图片');
INSERT INTO `images` VALUES ('76', 'F://shop//images//goods//40c9d1e4-8714-4019-96de-c196ee6f7d46.jpg', '图片');
INSERT INTO `images` VALUES ('77', 'F://shop//images//goods//fd7debb3-014b-405f-8c53-d0f91050a6ff.jpg', '图片');
INSERT INTO `images` VALUES ('78', 'F://shop//images//goods//3473acc5-0877-4de2-87d8-10160bdb1cff.png', '图片');
INSERT INTO `images` VALUES ('79', 'F://shop//images//goods//48b25602-acad-4fdc-b480-d2e59ded033d.jpg', '图片');
INSERT INTO `images` VALUES ('80', 'F://shop//images//goods//521c38f7-f9b8-4da3-8796-570f889d0e41.jpg', '图片');
INSERT INTO `images` VALUES ('81', 'F://shop//images//goods//c9bfb2b7-68a6-422c-b9f6-77eb2907d2a9.jpg', '图片');
INSERT INTO `images` VALUES ('82', 'F://shop//images//goods//f2cd64e1-ae56-416a-8f41-7db12f4f04b7.jpg', '图片');
INSERT INTO `images` VALUES ('83', 'F://shop//images//goods//8b1a31b4-64bb-4103-8dea-0d5538d81fd2.jpg', '图片');
INSERT INTO `images` VALUES ('84', 'F://shop//images//goods//dcce6dbb-19aa-49c5-ba96-0a9a682a8019.jpg', '图片');
INSERT INTO `images` VALUES ('85', 'F://shop//images//goods//c69a46f6-0cb0-4e7d-b7b8-b9ed157ca0fc.jpg', '图片');
INSERT INTO `images` VALUES ('86', 'F://shop//images//goods//1e83e95c-5c0c-4ac7-89f1-04c039e02234.jpg', '图片');
INSERT INTO `images` VALUES ('87', 'F://shop//images//goods//ca784143-ce3a-4314-a6e2-3b5c8b633d40.jpg', '图片');
INSERT INTO `images` VALUES ('88', 'F://shop//images//goods//4bcccb17-02c4-4350-ab9f-db2f3cfb860b.png', '图片');
INSERT INTO `images` VALUES ('89', 'F://shop//images//goods//5837114a-f4e9-466c-b5a4-a3e6c1cd717b.jpg', '图片');
INSERT INTO `images` VALUES ('90', 'F://shop//images//goods//a54b2e18-8e49-47d4-bbb3-b1d3eb915b79.png', '图片');
INSERT INTO `images` VALUES ('91', 'F://shop//images//goods//1779b51a-5116-42b0-8c6d-ae3ebaff1221.jpg', '图片');
INSERT INTO `images` VALUES ('92', 'F://shop//images//goods//35d95075-98b6-46d0-aa06-3498d4486c4b.jpg', '图片');
INSERT INTO `images` VALUES ('93', 'F://shop//images//goods//225e83aa-5b42-4df9-a675-16c86cd0b712.jpg', '图片');
INSERT INTO `images` VALUES ('94', 'F://shop//images//goods//83a3471b-511c-43c4-9685-27bfe0862198.jpg', '图片');
INSERT INTO `images` VALUES ('95', 'F://shop//images//goods//3c1b16e3-5805-43a2-bc17-668656e733bc.jpg', '图片');
INSERT INTO `images` VALUES ('96', 'F://shop//images//goods//47b4f1a6-fa8b-4e5d-8f9c-563410a94673.jpg', '图片');
INSERT INTO `images` VALUES ('97', 'F://shop//images//goods//a210d8ab-79ae-4a12-a94f-a45a51f74c74.jpg', '图片');
INSERT INTO `images` VALUES ('98', 'F://shop//images//goods//e84ff51d-32ae-454c-9635-4b34cd784767.jpg', '图片');
INSERT INTO `images` VALUES ('99', 'F://shop//images//goods//5c0d6953-7fa8-4859-94bc-fb74b54f2027.jpg', '图片');
INSERT INTO `images` VALUES ('100', 'F://shop//images//goods//9cc47460-84c7-4619-9c49-163d692fbd1b.jpg', '图片');
INSERT INTO `images` VALUES ('101', 'F://shop//images//goods//8e231e55-03af-420d-bf41-a4293a1d08bd.jpg', '图片');
INSERT INTO `images` VALUES ('102', 'F://shop//images//goods//e4f6ddf8-e4a7-4a15-84a8-4d6605a25c14.jpg', '图片');
INSERT INTO `images` VALUES ('103', 'F://shop//images//goods//3e4e028f-dc91-4ac7-8ee4-0ac4b057977f.jpg', '图片');
INSERT INTO `images` VALUES ('104', 'F://shop//images//goods//567519cd-611c-4c68-8f2e-e28632174344.png', '图片');
INSERT INTO `images` VALUES ('105', 'F://shop//images//goods//cf09b173-2c94-49b7-b98a-1d4e309cc82d.jpg', '图片');
INSERT INTO `images` VALUES ('106', 'F://shop//images//goods//d220461a-ac0e-438a-9adf-c517f09604dd.jpg', '图片');
INSERT INTO `images` VALUES ('107', 'F://shop//images//goods//dd63599d-14a8-4b30-b3cc-13bcf5c4d9ef.png', '图片');
INSERT INTO `images` VALUES ('108', 'F://shop//images//goods//fe51974d-79f2-472a-9551-2df81d25f3e7.jpg', '图片');
INSERT INTO `images` VALUES ('109', 'F://shop//images//goods//723f6121-71c0-4287-b4a1-5b55a446b832.jpg', '图片');
INSERT INTO `images` VALUES ('110', 'F://shop//images//goods//471d47d0-13a3-4eef-82ab-87780bc32792.png', '图片');
INSERT INTO `images` VALUES ('111', 'F://shop//images//goods//293c7bf4-4583-4614-b479-8b576d6fdc52.jpg', '图片');
INSERT INTO `images` VALUES ('112', 'F://shop//images//goods//092fcd7f-aa4a-4f03-85aa-b1c11e40cadb.jpg', '图片');
INSERT INTO `images` VALUES ('113', 'F://shop//images//goods//948370ce-1772-4161-ab00-15e8a3456e22.jpg', '图片');
INSERT INTO `images` VALUES ('114', 'F://shop//images//goods//49387a90-0820-4762-a48d-42408fcc2311.jpg', '图片');
INSERT INTO `images` VALUES ('115', 'F://shop//images//goods//389baca6-c308-4c78-94ed-1ad6b320f88b.jpg', '图片');
INSERT INTO `images` VALUES ('116', 'F://shop//images//goods//f7922190-88fd-4ced-b52e-e6af425cb173.jpg', '图片');
INSERT INTO `images` VALUES ('117', 'F://shop//images//goods//e88fea11-a95a-4579-b6c4-83d19fbc4af9.jpg', '图片');
INSERT INTO `images` VALUES ('118', 'F://shop//images//goods//6615a3d9-9962-4106-8a43-8824ef2e8ee8.jpg', '图片');
INSERT INTO `images` VALUES ('119', 'F://shop//images//goods//4c624f19-f81b-4f3c-a0ff-2cf7772789eb.jpg', '图片');
INSERT INTO `images` VALUES ('120', 'F://shop//images//goods//d8b23dd9-fa27-412e-a0e3-c6ea005e4288.png', '图片');
INSERT INTO `images` VALUES ('121', 'F://shop//images//goods//d88a75f7-a263-4964-95d8-bd7dc5e02a7b.png', '图片');
INSERT INTO `images` VALUES ('122', 'F://shop//images//goods//c1414db1-7a4a-4eac-aa0f-59712ab41079.jpg', '图片');
INSERT INTO `images` VALUES ('123', 'F://shop//images//goods//58e8307f-c7ce-4641-a26f-e6215a5fea7f.jpg', '图片');
INSERT INTO `images` VALUES ('124', 'F://shop//images//goods//5e68e7bc-3b4d-40ba-9545-b38742ccff69.jpg', '图片');
INSERT INTO `images` VALUES ('125', 'F://shop//images//goods//b5dda7ab-f90e-45b1-af2f-cace4d50ab21.png', '图片');
INSERT INTO `images` VALUES ('126', 'F://shop//images//goods//a2635b2e-e7cf-45eb-b7ab-6bb1a0ae0b4f.jpg', '图片');
INSERT INTO `images` VALUES ('127', 'F://shop//images//goods//d611663c-cf10-4704-9f1e-db9f9c449b9e.jpg', '图片');
INSERT INTO `images` VALUES ('128', 'F://shop//images//goods//57fe4f83-0100-4d00-a816-19c870d96b1f.png', '图片');

-- ----------------------------
-- Table structure for images_goods
-- ----------------------------
DROP TABLE IF EXISTS `images_goods`;
CREATE TABLE `images_goods` (
  `goods_id` bigint(20) NOT NULL COMMENT '商品外键id',
  `image_id` bigint(20) NOT NULL COMMENT '图片外键id',
  PRIMARY KEY (`goods_id`,`image_id`),
  KEY `f_image_image_id` (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品对应的图片';

-- ----------------------------
-- Records of images_goods
-- ----------------------------
INSERT INTO `images_goods` VALUES ('72', '56');
INSERT INTO `images_goods` VALUES ('73', '58');
INSERT INTO `images_goods` VALUES ('74', '59');
INSERT INTO `images_goods` VALUES ('75', '60');
INSERT INTO `images_goods` VALUES ('76', '61');
INSERT INTO `images_goods` VALUES ('77', '61');
INSERT INTO `images_goods` VALUES ('78', '61');
INSERT INTO `images_goods` VALUES ('79', '62');
INSERT INTO `images_goods` VALUES ('80', '63');
INSERT INTO `images_goods` VALUES ('81', '64');
INSERT INTO `images_goods` VALUES ('82', '65');
INSERT INTO `images_goods` VALUES ('83', '66');
INSERT INTO `images_goods` VALUES ('84', '67');
INSERT INTO `images_goods` VALUES ('85', '68');
INSERT INTO `images_goods` VALUES ('86', '69');
INSERT INTO `images_goods` VALUES ('87', '70');
INSERT INTO `images_goods` VALUES ('88', '71');
INSERT INTO `images_goods` VALUES ('89', '72');
INSERT INTO `images_goods` VALUES ('90', '73');
INSERT INTO `images_goods` VALUES ('91', '74');
INSERT INTO `images_goods` VALUES ('92', '75');
INSERT INTO `images_goods` VALUES ('93', '76');
INSERT INTO `images_goods` VALUES ('94', '77');
INSERT INTO `images_goods` VALUES ('95', '78');
INSERT INTO `images_goods` VALUES ('96', '79');
INSERT INTO `images_goods` VALUES ('97', '80');
INSERT INTO `images_goods` VALUES ('98', '81');
INSERT INTO `images_goods` VALUES ('99', '82');
INSERT INTO `images_goods` VALUES ('100', '83');
INSERT INTO `images_goods` VALUES ('101', '84');
INSERT INTO `images_goods` VALUES ('102', '85');
INSERT INTO `images_goods` VALUES ('103', '86');
INSERT INTO `images_goods` VALUES ('104', '87');
INSERT INTO `images_goods` VALUES ('105', '88');
INSERT INTO `images_goods` VALUES ('106', '89');
INSERT INTO `images_goods` VALUES ('107', '90');
INSERT INTO `images_goods` VALUES ('108', '91');
INSERT INTO `images_goods` VALUES ('109', '92');
INSERT INTO `images_goods` VALUES ('110', '93');
INSERT INTO `images_goods` VALUES ('111', '94');
INSERT INTO `images_goods` VALUES ('112', '96');
INSERT INTO `images_goods` VALUES ('113', '97');
INSERT INTO `images_goods` VALUES ('114', '98');
INSERT INTO `images_goods` VALUES ('115', '99');
INSERT INTO `images_goods` VALUES ('116', '100');
INSERT INTO `images_goods` VALUES ('117', '102');
INSERT INTO `images_goods` VALUES ('118', '103');
INSERT INTO `images_goods` VALUES ('119', '104');
INSERT INTO `images_goods` VALUES ('120', '105');
INSERT INTO `images_goods` VALUES ('121', '106');
INSERT INTO `images_goods` VALUES ('122', '107');
INSERT INTO `images_goods` VALUES ('123', '108');
INSERT INTO `images_goods` VALUES ('124', '109');
INSERT INTO `images_goods` VALUES ('125', '110');
INSERT INTO `images_goods` VALUES ('126', '111');
INSERT INTO `images_goods` VALUES ('127', '112');
INSERT INTO `images_goods` VALUES ('128', '113');
INSERT INTO `images_goods` VALUES ('129', '114');
INSERT INTO `images_goods` VALUES ('130', '115');
INSERT INTO `images_goods` VALUES ('131', '116');
INSERT INTO `images_goods` VALUES ('132', '117');
INSERT INTO `images_goods` VALUES ('133', '118');
INSERT INTO `images_goods` VALUES ('134', '119');
INSERT INTO `images_goods` VALUES ('135', '120');
INSERT INTO `images_goods` VALUES ('136', '121');
INSERT INTO `images_goods` VALUES ('137', '122');
INSERT INTO `images_goods` VALUES ('138', '123');
INSERT INTO `images_goods` VALUES ('139', '124');
INSERT INTO `images_goods` VALUES ('140', '125');
INSERT INTO `images_goods` VALUES ('141', '126');
INSERT INTO `images_goods` VALUES ('142', '127');
INSERT INTO `images_goods` VALUES ('143', '128');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `message_id` bigint(20) NOT NULL COMMENT '留言自增id',
  `goods_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `content` char(1) DEFAULT '' COMMENT '留言内容',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `create_date` datetime DEFAULT NULL COMMENT '留言时间',
  PRIMARY KEY (`message_id`),
  KEY `f_user_id` (`user_id`),
  KEY `f_goods_id` (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='留言表';

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for message_images
-- ----------------------------
DROP TABLE IF EXISTS `message_images`;
CREATE TABLE `message_images` (
  `image_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `message_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='留言图片关系表';

-- ----------------------------
-- Records of message_images
-- ----------------------------

-- ----------------------------
-- Table structure for shop
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `shop_id` int(11) NOT NULL COMMENT '店铺自增id',
  `shop_number` char(8) NOT NULL COMMENT '店铺编号',
  `shop_name` char(30) DEFAULT '' COMMENT '店铺名称',
  `shop_directo` bigint(20) DEFAULT NULL COMMENT '店长user外键',
  `shop_image` char(250) DEFAULT '' COMMENT '店铺logo',
  `shop_phone` char(11) DEFAULT '' COMMENT '店铺电话',
  `shop_qq` char(10) DEFAULT '' COMMENT '店铺qq',
  `shop_adress` char(30) DEFAULT '' COMMENT '店铺地址',
  `service_time_begin` datetime DEFAULT NULL COMMENT '店铺服务开始时间',
  `service_time_end` datetime DEFAULT NULL COMMENT '店铺服务结束时间',
  `create_date` datetime DEFAULT NULL COMMENT '店铺创建时间',
  PRIMARY KEY (`shop_number`),
  KEY `shop_id` (`shop_id`),
  KEY `f_shop_user` (`shop_directo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='特定的店家';

-- ----------------------------
-- Records of shop
-- ----------------------------

-- ----------------------------
-- Table structure for shopping_cart
-- ----------------------------
DROP TABLE IF EXISTS `shopping_cart`;
CREATE TABLE `shopping_cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) DEFAULT NULL,
  `goods_id` bigint(20) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=205 DEFAULT CHARSET=utf8 COMMENT='购物车表';

-- ----------------------------
-- Records of shopping_cart
-- ----------------------------

-- ----------------------------
-- Table structure for shop_notice
-- ----------------------------
DROP TABLE IF EXISTS `shop_notice`;
CREATE TABLE `shop_notice` (
  `notice_id` int(11) NOT NULL AUTO_INCREMENT,
  `notice_content` varchar(500) DEFAULT '',
  `create_date` datetime DEFAULT NULL,
  `create_by` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `state` tinyint(4) DEFAULT 1 COMMENT '1表示有效，0表示无效',
  PRIMARY KEY (`notice_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop_notice
-- ----------------------------
INSERT INTO `shop_notice` VALUES ('1', '大家好！巴拉巴拉巴拉', '2020-04-19 13:58:39', '1', '开始', '0');
INSERT INTO `shop_notice` VALUES ('2', '哈哈哈哈哈哈', '2020-04-19 14:38:56', '1', '开心呀', '0');
INSERT INTO `shop_notice` VALUES ('3', '哇哇哇哇', '2020-04-19 15:10:32', '1', '你好呀', '0');
INSERT INTO `shop_notice` VALUES ('4', '你叫啥', '2020-04-19 15:12:22', '1', '我是哈哈哈', '0');
INSERT INTO `shop_notice` VALUES ('5', '你叫啥', '2020-04-19 15:18:16', '1', '我是哈哈哈', '0');
INSERT INTO `shop_notice` VALUES ('7', '舒服舒服', '2020-04-19 16:08:48', '1', '爽肤水', '0');
INSERT INTO `shop_notice` VALUES ('13', '你好呀', '2020-04-23 17:17:58', '1', '哈哈哈', '0');

-- ----------------------------
-- Table structure for shop_order
-- ----------------------------
DROP TABLE IF EXISTS `shop_order`;
CREATE TABLE `shop_order` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单自增id',
  `create_date` datetime DEFAULT NULL COMMENT '订单创建时间',
  `count` int(11) DEFAULT NULL COMMENT '订单商品数量',
  `price` double DEFAULT NULL COMMENT '订单商品价格',
  `total_price` double DEFAULT NULL COMMENT '总价格',
  `goods_num` char(50) DEFAULT '' COMMENT '商品编号',
  `goods_id` bigint(20) DEFAULT NULL COMMENT '商品主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户主键',
  `status` int(11) DEFAULT 1 COMMENT '订单状态 1代表未付款，0代表已付款，2代表失效',
  `position_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `f_order_goods` (`goods_id`),
  KEY `f_order_user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=366 DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Records of shop_order
-- ----------------------------
INSERT INTO `shop_order` VALUES ('338', '2020-04-18 13:10:15', '1', '3.5', '3.5', '95', '95', '9', '2', null);
INSERT INTO `shop_order` VALUES ('339', '2020-04-18 13:11:13', '1', '2.5', '2.5', '96', '96', '9', '2', null);
INSERT INTO `shop_order` VALUES ('340', '2020-04-18 13:11:13', '1', '22', '22', '106', '106', '9', '2', null);
INSERT INTO `shop_order` VALUES ('341', '2020-04-18 13:29:51', '1', '2.5', '2.5', '96', '96', '9', '2', null);
INSERT INTO `shop_order` VALUES ('342', '2020-04-18 13:29:51', '1', '3', '3', '98', '98', '9', '2', null);
INSERT INTO `shop_order` VALUES ('343', '2020-04-18 13:29:51', '1', '15', '15', '86', '86', '9', '2', null);
INSERT INTO `shop_order` VALUES ('344', '2020-04-18 13:32:05', '1', '3.5', '3.5', '95', '95', '9', '2', null);
INSERT INTO `shop_order` VALUES ('345', '2020-04-18 13:32:05', '1', '0', '0', '76', '76', '9', '2', null);
INSERT INTO `shop_order` VALUES ('346', '2020-04-18 13:32:05', '1', '1', '1', '75', '75', '9', '2', null);
INSERT INTO `shop_order` VALUES ('347', '2020-04-18 13:43:57', '1', '25', '25', '101', '101', '9', '2', null);
INSERT INTO `shop_order` VALUES ('348', '2020-04-18 13:47:44', '1', '3', '3', '98', '98', '9', '2', null);
INSERT INTO `shop_order` VALUES ('349', '2020-04-18 13:47:44', '1', '1.5', '1.5', '79', '79', '9', '2', null);
INSERT INTO `shop_order` VALUES ('350', '2020-04-18 13:47:44', '1', '3.6', '3.6', '97', '97', '9', '2', null);
INSERT INTO `shop_order` VALUES ('351', '2020-04-18 13:56:11', '1', '1.5', '1.5', '5d2e4656-b122-4d0a-9459-93a4ed55c4f9', '79', '9', '2', null);
INSERT INTO `shop_order` VALUES ('352', '2020-04-18 13:56:11', '1', '3.5', '3.5', '74', '74', '9', '2', null);
INSERT INTO `shop_order` VALUES ('353', '2020-04-18 13:56:12', '1', '4', '4', '122', '122', '9', '2', null);
INSERT INTO `shop_order` VALUES ('354', '2020-04-18 14:07:08', '1', '3', '3', 'b449cca8-d260-4039-92b9-48870f161adb', '98', '9', '2', '13');
INSERT INTO `shop_order` VALUES ('355', '2020-04-18 14:25:44', '1', '3.5', '3.5', '1865c552-d618-4dc8-8ab7-d526a30f81f1', '95', '9', '0', '13');
INSERT INTO `shop_order` VALUES ('356', '2020-04-18 14:26:47', '1', '78', '78', '142', '142', '9', '2', null);
INSERT INTO `shop_order` VALUES ('357', '2020-04-22 13:43:28', '5', '1', '5', '85e9d7c6-c5c1-426d-86d6-43f954c81cda', '75', '9', '0', null);
INSERT INTO `shop_order` VALUES ('358', '2020-04-22 17:36:11', '1', '1', '1', '90', '90', '9', '2', null);
INSERT INTO `shop_order` VALUES ('359', '2020-04-22 18:28:03', '6', '3.5', '21', 'f79eb980-8550-4bb8-9a8e-0dd2351f2b48', '95', '9', '0', '13');
INSERT INTO `shop_order` VALUES ('360', '2020-04-23 13:55:06', '1', '2.5', '2.5', 'b60a9a4a-23fe-4208-ac15-7bbf3e8bbcf9', '81', '9', '0', '13');
INSERT INTO `shop_order` VALUES ('363', '2020-04-23 16:25:50', '4', '1.5', '6', 'e515ad41-358b-414e-a432-a9bac34340ec', '79', '9', '0', '13');
INSERT INTO `shop_order` VALUES ('364', '2020-04-24 11:04:48', '4', '3.5', '14', '46453833-1d07-4102-b8d4-9bbe5bed6aea', '72', '9', '0', '14');
INSERT INTO `shop_order` VALUES ('365', '2020-04-24 17:14:52', '4', '1.5', '6', 'cd6a0a93-6ae9-42a4-91af-018a1d79c6fc', '79', '9', '1', '14');

-- ----------------------------
-- Table structure for sms_code
-- ----------------------------
DROP TABLE IF EXISTS `sms_code`;
CREATE TABLE `sms_code` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(6) NOT NULL,
  `date` datetime NOT NULL,
  `phone` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sms_code
-- ----------------------------
INSERT INTO `sms_code` VALUES ('6', '688138', '2020-04-24 11:06:41', '15797274066');
INSERT INTO `sms_code` VALUES ('7', '765881', '2020-01-14 15:18:05', '15797274067');
INSERT INTO `sms_code` VALUES ('8', '555555', '2020-01-10 15:10:39', '15797274068');
INSERT INTO `sms_code` VALUES ('9', '768689', '2020-01-10 15:35:26', '');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户自增id',
  `login_name` char(30) NOT NULL COMMENT '用于登录的名称',
  `phone` char(11) NOT NULL COMMENT '电话',
  `password` char(50) NOT NULL COMMENT '密码',
  `sex` int(11) DEFAULT 0 COMMENT '性别 1：男 2：女',
  `true_name` char(30) DEFAULT '' COMMENT '真实名字',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `user_photo` char(250) DEFAULT '' COMMENT '用户头像',
  `user_qq` char(11) DEFAULT '' COMMENT '用户qq',
  `email` char(20) DEFAULT '' COMMENT '用户邮箱',
  `user_score` int(11) DEFAULT NULL COMMENT '用户积分',
  `last_login_date` datetime DEFAULT NULL COMMENT '最后一次登录时间',
  `user_form` int(11) DEFAULT NULL COMMENT '用户从哪里登录进来（qq，微信等）',
  `user_money` int(11) DEFAULT NULL COMMENT 'user_money',
  `user_status` int(11) DEFAULT NULL COMMENT '用户状态（是否冻结）',
  `registerDate` datetime DEFAULT NULL,
  `token` char(100) DEFAULT '',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('9', 'kwbbin', '15797374066', 'e10adc3949ba59abbe56e057f20f883e', '1', '43434', '2020-04-01', '', '343466', '43434@qq.com', null, null, null, null, null, null, '02DB0F6856C5C18A35F37C8165F83CC8');
INSERT INTO `user` VALUES ('10', 'test', '25787975468', 'e10adc3949ba59abbe56e057f20f883e', '0', '', null, '', '', '', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('12', '555', '15797274068', '25d55ad283aa400af464c76d713c07ad', null, null, null, null, null, null, null, null, null, null, null, '2020-01-10 15:11:05', null);
INSERT INTO `user` VALUES ('23', 'keweibin', '15797274067', '25d55ad283aa400af464c76d713c07ad', null, null, null, null, null, null, null, null, null, null, null, '2020-01-14 15:18:28', null);
INSERT INTO `user` VALUES ('24', 'uuu', '15797274066', '25d55ad283aa400af464c76d713c07ad', null, null, null, null, null, null, null, null, null, null, null, '2020-04-24 11:07:30', null);

-- ----------------------------
-- Table structure for user_coupon
-- ----------------------------
DROP TABLE IF EXISTS `user_coupon`;
CREATE TABLE `user_coupon` (
  `user_id` bigint(20) NOT NULL,
  `coupon_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`coupon_id`),
  KEY `f_coupon_id_coupon` (`coupon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优惠券用户关系表';

-- ----------------------------
-- Records of user_coupon
-- ----------------------------

-- ----------------------------
-- Table structure for user_log
-- ----------------------------
DROP TABLE IF EXISTS `user_log`;
CREATE TABLE `user_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login_date` datetime DEFAULT NULL,
  `login_user` bigint(20) NOT NULL,
  `token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_log
-- ----------------------------
INSERT INTO `user_log` VALUES ('2', '2020-01-14 15:22:51', '23', null);
INSERT INTO `user_log` VALUES ('3', '2020-02-03 15:13:24', '9', 'D2FE503DEC2CAEC8AF62FACFDA9C4CF3');
INSERT INTO `user_log` VALUES ('4', '2020-02-03 15:14:27', '9', null);
INSERT INTO `user_log` VALUES ('5', '2020-02-03 15:14:29', '9', null);
INSERT INTO `user_log` VALUES ('8', '2020-02-03 15:15:55', '9', 'E1A338D8B78F2A09CF740623EED4EA43');
INSERT INTO `user_log` VALUES ('9', '2020-02-03 15:21:13', '9', '450682224A5C2AEB701D1557890F8072');
INSERT INTO `user_log` VALUES ('10', '2020-02-03 15:31:39', '9', '868AB677685B089F439F41FD9CFA892A');
INSERT INTO `user_log` VALUES ('11', '2020-02-03 15:36:29', '9', '4660D5BF2E8B4368955B2D7AF5F5688E');
INSERT INTO `user_log` VALUES ('12', '2020-02-03 15:38:42', '9', 'FA6163A91E1EB77B1C330EA82107224A');
INSERT INTO `user_log` VALUES ('13', '2020-02-03 16:01:30', '9', 'A602C29FE861B74B12555FA6DB3EE2F2');
INSERT INTO `user_log` VALUES ('14', '2020-02-03 16:04:35', '9', '307EEACCC851D9D229D59E362E9CF834');
INSERT INTO `user_log` VALUES ('15', '2020-02-03 16:06:16', '9', 'A75EB76364477B7A0F296BE23E192247');
INSERT INTO `user_log` VALUES ('16', '2020-02-03 16:12:46', '9', 'AEB25868545F72EE3D4A0C0F17295495');
INSERT INTO `user_log` VALUES ('17', '2020-02-03 16:13:42', '9', '66632B5AF9E05AB7D646A059FD064E58');
INSERT INTO `user_log` VALUES ('18', '2020-02-03 16:14:22', '9', 'F618364EF3DF7CEA43BFCE646E5AD2D9');
INSERT INTO `user_log` VALUES ('20', '2020-02-03 17:07:39', '9', 'F6E2C3E127A3D7710BD90D29FCA713BA');
INSERT INTO `user_log` VALUES ('21', '2020-02-03 17:12:44', '9', '4767B9171A32E8D01CC7C96A69EA281C');
INSERT INTO `user_log` VALUES ('22', '2020-02-03 17:13:06', '9', 'B61C6FF71FEE00FF217DE88C841BD382');
INSERT INTO `user_log` VALUES ('23', '2020-02-04 12:09:53', '9', '825DBA291B55BA370A6D82170558F914');
INSERT INTO `user_log` VALUES ('24', '2020-03-24 12:04:11', '9', 'AFAD8E60B6FBC29183F4AB6B2CED15C3');
INSERT INTO `user_log` VALUES ('25', '2020-03-25 10:08:24', '9', '2C8EA9C590E21CDDFB0E76E91DA70523');
INSERT INTO `user_log` VALUES ('26', '2020-03-25 10:40:09', '9', '80AAC9586908F84E56E03E594065F6BB');
INSERT INTO `user_log` VALUES ('27', '2020-03-25 10:43:15', '9', '7320851D787CDDF5D5CAB3BF304CB67F');
INSERT INTO `user_log` VALUES ('28', '2020-03-25 10:44:01', '9', '7E2350AE1E328F100487B3A085F126BF');
INSERT INTO `user_log` VALUES ('29', '2020-03-25 10:46:02', '9', '9B6EC5BA349C534D770D4A57649812C3');
INSERT INTO `user_log` VALUES ('30', '2020-03-25 10:46:58', '9', '0E19E70597DEF82B5C96741CAC4C282C');
INSERT INTO `user_log` VALUES ('31', '2020-03-25 10:48:39', '9', '04919B36A360AC4126A75767B726A7DE');
INSERT INTO `user_log` VALUES ('32', '2020-03-25 10:49:13', '9', 'BA279EA6F905EBB0681C387BE82F6464');
INSERT INTO `user_log` VALUES ('33', '2020-03-25 11:00:08', '9', '1EF10FD4D19E833ECEDB3C0D7170D0B2');
INSERT INTO `user_log` VALUES ('34', '2020-03-25 11:00:40', '9', 'CD34951532AB44535D5FBA02EBEBEA20');
INSERT INTO `user_log` VALUES ('35', '2020-03-25 11:04:02', '9', 'F4B7EB54F88044472E837FFA10FCB837');
INSERT INTO `user_log` VALUES ('36', '2020-03-25 11:06:39', '9', '45E6736B6817BCFD8EA4E314A4791FF3');
INSERT INTO `user_log` VALUES ('37', '2020-03-25 11:26:28', '9', '8BCA08E7A0DB6CBE41DE1A6C69A400A6');
INSERT INTO `user_log` VALUES ('38', '2020-03-25 11:26:51', '9', '9F4691C1AEB38E2AA6D0C6E6853F37BE');
INSERT INTO `user_log` VALUES ('39', '2020-03-25 11:27:29', '9', '0BB3CDF31000522999F2449C4302D313');
INSERT INTO `user_log` VALUES ('40', '2020-03-25 12:19:49', '9', '04DA5343A3CBD7EEB030DBCBF6C6E1C5');
INSERT INTO `user_log` VALUES ('41', '2020-03-25 15:08:43', '9', 'B6AEC740DAA5D7C79B1B918FAF3DAA19');
INSERT INTO `user_log` VALUES ('42', '2020-03-25 15:35:58', '9', 'E8ECCBB9C27C43803265EEE984AC422D');
INSERT INTO `user_log` VALUES ('43', '2020-03-25 15:47:00', '9', 'B6628EF45BE05586CC095ADBDE60524C');
INSERT INTO `user_log` VALUES ('44', '2020-03-25 16:54:23', '9', 'A218C9B87EE821BCAE2C5E9A1BC0553E');
INSERT INTO `user_log` VALUES ('45', '2020-03-25 16:55:16', '9', 'F993CC44AB3112FEB35A07A329488F94');
INSERT INTO `user_log` VALUES ('46', '2020-03-25 16:58:00', '9', '4AD453E770DD0BEF2E0CF868951B530C');
INSERT INTO `user_log` VALUES ('47', '2020-03-25 17:02:06', '9', '00A4063D22E2873BFEBB38988551546C');
INSERT INTO `user_log` VALUES ('48', '2020-03-25 17:03:10', '9', '65BE70C05EC462922C88C66AC52450D0');
INSERT INTO `user_log` VALUES ('49', '2020-03-25 17:04:01', '9', '9818AEADB037C332EFABBD62F71DA853');
INSERT INTO `user_log` VALUES ('50', '2020-03-26 10:17:18', '9', 'DE5DFBB8AF9C7C0105572145A8A23CAF');
INSERT INTO `user_log` VALUES ('51', '2020-03-26 10:39:29', '9', '5865DE1CC8721DE71CBBDC78AE7D8069');
INSERT INTO `user_log` VALUES ('52', '2020-03-26 10:42:14', '9', 'C691E1C5A94C6737511A51D92F7441C7');
INSERT INTO `user_log` VALUES ('53', '2020-03-26 11:33:00', '9', 'F8DF854D642F4BCB5BA6D5F07BE8BF39');
INSERT INTO `user_log` VALUES ('54', '2020-04-03 11:08:30', '9', '38BB387566379A44DA17EFF7C2BED886');
INSERT INTO `user_log` VALUES ('55', '2020-04-03 11:21:57', '9', 'A08008C7BD0AC0478ABE3ADCEA6C1D42');
INSERT INTO `user_log` VALUES ('56', '2020-04-13 12:46:11', '9', 'B39088BCCF06230DAABB9FF22EA4F214');
INSERT INTO `user_log` VALUES ('57', '2020-04-13 12:51:31', '9', 'EFF0C9648A35E55E36C40A3933E9BB88');
INSERT INTO `user_log` VALUES ('58', '2020-04-13 13:06:53', '9', '0EC9CB60ACC76EF685040808FB6ED385');
INSERT INTO `user_log` VALUES ('59', '2020-04-13 18:21:02', '9', 'CC36E90A39C14ED9F2A0A541DB105354');
INSERT INTO `user_log` VALUES ('60', '2020-04-17 11:45:28', '9', 'F106768010D2D4AC1E31A57651DE5485');
INSERT INTO `user_log` VALUES ('61', '2020-04-17 17:38:08', '9', 'B55D3E217681EDDDC05F731E1534CDA6');
INSERT INTO `user_log` VALUES ('62', '2020-04-18 14:25:32', '9', '7711B2D7A64E7D330C49F75F587C951E');
INSERT INTO `user_log` VALUES ('63', '2020-04-18 14:26:34', '9', 'F00902F8F3EF3BE51046521F2759CBD0');
INSERT INTO `user_log` VALUES ('64', '2020-04-18 14:31:44', '9', '6F52D153B4EF0BA3D39B0D73207129BE');
INSERT INTO `user_log` VALUES ('65', '2020-04-18 19:06:37', '9', '5BAC9CAB7E907E04187DF4FDFE4AFE06');
INSERT INTO `user_log` VALUES ('66', '2020-04-22 13:31:36', '9', null);
INSERT INTO `user_log` VALUES ('67', '2020-04-22 13:31:41', '9', 'D973151A5E032EAC9A140C96443A7D9A');
INSERT INTO `user_log` VALUES ('68', '2020-04-22 13:33:12', '9', '86FD4804D8D24713B56AE39AC328F186');
INSERT INTO `user_log` VALUES ('69', '2020-04-23 13:45:00', '9', 'BBF94816D488AE0D3CE8A0CD7B7F41B0');
INSERT INTO `user_log` VALUES ('70', '2020-04-23 16:01:06', '9', '19A1A6EAFA727F7DF2B8FE0323798775');
INSERT INTO `user_log` VALUES ('71', '2020-04-23 16:25:46', '9', 'C67048CBED1A9BE46F31011F5B1D77D5');
INSERT INTO `user_log` VALUES ('72', '2020-04-23 16:32:20', '9', '0042F8798ACA905F399F67D3F60BA2B2');
INSERT INTO `user_log` VALUES ('73', '2020-04-23 16:34:34', '9', 'B948D533E70C2D8705373870BC77BE28');
INSERT INTO `user_log` VALUES ('74', '2020-04-23 17:13:05', '9', 'AE36E0BE49D04C19F60A91F7C603ABF0');
INSERT INTO `user_log` VALUES ('75', '2020-04-24 11:04:42', '9', '538E3926F5C2FA55188F6CFA16DD90A0');
INSERT INTO `user_log` VALUES ('76', '2020-04-24 11:08:27', '24', '4B4380C11A6AFC04C7E52917A943C806');
INSERT INTO `user_log` VALUES ('77', '2020-04-24 11:25:09', '9', '74E1FDA18B214E575D08ABC35845290B');
INSERT INTO `user_log` VALUES ('78', '2020-04-24 17:14:46', '9', '02DB0F6856C5C18A35F37C8165F83CC8');

-- ----------------------------
-- Table structure for user_member
-- ----------------------------
DROP TABLE IF EXISTS `user_member`;
CREATE TABLE `user_member` (
  `user_id` bigint(20) NOT NULL COMMENT '会员id',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员表';

-- ----------------------------
-- Records of user_member
-- ----------------------------
INSERT INTO `user_member` VALUES ('9');

-- ----------------------------
-- Table structure for user_position
-- ----------------------------
DROP TABLE IF EXISTS `user_position`;
CREATE TABLE `user_position` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_position
-- ----------------------------
INSERT INTO `user_position` VALUES ('12', '9', '内蒙古自治区，鄂尔多斯市，康巴什区，哈巴格希街道办事处，新北社区，方法');
INSERT INTO `user_position` VALUES ('15', '9', '山西省，阳泉市，矿区，赛鱼街道办事处，麻地巷社区居委会，***区');

-- ----------------------------
-- Table structure for view_sort
-- ----------------------------
DROP TABLE IF EXISTS `view_sort`;
CREATE TABLE `view_sort` (
  `goods_sort_one` int(11) NOT NULL,
  `view_name` varchar(25) NOT NULL COMMENT '首页展示的分类表',
  PRIMARY KEY (`goods_sort_one`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of view_sort
-- ----------------------------
INSERT INTO `view_sort` VALUES ('25', '热门食品');
INSERT INTO `view_sort` VALUES ('26', '酒品饮料');
INSERT INTO `view_sort` VALUES ('27', '美容护理');

-- ----------------------------
-- View structure for goods_images
-- ----------------------------
DROP VIEW IF EXISTS `goods_images`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `goods_images` AS SELECT
images_goods.goods_id,
images_goods.image_id,
images.image_url,
images.image_desc,
goods.`name` AS goods_name,
goods.goods_desc
FROM
images_goods ,
images ,
goods
WHERE
images_goods.image_id = images.image_id AND
images_goods.goods_id = goods.goods_id ;

-- ----------------------------
-- View structure for hot_view_home
-- ----------------------------
DROP VIEW IF EXISTS `hot_view_home`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `hot_view_home` AS select a.* from view_home a where (

select count(*) from view_home where a.goods_sort_one_id=goods_sort_one_id and a.sale_total<sale_total

)<12
order by a.goods_sort_one_id, a.sale_total desc ;

-- ----------------------------
-- View structure for sort_all
-- ----------------------------
DROP VIEW IF EXISTS `sort_all`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `sort_all` AS SELECT
goods_sort_one.sort_name AS sort_one,
goods_sort_one.goods_sort_one_id AS one_id,
goods_sort_two.sort_name AS sort_two,
goods_sort_two.goods_sort_two_id AS two_id,
goods_sort_two.hot_num
FROM
goods_sort_one ,
goods_sort_one_two ,
goods_sort_two
WHERE
goods_sort_one_two.goods_sort_one_id = goods_sort_one.goods_sort_one_id AND
goods_sort_one_two.good_sort_two_id = goods_sort_two.goods_sort_two_id AND
goods_sort_one.state = 0 AND
goods_sort_two.state = 0 ;

-- ----------------------------
-- View structure for view_home
-- ----------------------------
DROP VIEW IF EXISTS `view_home`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `view_home` AS SELECT
goods_sort_one.goods_sort_one_id,
goods_sort_one.sort_name AS sort_one_name,
goods_sort_two.goods_sort_two_id,
goods_sort_two.sort_name AS sort_two_name,
goods.goods_id,
goods.`name`,
goods.goods_number,
goods.goods_sort_id,
goods.sale_total,
goods.visit_num,
goods.goods_desc,
images.image_desc,
images.image_url,
images.image_id,
view_sort.view_name,
goods.is_sale
FROM
goods_sort_one_two ,
goods_sort_one ,
goods_sort_two ,
goods ,
images_goods ,
images ,
view_sort
WHERE
goods_sort_one_two.good_sort_two_id = goods_sort_two.goods_sort_two_id AND
goods_sort_one.goods_sort_one_id = goods_sort_one_two.goods_sort_one_id AND
goods.goods_sort_id = goods_sort_two.goods_sort_two_id AND
images_goods.goods_id = goods.goods_id AND
images_goods.image_id = images.image_id AND
goods_sort_one.goods_sort_one_id = view_sort.goods_sort_one AND
goods.is_sale = 1
ORDER BY
goods.sale_total DESC,
goods_sort_one.goods_sort_one_id DESC ;
