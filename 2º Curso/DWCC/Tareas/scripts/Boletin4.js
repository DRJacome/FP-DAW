//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_1() {
    var vector = new Array(100);

    for (let i = 0; i < vector.length; i++) {
        vector[i] = " " + (Math.random() * 100).toFixed(0);
    }
    resultado.innerHTML = "Valores del vector: " + vector + ".";
}

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_2(numero) {
    var texto = "";
    var sumaTotal = 0;
    var vector = new Array(5);


    for (let i = 0; i < 5; i++) {
        vector[i] = new Array(6);
    }

    for (let i = 0; i < vector.length; i++) {
        var numero = parseInt(numero);
        for (let j = 0; j < vector[i].length; j++) {
            vector[i][j] = numero++;
        }
    }

    // Impresión del vector con tabla de CSS.
    texto = '<table id="taboa_4_2">';
    for (let i = 0; i < vector.length; i++) {
        var numero = parseInt(numero);
        texto += '<tr>';
        for (let j = 0; j < vector[i].length; j++) {
            texto += '<td>' + vector[i][j] + '</td>';
            sumaTotal += vector[i][j];
        }
        texto += '</tr>';
    }
    texto += '</table>';
    resultado.innerHTML = "La suma total es: " + texto + " Suma total de los número del vector: " + sumaTotal;
}

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_3() {
    var texto = "Números existentes en el vector: [";
    const MAXIMO = 10;
    const MINIMO = -10;
    var positivos = 0;
    var negativos = 0;
    var ceros = 0;
    var vector = new Array(MAXIMO);

    for (let i = 0; i < vector.length; i++) {
        // Relleno cada posición del vector con un número aleatorio entre -10 y 10.
        vector[i] = Math.round(Math.random() * (MAXIMO - MINIMO) + MINIMO);
        // Compruebo si el número aleatorio es cero, negativo o positivo.
        if (vector[i] == 0) {
            ceros++;
        } else if (vector[i] > 0) {
            positivos++;
        } else {
            negativos++;
        }
        texto += vector[i] + ",";
    }
    texto = texto.substring(0, texto.length - 1) + "]";
    texto += "<br>En el vector hay " + negativos + " números negativos, "
        + positivos + " números positivos y " + ceros + " ceros.";
    resultado.innerHTML = texto;
}

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_4(numero) {
    if (isNaN(numero)) {
        texto = "Introduce un número válido.";
    } else {
        vector.push(numero);
        texto = "<br>Serie ordenada: " + vector.sort(function (a, b) { return a - b; });
        iteracion++;
        PedirDatos(4, 4);
    }
    resultado.innerHTML = texto;
}

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_5(numero) {
    var texto = "";
    const CANTIDAD = 10;

    if (isNaN(numero) || numero < 1 || numero % 1 != 0) {
        texto = "Introduce un número válido.";
    } else {
        numero = parseFloat(numero);
        vector.push(numero);
        suma += numero;
        if (vector.length == CANTIDAD) {
            var media = suma / CANTIDAD;
            texto = "El vector contiene los siguientes números: [" + vector + "]" +
                "<br>La suma de los elementos es igual a " + suma + "; <br>y la media es " + media;
        } else {
            iteracion++;
            PedirDatos(4, 5);
        }
    }
    resultado.innerHTML = texto;
}

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_6(numero) {
    var texto = "";

    // Recorro los inputs de la posición 0_0, 1_1 y 2_2 (i + i) para mostrar
    // la diagonal principal.
    for (let i = 0; i < numero; i++) {
        texto += document.getElementById('numero ' + i + '_' + i).value + " ";
    }
    resultado.innerHTML = "La diagonal del vector es: " + texto;
}

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_7(filas, columnas) {
    var texto = "";
    // Recorro primero las columnas y después recorro las filas para lo que 
    // antes eran filas, ahora son columnas, y viceversa.
    for (let i = 0; i < columnas; i++) {
        for (let j = 0; j < filas; j++) {
            texto += document.getElementById('numero ' + j + '_' + i).value + " ";
        }
        texto += "<br>";
    }
    resultado.innerHTML = texto;
}

