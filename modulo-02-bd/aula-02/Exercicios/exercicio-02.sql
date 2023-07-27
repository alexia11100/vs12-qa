CREATE SEQUENCE seq_pais START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_estado START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_cidade START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_bairro START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_endereco START WITH 1 INCREMENT BY 1;

INSERT INTO VEM_SER.PAIS (id_pais, nome) VALUES (seq_pais.NEXTVAL, 'Brasil');
INSERT INTO VEM_SER.PAIS (id_pais, nome) VALUES (seq_pais.NEXTVAL, 'Estados Unidos');

INSERT INTO VEM_SER.ESTADO (id_estado, id_pais, nome) VALUES (seq_estado.NEXTVAL, 1, 'Bahia');
INSERT INTO VEM_SER.ESTADO (id_estado, id_pais, nome) VALUES (seq_estado.NEXTVAL, 1, 'São Paulo');
INSERT INTO VEM_SER.ESTADO (id_estado, id_pais, nome) VALUES (seq_estado.NEXTVAL, 2, 'Califórnia');
INSERT INTO VEM_SER.ESTADO (id_estado, id_pais, nome) VALUES (seq_estado.NEXTVAL, 2, 'Nova Iorque');

INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome) VALUES (seq_cidade.NEXTVAL, 1, 'Salvador');
INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome) VALUES (seq_cidade.NEXTVAL, 1, 'Utinga');
INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome) VALUES (seq_cidade.NEXTVAL, 2, 'São Paulo');
INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome) VALUES (seq_cidade.NEXTVAL, 2, 'Guarulhos');
INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome) VALUES (seq_cidade.NEXTVAL, 3, 'São Francisco');
INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome) VALUES (seq_cidade.NEXTVAL, 3, 'Los Angeles');
INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome) VALUES (seq_cidade.NEXTVAL, 4, 'Nova Iorque');
INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome) VALUES (seq_cidade.NEXTVAL, 4, 'Geneva');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 1, 1, 'Barra');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 1, 1, 'Itapuã');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 2, 1, 'Centro');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 2, 1, 'Jardim Utinga');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 3, 2, 'Pinheiros');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 3, 2, 'Moema');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 4, 2, 'Vila Galvão');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 4, 2, 'Bom Clima');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 5, 3, 'Marina District');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 5, 3, 'Pacific Heights');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 6, 3, 'Hollywood');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 6, 3, 'Venice');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 7, 4, 'Manhattan');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 7, 4, 'Brooklyn');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 8, 4, 'Eaux-Vives');
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome) VALUES (seq_bairro.NEXTVAL, 8, 4, 'Plainpalais');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 1, 'Rua A', 100, 'Apto 101', '12345-678');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 1, 'Rua B', 200, NULL, '98765-432');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 1, 'Avenida X', 500, 'Casa 1', '54321-876');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 1, 'Avenida Y', 600, 'Casa 2', '67890-123');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 2, 'Rua A', 100, 'Apto 101', '12345-678');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 2, 'Rua B', 200, NULL, '98765-432');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 2, 'Avenida X', 500, 'Casa 1', '54321-876');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 2, 'Avenida Y', 600, 'Casa 2', '67890-123');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 3, 'Rua A', 100, 'Apto 101', '12345-678');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 3, 'Rua B', 200, NULL, '98765-432');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 3, 'Avenida X', 500, 'Casa 1', '54321-876');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 3, 'Avenida Y', 600, 'Casa 2', '67890-123');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 4, 'Rua A', 100, 'Apto 101', '12345-678');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 4, 'Rua B', 200, NULL, '98765-432');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 4, 'Avenida X', 500, 'Casa 1', '54321-876');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 4, 'Avenida Y', 600, 'Casa 2', '67890-123');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 5, 'Rua A', 100, 'Apto 101', '12345-678');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 5, 'Rua B', 200, NULL, '98765-432');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 5, 'Avenida X', 500, 'Casa 1', '54321-876');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 5, 'Avenida Y', 600, 'Casa 2', '67890-123');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 6, 'Rua A', 100, 'Apto 101', '12345-678');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 6, 'Rua B', 200, NULL, '98765-432');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 6, 'Avenida X', 500, 'Casa 1', '54321-876');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 6, 'Avenida Y', 600, 'Casa 2', '67890-123');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 7, 'Rua A', 100, 'Apto 101', '12345-678');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 7, 'Rua B', 200, NULL, '98765-432');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 7, 'Avenida X', 500, 'Casa 1', '54321-876');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 7, 'Avenida Y', 600, 'Casa 2', '67890-123');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 8, 'Rua A', 100, 'Apto 101', '12345-678');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 1, 8, 'Rua B', 200, NULL, '98765-432');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 8, 'Avenida X', 500, 'Casa 1', '54321-876');
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES (seq_endereco.NEXTVAL, 2, 8, 'Avenida Y', 600, 'Casa 2', '67890-123');