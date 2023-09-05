<?php
// Subclase hija que hereda de la clase padre "Animal".
include_once "animal.php";

class Mamifero extends Animal {
    // Constructor que extiende del constructor de la clase padre "Animal".
    public function __construct($sexo)  {
        parent::__construct($sexo);
    }

    // Constructor de la propia clase.
    public function amamantar() {
        if ($this->getSexo()=="macho") {
            return "Soy macho, no puedo amamantar.";
        } else {
            return "soy hembra, puedo amamantar.";
        }
    }

    // Constructor de la propia clase.
    public function cuidarCrias() {
        return "Estoy cuidando crías.";
    }

    // Constructor de la propia clase.
    public function caminar() {
        return "Estoy caminando.";
    }
}