SELECT 
    Pessoa.id_pessoa,
    Pessoa.nome,
    Pessoa.data_nascimento,
    Pessoa.cpf,
    Contato.id_contato,
    Contato.tipo AS tipo_contato,
    Contato.numero,
    Contato.descricao AS descricao_contato
FROM 
    Pessoa
RIGHT JOIN 
    Contato ON Pessoa.id_pessoa = Contato.id_pessoa;

SELECT 
    Pessoa.id_pessoa,
    Pessoa.nome,
    Pessoa.data_nascimento,
    Pessoa.cpf,
    Pessoa_X_Pessoa_Endereco.id_endereco,
    Endereco_Pessoa.tipo AS tipo_endereco,
    Endereco_Pessoa.logradouro,
    Endereco_Pessoa.numero AS numero_endereco,
    Endereco_Pessoa.complemento,
    Endereco_Pessoa.cep,
    Endereco_Pessoa.cidade,
    Endereco_Pessoa.estado,
    Endereco_Pessoa.pais
FROM 
    Pessoa
RIGHT JOIN 
    Pessoa_X_Pessoa_Endereco ON Pessoa.id_pessoa = Pessoa_X_Pessoa_Endereco.id_pessoa
RIGHT JOIN 
    Endereco_Pessoa ON Pessoa_X_Pessoa_Endereco.id_endereco = Endereco_Pessoa.id_endereco;

SELECT 
    Pessoa.id_pessoa,
    Pessoa.nome,
    Pessoa.data_nascimento,
    Pessoa.cpf,
    Contato.id_contato,
    Contato.tipo AS tipo_contato,
    Contato.numero,
    Contato.descricao AS descricao_contato,
    Pessoa_X_Pessoa_Endereco.id_endereco,
    Endereco_Pessoa.tipo AS tipo_endereco,
    Endereco_Pessoa.logradouro,
    Endereco_Pessoa.numero AS numero_endereco,
    Endereco_Pessoa.complemento,
    Endereco_Pessoa.cep,
    Endereco_Pessoa.cidade,
    Endereco_Pessoa.estado,
    Endereco_Pessoa.pais
FROM 
    Pessoa
RIGHT JOIN 
    Contato ON Pessoa.id_pessoa = Contato.id_pessoa
RIGHT JOIN 
    Pessoa_X_Pessoa_Endereco ON Pessoa.id_pessoa = Pessoa_X_Pessoa_Endereco.id_pessoa
RIGHT JOIN 
    Endereco_Pessoa ON Pessoa_X_Pessoa_Endereco.id_endereco = Endereco_Pessoa.id_endereco;

SELECT 
    Pessoa.id_pessoa,
    Pessoa.nome,
    Pessoa.data_nascimento,
    Pessoa.cpf,
    Contato.id_contato,
    Contato.tipo AS tipo_contato,
    Contato.numero,
    Contato.descricao AS descricao_contato
FROM 
    Pessoa
FULL JOIN 
    Contato ON Pessoa.id_pessoa = Contato.id_pessoa;

SELECT 
    Pessoa.id_pessoa,
    Pessoa.nome,
    Pessoa.data_nascimento,
    Pessoa.cpf,
    Pessoa_X_Pessoa_Endereco.id_endereco,
    Endereco_Pessoa.tipo AS tipo_endereco,
    Endereco_Pessoa.logradouro,
    Endereco_Pessoa.numero AS numero_endereco,
    Endereco_Pessoa.complemento,
    Endereco_Pessoa.cep,
    Endereco_Pessoa.cidade,
    Endereco_Pessoa.estado,
    Endereco_Pessoa.pais
FROM 
    Pessoa
FULL JOIN 
    Pessoa_X_Pessoa_Endereco ON Pessoa.id_pessoa = Pessoa_X_Pessoa_Endereco.id_pessoa
FULL JOIN 
    Endereco_Pessoa ON Pessoa_X_Pessoa_Endereco.id_endereco = Endereco_Pessoa.id_endereco;

SELECT 
    Pessoa.id_pessoa,
    Pessoa.nome,
    Pessoa.data_nascimento,
    Pessoa.cpf,
    Contato.id_contato,
    Contato.tipo AS tipo_contato,
    Contato.numero,
    Contato.descricao AS descricao_contato,
    Pessoa_X_Pessoa_Endereco.id_endereco,
    Endereco_Pessoa.tipo AS tipo_endereco,
    Endereco_Pessoa.logradouro,
    Endereco_Pessoa.numero AS numero_endereco,
    Endereco_Pessoa.complemento,
    Endereco_Pessoa.cep,
    Endereco_Pessoa.cidade,
    Endereco_Pessoa.estado,
    Endereco_Pessoa.pais
FROM 
    Pessoa
FULL JOIN 
    Contato ON Pessoa.id_pessoa = Contato.id_pessoa
FULL JOIN 
    Pessoa_X_Pessoa_Endereco ON Pessoa.id_pessoa = Pessoa_X_Pessoa_Endereco.id_pessoa
FULL JOIN 
    Endereco_Pessoa ON Pessoa_X_Pessoa_Endereco.id_endereco = Endereco_Pessoa.id_endereco;

SELECT
    id_pessoa,
    nome
FROM
    Pessoa p
WHERE
    EXISTS (
        SELECT
            1
        FROM
            Pessoa_X_Pessoa_Endereco pxpe
        WHERE
            p.id_pessoa = pxpe.id_pessoa
    );

SELECT
    p.id_pessoa,
    p.nome,
    ep.id_endereco,
    ep.logradouro
FROM
    Pessoa p
LEFT JOIN
    Pessoa_X_Pessoa_Endereco pxpe ON p.id_pessoa = pxpe.id_pessoa
LEFT JOIN
    Endereco_Pessoa ep ON pxpe.id_endereco = ep.id_endereco;