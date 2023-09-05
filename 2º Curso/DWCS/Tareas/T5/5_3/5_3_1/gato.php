<?php

include_once "animal.php";

class Gato extends Animal {
    private $raza;

    public function __construct($sexo, $raza) {
        parent::__construct($sexo);
        if (isset($raza)) {
            $this->raza = $raza;
        } else {
            $this->raza = "Siamés";
        }
    }

    public function __toString() {
        return parent::__toString() . "<br>Raza: $this->raza";
    }

    public function maullar() {
        return "Miau.";
    }

    public function ronronear() {
        return "Rondoneo.";
    }

    public function comer($comida) {
        if ($comida == "pescado") {
            return "Estoy comiendo pescado.";
        } else {
            return "No me gusta otra cosa que el pescado.";
        }
    }

    public function pelear($rival) {
        if ($this->getSexo() == "Hembra") {
            return "Soy hembra; no peleo.";
        } else if ($rival->getSexo() == "Hembra") {
            return "No peleo contra hembras.";
        } else {
            return "Voy a pelear";
        }
    }

    public function asearse() {
        return "Me estoy aseando.";
    }

    public function cazar() {
        return "Estoy cazando ratones.";
    }
}
