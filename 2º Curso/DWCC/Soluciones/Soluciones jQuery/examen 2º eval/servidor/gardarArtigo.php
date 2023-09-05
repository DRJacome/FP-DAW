<?php
	// Conectamos coa base de datos
	require('conexion.php');
	
	// Actualizamos se existe xa o produto no carro ou creámolo se non existe
   	$consulta = "SELECT *
				   FROM carro 
				  WHERE idArtigo =".$_POST['artigo'];

	$saida = '';
	if ($datos = $conexion->query($consulta)) {
		if ($conexion->affected_rows == 1) { 
			$artigo = $datos->fetch_assoc();
			$consulta = "UPDATE carro
							SET cantidade = cantidade + 1, prezo = prezo + ".$artigo['prezo']." 
						  WHERE idArtigo=".$_POST['artigo'];
			$datos->close();
			if ($datos = $conexion->query($consulta)) {   		
				if ($conexion->affected_rows == 1) { $saida = 'OK'; } else { $saida = 'ERRO: UPDATE'; }
			}	
		} else { 
			$consulta = "SELECT *
						   FROM artigos 
						  WHERE idArtigo =".$_POST['artigo'];
			$datos->close();						  
			if ($datos = $conexion->query($consulta)) {   		
				if ($conexion->affected_rows == 1) { 
					$artigo = $datos->fetch_assoc();
					$consulta = "INSERT INTO carro (idArtigo,cantidade,prezo)
								 VALUES (".$_POST['artigo'].",'1',".$artigo['prezo'].")";
					$datos->close();			 
					if ($datos = $conexion->query($consulta)) {   		
						if ($conexion->affected_rows == 1) { $saida = 'OK'; } else { $saida = 'ERRO: INSERT'; }
					}	
				} else { $saida = 'ERRO: SELECT'; }
			}
		}
	}	
	$conexion->close();
	echo json_encode($saida);
?>
