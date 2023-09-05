drop DATABASE if EXISTS departamentoVentas;
CREATE DATABASE IF NOT EXISTS departamentoVentas
	DEFAULT CHARACTER SET UTF8
    DEFAULT COLLATE UTF8_SPANISH_CI;

USE departamentoVentas;

CREATE TABLE if NOT EXISTS propietario (
	pnum varchar(5) not null,
	nombre varchar(30) not null,
	apellido varchar(50) not null,
	direccion varchar(50) not null,
	telefono int(9) NOT NULL
) engine INNODB;

create table if not EXISTS inmueble (
	inum varchar(5) not null,
    calle varchar(50) not null,
    area varchar(30),
    poblacion varchar(30) not null,
    tipo varchar(10) not null,
    habitaciones tinyint(2) not null,
    alquiler int(3) not null,
    pnum varchar(5) not null
) ENGINE INNODB;

CREATE TABLE if not EXISTS inquilino (
	qnum varchar(5) not NULL,
	nombre varchar(30) not NULL,
	apellido VARCHAR(50) not NULL,
	direccion VARCHAR(50) not NULL,
	telefono int(9) not NULL,
	tipo varchar(10) not NULL,
	alquiler int(3) not NULL
) engine innodb;

alter table propietario
add CONSTRAINT pk_propietario PRIMARY KEY (pnum);

alter table inmueble
add CONSTRAINT pk_inmueble primary key (inum);

alter table inmueble
ADD CONSTRAINT fk_inmueble FOREIGN key (pnum) REFERENCES propietario(pnum)
	on delete CASCADE
	on update CASCADE;
	
alter table inquilino
add CONSTRAINT pk_inquilino PRIMARY key (qnum);

insert into propietario (pnum, nombre, apellido, direccion, telefono) values ("P46", "Amparo", "Felipe", "Asensio 24, Castellón", 964230680);
insert into propietario (pnum, nombre, apellido, direccion, telefono) values ("P87","Manuel","Alejandro","Av. Libertad 15, Vinaroz",964450760);
insert into propietario (pnum, nombre, apellido, direccion, telefono) values ("P40","Alberto","Estrada","Av. del Puerto 52, Castellón",964200740);
insert into propietario (pnum, nombre, apellido, direccion, telefono) values ("P93","YOlanda","Robles","Purísima 4, Segorbe",964710430);

insert into inmueble (inum, calle, area, poblacion, tipo, habitaciones, alquiler, pnum) values ("IA14", "En medio, 128", "Centro", "Castellón", "Casa", 6, 600, "P46");
insert into inmueble (inum, calle, area, poblacion, tipo, habitaciones, alquiler, pnum) values ("IL94", "Riu Ebre, 24", "Ronda Sur", "Castellón", "Piso", 4, 350, "P87");
insert into inmueble (inum, calle, area, poblacion, tipo, habitaciones, alquiler, pnum) values ("IG4", "Sorell, 5", "Grao", "Castellón", "Piso", 3, 300, "P40");
insert into inmueble (inum, calle, area, poblacion, tipo, habitaciones, alquiler, pnum) values ("IG36", "Alicante, 1", "", "Segorbe", "Piso", 3, 325, "P93");
insert into inmueble (inum, calle, area, poblacion, tipo, habitaciones, alquiler, pnum) values ("IG21", "San Francisco, 10", "", "Vinaroz", "Casa", 5, 550, "P87");
insert into inmueble (inum, calle, area, poblacion, tipo, habitaciones, alquiler, pnum) values ("IG16", "Capuchinos, 19", "Rafalafena", "Castellón", "Piso", 4, 400, "P93");

insert into inquilino (qnum, nombre, apellido, direccion, telefono, tipo, alquiler) values ("Q76", "Juan", "Felip", "Barceló 47, Castellón", 964282540, "Piso", 375);
insert into inquilino (qnum, nombre, apellido, direccion, telefono, tipo, alquiler) values ("Q56", "Ana", "Grangel", "San Rafael 45, Almazora", 964551110, "Piso", 300);
insert into inquilino (qnum, nombre, apellido, direccion, telefono, tipo, alquiler) values ("Q74", "Elena", "Abaso", "Navarra 76, Castellón", 964205560, "Casa", 700);
insert into inquilino (qnum, nombre, apellido, direccion, telefono, tipo, alquiler) values ("Q62", "Alicia", "Mori", "Alloza 45, Castellón", 964229580, "Piso", 550);




















