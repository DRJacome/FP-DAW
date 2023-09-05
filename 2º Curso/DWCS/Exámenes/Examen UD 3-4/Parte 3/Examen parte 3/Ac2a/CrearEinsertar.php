<?php
$servername = "localhost";
$username = "root";
$password = "";

// Crear conexión.
$conexion = new mysqli($servername, $username, $password);

// Verificar conexión.
if (!$conexion) {
    die("La conexión ha fallado.<br>" . mysqli_connect_error());
} else {
    echo "Conectado.<br>";
}

// Borrar base de datos.
$sql = "drop database if exists frutas";
if (mysqli_query($conexion, $sql)) {
    echo "La base de datos se ha eliminado correctamente para prevenir errores <br>
            de cara a una nueva creación o inserción de datos.<br>";
} else {
    echo "Error al eliminar la base de datos.<br>" . mysqli_connect_error();
}

// Crear base de datos.
$sql = "create database if not exists frutas";
if (mysqli_query($conexion, $sql)) {
    echo "Base de datos creada correctamente.<br>";
} else {
    echo "Error en la creación de la base de datos.<br>" . mysqli_connect_error();
}

// Selecciona la base de datos a manipular.
$sql = "use frutas";
if (mysqli_query($conexion, $sql)) {
    echo "Base de datos seleccionada correctamente.<br>";
} else {
    echo "Error al seleccionar la base de datos.<br>" . mysqli_error($conexion);
}

// Crear tabla en base de datos.
$sql = "crete TABLE IF NOT EXISTS fruta (
    nome_fruta varchar(50) CHARACTER SET latin1 NOT NULL,
    nome_proveedor varchar(100) CHARACTER SET latin1 NOT NULL,
    telefono_proveedor int(9) NOT NULL,
    cantidade_stock int NOT NULL,
    prezo decimal (10,2) NOT NULL,
    cantidade_vendida int not null
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin";

if (mysqli_query($conexion, $sql)) {
    echo "Tabla creada correctamente.<br>";
} else {
    echo "Error al crear la tabla.<br>" . mysqli_error($conexion);
}

// Insertar datos en la tabla.
$sql = 'insert INTO fruta 
(nome_fruta, nome_proveedor, telefono_proveedor, cantidade_stock, prezo, cantidade_vendida) 
VALUES
("Mazá royan gala", "Mercedes", "656897456", "432", "1.25", "45"),
("Pera limonera", "Logan", "789542458", "400", "1.15", "98"),
("Sandía sen pepitas", "Walter", "987654313", "875", "0.85", "478")';

$sql = "alter table fruta
        add column tienda";

if (mysqli_query($conexion, $sql)) {
    echo "Datos introducidos correctamente.<br>";
} else {
    echo "Error en la inserción de datos.<br>" . $sql . "<br>" . mysqli_error($conexion);
}
mysqli_close($conexion);
