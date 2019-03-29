/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 5.6.12-log : Database - eleganza
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`eleganza` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `eleganza`;

/*Table structure for table `tbl_user` */

DROP TABLE IF EXISTS `tbl_user`;

CREATE TABLE `tbl_user` (
  `UserId` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email_address` varchar(50) NOT NULL,
  `roleFk` bigint(11) NOT NULL DEFAULT '1',
  `gender` varchar(7) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `pincode` int(6) DEFAULT NULL,
  `state` varchar(50) NOT NULL,
  `contect` int(15) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `password` varchar(25) NOT NULL,
  `conformpassword` varchar(25) NOT NULL,
  `flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_user` */

insert  into `tbl_user`(`UserId`,`first_name`,`last_name`,`email_address`,`roleFk`,`gender`,`address`,`city`,`pincode`,`state`,`contect`,`userName`,`password`,`conformpassword`,`flag`) values (1,'Donald','Duck','donaldduck@gmail.com',1,'male','','Gandhiinagar',382465,'Gujarat',65234178,'dd','1','1',0),(2,'Hiral','shah','hiral@gmail.com',2,'Female','','Ahmedabad',382415,'Gujarat',99746589,'hiral','1510','1510',0),(3,'Neha','Basera','neha@gmail.com',2,'Female','','Ahmedabad',382423,'Gujarat',70156985,'neha','0411','0411',0),(4,'Drishti','Patel','dristipatel@gmail.com',2,'Female','','Vadodra',456987,'Gujarat',25698745,'drst','2008','2008',0),(12,'vikas','hingu','vikas@gmail.com',2,'male','cdcsdcsdcdscdsdcd','ahmedabad',380016,'AS',8140,'vikas','123','123',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
