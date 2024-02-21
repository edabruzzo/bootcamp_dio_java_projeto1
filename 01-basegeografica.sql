CREATE DATABASE basegeografica;

\c basegeografica;

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
    id_regiao INT NOT NULL,
    CONSTRAINT PK_Estados PRIMARY KEY (id_estado),
    CONSTRAINT FK_Estado_Regiao FOREIGN KEY (id_regiao) REFERENCES tb_regiao (id_regiao)
);
