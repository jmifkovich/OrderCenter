drop table if exists DOCUMENTS;

create table DOCUMENT(
    id BIGINT auto_increment primary key,
    FILE_PATH VARCHAR2 NULL_TO_DEFAULT ,
    BYTES BIGINT NULL_TO_DEFAULT,
    FILE_NAME VARCHAR2 NULL_TO_DEFAULT,
    FILE_TYPE INT NULL_TO_DEFAULT

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
