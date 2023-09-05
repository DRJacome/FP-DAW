<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>t2_5_OrdenarNumeros</title>
</head>

<body>
    <h3>Actividade 1. Escribe un programa no que debes ordenar 10 números de maior a menor:<br>
        a) Ese conxunto de elementos debes insertalos nun array dentro do programa.<br>
        b) Os números debes conseguilos mediante unha petición por pantalla e insertarlos nun array.
    </h3>
    <?php
    error_reporting(0);
    $n = $_POST['n'];
    $contadorNumeros = $_POST['contadorNumeros'];
    $numeroTexto = $_POST['numeroTexto'];

    // Si $n no está definida y es null,
    if (!isset($n)) {
        $contadorNumeros = 0; // $contadorNumeros se iniciará a 0 y
        $numeroTexto = ""; // $numeroTexto se iniciará con string vacío.
    }

    // Si $contadorNumeros es igual a 10,
    if ($contadorNumeros == 10) {
        $numeroTexto = $numeroTexto . "-" . $n; // Se añade el último número leído a la cadena de números.
        $numeroTexto = substr($numeroTexto, 2); // Se quita los espacios que sobren.
        $numero = explode("-", $numeroTexto);   // Se divide el string de números en varios string delimitados por guiones,
                                                // almacenándolo en un array llamado $numero.

        // Coge el array $numero, lo recorre y lo ordena de forma inversa (de mayor a menor).
        // Saca por pantalla el valor de cada posición del array ordenado separado por un espacio.
        rsort($numero);
        foreach ($numero as $num) {
            echo $num . " ";
        }
    }

    // Pide un número y añade el número actual a la cadena.
    if (($contadorNumeros < 10) || (!isset($n))) {
    ?>
        <form action="t2_5_OrdenarNumeros.php" method="post"><br>
            Introduzca 10 números:
            <input type="number" name="n" autofocus>
            <input type="hidden" name="contadorNumeros" value="<?= ++$contadorNumeros ?>">
            <input type="hidden" name="numeroTexto" value="<?= $numeroTexto . "-" . $n ?>">
            <input type="submit" value="OK">
        </form>
    <?php
    }
    ?>
</body>

</html>