<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>T2_4_Positivo</title>
</head>

<body>
    <?php
    $num = $_POST['numPos'];
    if ($num < 0) {
        echo $num . " es negativo.";
    } else {
        echo $num . " es positivo";
    }
    ?>
    <br>
    <a href="index_t2_4.html">Volver</a>
</body>

</html>