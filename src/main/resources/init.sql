create database mechat character set utf8mb4;
use mechat;

create table mechat_user
(
    id           int(11) primary key auto_increment,
    user_id      varchar(64)  not null,
    username     varchar(32)  not null,
    password     varchar(64)  not null,
    face_img     varchar(256) not null,
    face_img_big varchar(256) not null,
    nickname     varchar(32)  not null,
    cid          varchar(64),
    qr_code      varchar(128)
) comment '用户表';

create table friends_request
(
    id                 int(11) primary key auto_increment,
    friends_request_id varchar(64) not null,
    send_user_id       varchar(64) not null,
    accept_user_id     varchar(64) not null,
    request_date_time  datetime    not null default current_timestamp
) comment '好友请求表';

create table chat_msg
(
    id             int(11) primary key auto_increment,
    chat_id        varchar(64) not null,
    send_user_id   varchar(64) not null,
    accept_user_id varchar(64) not null,
    msg            text        not null,
    sign_flag      tinyint     not null,
    create_time    datetime    not null default current_timestamp
) comment '聊天信息表';

create table friends
(
    id           int(11) primary key auto_increment,
    friend_id    varchar(64) not null,
    my_user_id   varchar(64) not null,
    my_friend_id varchar(64) not null
) comment '好友表';