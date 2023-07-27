SELECT * FROM VEM_SER.PAIS ORDER BY nome DESC;

SELECT logradouro, cep FROM VEM_SER.ENDERECO WHERE UPPER(SUBSTR(logradouro, 1, 1)) = 'A';

SELECT * FROM VEM_SER.ENDERECO WHERE SUBSTR(cep, 9, 9) = '0';

SELECT * FROM VEM_SER.ENDERECO WHERE numero BETWEEN 1 AND 100;

SELECT * FROM VEM_SER.ENDERECO WHERE UPPER(SUBSTR(logradouro, 1, 3)) = 'RUA' ORDER BY cep DESC;

SELECT COUNT(*) AS quantidade_enderecos FROM VEM_SER.ENDERECO;

SELECT id_cidade, COUNT(*) AS quantidade_enderecos FROM VEM_SER.ENDERECO GROUP BY id_cidade;