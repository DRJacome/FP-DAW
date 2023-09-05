<?php
session_start();

if (!isset($_SESSION['logueado'])) {
    $_SESSION['logueado'] = false;
}

if (!$_SESSION['logueado']) {
?>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>T3_2 Ac4 Login</title>
        <link rel="stylesheet" type="text/css" href="./css/index.css">
    </head>

    <body>
        <div class="login-box">
            <h2>LOGIN</h2>
            <p>Inicia sesión para acceder</p>
            <form action="indexAc4.php" method="POST">
                <div class="user-box">
                    <input type="text" name="usuario" required="">
                    <label>Usuario</label>
                </div>
                <div class="user-box">
                    <input type="password" name="contrasena" required="">
                    <label>Contraseña</label>
                </div>
                <button type="submit">Enviar</button>
            </form>
        </div>
    </body>

    </html>

<?php
}
if (isset($_POST['usuario'])) {
    if (($_POST['usuario'] == "David") && ($_POST['contrasena'] == "abc123")) {
        $_SESSION['logueado'] = true;
        header("Refresh: 0; url=..\Ac3\indexAc3.php?actividad=04", true, 303);
    } else {
        echo '<span style="color: red">Contraseña incorrecta. Inténtalo de nuevo:</span<br><br>';
        header("Refresh: 0; url=indexAc4.php?actividad=04", true, 303);
    }
}
?>