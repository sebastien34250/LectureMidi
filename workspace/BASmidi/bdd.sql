-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: mysample
-- ------------------------------------------------------
-- Server version	5.7.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `creation`
--

DROP TABLE IF EXISTS `creation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `creation` (
  `idCreation` int(11) NOT NULL AUTO_INCREMENT,
  `Creation_name` varchar(45) NOT NULL,
  `Creation_cover` varchar(45) DEFAULT NULL,
  `User_idUser` int(11) NOT NULL,
  PRIMARY KEY (`idCreation`),
  KEY `fk_Creation_User_idx` (`User_idUser`),
  CONSTRAINT `fk_Creation_User` FOREIGN KEY (`User_idUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `creation`
--

LOCK TABLES `creation` WRITE;
/*!40000 ALTER TABLE `creation` DISABLE KEYS */;
INSERT INTO `creation` VALUES (1,'\"aaa\"',NULL,1),(2,'\"bbb\"',NULL,1),(3,'\"ccc\"',NULL,2),(4,'\"ddd\"',NULL,2),(5,'\"eee\"',NULL,3),(6,'\"fff\"',NULL,3),(7,'\"ggg\"',NULL,3);
/*!40000 ALTER TABLE `creation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loop`
--

DROP TABLE IF EXISTS `loop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loop` (
  `idLoop` int(11) NOT NULL AUTO_INCREMENT,
  `Loop_name` varchar(45) NOT NULL,
  `Loop_cover` longtext NOT NULL,
  `Loop_group` varchar(45) NOT NULL,
  PRIMARY KEY (`idLoop`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loop`
--

LOCK TABLES `loop` WRITE;
/*!40000 ALTER TABLE `loop` DISABLE KEYS */;
INSERT INTO `loop` VALUES (1,'\"africa.mid\"','\"https://img.discogs.com/y3nzPu7A4dDk2IX3rRfgcKsqXPc=/fit-in/600x599/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-649200-1295890139.jpeg.jpg\"','\"80\'s\"'),(2,'\"aha.mid\"','\"https://img.discogs.com/upWV4HXnN7WG5GEDxYiZ9nDPZgQ=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-887862-1472701857-3075.jpeg.jpg\"','\"80\'s\"'),(3,'\"dead_or_alive.mid\"','\"https://img.discogs.com/FnTlS54uscPDtrK9F8AhmC6d4Iw=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-1056463-1222956429.jpeg.jpg\"','\"80\'s\"'),(4,'\"inxs.mid\"','\"https://img.discogs.com/ubxs9zUs7-poHZRzc6m1XQsW0qI=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-1182754-1212329479.jpeg.jpg\"','\"80\'s\"'),(5,'\"madonna.mid\"','\"https://img.discogs.com/agyZ6I3ArjpXd9M5AHGzQhBU0W4=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-590429-1200264124.jpeg.jpg\"','\"80\'s\"'),(6,'\"michael.mid\"','\"https://img.discogs.com/_DO16lpD276hmgkIzNyeTWxN1tA=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-8558875-1476028867-2948.jpeg.jpg\"','\"80\'s\"'),(7,'\"never_gonna_give_you_up.mid\"','\"https://img.discogs.com/qptjOpUn0kqA59QlRbpJ_SgJwks=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-249504-1334592212.jpeg.jpg\"','\"80\'s\"'),(8,'\"police.mid\"','\"https://img.discogs.com/C5XSaGRcCshDFQhlMgdNhajA84c=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-2389607-1281206791.jpeg.jpg\"','\"80\'s\"'),(9,'\"queen.mid\"','\"https://img.discogs.com/FfhyJZGU2Nhp0M6xYgmzQNMuowE=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-376152-1124751661.jpg.jpg\"','\"80\'s\"'),(10,'\"u2.mid\"','\"https://img.discogs.com/S69_Fyrp4R4etb-4I3m9oiwbjkg=/fit-in/580x579/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-735115-1406816917-6038.jpeg.jpg\"','\"80\'s\"');
/*!40000 ALTER TABLE `loop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `User_name` varchar(45) NOT NULL,
  `User_mail` varchar(45) NOT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'\"Karla\"','\"mailK'),(2,'\"Elisabeth\"','\"mailE\"'),(3,'\"Sebastien\"','\"mailS\"');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-20  0:21:10
