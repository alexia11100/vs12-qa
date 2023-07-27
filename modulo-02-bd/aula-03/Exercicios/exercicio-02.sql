SELECT *
FROM PESSOA 
CROSS JOIN CONTATO;

SELECT *
FROM PESSOA
INNER JOIN CONTATO
ON PESSOA.ID_PESSOA = CONTATO.ID_PESSOA;

SELECT *
FROM PESSOA
INNER JOIN PESSOA_X_PESSOA_ENDERECO ON PESSOA.id_pessoa = PESSOA_X_PESSOA_ENDERECO.id_pessoa
INNER JOIN ENDERECO_PESSOA ON PESSOA_X_PESSOA_ENDERECO.id_endereco = ENDERECO_PESSOA.id_endereco;

SELECT *
FROM Pessoa
INNER JOIN Contato ON Pessoa.id_pessoa = Contato.id_pessoa
INNER JOIN Pessoa_X_Pessoa_Endereco ON Pessoa.id_pessoa = Pessoa_X_Pessoa_Endereco.id_pessoa
INNER JOIN Endereco_Pessoa ON Pessoa_X_Pessoa_Endereco.id_endereco = Endereco_Pessoa.id_endereco;

SELECT *
FROM Pessoa
LEFT JOIN Contato ON Pessoa.id_pessoa = Contato.id_pessoa;

SELECT *
FROM Pessoa
LEFT JOIN Pessoa_X_Pessoa_Endereco ON Pessoa.id_pessoa = Pessoa_X_Pessoa_Endereco.id_pessoa
LEFT JOIN Endereco_Pessoa ON Pessoa_X_Pessoa_Endereco.id_endereco = Endereco_Pessoa.id_endereco;

SELECT *
FROM Pessoa
LEFT JOIN Contato ON Pessoa.id_pessoa = Contato.id_pessoa
LEFT JOIN Pessoa_X_Pessoa_Endereco ON Pessoa.id_pessoa = Pessoa_X_Pessoa_Endereco.id_pessoa
LEFT JOIN Endereco_Pessoa ON Pessoa_X_Pessoa_Endereco.id_endereco = Endereco_Pessoa.id_endereco;

