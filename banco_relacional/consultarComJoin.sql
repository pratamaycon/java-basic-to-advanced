
-- produto cartesiano
select * from estados e, cidades c;

-- select com join
select e.nome as Estado,
	   c.nome as Cidade, 
       regiao as Região 
from estados e, cidades c
where e.id = c.estado_id;

-- segunda forma de fazer join	
select 
	c.nome as Cidade,
    e.nome as Estado,
    regiao as Região
from estados e
inner join cidades c 
	on e.id = c.estado_id;