<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>T3_4 Index Login</title>
    <link rel="stylesheet" type="text/css" href="./css/index.css">
</head>

<body>
    <div class="login-box">
        <h2>LOGIN</h2>
        <p>Inicia sesión para acceder</p>
        <form action="login.php" method="POST">
            <div class="user-box">
                <input type="text" name="usuario" required="">
                <label>Usuario</label>
            </div>
            <div class="user-box">
                <input type="password" name="palabra_secreta" required="">
                <label>Contraseña</label>
            </div>
            <button type="submit">Enviar</button>
        </form>
    </div>
</body>

<!-- <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index T3.4</title>
</head>

<body>
    <p>Inicia sesión para acceder:</p>
    <form action="login.php" method="POST">
        <p>Usuario:</p>
        <input type="text" name="usuario" placeholder="Escribe tu nombre de usuario">
        <br>
        <p>Contraseña:</p>
        <input type="password" name="palabra_secreta" placeholder="Contraseña">
        <br><br>
        <input type="submit" value="Iniciar sesión">
    </form>
</body>
 -->

</html>