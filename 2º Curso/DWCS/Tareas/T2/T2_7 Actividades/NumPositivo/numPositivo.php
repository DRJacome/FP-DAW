<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NumPositivo</title>
</head>

<body>
	<h3>Actividade 1. Elabora un programa en php no que en base a un número
        que lle tes que meter por teclado, <br> se é positivo ou negativo.</h3>
    
    	<form action="numPositivo.php" method="post">
        <p>Introduce un número:</p>
        <input type="text" name="numPos"><br><br>
        <input type="submit" value="Enviar">
    </form>
    <?php
    $num = $_POST['numPos'];
    if ($num < 0) {
        echo $num . " es negativo.";
    } else {
        echo $num . " es positivo";
    }
    ?>
    <br>
    <a href="numPositivo.php">Volver</a>
</body>

</html>