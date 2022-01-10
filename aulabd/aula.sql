-- isso é um comentário

-- criar uma nova "Base de Dados"
create database bd_itau;

-- marcar o BD como padrão
use bd_itau;

-- criar uma nova tabela no BD
-- [nome da coluna] [tipo de dados] [qualificadores]
-- not null = esta coluna não pode ser deixada em branco
-- auto_increment = numeração será gerada pelo próprio BD (1, 2, 3, 4, ...)
-- varchar(x) = campo de texto com tamanho máximo x
-- primary key = chave primária (identificador na tabela), não pode repetir / informado que o codigo é o primary key que não pode se repetir
-- codigo, nome, telefone = dados da tabela
create table cliente (
		codigo integer not null auto_increment, 
        nome varchar(120) not null,
        telefone varchar(20),
        constraint pk_cliente primary key (codigo)
);

-- CUIDADO!!! apaga a estrutura da tabela e TODOS os dados junto
-- drop table cliente; esse é o comando que apaga

-- descrever os detalhes da tabela
desc cliente;

-- inseriir dados na tabela
-- na frente do cliente () o que esta dentro do parenteses é a ordem que quero que apareça na tabela

insert into cliente (codigo, nome, telefone) values (null, 'Carlos Augusto', '(11) 99999-9991');
insert into cliente (codigo, nome, telefone) values (null, 'Amanda Souza', '(11) 99999-9992');
insert into cliente (codigo, nome, telefone) values (null, 'Ricardo Santos', '(11) 99999-9993');
insert into cliente (codigo, nome, telefone) values (null, 'Felipe Prado', '(11) 99999-9994');

-- buscar (select) as informações no Banco de Dados
-- select [quais colunas] from [qual tabela] where [qual condição]

select *
from cliente;

-- buscar o nome e o telefone do cliente com o codigo 2
select nome, telefone  -- busque apenas nome e telefone
from cliente		   -- na tabela cliente
where codigo = 2; 	   -- onde o codigo seja 2

-- apagando dados
-- apagar o cliente que tenha o codigo 3
delete from cliente where codigo = 3;

-- atualizar dados
update cliente
set telefone = '(11) 99999-9995'
where codigo = 2;

-- SQL = Linguagem de Consulta Estruturada

-- criar tabela veiculo
-- foreign key = chave estrangeira, ligar com outra tabela
-- references = indica com qual tabela e campo a ligação é feita
create table veiculo(
	codigo integer not null auto_increment,
    marca varchar(20),
    modelo varchar (40),
    proprietario integer,
    constraint pk_veiculo primary key (codigo),
    constraint fk_veiculo foreign key (proprietario) references cliente (codigo)
    
);

-- inserir dados do veículo
insert into veiculo values (null, 'VW', 'Gol', 1);
insert into veiculo values (null, 'Chevrolet', 'Astra', 1);
insert into veiculo values (null, 'BMW', 'X1', 2);

-- buscar todos os dados de todos os veículos
select *
from veiculo;

-- quais os nomes dos proprietarios de cada veículo?
-- inner join = junção das tabelas onde os campos são iguais
select marca, modelo, nome
from veiculo inner join cliente on veiculo.proprietario = cliente.codigo;



