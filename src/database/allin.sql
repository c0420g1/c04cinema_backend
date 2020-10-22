-- MySQL dump 10.13  Distrib 8.0.20, for macos10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: c04cinema
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'hdorn0','k63ORno9tkSG'),(2,'gserrell1','IJOc2Nr'),(3,'evicary2','tusSVBjTw'),(4,'mlandsborough3','SctJudtNg03K'),(5,'hpenson4','nyaYKIk'),(6,'bwhayman5','zIJ2IOXL'),(7,'jwoodyear6','M00nOQmx'),(8,'soulett7','PK02HL'),(9,'cstenson8','xo5pfxFgAV'),(10,'jheamus9','OqslUEh9'),(11,'mmaycocka','GlaGO5'),(12,'eschneiderb','SpruwkpBgE'),(13,'mmortlockc','TQN6ulG'),(14,'adubosed','WsYsBEM4Kc5n'),(15,'jbusfielde','EMAeAfj7e'),(16,'egoldspinkf','l4V9LxBW'),(17,'bdykesg','JyGHOmrTl'),(18,'sconrathh','CvUTAjTxx0'),(19,'mgiorgettii','7iTpdtWt8283'),(20,'ibezleyj','SZyUwu5'),(21,'anoodsk','mGPOvymvMauc'),(22,'kivanisovl','nHRQJAEJ6'),(23,'rpilfoldm','zUaLodo1v'),(24,'lmaseresn','eKWIs3D'),(25,'kkitcheno','27dpgxF4h'),(26,'dmetzelp','bfHNobg11v'),(27,'nbonninq','edHihA'),(28,'fklimentr','D6jIz9kWD4'),(29,'tocannavans','viGHZ4ckq3'),(30,'wseczykt','pS6yHZhSLqi'),(31,'fmcelreeu','e8dAP3'),(32,'aeddisforthv','P42U5dFn'),(33,'kpeasemanw','XotQ7pAOk'),(34,'hgannx','SeQiIWDbV'),(35,'cwhiteheady','J1mgB4'),(36,'yruddlesdenz','Bf78o8qR7I0'),(37,'cretchless10','204PLECGDcF'),(38,'daxel11','RFddPG54'),(39,'cridsdale12','RvApw4q'),(40,'drobken13','8FQC5Xt5yjND'),(41,'zsilby14','UWINFc'),(42,'jwoodhouse15','A6P9QnNThsB'),(43,'mmorgen16','bdLE4dWeg'),(44,'msutherby17','E6rwkoKp7W9d'),(45,'tfriel18','pcw3uu57dVv'),(46,'stomson19','I72fEFRGTfx'),(47,'corknay1a','eCREePi'),(48,'wferneyhough1b','D4m4E6yJ'),(49,'ngillbe1c','rQNUgH'),(50,'hmcniff1d','zzmGPcTLfE0a'),(51,'nmay1e','Dc3tOHds5X3U'),(52,'mpflieger1f','6WLfliJ5U'),(53,'gtrodden1g','IMU1pWfoEHU5'),(54,'lhannis1h','GMi3Ajhln'),(55,'shazeman1i','klTzlSp0ILDl'),(56,'slaven1j','D66siVxt5tW'),(57,'njarvis1k','dPpbiERXekn'),(58,'asaylor1l','Tx6AH9M'),(59,'rmillmoe1m','AD656B'),(60,'rbower1n','MkqYvnzz4'),(61,'mmateev1o','3qSqB567p'),(62,'hsandell1p','Sq4CJMZ34s'),(63,'jasken1q','c9FqgQU'),(64,'tdepero1r','QWEuUhTi'),(65,'wavarne1s','yw85S8RXwPhc'),(66,'ccato1t','FrS6ubS'),(67,'egrene1u','kWopOLlBq'),(68,'ttodarini1v','mh532BFIyq'),(69,'bshillaber1w','OC85DsLC'),(70,'cduguid1x','6vOWNLOo'),(71,'sbeaument1y','5HpSQdy5'),(72,'dbengtson1z','xdyUQ5XBIf5'),(73,'nbere20','TwvV5i'),(74,'apontin21','5Ja6tLbznI'),(75,'cdinis22','Nl41ZWNC1FB'),(76,'koglassane23','by5hFdy0y'),(77,'rbarlow24','YWP8x2'),(78,'lciani25','VGPIxf1wZ6'),(79,'ablaker26','y02ORUX0'),(80,'reskrigge27','yVU0E1'),(81,'klassen28','ogqMCKV8i'),(82,'kmundie29','D5MO9XS'),(83,'waiers2a','2gzOh1Wlml'),(84,'scowndley2b','anOyqRdrRIC'),(85,'xmcdiarmid2c','pBCExNsiV'),(86,'lbernardon2d','9JPcuPT'),(87,'jbabb2e','G2hKRnJv'),(88,'jhazael2f','Q5MVl09hDj'),(89,'ddealtry2g','5xl3r8al'),(90,'fgennrich2h','225YHDwrKbty'),(91,'lmottershaw2i','Nmv9VU'),(92,'cbalsdon2j','IWCM07e'),(93,'lbramford2k','yQ2QuPE'),(94,'drentz2l','C4F4xegieN'),(95,'cfilby2m','8wV2D92'),(96,'tkevlin2n','xpBOPchnOl'),(97,'ftidridge2o','Ywn6jmQOota'),(98,'egentle2p','pSreVvn4n'),(99,'wrustman2q','pTASpF7F0bG'),(100,'lgravenall2r','bdh8SFT0HMmC');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banner`
--

DROP TABLE IF EXISTS `banner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banner` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `url` varchar(250) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banner`
--

