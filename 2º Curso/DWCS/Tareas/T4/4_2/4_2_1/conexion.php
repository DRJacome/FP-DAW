<?php
    $server = "localhost";
    $user = "root";
    $pass = "";
  /*   $db = "basedatost4ac1"; */
    $db = "departamentoventas";

    $conexion = new mysqli($server, $user, $pass, $db);

    if ($conexion -> connect_errno) {
        die("La conexión ha fallado." . $conexion -> connect_errno);
    }
?>