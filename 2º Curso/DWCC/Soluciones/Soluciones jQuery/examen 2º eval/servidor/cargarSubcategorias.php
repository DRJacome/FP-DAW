<?php
	// Conectamos coa base de datos
	require('conexion.php');
	
	// Collemos as categorias
   	$consulta = "SELECT DISTINCT tipo 
				   FROM artigos
				  WHERE idCategoria =".$_GET['categoria'];

	$saida = array();
	if ($datos = $conexion->query($consulta)) {   		
		while ($categoria = $datos->fetch_object()) {
			$saida[] = $categoria;
		}
		$datos->close();
	}
	$conexion->close();
	echo json_encode($saida);
?>
