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

// Selecciona la base de datos a manipular.
$sql = "use frutas";
if (mysqli_query($conexion, $sql)) {
    echo "Base de datos seleccionada correctamente.<br>";
} else {
    echo "Error al seleccionar la base de datos.<br>" . mysqli_error($conexion);
}

// Realizar consulta 1.
$sql = "select * from frutas where cantidade_stock >410";

// Realizar consulta 2.
$sql = "select * from frutas where prezo > 1.00";
?>