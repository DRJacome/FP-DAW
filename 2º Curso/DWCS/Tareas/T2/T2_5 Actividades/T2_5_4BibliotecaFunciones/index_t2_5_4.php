<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index T2_5 Biblioteca Funciones</title>
</head>

<body>
    <?php
    include "bibliotecaFunciones.php";
    function ej4_a() {
        echo '<h3>Actividade 4. Crea unha biblioteca de funcións matemáticas que conteña as seguintes funcións:<br>
          a) esCapicua: Devolve verdadeiro se o nº que se pasa como parámetro é capicúa e falso en caso contrario <br>
          (por exemplo: 232 que se le de esquerda a dereita e viceversa, obtendo o mesmo nº).</h3>';

        error_reporting(0);
        $numCap = $_POST['numCap'];

        if (!isset($numCap)) {

            echo '<p>Introduce un número:</p>
            <form action="index_t2_5_4.php" method="post">
            <input type="number" min="0" max="99999" name="numCap"><br>
            <input type="submit" value="Enviar">
            </form>';
        } else {
            //var_dump($numCap);
            if (esCapicua($numCap)) {
                echo "El número " . $numCap . " es capicúa.";
            } else {
                echo "El número " . $numCap . " no es capicúa.";
            }
        }
    }

    function ej4_b() {
        echo "<h3>b) esPrimo: Devolve verdadeiro se o número que se pasa como parámetro é primo 
        e falso en caso contrario (por exemplo: 23 é un número primo, pero 22 non).<h3>";

        error_reporting(0);
        $numPrimo = $_POST['numPrimo'];

        if (!isset($numPrimo)) {
            echo '<p<Introduce un número:</p>
                    <form action="index_t2_5_4.php" method="post">
                    <input type="number" name="numPrimo"><br>
                    <input type="submit" value="Enviar">
                    </form>';
        } else {
            //var_dump($numPrimo);
            if (esPrimo($numPrimo)) {
                echo "El número " . $numPrimo . " es primo.";
            } else {
                echo "El número " . $numPrimo . " no es primo.";
            }
        }
    }

    function ej4_c() {
        echo "<h3>c) Díxitos: Conta o nº de díxitos dun número enteiro 
            (por exemplo: o número de díxitos  de 2134 é 4).</h3>";

        error_reporting(0);
        $numeroConteo = $_POST['numeroConteo'];

        if (!isset($numeroConteo)) {
            echo '<p<Introduce un número:</p>
                    <form action="index_t2_5_4.php" method="post">
                    <input type="text" name="numeroConteo"><br>
                    <input type="submit" value="Enviar">
                    </form>';
        } else {
            //var_dump($numeroConteo);
            echo "El número " . $numeroConteo . " se compone " .
                contadorNumeros($numeroConteo) . " cifras.";
        }
    }

    function ej4_d() {
        echo "<h3>d) juntaNumeros: Pega dous números para formar un 
        (por exemplo: 12 e 432 debería devolver o 12432).</h3>";
        
        error_reporting(0);
        $UnionNum1 = $_POST['UnionNum1'];
        $UnionNum2 = $_POST['UnionNum2'];

        if (!isset($UnionNum1) || !isset($UnionNum2)) {
            echo '<p>Introduce dos números para unirlos.<br> Número 1:</p>
                    <form action="index_t2_5_4.php" method="post">
                    <input type="text" name="UnionNum1"><br>
                    <p>Número 2:</p>
                    <input type="text" name="UnionNum2"><br>
                    <input type="submit" value="Enviar">
                    </form>';
        } else {
            echo "Resultado: " . unirNumeros($UnionNum1, $UnionNum2);
        }
    }

    ej4_a();
    //ej4_b();
    //ej4_c();
    //ej4_d();
    ?>
</body>

</html>