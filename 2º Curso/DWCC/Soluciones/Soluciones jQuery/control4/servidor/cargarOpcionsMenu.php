<?php
	// Conectamos coa base de datos
	require('conexion.php');

	// Collemos as opcións do menú
   	$consulta = "SELECT * 
				   FROM menu";

	$saida = array();
	if ($datos = $conexion->query($consulta)) {   		
		while ($opcions = $datos->fetch_object()) {
			$saida[] = $opcions;
		}
		$datos->close();
	}
	$conexion->close();
	echo json_encode($saida);
?>