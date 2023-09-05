<?php
include_once "animal.php";

// Subclase hija que hereda de la clase padre "Animal".
class Ave extends Animal {
    public function __construct($sexo) {
        parent::__construct($sexo);        
    }

    // Constructor de la propia clase.
    public function asearse() {
        return "Me estoy limpiando las plumas.";
    }

    // Constructor de la propia clase.
    public function volar() {
        return "Estoy volando.";
    }

    // Constructor de la propia clase.
    public function ponerHuevo() {
        if(!$this->getSexo() == "macho") {
            return "Soy un macho, no puedo poner huevos.";
        } else {
            return "He puesto un huevo.";
        }
    }
}