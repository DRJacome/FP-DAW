<?php
	// Conectamos coa base de datos
	require('conexion.php');

	// Collemos as opcións do menú
   	$consulta = "SELECT COUNT(*) AS numeroNovas
				   FROM nova";

	$saida = '';
	if ($datos = $conexion->query($consulta)) {   		
		$saida = $datos->fetch_object();
		$datos->close();
	}
	$conexion->close();
	echo json_encode($saida);
?>