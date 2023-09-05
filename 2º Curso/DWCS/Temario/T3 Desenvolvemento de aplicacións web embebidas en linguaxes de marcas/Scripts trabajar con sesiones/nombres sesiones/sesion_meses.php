<?php
session_name('MESES');			// Indicamos nombre de sesión
session_start();				// Iniciamos sesión
// Creamos variables
$_SESSION['enero']=31;		
$_SESSION['febrero']=28;
$_SESSION['marzo']=31;
$_SESSION['abril']=30;
$_SESSION['mayo']=30;
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Crear variables sesión MESES</title>
</head>

<body>
<p>Se han creado 5 variables en la sesión MESES.</p>
<p>Pulse <a href="inicio.php">aquí</a> para volver a la página de inicio.</p>
</body>
</html>