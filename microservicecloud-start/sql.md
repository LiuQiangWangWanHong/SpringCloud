CREATE DATABASE  cloudDB01;
USE cloudDB01;
CREATE TABLE dept (
  deptno        INT(20)     NOT NULL AUTO_INCREMENT
  COMMENT '编号',
  dname VARCHAR(60) NOT NULL
  COMMENT '部门名称',
  db_source   VARCHAR(1024) COMMENT '数据库名称',
  PRIMARY KEY (deptno)
);