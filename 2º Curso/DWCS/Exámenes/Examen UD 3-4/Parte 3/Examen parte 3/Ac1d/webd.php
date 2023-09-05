<?php
session_start();
if (!isset($_SESSION['logueado'])) {
    $_SESSION['logueado'] = false;
}
if (!$_SESSION['logueado']) {
?>
    <p>Inicia sesión para acceder:</p>
    <form action="cookies.php" method="POST">
        <p>Usuario:</p>
        <input type="text" name="user" placeholder="Introduce un nombre de usuario">
        <br>
        <p>Contraseña:</p>
        <input type="password" name="password" placeholder="introduce una contraseña">
        <br><br>
        <input type="submit" value="Enviar">
    </form>
<?php
}
if (isset($_POST['usuario1'])) {
    if (($_POST['user'] == $_POST['user']) && ($_POST['password'] == $_POST['password'])) {
        $_SESSION['logueado'] = true;
        header("Refresh: 0; url=hola.php", true, 303);
    } else {
        echo '<span style="color: red">Contraseña incorrecta. Inténtalo de nuevo:</span<br><br>';
        header("Refresh: 0; url=webd.php", true, 303);
    }
} else if (isset($_POST['usuario2'])) {
    if (($_POST['user'] == $_POST['user']) && ($_POST['password'] == $_POST['password'])) {
        $_SESSION['logueado'] = true;
        header("Refresh: 0; url=hola.php", true, 303);
    } else {
        echo '<span style="color: red">Contraseña incorrecta. Inténtalo de nuevo:</span<br><br>';
        header("Refresh: 0; url=webd.php", true, 303);
    }
} else if (isset($_POST['usuario3'])) {
    if (($_POST['user'] == $_POST['user']) && ($_POST['password'] == $_POST['password'])) {
        $_SESSION['logueado'] = true;
        header("Refresh: 0; url=hola.php", true, 303);
    } else {
        echo '<span style="color: red">Contraseña incorrecta. Inténtalo de nuevo:</span<br><br>';
        header("Refresh: 0; url=webd.php", true, 303);
    }
}
?>