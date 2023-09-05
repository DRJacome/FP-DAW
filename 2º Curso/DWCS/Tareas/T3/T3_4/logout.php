<?php
session_start();
echo "<div class=mensaje><h2>Usuario desconectado. Sesión terminada</h2></div>";
session_destroy();
#header('Location: index.php');
?>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Logout</title>
  <link rel="stylesheet" type="text/css" href="./css/index.css">

</head>

<body>
  <div>
    <a class="botonCerrarSesion" href="index.php">Volver al inicio</a>
  </div>
</body>

</html>