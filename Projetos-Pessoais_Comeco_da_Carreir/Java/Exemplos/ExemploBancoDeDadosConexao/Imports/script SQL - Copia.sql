create table marca
(	mar_id			int	auto_increment 	primary key,
    mar_nome   		varchar(60),
    mar_origem   	varchar(60)
);

create table movel
(	mod_id			int	auto_increment 	primary key,
    mod_descricao   varchar(60),
    mod_preco		float,
    mar_id			int,
    constraint rel_marca_movel foreign key (mar_id) references marca(mar_id)
);
select * from marca;

/* Consulta */
select * from movel;

/* Inserir dados */
insert into movel (mod_descricao, mod_preco, mar_id) 
		values ('Cadeira de Balanço', 100, 1);
        
/* Alteração de dados */
update marca set mar_nome = 'Teste' where mar_id = 2; 

delete from Marca where mar_id = 3;