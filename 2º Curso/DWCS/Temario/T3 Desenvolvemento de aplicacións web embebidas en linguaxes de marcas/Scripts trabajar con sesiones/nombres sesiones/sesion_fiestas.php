<?php
session_name('FIESTAS');		// Indicamos nombre de sesión
session_start();				// Iniciamos sesión
// Creamos variables
$_SESSION['Valencia']='Las Fallas';
$_SESSION['Castellon']='La Magdalena';
$_SESSION['Alicante']='Las Hogueras';
$_SESSION['Murcia']='Semana Santa';
$_SESSION['Almeria']='La Feria';
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Crear variables sesión FIESTAS</title>
</head>

<body>
<p>Se han creado 5 variables en la sesión FIESTAS.</p>
<p>Pulse <a href="inicio.php">aquí</a> para volver a la página de inicio.</p>
</body>
</html>