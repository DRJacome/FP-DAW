



class Triangulo {
    //Constructor de triángulos: Control de entrada.
    constructor(ladoBase, lado2, lado3) {
        if (isNaN(ladoBase) || isNaN(lado2) || isNaN(lado3)) {
            throw 'Introduce valores numéricos para los lados: ';
        } else {
            this._ladoBase = ladoBase;
            this._lado2 = lado2;
            this._lado3 = lado3;
        }
    }

    //Getter Setter ladoBase
    get ladoBase() {
        return this._ladoBase;
    }
    set ladoBase(ladoBase) {
        this._ladoBase = ladoBase;
    }

    //Getter Setter lado2
    get lado2() {
        return this._lado2;
    }
    set lado2(lado2) {
        this._lado2 = lado2;
    }

    //Getter Setter lado3
    get lado3() {
        return this._lado3;
    }
    set lado3(lado3) {
        this._lado3 = lado3;
    }

    //Método público para mostrar valores de lados.
    todosLosLados() {
        return ("Lados: \n base = " + this._ladoBase
                + "\n lado 2 = " + this._lado2
                + "\n lado 3 = " + this._lado3);
    }

    //Método público para mostrar tipo de triángulo.
    tipoTriangulo() {
        if (this._ladoBase == this._lado2 && this._lado2 == this._lado3) {
            alert("El triángulo es de tipo equilátero.");
        } else if (this._ladoBase == this._lado2 && this._lado2 != this._lado3) {
            alert("El triángulo es de tipo isósceles");
        } else if (this._ladoBase == this._lado3 && this._lado3 != this._lado2) {
            alert("El triángulo es de tipo isósceles");
        } else if (this._ladoBase != this._lado2 && this._lado2 == this._lado3) {
            alert("El triángulo es de tipo isósceles");
        } else {
            alert("El triángulo es escaleno.");
        }
    }
}

// Constructor de triángulos: creador de triángulos.
let triangulo = new Triangulo(5, 6, 7);
alert(triangulo.todosLosLados());
triangulo.tipoTriangulo();