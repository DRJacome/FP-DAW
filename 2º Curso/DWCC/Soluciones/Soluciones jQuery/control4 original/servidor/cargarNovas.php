<?php
	// Conectamos coa base de datos
	require('conexion.php');

	// Collemos as opcións do menú
   	$consulta = "SELECT * 
				   FROM nova
			   ORDER BY idNova DESC
			      LIMIT ".$_GET['offset'].",".$_GET['limite'];

	$saida = array();
	if ($datos = $conexion->query($consulta)) {   		
		while ($novas = $datos->fetch_object()) {
			$saida[] = $novas;
		}
		$datos->close();
	}
	$conexion->close();
	echo json_encode($saida);
?>