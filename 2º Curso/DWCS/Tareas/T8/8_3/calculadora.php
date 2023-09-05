<?php
// Instanciamos un nuevo servidor SOAP.
$uri = "http://localhost/david/Tareas/T8/8_3/";
$server = new SoapServer(null, array('uri' => $uri));
$server->addFunction("suma");
$server->addFunction("resta");
$server->addFunction("producto");
$server->addFunction("division");
$server->handle();
// Conjunto de funciones para las operaciones aritméticas de la calculadora:
// sumar, restar, multiplicar y dividir.
function suma($a, $b)
{
    $resultado = $a + $b;
    return $resultado;
}

function resta($a, $b)
{
    $resultado = $a - $b;
    return $resultado;
}

function producto($a, $b)
{
    $resultado = $a * $b;
    return $resultado;
}

function division($a, $b)
{
    // El resultado ser formatea para que sólo tenga dos decimales,
    // en caso de que la división no dé exacta.
    $resultado = number_format(($a / $b), 2);
    return $resultado;
}
