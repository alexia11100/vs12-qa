UPDATE ENDERECO
SET LOGRADOURO = 'Novo Logradouro', COMPLEMENTO = 'ap 02'
WHERE ID_ENDERECO = 2;

UPDATE ENDERECO
SET LOGRADOURO = 'Logradouro2', COMPLEMENTO = 'ap 03'
WHERE ID_ENDERECO = 3;

UPDATE ENDERECO
SET NUMERO = 999999
WHERE ID_ENDERECO = 4;

DELETE FROM ENDERECO
WHERE ID_ENDERECO = (SELECT MAX(ID_ENDERECO) FROM ENDERECO);

DELETE FROM ENDERECO
WHERE NUMERO = 999999;

DELETE FROM ENDERECO
WHERE ID_ENDERECO = 1 OR ID_ENDERECO = 2;