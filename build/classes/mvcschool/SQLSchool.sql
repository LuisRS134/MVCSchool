/**
 * Author:  Luis
 * Created: 14-feb-2018
 */
-- Crear usuari per a accés local.
CREATE USER 'academia'@'localhost' IDENTIFIED BY 'academiapsw';
-- Crear base de dades.
CREATE DATABASE dbacademia
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;
-- Assignar permisos a l'usuari local sobre la base de dades.
GRANT SELECT, INSERT, UPDATE, DELETE ON dbacademia.* TO 'academia'@'localhost';

USE dbacademia;

-- creació taula student.
CREATE TABLE `student` (
id int(4) NOT NULL auto_increment,
name varchar(20) default NULL,
age int(1) default NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- creació taula group.
CREATE TABLE `groups` (
id int(4) NOT NULL auto_increment,
code varchar(20) UNIQUE,
grade varchar(100),
level int(1),
PRIMARY KEY (`id`)
) ENGINE=InnoDB;

INSERT INTO student
(`id`,`name`,`age`)VALUES
(1,'Luis',24),
(2,'Jorge',24),
(3,'Jona',18),
(4,'Lain',23),
(5,'Marc',17),
(6,'Toni',20),
(7,'Emilio',24),
(8,'Miguel',20),
(9,'Dani',20),
(10,'Ponce',20),
(11,'Kevin',20),
(12,'Jordi',20),
(13,'Xavi',20),
(14,'Sergi',21),
(15,'Carlos',20),
(16,'Alejandro',23);


INSERT INTO groups
(`id`,`code`,`grade`,`level`)VALUES
(1,'DAM-1','Desenvolupament aplicacions multiplataforma',1),
(2,'DAM-2','Desenvolupament aplicacions multiplataforma',2),
(3,'ASIX-1','Administració de sistemes informàtics en xarxa',1),
(4,'ASIX-2','Administració de sistemes informàtics en xarxa',2),
(5,'DAW-1','Desenvolupament aplicacions web',1),
(6,'DAW-2','Desenvolupament aplicacions web',2),
(7,'DAWBIO-1','Desenvolupament aplicacions Bioinformàtica)',1),
(8,'DAWBIO-2','Desenvolupament aplicacions Bioinformàtica)',2);



