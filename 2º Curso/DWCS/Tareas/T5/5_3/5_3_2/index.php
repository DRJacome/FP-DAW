<?php
// Iniciamos una sesión.
session_start();

// Incluímos la clase Dado.
include_once "dado.php";

// Creamos 5 dados serializados.
if (!isset($_SESSION["misDados"])) {
    $_SESSION["misDados"] = serialize(array(new Dado(), new Dado(), new Dado(), new Dado(), new Dado()));
}

if (!isset($_SESSION["tiradasTotales"])) {
    $_SESSION["tiradasTotales"] = 0;
}

$misDados = unserialize($_SESSION["misDados"]);
Dado::setTiradasTotales($_SESSION["tiradasTotales"]);
?>

<!-- HTML con la visualización del resultado por pantalla.-->
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tirada de dados</title>
</head>

<body>
    <?php
    // Llamamos a los métodos para lanzar y detallar 
    // el resultado de la tirada de cada dado.
    echo "Resultado de esta tirada de dados: ";
    foreach ($misDados as $dado) {
        $dado->tira();
        echo ($dado->caraDado()) . " ";
    }

    /* El operador de resolución de ámbito (::) es un tiken que permite acceder a elementos estáticos, constantes, 
    * y sobreescribir ropiedades o métodos de una clase. 
    */
    echo "<br>Tiradas de dados totales: " . (Dado::getTiradasTotales());
    echo "<br>Tiradas de cubilete: " . (Dado::getTiradasTotales() / 5);

    $_SESSION["misDados"] = serialize($misDados);
    $_SESSION["tiradasTotales"] = Dado::getTiradasTotales();
    ?>
</body>

</html>