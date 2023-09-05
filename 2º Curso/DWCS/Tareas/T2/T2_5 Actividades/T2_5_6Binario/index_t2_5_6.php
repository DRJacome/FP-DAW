<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index_t2_5_6</title>
</head>

<body>
    <?php
    include "bibliotecaBinaria.php";

    function ej6() {
        echo "<h3>Escribe un programa que permita pasar de binario a decimal.<br>
            Ejemplo: 001100010010011110100001101101110011</h3>";

        error_reporting(0);
        $numero = $_POST['numero'];
        
        if (!isset($numero)) {
         echo '<p>Introduce un número:</p>
            <form action="index_t2_5_6.php" method="post">
            <input type="number" name="numero" min="0" autofocus><br>
            <input type="submit" value="Aceptar">
            </form>';
        } else {
            echo "Número binario: $numero<br>";
            
            $decimal = 0;
            $digitos = binario($numero);
            $numero = strrev($numero);
            for ($i = 0; $i < $digitos; $i++) {
                if ($numero[$i] == 1) {
                    $decimal += pow(2, $i);
                }
            }
            echo "Conversión a número decimal: $decimal";
        }
    }

    ej6();
    ?>
</body>

</html>