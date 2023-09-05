// Exercicio 6.1
function comprobar() {
    var partido;
    resultados = new Array("1", "0", "1", "2", "1", "1", "2");
    var texto = "";
    if (partido != "X" && partido != "1" && partido != "2") {
        texto = "Introduce un resultado posible:";
    } else {
        iteracion++;
        if (partido == vector[contador]) {
            aciertos++;
        }
        contador++;
        if (contador == vector.length) {
            if (aciertos == vector.length) {
                texto = "Has ganado. Tienes" + aciertos + ".";
            } else {
                texto = "Has perdido. Tienes" + aciertos + ".";
            }
        } else {
            PedirDatos(6, 1);
        }
    }
    resultado.innerHTML = texto;
}

function marcar(elemento) {
    var tamano = elemento.length;
    for (var i = 0; i < 3; i++) {
        document.getElementById(elemetno.subst(0, tamano - 1) + i).classList.remove("activo");
    }
    document.getElementById(elemento).classList.add("activo");
    pronosticos[elemento.substr(tamano - 2, 1)] = elemento.subst(tamano - 1, 1);
}

///////////////////////////////////////////////////////////////////////////////////////////////////////

function tute() {
    var baraja = new Array("o1", "o2", "o3", "o4", "o5", "o6", "o7", "o10", "o11", "o12",
        "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c10", "c11", "c12",
        "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e10", "e11", "e12",
        "b1", "b2", "b3", "b4", "b5", "b6", "b7", "b10", "b11", "b12");
    baraja.sort(function () { return Math.random() - 0.5 });

    var XOGADORES = 4;
    var cantes = new Array(XOGADORES);

    for (let i = 0; i < cantes.length; i++) {
        cantes[i] = new Array(false, false, false, false, false, false, false, false);
    }

    for (let i = 0; i < baraja.length; i++) {
        if (i % 10 == 0) {
            var jugador = i / 10;
        }
        switch (baraja[i]) {
            case "o11":
                cantes[jugador][0] = true;
                break;
            case "o12":
                cantes[jugador][1] = true;
                break;
            case "c11":
                cantes[jugador][2] = true;
                break;
            case "c12":
                cantes[jugador][3] = true;
                break;
            case "e11":
                cantes[jugador][4] = true;
                break;
            case "e12":
                cantes[jugador][5] = true;
                break;
            case "b11":
                cantes[jugador][6] = true;
                break;
            case "b12":
                cantes[jugador][7] = true;
                break;
            default:
                break;
        }
    }

    var texto = "";
    for (let i = 0; i < cantes.length; i++) {
        if (cantes[i][0] && cantes[i][1]) {
            texto += "El jugador " + i + " puede cantar en Oros.<br>";
        } if (cantes[i][2] && cantes[i][3]) {
            texto += "El jugador " + i + " puede cantar en Copas.<br>";
        } if (cantes[i][4] && cantes[i][5]) {
            texto += "El jugador " + i + " puede cantar en Espadas.<br>";
        } if (cantes[i][6] && cantes[i][7]) {
            texto += "El jugador " + i + " puede cantar en Bastos.<br>";
        }
    }
    datos.innerHTML;
    resultado.innerHTML = texto;
}

///////////////////////////////////////////////////////////////////////////////////////////////////////

// Inicializar variables.
function exames() {
    total = 0;
    notas = new Array();
    datos.innerHTML =
        '<form>' +
        '<label for="varA">Introduce una nota:</label><input id="varA" type="text"/>' +
        '<button type="button" onclick="resolverNota(varA.value)">Calcular</button>' +
        '</form>';
}

function resolverNota(nota) {
    let suspenso = false;
    let texto = "";
    if (nonE0e10(nota)) {
        texto = "Debes introducir un número entre 0 y 10.";
    } else {
        nota = parseFloat(nota);
        notas.push(nota);
        total += nota;
        if (nota < 4) {
            suspenso = true;
        }
        let media = total / notas.length;
        if (suspenso) {
            texto += "El alumno está suspenso porque tiene notas menores que 4.";
        } else if (media < 5) {
            texto += "El alumno está suspenso porque tiene una media menor que 5. Media: " + media.toFixed(2);
        } else {
            texto += "El alumno está aprobado. Media: " + media.toFixed(2);
        }
    }
    console.log(notas);
    resultado.innerHTML = notas + "<br>" + texto;
}

function nonE0e10(numero) { // Número entre 0 y 10.
    numero = numero.trim();
    return (isNaN(numero) || numero < 0 || numero > 10 || numero == '');
}

///////////////////////////////////////////////////////////////////////////////////////////////////////

function validarRomano() {
    datos.innerHTML =
        '<label for="romano">Introduce un número en notación romana:<input type="text" onchange="romanos(this.value)"/>';
    resultado.innerHTML = "";
}

