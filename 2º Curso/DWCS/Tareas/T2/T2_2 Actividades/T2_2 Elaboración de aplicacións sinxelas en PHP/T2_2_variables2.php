<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>T2_2_variables2</title>
</head>

<body>
    <h2>Calcular la superficie de un círculo.<br/>Introduce el radio en centímetros:</h2>
    <form action="T2_2_variables2.php" method="get">
        <input type="text" name="radio"><br>
        <input type="submit" value="Calcular">
    </form>
    <?php
    $radio = $_GET['radio'];
    $PI = 3.1416;
    echo "La superficie con radio $radio es: ", $PI * $radio * $radio, " cm².";
    ?>
</body>

</html>