/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  xiaof
 * Created: 20-Feb-2019
 */

DROP DATABASE IF EXISTS WEBAPP;
CREATE DATABASE WEBAPP;

USE WEBAPP;

CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `home` varchar(255) NOT NULL,
  `info` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
 
 
INSERT INTO `user` VALUES ('3', '123', '123', '123', '123', '123');

INSERT INTO `user` VALUES ('4', '123123', '123123', '男', '北京', '123123');

