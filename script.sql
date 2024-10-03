DROP DATABASE IF EXISTS uc11;
CREATE DATABASE uc11;

CREATE TABLE produto (
  id int PRIMARY KEY AUTO_INCREMENT,
  nome text,
  valor int(11),
  status text
);


INSERT INTO produto VALUES
(2, 'PS4', 1500, 'Vendido'),
(3, 'Xbox 360', 800, 'Vendido'),
(4, 'Iphone 12', 4800, 'Vendido'),
(5, 'PS2', 400, 'A Venda');