function romanos(romano) {
    var texto = "";
    romano = romano.toUpperCase();
    let correcto = true;
    let numero = 0;

    for (let i = 0; i < romano.length; i++) {
        console.log(romano);
        switch (romano[i]) {
            case "I":
                break;
            case "V":
                break;
            case "X":
                break;
            case "L":
                break;
            case "C":
                break;
            case "D":
                break;
            case "M":
                break;
            default:
                correcto = false;
                break;
        }
    }
    if (correcto == false) {
        texto = "Incorrecto. Introduce un número romano válido.";
    } else {
        var romanos = new Array("MMM", "MM", "M", "MC", "DCCC", "DCC", "DC", "D", "CD", "CCC", "CC", "C",
            "XC", "LXXX", "LXX", "LX", "L", "XL", "XXX", "XX", "XX", "X",
            "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I");
        var decimales = ("3000", "2000", "1000", "900", "800", "700", "600", "500", "400", "300", "200", "100",
            "90", "80", "70", "60", "50", "40", "30", "20", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1");

        for (let i = 0; i < romanos.length; i++) {
            console.log(romano.includes(romanos[i]));
            if (romano.includes(romanos[i]) && romano.search(romanos[i]) == 0) {
                romano = romano.replace(romanos[i] + "");
                numero += parseInt(decimales[i]);
                if (decimales[i] > 0) {
                    i = romanos.length;
                }
                if (decimales[i] > 9) {
                    i = 20;
                }
                if (decimales[i] > 99) {
                    i = 11;
                }
                if (decimales[i] > 999) {
                    i = 2;
                }
            } else {
                texto = "Incorrecto. Bloque repetido o incorrecto.";
            }
        }
    }
    if (numero == "") {
        texto = "El número en arábigo es " + numero;
    }
    resultado.innerHTML = texto;
}


/*function validarRomano(numRomano) {
    numRomano = numRomano.toUpperCase();
    const LETRAS = { I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000 };
    console.log(numRomano);

    for (let i = 0; i < numRomano.length; i++) {
        var suma = 0;
        var anterior = 0;
        const ACTUAL = LETRAS[numRomano[i]] ?? 0;

        suma += ACTUAL;
        if (anterior < ACTUAL) {
            suma -= anterior + anterior;
        }
        anterior = ACTUAL;
    }
    resultado.innerHTML = suma;
}
function comprobarRomano(numRomano) {
    console.log(numero);

    for (let i = 0; i < numero.length; i++) {
        if (numRomano.includes('IIII') || numRomano.includes('VV') || numRomano.includes('XXXX') || numRomano.includes('LL')) {

        }
    }

    if (numRomano.includes('IV') || numRomano.includes('IX')) {
        resultado -= 2;
    }
    if (numRomano.includes('XL') || numRomano.includes('XC')) {
        resultado -= 20;
    }
    if (numRomano.includes('CD') || numRomano.includes('CM')) {
        resultado -= 200;
    }
}*/
///////////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_6_5(numero) {
    var texto = "";
    var numero = parseInt(numero);

    if (isNaN(numero) || numero < 1 || numero > 3999) {
        texto = "Incorrecto. Introduce un número entre 1 y 3999";
    } else {
        texto = "Número convertido a notación romana: " + convertirARomano(numero);
    }
    resultado.innerHTML = texto + ".";
}

function convertirARomano(numero) {
    const romanos = { M: 1000, CM: 900, D: 500, CD: 400, C: 100, XC: 90, L: 50, XL: 40, X: 10, IX: 9, V: 5, IV: 4, I: 1 }
    var resultado = "";
    for (let r in romanos) {
        resultado += r.repeat(Math.floor(numero / romanos[r]));
        numero = numero % romanos[r];
    }
    return resultado;
}

///////////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_6_6(ladoA, ladoB, ladoC) {
    var texto = '';
    if (comprobarNumero(ladoA) || comprobarNumero(ladoB) || comprobarNumero(ladoC)) {
        texto = "Valor erróneo en uno o más lados. Introduce un número válido.";
    } else {
        if (ladoA == ladoB && ladoB == ladoC == ladoA == ladoC) {
            texto = "El triángulo es equilátero.";
        }
        if ((ladoA == ladoB && ladoB != ladoC && ladoA != ladoC) || (ladoA != ladoB && ladoC != ladoB && ladoC == ladoA) || (ladoA != ladoB && ladoB == ladoC && ladoC != ladoA)) {
            texto = "El triángulo es isósceles.";
        }
        if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
            texto = "El triángulo es escaleno.";
        } else {
            texto = "La figura no es un triángulo.";
        }
    }
    resultado.innerHTML = texto;
}

function comprobarNumero(lado) {
    return (isNaN(lado) || lado <= 0) || (isNaN(lado));
}

///////////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_6_7(frase) {
    var texto = "";
    if (frase.length === 0) {
        texto = "Incorrecto. Introduce una frase.";
    } else {
        frase.toLowerCase().replace(/\s/g, "");
        console.log(frase);
        var reves = frase.split("").reverse().join("");
        if (frase == reves) {
            texto = "La frase o palabra es un palíndromo.";
        } else {
            texto = "La frase o palabra no es un palíndromo.";
        }
    }
    resultado.innerHTML = texto;
}

///////////////////////////////////////////////////////////////////////////////////////////////////////



///////////////////////////////////////////////////////////////////////////////////////////////////////