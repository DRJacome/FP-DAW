<?php
if (isset($_POST['usuario'])) {
    $user = $_POST['usuario'];
    setcookie('usuario', $user, time() + 300);
} else if (isset($_COOKIE['usuario'])) {
    $user = $_COOKIE['usuario'];
}

if (isset($_POST['borrarCookie'])) {
    setcookie('usuario', null, -1);
    unset($user);
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CookieBienvenida</title>
</head>

<body>
    <?php
    if (!isset($user)) {
        echo "No has introducido un nombre de usuario.<br>";
        echo "Utiliza el siguiente formulario para hacerlo.<br>";
    } else {
        echo "<h2>Bienvenido, " . $user . ".</h2><br>";
        echo "Puedes introducir otro usuario si lo deseas.";
    }
    ?>
    <form action="indexT3_3_1.php" method="POST"><br>
        <label><b>Nombre de usuario:</b></label><br><br>
        <input type="text" name="usuario" autofocus><br><br>
        <input type="submit" value="Enviar">
    </form>
    <hr>

    <form action="indexT3_3_1.php" method="POST">
        <input type="hidden" name="borrarCookie" value="si">
        <input type="submit" value="Borrar usuario">
    </form>
</body>

</html>