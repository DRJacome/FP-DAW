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
    function esCapicua($numCap) {
        if ($numCap == strrev($numCap)) {
            return true;
        }
        return false;
    }

    function esPrimo($numPrimo) {
        if ($numPrimo % 2 == 0) {
            return false;
        }
        for ($i = 3; $i * $i <= $numPrimo; $i += 2) {
            if ($numPrimo % $i == 0) {
                return false;
            }
        }
        return true;
    }

    function contadorNumeros($numero) {
       return strlen($numero);
    }

    function unirNumeros($UnionNum1, $UnionNum2) {
        return $UnionNum1 . $UnionNum2;
    }
    ?>

</body>

</html>