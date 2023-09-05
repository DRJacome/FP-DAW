<?php

// Clase con el objeto Dado.
class Dado {
    // Variable private static para definir que los 
    // objetos que se creen de la clase Dado tengan 6 caras.
    private static $caras = array("1","2","3","4","5","6");
    // Variable para contar cuántas tiradas se han hecho
    // en una misma ejecución del programa.
    private static $tiradasTotales = 0;
    private $cara;

    // Método getter que devuelve cuántas tiradas se han hecho.
    public static function getTiradasTotales() {
        return Dado::$tiradasTotales;
    }

    public static function setTiradasTotales($tiradasTotales) {
        self::$tiradasTotales = $tiradasTotales;
    }

    // Método para tirar un dado.
    public function tira() {
        $this->cara = self::$caras[rand(0,5)];
        self::$tiradasTotales++;
    }

    // Método para indicar qué cara del dado salió.
    public function caraDado() {
        return $this->cara;
    }
}