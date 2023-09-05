<?php
$uri = "http://localhost/david/Examen_8_9/";
$server = new SoapServer(null, array('uri' => $uri));
$server->addFunction("maximo");
$server->addFunction("minimo");
$server->handle();

function maximo($num1, $num2, $num3)
{
    if ($num1 > $num2 && $num1 > $num3) {
        $resultado = $num1;
    } elseif ($num2 > $num1 && $num2 > $num3) {
        $resultado = $num2;
    } elseif ($num3 > $num1 && $num3 > $num2) {
        $resultado = $num3;
    }
    return $resultado;
}
function minimo ($num1, $num2, $num3){
    if ($num1 < $num2 && $num1 < $num3) {
        $resultado = $num1;
    } elseif ($num2 < $num1 && $num2 < $num3) {
        $resultado = $num2;
    } elseif ($num3 < $num1 && $num3 < $num2)  {
        $resultado = $num3;
    }
    return $resultado;
}