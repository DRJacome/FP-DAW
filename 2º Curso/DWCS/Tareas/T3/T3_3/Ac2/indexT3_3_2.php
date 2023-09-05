<?php
if (!isset($_COOKIE['color'])) {
    setcookie('color', 'blue', time() + 300);
    $color = 'blue';
} else {
    $color = $_COOKIE['color'];
}

if (isset($_POST['color'])) {
    $color = $_POST['color'];
    setcookie('color', $color, time() + 300);
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>indexT3_3_2</title>
</head>
<body>
    <div id="fondo" style="padding: 200px;">
        <p>Elije un color de fondo para la página:</p>
        <form action="indexT3_3_2.php" method="post">
            <input type="color" name="color" value="<?= $color ?>"><br><br>
            <input type="submit" value="Enviar">
        </form>
    </div>
    <script>
        document.getElementById('fondo').style.background = "<?= $color ?>";
    </script>
</body>
</html>