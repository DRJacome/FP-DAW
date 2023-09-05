<?php
	// Conectamos coa base de datos
	require('conexion.php');
	
	// Collemos as categorias
   	$consulta = "SELECT * 
				   FROM artigos
				  WHERE idArtigo =".$_POST['artigo'];

	$saida = '';
	if ($datos = $conexion->query($consulta)) {   		
		$saida = $datos->fetch_object();
		$datos->close();
	}
	$conexion->close();
	echo json_encode($saida);
?>
