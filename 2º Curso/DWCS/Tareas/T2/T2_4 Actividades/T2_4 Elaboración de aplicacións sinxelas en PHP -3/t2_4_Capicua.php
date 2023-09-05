<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>t2_4_Capicua</title>
</head>

<body>
    <?php
    $numCap = $_POST['numCapicua'];
    $esCapicua = false;

    if ($numCap < 10) { //0 a 9
        $esCapicua = true;
    }

    if ($numCap >= 10 && $numCap < 100) { // 10 a 99
        if (floor(($numCap / 10)) == ($numCap % 10)) {
            $esCapicua = true;
        }
    }
    if (($numCap >= 100) && ($numCap < 1000)) { // 100 a 999
        if (floor($numCap / 100) == ($numCap % 10)) {
            $esCapicua = true;
        }
    }
    if (($numCap >= 1000) && ($numCap < 10000)) { // 1000 a 9999
        if ((floor($numCap / 1000) == ($numCap % 10)) && ((floor($numCap / 100) % 10) == (floor($numCap / 10) % 10))) {
            $esCapicua = true;
        }
    }
    if ($numCap >= 10000) { // 1000 a 99999
        if ((floor($numCap / 10000) == ($numCap % 10)) && (((floor($numCap / 1000) % 10)) == (floor($numCap / 10) % 10))) {
            $esCapicua = true;
        }
    }

    if ($esCapicua) {
        echo "El número " . $numCap . " es capicúa.";
    } else {
        echo "El número " . $numCap . " no es capicúa.";
    }
    ?>
    <br>
    <button type="button"><a href="index_t2_4.html">Volver</a></button>
</body>

</html>