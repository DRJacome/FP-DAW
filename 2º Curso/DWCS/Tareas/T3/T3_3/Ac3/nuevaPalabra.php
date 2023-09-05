<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Nueva palabra</title>
</head>

<body>
  <form action="index.php" method="post">
    <input type="hidden" name="tarefa" value="modificarDiccionario">
    Español: <input type="text" name="espanol" autofocus=""><br>
    Inglés: <input type="text" name="ingles"><br>
    <input type="submit" name="accion" value="Introducir nueva palabra">
  </form>
  <br><br>
</body>

</html>