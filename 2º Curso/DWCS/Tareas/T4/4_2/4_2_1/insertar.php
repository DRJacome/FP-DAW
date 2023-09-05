<?php
    include("conexion.php");

    $user = "David";
    $pass = "abc123";

    mysqli_query($conexion, "insert into usuarios(usuario,clave,fecha) values ('$user','$pass',now())");
    
?>