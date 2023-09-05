<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>1_b</title>
</head>

<body>
    <?php
    error_reporting(0);
    echo '<form action="1_b.php" method="post">
            <p>Introduce 3 números y tu nombre:</p>
            <input type="number" min="1" max="999" name="a"><br>
            <input type="number" min="1" max="999" name="b"><br>
            <input type="number" min="1" max="999" name="c"><br>
            <input type="submit" value="Enviar">
        </form>';

    $a = $_POST['a'];
    $b = $_POST['b'];
    $c = $_POST['c'];

    function media($a, $b, $c) {
        $valorMedio = ($a + $b + $c) / 3;
        return $valorMedio;
    }

    /*function maximoMinimo($a, $b, $c) {
        $maximo = 0;
        $minimo = 0;
        if ($a > $b && $a > $c) {
            $maximo = $a;
            $minimo = $c;
        } elseif ($b > $a && $a > $c) {
            $maximo = $b;
            $minimo = $c;
        } else {
            $maximo = $c;
            $minimo = $a;
        }
        return $maximo; $minimo;
    }*/

    function producto($a, $b, $c)
    {
        $producto = $a * $b * $c;
        return $producto;
    }

    echo "Media de los 3 números: " . media($a, $b, $c) . "<br>" .
        "Producto de los 3 números: " . producto($a, $b, $c) . "<br>";
    ?>
</body>

</html>