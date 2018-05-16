-- noinspection SqlNoDataSourceInspectionForFile
DROP TABLE IF EXISTS User;
CREATE TABLE User (
  user_id identity not null auto_increment,
  name char(30) not null,
  primary key (user_id)
);
