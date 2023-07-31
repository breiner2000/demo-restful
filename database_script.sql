create database spring_demo;
create user 'dev'@'%' identified by 'dev';
grant all on spring_demo.* to 'dev'@'%';