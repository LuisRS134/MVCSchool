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

-- creació taula group.
CREATE TABLE `groups` (
id int(4) NOT NULL auto_increment,
code varchar(20) UNIQUE,
grade varchar(100),
level int(1),
PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- creació taula student.
CREATE TABLE `student` (
id int(4) NOT NULL auto_increment,
name varchar(20) default NULL,
age int(1) default NULL,
group_id int(4) default null,
PRIMARY KEY (`id`)
) ENGINE=InnoDB;

Alter Table `student` add foreign key(`group_id`) references `groups`(`id`);

INSERT INTO student
(`id`,`name`,`age`,`group_id`)VALUES
(1,'Luis',24,2),
(2,'Jorge',24,4),
(3,'Jona',18,3),
(4,'Lain',23,6),
(5,'Marc',17,8),
(6,'Toni',20,2),
(7,'Emilio',24,1),
(8,'Miguel',20,7),
(9,'Dani',20,4),
(10,'Ponce',20,6),
(11,'Kevin',20,2),
(12,'Jordi',20,1),
(13,'Xavi',20,7),
(14,'Sergi',21,7),
(15,'Carlos',20,1),
(16,'Alejandro',23,2);


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



