
select * from estados where id = 26;

-- Exemplo de Insert 1
INSERT INTO cidades (nome, area, estado_id) 
values ('Campinas', 795, 25);

-- Exemplo de Insert 2
INSERT INTO cidades (nome, area, estado_id) 
values ('Niterói', 133.9, 19);

-- Exemplo de Insert 1 apartir de um select na coluna sigla
INSERT INTO 
	cidades (nome, area, estado_id) 
values (
	'Caruaru', 
    920.6, 
	(select id  from estados where sigla = 'PE')
);

-- Exemplo de Insert 2 apartir de um select na coluna sigla
INSERT INTO 
	cidades (nome, area, estado_id) 
values (
	'Juazeiro do Norte', 
    248.2, 
	(select id  from estados where sigla = 'CE')
);
