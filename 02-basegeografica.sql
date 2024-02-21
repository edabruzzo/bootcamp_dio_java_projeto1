\c basegeografica;

-- Cadastramento de tb_regiao

INSERT INTO tb_regiao(id_regiao, cod_regiao, nome_regiao)
VALUES (1, 'CO', 'Centro-Oeste');

INSERT INTO tb_regiao (id_regiao, cod_regiao, nome_regiao)
VALUES (2, 'NE', 'Nordeste');

INSERT INTO tb_regiao (id_regiao, cod_regiao, nome_regiao)
VALUES (3, 'N', 'Norte');

INSERT INTO tb_regiao (id_regiao, cod_regiao, nome_regiao)
VALUES (4, 'SE', 'Sudeste');

INSERT INTO tb_regiao (id_regiao, cod_regiao, nome_regiao)
VALUES (5, 'S', 'Sul');


-- Cadastramento de tb_estado

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (1, 'AC', 'Acre', 'Rio Branco', 3);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (2, 'AL', 'Alagoas', 'Maceió', 2);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (3, 'AP', 'Amapá', 'Macapá', 3);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (4, 'AM', 'Amazonas', 'Manaus', 3);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (5, 'BA', 'Bahia', 'Salvador', 2);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (6, 'CE', 'Ceará', 'Fortaleza', 2);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (7, 'DF', 'Distrito Federal', 'Brasília', 1);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (8, 'ES', 'Espírito Santo', 'Vitória', 4);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (9, 'GO', 'Goiás', 'Goiânia', 1);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (10, 'MA', 'Maranhão', 'São Luís', 2);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (11, 'MT', 'Mato Grosso', 'Cuiabá', 1);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (12, 'MS', 'Mato Grosso do Sul', 'Campo Grande', 1);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (13, 'MG', 'Minas Gerais', 'Belo Horizonte', 4);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (14, 'PA', 'Pará', 'Belém', 3);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (15, 'PB', 'Paraíba', 'João Pessoa', 2);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (16, 'PR', 'Paraná', 'Curitiba', 5);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (17, 'PE', 'Pernambuco', 'Recife', 2);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (18, 'PI', 'Piauí', 'Teresina', 2);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (19, 'RJ', 'Rio de Janeiro', 'Rio de Janeiro', 4);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (20, 'RN', 'Rio Grande do Norte', 'Natal', 2);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (21, 'RS', 'Rio Grande do Sul', 'Porto Alegre', 5);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (22, 'RO', 'Rondônia', 'Porto Velho', 3);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (23, 'RR', 'Roraima', 'Boa Vista', 3);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (24, 'SC', 'Santa Catarina', 'Florianópolis', 5);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (25, 'SP', 'São Paulo', 'São Paulo', 4);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (26, 'SE', 'Sergipe', 'Aracaju', 2);

INSERT INTO tb_estado (id_estado, sigla_estado, nome_estado, nome_capital, id_regiao)
VALUES (27, 'TO', 'Tocantins', 'Palmas', 3);
