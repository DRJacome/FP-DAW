<?php
$servername = "localhost";
$username = "root";
$password = "";

// Crear conexión.
echo "<h2>Conexión a base de datos para la tiendaFotografia</h2>";
$conexion = new mysqli($servername, $username, $password);

// Verificar conexión.
if (!$conexion) {
    echo "La conexión ha fallado.<br>" . mysqli_connect_error();
} else {
    echo "Conexión establecida.<br>";
}

// Borrar base de datos.
$sql = "drop database if exists tiendaFotografia";
if (mysqli_query($conexion, $sql)) {
    echo "<b>NOTA</b>: La base de datos se ha eliminado por defecto.<br>
     para prevenir errores de cara a una nueva creación o inserción de datos.<br>";
} else {
    echo "Error al eliminar la base de datos.<br>" . mysqli_connect_error();
}

// Crear base de datos.
$sql = "create database if not exists tiendaFotografia";
if (mysqli_query($conexion, $sql)) {
    echo "Base de datos creada correctamente.<br>";
} else {
    echo "Error en la creación de la base de datos.<br>" . mysqli_connect_error();
}

// Selecciona la base de datos a manipular.
$sql = "use tiendaFotografia";
if (mysqli_query($conexion, $sql)) {
    echo "Base de datos tiendaFotografia seleccionada.<br>";
} else {
    echo "Error al seleccionar la base de datos.<br>" . mysqli_error($conexion);
}

// Crear tabla en base de datos.
$sql = "create table if not exists productos (
        idProducto int(8) unsigned primary key,
        producto varchar(100),
        precioProducto int,
        stockUDs int
        ) engine Innodb";

if (mysqli_query($conexion, $sql)) {
    echo "Tabla creada correctamente.<br>";
} else {
    echo "Error al crear la tabla.<br>" . mysqli_error($conexion);
}

// Insertar datos en la tabla.
$sql = "INSERT INTO `productos` (`idProducto`, `producto`, `precioProducto`, `stockUDs`) 
        VALUES ('1', 'objetivos', '200 €', '5'),
                ('2', 'carretes', '12 €', '40'),
                ('3', 'camaras', '800 €', '16')";

if (mysqli_query($conexion, $sql)) {
    echo "Datos introducidos.<br>";
} else {
    echo "Error en la inserción de datos.<br>" . $sql . "<br>" . mysqli_error($conexion);
}
echo "<p><b>Operaciones realizadas satisfactoriamente. Conexión finalizada.</b></p>";
mysqli_close($conexion);
