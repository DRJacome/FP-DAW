<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index T2_5_5</title>
</head>

<body>
    <h3>a) Amosa os primos que hai entre dous números que debes insertar
        por teclado. (Por exemplo entre 34 e 123).<h3>
            <?php
            /*function ej5_a() {
                error_reporting(0);
                $numPrimo1 = $_POST['numPrimo1'];
                $numPrimo2 = $_POST['numPrimo2'];

                if (!isset($numPrimo1) || !isset($numPrimo2)) {
                    echo '<p>Introduce dos números para calcular cúantos primos hay:</p>
                <form action="index_t2_5_5.php" method="post">
                <input type="number" name="numPrimo1"><br><br>
                <input type="number" name="numPrimo2"><br><br>
                <input type="submit" value="Enviar">
                </form>';
                } else {
                    echo "Los números primos entre " . $numPrimo1  . " y " . $numPrimo2 . 
                        " son: " . primos($numPrimo1, $numPrimo2) . ".";
                }
            }

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
            }*/
            include "bibliotecaFunciones.php";
            function ej5_b() {
                error_reporting(0);
                $numPrimo1 = $_POST['numPrimo1'];
                $numPrimo2 = $_POST['numPrimo2'];

                if (!isset($numPrimo1) || !isset($numPrimo2)) {
                    echo '<p>Introduce dos números para calcular cúantos primos hay:</p>
                <form action="index_t2_5_5.php" method="post">
                <input type="number" name="numPrimo1"><br><br>
                <input type="number" name="numPrimo2"><br><br>
                <input type="submit" value="Enviar">
                </form>';
                } else {
                    echo "Los números primos entre " . $numPrimo1  . " y " . $numPrimo2 . 
                        " son: " . primos($numPrimo1, $numPrimo2) . ".";
                }
            }
            
            //ej5_a();
            ej5_b()
            ?>
</body>

</html>