INSERT INTO contas (id, nome_responsavel) VALUES (1,'Fulano');
INSERT INTO contas (id, nome_responsavel) VALUES (2,'Sicrano');

INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (1,'2019-01-01 12:00:00',30895.46,'DEPOSITO', null, 1);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (2,'2019-02-03 09:53:27',12.24,'DEPOSITO', null,2);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (3,'2019-05-04 08:12:45',-500.50,'SAQUE', null,1);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (4,'2019-08-07 08:12:45',-530.50,'SAQUE', null,2);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (5,'2020-06-08 10:15:01',3241.23,'TRANSFERENCIA', 'Beltrano',1);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (6,'2021-04-01 12:12:04',25173.09,'TRANSFERENCIA', 'Ronnyscley',2);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (7,'2021-04-01 12:12:04',25173.09,'TRANSFERENCIA', 'Fulano',2);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (8,'2020-01-01 12:00:00',30.46,'DEPOSITO', 'Beltrano', 1);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (9,'2021-02-03 09:53:27',2.24,'DEPOSITO', 'Beltrano',1);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (10,'2022-05-04 08:12:45',-50.00,'SAQUE', 'Beltrano',1);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (11,'2022-08-07 08:12:45',-5.50,'SAQUE', 'Beltrano',1);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (12,'2021-06-08 10:15:01',2000.23,'TRANSFERENCIA', 'Beltrano',1);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (13,'2018-04-01 12:12:04',40.09,'TRANSFERENCIA', 'Ronnyscley',1);
INSERT INTO transferencias (id,data, valor, tipo, nome, conta_id) VALUES (14,'2010-04-01 12:12:04',50.09,'TRANSFERENCIA', 'Fulano',1);


