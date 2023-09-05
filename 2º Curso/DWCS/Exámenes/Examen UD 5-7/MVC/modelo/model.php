<?php
    $nombreUsuario = "root";
    $passwd = "";
    $conexion = new PDO('mysql:host=localhost;dbname=tiendaFotografia', $nombreUsuario, $passwd);

    $result = $conexion->query('SELECT idProducto, producto, precioProducto, stockUDs FROM productos');
    $usarios = array();

    while ($usuario = $result->fetch()) {
        $usuarios[] = $usuario;
    }
?>