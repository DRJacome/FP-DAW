<?php
if (!isset($_COOKIE['usuario'])) {
    setcookie('usuario', $_POST['user'], time() + 36000, "crearCookie.php");
    setcookie('password', $_POST['password'], time() + 36000, "crearCookie.php");
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CrearCookie</title>
</head>

<body>
    <p><a href="procesoCookie.php">Proceso de cookies</a></p>
</body>

</html>