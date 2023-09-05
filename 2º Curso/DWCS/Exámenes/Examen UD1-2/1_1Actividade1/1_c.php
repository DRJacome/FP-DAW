<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>1_c</title>
</head>

<body>
    <?php
    error_reporting(0);
    echo '<form action="1_c.php" method="post">
            <p>Introduce 698 como valor máximo y 23 como valor mínimo:</p>
            <p>Máximo:</p>
            <input type="number" min="1" max="999" name="maximo"><br>
            <p>Mínimo:</p>
            <input type="number" min="1" max="999" name="minimo"><br>
            <input type="submit" value="Enviar">
        </form>';

    $maximo = $_POST['maximo'];
    $minimo = $_POST['minimo'];

    do {
        echo $maximo . ", ";
        $maximo -= 15;
    } while ($maximo <= $minimo);

    ?>
</body>

</html>