<?php
//Incluyo los archivos necesarios
require("./modelo/model.php");
require("./controlador/controller.php");

//Instancio el controlador
$controller = new CocheController;

//Ejecuto el método
$controller->index();
?>