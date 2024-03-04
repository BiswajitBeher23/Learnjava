CREATE DATABASE  IF NOT EXISTS `tipudb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tipudb`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: tipudb
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `coaching`
--

DROP TABLE IF EXISTS `coaching`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `coaching` (
  `idno` int NOT NULL AUTO_INCREMENT,
  `fullname` varchar(200) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contactnumber` bigint NOT NULL,
  `address` varchar(200) NOT NULL,
  `college` varchar(100) DEFAULT NULL,
  `dateOfjoining` date NOT NULL,
  `age` int NOT NULL,
  PRIMARY KEY (`idno`),
  UNIQUE KEY `contactnumber` (`contactnumber`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coaching`
--

LOCK TABLES `coaching` WRITE;
/*!40000 ALTER TABLE `coaching` DISABLE KEYS */;
INSERT INTO `coaching` VALUES (1,'Biswajit Behera','male','biswa2024@gmail.com',7877456678,'meduakual, jajpur','ceb','2023-11-23',23),(2,'Sadeep malik','male','sadeep@gmail.com',6589456234,'chandaka, bhubaneswar','nit','2023-12-02',23),(3,'Sandip sahoo','male','sandip@gmail.com',7685459800,'cuttack','abit','2023-10-19',25),(4,'Malabika patra','female','malbika@gmail.com',7896457743,'patia, bhubaneswar','ceb','2024-01-05',22),(5,'Avinash swain','male','avi234@gmail.com',7658465789,'patia, bhubaneswar','cept','2022-11-05',29),(6,'Sasmita patra','female','sasmita@gmail.com',7896345542,'nayapalli, bhubaneswar','techno','2023-10-25',30),(7,'Rashmi Sahoo','male','rashmi34@gmail.com',9087776554,'bhomikhal, bhubaneswar','abit','2023-12-02',20),(8,'Santosh Pradhan','male','santosh@gmail.com',9824358602,'patia, bhubaneswar','cept','2023-07-05',30),(9,'Ashish  ku nayak','male','ashish23@gmail.com',9102739865,'patrapada, bhubaneswar','kits','2022-09-13',22),(10,'Rajib lochan rout','male','rajib24@gmail.com',7545045072,'fire station, bhubaneswar','bec','2022-11-07',29),(11,'Ramani ramnjan rout','male','ramani35@gmail.com',8233027044,'jaydev bihar, bhubaneswar','kec','2022-11-09',27),(12,'Prakuti mishra','female','prakuti34@gmail.com',7572485248,'bani bihar, bhubaneswar','ASBM','2022-11-05',31),(13,'Monalisha mohapatra','female','monalisha23@gmail.com',9909215421,'rasulgada, bhubaneswar','NIT','2022-11-02',20);
/*!40000 ALTER TABLE `coaching` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `joinee`
--

DROP TABLE IF EXISTS `joinee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `joinee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course` varchar(200) NOT NULL,
  `amount` varchar(100) NOT NULL,
  `batchtiming` varchar(100) NOT NULL,
  `startdate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `joinee`
--

LOCK TABLES `joinee` WRITE;
/*!40000 ALTER TABLE `joinee` DISABLE KEYS */;
INSERT INTO `joinee` VALUES (1,'java','5000','morning','2023-11-23'),(2,'java','5000','morning','2023-12-02'),(3,'web development','3000','afternoon','2023-10-19'),(4,'python','7000','evening','2024-01-05'),(5,'java','5000','morning','2023-12-02'),(6,'web development','3000','afternoon','2023-10-19'),(7,'python','7000','evening','2024-01-05'),(8,'frontend','5000','morning','2023-07-05'),(9,'database','3000','afternoon','2022-09-13'),(10,'data analyst','7000','evening','2022-11-07'),(11,'backend','5000','morning','2022-11-09'),(12,'fullstack','3000','afternoon','2022-11-05'),(13,'python','7000','evening','2022-11-02');
/*!40000 ALTER TABLE `joinee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Pramod','pramod@gmail.com','India','123'),(2,'Deepa','deepa@gmail.com','India','123'),(3,'Biswajit','top@gmail.com','India','123'),(4,'Dinesh','dinesh@gmail.com','India','123'),(5,'Samir','smir@gmail.com','India','123'),(6,'Linkan','linkan@gmail.com','India','123'),(7,'Damodar','damo@gmail.com','India','123'),(8,'Joash','joash@gmail.com','India','123'),(9,'Dibya','dibya@gmail.com','India','123'),(10,'Biswajit','biswa@gmail.com','India','123'),(11,'prasenjit','prasen@gmail.com','India','123');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `webcontent`
--

DROP TABLE IF EXISTS `webcontent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `webcontent` (
  `id` int NOT NULL AUTO_INCREMENT,
  `feature_title` varchar(225) NOT NULL,
  `feature_para` varchar(600) NOT NULL,
  `faq_question` varchar(200) NOT NULL,
  `faq_answer` varchar(600) NOT NULL,
  `about_title` varchar(200) DEFAULT NULL,
  `aboutus_desc` varchar(600) NOT NULL,
  `home_title` varchar(100) NOT NULL,
  `home_para` varchar(600) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `feature_title_UNIQUE` (`feature_title`),
  UNIQUE KEY `faq_question_UNIQUE` (`faq_question`),
  UNIQUE KEY `about_title_UNIQUE` (`about_title`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `webcontent`
--

LOCK TABLES `webcontent` WRITE;
/*!40000 ALTER TABLE `webcontent` DISABLE KEYS */;
INSERT INTO `webcontent` VALUES (1,'socialmedia content','Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry standard dummy\n text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.','Why us ?','The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, \n as opposed to using Content here, content here, making it look like readable English.','About us','There are many variations of passages of Lorem Ipsum available, \n but the majority have suffered alteration in some form, by injected humour, or randomised words which do not look even slightly believable.','Bootstrap design','Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins,\n responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.');
/*!40000 ALTER TABLE `webcontent` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-04 23:53:14
