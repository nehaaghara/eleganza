/*
SQLyog Community v13.0.1 (64 bit)
MySQL - 5.7.19 : Database - eleganza
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`eleganza` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `eleganza`;

/*Table structure for table `tbl_adminservice` */

DROP TABLE IF EXISTS `tbl_adminservice`;

CREATE TABLE `tbl_adminservice` (
  `Service_Id` int(50) NOT NULL AUTO_INCREMENT,
  `ServiceName` varchar(200) NOT NULL,
  `Description` varchar(500) NOT NULL,
  `Charges` varchar(50) NOT NULL,
  `Flag` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Service_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_adminservice` */

insert  into `tbl_adminservice`(`Service_Id`,`ServiceName`,`Description`,`Charges`,`Flag`) values 
(1,'Haircut','ahdjlhdoufeih uoiqdhnoqdndn','300',0),
(2,'Facial','jjuiuhdwxnblw','200',0),
(3,'Manicure','djkldwqhlcuerlq ruqopff','100',0),
(4,'Pedicure','lauhcbuqooo bbb ','150',0),
(8,'Smoothening','doffueiqfnpn','4000',0),
(9,'abc','hslahcdl','123',0),
(10,'Spa','nothing','10000000',0);

/*Table structure for table `tbl_advttopic` */

DROP TABLE IF EXISTS `tbl_advttopic`;

CREATE TABLE `tbl_advttopic` (
  `topic_Id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `description` varchar(500) NOT NULL,
  `flag` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`topic_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_advttopic` */

insert  into `tbl_advttopic`(`topic_Id`,`title`,`description`,`flag`) values 
(1,'Makeup','NOPE',1);

/*Table structure for table `tbl_appointment` */

DROP TABLE IF EXISTS `tbl_appointment`;

CREATE TABLE `tbl_appointment` (
  `appointmentId` bigint(11) NOT NULL AUTO_INCREMENT,
  `userFk` bigint(11) NOT NULL,
  `empFk` bigint(11) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`appointmentId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_appointment` */

insert  into `tbl_appointment`(`appointmentId`,`userFk`,`empFk`,`date`,`time`,`flag`) values 
(1,2,9,'2019-04-03','01:12:00',1),
(3,2,9,'2019-04-19','11:01:00',1);

/*Table structure for table `tbl_empyolee_schedule` */

DROP TABLE IF EXISTS `tbl_empyolee_schedule`;

CREATE TABLE `tbl_empyolee_schedule` (
  `EmpId` bigint(11) NOT NULL AUTO_INCREMENT,
  `UserId` bigint(11) NOT NULL,
  `Date` datetime NOT NULL,
  `Time` time NOT NULL,
  `Flag` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`EmpId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_empyolee_schedule` */

insert  into `tbl_empyolee_schedule`(`EmpId`,`UserId`,`Date`,`Time`,`Flag`) values 
(9,3,'2019-04-18 00:00:00','23:00:00',1),
(10,12,'2018-04-02 00:00:00','15:03:00',1);

/*Table structure for table `tbl_package` */

DROP TABLE IF EXISTS `tbl_package`;

CREATE TABLE `tbl_package` (
  `Package_Id` bigint(11) NOT NULL AUTO_INCREMENT,
  `packageName` varchar(30) DEFAULT NULL,
  `serviceId` bigint(11) DEFAULT NULL,
  `CreationDate` varchar(25) NOT NULL,
  `ExpiryDate` varchar(25) NOT NULL,
  `Description` varchar(500) NOT NULL,
  `Cost` varchar(50) NOT NULL,
  `Flag` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Package_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_package` */

insert  into `tbl_package`(`Package_Id`,`packageName`,`serviceId`,`CreationDate`,`ExpiryDate`,`Description`,`Cost`,`Flag`) values 
(12,'Summer Package',NULL,'2019-04-09','2019-04-20','no','1000',1);

/*Table structure for table `tbl_packageservice` */

DROP TABLE IF EXISTS `tbl_packageservice`;

CREATE TABLE `tbl_packageservice` (
  `packageServiceId` bigint(50) NOT NULL AUTO_INCREMENT,
  `serviceFk` bigint(11) NOT NULL,
  `packageFk` bigint(11) NOT NULL,
  `flag` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`packageServiceId`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_packageservice` */

insert  into `tbl_packageservice`(`packageServiceId`,`serviceFk`,`packageFk`,`flag`) values 
(3,2,7,0),
(4,4,7,0),
(5,1,8,0),
(7,1,9,1),
(8,2,10,1),
(10,3,9,1),
(21,4,6,1),
(22,8,6,1),
(23,2,11,1),
(24,2,11,1),
(25,4,11,1);

/*Table structure for table `tbl_payment` */

DROP TABLE IF EXISTS `tbl_payment`;

CREATE TABLE `tbl_payment` (
  `paymentId` bigint(11) NOT NULL AUTO_INCREMENT,
  `userFk` bigint(11) NOT NULL,
  `packageFk` bigint(11) NOT NULL,
  `amount` varchar(30) NOT NULL,
  PRIMARY KEY (`paymentId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_payment` */

insert  into `tbl_payment`(`paymentId`,`userFk`,`packageFk`,`amount`) values 
(1,2,12,'300');

/*Table structure for table `tbl_product` */

DROP TABLE IF EXISTS `tbl_product`;

CREATE TABLE `tbl_product` (
  `productId` bigint(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(20) NOT NULL,
  `manufacture` varchar(20) NOT NULL,
  `cost` double NOT NULL,
  `description` varchar(500) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_product` */

insert  into `tbl_product`(`productId`,`productName`,`manufacture`,`cost`,`description`,`flag`) values 
(1,'Shampoo','Abc',600,'nothing',1),
(3,'Hair Oil','aaa',200,'noo',1);

/*Table structure for table `tbl_promation_campaining` */

DROP TABLE IF EXISTS `tbl_promation_campaining`;

CREATE TABLE `tbl_promation_campaining` (
  `PromotionId` bigint(50) NOT NULL AUTO_INCREMENT,
  `Title` varchar(50) DEFAULT NULL,
  `Date` datetime DEFAULT NULL,
  `Time` time DEFAULT '00:00:00',
  `Description` varchar(500) DEFAULT NULL,
  `Flag` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`PromotionId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_promation_campaining` */

insert  into `tbl_promation_campaining`(`PromotionId`,`Title`,`Date`,`Time`,`Description`,`Flag`) values 
(10,'fdsfds','2020-01-01 00:00:00','01:00:00','gdgdf',1);

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

insert  into `tbl_user`(`UserId`,`first_name`,`last_name`,`email_address`,`roleFk`,`gender`,`address`,`city`,`pincode`,`state`,`contect`,`userName`,`password`,`conformpassword`,`flag`) values 
(1,'Donald','Duck','donaldduck@gmail.com',1,'male','','Gandhiinagar',382465,'Gujarat',65234178,'dd','1','1',0),
(2,'Hiral','shah','hiral@gmail.com',2,'Female','','Ahmedabad',382415,'Gujarat',99746589,'hiral','1510','1510',0),
(3,'Neha','Basera','neha@gmail.com',3,'Female','','Ahmedabad',382423,'Gujarat',70156985,'neha','0411','0411',0),
(4,'Drishti','Patel','dristipatel@gmail.com',2,'Female','','Vadodra',456987,'Gujarat',25698745,'drst','2008','2008',0),
(12,'vikassssssss','hingu','vikas@gmail.com',3,'male','cdcsdcsdcdscdsdcd','ahmedabad',380016,'AS',8140,'vikas','123123aA','123123aA',1);

/*Table structure for table `tbl_userinterest` */

DROP TABLE IF EXISTS `tbl_userinterest`;

CREATE TABLE `tbl_userinterest` (
  `interestId` bigint(11) NOT NULL AUTO_INCREMENT,
  `topic_Id` bigint(11) NOT NULL,
  `userId` bigint(11) NOT NULL,
  PRIMARY KEY (`interestId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_userinterest` */

insert  into `tbl_userinterest`(`interestId`,`topic_Id`,`userId`) values 
(1,1,3),
(2,1,2),
(3,1,2);

/*Table structure for table `tbl_userrole` */

DROP TABLE IF EXISTS `tbl_userrole`;

CREATE TABLE `tbl_userrole` (
  `rolePK` bigint(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(500) DEFAULT NULL,
  `isActive` int(11) DEFAULT '0',
  PRIMARY KEY (`rolePK`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_userrole` */

insert  into `tbl_userrole`(`rolePK`,`roleName`,`isActive`) values 
(1,'Admin',1),
(2,'User',1),
(3,'Employee',1);

/*Table structure for table `user_product` */

DROP TABLE IF EXISTS `user_product`;

CREATE TABLE `user_product` (
  `UserproductId` int(11) NOT NULL AUTO_INCREMENT,
  `UserId` int(11) NOT NULL,
  `Product_id` int(11) NOT NULL,
  PRIMARY KEY (`UserproductId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_product` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
