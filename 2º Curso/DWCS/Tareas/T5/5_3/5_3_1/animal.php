<?php
// Clase padre "Animal".
class Animal    {
    // Atributos.
    private $sexo;

    // Constructor de la clase.
    public function __construct($sexo)  {
        if (!isset($sexo)) {
        $this->sexo = "macho";
        } else {
        $this->sexo = $sexo;
        }
    }

    // Este método convierte la clase en una cadena.
    public function __toString()    {
        return "Sexo: $this->sexo";
    }
    
    // Método para tomar el valor del atributo de la clase.
    public function getSexo() {
        return $this->sexo;
    }

    // Método para representar una acción de la clase.
    public function comer($comida) {
        return "Estoy comiendo $comida" . ".";
    }

    // Método para representar una acción de la clase.
    public function dormir() {
        return "Estoy durmiendo.";
    }
}
