
insert into prefeitos
	(nome, cidade_id)
values 
	('Rodrigo Neves', 2),
    ('Raquel Lyra', 3),
    ('Zenaldo Coutinho', null);
    
insert into prefeitos
	(nome, cidade_id)
values 
	('Rafael Greca', null);

-- erro nao pode usar fk duplicada
insert into prefeitos
	(nome, cidade_id)
values 
	('Rodrigo Pinheiro', 3);
    
        
    

        
