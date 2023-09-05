<?php
$usuario_correcto = "David";
$palabra_secreta_correcta = "David123";

$usuario = $_POST['usuario'];
$palabra_secreta = $_POST['palabra_secreta'];

if ($usuario === $usuario_correcto && $palabra_secreta === $palabra_secreta_correcta) {
    session_start();

    $_SESSION['usuario'] = $usuario;
    header('Location: secreta.php');
} else {
    echo "<div class=mensaje><h2>Usuario o contraseña incorrectos<hr/>
    Por favor, vuelva a la pantalla de inicio de sesión e introduzca sus datos correctamente</h2></div>";
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="./css/index.css">

</head>
<body>
    <div>
        <a class="botonCerrarSesion" href="index.php">Volver al inicio</a>
    </div>
    
</body>
</html>