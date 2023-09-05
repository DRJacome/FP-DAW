<?php
	session_start();				// Iniciamos sesión
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Comprueba variables</title>
</head>

<body>
<?php 
if (isset($_SESSION['usr'])) {
	echo '<p>Variables de sesión:<br>
		   <ul>
		   <li>usr -> '.$_SESSION['usr'].'</li>
		   <li>clv -> '.$_SESSION['clv'].'</li>
		   </ul>
		   </p>';
} else {
	echo '<p>No se han encontrado las variables de sesión esperadas.</p>';
}
?>
<p>Pulse <a href="inicio.php">aquí</a> para volver a la página de inicio.</p>
</body>
</html>