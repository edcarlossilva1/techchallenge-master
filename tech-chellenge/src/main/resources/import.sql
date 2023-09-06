INSERT INTO tb_endereco(rua, numero, bairro, cidade, estado) VALUES ('Rua Concordia', 12, 'Santana', 'São Paulo', 'SP');
INSERT INTO tb_endereco(rua, numero, bairro, cidade, estado) VALUES ('Rua Terezopolis', 329, 'Santa Izabel', 'Rio de Janeiro', 'RJ');
INSERT INTO tb_endereco(rua, numero, bairro, cidade, estado) VALUES ('Rua Santo Elias', 567, 'Tatuape', 'São Paulo', 'SP');
INSERT INTO tb_endereco(rua, numero, bairro, cidade, estado) VALUES ('Rua João Vinte e Tres', 1312, 'Vila Maria', 'São Paulo', 'SP');


INSERT INTO tb_cliente(nome, nascimento, sexo, parentesco, endereco_id) VALUES ('Cristina Torres','23/12/1987', 'Feminino', 'Titular', 1);
INSERT INTO tb_cliente(nome, nascimento, sexo, parentesco, endereco_id) VALUES ('Izadora Torres','18/09/2005', 'Feminino', 'Filha',1);
INSERT INTO tb_cliente(nome, nascimento, sexo, parentesco, endereco_id) VALUES ('João Marcos','18/09/2005', 'Masculino', 'Esposo',1);
INSERT INTO tb_cliente(nome, nascimento, sexo, parentesco, endereco_id) VALUES ('Valentina Rossi','12/12/1989', 'Feminino', 'Titular',2);
INSERT INTO tb_cliente(nome, nascimento, sexo, parentesco, endereco_id) VALUES ('Angelo Amorim','10/03/1959', 'Masculino', 'Titular',3);
INSERT INTO tb_cliente(nome, nascimento, sexo, parentesco, endereco_id) VALUES ('João Bosco','03/05/1997', 'Masculino', 'Filho',3);


INSERT INTO tb_eletrodomestico(modelo, potencia, tempo, consumo, cliente_id) values ('MAQUINA DE LAVAR', 4.500,2,12.00,1);
INSERT INTO tb_eletrodomestico(modelo, potencia, tempo, consumo, cliente_id) values ('TELEVISAO', 4.200,1,12.00,1);
INSERT INTO tb_eletrodomestico(modelo, potencia, tempo, consumo, cliente_id) values ('COMPUTADOR', 4.500,1,11.00,1);
INSERT INTO tb_eletrodomestico(modelo, potencia, tempo, consumo, cliente_id) values ('APARELHO DE SOM', 4.500,1,11.00,2);