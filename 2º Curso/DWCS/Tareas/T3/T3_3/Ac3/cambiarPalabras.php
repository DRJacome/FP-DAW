<h3>Cambiar palabras</h3>
<hr>
<?php
$espanol = $_POST['espanol'];
$ingles = $_SESSION['diccionario'][$espanol];
?>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cambiar palabras</title>
</head>

<body>
  <form action="index.php" method="post">
    <input type="hidden" name="tarefa" value="modificarDiccionario">
    Español: <input type="text" name="espanol" value="<?= $espanol ?>" readonly="readonly"><br>
    Inglés: <input type="text" name="ingles" value="<?= $ingles ?>" autofocus=""><br>
    <input type="submit" name="accion" value="Cambiar">
  </form>
  <br><br>
</body>

</html>