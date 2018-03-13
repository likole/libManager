# 数据库初始化脚本

# 创建数据库
CREATE DATABASE libManager;

#创建数据表
/*字段名的引号是TAB上面这个键*/
CREATE TABLE userInfo(
  `user_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_username` VARCHAR(32) NOT NULL COMMENT '用户名',
  `user_password` VARCHAR(16) NOT NULL COMMENT '用户密码',
  `user_name` VARCHAR(16) NOT NULL COMMENT '用户姓名',
  `user_power` BIT NOT NULL COMMENT '权限,1表示管理员,0表示普通用户',
  PRIMARY KEY (user_id),
  KEY idx_username(user_username),
  KEY idx_user_power(user_power)
)ENGINE =InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET =utf8 COMMENT ='图书管理系统用户信息表';

CREATE TABLE book(
  `book_id` INT NOT NULL AUTO_INCREMENT COMMENT '图书在表中的id',
  `book_isbn` VARCHAR(13) NOT NULL COMMENT '图书编码',
  `book_number` INT NOT NULL COMMENT '图书库存',
  `book_borrow` BIT NOT NULL COMMENT '借出数量',
  `book_image` VARCHAR(128) COMMENT '图片URL',
  `book_title` VARCHAR(64) COMMENT '图书名称',
  `book_intro` VARCHAR(256) COMMENT '图书简介',
  `book_author` VARCHAR(128) COMMENT '作者信息',
  `book_authorintro` VARCHAR(256)COMMENT '作者简介',
  PRIMARY KEY (book_id),
  KEY idx_book_isbn(book_isbn)
)ENGINE =InnoDB AUTO_INCREMENT =1000 DEFAULT CHARSET =utf8 COMMENT ='图书信息表';


CREATE TABLE borrowInfo(
  `borrow_id` INT NOT NULL AUTO_INCREMENT COMMENT '借阅id',
  `borrow_user_id` INT NOT NULL COMMENT '借阅者id',
  `borrow_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '借阅时间',
  `borrow_return_time` TIMESTAMP COMMENT '归还时间',
  `borrow_state` BIT COMMENT '是否归还：1已归还，0未归还',
  PRIMARY KEY (borrow_id)
)ENGINE =InnoDB AUTO_INCREMENT =1000 DEFAULT CHARSET = utf8 COMMENT ='借阅信息表';


INSERT INTO
  userInfo(user_username,user_password,user_name,user_power)
VALUES
  ('spj1','123123','spj',1),
  ('spj2','123123','spj',1),
  ('spj3','123123','spj',1),
  ('spj4','123123','spj',1);