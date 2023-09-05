<?php
session_start();

if (isset($_SESSION['visitas'])) {
    $_SESSION['visitas']++;
} else {
    $_SESSION['visitas']=1;
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index T3.1.2</title>
</head>
<body>
    <?php
    echo "Visitas: " . $_SESSION['visitas'] . ".";
    ?>
</body>
</html>