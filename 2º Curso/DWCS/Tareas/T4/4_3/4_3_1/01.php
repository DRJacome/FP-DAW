<h3 class="text-center">Mantemiento de clientes</h3>
<?php
error_reporting(0);
///////////////////// Conexión a base de datos ////////////////////////////
$conexion = mysqli_connect("localhost", "root", "");
mysqli_select_db($conexion, "banco");

////////Manejo de datos (opciones insertar, actualizar, eliminar)/////////
if ($_POST['accion'] == "Nuevo cliente") {
  $inserta = "INSERT INTO cliente VALUES (\"$_POST[dni]\", \"$_POST[nombre]\", \"$_POST[direccion]\", \"$_POST[telefono]\")";
  mysqli_query($conexion, $inserta);
}

if ($_POST['accion'] == "Modificar") {
  $modifica = "UPDATE cliente SET nombre=\"$_POST[nombre]\", direccion=\"$_POST[direccion]\", telefono=\"$_POST[telefono]\" WHERE dni=\"$_POST[dni]\"";
  mysqli_query($conexion, $modifica);
}

if ($_POST['accion'] == "Eliminar") {
  $borra = "DELETE FROM cliente WHERE dni=\"$_POST[dni]\"";
  mysqli_query($conexion, $borra);
}

/////////////////////////// Consulta de tabla /////////////////////////////
$consulta = mysqli_query($conexion, "SELECT dni, nombre, direccion, telefono FROM cliente");
?>
<!-- /////////////////// Dibujo de tabla por pantalla //////////////////// -->
<table class="table table-striped">
  <tr>
    <th>DNI</th>
    <th>Nombre</th>
    <th>Dirección</th>
    <th>Teléfono</th>
    <th></th>
    <th></th>
  </tr>
  <?php
  while ($registro = mysqli_fetch_array($consulta)) {
  ?>
  <!--/////////////////// Relleno de campos de tabla ///////////////////// -->
    <tr>
      <td><?= $registro['dni'] ?></td>
      <td><?= $registro['nombre'] ?></td>
      <td><?= $registro['direccion'] ?></td>
      <td><?= $registro['telefono'] ?></td>
      <td>
        <form action="pagina.php" method="post">
          <input type="hidden" name="ejercicio" value="4_3_1/01">
          <input type="hidden" name="dni" value="<?= $registro['dni'] ?>">
          <input type="hidden" name="accion" value="Eliminar">
          <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span> Eliminar</button>
        </form>
      </td>
      <td>
        <form action="pagina.php" method="post">
          <input type="hidden" name="ejercicio" value="4_3_1/01_modificar_cliente">
          <input type="hidden" name="dni" value="<?= $registro['dni'] ?>">
          <input type="hidden" name="nombre" value="<?= $registro['nombre'] ?>">
          <input type="hidden" name="direccion" value="<?= $registro['direccion'] ?>">
          <input type="hidden" name="telefono" value="<?= $registro['telefono'] ?>">
          <button type="submit" class="btn btn-warning"><span class="glyphicon glyphicon-pencil"></span> Modificar</button>
        </form>
      </td>
    </tr>
  <?php
  }
  ?>
  <!--//////////// Añadir nuevo campo de cliente /////////////////////////-->
  <form action="pagina.php" method="post">
    <input type="hidden" name="ejercicio" value="4_3_1/01">
    <input type="hidden" name="accion" value="Nuevo cliente">
    <tr>
      <td><input type="text" name="dni" size="10"></td>
      <td><input type="text" name="nombre"></td>
      <td><input type="text" name="direccion"></td>
      <td><input type="text" name="telefono" size="12"></td>
      <td colspan="2">
        <button type="submit" class="btn btn-success">
          <span class="glyphicon glyphicon-ok"></span>Nuevo cliente
        </button>
      </td>
    </tr>
  </form>
</table>