<h1>Quiz de palabras del diccionario</h1>
<?php
error_reporting(0);
if ($_POST['accion'] == "actualizarCookie") {
    foreach ($_SESSION['diccionario'] as $espanol => $ingles) {
        setcookie($espanol, $ingles, time() + 300);
    }
}
foreach ($_COOKIE as $espanol => $ingles) {
    if ($espanol != "PHPSESSID") {
        $_SESSION['diccionario'][$espanol] = $ingles;
    }
}
if ($_POST['accion'] == "borrarCookies") {
    foreach ($_SESSION['diccionario'] as $espanol) {
        setcookie($espanol, NULL, -1);
    }
    unset($_SESSION['diccionario']);
}
if (!isset($_SESSION['diccionario'])) {
    $_SESSION['diccionario'] = array(
        "ordenador" => "computer", "gato" => "cat", "rojo" => "red",
        "árbol" => "tree", "pingüino" => "penguin", "sol" => "sun",
        "agua" => "water", "viento" => "wind", "siesta" => "nap",
        "arriba" => "up", "ratón" => "mouse", "estadio" => "arena",
        "calumnia" => "aspersion", "aguacate" => "avocado",
        "cuerpo" => "body", "concurso" => "contest", "cena" => "dinner",
        "salida" => "exit", "lenteja" => "lentil", "cacerola" => "pan",
        "pastel" => "pie", "membrillo" => "quince"
    );
}
$diccionario = $_SESSION['diccionario'];
if (!isset($_POST['espanol'])) {
    echo "Introduce la traducción de cada palabra al inglés:<br><br>";

    foreach ($diccionario as $clave => $valor) {
        $palabraEsp[] = $clave;
    }

    $contadorPalabras = 0;
    $espanol = array();

    do {
        $palabra = $palabraEsp[rand(0, count($palabraEsp) - 1)];

        if (!in_array($palabra, $espanol)) {
            $espanol[] = $palabra;
            $contadorPalabras++;
        }
    } while ($contadorPalabras < 5);

    echo '<form action="index.php" method="post">';
    echo '<input type="hidden" name="tarefa" value="t3_3_3">';
    for ($i = 0; $i < 5; $i++) {
        echo $espanol[$i] . " ";
        echo '<input type="hidden" name="espanol[' . $i . ']" value="' . $espanol[$i] . '">';
        echo '<input type="text" name="ingles[' . $i . ']" ><br>';
    }
    echo '<input type="submit" value="Aceptar">';
    echo '</form>';
} else {
    $espanol = $_POST['espanol'];
    $ingles = $_POST['ingles'];

    for ($i = 0; $i < 5; $i++) {
        echo $espanol[$i] . ": " . $ingles[$i];
        if ($diccionario[$espanol[$i]] == $ingles[$i]) {
          echo " - <b>Correcto</b>.<br>";
        } else {
          echo " - <b>Incorrecto</b>; la respuesta correcta es " . $diccionario[$espanol[$i]] . ".<br>";
        }
    }
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index.T3_3_3</title>
</head>

<body>
    <hr>
    <form action="index.php" method="post">
        <input type="hidden" name="tarefa" value="t3_3_3">
        <input type="submit" value="Volver">
    </form>
    <hr>
    <form action="index.php" method="post">
        <input type="hidden" name="tarefa" value="modificarDiccionario">
        <input type="submit" value="modificar palabra">
    </form>
</body>

</html>