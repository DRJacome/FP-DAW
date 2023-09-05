<?php
	$servidor='localhost';
	$usuario='root';
	$contrasinal='';
	$baseDatos='clasificacion';

	// Creamos a conexión
	$conexion = new mysqli($servidor, $usuario, $contrasinal, $baseDatos);
	$conexion->query("SET NAMES 'utf8'");
?>
