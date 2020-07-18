/*
Navicat MySQL Data Transfer

Source Server         : 39.96.59.27_3306
Source Server Version : 50727
Source Host           : 39.96.59.27:3306
Source Database       : competition

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2020-07-18 19:31:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for competitionorder
-- ----------------------------
DROP TABLE IF EXISTS `competitionorder`;
CREATE TABLE `competitionorder` (
  `oid` varchar(255) NOT NULL,
  `cid` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `detail` longtext,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for license
-- ----------------------------
DROP TABLE IF EXISTS `license`;
CREATE TABLE `license` (
  `licenseId` varchar(255) NOT NULL,
  `competitorId` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `teamname` varchar(255) DEFAULT NULL,
  `cid` varchar(255) DEFAULT NULL,
  `cname` varchar(255) DEFAULT NULL,
  `pid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`licenseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for place
-- ----------------------------
DROP TABLE IF EXISTS `place`;
CREATE TABLE `place` (
  `pid` varchar(255) NOT NULL,
  `school` varchar(255) DEFAULT NULL,
  `pname` varchar(255) DEFAULT NULL,
  `pnum` varchar(255) DEFAULT NULL,
  `cid` varchar(255) DEFAULT NULL,
  `csize` varchar(255) DEFAULT NULL,
  `manager` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for schedule
-- ----------------------------
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
  `cid` varchar(255) DEFAULT NULL,
  `competitorId` varchar(255) DEFAULT NULL,
  `pid` varbinary(255) DEFAULT NULL,
  `seat` varchar(255) DEFAULT NULL,
  `grade` float(4,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
