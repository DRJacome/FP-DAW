drop database if exists frutas;
create database if not exists frutas;
use frutas;

CREATE TABLE IF NOT EXISTS `fruta` (
  `nome_fruta` varchar(50) CHARACTER SET latin1 NOT NULL,
  `nome_proveedor` varchar(100) CHARACTER SET latin1 NOT NULL,
  `telefono_proveedor` int(9) NOT NULL,
  `cantidade_stock` int NOT NULL,
  `prezo` decimal (10,2) NOT NULL,
  `cantidade_vendida` int not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `fruta` 
(`nome_fruta`, `nome_proveedor`, `telefono_proveedor`, `cantidade_stock`, `prezo`, `cantidade_vendida`) 
VALUES
('Mazá royan gala', 'Mercedes', 656897456, 432, 1.25, 45),
('Pera limonera', 'Logan', 789542458, 400, 1.15, 98),
('Sandía sen pepitas', 'Walter', 987654313, 875, 0.85, 478);

alter table `fruta`
    add column `tienda`;