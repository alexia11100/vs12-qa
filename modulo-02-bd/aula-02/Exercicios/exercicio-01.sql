CREATE TABLE VEM_SER.PAIS(
	id_pais NUMBER(38,0) PRIMARY KEY NOT NULL,
	nome VARCHAR2(50) UNIQUE NOT NULL
);

CREATE TABLE VEM_SER.ESTADO(
	id_estado NUMBER(38,0) PRIMARY KEY NOT NULL,
	id_pais NUMBER(38,0) NOT NULL,
	nome VARCHAR2(50) UNIQUE NOT NULL,
	CONSTRAINT FK_ID_PAIS FOREIGN KEY (id_pais) REFERENCES PAIS (id_pais)
);

CREATE TABLE VEM_SER.CIDADE(
	id_cidade NUMBER(38,0) PRIMARY KEY NOT NULL,
	id_estado NUMBER(38,0) NOT NULL,
	nome VARCHAR2(50) UNIQUE NOT NULL,
	CONSTRAINT FK_ID_ESTADO FOREIGN KEY (id_estado) REFERENCES ESTADO (id_estado)
);

CREATE TABLE VEM_SER.BAIRRO (
	id_bairro NUMBER(38,0) PRIMARY KEY NOT NULL,
	id_cidade NUMBER(38,0) NOT NULL,
	id_estado NUMBER(38,0) NOT NULL,
	nome VARCHAR2(50) NOT NULL,
	FOREIGN KEY (id_estado) REFERENCES ESTADO (id_estado),
	CONSTRAINT FK_ID_CIDADE FOREIGN KEY (id_cidade) REFERENCES CIDADE (id_cidade)
);

CREATE TABLE VEM_SER.ENDERECO (
	id_endereco NUMBER(38,0) PRIMARY KEY NOT NULL,
	id_bairro NUMBER(38,0) NOT NULL,
	id_cidade NUMBER(38,0) NOT NULL,
	logradouro VARCHAR2(255) NOT NULL,
	numero NUMBER(38,0) NOT NULL,
	complemento VARCHAR2(100),
	cep CHAR(9),
	FOREIGN KEY (id_cidade) REFERENCES CIDADE (id_cidade),
	CONSTRAINT FK_ID_BAIRRO FOREIGN KEY (id_bairro) REFERENCES BAIRRO (id_bairro)
);