-- Criar tabela de cidades caso ele não exista
CREATE TABLE IF NOT EXISTS cidades (
	id BIGINT UNSIGNED PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    estado_id BIGINT UNSIGNED NOT NULL,
    area DECIMAL(10,2),
    FOREIGN KEY (estado_id) REFERENCES estados(id)
);

-- Criar tabela de teste caso ele não exista
CREATE TABLE IF NOT EXISTS teste (
	id BIGINT UNSIGNED PRIMARY KEY NOT NULL AUTO_INCREMENT
);

-- Apaga a tabela teste caso ele exista
DROP TABLE IF EXISTS teste;