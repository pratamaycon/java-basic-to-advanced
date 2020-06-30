
alter table empresas modify cnpj varchar(14);

insert into empresas 
	(nome, cnpj)
values 
	('Bradesco', 60746948000112),
    ('Vale', 33592510000154),
    ('Cielo', 010270580001);
    
--  descreve o conteudo da tabela
desc empresas;
desc prefeitos;

insert into empresas_unidades
	(empresa_id, cidade_id, sede)
values 
	(1,1,1),
    (1,2,0),
    (2,1,0),
    (2,2,1);