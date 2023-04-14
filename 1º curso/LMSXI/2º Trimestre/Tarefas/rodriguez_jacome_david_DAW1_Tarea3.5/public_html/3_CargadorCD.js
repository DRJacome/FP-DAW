


class Cancion {
    constructor(titulo, duracionSegundos) {
        this._titulo = titulo;
        this._duracionSegundos = duracionSegundos;
    }

    detallesCancion() {
        return this._titulo + " - " + this._duracionSegundos + " segundos.";
    }

    get duracionCancion() {
        return this._duracionSegundos;
    }
}
let cancion = new Cancion("Hoxe son un punk", 197);

class CD {
    constructor(autor, titulo, temas) {
        this._autor = autor;
        this._titulo = titulo;
        this._temas = temas;
    }

    detallesCD() {
        for (var i = 0; i < this._temas.length; i++) {
            document.write(this._temas[i].detallesCancion() + "<br/>");
        }
    }

    duracionCD() {
        var duracion = 0;
        for (var i = 0; i < this._temas.length; i++) {
            duracion += this._temas[i].duracionCancion;
        }
        return duracion;
    }
}

let cancion1 = new Cancion("A invención do canto", 244);
var temas = new Array(cancion, cancion1);
let cd = new CD("Siniestro Total", "Hoxe son un punk", temas);

class Cargador {
    constructor(cd) {
        this._cd = cd;
    }
    duracionTotal() {
        var duracionTotal = 0;
        for (var i = 0; i < this._cd.length; i++) {
            duracionTotal += this._cd[i].duracionCD();
        }
        alert("Duración Total del CD: " + duracionTotal + " segundos.");
    }
}

var nuevasCanciones = new Array(cancion1);
let nuevoCD = new CD("Carmiña Vacaloura", "Non todo é o que parece", nuevasCanciones);
var cds = new Array(cd, nuevoCD);

let cargador = new Cargador(cds);

cargador.duracionTotal();
