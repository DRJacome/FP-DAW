<?php
session_start();				// Iniciamos sesión
$_SESSION['usr']='Luis';		// Creamos variable de sesión
$_SESSION['clv']='2222';		// Creamos variable de sesión
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Crear variables</title>
</head>

<body>
<p>Se han creado las variables de sesión usr y clv.</p>
<p>Pulse <a href="inicio.php">aquí</a> para volver a la página de inicio.</p>
</body>
</html>