CREATE TABLE VEM_SER.PESSOA (
    id_pessoa NUMBER NOT NULL,
    nome VARCHAR2(255) NOT NULL,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR2(14),
    idade NUMBER(3) NOT NULL,
    altura DECIMAL(4,2) NOT NULL,
    cpf CHAR(11) UNIQUE NOT NULL,
    PRIMARY KEY(id_pessoa)
);