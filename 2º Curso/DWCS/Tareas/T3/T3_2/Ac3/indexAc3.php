<?php
session_start();
?>
<p>Introduce números para calcular la media de todos ellos.
    El programa termina cuando se introduce un número negativo.</p>
<?php
error_reporting(0);
$numero = $_POST['numero'];
if (!isset($numero) || ($numero > 0)) {
    $_SESSION['total'] += $numero;
    $_SESSION['contador']++;
?>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>indexAc3</title>
    </head>
    <body>
        <form action="indexAc3.php" method="POST">
            <label>Número: </label>
            <input type="number" name="numero" autofocus><br><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
    </html>
<?php
} else {
?>
    <p>La media de los números introducidos es
        <?php echo $_SESSION['total'] / ($_SESSION['contador'] - 1) . "."; ?></p>
<?php
    session_destroy();
}
?>