<?php
require_once("../T2_5 Actividades/phpChart_Lite/conf.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>t2_5_Temperatura</title>
</head>
<body>
<?php
  if (!isset($_GET['temperatura'])) {
    // Pide los datos de las temperaturas
    $mes = array(
      "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
      "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
    ?>
    Por favor, introduzca la temperatura media de cada mes.<br>
    <form action="t2_5_Temperatura.php" method="get">
      <input type="hidden" name="ejercicio" value="05">
      <?php
      for ($i = 0; $i < 12; $i++) {
        echo "$mes[$i]: <input type=\"number\" name =\"temperatura[$mes[$i]]\"><br>";
      }
      ?>
      <input type="submit" value="OK">
    </form>
    <?php                       
  } else {
    // Pinta el diagrama de barras
    $temperatura = $_GET['temperatura'];
    $valores = "";
    foreach ($temperatura as $mes => $temperaturaMes) {
        $valores .= $temperaturaMes . ", ";
    }
    $valores = rtrim($valores, ", ");
    $temp = array_map('intval', explode(', ', $valores));
    $pc = new C_PhpChartX(array($temp), 'basic_chart');
    $pc->set_animate(true);
    $pc->draw();
  }
  ?>
</body>
</html>