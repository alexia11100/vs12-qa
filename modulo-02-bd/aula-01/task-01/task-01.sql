CREATE TABLE ESTUDANTE (
  id NUMBER NOT NULL,
  nome VARCHAR(200) NOT NULL,
  data_nascimento DATE NOT NULL,
  nr_matricula NUMBER(10) NOT NULL UNIQUE,
  ativo CHAR(1) NOT NULL,
  PRIMARY KEY(id)
);

CREATE SEQUENCE seq_estudante
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

INSERT INTO ESTUDANTE (id, nome, data_nascimento, nr_matricula, ativo)
VALUES (seq_estudante.NEXTVAL, 'João', TO_DATE('05/11/2001', 'dd/mm/yyyy'), 1234567890, 'S');

INSERT INTO ESTUDANTE (id, nome, data_nascimento, nr_matricula, ativo)
VALUES (seq_estudante.NEXTVAL, 'Ana', TO_DATE('06/11/2001', 'dd/mm/yyyy'), 1234567891, 'S');

INSERT INTO ESTUDANTE (id, nome, data_nascimento, nr_matricula, ativo)
VALUES (seq_estudante.NEXTVAL, 'Pedro', TO_DATE('07/11/2001', 'dd/mm/yyyy'), 1234567892, 'S');

INSERT INTO ESTUDANTE (id, nome, data_nascimento, nr_matricula, ativo)
VALUES (seq_estudante.NEXTVAL, 'Marcela', TO_DATE('08/11/2001', 'dd/mm/yyyy'), 1234567893, 'S');

INSERT INTO ESTUDANTE (id, nome, data_nascimento, nr_matricula, ativo)
VALUES (seq_estudante.NEXTVAL, 'Julio', TO_DATE('09/11/2001', 'dd/mm/yyyy'), 1234567894, 'S');

INSERT INTO ESTUDANTE (id, nome, data_nascimento, nr_matricula, ativo)
VALUES (seq_estudante.NEXTVAL, 'Marcos', TO_DATE('10/11/2001', 'dd/mm/yyyy'), 1234567895, 'S');

INSERT INTO ESTUDANTE (id, nome, data_nascimento, nr_matricula, ativo)
VALUES (seq_estudante.NEXTVAL, 'Fernanda', TO_DATE('11/11/2001', 'dd/mm/yyyy'), 1234567896, 'S');

INSERT INTO ESTUDANTE (id, nome, data_nascimento, nr_matricula, ativo)
VALUES (seq_estudante.NEXTVAL, 'Fabiola', TO_DATE('12/11/2001', 'dd/mm/yyyy'), 1234567897, 'S');

INSERT INTO ESTUDANTE (id, nome, data_nascimento, nr_matricula, ativo)
VALUES (seq_estudante.NEXTVAL, 'Maria', TO_DATE('13/11/2001', 'dd/mm/yyyy'), 1234567898, 'S');

INSERT INTO ESTUDANTE (id, nome, data_nascimento, nr_matricula, ativo)
VALUES (seq_estudante.NEXTVAL, 'Antonio', TO_DATE('14/11/2001', 'dd/mm/yyyy'), 1234567899, 'S');

SELECT * FROM ESTUDANTE;