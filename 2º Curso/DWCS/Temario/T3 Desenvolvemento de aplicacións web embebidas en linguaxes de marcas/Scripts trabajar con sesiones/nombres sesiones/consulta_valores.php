<?php
session_name($_GET['s']);		// Indicamos nombre de sesión
session_start();				// Iniciamos sesión
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Consultar variables sesión <?php echo $_GET['s'];?></title>
</head>

<body>
<p>Variables creadas en la sesión <?php echo $_GET['s'];?></p>
<ul>
<?php
echo '<p>Se han detectado ',count($_SESSION),' variables de sesión.</p>';
foreach($_SESSION as $clave => $valor) {
	echo '<li>',$clave,'->',$valor,'</li>';
}
?>
</ul>
<p>Pulse <a href="inicio.php">aquí</a> para volver a la página de inicio.</p>
</body>
</html>