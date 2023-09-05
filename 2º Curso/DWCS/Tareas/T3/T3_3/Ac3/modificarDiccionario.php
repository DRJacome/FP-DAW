<?php
error_reporting(0);
if ($_POST['accion'] == "Alta") {
  $_SESSION['diccionario'][$_POST['espanol']] = $_POST['ingles'];
}

if ($_POST['accion'] == "Modificar") {
  $_SESSION['diccionario'][$_POST['espanol']] = $_POST['ingles'];
}

if ($_POST['accion'] == "Eliminar") {
  unset($_SESSION['diccionario'][$_POST['espanol']]);
  setcookie($_POST['espanol'], NULL, -1);
}

$diccionario = $_SESSION['diccionario'];

echo "<table>";
foreach ($diccionario as $espanol => $ingles) {
?>
  <tr>
    <td><?= $espanol ?></td>
    <td><?= $ingles ?></td>
    <td>
      <form action="index.php" method="post">
        <input type="hidden" name="tarefa" value="modificarDiccionario">
        <input type="hidden" name="espanol" value="<?= $espanol ?>">
        <input type="submit" name="accion" value="Eliminar">
      </form>
    </td>
    <td>
      <form action="index.php" method="post">
        <input type="hidden" name="tarefa" value="cambiarPalabras">
        <input type="hidden" name="espanol" value="<?= $espanol ?>">
        <input type="submit" value="Modificar">
      </form>
    </td>
  </tr>
<?php
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Modificar Diccionario</title>
</head>
<body>
  </table>
  <hr>
  <table>
    <tr>
      <td>
        <form action="index.php" method="post">
          <input type="hidden" name="tarefa" value="nuevaPalabra">
          <input type="submit" value="Añadir nueva&#x00A;palabra">
        </form>
      </td>
      <td>
        <form action="index.php" method="post">
          <input type="hidden" name="tarefa" value="t3_3_3">
          <input type="hidden" name="accion" value="borrarCookies">
          <input type="submit" value="Borrar todo e&#x00A;inicializar a diccionario&#x00A;por defecto">
        </form>
      </td>
      <td>
        <form action="index.php" method="post">
          <input type="hidden" name="tarefa" value="t3_3_3">
          <input type="hidden" name="accion" value="actualizarCookies">
          <input type="submit" value="Guardar cambios&#x00A;y regresar a&#x00A;la pág. principal">
        </form>
      </td>
    </tr>
  </table>
</body>
</html>