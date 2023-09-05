<?php
$servername = "localhost";
$username = "root";
$password = "";

// Crear conexión.
$conexion = new mysqli($servername, $username, $password);

// Verificar conexión.
if (!$conexion) {
    die("La conexión ha fallado.<hr>" . mysqli_connect_error());
} else {
    echo "Conectado.<hr>";
}

// Borrar base de datos.
$sql = "drop database if exists basedatost4ac2";
if (mysqli_query($conexion, $sql)) {
    echo "La base de datos se ha eliminado correctamente para prevenir errores <br>
            de cara a una nueva creación o inserción de datos.<hr>";
} else {
    echo "Error al eliminar la base de datos.<hr>" . mysqli_connect_error();
}

// Crear base de datos.
$sql = "create database if not exists basedatost4ac2";
if (mysqli_query($conexion, $sql)) {
    echo "Base de datos creada correctamente.<hr>";
} else {
    echo "Error en la creación de la base de datos.<hr>" . mysqli_connect_error();
}

// Selecciona la base de datos a manipular.
$sql = "use basedatost4ac2";
if (mysqli_query($conexion, $sql)) {
    echo "Base de datos seleccionada correctamente.<hr>";
} else {
    echo "Error al seleccionar la base de datos.<hr>" . mysqli_error($conexion);
}

// Crear tabla en base de datos.
$sql = "create table if not exists noticias (
        id int(6) unsigned auto_increment primary key,
        titulo varchar(100) not null,
        texto varchar(200) not null,
        categoria enum('costas','promociones','ofertas') not null,
        data date not null,
        imaxe varchar(30) null
        )";

if (mysqli_query($conexion, $sql)) {
    echo "Tabla creada correctamente.<hr>";
} else {
    echo "Error al crear la tabla.<hr>" . mysqli_error($conexion);
}

// Insertar datos en la tabla.
$sql = 'insert into noticias 
    (titulo, texto, categoria, data, imaxe) VALUES ("Promoción en Costa Ballena","Con vistas al campo de golf, magníficas calidades, entorno ajardinado con piscina y servicio de vigilancia","costas","2004-2-9","1.jpg"),
    ("Casa reformada en el barrio de la Judería","Dos plantas y ático, 5 habitaciones, patio interios, amplio garaje. Situada en una calle tranquila y a un paso del centro histórico.","promociones","2004-2-7",null),
    ("Apartamentos en el Puerto de Sta María","En la playade la Valdelagrana, en primeria lína de playa. Pisos reformados y completamente amueblados.","costas","2004-2-6", "2.jpg"),
    ("Últimas viviendas junto al río","Apartamentos de 1 y 2 dormitorios, con fantásticas vistas. Excelentes condiciones de financiación.","ofertas","2004-2-5",null), 
    ("Nueva promoción en Nervión","145 viviendas de lujo en urbanización ajardinada situadas en un entorno privilegiado","promociones","2004-2-4",null)';

if (mysqli_query($conexion, $sql)) {
    echo "Datos introducidos correctamente.<br>";
} else {
    echo "Error en la inserción de datos.<br>" . $sql . "<br>" . mysqli_error($conexion);
}
mysqli_close($conexion);