/*function resolver_4_7(numero) {
    var texto1 = "";
    var texto2 = "";
    var vector = new Array(3);

    //vector 1.
    for (let i = 0; i < vector.length; i++) {
        vector[i] = new Array(4);
    }

    //Relleno vector 1.
    for (let i = 0; i < vector.length; i++) {
        var numero = parseInt(numero);
        for (let j = 0; j < vector[i].length; j++) {
            vector[i][j] = numero++;
            texto1 += vector[i][j] + " ";
        }
    }

    //vector 2.
    var vectorT = new Array(vector[0].length);
    for (let i = 0; i < vectorT.length; i++) {
        vectorT[i] = 1;
    }

    for (let i = 0; i < vector.length; i++) {
        for (let j = 0; j < vector[i].length; j++) {
            vectorT[i][j] = vector[i][j];
            texto2 += vectorT[i][j] + " ";
        }
    }
    resultado.innerHTML = "vector original: " + texto1 + "<br>" +
        "vector traspuesto: " + texto2;
}*/

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_8(numero) {
    if (isNaN(numero) || numero < 1 || numero % 1 != 0) {
        texto = "Introduce un número válido.";
    } else {
        var texto = "El vector inicial es: [";
        for (let i = 0; i < numero; i++) {
            // Variable aleatoria con valor entre 0 y 99.
            aleatorio = Math.ceil(Math.random() * 100);
            vector[i] = aleatorio;
            texto += vector[i] + ",";
            vector[i] = suma;
            suma += aleatorio;
            PedirDatos(4, 8);
        }
        texto = texto.substring(0, texto.length - 1) + "]<br> El vector final sumando la posición anterior es: [" + vector + "]";
    }
    resultado.innerHTML = texto;
}

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_9(numero) {
    var texto = "";

    if (isNaN(numero) || numero < 1 || numero % 1 != 0) {
        texto = "Introduce un número válido.";
    } else {
        // Vector inicial del derecho.
        var texto = "El vector inicial es: [";
        for (let i = 0; i < numero; i++) {
            aleatorio = Math.ceil(Math.random() * 100);
            vector[i] = aleatorio;
        }
        texto += vector + "]";

        //Vector dado la vuelta.
        var auxiliar = new Array();
        texto += "<br>Reverso del vector: [";
        for (let i = 0; i < vector.length / 2; i++) {
            auxiliar[i] = vector[vector.length - i - 1];
            auxiliar[vector.length - i - 1] = vector[i];
        }
        texto += auxiliar + "]";
    }
    resultado.innerHTML = texto;
}

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_10(numero) {
    const CANTIDAD = 10;
    var texto = "";


    if (isNaN(numero)) {
        texto = "Introduce un número válido.";
    } else {
        numero = parseFloat(numero);
        vector.push(numero);
        if (vector.length == CANTIDAD) {
            var boton = document.getElementById("boton");
            boton.disabled = true;
            var media = suma / CANTIDAD;
            var contador = 0;
            for (let i = 0; i < vector.length; i++) {
                if (vector[i] > media) {
                    contador++;
                }
            }
            texto = "[" + vector + "]<br>Hay " + contador + " elementos mayores que la media.";
        } else {
            iteracion++;
            PedirDatos(4, 10);
        }
    }
    resultado.innerHTML = texto;
}

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_11() {
    const ANCHO = 8;
    generarTablero(ANCHO);
    colocarPezas();
    pintarTablero();
}

function generarTablero(ancho) {
    pezas = new Array(ancho);
    for (let i = 0; i < pezas.length; i++) {
        pezas[i] = new Array(ancho);
        for (let j = 0; j < pezas[i].length; j++) {
            pezas[i][j] = new Array(2);
            pezas[i][j][0] = "&nbsp;";
            pezas[i][j][1] = "&nbsp;";
        }
    }
}

function pintarTablero() {
    texto = '<table>';
    for (let i = 0; i < pezas.length; i++) {
        texto += '<tr>';
        for (let j = 0; j < pezas[i].length; j++) {
            if ((i + j) % 2 == 0) {
                clase = "fondoBranco";
            } else {
                clase = "fondoNegro";
            }
            if (pezas[i][j][0] == '&nbsp;') {
                peza = '';
            } else {
                peza = '<img src="imaxes/xadrez/' + pezas[i][j][0] + pezas[i][j][1] + '.png">';
            }
            texto += '<td id=" ' + i + "" + j + '"onclick="cambiaFondo(this.id)" class="' + clase + '">' + peza + '</td>';
        }
        texto += '</tr>';
    }
    texto += '</table>';
    resultado.innerHTML = texto;
}

/*function cambiaFondo(id) {
    var item = document.getElementById(id);
    if (item.classList.contains("fondoBranco")) {
        item.classList.add("fondoNegro");
        item.classList.remove("fondoBranco");
        item.innerHTML = HTML = "";
    } else {
        item.classList.add("fondoBranco");
        item.classList.add("fondoNegro");

        item.innerHTML = '<img src="imaxes/xadrez/PN.png">';
    }
}*/

