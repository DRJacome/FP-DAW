-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: utilidades
-- ------------------------------------------------------
-- Server version	5.6.17

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

CREATE DATABASE utilidades
	CHARACTER SET UTF8
	COLLATE UTF8_SPANISH_CI;
USE utilidades;

--
-- Table structure for table `paises`
--

DROP TABLE IF EXISTS `paises`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paises` (
  `pai_id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `pai_isonum` smallint(6) DEFAULT NULL,
  `pai_iso2` char(2) COLLATE latin1_spanish_ci DEFAULT NULL,
  `pai_iso3` char(3) COLLATE latin1_spanish_ci DEFAULT NULL,
  `pai_nome` varchar(80) COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`pai_id`)
) ENGINE=InnoDB AUTO_INCREMENT=243 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paises`
--

LOCK TABLES `paises` WRITE;
/*!40000 ALTER TABLE `paises` DISABLE KEYS */;
INSERT INTO `paises` VALUES (1,4,'AF','AFG','Afganistán'),(2,248,'AX','ALA','Islas Gland'),(3,8,'AL','ALB','Albania'),(4,276,'DE','DEU','Alemania'),(5,20,'AD','AND','Andorra'),(6,24,'AO','AGO','Angola'),(7,660,'AI','AIA','Anguilla'),(8,10,'AQ','ATA','Antártida'),(9,28,'AG','ATG','Antigua y Barbuda'),(10,530,'AN','ANT','Antillas Holandesas'),(11,682,'SA','SAU','Arabia Saudí'),(12,12,'DZ','DZA','Argelia'),(13,32,'AR','ARG','Argentina'),(14,51,'AM','ARM','Armenia'),(15,533,'AW','ABW','Aruba'),(16,36,'AU','AUS','Australia'),(17,40,'AT','AUT','Austria'),(18,31,'AZ','AZE','Azerbaiyán'),(19,44,'BS','BHS','Bahamas'),(20,48,'BH','BHR','Bahréin'),(21,50,'BD','BGD','Bangladesh'),(22,52,'BB','BRB','Barbados'),(23,112,'BY','BLR','Bielorrusia'),(24,56,'BE','BEL','Bélgica'),(25,84,'BZ','BLZ','Belice'),(26,204,'BJ','BEN','Benin'),(27,60,'BM','BMU','Bermudas'),(28,64,'BT','BTN','Bhután'),(29,68,'BO','BOL','Bolivia'),(30,70,'BA','BIH','Bosnia y Herzegovina'),(31,72,'BW','BWA','Botsuana'),(32,74,'BV','BVT','Isla Bouvet'),(33,76,'BR','BRA','Brasil'),(34,96,'BN','BRN','Brunéi'),(35,100,'BG','BGR','Bulgaria'),(36,854,'BF','BFA','Burkina Faso'),(37,108,'BI','BDI','Burundi'),(38,132,'CV','CPV','Cabo Verde'),(39,136,'KY','CYM','Islas Caimán'),(40,116,'KH','KHM','Camboya'),(41,120,'CM','CMR','Camerún'),(42,124,'CA','CAN','Canadá'),(43,140,'CF','CAF','República Centroafricana'),(44,148,'TD','TCD','Chad'),(45,203,'CZ','CZE','República Checa'),(46,152,'CL','CHL','Chile'),(47,156,'CN','CHN','China'),(48,196,'CY','CYP','Chipre'),(49,162,'CX','CXR','Isla de Navidad'),(50,336,'VA','VAT','Ciudad del Vaticano'),(51,166,'CC','CCK','Islas Cocos'),(52,170,'CO','COL','Colombia'),(53,174,'KM','COM','Comoras'),(54,180,'CD','COD','República Democrática del Congo'),(55,178,'CG','COG','Congo'),(56,184,'CK','COK','Islas Cook'),(57,408,'KP','PRK','Corea del Norte'),(58,410,'KR','KOR','Corea del Sur'),(59,384,'CI','CIV','Costa de Marfil'),(60,188,'CR','CRI','Costa Rica'),(61,191,'HR','HRV','Croacia'),(62,192,'CU','CUB','Cuba'),(63,208,'DK','DNK','Dinamarca'),(64,212,'DM','DMA','Dominica'),(65,214,'DO','DOM','República Dominicana'),(66,218,'EC','ECU','Ecuador'),(67,818,'EG','EGY','Egipto'),(68,222,'SV','SLV','El Salvador'),(69,784,'AE','ARE','Emiratos Árabes Unidos'),(70,232,'ER','ERI','Eritrea'),(71,703,'SK','SVK','Eslovaquia'),(72,705,'SI','SVN','Eslovenia'),(73,724,'ES','ESP','España'),(74,581,'UM','UMI','Islas ultramarinas de Estados Unidos'),(75,840,'US','USA','Estados Unidos'),(76,233,'EE','EST','Estonia'),(77,231,'ET','ETH','Etiopía'),(78,234,'FO','FRO','Islas Feroe'),(79,608,'PH','PHL','Filipinas'),(80,246,'FI','FIN','Finlandia'),(81,242,'FJ','FJI','Fiyi'),(82,250,'FR','FRA','Francia'),(83,266,'GA','GAB','Gabón'),(84,270,'GM','GMB','Gambia'),(85,268,'GE','GEO','Georgia'),(86,239,'GS','SGS','Islas Georgias del Sur y Sandwich del Sur'),(87,288,'GH','GHA','Ghana'),(88,292,'GI','GIB','Gibraltar'),(89,308,'GD','GRD','Granada'),(90,300,'GR','GRC','Grecia'),(91,304,'GL','GRL','Groenlandia'),(92,312,'GP','GLP','Guadalupe'),(93,316,'GU','GUM','Guam'),(94,320,'GT','GTM','Guatemala'),(95,254,'GF','GUF','Guayana Francesa'),(96,324,'GN','GIN','Guinea'),(97,226,'GQ','GNQ','Guinea Ecuatorial'),(98,624,'GW','GNB','Guinea-Bissau'),(99,328,'GY','GUY','Guyana'),(100,332,'HT','HTI','Haití'),(101,334,'HM','HMD','Islas Heard y McDonald'),(102,340,'HN','HND','Honduras'),(103,344,'HK','HKG','Hong Kong'),(104,348,'HU','HUN','Hungría'),(105,356,'IN','IND','India'),(106,360,'ID','IDN','Indonesia'),(107,364,'IR','IRN','Irán'),(108,368,'IQ','IRQ','Iraq'),(109,372,'IE','IRL','Irlanda'),(110,352,'IS','ISL','Islandia'),(111,376,'IL','ISR','Israel'),(112,380,'IT','ITA','Italia'),(113,388,'JM','JAM','Jamaica'),(114,392,'JP','JPN','Japón'),(115,400,'JO','JOR','Jordania'),(116,398,'KZ','KAZ','Kazajstán'),(117,404,'KE','KEN','Kenia'),(118,417,'KG','KGZ','Kirguistán'),(119,296,'KI','KIR','Kiribati'),(120,414,'KW','KWT','Kuwait'),(121,418,'LA','LAO','Laos'),(122,426,'LS','LSO','Lesotho'),(123,428,'LV','LVA','Letonia'),(124,422,'LB','LBN','Líbano'),(125,430,'LR','LBR','Liberia'),(126,434,'LY','LBY','Libia'),(127,438,'LI','LIE','Liechtenstein'),(128,440,'LT','LTU','Lituania'),(129,442,'LU','LUX','Luxemburgo'),(130,446,'MO','MAC','Macao'),(131,807,'MK','MKD','ARY Macedonia'),(132,450,'MG','MDG','Madagascar'),(133,458,'MY','MYS','Malasia'),(134,454,'MW','MWI','Malawi'),(135,462,'MV','MDV','Maldivas'),(136,466,'ML','MLI','Malí'),(137,470,'MT','MLT','Malta'),(138,238,'FK','FLK','Islas Malvinas'),(139,580,'MP','MNP','Islas Marianas del Norte'),(140,504,'MA','MAR','Marruecos'),(141,584,'MH','MHL','Islas Marshall'),(142,474,'MQ','MTQ','Martinica'),(143,480,'MU','MUS','Mauricio'),(144,478,'MR','MRT','Mauritania'),(145,175,'YT','MYT','Mayotte'),(146,484,'MX','MEX','México'),(147,583,'FM','FSM','Micronesia'),(148,498,'MD','MDA','Moldavia'),(149,492,'MC','MCO','Mónaco'),(150,496,'MN','MNG','Mongolia'),(151,500,'MS','MSR','Montserrat'),(152,508,'MZ','MOZ','Mozambique'),(153,104,'MM','MMR','Myanmar'),(154,516,'NA','NAM','Namibia'),(155,520,'NR','NRU','Nauru'),(156,524,'NP','NPL','Nepal'),(157,558,'NI','NIC','Nicaragua'),(158,562,'NE','NER','Níger'),(159,566,'NG','NGA','Nigeria'),(160,570,'NU','NIU','Niue'),(161,574,'NF','NFK','Isla Norfolk'),(162,578,'NO','NOR','Noruega'),(163,540,'NC','NCL','Nueva Caledonia'),(164,554,'NZ','NZL','Nueva Zelanda'),(165,512,'OM','OMN','Omán'),(166,528,'NL','NLD','Países Bajos'),(167,586,'PK','PAK','Pakistán'),(168,585,'PW','PLW','Palau'),(169,275,'PS','PSE','Palestina'),(170,591,'PA','PAN','Panamá'),(171,598,'PG','PNG','Papúa Nueva Guinea'),(172,600,'PY','PRY','Paraguay'),(173,604,'PE','PER','Perú'),(174,612,'PN','PCN','Islas Pitcairn'),(175,258,'PF','PYF','Polinesia Francesa'),(176,616,'PL','POL','Polonia'),(177,620,'PT','PRT','Portugal'),(178,630,'PR','PRI','Puerto Rico'),(179,634,'QA','QAT','Qatar'),(180,826,'GB','GBR','Reino Unido'),(181,638,'RE','REU','Reunión'),(182,646,'RW','RWA','Ruanda'),(183,642,'RO','ROU','Rumania'),(184,643,'RU','RUS','Rusia'),(185,732,'EH','ESH','Sahara Occidental'),(186,90,'SB','SLB','Islas Salomón'),(187,882,'WS','WSM','Samoa'),(188,16,'AS','ASM','Samoa Americana'),(189,659,'KN','KNA','San Cristóbal y Nevis'),(190,674,'SM','SMR','San Marino'),(191,666,'PM','SPM','San Pedro y Miquelón'),(192,670,'VC','VCT','San Vicente y las Granadinas'),(193,654,'SH','SHN','Santa Helena'),(194,662,'LC','LCA','Santa Lucía'),(195,678,'ST','STP','Santo Tomé y Príncipe'),(196,686,'SN','SEN','Senegal'),(197,891,'CS','SCG','Serbia y Montenegro'),(198,690,'SC','SYC','Seychelles'),(199,694,'SL','SLE','Sierra Leona'),(200,702,'SG','SGP','Singapur'),(201,760,'SY','SYR','Siria'),(202,706,'SO','SOM','Somalia'),(203,144,'LK','LKA','Sri Lanka'),(204,748,'SZ','SWZ','Suazilandia'),(205,710,'ZA','ZAF','Sudáfrica'),(206,736,'SD','SDN','Sudán'),(207,752,'SE','SWE','Suecia'),(208,756,'CH','CHE','Suiza'),(209,740,'SR','SUR','Surinam'),(210,744,'SJ','SJM','Svalbard y Jan Mayen'),(211,764,'TH','THA','Tailandia'),(212,158,'TW','TWN','Taiwán'),(213,834,'TZ','TZA','Tanzania'),(214,762,'TJ','TJK','Tayikistán'),(215,86,'IO','IOT','Territorio Británico del Océano Índico'),(216,260,'TF','ATF','Territorios Australes Franceses'),(217,626,'TL','TLS','Timor Oriental'),(218,768,'TG','TGO','Togo'),(219,772,'TK','TKL','Tokelau'),(220,776,'TO','TON','Tonga'),(221,780,'TT','TTO','Trinidad y Tobago'),(222,788,'TN','TUN','Túnez'),(223,796,'TC','TCA','Islas Turcas y Caicos'),(224,795,'TM','TKM','Turkmenistán'),(225,792,'TR','TUR','Turquía'),(226,798,'TV','TUV','Tuvalu'),(227,804,'UA','UKR','Ucrania'),(228,800,'UG','UGA','Uganda'),(229,858,'UY','URY','Uruguay'),(230,860,'UZ','UZB','Uzbekistán'),(231,548,'VU','VUT','Vanuatu'),(232,862,'VE','VEN','Venezuela'),(233,704,'VN','VNM','Vietnam'),(234,92,'VG','VGB','Islas Vírgenes Británicas'),(235,850,'VI','VIR','Islas Vírgenes de los Estados Unidos'),(236,876,'WF','WLF','Wallis y Futuna'),(237,887,'YE','YEM','Yemen'),(238,262,'DJ','DJI','Yibuti'),(239,894,'ZM','ZMB','Zambia'),(240,716,'ZW','ZWE','Zimbabue'),(241,688,'RS','SRB','Serbia'),(242,499,'ME','MNE','Montenegro');
/*!40000 ALTER TABLE `paises` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provincias`
--

