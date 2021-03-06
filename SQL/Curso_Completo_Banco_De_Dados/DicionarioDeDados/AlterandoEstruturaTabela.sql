CREATE TABLE TABELA(
    COLUNA1 VARCHAR(30),
    COLUNA2 VARCHAR(30),
    COLUNA3 VARCHAR(30)
);

-- ADICIONANDO PK
ALTER TABLE TABELA
ADD PRIMARY KEY (COLUNA1);

-- ADICIONANDO COLUNA SEM POSICAO
ALTER TABLE TABELA
ADD COLUNA VARCHAR(30);

-- ADICIONANDO UMA COLUNA COM POSICAO
ALTER TABLE TABELA
ADD COLUMN COLUNA4 VARCHAR(30) NOT NULL UNIQUE,
AFTER COLUNA3;

-- modificando o tipo de um campo
ALTER TABLE TABELA MODIFY COLUNA2 DATE NOT NULL;

-- RENOMEANDO O NOME DA TABELA
ALTER TABLE TABELA
RENAME PESSOA;

CREATE TABLE TIME(
    IDTIME INT PRIMARY KEY AUTO_INCREMENT,
    TIME VARCHAR(30),
    ID_PESSOA VARCHAR(30)
);

-- FOREIGN KEY
ALTER TABLE TIMEADD FOREIGN KEY(ID_PESSOA)
REFERENCES PESSOA(COLUNA1);
