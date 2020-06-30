

Select 
	regiao as 'Regiao',
    sum(populacao) as Total
from estados
group by regiao
order by Total desc;

Select 
    sum(populacao) as Total
from estados;

Select 
    avg(populacao) as Total
from estados;