DROP TABLE IF EXISTS `provincias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provincias` (
  `pro_id` smallint(6) DEFAULT NULL,
  `pro_nome` varchar(30) COLLATE latin1_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provincias`
--

LOCK TABLES `provincias` WRITE;
/*!40000 ALTER TABLE `provincias` DISABLE KEYS */;
INSERT INTO `provincias` VALUES (2,'Albacete'),(3,'Alicante/Alacant'),(4,'Almería'),(1,'Araba/Álava'),(33,'Asturias'),(5,'Ávila'),(6,'Badajoz'),(7,'Balears, Illes'),(8,'Barcelona'),(48,'Bizkaia'),(9,'Burgos'),(10,'Cáceres'),(11,'Cádiz'),(39,'Cantabria'),(12,'Castellón/Castelló'),(51,'Ceuta'),(13,'Ciudad Real'),(14,'Córdoba'),(15,'Coruña, A'),(16,'Cuenca'),(20,'Gipuzkoa'),(17,'Girona'),(18,'Granada'),(19,'Guadalajara'),(21,'Huelva'),(22,'Huesca'),(23,'Jaén'),(24,'León'),(27,'Lugo'),(25,'Lleida'),(28,'Madrid'),(29,'Málaga'),(52,'Melilla'),(30,'Murcia'),(31,'Navarra'),(32,'Ourense'),(34,'Palencia'),(35,'Palmas, Las'),(36,'Pontevedra'),(26,'Rioja, La'),(37,'Salamanca'),(38,'Santa Cruz de Tenerife'),(40,'Segovia'),(41,'Sevilla'),(42,'Soria'),(43,'Tarragona'),(44,'Teruel'),(45,'Toledo'),(46,'Valencia/València'),(47,'Valladolid'),(49,'Zamora'),(50,'Zaragoza');
/*!40000 ALTER TABLE `provincias` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-19 14:21:54
