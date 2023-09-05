<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>1_a</title>
</head>
<body>
    <?php
    error_reporting(0);
    echo '<form action="1_a.php" method="post">
            <p>Introduce 3 números y tu nombre:</p>
            <input type="number" min="1" max="999" name="a"><br>
            <input type="number" min="1" max="999" name="b"><br>
            <input type="number" min="1" max="999" name="c"><br>
            <input type="text" name="nombre"><br>
            <input type="submit" value="Enviar">
        </form>';

        $a = $_POST['a'];
        $b = $_POST['b'];
        $c = $_POST['c'];
        $nombre = $_POST['nombre'];

        echo "Ola, son " . $nombre . " e acabo de insertar os números "
        . $a . ", " . $b . " e " . $c . ".";
    ?>
</body>
</html>