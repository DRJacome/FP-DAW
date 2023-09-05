<?php
function cierra_sesion() {
	// Destruimos la cookie de sesión si existe
   if(isset($_COOKIE[session_name()])) {
      setcookie(session_name(),'',-4200,'/');
   }
   session_unset();	// Destruimos las variables de sesión
   session_destroy();	// Destruimos finalmente la información de la sesión
}

session_start();	// Iniciamos sesión

if(count($_SESSION)>0)  {
	cierra_sesion();	// Cerramos la sesión y destruimos los datos
	$cerrada=true;
}

?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Destruir variables</title>
</head>

<body>
<?php
if(isset($cerrada)) {
	echo '<p>Se ha cerrado la sesión y se han destruido los datos.</p>';
} else {
	echo '<p>Todavía no se han creado las variables de sesión.</p>';	
}
?>
<p>Pulse <a href="inicio.php">aquí</a> para volver a la página de inicio.</p>
</body>
</html>
