<?php
session_start();

if (empty($_SESSION['usuario'])) {
    header('Location: index.php');
    exit();
}
echo "<div class=mensaje><h2>Usuario y contraseña correctos. "
    . $_SESSION['usuario'] . ", tienes acceso al sistema.</h2></div>";
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Acceso concedido</title>
    <link rel="stylesheet" type="text/css" href="./css/index.css" />
</head>

<body>
    <div class="login-box">
        <p>
            Este mensaje de prueba aparecerá por pantalla si el usuario
            ha iniciado sesión correctamente y está dentro del sistema. Al
            cerrar sesión se volverá a la pantalla de inicio.
        </p>
    </div>
</body>

</html>

<a class="botonCerrarSesion" href="logout.php">Cerrar sesión</a>