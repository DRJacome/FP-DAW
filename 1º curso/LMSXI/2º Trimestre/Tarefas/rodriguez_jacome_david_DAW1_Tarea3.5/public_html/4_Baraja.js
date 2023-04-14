
class Carta {
    constructor(numero, palo) {
        this._numero = numero;
        this._palo = palo;
    }

    mostrarCarta() {
        return this._numero + " " + this._palo;
    }
}

let carta1 = new Carta(12, ", Rey de Espadas");

alert(carta1.mostrarCarta());

class Baraja {
    constructor() {
        this._cartas = new Array();
        var palos = new Array("Copas", "Espadas", "Oros", "Bastos");

        for (var i = 0; i < palos.length; i++) {
            for (var j = 0; j < 10; j++) {
                this._cartas[this._cartas.length] = new Carta(j + 1, palos[i]);
            }
        }
    }

    mostrarBaraja() {
        document.write("Cartas sin barajar: <br/><br/>");
        for (var i = 0; i < this._cartas.length; i++) {
            document.write(this._cartas[i].mostrarCarta() + "<br/>");
        }
    }

    barajarNaipes() {
        var palos = new Array("Copas", "Espadas", "Oros", "Bastos");
        var cartasNuevas = new Array()

        for (var i = 0; i < 40; i++) {
            var j = Math.floor((Math.random() * this._cartas.length) + 1) - 1;
            cartasNuevas[i] = this._cartas[j];
            this._cartas.splice(j, 1);
        }

        this._cartas = cartasNuevas;

        document.write("<br/><br/>Cartas barajadas: <br/>");
        for (i = 0; i < this._cartas.length; i++) {
            document.write(this._cartas[i].mostrarCarta() + "<br/>");
        }
    }
}

let baraja = new Baraja();

baraja.mostrarBaraja();

baraja.barajarNaipes();