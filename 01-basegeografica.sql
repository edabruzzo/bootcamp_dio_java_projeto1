CREATE DATABASE basegeografica;

\c basegeografica;

-- GERADO PELO HIBERNATE

alter table if exists tb_estado 
       drop constraint if exists FKhja5q7wbdsuqkls1xjola14vr;

drop table if exists tb_estado cascade;

drop table if exists tb_regiao cascade;

drop sequence if exists tb_estado_seq;

create sequence tb_estado_seq start with 1 ;--increment by 50;

create table tb_estado (
        id_estado integer not null,
        regiao_id_regiao integer,
        sigla_estado varchar(2) not null,
        nome_capital varchar(20) not null,
        nome_estado varchar(20) not null,
        primary key (id_estado)
    );

create table tb_regiao (
        cod_regiao varchar(2) not null,
        id_regiao serial not null,
        nome_regiao varchar(20) not null,
        primary key (id_regiao)
    );

alter table if exists tb_estado
       add constraint FKhja5q7wbdsuqkls1xjola14vr
       foreign key (regiao_id_regiao)
       references tb_regiao
       on delete cascade;



-- GERADO PELO HIBERNATE





/*
CREATE TABLE tb_regiao (
    id_regiao INT NOT NULL,
    cod_regiao VARCHAR(2) NOT NULL,
    nome_regiao VARCHAR(20) NOT NULL,
    CONSTRAINT PK_tb_regiao PRIMARY KEY (id_regiao)
);

CREATE TABLE tb_estado (
    id_estado INT NOT NULL,
    sigla_estado CHAR(2) NOT NULL,
    nome_Estado VARCHAR(20) NOT NULL,
    nome_capital VARCHAR(20) NOT NULL,
    regiao_id_regiao INT NOT NULL,
    CONSTRAINT PK_Estados PRIMARY KEY (id_estado),
    CONSTRAINT FK_Estado_Regiao FOREIGN KEY (regiao_id_regiao) REFERENCES tb_regiao (id_regiao)
);


create sequence tb_estado_seq start with 1 increment by 50;
*/
