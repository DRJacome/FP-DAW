<?php

include_once "mamifero.php";

class Perro extends Mamifero {
    private $raza;

    public function __construct($sexo, $raza) {
        parent::__construct($sexo);
        if (isset($raza)) {
            $this->raza=$raza;
        }else{
            $this->raza="Pastor alemán.";
        }
    }

    public function __toString()    {
        return parent::__toString()."<br>Raza: $this->raza";
    }

    public function ladrar() {
        return "Guau guau.";
    }

    public function rascarse() {
        return "Me estoy rascando.";
    }

    public function cazar() {
        return "Estoy cazando.";
    }
}