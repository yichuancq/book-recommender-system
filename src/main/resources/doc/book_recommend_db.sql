use mysql;
#book_recommend
# 如果存在 删除数据库
drop  database if exists  book_recommend;
# 创建数据库 默认utf-8
CREATE DATABASE IF NOT EXISTS book_recommend DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