LOCK TABLES `banner` WRITE;
/*!40000 ALTER TABLE `banner` DISABLE KEYS */;
/*!40000 ALTER TABLE `banner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking_ticket`
--

DROP TABLE IF EXISTS `booking_ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking_ticket` (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `show_id` int DEFAULT NULL,
  `ticket_type_id` int DEFAULT NULL,
  `seat_id` int DEFAULT NULL,
  `promotion_id` int DEFAULT NULL,
  `account_id` int DEFAULT NULL,
  `payment_id` int DEFAULT NULL,
  `contact_email` varchar(45) DEFAULT NULL,
  `contact_phone` varchar(45) DEFAULT NULL,
  `status` tinyint DEFAULT NULL,
  `price` double DEFAULT NULL,
  `iscancel` tinyint DEFAULT '0',
  `booking_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_booking_ticket_payment1_idx` (`payment_id`),
  KEY `fk_booking_ticket_promotion1_idx` (`promotion_id`),
  KEY `fk_booking_ticket_show1_idx` (`show_id`),
  KEY `fk_booking_ticket_seat1_idx` (`seat_id`),
  KEY `fk_booking_ticket_account1_idx` (`account_id`),
  KEY `fk_booking_ticket_ticket_type1_idx` (`ticket_type_id`),
  CONSTRAINT `fk_booking_ticket_account1` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `fk_booking_ticket_payment1` FOREIGN KEY (`payment_id`) REFERENCES `payment` (`id`),
  CONSTRAINT `fk_booking_ticket_promotion1` FOREIGN KEY (`promotion_id`) REFERENCES `promotion` (`id`),
  CONSTRAINT `fk_booking_ticket_seat1` FOREIGN KEY (`seat_id`) REFERENCES `seat` (`id`),
  CONSTRAINT `fk_booking_ticket_show1` FOREIGN KEY (`show_id`) REFERENCES `show` (`id`),
  CONSTRAINT `fk_booking_ticket_ticket_type1` FOREIGN KEY (`ticket_type_id`) REFERENCES `ticket_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_ticket`
--

LOCK TABLES `booking_ticket` WRITE;
/*!40000 ALTER TABLE `booking_ticket` DISABLE KEYS */;
INSERT INTO `booking_ticket` VALUES (1,'67345-0013',71,6,128,16,29,2,'hcronin0@mtv.com','5859577512',0,70,0,'2020-08-05 17:00:00'),(2,'68462-248',63,2,93,19,53,3,'wbuxsy1@rakuten.co.jp','3535525834',1,57,0,'2020-08-05 17:00:00'),(3,'49527-040',80,5,118,3,2,2,'lfache2@canalblog.com','9699316358',0,78,0,'2020-08-05 17:00:00'),(4,'0085-1737',96,5,12,10,63,2,'fcovil3@tinyurl.com','6849231513',1,67,0,'2020-08-05 17:00:00'),(5,'21695-793',6,2,132,15,8,1,'rirons4@ehow.com','3485179508',0,70,0,'2020-08-05 17:00:00'),(6,'45802-368',60,2,49,10,49,3,'rminchin5@deliciousdays.com','8702871996',0,77,0,'2020-08-05 17:00:00'),(7,'41520-130',24,4,3,9,38,3,'mivashintsov6@blogger.com','4811346329',1,94,0,'2020-08-05 17:00:00'),(8,'54868-5337',13,3,49,13,38,3,'mpryde7@sitemeter.com','3678479401',1,72,0,'2020-08-05 17:00:00'),(9,'36987-1240',44,1,61,12,84,1,'kmckerley8@soundcloud.com','5754953172',1,94,0,'2020-08-05 17:00:00'),(10,'55154-9397',2,1,45,13,14,1,'ntejada9@360.cn','2108978608',0,80,0,'2020-08-05 17:00:00'),(11,'0187-5465',93,5,5,16,53,2,'gpuddina@123-reg.co.uk','5163199068',1,94,0,'2020-08-05 17:00:00'),(12,'21695-948',94,5,128,5,27,3,'erowbottomb@hhs.gov','8237841438',1,89,0,'2020-08-05 17:00:00'),(13,'0378-0313',88,6,62,17,62,2,'ffulepc@narod.ru','7975950834',1,51,0,'2020-08-05 17:00:00'),(14,'50544-004',47,2,121,2,58,1,'agounardd@cbslocal.com','2674262198',1,80,0,'2020-08-05 17:00:00'),(15,'55301-226',63,2,11,15,18,3,'somalleye@yelp.com','7984354287',0,70,0,'2020-08-05 17:00:00'),(16,'53329-166',23,3,60,4,62,1,'ballsobrookf@smugmug.com','2704633188',0,79,0,'2020-08-05 17:00:00'),(17,'35356-051',29,3,132,17,55,2,'khenninghamg@youku.com','4076048710',0,98,0,'2020-08-05 17:00:00'),(18,'11673-094',20,4,44,4,79,3,'ftownsendh@un.org','8011324032',1,57,0,'2020-08-05 17:00:00'),(19,'0085-1341',49,4,23,18,74,2,'awestcoti@cbc.ca','5087773813',0,63,0,'2020-08-05 17:00:00'),(20,'53113-108',47,2,131,1,98,1,'lvasyuninj@liveinternet.ru','4104437180',1,65,0,'2020-08-05 17:00:00'),(21,'68788-9529',8,1,110,5,35,3,'cpaddemorek@hubpages.com','1032227442',0,78,0,'2020-08-05 17:00:00'),(22,'98132-881',44,2,104,1,96,1,'jlamswoodl@npr.org','3376146256',0,81,0,'2020-08-05 17:00:00'),(23,'49288-0901',90,1,83,19,43,3,'hdavenportm@hud.gov','6654520588',0,73,0,'2020-08-05 17:00:00'),(24,'68968-2020',41,1,129,11,37,2,'mkonign@github.io','3393260781',0,93,0,'2020-08-05 17:00:00'),(25,'55154-2431',44,5,39,3,90,2,'zgorthyo@icq.com','5689157913',0,74,0,'2020-08-05 17:00:00'),(26,'68462-140',70,6,60,14,10,2,'rvaarp@webnode.com','6337507999',0,90,0,'2020-08-05 17:00:00'),(27,'50436-4326',37,6,17,13,2,1,'azanassiq@ameblo.jp','1092213970',1,96,0,'2020-08-05 17:00:00'),(28,'54868-1978',48,5,96,6,56,1,'amacdaidr@lulu.com','6606781798',1,89,0,'2020-08-05 17:00:00'),(29,'52682-023',42,3,24,12,53,3,'jhanrahans@wired.com','2834118733',1,66,0,'2020-08-05 17:00:00'),(30,'65691-0107',75,5,17,20,42,2,'spondjonest@geocities.com','8441237407',1,93,0,'2020-08-05 17:00:00'),(31,'49035-158',66,2,64,2,2,1,'scubbinelliu@hc360.com','3657329790',1,68,0,'2020-08-05 17:00:00'),(32,'49288-0195',88,5,37,11,44,3,'fwodelandv@ocn.ne.jp','8145207694',0,54,0,'2020-08-05 17:00:00'),(33,'49348-741',79,2,117,12,69,2,'lwrathmellw@acquirethisname.com','9522594474',0,97,0,'2020-08-05 17:00:00'),(34,'55154-4510',22,5,60,17,5,3,'pwoodisonx@merriam-webster.com','9745633428',1,95,0,'2020-08-05 17:00:00'),(35,'51758-004',60,6,130,9,11,2,'fcrowesty@unicef.org','3208892029',1,54,0,'2020-08-05 17:00:00'),(36,'0074-3005',37,6,67,18,73,2,'nnovakz@columbia.edu','3884489974',1,67,0,'2020-08-05 17:00:00'),(37,'67253-147',67,4,134,7,84,2,'mvaux10@eventbrite.com','6474549441',1,56,0,'2020-08-05 17:00:00'),(38,'54973-0621',58,5,99,11,31,1,'dlawtey11@is.gd','7926242425',1,95,0,'2020-08-05 17:00:00'),(39,'10191-1253',40,6,124,14,28,1,'bquilkin12@goodreads.com','4785808886',0,78,0,'2020-08-05 17:00:00'),(40,'55154-3925',81,4,34,1,99,1,'fpurcell13@aboutads.info','7181923990',0,91,0,'2020-08-05 17:00:00'),(41,'64764-310',31,4,81,13,22,2,'dgallaccio14@icio.us','9909901469',0,90,0,'2020-08-05 17:00:00'),(42,'67850-011',74,5,82,7,62,1,'cdubbin15@reuters.com','7327803109',1,59,0,'2020-08-05 17:00:00'),(43,'65862-524',35,4,148,12,1,2,'prumble16@nationalgeographic.com','9662436534',0,91,0,'2020-08-05 17:00:00'),(44,'76237-144',45,1,47,9,19,3,'rgroger17@histats.com','5095923833',1,83,0,'2020-08-05 17:00:00'),(45,'41163-425',80,1,132,18,24,3,'ivalentetti18@friendfeed.com','2099768361',1,78,0,'2020-08-05 17:00:00'),(46,'49035-375',15,4,22,17,51,3,'ekubik19@hibu.com','7823657182',1,77,0,'2020-08-05 17:00:00'),(47,'43857-0302',41,5,53,20,41,1,'dheskins1a@wufoo.com','1872790982',1,71,0,'2020-08-05 17:00:00'),(48,'59667-0052',59,3,74,8,96,2,'rdeangelo1b@woothemes.com','7319945006',1,93,0,'2020-08-05 17:00:00'),(49,'55154-3344',28,2,69,16,71,3,'thugle1c@usda.gov','7807474074',1,52,0,'2020-08-05 17:00:00'),(50,'33261-536',43,6,41,11,99,3,'srawlings1d@mayoclinic.com','7673345391',1,72,0,'2020-08-05 17:00:00'),(51,'0280-1186',84,1,15,1,56,3,'kbishopp1e@pagesperso-orange.fr','6575191837',0,92,0,'2020-08-05 17:00:00'),(52,'62011-0156',18,3,2,18,4,2,'lwolstencroft1f@blogspot.com','6512631587',1,57,0,'2020-08-05 17:00:00'),(53,'55154-4615',76,2,12,15,77,1,'aswyne1g@mlb.com','8234877548',0,73,0,'2020-08-05 17:00:00'),(54,'63629-5073',60,6,128,2,30,3,'twindows1h@odnoklassniki.ru','4489539902',0,78,0,'2020-08-05 17:00:00'),(55,'51672-4011',48,1,133,4,16,2,'mmetherell1i@yahoo.co.jp','5582034519',0,56,0,'2020-08-05 17:00:00'),(56,'61786-000',40,1,96,18,95,3,'pwallenger1j@google.es','5923272773',1,64,0,'2020-08-05 17:00:00'),(57,'51334-0002',90,1,123,11,74,2,'owernham1k@omniture.com','6528447067',1,62,0,'2020-08-05 17:00:00'),(58,'65862-521',91,4,95,9,65,2,'pcoggins1l@last.fm','9451513385',0,73,0,'2020-08-05 17:00:00'),(59,'67296-0586',38,1,132,10,76,3,'tgilham1m@howstuffworks.com','7413167833',1,75,0,'2020-08-05 17:00:00'),(60,'25543-012',38,5,140,13,5,1,'dsparshatt1n@scribd.com','2385626069',0,70,0,'2020-08-05 17:00:00'),(61,'43406-0108',8,6,148,6,20,2,'obutcher1o@google.ca','6175616833',0,92,0,'2020-08-05 17:00:00'),(62,'0186-1090',86,1,21,13,16,2,'kadamowicz1p@joomla.org','9948684328',0,95,0,'2020-08-05 17:00:00'),(63,'23558-6895',41,4,88,13,63,1,'ttome1q@businesswire.com','6149332958',1,92,0,'2020-08-05 17:00:00'),(64,'42254-139',94,1,149,10,51,1,'lkinneir1r@about.me','7375882930',1,86,0,'2020-08-05 17:00:00'),(65,'10631-285',62,4,32,14,82,2,'gtidey1s@free.fr','2314572918',1,79,0,'2020-08-05 17:00:00'),(66,'60505-2530',83,4,73,16,92,1,'skears1t@java.com','3758388032',1,63,0,'2020-08-05 17:00:00'),(67,'49349-480',74,1,93,16,88,3,'hcopley1u@feedburner.com','8492739176',0,85,0,'2020-08-05 17:00:00'),(68,'63323-184',24,6,29,8,85,2,'ldurban1v@1und1.de','2943719279',1,91,0,'2020-08-05 17:00:00'),(69,'51079-235',24,4,90,4,36,1,'blympany1w@upenn.edu','3454560891',1,50,0,'2020-08-05 17:00:00'),(70,'0363-0360',54,2,12,18,57,1,'mdartnall1x@time.com','2632228817',1,99,0,'2020-08-05 17:00:00'),(71,'58414-3042',23,4,112,7,61,2,'sbuzza1y@yolasite.com','3537225478',1,74,0,'2020-08-05 17:00:00'),(72,'66538-501',47,1,110,16,8,1,'korwin1z@umich.edu','7974186921',0,86,0,'2020-08-05 17:00:00'),(73,'67253-181',42,1,55,2,10,3,'kgallard20@boston.com','8523006755',0,98,0,'2020-08-05 17:00:00'),(74,'0338-1025',47,2,34,2,54,3,'mmelding21@blogger.com','9359617468',0,74,0,'2020-08-05 17:00:00'),(75,'41167-1002',98,1,135,6,25,1,'lros22@hp.com','2004136459',0,73,0,'2020-08-05 17:00:00'),(76,'43492-0001',7,5,112,8,85,1,'rmardlin23@washington.edu','4297758541',1,52,0,'2020-08-05 17:00:00'),(77,'41163-478',23,1,132,17,33,1,'wmisk24@japanpost.jp','7424637008',0,89,0,'2020-08-05 17:00:00'),(78,'60505-0839',29,3,53,13,69,3,'lrisbie25@hao123.com','6261542438',1,51,0,'2020-08-05 17:00:00'),(79,'51672-5263',8,5,116,6,57,2,'vmedgewick26@about.me','8541187377',0,59,0,'2020-08-05 17:00:00'),(80,'65954-768',72,6,138,3,86,2,'nkeddy27@merriam-webster.com','5148402974',0,84,0,'2020-08-05 17:00:00'),(81,'49349-429',84,6,113,13,85,2,'crosenau28@comsenz.com','2882425284',1,50,0,'2020-08-05 17:00:00'),(82,'49738-441',38,6,46,7,12,1,'adungee29@netvibes.com','5179872550',1,59,0,'2020-08-05 17:00:00'),(83,'53063-1111',19,5,146,16,21,3,'pratcliff2a@mayoclinic.com','6653749379',0,72,0,'2020-08-05 17:00:00'),(84,'51285-080',45,1,1,6,16,2,'lblazdell2b@livejournal.com','3787392998',0,51,0,'2020-08-05 17:00:00'),(85,'0078-0517',7,5,44,20,14,3,'jthorington2c@icio.us','6367349688',1,58,0,'2020-08-05 17:00:00'),(86,'55316-067',4,6,33,20,91,2,'ldutch2d@php.net','6668047804',0,58,0,'2020-08-05 17:00:00'),(87,'49884-019',54,6,141,10,48,1,'dedward2e@yolasite.com','8755047929',1,86,0,'2020-08-05 17:00:00'),(88,'54473-233',21,2,139,1,100,2,'jbynold2f@wunderground.com','9164225131',0,85,0,'2020-08-05 17:00:00'),(89,'76439-244',43,5,37,18,74,3,'dlindholm2g@furl.net','7411163044',0,96,0,'2020-08-05 17:00:00'),(90,'49852-032',48,4,1,14,94,1,'ghabishaw2h@accuweather.com','2846523056',0,72,0,'2020-08-05 17:00:00'),(91,'53738-0714',12,6,139,4,99,1,'kferriby2i@furl.net','3855109747',1,51,0,'2020-08-05 17:00:00'),(92,'0338-0073',50,5,21,1,30,1,'jbreakspear2j@tamu.edu','6584495034',0,99,0,'2020-08-05 17:00:00'),(93,'76084-1001',24,6,139,15,38,2,'cschrei2k@tamu.edu','4664703554',1,83,0,'2020-08-05 17:00:00'),(94,'34460-6001',6,1,63,8,49,2,'bsyme2l@livejournal.com','5639379821',0,61,0,'2020-08-05 17:00:00'),(95,'51329-1001',29,3,34,13,58,3,'eingerman2m@cam.ac.uk','2709838870',0,75,0,'2020-08-05 17:00:00'),(96,'49884-821',74,6,43,18,74,3,'rbarthelmes2n@reddit.com','2493359005',0,70,0,'2020-08-05 17:00:00'),(97,'55111-279',63,1,29,15,40,2,'rvannini2o@slashdot.org','4968168683',1,94,0,'2020-08-05 17:00:00'),(98,'68382-019',72,6,80,1,86,3,'aloughrey2p@weather.com','2949150529',1,51,0,'2020-08-05 17:00:00'),(99,'64117-235',16,6,18,9,5,1,'swaldera2q@cbsnews.com','5838152506',0,64,0,'2020-08-05 17:00:00'),(100,'37808-332',7,5,49,19,64,3,'bgaskall2r@wiley.com','6906410014',1,97,0,'2020-08-05 17:00:00');
/*!40000 ALTER TABLE `booking_ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `buy_combo`
--

DROP TABLE IF EXISTS `buy_combo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `buy_combo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `combo_id` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_buy_combo_combo1_idx` (`combo_id`),
  CONSTRAINT `fk_buy_combo_combo1` FOREIGN KEY (`combo_id`) REFERENCES `combo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buy_combo`
--

LOCK TABLES `buy_combo` WRITE;
/*!40000 ALTER TABLE `buy_combo` DISABLE KEYS */;
/*!40000 ALTER TABLE `buy_combo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `buy_food_drink`
--

DROP TABLE IF EXISTS `buy_food_drink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `buy_food_drink` (
  `id` int NOT NULL AUTO_INCREMENT,
  `food_drink_id` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_buy_food_drink_food_drink1_idx` (`food_drink_id`),
  KEY `fk_buy_food_drink_customer1_idx` (`customer_id`),
  CONSTRAINT `fk_buy_food_drink_customer1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `fk_buy_food_drink_food_drink1` FOREIGN KEY (`food_drink_id`) REFERENCES `food_drink` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buy_food_drink`
--

LOCK TABLES `buy_food_drink` WRITE;
/*!40000 ALTER TABLE `buy_food_drink` DISABLE KEYS */;
/*!40000 ALTER TABLE `buy_food_drink` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `combo`
--

DROP TABLE IF EXISTS `combo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `combo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `imge_url` varchar(250) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combo`
--

LOCK TABLES `combo` WRITE;
/*!40000 ALTER TABLE `combo` DISABLE KEYS */;
INSERT INTO `combo` VALUES (1,'1 corn & 1 drink',21.5,NULL,NULL),(2,'1 corn & 2 drink',34,NULL,NULL);
/*!40000 ALTER TABLE `combo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `customer_type_id` int DEFAULT NULL,
  `current_bonus_point` int DEFAULT '0',
  `account_id` int DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `isactive` tinyint DEFAULT '1',
  `gender` varchar(45) DEFAULT NULL,
  `cardid` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_customer_account1_idx` (`account_id`),
  KEY `fk_customer_customer_type1_idx` (`customer_type_id`),
  CONSTRAINT `fk_customer_account1` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `fk_customer_customer_type1` FOREIGN KEY (`customer_type_id`) REFERENCES `customer_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Anica Celli','24196 Mccormick Center',3,3857,9,'acelli0@addtoany.com','2020-04-28','819 274 8939',1,'Female','835-25-2257','CodeCus'),(2,'Spence Clemetts','4871 Maryland Court',4,385,66,'sclemetts1@bluehost.com','2020-09-14','977 919 2640',1,'Male','642-21-9481','CodeCus'),(3,'Katti Halt','6 Vernon Crossing',1,4560,42,'khalt2@icio.us','2019-11-29','146 777 6753',1,'Female','453-48-0955','CodeCus'),(4,'Ellie Letchford','582 Oakridge Pass',3,1655,73,'eletchford3@unc.edu','2020-03-22','826 607 5344',0,'Female','170-61-1996','CodeCus'),(5,'Suzanna Pattisson','84 Reinke Center',4,1930,67,'spattisson4@wsj.com','2019-12-17','414 380 4175',1,'Female','351-75-0056','CodeCus'),(6,'Pearle Lamberth','4 Northwestern Plaza',3,1295,63,'plamberth5@geocities.com','2019-11-18','722 214 0827',1,'Female','479-35-8688','CodeCus'),(7,'Karlee Sapauton','624 Evergreen Street',1,283,41,'ksapauton6@amazon.com','2020-04-09','828 901 2810',0,'Female','647-60-1135','CodeCus'),(8,'Roseanne Bainton','9335 Welch Road',4,1042,67,'rbainton7@wordpress.org','2020-06-13','109 900 3763',1,'Female','452-73-6535','CodeCus'),(9,'Reece Dondon','83 Moland Alley',1,1196,87,'rdondon8@netlog.com','2019-11-19','434 174 0924',0,'Male','391-42-0031','CodeCus'),(10,'Paquito Prahm','9 Farwell Street',2,254,18,'pprahm9@wisc.edu','2020-01-29','144 538 2635',1,'Male','205-50-1521','CodeCus'),(11,'Vernen Chisnall','5 Monica Point',1,255,70,'vchisnalla@soundcloud.com','2020-10-12','598 760 8525',0,'Male','767-17-7025','CodeCus'),(12,'Frants Ratie','16067 International Terrace',5,1115,39,'fratieb@nyu.edu','2020-07-03','452 514 5682',1,'Male','287-93-8332','CodeCus'),(13,'Wilburt Hoggetts','97557 Annamark Way',4,779,60,'whoggettsc@wsj.com','2020-04-05','955 669 1966',0,'Male','830-51-9630','CodeCus'),(14,'Adan Colby','991 Shopko Way',4,2746,33,'acolbyd@biblegateway.com','2020-04-24','683 757 5280',0,'Male','441-44-2009','CodeCus'),(15,'Winona Dampier','80 Annamark Drive',5,108,42,'wdampiere@sitemeter.com','2019-12-24','926 257 5672',1,'Female','771-82-2254','CodeCus'),(16,'Abbey Shadrach','1 Carberry Junction',3,3718,13,'ashadrachf@about.me','2020-02-26','377 573 9055',1,'Female','176-77-2550','CodeCus'),(17,'Lombard Serotsky','94720 Buena Vista Parkway',2,3823,21,'lserotskyg@walmart.com','2020-04-17','901 792 5431',1,'Male','521-43-7532','CodeCus'),(18,'Aurlie Duligal','0471 Melvin Court',5,3676,41,'aduligalh@google.de','2020-06-21','680 884 2309',0,'Female','253-90-6218','CodeCus'),(19,'Hertha Blackesland','9 Vidon Terrace',4,4576,92,'hblackeslandi@npr.org','2020-05-11','453 716 8134',1,'Female','770-70-4333','CodeCus'),(20,'Margareta Mewha','77959 Iowa Point',4,3399,16,'mmewhaj@nasa.gov','2020-08-29','352 132 2706',0,'Female','211-36-8821','CodeCus'),(21,'Caritta Ragless','2 Sachs Pass',4,2947,98,'craglessk@sphinn.com','2020-01-16','831 456 0686',0,'Female','380-78-7153','CodeCus'),(22,'Kaylyn Bartolommeo','7820 Carpenter Point',3,3111,19,'kbartolommeol@china.com.cn','2020-04-14','541 550 4389',1,'Female','110-69-7530','CodeCus'),(23,'Emmy Munby','98554 Fieldstone Pass',5,1733,79,'emunbym@google.cn','2020-02-08','206 457 8269',0,'Female','260-27-0708','CodeCus'),(24,'Dyanna Piscotti','5722 Claremont Plaza',1,1777,34,'dpiscottin@geocities.com','2020-01-08','457 399 0093',1,'Female','107-29-9267','CodeCus'),(25,'Chip Tripony','25556 Warbler Street',4,688,3,'ctriponyo@moonfruit.com','2019-12-19','512 652 6323',1,'Male','539-90-9539','CodeCus'),(26,'Georgiana Howels','1783 Kropf Park',4,3412,26,'ghowelsp@google.it','2019-12-16','532 127 5436',0,'Female','557-83-5655','CodeCus'),(27,'Cozmo Strain','47936 Mallory Way',1,2856,46,'cstrainq@census.gov','2020-03-08','913 993 4837',0,'Male','778-82-9180','CodeCus'),(28,'Nelia Wimbush','92 Hanover Plaza',1,1369,29,'nwimbushr@walmart.com','2020-09-24','345 414 1515',0,'Female','782-71-8063','CodeCus'),(29,'Pattie Smout','3 Eggendart Park',4,3145,97,'psmouts@nifty.com','2020-09-15','852 503 7767',1,'Male','395-02-7343','CodeCus'),(30,'Nolie Raw','6116 Claremont Avenue',2,1898,50,'nrawt@ezinearticles.com','2020-09-04','707 588 3211',1,'Female','509-66-8896','CodeCus'),(31,'Evita Fosken','30 Jenifer Circle',5,1815,16,'efoskenu@cargocollective.com','2020-08-01','417 821 9455',0,'Female','347-31-5663','CodeCus'),(32,'Idell Waldron','15679 Sutteridge Center',1,3075,83,'iwaldronv@eepurl.com','2020-07-13','219 502 5164',1,'Female','428-67-9155','CodeCus'),(33,'Dimitri Runge','6591 Sutherland Junction',1,2106,24,'drungew@amazon.com','2019-10-19','320 287 4181',1,'Male','421-01-6240','CodeCus'),(34,'Nonah Albertson','05 Saint Paul Trail',5,3512,77,'nalbertsonx@imgur.com','2020-10-03','258 360 9998',1,'Female','697-50-1674','CodeCus'),(35,'Whitney Saffe','3 John Wall Point',4,4697,57,'wsaffey@google.de','2020-02-09','298 365 3131',1,'Male','831-16-8148','CodeCus'),(36,'Jaine Margett','00786 Dottie Terrace',3,1118,81,'jmargettz@alexa.com','2019-12-22','840 485 6978',0,'Female','436-64-6224','CodeCus'),(37,'Coraline Ritter','47632 Kingsford Street',1,4197,92,'critter10@acquirethisname.com','2019-11-29','465 382 4863',0,'Female','616-76-1364','CodeCus'),(38,'Sal Knowler','7124 Macpherson Alley',2,3729,34,'sknowler11@goo.ne.jp','2020-03-01','563 921 6058',0,'Male','680-57-7574','CodeCus'),(39,'Martyn Niesel','45809 Northport Plaza',1,641,78,'mniesel12@github.io','2020-08-28','724 591 1579',1,'Male','432-18-0060','CodeCus'),(40,'Floyd Elliker','12767 Buell Trail',3,2554,84,'felliker13@freewebs.com','2020-10-06','704 939 1632',1,'Male','426-28-0399','CodeCus'),(41,'Perren Tedder','37 Haas Trail',1,3815,69,'ptedder14@scribd.com','2020-02-14','651 277 5575',1,'Male','660-09-0829','CodeCus'),(42,'Ted Stivers','62 Gateway Trail',3,4950,94,'tstivers15@who.int','2020-07-27','513 863 1436',0,'Female','408-49-0234','CodeCus'),(43,'Cathy Matus','7054 Kedzie Drive',1,4308,18,'cmatus16@mapy.cz','2020-04-19','134 142 7859',0,'Female','467-14-5410','CodeCus'),(44,'Ninnetta Doddridge','479 Dahle Trail',1,3851,11,'ndoddridge17@friendfeed.com','2020-06-11','789 196 8446',1,'Female','131-65-9850','CodeCus'),(45,'Juliana Tabbernor','7942 Vera Pass',1,2255,64,'jtabbernor18@home.pl','2020-03-21','960 931 8215',1,'Female','534-91-0639','CodeCus'),(46,'Rudolfo Gotthard','95328 Merry Place',3,1047,92,'rgotthard19@printfriendly.com','2020-04-24','845 139 1408',0,'Male','482-25-4549','CodeCus'),(47,'Talyah Shiels','5 Pond Lane',3,4288,75,'tshiels1a@hp.com','2020-10-07','634 763 9301',0,'Female','610-03-5651','CodeCus'),(48,'Whitman Penreth','363 Bonner Street',3,1131,27,'wpenreth1b@illinois.edu','2020-09-20','822 619 2682',0,'Male','355-30-6062','CodeCus'),(49,'Bernette Scurrell','45 Montana Center',3,3249,61,'bscurrell1c@youtube.com','2020-09-04','479 355 0462',1,'Female','361-78-2679','CodeCus'),(50,'Connie Gooder','8153 Dottie Crossing',2,1159,52,'cgooder1d@huffingtonpost.com','2020-02-10','179 890 1309',0,'Male','835-26-0539','CodeCus'),(51,'Heinrik Bownas','4203 Eggendart Terrace',3,1682,28,'hbownas1e@soup.io','2020-03-19','542 965 3590',0,'Male','184-58-7063','CodeCus'),(52,'Doralynne Cleeton','38 Basil Junction',3,2348,56,'dcleeton1f@geocities.jp','2019-12-27','626 424 2541',0,'Female','131-21-8749','CodeCus'),(53,'Cacilie Chattaway','7 Welch Place',5,2285,17,'cchattaway1g@washingtonpost.com','2020-02-03','701 354 9329',1,'Female','680-21-8644','CodeCus'),(54,'Benedicto Cushworth','2 Caliangt Drive',5,3594,63,'bcushworth1h@storify.com','2020-09-17','673 154 1769',0,'Male','206-32-1660','CodeCus'),(55,'Isidor Bearham','831 Shelley Point',4,4702,27,'ibearham1i@trellian.com','2020-03-01','764 740 8037',0,'Male','782-16-3445','CodeCus'),(56,'Anestassia Torr','90 Springs Street',5,3493,40,'atorr1j@bing.com','2019-12-04','141 216 6130',1,'Female','700-73-0742','CodeCus'),(57,'Filip Tweedy','9459 Sommers Junction',3,688,91,'ftweedy1k@comsenz.com','2020-08-20','608 134 3481',0,'Male','791-63-5698','CodeCus'),(58,'Marcellina Higginbottam','194 Delladonna Point',2,2213,63,'mhigginbottam1l@va.gov','2020-02-02','864 940 4048',1,'Female','432-97-4855','CodeCus'),(59,'Reagan Hillin','2371 Delladonna Center',3,1833,40,'rhillin1m@wikipedia.org','2020-09-10','240 157 0964',1,'Male','152-07-3290','CodeCus'),(60,'Arielle Tousey','344 Division Trail',4,1454,43,'atousey1n@free.fr','2020-01-01','670 761 5441',1,'Female','312-14-4081','CodeCus'),(61,'Frank Trippett','90184 Merrick Park',4,4887,8,'ftrippett1o@unc.edu','2020-05-10','746 840 8549',0,'Male','140-85-9185','CodeCus'),(62,'Warden Van de Velde','0 Glendale Way',2,48,57,'wvan1p@opera.com','2019-12-27','981 559 3856',1,'Male','749-12-1217','CodeCus'),(63,'Lavina Fardoe','13488 Lerdahl Street',4,4856,16,'lfardoe1q@t.co','2020-05-20','474 871 8078',0,'Female','731-72-2961','CodeCus'),(64,'Emmy Choules','0455 Harper Court',1,1611,35,'echoules1r@nymag.com','2020-09-21','559 726 3147',0,'Male','167-29-3139','CodeCus'),(65,'Vincent Ganderton','84 Brown Place',5,1089,58,'vganderton1s@slideshare.net','2020-01-11','642 112 2227',1,'Male','623-43-6273','CodeCus'),(66,'Sly Occleshaw','052 Graceland Avenue',2,4554,95,'soccleshaw1t@cisco.com','2019-10-18','342 255 8629',1,'Male','721-89-4534','CodeCus'),(67,'Lea Buessen','26165 Linden Court',5,1590,76,'lbuessen1u@springer.com','2020-09-20','947 316 3252',0,'Female','365-99-9204','CodeCus'),(68,'Alec Ericssen','27 Dorton Park',3,636,96,'aericssen1v@jalbum.net','2019-11-08','371 732 4156',1,'Male','329-65-0076','CodeCus'),(69,'Vilhelmina Billington','51868 Garrison Avenue',2,2575,59,'vbillington1w@nydailynews.com','2020-05-16','750 957 0618',0,'Female','131-93-2973','CodeCus'),(70,'Blake Dine-Hart','4 Service Junction',3,3173,14,'bdinehart1x@lulu.com','2019-11-05','557 410 2069',0,'Male','200-37-6663','CodeCus'),(71,'Rivi Newstead','3 Clarendon Way',5,2747,100,'rnewstead1y@bizjournals.com','2019-10-28','254 325 0162',0,'Female','738-32-3743','CodeCus'),(72,'Jacki Normanvill','3447 Walton Plaza',3,4986,66,'jnormanvill1z@go.com','2019-10-26','509 140 8179',0,'Female','846-18-0115','CodeCus'),(73,'Gayel Botright','16 Sunfield Way',2,1103,98,'gbotright20@usnews.com','2020-07-30','966 763 3674',0,'Female','240-83-8168','CodeCus'),(74,'Ceil Loutheane','0148 Brentwood Road',1,3381,67,'cloutheane21@eventbrite.com','2020-08-19','976 806 3980',1,'Female','514-85-0090','CodeCus'),(75,'Aldous Geockle','533 Calypso Lane',4,4124,71,'ageockle22@telegraph.co.uk','2020-06-11','937 909 2906',1,'Male','239-81-5417','CodeCus'),(76,'Zolly Jaycocks','519 Messerschmidt Alley',1,1081,17,'zjaycocks23@about.me','2020-04-03','779 293 5232',0,'Male','864-11-8186','CodeCus'),(77,'Tandy Varfolomeev','25865 Morningstar Crossing',3,1697,77,'tvarfolomeev24@list-manage.com','2020-05-20','993 231 0263',0,'Female','855-60-0848','CodeCus'),(78,'Meade Cordelette','73813 Eagle Crest Circle',3,4078,11,'mcordelette25@cocolog-nifty.com','2020-01-30','292 160 6248',1,'Male','806-98-9437','CodeCus'),(79,'Roderigo Gravie','25925 Anderson Road',2,4026,54,'rgravie26@wikia.com','2020-03-06','972 807 3276',1,'Male','185-14-3902','CodeCus'),(80,'Baron Hanks','188 2nd Street',1,1314,75,'bhanks27@cnn.com','2020-03-09','634 875 3741',1,'Male','453-33-5205','CodeCus'),(81,'Germain MacAllister','61000 Comanche Avenue',1,4336,73,'gmacallister28@wunderground.com','2020-08-21','415 136 9746',0,'Female','370-74-7263','CodeCus'),(82,'Timofei Tomasino','20836 Havey Junction',4,499,96,'ttomasino29@addthis.com','2019-10-23','499 238 5114',1,'Male','880-30-4299','CodeCus'),(83,'Nicholas McMoyer','6 Karstens Street',4,808,89,'nmcmoyer2a@blogspot.com','2020-09-03','222 547 8224',0,'Male','868-54-8505','CodeCus'),(84,'Darrell Panketh','43 Judy Alley',3,2722,75,'dpanketh2b@wiley.com','2020-04-25','802 911 3293',1,'Male','262-09-0158','CodeCus'),(85,'Nathalia Gabbitas','5 Mockingbird Street',4,134,37,'ngabbitas2c@oaic.gov.au','2020-01-30','259 635 9832',1,'Female','613-89-8483','CodeCus'),(86,'Maryl Farmiloe','59 Shelley Avenue',1,3874,82,'mfarmiloe2d@google.co.uk','2020-02-01','116 358 9132',0,'Female','781-31-6080','CodeCus'),(87,'Geoff Frazier','437 New Castle Road',2,47,13,'gfrazier2e@weebly.com','2020-01-24','646 737 0527',1,'Male','680-75-1116','CodeCus'),(88,'Laughton Liff','5839 Superior Way',5,1626,56,'lliff2f@wikipedia.org','2020-09-23','846 875 7513',1,'Male','817-31-2919','CodeCus'),(89,'Timmy Proudlove','16387 Sage Plaza',3,2409,48,'tproudlove2g@ted.com','2020-09-20','559 892 2309',1,'Female','535-76-3032','CodeCus'),(90,'Olvan Valler','50 Village Green Circle',5,1652,8,'ovaller2h@npr.org','2020-10-10','565 902 1380',0,'Male','197-65-5878','CodeCus'),(91,'Florrie Zanuciolii','18695 International Lane',3,1865,15,'fzanuciolii2i@admin.ch','2020-06-08','672 479 0154',0,'Female','567-61-1443','CodeCus'),(92,'Beulah Demangeon','2 Sutteridge Court',4,946,98,'bdemangeon2j@histats.com','2020-05-10','103 475 9827',0,'Female','328-08-6664','CodeCus'),(93,'Arluene Thresher','8688 Morning Court',4,3516,11,'athresher2k@senate.gov','2019-11-25','577 552 6894',1,'Female','122-65-5817','CodeCus'),(94,'Giana Samet','0921 Rusk Hill',4,3062,18,'gsamet2l@bbb.org','2020-08-28','626 753 8058',0,'Female','710-79-8152','CodeCus'),(95,'Tabby Tipton','14 Tennessee Trail',5,4447,23,'ttipton2m@blogspot.com','2020-07-16','236 585 2725',0,'Female','251-48-2406','CodeCus'),(96,'Leslie Hargie','77 Clyde Gallagher Junction',3,4333,36,'lhargie2n@npr.org','2020-05-13','834 321 9560',0,'Female','607-98-4318','CodeCus'),(97,'Allyson Todhunter','39 Old Gate Court',3,2791,58,'atodhunter2o@com.com','2020-09-19','152 506 9108',1,'Female','834-22-0544','CodeCus'),(98,'Marilin Fairbeard','6957 Myrtle Junction',2,3647,27,'mfairbeard2p@ox.ac.uk','2020-10-15','496 307 7039',0,'Female','444-50-3933','CodeCus'),(99,'Shelagh Foreman','10 Carioca Center',3,376,35,'sforeman2q@tumblr.com','2019-12-24','423 584 3043',1,'Female','430-16-6339','CodeCus'),(100,'Theo Baynom','60304 4th Drive',4,3591,55,'tbaynom2r@cocolog-nifty.com','2020-10-09','482 408 6509',0,'Male','340-60-8490','CodeCus');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_type`
--

DROP TABLE IF EXISTS `customer_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_type`
--

LOCK TABLES `customer_type` WRITE;
/*!40000 ALTER TABLE `customer_type` DISABLE KEYS */;
INSERT INTO `customer_type` VALUES (1,'standard'),(2,'silver'),(3,'gold'),(4,'platium'),(5,'diamond');
/*!40000 ALTER TABLE `customer_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_drink`
--

DROP TABLE IF EXISTS `food_drink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food_drink` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  `image_url` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_drink`
--

LOCK TABLES `food_drink` WRITE;
/*!40000 ALTER TABLE `food_drink` DISABLE KEYS */;
INSERT INTO `food_drink` VALUES (1,'corn',18.5,NULL,NULL),(2,'drink',23.5,NULL,NULL);
/*!40000 ALTER TABLE `food_drink` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hall`
--

DROP TABLE IF EXISTS `hall`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hall` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `seat_quantity` int DEFAULT NULL,
  `hall_type_id` int DEFAULT NULL,
  `theatre_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_hall_hall_type1_idx` (`hall_type_id`),
  KEY `fk_hall_theatre1_idx` (`theatre_id`),
  CONSTRAINT `fk_hall_hall_type1` FOREIGN KEY (`hall_type_id`) REFERENCES `hall_type` (`id`),
  CONSTRAINT `fk_hall_theatre1` FOREIGN KEY (`theatre_id`) REFERENCES `theatre` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hall`
--

LOCK TABLES `hall` WRITE;
/*!40000 ALTER TABLE `hall` DISABLE KEYS */;
INSERT INTO `hall` VALUES (1,'Grand Cherokee',69,5,7),(2,'Taurus',58,4,12),(3,'Sportage',56,1,22),(4,'Firefly',69,5,15),(5,'CL-Class',54,5,8),(6,'CX-7',60,1,3),(7,'Grand Prix',62,1,8),(8,'Reno',51,1,24),(9,'Dakota',60,1,14),(10,'911',60,2,22),(11,'Echo',70,1,18),(12,'F-Series Super Duty',52,4,8),(13,'300CE',69,3,19),(14,'Mazdaspeed 3',58,2,14),(15,'F-Series',58,3,12);
/*!40000 ALTER TABLE `hall` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hall_type`
--

DROP TABLE IF EXISTS `hall_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hall_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hall_type`
--

LOCK TABLES `hall_type` WRITE;
/*!40000 ALTER TABLE `hall_type` DISABLE KEYS */;
INSERT INTO `hall_type` VALUES (1,'Terrain','pede lobortis ligula sit amet eleifs vesntes'),(2,'Murciélago','libero convallis eget luctus eodio justo sollicitudin ut'),(3,'960','cursus urna ut tellus nulla ut erat id maurieemper'),(4,'S10','ipsum integer a nibh in quis justo maecenas rrra pede ac diam'),(5,'A4','dolor sit amet consectetuer adipiscing re cubinec nisi'),(6,'SLS-Class','eu tincidunt in leo maecenais a pede'),(7,'Camry Solara','aliquet massa id lobortis convallis tortoer augue a s tellus'),(9,'Celica','in felis donec semper sapien a libentesque'),(10,'Esteem','at velit eu est congue elementum in hac habitam ila jurpis sed ante'),(11,'G-Series G30','magna vulputate luctus cum rturient montes'),(12,'FJ Cruiser','vestibulum ante ipsum primis in c nisi volutpat umsan'),(13,'Colorado','justo pellentesque vivequam phpsum prcus at turpis'),(14,'CL','massa id lobortis convallis tortor risus dapibus a id luctus'),(15,'Vigor','pellentesque eget nunc donec quis orci eget ons sit amet');
/*!40000 ALTER TABLE `hall_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,'Tokyo'),(2,'Ha Noi'),(3,'Singaporte'),(4,'New York'),(5,'Beijing');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `director` varchar(45) DEFAULT NULL,
  `actor` varchar(45) DEFAULT NULL,
  `is_sub` tinyint DEFAULT '1',
  `is_2d` tinyint DEFAULT '1',
  `poster_url` varchar(300) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `duration` int DEFAULT NULL,
  `trailer_url` varchar(250) DEFAULT NULL,
  `star_rating` int DEFAULT NULL,
  `movie_rated_age_id` int DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `entertainment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_movie_movie_rated_age1_idx` (`movie_rated_age_id`),
  CONSTRAINT `fk_movie_movie_rated_age1` FOREIGN KEY (`movie_rated_age_id`) REFERENCES `movie_rated_age` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'End of Poverty, The','De Pozzi','Zach Cuddehy',0,0,'https://robohash.org/voluptassedaut.jpg?size=200x300&set=set1','2020-11-17','2020-10-16',173,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,4,'volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat','Bambuí'),(2,'Mother Carey\'s Chickens','Floria Bedborough','Rossie Camelin',0,0,'https://robohash.org/autdolorequia.jpg?size=200x300&set=set1','2020-10-20','2020-01-06',120,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,5,'duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse','San Fernando del Valle de Catamarca'),(3,'Balto: Wolf Quest ','Cleveland Craisford','Viki Sollitt',0,0,'https://robohash.org/abadipiscinihil.jpg?size=200x300&set=set1','2020-11-02','2020-06-10',208,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,2,'id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor id','Tongzi'),(4,'Sandra of a Thousand Delights (Vaghe stelle dell\'Orsa...)','Saraann Dundendale','Katharina Mylechreest',0,0,'https://robohash.org/sitquihic.jpg?size=200x300&set=set1','2020-10-24','2020-10-18',110,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,2,'duis faucibus accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris','Doloplazy'),(5,'G.I. Joe: Operation Dragonfire','Finley Beacroft','Domenico Wickliffe',0,1,'https://robohash.org/minimaasperioreset.png?size=200x300&set=set1','2020-11-18','2020-07-16',87,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,3,'sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in imperdiet et commodo','Jieshipu'),(6,'Sex in Chains (Geschlecht in Fesseln)','Truman Benoist','Andriette Milnes',1,1,'https://robohash.org/minusipsalaboriosam.png?size=200x300&set=set1','2020-10-23','2020-05-27',173,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,3,'nunc purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede','Pampa Hermosa'),(7,'Heavy Petting','Cody Creenan','Dinny Crafts',0,1,'https://robohash.org/enimquonam.png?size=200x300&set=set1','2020-11-01','2020-08-22',201,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,1,'vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum','Mariestad'),(8,'Drona','Maryrose Gaydon','Lefty Sinderland',0,1,'https://robohash.org/atemporibusvoluptatem.png?size=200x300&set=set1','2020-11-03','2020-11-30',122,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,5,'sit amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus','Pingkai'),(9,'Greaser\'s Palace','Trix Dawnay','Sanson Yanuk',1,0,'https://robohash.org/veritatisoccaecatisuscipit.jpg?size=200x300&set=set1','2020-11-14','2020-08-27',194,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,4,'vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim lorem','Guangning'),(10,'Pot O\' Gold','Carie Klaiser','Luisa Bambridge',0,0,'https://robohash.org/etexplicabotempora.png?size=200x300&set=set1','2020-10-27','2020-07-18',111,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus in felis eu sapien','Gufeng'),(11,'Late Marriage (Hatuna Meuheret)','Marvin Bourbon','Ericka Branton',1,1,'https://robohash.org/aliquamquipossimus.bmp?size=200x300&set=set1','2020-10-27','2020-03-19',146,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,3,'accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat morbi a ipsum integer a nibh in quis justo maecenas rhoncus aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed justo pellentesque viverra pede ac diam cras pellentesque volutpat dui','Ninghai'),(12,'Anchorman 2: The Legend Continues','Susan Rapaport','Charity Falconbridge',1,1,'https://robohash.org/inanimiofficia.jpg?size=200x300&set=set1','2020-10-21','2020-06-07',189,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,2,'convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae nulla dapibus dolor vel est donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id','Buesaco'),(13,'Believers, The','Brooke Hitzschke','Ashely Dunham',1,0,'https://robohash.org/corruptimagnamomnis.png?size=200x300&set=set1','2020-11-04','2020-06-06',141,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,2,'porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis','Hantai'),(14,'Wind That Shakes the Barley, The','Archy Ashlee','Silvio Layus',0,1,'https://robohash.org/atqueearerum.jpg?size=200x300&set=set1','2020-10-31','2020-06-29',114,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,4,'massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula nec','Minnedosa'),(15,'Severed Arm, The','Loralie Hankey','Amelia Forsbey',1,0,'https://robohash.org/doloremeumlibero.bmp?size=200x300&set=set1','2020-11-12','2020-05-31',162,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,2,'ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis donec posuere metus vitae ipsum aliquam non mauris morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu felis','Nagiba'),(16,'From Dusk Till Dawn 2: Texas Blood Money ','Renie Comoletti','Lin Loveitt',0,1,'https://robohash.org/sintestiste.png?size=200x300&set=set1','2020-11-17','2020-08-28',177,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,2,'elit proin risus praesent lectus vestibulum quam sapien varius ut blandit non interdum in ante vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus','Zamoskvorech’ye'),(17,'Bogus','Kippar Haney','Eden Tripon',1,1,'https://robohash.org/etipsumid.jpg?size=200x300&set=set1','2020-10-28','2020-01-17',195,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'condimentum curabitur in libero ut massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula','Popova'),(18,'Ascension','Collin Durrant','Ray Truin',1,1,'https://robohash.org/cumquemolestiaeillo.jpg?size=200x300&set=set1','2020-11-04','2020-08-24',140,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,5,'a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum','Shengrenjian'),(19,'The Pentagon Papers','Rodd Martinec','Kissie Oxlee',1,1,'https://robohash.org/omnisquibusdamullam.jpg?size=200x300&set=set1','2020-11-12','2020-05-16',115,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,2,'eget elit sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum ante ipsum','Watubura'),(20,'Forever Mine','Sargent Catterell','Lulita Powis',0,1,'https://robohash.org/quiipsamconsequatur.bmp?size=200x300&set=set1','2020-10-27','2020-07-04',151,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit ac nulla sed vel enim sit amet nunc viverra','Bayzhansay'),(21,'Captive (Cautiva) ','Clarance Weightman','Marcellus Rosina',1,1,'https://robohash.org/architectoullamnam.bmp?size=200x300&set=set1','2020-10-21','2019-12-14',182,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,5,'mauris morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis','Urayasu'),(22,'L.A. Zombie','Anselma Plowell','Dennie Dowe',1,0,'https://robohash.org/doloribusearumut.bmp?size=200x300&set=set1','2020-10-28','2019-12-24',167,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,3,'elit proin interdum mauris non ligula pellentesque ultrices phasellus id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis','Itaperuna'),(23,'Divo, Il','Will Lazare','Grantley Danilevich',0,0,'https://robohash.org/doloremlaudantiumporro.jpg?size=200x300&set=set1','2020-11-01','2020-01-09',202,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,1,'purus aliquet at feugiat non pretium quis lectus suspendisse potenti in eleifend quam a odio in hac habitasse platea dictumst maecenas ut massa quis augue luctus tincidunt nulla mollis molestie lorem quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent','Złotniki Kujawskie'),(24,'Window, The','Lizabeth Featherby','Ware Beckey',0,1,'https://robohash.org/aliquidquivelit.jpg?size=200x300&set=set1','2020-10-30','2020-02-13',178,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,2,'habitasse platea dictumst maecenas ut massa quis augue luctus tincidunt nulla mollis molestie lorem quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla integer pede','Kashar'),(25,'Target','Kendal Ciciari','Augustine Bayford',1,1,'https://robohash.org/quivoluptateet.bmp?size=200x300&set=set1','2020-11-15','2019-12-31',70,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,3,'lorem ipsum dolor sit amet consectetuer adipiscing elit proin risus praesent lectus vestibulum quam sapien varius ut blandit non interdum in ante vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris','Pagsabangan'),(26,'Strongman','Uriah Chatan','Doroteya Valder',0,1,'https://robohash.org/vitaeminimafacilis.jpg?size=200x300&set=set1','2020-10-22','2020-01-18',106,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,3,'quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede morbi','Tukan'),(27,'I Saw the Devil (Akmareul boatda)','Burk Kidwell','Karim McAw',1,0,'https://robohash.org/rerumautquis.jpg?size=200x300&set=set1','2020-11-14','2020-04-08',131,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,4,'est donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam','Huambalpa'),(28,'Great McGinty, The','Abby Prince','Virgil Postance',1,1,'https://robohash.org/minimaasperioreslibero.bmp?size=200x300&set=set1','2020-10-26','2020-02-02',172,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,1,'lorem vitae mattis nibh ligula nec sem duis aliquam convallis nunc proin at turpis a pede posuere nonummy integer non velit donec diam neque vestibulum eget vulputate ut ultrices vel augue vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet','Taihu'),(29,'Riddick','Bobina Kellard','Vinni Matieu',0,1,'https://robohash.org/beataeoccaecatiin.bmp?size=200x300&set=set1','2020-11-12','2020-09-29',119,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,2,'nascetur ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum mauris non ligula pellentesque ultrices phasellus id sapien','Yanmenkou'),(30,'Love Affair','Keven Normanvell','Jerry Biscomb',1,0,'https://robohash.org/etexvoluptatem.png?size=200x300&set=set1','2020-11-04','2020-08-05',132,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,1,'vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue vel','Puchong'),(31,'My Boy Jack','Fedora Monelli','Ebba Adame',0,0,'https://robohash.org/utdelectusdolorum.png?size=200x300&set=set1','2020-10-25','2020-09-24',197,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,5,'nulla mollis molestie lorem quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede','Wanghu'),(32,'Nurse Betty','Arlana Jellicorse','Kania Happert',0,0,'https://robohash.org/sitveritatisofficia.png?size=200x300&set=set1','2020-10-28','2020-01-28',156,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,5,'morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus eu magna vulputate luctus','Beixiang'),(33,'Girl Said No, The','Hally Eringey','Diena Hurran',0,1,'https://robohash.org/teneturvelquia.jpg?size=200x300&set=set1','2020-11-15','2020-08-11',139,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,3,'nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque','Kolonowskie'),(34,'Devil\'s Knot','Ophelia Jarrad','Allyn Grayer',1,0,'https://robohash.org/solutadoloribusinventore.bmp?size=200x300&set=set1','2020-11-04','2020-03-14',188,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,3,'tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula nec sem duis aliquam convallis nunc proin at turpis a pede posuere nonummy integer non velit donec diam neque vestibulum eget vulputate','Águas Formosas'),(35,'Kiss Them for Me','Marika Gaine of England','Skipton Kadwallider',0,0,'https://robohash.org/utmodiarchitecto.jpg?size=200x300&set=set1','2020-11-03','2020-07-11',116,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,1,'vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis sapien sapien non mi integer ac neque duis bibendum morbi non quam nec dui luctus rutrum nulla tellus in sagittis dui vel nisl duis ac','Nanton'),(36,'Mother','Lilias Coupman','Sandor Spira',1,0,'https://robohash.org/eligendimolestiaevel.png?size=200x300&set=set1','2020-11-09','2020-02-28',158,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,1,'eu nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae nulla dapibus dolor vel est donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed','Xinmatou'),(37,'Behind the Screen','Brennan Toun','Farley Coleby',1,1,'https://robohash.org/beataequiomnis.bmp?size=200x300&set=set1','2020-10-31','2020-09-29',118,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor','Fuji'),(38,'30 Minutes or Less','Robinette Moorhouse','Perice Lappin',0,1,'https://robohash.org/suntvoluptatemofficia.png?size=200x300&set=set1','2020-10-31','2020-04-29',179,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,3,'ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien a libero nam','Alcanena'),(39,'Soo (Art of Revenge)','Agosto Allcott','Tome Brocket',1,1,'https://robohash.org/repudiandaeessefuga.bmp?size=200x300&set=set1','2020-11-15','2020-02-12',60,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,4,'augue vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis sapien sapien non mi integer ac neque duis bibendum morbi non quam nec dui luctus rutrum nulla tellus in sagittis dui vel nisl duis ac nibh fusce lacus purus aliquet at feugiat','Balsas'),(40,'Sugar Cane Alley (Rue cases nègres)','Vivianne McAuley','Trip Royston',1,1,'https://robohash.org/autemquaeratquis.jpg?size=200x300&set=set1','2020-11-01','2020-11-15',193,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,2,'velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor id consequat in','Nashville'),(41,'Dead Within','Kiri Bloodworthe','Duffy Rulf',0,0,'https://robohash.org/teneturquonumquam.bmp?size=200x300&set=set1','2020-11-17','2020-10-03',147,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,2,'nulla mollis molestie lorem quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla integer pede justo lacinia eget tincidunt eget','Iwonicz-Zdrój'),(42,'Journey, The','Trescha Bradane','Sunny Mallabar',0,1,'https://robohash.org/cupiditatevoluptatibusnihil.png?size=200x300&set=set1','2020-10-25','2020-11-18',61,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,1,'augue luctus tincidunt nulla mollis molestie lorem quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla integer pede justo lacinia eget','Lagoa Santa'),(43,'Camera Obscura','Zsazsa McGarvey','Joete Ridgedell',0,1,'https://robohash.org/pariaturdistinctioet.png?size=200x300&set=set1','2020-10-23','2020-05-27',161,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,4,'turpis donec posuere metus vitae ipsum aliquam non mauris morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam','Ak’ordat'),(44,'I Want You','Adan Blamires','Cami Stratton',0,0,'https://robohash.org/etsuntarchitecto.jpg?size=200x300&set=set1','2020-10-25','2020-09-16',119,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,4,'cubilia curae nulla dapibus dolor vel est donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse','Pirava'),(45,'Carnival of Souls','Seumas Kintzel','Evangelin Balk',0,0,'https://robohash.org/autemillumin.bmp?size=200x300&set=set1','2020-11-17','2020-11-17',63,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat morbi a','Las Flores'),(46,'Human Behavior Experiments, The','Florence Drewitt','Gaby Aleshkov',0,0,'https://robohash.org/corrupticumqueaut.bmp?size=200x300&set=set1','2020-10-22','2020-09-08',81,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,1,'volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula nec sem duis aliquam convallis nunc proin','Chaloem Phra Kiat'),(47,'Breaking News (Daai si gin)','Garold Rotham','Roxie Grigorkin',1,1,'https://robohash.org/facereconsequaturreprehenderit.png?size=200x300&set=set1','2020-11-02','2019-12-09',103,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,4,'magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis donec posuere metus vitae ipsum aliquam non mauris morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales','Dingbu'),(48,'Forgiven','Laurene Gemlett','Lionello Blaik',1,1,'https://robohash.org/suntutearum.bmp?size=200x300&set=set1','2020-10-30','2020-09-17',196,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,2,'proin risus praesent lectus vestibulum quam sapien varius ut blandit non interdum in ante vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus','Oranmore'),(49,'6 Desires: DH Lawrence and Sardinia','Di Durning','Glynis Vittery',1,0,'https://robohash.org/velametet.bmp?size=200x300&set=set1','2020-10-23','2020-08-24',188,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,1,'eget congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper','Ayaviri'),(50,'Operator 13','Egbert McCaighey','Llywellyn Coleridge',0,1,'https://robohash.org/earepellendusvoluptas.bmp?size=200x300&set=set1','2020-10-23','2019-12-13',229,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'venenatis non sodales sed tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus','Shishi'),(51,'Duellists, The','Rachael Churly','Welsh Filchagin',0,0,'https://robohash.org/idvoluptatelibero.png?size=200x300&set=set1','2020-10-27','2020-06-11',166,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,3,'sagittis sapien cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing','Qalqaman'),(52,'Ernest in the Army','Erskine Flaune','Knox Blastock',1,1,'https://robohash.org/numquameiusitaque.bmp?size=200x300&set=set1','2020-10-21','2020-03-12',168,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,2,'et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum nullam','Mujiangping'),(53,'Harlan County U.S.A.','Raina Ferreli','Seth Reinger',0,0,'https://robohash.org/asinttenetur.jpg?size=200x300&set=set1','2020-11-06','2020-10-11',63,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,1,'mauris morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend','Piteå'),(54,'Move Over, Darling','Cathyleen Cordingly','Deedee Adelberg',1,0,'https://robohash.org/cupiditateautut.bmp?size=200x300&set=set1','2020-11-06','2020-10-25',82,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit','Bailai'),(55,'Comic Book Villains','Milton Gabbot','Avivah Exer',0,0,'https://robohash.org/sinteumlaudantium.png?size=200x300&set=set1','2020-11-12','2020-02-13',229,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,2,'congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris eget','Jönköping'),(56,'There Goes My Heart','Lindsey Tatnell','Phillip Snaddin',0,1,'https://robohash.org/minimavoluptatemquia.png?size=200x300&set=set1','2020-11-09','2020-10-11',93,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,5,'ornare consequat lectus in est risus auctor sed tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium','Ballyboden'),(57,'Surf\'s Up','Nixie Ghioni','Zollie Brandin',1,1,'https://robohash.org/velestvoluptas.jpg?size=200x300&set=set1','2020-10-25','2020-01-01',129,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,5,'vel pede morbi porttitor lorem id ligula suspendisse ornare consequat lectus in est risus auctor sed tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi','Dagua'),(58,'Last Godfather, The','Riobard Pimbley','Giavani Kieran',0,0,'https://robohash.org/consequunturquirepellat.jpg?size=200x300&set=set1','2020-11-15','2020-11-02',228,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,2,'etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra','Kamsack'),(59,'Paradise, Hawaiian Style','Farrah Birdwistle','Maryann Reis',1,0,'https://robohash.org/nihilquibusdampraesentium.jpg?size=200x300&set=set1','2020-11-12','2020-09-23',70,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,4,'in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede','Stony Hill'),(60,'Vollidiot','Lynelle McLarens','Vasilis Di Napoli',1,0,'https://robohash.org/voluptasautiure.jpg?size=200x300&set=set1','2020-10-31','2020-06-01',208,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,2,'penatibus et magnis dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in imperdiet et','Jawor'),(61,'Hour of the Gun','Sibyl Pena','Roscoe Latimer',0,0,'https://robohash.org/evenietnumquamcumque.jpg?size=200x300&set=set1','2020-11-13','2020-01-15',208,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,1,'a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla','Ojos de Agua'),(62,'My Boyfriend\'s Back','Lesli Baigrie','Shandy Drane',1,0,'https://robohash.org/laboriosampariaturmollitia.png?size=200x300&set=set1','2020-10-22','2020-09-27',167,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,2,'sapien varius ut blandit non interdum in ante vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id','Loreto'),(63,'Undefeatable','Juditha Bebbington','Timi Larrie',1,0,'https://robohash.org/quosnostrumet.bmp?size=200x300&set=set1','2020-11-12','2020-10-30',185,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse','Astghadzor'),(64,'Dead or Alive: Hanzaisha','Kippy Glyne','Alyssa Pabelik',0,1,'https://robohash.org/magnamimpeditatque.png?size=200x300&set=set1','2020-11-09','2020-02-23',209,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,2,'ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis donec posuere metus vitae ipsum aliquam non mauris morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt','Gigante'),(65,'In Country','Estella Figgess','Hyacinth Letson',0,1,'https://robohash.org/quasiquinatus.png?size=200x300&set=set1','2020-10-24','2020-12-12',80,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,5,'suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae nulla dapibus dolor vel est','Mujur'),(66,'The Story of Robin Hood and His Merrie Men','Nikki Toovey','Vidovik Addicote',1,0,'https://robohash.org/quaeullamvitae.jpg?size=200x300&set=set1','2020-11-05','2020-08-07',191,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,4,'sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus eu magna vulputate luctus cum sociis natoque penatibus','Qindu'),(67,'The Boy Next Door','Jeno Gooden','Hyman Coleridge',1,0,'https://robohash.org/perferendisipsamofficia.jpg?size=200x300&set=set1','2020-10-23','2020-10-30',147,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,2,'urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at','Bobrovka'),(68,'Missing, The','Faina Moulden','Raul Sudy',0,1,'https://robohash.org/quomodinostrum.bmp?size=200x300&set=set1','2020-10-24','2020-11-09',88,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,4,'pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis turpis sed ante','Takasaki'),(69,'Liv & Ingmar','Blondelle Cheel','Malinda Swalowe',0,0,'https://robohash.org/assumendaquosrerum.png?size=200x300&set=set1','2020-10-28','2020-11-13',146,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,5,'rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede morbi porttitor lorem id ligula suspendisse ornare consequat lectus in est risus auctor sed tristique in tempus sit amet sem fusce consequat','Eixo'),(70,'Homecoming, The','Joice Pedican','Elvera Brahm',1,0,'https://robohash.org/utliberovoluptatem.png?size=200x300&set=set1','2020-11-10','2020-05-01',154,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,3,'lectus pellentesque at nulla suspendisse potenti cras in purus eu magna vulputate luctus cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id','Paris 02'),(71,'K-11','Stephie Buterton','Al Tyrone',1,1,'https://robohash.org/sintutet.bmp?size=200x300&set=set1','2020-10-24','2020-04-29',160,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,2,'ut massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula nec sem duis aliquam convallis','Deneysville'),(72,'Memories of Underdevelopment (Memorias del subdesarrollo)','Gusella Sherrum','Lorrie McGilmartin',1,1,'https://robohash.org/saepeenimexercitationem.bmp?size=200x300&set=set1','2020-11-01','2019-12-13',123,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,5,'rhoncus aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed justo pellentesque viverra pede ac diam cras pellentesque volutpat dui maecenas tristique est et tempus semper est quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices','Luojiang'),(73,'Creation','Jermaine Ravenshear','Jaime Jeynes',0,0,'https://robohash.org/earumenimdolor.bmp?size=200x300&set=set1','2020-11-03','2020-06-13',224,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,1,'adipiscing lorem vitae mattis nibh ligula nec sem duis aliquam convallis nunc proin at turpis a pede posuere nonummy integer non velit donec diam neque vestibulum eget vulputate ut ultrices vel augue vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi','Jieznas'),(74,'Contagion / Bio Slime','Bondy Kulvear','Nicoli Benedidick',0,1,'https://robohash.org/assumendarerumalias.png?size=200x300&set=set1','2020-10-30','2020-05-27',171,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,2,'nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus eu magna vulputate luctus cum sociis natoque penatibus et magnis dis parturient montes nascetur','Rosmalen'),(75,'Book of Life, The','Eberto Gaitone','Shadow Stennard',1,0,'https://robohash.org/utdoloremnemo.png?size=200x300&set=set1','2020-10-31','2020-05-20',209,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,2,'magnis dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in imperdiet et commodo vulputate','Marignane'),(76,'End of Poverty, The','Agace Simpson','Dennison Coathup',0,0,'https://robohash.org/nostrumautin.png?size=200x300&set=set1','2020-10-28','2020-10-10',208,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,1,'lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede morbi porttitor lorem id ligula suspendisse ornare consequat lectus in est risus auctor sed tristique in tempus sit amet','Yingjiang'),(77,'Last Airbender, The','Boothe Breeze','Gabriella Donativo',1,1,'https://robohash.org/blanditiisquidemveniam.png?size=200x300&set=set1','2020-11-10','2020-03-30',208,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,3,'sed tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam','Boroko'),(78,'The Girls','Foster Pie','Randa Bleaden',1,1,'https://robohash.org/nihilofficiisquo.jpg?size=200x300&set=set1','2020-11-14','2020-06-06',220,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,4,'sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia','Yuto'),(79,'Easy Rider','Guilbert Shawe','Rahal Treversh',0,0,'https://robohash.org/animisitadipisci.bmp?size=200x300&set=set1','2020-11-11','2020-04-22',136,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,1,'nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede morbi porttitor lorem id ligula suspendisse ornare consequat lectus in est risus auctor sed tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede','Leping'),(80,'Felix the Cat: The Movie','Duncan Ulrik','Gib Statton',0,1,'https://robohash.org/dolorumutexcepturi.jpg?size=200x300&set=set1','2020-10-21','2020-02-17',208,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,3,'viverra eget congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices','Bungoma'),(81,'Birds, the Bees and the Italians, The (Signore & signori)','Lew Lanning','Chick Sherman',0,1,'https://robohash.org/nullaconsequatureum.jpg?size=200x300&set=set1','2020-10-25','2020-09-20',125,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros','Koufália'),(82,'Navigator, The','Wang Damiral','Tiebout Bodley',1,1,'https://robohash.org/velitfugitasperiores.png?size=200x300&set=set1','2020-10-29','2020-03-06',156,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,4,'pellentesque volutpat dui maecenas tristique est et tempus semper est quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis donec posuere metus vitae ipsum aliquam non mauris morbi non lectus aliquam sit amet diam in','Zhouhe'),(83,'American Hustle','Katinka Danes','Caitrin Tuckey',0,0,'https://robohash.org/voluptatemfaceredolorem.png?size=200x300&set=set1','2020-10-28','2020-02-27',206,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit ac nulla sed vel enim sit amet nunc viverra dapibus nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit amet','Badou'),(84,'Painted Veil, The','Ashlie Belham','Meagan Jagiello',0,1,'https://robohash.org/etvoluptatumfacere.jpg?size=200x300&set=set1','2020-11-09','2019-12-05',195,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,5,'nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula','Salamanca'),(85,'Age of Innocence, The','Mae Tingle','Gabby Zamudio',1,0,'https://robohash.org/perspiciatisnostrumnumquam.png?size=200x300&set=set1','2020-10-29','2019-12-16',212,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,3,'praesent blandit nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede morbi porttitor lorem id ligula suspendisse ornare consequat lectus in est risus auctor sed tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor','Gingsir'),(86,'How to Marry a Millionaire','Hubey Tummond','Cass Meeks',0,0,'https://robohash.org/earumautemfacere.bmp?size=200x300&set=set1','2020-11-11','2020-11-15',63,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'nunc purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit ac nulla sed vel','Cikaung'),(87,'Godzilla\'s Revenge (Gojira-Minira-Gabara: Oru Kaijû Daishingeki) (All Monsters Attack)','Jacquelynn Leguey','Raquel Pickersgill',0,0,'https://robohash.org/temporequiamollitia.jpg?size=200x300&set=set1','2020-10-30','2019-11-24',207,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,5,'in felis donec semper sapien a libero nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit','城郊'),(88,'Napoléon','Lotty Heaton','Alaster Brookes',0,0,'https://robohash.org/teneturasperioresnobis.bmp?size=200x300&set=set1','2020-11-14','2020-04-29',135,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,4,'etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat','Rajhrad'),(89,'Brainstorm','Purcell Smiz','Tania Dimbylow',1,0,'https://robohash.org/voluptatemofficialaboriosam.bmp?size=200x300&set=set1','2020-10-28','2020-06-02',229,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,1,'cras in purus eu magna vulputate luctus cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean','Songlong'),(90,'Highlander II: The Quickening','Niels Stower','Lorri Volke',1,1,'https://robohash.org/quisetinventore.png?size=200x300&set=set1','2020-10-27','2020-05-02',67,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,4,'mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis donec posuere metus vitae ipsum aliquam non mauris morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar','Cimanggu'),(91,'Bird of Prey','Donnie Junkin','Johanna Drust',0,1,'https://robohash.org/ullamlaudantiumfuga.png?size=200x300&set=set1','2020-11-11','2020-05-02',221,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,5,'tempus vel pede morbi porttitor lorem id ligula suspendisse ornare consequat lectus in est risus auctor sed tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac','Nonggunong'),(92,'Revenge of the Nerds IV: Nerds in Love','Gisela Reding','Tamiko Abendroth',1,0,'https://robohash.org/deseruntenimlaudantium.jpg?size=200x300&set=set1','2020-11-08','2019-12-11',202,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,3,'consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit ac nulla sed vel enim sit amet nunc viverra dapibus nulla suscipit ligula in lacus curabitur','Pakkat'),(93,'Rewrite, The','Priscella Heiton','Hewett Nardi',1,0,'https://robohash.org/velodionon.jpg?size=200x300&set=set1','2020-11-11','2020-05-29',178,'https://www.youtube.com/watch?v=3od-kQMTZ9M',3,5,'at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris','Nangalisan'),(94,'F/X','Arty Dellenbrook','Ashlee Alfwy',0,1,'https://robohash.org/sintvoluptatemautem.jpg?size=200x300&set=set1','2020-11-13','2020-04-23',73,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,2,'at vulputate vitae nisl aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus in felis eu sapien cursus vestibulum proin','Madruga'),(95,'Joy Ride','Carmella Waymont','Dallon Vercruysse',0,1,'https://robohash.org/quidemetomnis.png?size=200x300&set=set1','2020-11-08','2019-11-24',61,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,1,'morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus eu magna vulputate luctus cum sociis natoque penatibus et magnis dis','Kabala'),(96,'The First Movie','Benedetta Scrymgeour','Alain Haggith',1,1,'https://robohash.org/distinctioaccusamusdeleniti.jpg?size=200x300&set=set1','2020-11-15','2020-11-28',168,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,1,'vestibulum sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat morbi a ipsum integer a nibh in quis justo maecenas rhoncus aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas','Swindon'),(97,'Lovers, The (Les Amants)','Iormina Jerrome','Andrea Dominetti',1,0,'https://robohash.org/suntnihilmollitia.bmp?size=200x300&set=set1','2020-10-27','2020-02-07',69,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,4,'eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat morbi a ipsum integer a nibh in quis justo maecenas rhoncus aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed justo pellentesque viverra pede ac diam cras pellentesque volutpat dui maecenas tristique est','Tygda'),(98,'Excuse Me Darling, But Lucas Loved Me','Olivero Matton','Dwight Tayloe',1,0,'https://robohash.org/aliquideteos.jpg?size=200x300&set=set1','2020-11-04','2020-03-20',167,'https://www.youtube.com/watch?v=3od-kQMTZ9M',4,3,'maecenas tristique est et tempus semper est quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis donec posuere metus vitae ipsum aliquam non mauris morbi non lectus aliquam sit amet diam in magna','Sop Moei'),(99,'Gangster Squad','Benji Halshaw','Evita Joanic',1,0,'https://robohash.org/eumliberoquisquam.bmp?size=200x300&set=set1','2020-10-23','2020-03-12',137,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,5,'rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat morbi a ipsum integer a nibh in quis justo','Eldoret'),(100,'DEFCON: The Documentary','Kayle Clayson','Pembroke Adne',1,1,'https://robohash.org/suntbeataeest.png?size=200x300&set=set1','2020-11-17','2020-09-30',123,'https://www.youtube.com/watch?v=3od-kQMTZ9M',5,4,'sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros elementum pellentesque quisque porta','Farsta');
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_genre_associate`
--

DROP TABLE IF EXISTS `movie_genre_associate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_genre_associate` (
  `id` int NOT NULL AUTO_INCREMENT,
  `movie_id` int DEFAULT NULL,
  `movie_genre_type_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_movie_genre_associate_movie1_idx` (`movie_id`),
  KEY `fk_movie_genre_associate_movie_genre_type1_idx` (`movie_genre_type_id`),
  CONSTRAINT `fk_movie_genre_associate_movie1` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`),
  CONSTRAINT `fk_movie_genre_associate_movie_genre_type1` FOREIGN KEY (`movie_genre_type_id`) REFERENCES `movie_genre_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_genre_associate`
--

LOCK TABLES `movie_genre_associate` WRITE;
/*!40000 ALTER TABLE `movie_genre_associate` DISABLE KEYS */;
INSERT INTO `movie_genre_associate` VALUES (1,46,7),(2,63,3),(3,41,1),(4,66,2),(5,72,3),(6,85,2),(7,83,5),(8,39,7),(9,92,5),(10,29,2),(11,90,5),(12,77,1),(13,72,4),(14,10,6),(15,34,7),(16,34,7),(17,48,4),(18,38,1),(19,2,6),(20,92,5),(21,38,7),(22,37,5),(23,36,3),(24,77,2),(25,46,7),(26,87,6),(27,83,5),(28,73,2),(29,96,3),(30,16,3),(31,35,2),(32,2,4),(33,84,2),(34,46,7),(35,33,4),(36,66,2),(37,7,5),(38,43,3),(39,15,3),(40,58,4),(41,65,2),(42,72,2),(43,37,6),(44,58,4),(45,75,4),(46,1,1),(47,42,5),(48,90,3),(49,32,4),(50,26,2),(51,1,3),(52,51,4),(53,61,2),(54,78,5),(55,48,3),(56,22,4),(57,75,4),(58,69,7),(59,21,5),(60,55,5),(61,9,5),(62,93,4),(63,63,6),(64,47,6),(65,89,6),(66,14,1),(67,81,6),(68,82,5),(69,54,4),(70,18,2),(71,44,1),(72,100,1),(73,88,3),(74,2,6),(75,78,2),(76,98,2),(77,87,6),(78,52,3),(79,59,5),(80,41,1),(81,10,3),(82,75,2),(83,33,7),(84,81,3),(85,64,1),(86,98,6),(87,97,7),(88,52,1),(89,78,4),(90,62,5),(91,43,4),(92,25,6),(93,27,4),(94,10,3),(95,40,2),(96,60,7),(97,100,2),(98,9,1),(99,76,5),(100,99,4);
/*!40000 ALTER TABLE `movie_genre_associate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_genre_type`
--

DROP TABLE IF EXISTS `movie_genre_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_genre_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_genre_type`
--

LOCK TABLES `movie_genre_type` WRITE;
/*!40000 ALTER TABLE `movie_genre_type` DISABLE KEYS */;
INSERT INTO `movie_genre_type` VALUES (1,'Crime|Thriller','vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia'),(2,'Action','accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris'),(3,'Drama','sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae'),(4,'Fantasy','at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede'),(5,'Horror','purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor id consequat in'),(6,'Comedy','ipsum ac tellus semper interdum mauris ullamcorper purus sit amet nulla quisque arcu libero rutrum ac lobortis'),(7,'Mystery','felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in'),(8,'Romance','felis sed interdum  massa donec dapibus duis at velit eu est congue elementum in'),(9,'Thriller','felis sed interdum  massa donec dapibus duis at velit eu est congue elementum in'),(10,'Western','felis sed interdum  massa donec dapibus duis at velit eu est congue elementum in'),(11,'Disaster Thriller','felis sed interdum  massa donec dapibus duis at velit eu est congue elementum in'),(12,'Techno Thriller','felis sed interdum  massa donec dapibus duis at velit eu est congue elementum in');
/*!40000 ALTER TABLE `movie_genre_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_rated_age`
--

DROP TABLE IF EXISTS `movie_rated_age`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_rated_age` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_rated_age`
--

LOCK TABLES `movie_rated_age` WRITE;
/*!40000 ALTER TABLE `movie_rated_age` DISABLE KEYS */;
INSERT INTO `movie_rated_age` VALUES (1,'G','General Audiences'),(2,'PG','Parental Guidance Suggested'),(3,'PG-13','Parents Strongly Cautioned'),(4,'R','Restricted'),(5,'CR','Children');
/*!40000 ALTER TABLE `movie_rated_age` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `other`
--

DROP TABLE IF EXISTS `other`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `other` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `other`
--

LOCK TABLES `other` WRITE;
/*!40000 ALTER TABLE `other` DISABLE KEYS */;
/*!40000 ALTER TABLE `other` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1,'Visa'),(2,'Cash'),(3,'Paypal');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position`
--

DROP TABLE IF EXISTS `position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `position` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` VALUES (1,'Director','Giám Đốc'),(2,'Manager','Quản Lý'),(3,'Shif Supervisor','Giám Sát'),(4,'Staff','Nhân viên');
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promo_point`
--

DROP TABLE IF EXISTS `promo_point`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promo_point` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `bonus_point` int DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promo_point`
--

LOCK TABLES `promo_point` WRITE;
/*!40000 ALTER TABLE `promo_point` DISABLE KEYS */;
INSERT INTO `promo_point` VALUES (1,'PFSS',5,'Promotion for Standard seat'),(2,'PFVS',10,'Promotion for vip seat'),(3,'PFLS',15,'Promotion for lovers seat'),(4,'PFCS',15,'Promotion for couple seat'),(5,'PFBC',25,'Promotion for birthday customer');
/*!40000 ALTER TABLE `promo_point` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotion`
--

DROP TABLE IF EXISTS `promotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `show_id` int DEFAULT NULL,
  `move_id` int DEFAULT NULL,
  `theatre_id` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `staff_id` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  `picture` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_promotion_show1_idx` (`show_id`),
  KEY `fk_promotion_theatre1_idx` (`theatre_id`),
  KEY `fk_promotion_movie1_idx` (`move_id`),
  KEY `fk_promotion_customer1_idx` (`customer_id`),
  KEY `fk_promotion_staff1_idx` (`staff_id`),
  CONSTRAINT `fk_promotion_customer1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `fk_promotion_movie1` FOREIGN KEY (`move_id`) REFERENCES `movie` (`id`),
  CONSTRAINT `fk_promotion_show1` FOREIGN KEY (`show_id`) REFERENCES `show` (`id`),
  CONSTRAINT `fk_promotion_staff1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`id`),
  CONSTRAINT `fk_promotion_theatre1` FOREIGN KEY (`theatre_id`) REFERENCES `theatre` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotion`
--

LOCK TABLES `promotion` WRITE;
/*!40000 ALTER TABLE `promotion` DISABLE KEYS */;
INSERT INTO `promotion` VALUES (1,'50242-040','XOLAIR',7,'925-53-3869','2020-04-11','2020-04-19',30,21,4,43,44,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(2,'50523-546','Bebelle for Kids Antibacterial Hand',9,'563-81-1538','2020-06-11','2020-03-08',35,83,8,35,30,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(3,'52584-060','Amidate',8,'525-05-7853','2020-10-07','2019-12-27',98,46,3,11,6,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(4,'50436-6104','CAPTOPRIL',5,'494-07-1671','2020-08-01','2020-01-24',67,38,10,36,5,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(5,'65119-345','OXYGEN',6,'485-23-4048','2020-02-13','2019-12-01',77,38,15,16,12,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(6,'0172-3650','Glipizide',6,'308-43-7380','2019-11-01','2020-01-16',90,34,21,73,13,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(7,'49967-882','Kiehls Since 1851 Superbly',8,'805-99-0530','2020-07-20','2019-11-30',10,21,7,47,3,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(8,'58411-191','SHISEIDO THE MAKEUP FOUNDATION',6,'408-14-5478','2019-11-08','2020-06-09',19,88,3,34,20,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(9,'44237-008','Herbion Naturals',8,'155-87-9002','2019-12-03','2020-03-03',63,39,8,98,27,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(10,'31722-706','Famciclovir',7,'902-66-0225','2020-01-12','2020-08-02',85,99,6,94,46,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(11,'0268-1510','HOLCUS LANATUS POLLEN',8,'414-36-8199','2020-07-02','2019-12-18',69,30,18,28,43,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(12,'63629-2948','Diazepam',8,'702-04-4071','2020-02-23','2020-04-02',67,67,3,12,16,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(13,'35356-660','Tramadol hydrochloride and acetaminophen',9,'785-03-0178','2020-02-05','2019-11-29',12,49,14,85,45,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(14,'0378-0072','Clorpres',8,'596-04-5964','2020-02-21','2020-05-24',40,26,9,31,8,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(15,'43419-358','IOPE SS',6,'695-57-9696','2020-06-03','2020-03-26',5,1,23,71,32,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(16,'59883-821','Pro-Den Rx',9,'389-81-7690','2020-09-17','2020-10-12',97,84,25,2,50,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(17,'57520-1111','H Acne Formula',5,'157-58-0956','2020-04-12','2020-04-25',73,60,17,13,9,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(18,'36987-1084','Horse Epithelium',8,'111-17-5661','2020-03-30','2020-03-26',24,61,20,96,39,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(19,'0268-0870','CLADOSPORIUM SPHAEROSPERMUM',10,'218-73-4301','2020-05-30','2019-12-15',25,2,10,51,28,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg'),(20,'37808-686','Risk Force',9,'458-00-8386','2020-05-19','2020-07-21',13,64,3,34,34,NULL,'https://image.shutterstock.com/image-vector/vector-colorful-hanging-cardboard-tags-260nw-447932113.jpg');
/*!40000 ALTER TABLE `promotion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotion_customer`
--

DROP TABLE IF EXISTS `promotion_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotion_customer` (
  `id` int NOT NULL,
  `promotion_id` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `promotion_code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_promotion_customer_promotion1_idx` (`promotion_id`),
  KEY `fk_promotion_customer_customer1_idx` (`customer_id`),
  CONSTRAINT `fk_promotion_customer_customer1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `fk_promotion_customer_promotion1` FOREIGN KEY (`promotion_id`) REFERENCES `promotion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotion_customer`
--

LOCK TABLES `promotion_customer` WRITE;
/*!40000 ALTER TABLE `promotion_customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotion_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'customer'),(2,'staff'),(3,'manager'),(4,'admin'),(5,'super amdin');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_account`
--

DROP TABLE IF EXISTS `role_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role_account` (
  `id` int NOT NULL AUTO_INCREMENT,
  `role_id` int DEFAULT NULL,
  `account_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_role_account_role_idx` (`role_id`),
  KEY `fk_role_account_account1_idx` (`account_id`),
  CONSTRAINT `fk_role_account_account1` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `fk_role_account_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_account`
--

LOCK TABLES `role_account` WRITE;
/*!40000 ALTER TABLE `role_account` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seat`
--

DROP TABLE IF EXISTS `seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `theatre_id` int DEFAULT NULL,
  `hall_id` int DEFAULT NULL,
  `seat_type_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_seat_theatre1_idx` (`theatre_id`),
  KEY `fk_seat_hall1_idx` (`hall_id`),
  KEY `fk_seat_seat_type1_idx` (`seat_type_id`),
  CONSTRAINT `fk_seat_hall1` FOREIGN KEY (`hall_id`) REFERENCES `hall` (`id`),
  CONSTRAINT `fk_seat_seat_type1` FOREIGN KEY (`seat_type_id`) REFERENCES `seat_type` (`id`),
  CONSTRAINT `fk_seat_theatre1` FOREIGN KEY (`theatre_id`) REFERENCES `theatre` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=151 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat`
--

LOCK TABLES `seat` WRITE;
/*!40000 ALTER TABLE `seat` DISABLE KEYS */;
INSERT INTO `seat` VALUES (1,'A1',1,1,1),(2,'A2',1,1,1),(3,'A3',1,1,1),(4,'A4',1,1,1),(5,'A5',1,1,1),(6,'A6',1,1,1),(7,'A7',1,1,1),(8,'A8',1,1,1),(9,'A9',1,1,1),(10,'A10',1,1,1),(11,'B1',1,1,1),(12,'B2',1,1,1),(13,'B3',1,1,1),(14,'B4',1,1,1),(15,'B5',1,1,1),(16,'B6',1,1,1),(17,'B7',1,1,1),(18,'B8',1,1,1),(19,'B9',1,1,1),(20,'B10',1,1,1),(21,'C1',1,1,1),(22,'C2',1,1,1),(23,'C3',1,1,1),(24,'C4',1,1,2),(25,'C5',1,1,2),(26,'C6',1,1,2),(27,'C7',1,1,2),(28,'C8',1,1,1),(29,'C9',1,1,1),(30,'C10',1,1,1),(31,'A1',2,2,1),(32,'A2',2,2,1),(33,'A3',2,2,1),(34,'A4',2,2,1),(35,'A5',2,2,1),(36,'A6',2,2,1),(37,'A7',2,2,1),(38,'A8',2,2,1),(39,'A9',2,2,1),(40,'A10',2,2,1),(41,'B1',2,2,1),(42,'B2',2,2,1),(43,'B3',2,2,1),(44,'B4',2,2,1),(45,'B5',2,2,3),(46,'B6',2,2,3),(47,'B7',2,2,1),(48,'B8',2,2,1),(49,'B9',2,2,1),(50,'B10',2,2,1),(51,'C1',2,2,1),(52,'C2',2,2,1),(53,'C3',2,2,1),(54,'C4',2,2,1),(55,'C5',2,2,3),(56,'C6',2,2,3),(57,'C7',2,2,1),(58,'C8',2,2,1),(59,'C9',2,2,3),(60,'C10',2,2,3),(61,'A1',3,3,1),(62,'A2',3,3,1),(63,'A3',3,3,1),(64,'A4',3,3,1),(65,'A5',3,3,1),(66,'A6',3,3,1),(67,'A7',3,3,1),(68,'A8',3,3,1),(69,'A9',3,3,1),(70,'A10',3,3,1),(71,'B1',3,3,1),(72,'B2',3,3,1),(73,'B3',3,3,1),(74,'B4',3,3,1),(75,'B5',3,3,1),(76,'B6',3,3,1),(77,'B7',3,3,1),(78,'B8',3,3,1),(79,'B9',3,3,1),(80,'B10',3,3,1),(81,'C1',3,3,1),(82,'C2',3,3,1),(83,'C3',3,3,1),(84,'C4',3,3,1),(85,'C5',3,3,1),(86,'C6',3,3,1),(87,'C7',3,3,1),(88,'C8',3,3,1),(89,'C9',3,3,1),(90,'C10',3,3,1),(91,'D1',3,3,2),(92,'D2',3,3,2),(93,'D3',3,3,2),(94,'D4',3,3,2),(95,'D5',3,3,2),(96,'D6',3,3,2),(97,'D7',3,3,2),(98,'D8',3,3,2),(99,'D9',3,3,2),(100,'D10',3,3,2),(101,'A1',4,4,1),(102,'A2',4,4,1),(103,'A3',4,4,1),(104,'A4',4,4,1),(105,'A5',4,4,1),(106,'A6',4,4,1),(107,'A7',4,4,1),(108,'A8',4,4,1),(109,'A9',4,4,1),(110,'A10',4,4,1),(111,'B1',4,4,1),(112,'B2',4,4,1),(113,'B3',4,4,1),(114,'B4',4,4,1),(115,'B5',4,4,1),(116,'B6',4,4,1),(117,'B7',4,4,1),(118,'B8',4,4,1),(119,'B9',4,4,1),(120,'B10',4,4,1),(121,'C1',4,4,1),(122,'C2',4,4,1),(123,'C3',4,4,1),(124,'C4',4,4,1),(125,'C5',4,4,2),(126,'C6',4,4,2),(127,'C7',4,4,2),(128,'C8',4,4,1),(129,'C9',4,4,1),(130,'C10',4,4,1),(131,'D1',4,4,1),(132,'D2',4,4,1),(133,'D3',4,4,1),(134,'D4',4,4,1),(135,'D5',4,4,2),(136,'D6',4,4,2),(137,'D7',4,4,2),(138,'D8',4,4,1),(139,'D9',4,4,1),(140,'D10',4,4,1),(141,'E1',4,4,3),(142,'E2',4,4,1),(143,'E3',4,4,1),(144,'E4',4,4,1),(145,'E5',4,4,2),(146,'E6',4,4,2),(147,'E7',4,4,2),(148,'E8',4,4,1),(149,'E9',4,4,1),(150,'E10',4,4,3);
/*!40000 ALTER TABLE `seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seat_type`
--

DROP TABLE IF EXISTS `seat_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seat_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `promo_point_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_seat_type_promo_point1_idx` (`promo_point_id`),
  CONSTRAINT `fk_seat_type_promo_point1` FOREIGN KEY (`promo_point_id`) REFERENCES `promo_point` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat_type`
--

LOCK TABLES `seat_type` WRITE;
/*!40000 ALTER TABLE `seat_type` DISABLE KEYS */;
INSERT INTO `seat_type` VALUES (1,'Standard seat',1),(2,'Vip seat',2),(3,'SweatBox',3);
/*!40000 ALTER TABLE `seat_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `show`
--

DROP TABLE IF EXISTS `show`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `show` (
  `id` int NOT NULL DEFAULT '0',
  `start_time` timestamp NULL DEFAULT NULL,
  `hall_id` int DEFAULT NULL,
  `movie_id` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `isearly` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_show_hall1_idx` (`hall_id`),
  KEY `fk_show_movie1_idx` (`movie_id`),
  CONSTRAINT `fk_show_hall1` FOREIGN KEY (`hall_id`) REFERENCES `hall` (`id`),
  CONSTRAINT `fk_show_movie1` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `show`
--

LOCK TABLES `show` WRITE;
/*!40000 ALTER TABLE `show` DISABLE KEYS */;
INSERT INTO `show` VALUES (1,'2020-11-19 17:00:00',8,30,25.4,'vitae nisi nam ultrices libero non',0),(2,'2020-11-06 17:00:00',12,58,43,'ipsum dolor sit amet consectetuer adipiscing',0),(3,'2020-10-22 17:00:00',6,14,37,'pellentesque quisque porta volutpat erat',0),(4,'2020-11-11 17:00:00',1,77,33.2,'nunc purus phasellus in felis donec semper',0),(5,'2020-11-09 17:00:00',4,79,23.6,'at turpis donec posuere metus vitae ipsum',1),(6,'2020-11-14 17:00:00',2,85,44.1,'purus phasellus in felis donec semper sapien',1),(7,'2020-11-09 17:00:00',7,51,37.7,'in hac habitasse platea dictumst etiam',1),(8,'2020-11-07 17:00:00',15,49,29.6,'morbi non lectus aliquam sit amet',0),(9,'2020-11-03 17:00:00',15,29,22,'mauris vulputate elementum nullam varius nulla',1),(10,'2020-11-13 17:00:00',6,66,25.7,'adipiscing lorem vitae mattis nibh',1),(11,'2020-10-23 17:00:00',3,22,45.7,'sit amet lobortis sapien sapien',0),(12,'2020-10-27 17:00:00',2,91,27.1,'justo in blandit ultrices enim',1),(13,'2020-10-24 17:00:00',13,80,23.5,'lorem quisque ut erat curabitur gravida nisi',0),(14,'2020-10-28 17:00:00',11,46,27.4,'pulvinar sed nisl nunc rhoncus dui',1),(15,'2020-11-01 17:00:00',9,7,41.9,'in hac habitasse platea dictumst maecenas ut',0),(16,'2020-11-03 17:00:00',12,65,34.4,'ipsum dolor sit amet consectetuer adipiscing elit',1),(17,'2020-11-02 17:00:00',10,84,40.9,'condimentum curabitur in libero ut massa',0),(18,'2020-11-02 17:00:00',4,20,29.2,'orci luctus et ultrices posuere',0),(19,'2020-11-05 17:00:00',4,55,22.1,'nec molestie sed justo pellentesque viverra',1),(20,'2020-10-20 17:00:00',6,50,37.8,'elementum eu interdum eu tincidunt in leo',1),(21,'2020-11-11 17:00:00',3,61,49.4,'sapien iaculis congue vivamus metus arcu adipiscing',1),(22,'2020-10-24 17:00:00',7,78,38.1,'semper interdum mauris ullamcorper purus sit',0),(23,'2020-11-05 17:00:00',5,36,33.8,'accumsan felis ut at dolor quis odio',0),(24,'2020-11-11 17:00:00',15,28,28.1,'amet cursus id turpis integer',0),(25,'2020-10-21 17:00:00',3,30,48.4,'vestibulum velit id pretium iaculis diam erat',0),(26,'2020-11-13 17:00:00',7,48,23.7,'porttitor lorem id ligula suspendisse',0),(27,'2020-11-03 17:00:00',6,84,36.9,'adipiscing lorem vitae mattis nibh',0),(28,'2020-11-08 17:00:00',15,80,49.7,'amet lobortis sapien sapien non mi integer',1),(29,'2020-10-29 17:00:00',1,21,40.2,'vulputate nonummy maecenas tincidunt lacus at',0),(30,'2020-10-23 17:00:00',1,3,31.1,'nunc donec quis orci eget orci',0),(31,'2020-10-27 17:00:00',11,34,43.9,'amet diam in magna bibendum',1),(32,'2020-10-22 17:00:00',1,2,40.3,'vel nisl duis ac nibh fusce lacus',0),(33,'2020-11-13 17:00:00',7,80,29.2,'aliquam sit amet diam in magna bibendum',1),(34,'2020-11-10 17:00:00',12,17,36.1,'quam pharetra magna ac consequat',1),(35,'2020-10-26 17:00:00',9,96,43.2,'nulla pede ullamcorper augue a',1),(36,'2020-11-11 17:00:00',2,94,44.4,'nulla ultrices aliquet maecenas leo odio condimentum',0),(37,'2020-10-26 17:00:00',14,22,35.5,'potenti nullam porttitor lacus at turpis',1),(38,'2020-10-24 17:00:00',5,1,47.2,'platea dictumst maecenas ut massa',1),(39,'2020-11-01 17:00:00',5,100,35,'dictumst aliquam augue quam sollicitudin',1),(40,'2020-11-14 17:00:00',12,17,28.7,'quam a odio in hac habitasse platea',1),(41,'2020-10-28 17:00:00',8,52,24,'bibendum felis sed interdum venenatis',1),(42,'2020-10-25 17:00:00',2,18,41.2,'etiam vel augue vestibulum rutrum',0),(43,'2020-10-31 17:00:00',4,63,33.2,'in magna bibendum imperdiet nullam',0),(44,'2020-11-13 17:00:00',14,4,49,'lacus curabitur at ipsum ac tellus semper',0),(45,'2020-11-07 17:00:00',7,16,44.8,'turpis integer aliquet massa id lobortis',1),(46,'2020-10-31 17:00:00',15,70,40.1,'elit proin risus praesent lectus',0),(47,'2020-11-03 17:00:00',5,64,46.3,'curae donec pharetra magna vestibulum aliquet',0),(48,'2020-10-27 17:00:00',12,90,30.6,'hac habitasse platea dictumst etiam faucibus',1),(49,'2020-10-29 17:00:00',10,25,49.2,'elementum nullam varius nulla facilisi',1),(50,'2020-11-17 17:00:00',2,84,48.2,'ut erat curabitur gravida nisi at nibh',0),(51,'2020-11-11 17:00:00',7,59,27.1,'pede lobortis ligula sit amet eleifend pede',1),(52,'2020-11-17 17:00:00',1,58,38,'sapien in sapien iaculis congue',0),(53,'2020-11-01 17:00:00',2,94,34.4,'in felis eu sapien cursus vestibulum proin',1),(54,'2020-10-23 17:00:00',13,93,35.5,'ultrices posuere cubilia curae mauris viverra diam',1),(55,'2020-11-14 17:00:00',12,70,42.7,'lectus pellentesque at nulla suspendisse',0),(56,'2020-11-11 17:00:00',11,53,37.3,'turpis enim blandit mi in porttitor pede',1),(57,'2020-10-31 17:00:00',3,86,44.3,'in ante vestibulum ante ipsum',0),(58,'2020-11-07 17:00:00',15,1,33.5,'massa donec dapibus duis at velit eu',0),(59,'2020-11-08 17:00:00',11,5,30.2,'ipsum aliquam non mauris morbi',1),(60,'2020-10-21 17:00:00',10,89,24,'molestie hendrerit at vulputate vitae nisl aenean',0),(61,'2020-10-29 17:00:00',6,56,40.3,'eu nibh quisque id justo sit',1),(62,'2020-11-02 17:00:00',4,20,20.9,'aenean fermentum donec ut mauris eget massa',0),(63,'2020-11-13 17:00:00',8,14,39.1,'non mi integer ac neque duis',0),(64,'2020-10-21 17:00:00',8,63,38.7,'nisi eu orci mauris lacinia',0),(65,'2020-10-27 17:00:00',6,30,26,'velit eu est congue elementum in',1),(66,'2020-10-31 17:00:00',13,67,30.5,'turpis nec euismod scelerisque quam turpis adipiscing',1),(67,'2020-11-04 17:00:00',6,70,24.3,'quis libero nullam sit amet',1),(68,'2020-11-19 17:00:00',15,31,22.5,'nibh in lectus pellentesque at nulla suspendisse',0),(69,'2020-10-24 17:00:00',14,40,30.8,'nec condimentum neque sapien placerat ante nulla',0),(70,'2020-11-07 17:00:00',3,18,21.6,'sed augue aliquam erat volutpat in',1),(71,'2020-11-07 17:00:00',7,36,39.3,'nibh in hac habitasse platea',1),(72,'2020-10-21 17:00:00',3,92,42.2,'in consequat ut nulla sed accumsan',1),(73,'2020-11-14 17:00:00',9,34,36.6,'ullamcorper purus sit amet nulla',1),(74,'2020-11-17 17:00:00',9,33,25.4,'nunc viverra dapibus nulla suscipit ligula',1),(75,'2020-10-27 17:00:00',12,95,39.9,'adipiscing elit proin interdum mauris',0),(76,'2020-10-20 17:00:00',15,75,34.2,'lectus pellentesque eget nunc donec quis',0),(77,'2020-11-04 17:00:00',6,28,38.9,'dignissim vestibulum vestibulum ante ipsum primis in',0),(78,'2020-11-15 17:00:00',11,4,42.5,'augue luctus tincidunt nulla mollis',0),(79,'2020-11-08 17:00:00',14,32,46.7,'tortor risus dapibus augue vel accumsan tellus',0),(80,'2020-10-21 17:00:00',6,51,46.3,'pulvinar nulla pede ullamcorper augue',1),(81,'2020-10-23 17:00:00',3,59,48.4,'rutrum neque aenean auctor gravida sem praesent',1),(82,'2020-11-15 17:00:00',4,41,48.4,'sed vel enim sit amet nunc',1),(83,'2020-11-19 17:00:00',8,93,34.9,'libero rutrum ac lobortis vel',0),(84,'2020-10-30 17:00:00',5,31,38.7,'fusce lacus purus aliquet at',0),(85,'2020-11-08 17:00:00',4,94,40.9,'vestibulum sagittis sapien cum sociis natoque penatibus',0),(86,'2020-11-08 17:00:00',12,17,46,'aliquet massa id lobortis convallis',1),(87,'2020-11-17 17:00:00',13,67,48.7,'quis tortor id nulla ultrices aliquet',1),(88,'2020-11-02 17:00:00',7,10,35.9,'justo lacinia eget tincidunt eget',1),(89,'2020-11-13 17:00:00',14,7,39.8,'donec diam neque vestibulum eget vulputate',0),(90,'2020-11-12 17:00:00',4,63,38.6,'risus dapibus augue vel accumsan tellus nisi',1),(91,'2020-11-01 17:00:00',3,85,45.4,'nulla elit ac nulla sed',0),(92,'2020-11-18 17:00:00',4,16,32.2,'quam sollicitudin vitae consectetuer eget rutrum at',1),(93,'2020-10-21 17:00:00',8,99,42.3,'cursus id turpis integer aliquet',1),(94,'2020-10-28 17:00:00',7,18,41.8,'vestibulum ante ipsum primis in faucibus',0),(95,'2020-11-18 17:00:00',8,78,25.3,'curabitur in libero ut massa volutpat',1),(96,'2020-11-05 17:00:00',9,97,35.6,'aenean sit amet justo morbi',0),(97,'2020-10-27 17:00:00',8,70,42.7,'dolor sit amet consectetuer adipiscing elit proin',1),(98,'2020-10-25 17:00:00',4,53,31.2,'vitae quam suspendisse potenti nullam porttitor',1),(99,'2020-11-19 17:00:00',7,16,38.2,'in felis donec semper sapien a',0),(100,'2020-11-08 17:00:00',3,54,31,'massa id lobortis convallis tortor risus',1);
/*!40000 ALTER TABLE `show` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `account_id` int DEFAULT NULL,
  `theatre_id` int DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `cardid` varchar(45) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `position_id` int DEFAULT NULL,
  `isactive` tinyint DEFAULT '1',
  `code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_employee_account1_idx` (`account_id`),
  KEY `fk_staff_theatre1_idx` (`theatre_id`),
  KEY `fk_staff_position1_idx` (`position_id`),
  CONSTRAINT `fk_employee_account1` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `fk_staff_position1` FOREIGN KEY (`position_id`) REFERENCES `position` (`id`),
  CONSTRAINT `fk_staff_theatre1` FOREIGN KEY (`theatre_id`) REFERENCES `theatre` (`id`),
  CONSTRAINT `fk_staff_theatre2` FOREIGN KEY (`theatre_id`) REFERENCES `theatre` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (1,'Harlene','6 Warbler Place',55,9,'hgodbolt0@xrea.com','9431778479','3545532232867588','1973-04-02 17:33:39',14141206,3,1,NULL),(2,'Brenna','5400 Ridgeway Park',65,7,'baguirre1@uol.com.br','5934628134','3588216578547420','1975-08-21 07:23:20',10156282,3,0,NULL),(3,'Jervis','0286 Messerschmidt Lane',66,18,'jmccarney2@smugmug.com','2454189497','503895995526241361','1998-05-19 03:29:19',10268633,4,1,NULL),(4,'Lorne','173 Paget Parkway',2,1,'lhalfacre3@disqus.com','4829684023','3587000717968528','1991-01-08 02:59:06',14638182,3,1,NULL),(5,'Christa','08 Clemons Avenue',70,18,'cmarsy4@sogou.com','8386071124','676186050042623577','1960-06-21 04:49:52',14096527,1,1,NULL),(6,'Nick','4979 Gateway Circle',17,3,'nlocarno5@pen.io','4597516733','3548283088624999','1978-04-10 21:47:38',14563704,2,0,NULL),(7,'Priscilla','1 Emmet Avenue',37,5,'pjoddens6@deliciousdays.com','3447671983','6771073594009240767','1965-08-01 11:30:42',13501996,2,0,NULL),(8,'Tanitansy','392 Kinsman Drive',70,5,'tgillingham7@chron.com','3382636132','201475758967294','1960-05-05 22:26:56',11942990,1,0,NULL),(9,'Venita','6 Hagan Street',55,21,'vpavlov8@gizmodo.com','6594110930','3558777290191645','1989-10-18 00:39:35',10924305,3,0,NULL),(10,'Kanya','88631 Knutson Trail',8,24,'kkienle9@myspace.com','9748246883','3549825481531483','1968-05-07 21:11:24',11006579,3,1,NULL),(11,'Sephira','95 Grasskamp Park',84,9,'skleinstuba@ow.ly','8066891437','3538273270129313','1998-05-04 18:11:49',12435832,2,1,NULL),(12,'Bobbie','77 Grasskamp Pass',52,2,'bcroneb@mail.ru','5034760343','67717512460529479','1981-02-05 13:37:01',13316921,3,1,NULL),(13,'Rees','61 Mayer Plaza',80,22,'rfernanc@bluehost.com','9321029664','3565922170465435','1960-10-25 08:52:16',11852040,3,1,NULL),(14,'Loleta','87 Blaine Parkway',22,24,'lgilletd@newsvine.com','8293677201','5526295577615024','1964-01-05 15:11:16',12913133,3,1,NULL),(15,'Neils','7133 Shoshone Court',71,13,'nballentimee@miitbeian.gov.cn','9842201795','3544872859955386','1959-05-28 00:23:01',10272692,1,0,NULL),(16,'Mikey','39780 Commercial Lane',20,17,'mwiltsherf@360.cn','4156663350','378747956897219','1954-11-24 09:04:20',10914982,2,1,NULL),(17,'Vail','9916 Sachs Alley',11,17,'vscrivinerg@devhub.com','1781039872','5602238126195624','1953-03-27 19:05:40',10320525,4,0,NULL),(18,'Nyssa','24 Mccormick Point',93,13,'ncolchetth@360.cn','9972644746','63048751483010344','1992-02-15 01:07:54',10022544,4,1,NULL),(19,'Caryn','57 Superior Way',54,16,'ccaselicki@comsenz.com','1334261275','5602252966643304','1959-10-31 08:28:41',12602295,1,0,NULL),(20,'Kata','04 Kedzie Crossing',93,23,'ktaphousej@geocities.jp','9564351702','560225725726556636','1963-06-01 13:22:46',12744201,2,1,NULL),(21,'Klarika','8 Transport Circle',8,22,'kweatherellk@nifty.com','1026635438','5433597115130594','1953-08-03 12:06:29',13699690,1,1,NULL),(22,'Kain','967 Corben Hill',5,17,'kderobertisl@foxnews.com','9735736903','3588300065889139','1970-07-07 17:43:47',13050522,3,1,NULL),(23,'Wit','788 Bluestem Drive',88,1,'wmcgannm@tumblr.com','9433062409','5602228606453268763','1982-05-08 10:26:39',10220926,1,0,NULL),(24,'Davey','5 Fieldstone Center',88,16,'dcreedlandn@amazon.com','9696711384','5018789780140148','1961-02-24 16:42:20',14913788,1,1,NULL),(25,'Zitella','5765 Reindahl Park',40,18,'zgibbino@samsung.com','2212151785','4041372303750','1957-05-19 17:01:31',11944927,1,0,NULL),(26,'Algernon','2 Wayridge Parkway',94,12,'apackp@wired.com','6356616693','3542872170014949','1956-05-16 21:39:15',13309000,2,1,NULL),(27,'Candace','01868 Blaine Alley',5,13,'cflattmanq@infoseek.co.jp','1633900731','3532762330494044','1992-09-20 17:50:43',12174890,3,1,NULL),(28,'Marijn','12944 Trailsway Lane',43,3,'mchimentir@illinois.edu','1654261030','3539792337768259','1968-01-24 05:06:36',14813983,4,1,NULL),(29,'Joellyn','6 Riverside Way',48,8,'jspradberys@macromedia.com','7976599552','3564275674476072','1993-08-01 11:32:56',12678193,3,0,NULL),(30,'Caresse','30 Moose Trail',91,24,'cstrephant@friendfeed.com','1271208995','3558575733032438','1960-12-26 20:10:09',14524944,3,0,NULL),(31,'Kerrill','8 Everett Terrace',68,5,'klindeu@stumbleupon.com','5159709536','3573363881772266','1997-06-10 14:35:30',12437344,2,1,NULL),(32,'Peirce','885 Melvin Circle',100,4,'pdeclerkv@google.ru','6379137978','337941738892156','1974-07-16 16:55:00',12069723,1,0,NULL),(33,'Cristobal','2 Burning Wood Junction',33,4,'cfraniakw@aol.com','8546184611','4913983546606281','1994-02-21 23:32:16',14408771,4,1,NULL),(34,'Westbrooke','9313 Declaration Trail',46,11,'wronnayx@imageshack.us','4399659606','3566699511823584','1993-04-23 11:15:07',11614988,1,1,NULL),(35,'Nappy','92468 Carpenter Road',82,9,'ncorradoy@mayoclinic.com','3836533994','3549440791796352','1985-07-20 04:15:39',12570860,1,0,NULL),(36,'Amelina','6 Dunning Avenue',6,7,'ahalsez@4shared.com','7264668982','4911476769607744751','1952-08-19 05:26:52',11447070,2,1,NULL),(37,'Arabelle','50 Northland Hill',77,5,'alevi10@seattletimes.com','6098832324','67620287607138585','1974-06-14 23:17:30',14100229,1,1,NULL),(38,'Faythe','79 Spaight Trail',86,2,'fbixley11@nsw.gov.au','2805421826','3558924419756748','1986-09-23 12:07:26',12083875,3,0,NULL),(39,'Alasteir','877 Declaration Court',77,21,'acubuzzi12@goodreads.com','8199971545','3564127776438858','1996-07-14 01:52:04',10302679,2,1,NULL),(40,'Camellia','493 Mallory Trail',3,23,'clarimer13@google.co.jp','8412103352','3578811632396632','1988-02-11 02:36:06',10432491,1,1,NULL),(41,'Danyette','0178 Muir Center',53,1,'dniles14@bandcamp.com','5135675283','4903305144486662','1975-08-18 02:58:11',13727195,2,0,NULL),(42,'Brennen','8971 Dixon Hill',100,11,'bisacsson15@weibo.com','5468951463','4917008454036325','1964-10-18 04:19:56',10936345,1,1,NULL),(43,'Putnam','8 Iowa Avenue',21,23,'prichter16@wordpress.org','3946364540','677141881217673894','1984-06-12 14:23:46',13343745,2,1,NULL),(44,'Larisa','0 Starling Park',65,17,'lkoschek17@dailymotion.com','7993782249','374622323172337','1977-11-18 08:53:09',14960420,4,1,NULL),(45,'Kalinda','34 Amoth Junction',50,12,'kgoodey18@elpais.com','3043366578','201929380722048','1984-09-17 10:02:29',13517166,4,1,NULL),(46,'Court','447 Hooker Drive',40,11,'cnickell19@posterous.com','3313628556','3536506127110263','1969-04-26 16:30:17',13522378,4,0,NULL),(47,'Ingemar','4022 Anderson Hill',72,25,'ilyman1a@linkedin.com','8743019004','5602256350558366','1952-11-02 21:05:23',12059485,1,0,NULL),(48,'Brina','7350 Bonner Pass',23,3,'bkubicka1b@imgur.com','1558882196','6397367939329489','1997-12-11 07:16:16',10883063,3,0,NULL),(49,'Kissee','475 Susan Way',87,3,'khackleton1c@xinhuanet.com','2436781135','3588264473659635','1984-12-26 19:52:26',11521051,2,1,NULL),(50,'Vanda','90 Menomonie Junction',97,17,'vmarcu1d@yahoo.com','7895408960','5641825313014648154','1955-10-04 08:10:40',11283140,1,1,NULL);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `theatre`
--

DROP TABLE IF EXISTS `theatre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `theatre` (
  `id` int NOT NULL AUTO_INCREMENT,
  `location_id` int DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `admin_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_theatre_location1_idx` (`location_id`),
  CONSTRAINT `fk_theatre_location1` FOREIGN KEY (`location_id`) REFERENCES `location` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theatre`
--

LOCK TABLES `theatre` WRITE;
/*!40000 ALTER TABLE `theatre` DISABLE KEYS */;
INSERT INTO `theatre` VALUES (1,4,'Accord',19),(2,3,'Range Rover',22),(3,3,'Frontier',6),(4,5,'Mazda6',12),(5,1,'Golf',19),(6,2,'900',11),(7,5,'Corvette',10),(8,3,'Silverado',19),(9,4,'S4',14),(10,4,'Trooper',13),(11,4,'CLK-Class',18),(12,4,'Ram Wagon B250',4),(13,4,'Grand Prix',24),(14,2,'H3T',16),(15,1,'TT',18),(16,5,'MKS',11),(17,2,'4Runner',22),(18,3,'Suburban 2500',21),(19,2,'2500 Club Coupe',16),(20,4,'Aerostar',13),(21,4,'Justy',20),(22,3,'57',3),(23,5,'Rendezvous',2),(24,3,'S60',4),(25,3,'Sportvan G20',13);
/*!40000 ALTER TABLE `theatre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_type`
--

DROP TABLE IF EXISTS `ticket_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `price_percent` double DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_type`
--

LOCK TABLES `ticket_type` WRITE;
/*!40000 ALTER TABLE `ticket_type` DISABLE KEYS */;
INSERT INTO `ticket_type` VALUES (1,'Standard',98.7,'in felis donec semper sapien a libero'),(2,'Staff',98.7,'in felis donec semper sapien a libero'),(3,'VIP',98.7,'in felis donec semper sapien a libero'),(4,'Show Biz',98.7,'in felis donec semper sapien a libero'),(5,'2D',26.8,'erat eros viverra eget congue'),(6,'3D',98.7,'in felis donec semper sapien a libero');
/*!40000 ALTER TABLE `ticket_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-22 21:58:03
