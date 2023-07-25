INSERT INTO VEM_SER.PESSOA (id_pessoa, nome, data_nascimento, telefone, idade, altura, cpf)
VALUES (1, 'Maria', TO_DATE('1990-01-15', 'YYYY-MM-DD'), '+5551912345678', 31, 1.65, '12345678901');

INSERT INTO VEM_SER.PESSOA (id_pessoa, nome, data_nascimento, telefone, idade, altura, cpf)
VALUES (2, 'João', TO_DATE('1985-05-20', 'YYYY-MM-DD'), '+5551987654321', 36, 1.75, '98765432101');

INSERT INTO VEM_SER.PESSOA (id_pessoa, nome, data_nascimento, telefone, idade, altura, cpf)
VALUES (3, 'Ana', TO_DATE('2000-08-10', 'YYYY-MM-DD'), NULL, 21, 1.60, '45678901234');

INSERT INTO VEM_SER.PESSOA (id_pessoa, nome, data_nascimento, telefone, idade, altura, cpf)
VALUES (4, 'Pedro', TO_DATE('1998-11-30', 'YYYY-MM-DD'), '+5551945678901', 23, 1.80, '78901234567');

SELECT * FROM VEM_SER.PESSOA;

UPDATE VEM_SER.PESSOA
SET idade = idade + 1;

DELETE FROM VEM_SER.PESSOA
WHERE id_pessoa = 4;

SELECT * FROM VEM_SER.PESSOA;