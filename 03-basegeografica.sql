/*
\c basegeografica;

create table tb_regiao_lista_estados (
        regiao_id_regiao integer not null,
        lista_estados_id_estado integer not null
    );

alter table if exists tb_regiao_lista_estados 
       drop constraint if exists UK_4hawrbhnft97krsgi7wc4ss3c;

alter table if exists tb_regiao_lista_estados
       add constraint UK_4hawrbhnft97krsgi7wc4ss3c unique (lista_estados_id_estado);


alter table if exists tb_regiao_lista_estados
       add constraint FKqxjw3wqwgvqld0ylr5wsaol51
       foreign key (lista_estados_id_estado)
       references tb_estado;

alter table if exists tb_regiao_lista_estados
       add constraint FKgjpalxipm64dckrd2t5l61dee
       foreign key (regiao_id_regiao)
       references tb_regiao;

INSERT INTO tb_regiao_lista_estados(regiao_id_regiao, lista_estados_id_estado)
SELECT regiao_id_regiao, id_estado FROM tb_estado;
*/
