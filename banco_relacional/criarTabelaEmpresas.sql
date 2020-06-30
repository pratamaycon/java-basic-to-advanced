

create table if not exists empresas (
	id bigint unsigned primary key not null auto_increment,
    nome varchar(255) not null,
    cnpj int unsigned,
    unique key (cnpj)
);

-- cidades-empresas relacao nxn
create table if not exists empresas_unidades (
	empresa_id bigint unsigned not null,
    cidade_id bigint unsigned not null,
    sede tinyint not null,
    primary key (empresa_id, cidade_id)
);