<?php

$error = "";
$resultado = "";
$num1 = "";
$num2 = "";
$num3 = "";


$url = "http://localhost/david/Examen_8_9/calcularMaximoMinimo.php";
$uri = "http://localhost/david/Examen_8_9/";
$cliente = new SoapClient(null, array('location' => $url, 'uri' => $uri));

if (isset($_POST['maximo'])) {
    if (!empty($_POST['num1']) || (!empty($_POST['num2'])) || (!empty($_POST['num3']))) {
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
        $nu32 = $_POST['num3'];
        $resultado = "El número máximo es: " . $cliente->maximo($num1, $num2, $num3);
    } else {
        $error = "<strong>Error:</strong> Debes introducir números en todos los campos.";
    }
}

if (isset($_POST['minimo'])) {
    if (!empty($_POST['num1']) || (!empty($_POST['num2'])) || (!empty($_POST['num3']))) {
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
        $nu32 = $_POST['num3'];
        $resultado = "El número mínimo es: " . $cliente->minimo($num1, $num2, $num3);
    } else {
        $error = "<strong>Error:</strong> Debes introducir números en todos los campos.";
    }
}

?>
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
    <h1>Hallar máximos y mínimos</h1>
    <form action="index.php" method="post">
        <?php
        print "Primer número: ";
        print "<input type='number' name='num1' value='$num1'><br/><br/>";
        print "Segundo número: ";
        print "<input type='number' name='num2' value='$num2'><br/><br/>";
        print "Tercer número: ";
        print "<input type='number' name='num3' value='$num3'><br/><br/>";
        print "<input type='submit' name='maximo' value='maximo'><br/><br/>";
        print "<input type='submit' name='minimo' value='minimo'><br/><br/>";
        print "<p class='error'>$error</p>";
        print "<p style='font-size: 12pt;font-weight: bold; color: #0066CC;'>$resultado</p>";
        ?>
    </form>
</body>

</html>