function colocarPezas() {
    pezas[0][0][0] = 'T';
    pezas[0][0][1] = 'N';
    pezas[0][1][0] = 'C';
    pezas[0][1][1] = 'N';
    pezas[0][2][0] = 'B';
    pezas[0][2][1] = 'N';
    pezas[0][3][0] = 'D';
    pezas[0][3][1] = 'N';
    pezas[0][4][0] = 'R';
    pezas[0][4][1] = 'N';
    pezas[0][5][0] = 'B';
    pezas[0][5][1] = 'N';
    pezas[0][6][0] = 'C';
    pezas[0][6][1] = 'N';
    pezas[0][7][0] = 'T';
    pezas[0][7][1] = 'N';

    pezas[1][0][0] = 'P';
    pezas[1][0][1] = 'N';
    pezas[1][1][0] = 'P';
    pezas[1][1][1] = 'N';
    pezas[1][2][0] = 'P';
    pezas[1][2][1] = 'N';
    pezas[1][3][0] = 'P';
    pezas[1][3][1] = 'N';
    pezas[1][4][0] = 'P';
    pezas[1][4][1] = 'N';
    pezas[1][5][0] = 'P';
    pezas[1][5][1] = 'N';
    pezas[1][6][0] = 'P';
    pezas[1][6][1] = 'N';
    pezas[1][7][0] = 'P';
    pezas[1][7][1] = 'N';

    pezas[6][0][0] = 'P';
    pezas[6][0][1] = 'B';
    pezas[6][1][0] = 'P';
    pezas[6][1][1] = 'B';
    pezas[6][2][0] = 'P';
    pezas[6][2][1] = 'B';
    pezas[6][3][0] = 'P';
    pezas[6][3][1] = 'B';
    pezas[6][4][0] = 'P';
    pezas[6][4][1] = 'B';
    pezas[6][5][0] = 'P';
    pezas[6][5][1] = 'B';
    pezas[6][6][0] = 'P';
    pezas[6][6][1] = 'B';
    pezas[6][7][0] = 'P';
    pezas[6][7][1] = 'B';

    pezas[7][0][0] = 'T';
    pezas[7][0][1] = 'B';
    pezas[7][1][0] = 'C';
    pezas[7][1][1] = 'B';
    pezas[7][2][0] = 'B';
    pezas[7][2][1] = 'B';
    pezas[7][3][0] = 'D';
    pezas[7][3][1] = 'B';
    pezas[7][4][0] = 'R';
    pezas[7][4][1] = 'B';
    pezas[7][5][0] = 'B';
    pezas[7][5][1] = 'B';
    pezas[7][6][0] = 'C';
    pezas[7][6][1] = 'B';
    pezas[7][7][0] = 'T';
    pezas[7][7][1] = 'B';
}


//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_12(decision) {
    vector_A = [1, 'a', 2, 't'];
    vector_B = [3, 2, 1];

    calcularSolucion(decision, vector_A, vector_B);
}

function calcularSolucion(decision, vector_A, vector_B) {
    var texto = "";
    switch (decision) {
        case 'union':
            // Creamos una variable auxiliar para almacenar los dos vectores concatenamos con el método .concat.
            var vectorAuxiliar = vector_A.concat(vector_B);
            vectorAuxiliar = new Set(vectorAuxiliar);
            vectorAuxiliar = Array.from(vectorAuxiliar);
            texto = vectorAuxiliar.sort();
            break;
        case 'interseccion':
            /*var vectorInterseccion = new Array();
            var vectorAuxiliar = vector_A.concat(vector_B);
            vectorAuxiliar.sort();
            for (let i = 0; i < vectorAuxiliar.length; i++) {
                if (vectorAuxiliar[i] == vectorAuxiliar[i + 1]) {
                    vectorInterseccion.push(vectorAuxiliar[i]);
                }
            }
            vectorInterseccion = new Set(vectorInterseccion);
            vectorInterseccion = Array.from(vectorInterseccion);*/
            vectorInterseccion = vector_A.filter(valor => vector_B.includes(valor));
            texto = vectorInterseccion;
            break;
        default:
            texto = ("Caso no definido.");
    }
    resultado.innerHTML = texto;
}

//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_4_13(numero) {
    var texto = "Debes introducir un número natural";
    if (!isNaN(numero) && numero > 0 && (numero % 1 == 0)) {
        numero = parseInt(numero);
        var vector = new Array(numero);
        var incompleto = true;
        var MAXIMO = 100;
        var contador = 0;
        texto = "El vector aleatorio tiene los siguientes números: ";
        while (incompleto) {
            var primo = Math.floor(Math.random() * MAXIMO);
            if (esPrimo(primo)) {
                vector[contador] = primo;
                contador++;
                texto += primo + " ";
            }
            if (contador == numero) {
                incompleto = false;
            }
        }
        texto += "<br>El máximo es: " + Math.max(...vector);
    }
    resultado.innerHTML = texto;
}
