<?php
if (!isset($_COOKIE['usuario1'])) {
    setcookie('usuario1', $_POST['user'], time() + 3600, "cookies.php");
    setcookie('password1', $_POST['password'], time() + 3600, "cookies.php");
}
if (isset($_COOKIE['usuario1']) && !isset($_COOKIE['usuario2'])) {
    setcookie('usuario2', $_POST['user'], time() + 3600, "cookies.php");
    setcookie('password2', $_POST['password'], time() + 3600, "cookies.php");
}
