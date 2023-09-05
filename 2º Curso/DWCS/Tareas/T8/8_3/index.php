<!-- Modificación del progama SOAP para generar un programa de calculadora.-->
<!--Parte PHP. Debe estar encima de todo para que se ejecute antes que la parte HTML-->
<?php
// Declaramos algunas variables inicializadas vacías.
$error = "";
$resultado = "";
$valorA = "";
$valorB = "";
//

// Iniciamos el cliente SOAP y escribimos la dirección donde se encuentra el servicio.
/** Los enlaces a otros archivos se relaizan como si fueran direcciones web,
 * y el servicio SOAP se invoca mediante un objeto que se almacena en una variable cliente.
 */
$url = "http://localhost/david/Tareas/T8/8_3/calculadora.php";
$uri = "http://localhost/david/Tareas/T8/8_3/";
$cliente = new SoapClient(null, array('location' => $url, 'uri' => $uri));
//

// Ejecutamos las siguientes líneas al enviar el formulario.
// Establecemos una condición de if por cada función de la calculadora.
if (isset($_POST['suma'])) {
    // Establecemos los parámetros de envío.
    // Restricción: los campos de entrada de datos no deben estar vacíos.
    if (!empty($_POST['valorA']) || (!empty($_POST['valorB']))) {
        $valorA = $_POST['valorA'];
        $valorB = $_POST['valorB'];
        // Si los parámetros son correctos, llamamos a la función letra de calculadora.php.
        $resultado = "El resultado de la suma es: " . $cliente->suma($valorA, $valorB);
    } else {
        $error = "<strong>Error:</strong> Debes introducir números en ambos campos.";
    }
}

if (isset($_POST['resta'])) {
    if (!empty($_POST['valorA']) || (!empty($_POST['valorB']))) {
        $valorA = $_POST['valorA'];
        $valorB = $_POST['valorB'];
        $resultado = "El resultado de la resta es: " . $cliente->resta($valorA, $valorB);
    } else {
        $error = "<strong>Error:</strong> Debes introducir números en ambos campos.";
    }
}

if (isset($_POST['producto'])) {
    if (!empty($_POST['valorA']) || (!empty($_POST['valorB']))) {
        $valorA = $_POST['valorA'];
        $valorB = $_POST['valorB'];
        $resultado = "El resultado del producto es: " . $cliente->producto($valorA, $valorB);
    } else {
        $error = "<strong>Error:</strong> Debes introducir números en ambos campos.";
    }
}

if (isset($_POST['division'])) {
    if (!empty($_POST['valorA']) || (!empty($_POST['valorB']))) {
        $valorA = $_POST['valorA'];
        $valorB = $_POST['valorB'];
        $resultado = "El resultado de la división es: " . $cliente->division($valorA, $valorB);
    } else {
        $error = "<strong>Error:</strong> Debes introducir números en ambos campos.";
    }
}

?>
<!--Parte HTML-->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/estilos.css" rel="stylesheet" type="text/css">
    <title>Index 8.3</title>
</head>

<body>
    <h1>Calculadora</h1>
    <h2>Servicio Web + PHP + SOAP</h2>
    <form action="index.php" method="post">
        <!--Código PHP que recoge los datos del formulario-->
        <?php
        print "Primer número: ";
        print "<input type='number' name='valorA' value='$valorA'><br/><br/>";
        print "Segundo número: ";
        print "<input type='number' name='valorB' value='$valorB'><br/><br/>";
        print "<input type='submit' name='suma' value='Calcular suma'><br/><br/>";
        print "<input type='submit' name='resta' value='Calcular resta'><br/><br/>";
        print "<input type='submit' name='producto' value='Calcular producto'><br/><br/>";
        print "<input type='submit' name='division' value='Calcular división'><br/><br/>";
        print "<p class='error'>$error</p>";
        print "<p style='font-size: 12pt;font-weight: bold; color: #0066CC;'>$resultado</p>";
        ?>
    </form>
</body>

</html>