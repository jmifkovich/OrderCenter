drop table if exists MESSAGE;

create table MESSAGE(
    id BIGINT auto_increment primary key,
    MESSAGE VARCHAR2 NULL_TO_DEFAULT,
    PRIORITY INT DEFAULT 10,
    BYTES BIGINT NULL_TO_DEFAULT,
);

/*
drop table if exists DOCUMENT_META_DATA;
create table DOCUMENT_META_DATA
(
    id       int auto_increment primary key,
    bytes    long,
    filetype varchar2,
    filename varchar2
);*/
