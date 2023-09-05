<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sumar</title>
</head>
<body>
    <?php
    $numero1 = $_POST['num1'];
    $numero2 = $_POST['num2'];
    $numero3 = $_POST['num3'];
    $numero4 = $_POST['num4'];

    $suma = $numero1 + $numero2 + $numero3 + $numero4;
    echo "La suma de " . $numero1 .
        ", " . $numero2 .
        ", " . $numero3 .
        " y " . $numero4 .
        " es: " . $suma . ".";
    ?>
    <br><br><a href="index.php">Volver al inicio</a>
</body>
</html>