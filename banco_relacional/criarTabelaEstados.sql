-- Criar database
CREATE DATABASE estudo_relacional;

-- Utilizar esse schema
use estudo_relacional;

-- Criar tabela de estados
create table estados (
	id BIGINT UNSIGNED PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) UNIQUE KEY NOT NULL,
    sigla VARCHAR(2) UNIQUE KEY NOT NULL,
    regiao Enum ('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul') NOT NULL,
    populacao decimal (5, 2) NOT NULL
);