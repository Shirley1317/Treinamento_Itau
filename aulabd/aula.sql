-- isso é um comentário

-- criar uma nova " Base de Dados"
create database bd_itau;

-- marcar o BD como padrão
use bd_itau;

-- criar uma nova tabela no BD
-- [nome da coluna] [tpo de dados] [ qualificadores]
-- not full = esta coluna não pode ser deixada em branco
-- auto_increment = numeração será gerada pelo próprio BD (1, 2, 3 ...)
-- varchar(x) = campo de texto com tamanho maximo de caracter x
-- constraint = é uma regra/ restrição
-- primary key = chave primaria (identificador na tabela) não pode repetir

-- Para apagar tudo!! CUIDADO
-- drop table cliente;

create table cliente (
codigo integer not null auto_increment,
nome varchar(120) not null,
telefone varchar(20),
constraint pk_cliente primary key (codigo)
);

-- descrever detalhe da tabela "cliente"
desc cliente;

-- inserir dados na tabela
insert into cliente (codigo, nome, telefone) values(null, 'Carlos Augusto', '11-99999-9999');
insert into cliente (codigo, nome, telefone) values(null, 'Daniel', '11-99999-9991');
insert into cliente (codigo, nome, telefone) values(null, 'Amanda', '11-99999-9992');
insert into cliente (codigo, nome, telefone) values(null, 'Vanessa', '11-99999-9993');
insert into cliente (codigo, nome, telefone) values(null, 'Fernando', '11-99999-9994');

-- buscar (select) as informações no banco de dados
-- select [ quais colunas] from [qual tabela] where [qual condição]
-- buscar todas as informações de todos os clientes

select *
from cliente;

-- buscar o nome e o telefone do cliente com código 2

select nome, telefone -- buscar apenas nome e telefone
from cliente          -- na tabela cliente
where codigo = 2; 	  -- onde o codigo seja igual a 2

-- apagando dados
-- apagar o cliente que tem o codigo 3
delete from cliente where codigo = 3

-- atualizar dados
update cliente
set telefone = '11-12345-1234' 
-- alterar um campo especifico/ atribuição
where codigo = 2;

-- SQL = Linguagem de Consulta Estruturada

-- criar tabela veiculo 

create table veiculo(
codigo integer not null auto_increment,
marca varchar (20),
modelo varchar (40),
proprietario integer,
constraint pk_veiculo primary key (codigo),
constraint fk_veiculo foreign key (proprietario) references cliente(codigo)
);

select *
from veiculo;

-- inserir dados do veiculo
insert into veiculo  values(null, 'VW', 'Gol', 1), (null, 'Chevrolet', 'Astra', 1), (null, 'BMW', 'X1', 2), (null, 'VW', 'T-Cross', 4);

-- quais os nomes dos proprietarios de cada veiculo?
-- inner join = junção das tabelas onde os campos são iguais

select marca, modelo, nome
from veiculo inner join cliente on veiculo.proprietario = cliente.codigo;




