<?php
    $nombreUsuario = "root";
    $passwd = "";
    $conexion = new PDO('mysql:host=localhost;dbname=basedatost5_4_3', $nombreUsuario, $passwd);

    $result = $conexion->query('SELECT dni, nombre, contrasena FROM usuarios');
    $usarios = array();

    while ($usuario = $result->fetch()) {
        $usuarios[] = $usuario;
    }
?>