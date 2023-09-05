<?php
$servername = "localhost";
$username = "root";
$password = "";

// Crear conexión.
echo "<h2>Conexión a base de datos para la tarea 5.4.3</h2>";
$conexion = new mysqli($servername, $username, $password);

// Verificar conexión.
if (!$conexion) {
    die("La conexión ha fallado.<br>" . mysqli_connect_error());
} else {
    echo "Conexión establecida.<br>";
}

// Borrar base de datos.
$sql = "drop database if exists baseDatost5_4_3";
if (mysqli_query($conexion, $sql)) {
    echo "<b>NOTA</b>: La base de datos se ha eliminado por defecto<br>
     para prevenir errores de cara a una nueva creación o inserción de datos.<br>";
} else {
    echo "Error al eliminar la base de datos.<br>" . mysqli_connect_error();
}

// Crear base de datos.
$sql = "create database if not exists baseDatost5_4_3";
if (mysqli_query($conexion, $sql)) {
    echo "Base de datos creada correctamente.<br>";
} else {
    echo "Error en la creación de la base de datos.<br>" . mysqli_connect_error();
}

// Selecciona la base de datos a manipular.
$sql = "use baseDatost5_4_3";
if (mysqli_query($conexion, $sql)) {
    echo "Base de datos 'baseDatosT5_4_3' seleccionada.<br>";
} else {
    echo "Error al seleccionar la base de datos.<br>" . mysqli_error($conexion);
}

// Crear tabla en base de datos.
$sql = "create table if not exists usuarios (
        dni int(8) unsigned primary key,
        nombre varchar(100),
        contrasena varchar(100)
        ) engine Innodb";

if (mysqli_query($conexion, $sql)) {
    echo "Tabla creada correctamente.<br>";
} else {
    echo "Error al crear la tabla.<br>" . mysqli_error($conexion);
}

// Insertar datos en la tabla.
$sql = "INSERT INTO `usuarios` (`dni`, `nombre`, `contrasena`) 
        VALUES ('77665588', 'Marta', 'marta1'),
                ('11223344', 'Pedro', 'pedro1'),
                ('99887766', 'Laura', 'laura1')";

if (mysqli_query($conexion, $sql)) {
    echo "Datos introducidos.<br>";
} else {
    echo "Error en la inserción de datos.<br>" . $sql . "<br>" . mysqli_error($conexion);
}
echo "<p><b>Operaciones realizadas satisfactoriamente. Conexión finalizada.</b></p>";
mysqli_close($conexion);