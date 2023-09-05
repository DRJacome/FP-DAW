<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ProcesoCookie</title>
</head>

<body>
    <?php
    if (count($_COOKIE) == 0) {
        echo "Las cookies de sesión han cadudado.<br>";
    } else {
        echo "<p>El valor de las cookies de trabajo es:</p>";
        foreach ($_COOKIE as $clave => $valor) {
            echo "$clave -> $valor<br>";
        }
    }
    ?>
</body>

</html>