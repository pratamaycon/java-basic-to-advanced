

create table if not exists prefeitos (
	id bigint unsigned primary key not null auto_increment,
    nome varchar(255) not null,
    cidade_id bigint unsigned,
    unique key (cidade_id),
    foreign key (cidade_id) references cidades (id)
);