<?php
if (!isset($_COOKIE['usuario1'])) {
    setcookie('usuario1', $_POST['user'], time() + 14400, "cookies.php");
    setcookie('password1', $_POST['password'], time() + 14400, "cookies.php");
}
if (isset($_COOKIE['usuario2']) && !isset($_COOKIE['usuario2'])) {
    setcookie('usuario2', $_POST['user'], time() + 14400, "cookies.php");
    setcookie('password2', $_POST['password'], time() + 14400, "cookies.php");
}
if (isset($_COOKIE['usuario3']) && isset($_COOKIE['usuario2']) && !isset($_COOKIE['usuario3'])) {
    setcookie('usuario3', $_POST['user'], time() + 14400, "cookies.php");
    setcookie('password3', $_POST['password'], time() + 14400, "cookies.php");
}
?>
<a href="webd.php"></a>