-- MySQL dump 10.13  Distrib 5.1.50, for Win32 (ia32)
--
-- Host: localhost    Database: vendas
-- ------------------------------------------------------
-- Server version	5.1.50-community

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


create database vendas;

use vendas;

--
-- Table structure for table `cli`
--

DROP TABLE IF EXISTS `cli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cli` (
  `cli_cod` decimal(8,0) DEFAULT NULL,
  `reg_cod` varchar(5) DEFAULT NULL,
  `cli_nome` varchar(50) DEFAULT NULL,
  `cli_fone` varchar(50) DEFAULT NULL,
  `cli_ender` varchar(50) DEFAULT NULL,
  `cli_cidade` varchar(50) DEFAULT NULL,
  `cli_uf` char(2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cli`
--

LOCK TABLES `cli` WRITE;
/*!40000 ALTER TABLE `cli` DISABLE KEYS */;
INSERT INTO `cli` VALUES ('1','1','DEOCLECIANO SILVA',NULL,NULL,NULL,NULL),('2','1','ULISSES ROBERTO',NULL,NULL,NULL,NULL),('3','2','JUREMA FELESBERTA',NULL,NULL,NULL,NULL),('4','2','SEVERIANO ALVES',NULL,NULL,NULL,NULL),('5','2','ASTROGILDA SEVER',NULL,NULL,NULL,NULL),('6','3','ONAIREVES CINDO',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `cli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gr`
--

DROP TABLE IF EXISTS `gr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gr` (
  `gr_cod` varchar(5) DEFAULT NULL,
  `gr_desc` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gr`
--

LOCK TABLES `gr` WRITE;
/*!40000 ALTER TABLE `gr` DISABLE KEYS */;
INSERT INTO `gr` VALUES ('EMB','EMBALAGEM'),('COMP','COMPUTADORES'),('ACS','ACESSORIOS'),('SUP','SUPRIMENTOS');
/*!40000 ALTER TABLE `gr` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `item_cod` decimal(8,0) DEFAULT NULL,
  `ped_cod` decimal(8,0) DEFAULT NULL,
  `pro_cod` decimal(8,0) DEFAULT NULL,
  `item_qtde` decimal(10,2) DEFAULT NULL,
  `item_unit` decimal(10,2) DEFAULT NULL,
  `item_desco` decimal(10,2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES ('1','1','4','1.00','1999.00','0.00'),('2','1','5','1.00','199.00','0.00'),('3','2','6','1.00','399.00','7.00'),('4','3','3','1.00','2800.00','5.00'),('5','4','3','1.00','2800.00','0.00'),('6','5','3','1.00','2800.00','0.00'),('7','5','6','1.00','399.00','0.00'),('8','6','6','1.00','399.00','0.00'),('9','6','2','1.00','2.80','0.00');
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ped`
--

DROP TABLE IF EXISTS `ped`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ped` (
  `ped_cod` decimal(8,0) DEFAULT NULL,
  `cli_cod` decimal(8,0) DEFAULT NULL,
  `pedsitu_cod` varchar(5) DEFAULT NULL,
  `ped_data` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ped`
--

LOCK TABLES `ped` WRITE;
/*!40000 ALTER TABLE `ped` DISABLE KEYS */;
INSERT INTO `ped` VALUES ('1','1','2','2014-05-11'),('2','1','1','2014-04-02'),('3','2','1','2014-04-03'),('4','3','2','2014-04-03'),('5','5','2','2014-05-10'),('6','5','1','2014-04-04');
/*!40000 ALTER TABLE `ped` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedsitu`
--

DROP TABLE IF EXISTS `pedsitu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedsitu` (
  `pedsitu_cod` varchar(5) DEFAULT NULL,
  `pedsitu_desc` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedsitu`
--

LOCK TABLES `pedsitu` WRITE;
/*!40000 ALTER TABLE `pedsitu` DISABLE KEYS */;
INSERT INTO `pedsitu` VALUES ('1','PENDENTE'),('2','APROVADO'),('3','REPROVADO');
/*!40000 ALTER TABLE `pedsitu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pro`
--

DROP TABLE IF EXISTS `pro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pro` (
  `pro_cod` decimal(8,0) DEFAULT NULL,
  `uni_cod` varchar(5) DEFAULT NULL,
  `gr_cod` varchar(5) DEFAULT NULL,
  `pro_desc` varchar(50) DEFAULT NULL,
  `pro_custo` decimal(10,2) DEFAULT NULL,
  `pro_venda` decimal(10,2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pro`
--

LOCK TABLES `pro` WRITE;
/*!40000 ALTER TABLE `pro` DISABLE KEYS */;
INSERT INTO `pro` VALUES ('1','KG','EMB','PAPELAO ONDULADO','1.40','2.30'),('2','KG','EMB','PLASTICO BOLHA','1.80','2.80'),('3','PC','COMP','NOTEBOOK ACER ASPIRE XPTO-1540','1450.00','2800.00'),('4','PC','COMP','NOTEBOOK GATEWAY RIRE X-50','1250.00','1999.00'),('5','PC','ACS','MOUSE ULTRA-BLASTER 75 BOTOES','87.00','199.00'),('6','PC','ACS','TECLADO MEGA-GAME XR300 225 TECLAS','180.00','399.00');
/*!40000 ALTER TABLE `pro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reg`
--

DROP TABLE IF EXISTS `reg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reg` (
  `reg_cod` varchar(5) DEFAULT NULL,
  `reg_desc` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reg`
--

LOCK TABLES `reg` WRITE;
/*!40000 ALTER TABLE `reg` DISABLE KEYS */;
INSERT INTO `reg` VALUES ('1','SUL'),('2','SUDESTE'),('3','CENTRO-OESTE');
/*!40000 ALTER TABLE `reg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `uni`
--

DROP TABLE IF EXISTS `uni`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `uni` (
  `uni_cod` varchar(5) DEFAULT NULL,
  `uni_desc` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uni`
--

LOCK TABLES `uni` WRITE;
/*!40000 ALTER TABLE `uni` DISABLE KEYS */;
INSERT INTO `uni` VALUES ('KG','QUILOGRAMA'),('CX','CAIXA'),('PC','PECA');
/*!40000 ALTER TABLE `uni` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-11 14:51:29
