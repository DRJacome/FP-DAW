<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>T2_3_Conversor</title>
</head>
<body>
    <h2>Conversor de euros a otras divisas. Introduce la cantidad deseada
        en euros a convertir:</h2>
    <form method="get">
        <p>Ingrese la cantidad en euros: </p>
        <input type="text" name="euros" value="">
        <br><br>

        <?php
        $euros = $_GET["euros"];
        $dolares = $euros * 0.85;
        $pesetas = $euros * 166.386;
        echo $euros, " € equivale(n) a $", $dolares, " o ", $pesetas, " pesetas.";
        ?>
        <br><br><input type="submit" name="boton" value="Convertir">
    </form>
</body>
</html>