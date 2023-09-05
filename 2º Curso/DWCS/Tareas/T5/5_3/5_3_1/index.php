<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index T5_3</title>
</head>
<body>
    <?php

    include_once "gato.php";
    include_once "perro.php";
    include_once "canario.php";

    $gato = new Gato("hembra","siamés");
    $perro = new Perro("macho", "palleiro");
    $canario = new Canario ("macho","amarillo"); 

    echo "<hr>Gato.<br> " . $gato . "<br>";
    echo "Perro.<br> " . $perro . "<br>";
    echo "Canario.<br> " . $canario . "<br><hr>";

    echo "Soy un gato.<br>";
    echo $gato -> ronronear() . "<br>";
    echo $gato -> cazar() . "<br>";
    echo $gato -> comer("pescado") . "<br>";

    echo "<hr>Soy un perro.<br>";
    echo $perro -> rascarse() . "<br>";
    echo $perro -> ladrar() . "<br>";
    echo $perro -> cazar() . "<br>";
    echo $perro -> cuidarCrias() . "<br>";

    echo "Soy un canario.<br>";
    echo $canario -> asearse() . "<br>";
    echo $canario -> volar() . "<br>";
    ?>
</body>
</html>