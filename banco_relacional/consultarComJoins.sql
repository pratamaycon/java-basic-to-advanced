

SELECT * from cidades c inner join prefeitos p on c.id = p.cidade_id;

-- veem os dados associados
-- left pega todos os dados de cidades, mesmo sem nenhum prefeito associado.
select * from cidades c left join prefeitos p on c.id = p.cidade_id;
-- mesmo resultado da query de cima.
select * from cidades c left outer join prefeitos p on c.id = p.cidade_id;

-- veem os dados associados
-- right pega todos os dados de prefeitos, mesmo sem nenhum cidade associada.
select * from cidades c right join prefeitos p on c.id = p.cidade_id;

-- select * from cidades c full join prefeitos p on c.id = p.cidade_id;
select * from cidades c left join prefeitos p on c.id = p.cidade_id
union
select * from cidades c right join prefeitos p on c.id = p.cidade_id;

-- select * from cidades c full join prefeitos p on c.id = p.cidade_id;
select * from cidades c left join prefeitos p on c.id = p.cidade_id
union all -- veem duplicacoes
select * from cidades c right join prefeitos p on c.id = p.cidade_id;