CREATE DATABASE cloudDB03; 

USE cloudDB03;

CREATE TABLE `dept` (
  `deptno` INT(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `dname` VARCHAR(60) NOT NULL COMMENT '部门名称',
  `db_source` VARCHAR(1024) DEFAULT NULL COMMENT '数据库名称',
  PRIMARY KEY (`deptno`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO dept(dname,db_source) VALUES('开发部',DATABASE());
INSERT INTO dept(dname,db_source) VALUES('人事部',DATABASE());
INSERT INTO dept(dname,db_source) VALUES('财务部',DATABASE());
INSERT INTO dept(dname,db_source) VALUES('运维部',DATABASE());

