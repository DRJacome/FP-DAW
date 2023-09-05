<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Biblioteca Funciones</title>
</head>

<body>

    <?php
    function primos($numPrimo1, $numPrimo2) {
        $primos = " ";
        if ($numPrimo1 < $numPrimo2) {
            for ($i = $numPrimo1; $i <= $numPrimo2; $i++) {
                if (esPrimo($i)) {
                    $primos .= $i . " ";
                }
            }
        } else {
            for ($i = $numPrimo2; $i <= $numPrimo1; $i++) {
                if (esPrimo($i)) {
                    $primos .= $i . " ";
                }
            }
        }
        return $primos;
    }

    function esPrimo($numero) {
        $esPrimo = true;
        for ($i = 2; $i < $numero; $i++) {
            if ($numero % $i == 0) {
                $esPrimo = false;
                break;
            }
        }
        if (($numero == 0) || ($numero == 1)) {
            $esPrimo = false;
        }
        return $esPrimo;
    }
    ?>

</body>

</html>