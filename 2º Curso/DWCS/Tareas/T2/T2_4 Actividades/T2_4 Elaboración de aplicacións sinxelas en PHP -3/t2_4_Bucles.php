<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>t2_4_Bucles</title>
</head>

<body>
    <?php
    $numInicio = $_POST['numBucle1'];
    $numFinal = $_POST['numBucle2'];

    echo "Bucle for:<br>";
    for ($i = $numInicio; $i >= $numFinal; $i -= 12) {
        echo "$i ";
    }
    
    $numInicio = $_POST['numBucle1'];
    $numFinal = $_POST['numBucle2'];

    echo "<br><br>Bucle while:<br>";
    while ($numInicio >= $numFinal) {
        echo "$numInicio ";
        $numInicio -= 12;
    } 

    $numInicio = $_POST['numBucle1'];
    $numFinal = $_POST['numBucle2'];

    echo "<br><br>Bucle do while:<br>";
    do {
        echo "$numInicio ";
        $numInicio -= 12;
    } while ($numInicio >= $numFinal);
    ?>

</body>

</html>