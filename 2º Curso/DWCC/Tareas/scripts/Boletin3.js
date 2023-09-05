//////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_1() {
    var texto = 0;
    const MAXIMO = 50;
    var suma = 0;
    var x = 0;

    while (x <= MAXIMO) {
        suma += x;
        x++;
    }
    texto = suma;
    resultado.innerHTML = "La suma de los 50 primeros números naturales es " + texto + ".";
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_2() {
    var texto = '';
    const MAXIMO = 100;
    var contador = 0;
    while (contador < MAXIMO) {
        contador++;
        texto += contador + " ";
    }
    resultado.innerHTML = texto;
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_3() {
    const MAXIMO = 100;
    var i = 0;
    var suma = 0;
    for (i = 0; i <= MAXIMO; i += 2) {
        suma += i;
    }
    resultado.innerHTML = "La suma total es: " + suma + ".";
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_4() {
    var texto = '';
    const MAXIMO = 100;
    var esPrimo = true;

    for (let i = 2; i <= MAXIMO; i++) {
        esPrimo = true;
        for (let j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0 && i != j) {
                esPrimo = false;
            }
        }
        if (esPrimo) {
            texto += i + " ";
        }
    }
    resultado.innerHTML = "Los siguientes números son primos: " + texto;
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_5(numero) {
    var texto = "";
    var numFactorial = parseInt(numero);
    contador = 1;
    factorial = 1;

    if (isNaN(numFactorial)) {
        texto = "Dato incorrecto. Introduce un número.";
    } else {
        numFactorial = parseFloat(numero);
        if (numFactorial < 0 && (numFactorial % 1 != 0)) {
            texto = numFactorial + "Número incorrecto. Introduce un número entero superior a 0.";
        } else {
            while (contador <= numFactorial) {
                factorial = (factorial * contador);
                contador++
                texto = factorial;
            }
            resultado.innerHTML = "El factorial de " + numFactorial + " es " + texto + ".";
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_6(limite) {
    var texto = "";
    if (isNaN(limite)) {
        texto = "Introduce un dato numérico correcto.";
    } else {
        limite = parseFloat(limite);
        if (limite < 0 || (limite % 1 != 0)) {
            texto = "Introduce un límite válido.";
        } else {
            for (let i = 1; i <= limite; i++) {
                for (let j = 1; j <= i; j++) {
                    texto += j + ", ";
                }
            }
            texto = texto.substring(0, texto.length - 2) + "...";
        }
        resultado.innerHTML = "Serie: " + texto;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_7(limite) {
    var texto = "";
    var z = parseInt(limite);
    var x = 0;
    var y;

    while (x <= z) {
        y = x * (-1);
        texto += y + ", " + x + ", ";
        x++;
    }
    resultado.innerHTML = "Serie: " + texto.substring(0, texto.length - 2);
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_8(limite) {
    var texto = "";
    var z = parseInt(limite);
    var y = 0;
    var x = 1;
    var contador = 0;
    var suma;

    while (contador <= z) {
        console.log(texto);
        suma = (x + y);
        texto = suma;
        x = y;
        y = suma;
        contador++;
    }
    resultado.innerHTML = texto;
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_9(limite) {
    var texto = "";
    var contador = 0;
    var numero = 0;
    var cuadrado = 0;
    if (isNaN(limite)) {
        texto = "Introduce un dato numérico correctro.";
    } else {
        limite = parseFloat(limite);
        if (limite < 0 || (limite % 1 != 0)) {
            texto = "Introduce un límite válido.";
        } else {
            while (contador <= limite) {
                cuadrado = numero * numero;
                texto += cuadrado + ", ";
                numero++;
                texto += numero + ", ";
                numero++;
                contador++;
            }
            texto = texto.substring(0, texto.length - 2) + "...";
        }
        resultado.innerHTML = texto;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_10(num) {
    var texto = "";
    if (isNaN(num)) {
        texto = "Introduce un dato numérco válido.";
    } else {
        num = parseFloat(num);
        if (num < 0 || (num % 1 != 0)) {
            Texto = "Introduce un número válido.";
        } else {
            for (let i = 1; i <= num / 2; i++) {
                texto += (num - i) + " + " + i + "<br>";
            }
        }
        resultado.innerHTML = texto;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_11() {
    const X = 7;
    const CARAS = 6;
    const DADOS = 2;
    var dado1 = 1;
    var probabilidad = 0;
    while (dado1 <= CARAS) {
        var dado2 = 1;
        while (dado2 <= CARAS) {
            if (dado1 + dado2 == X) {
                probabilidad++;
                break;
            }
            dado2++;
        }
        dado1++;
    }
    amosarResultado((probabilidad / Math.pow(CARAS, DADOS)).toFixed(3));
}

///////////////////////////////////////////////////////////////////////////////////////////////////

var numeroMayor;
var primeraVez = true;

function resolver_3_12(numero) {
    /*bucle = true;*/
    if (isNaN(numero)) {
        amosarResultado("Debes introducir un número");
    } else {
        var numero = parseFloat(numero);
        if (primeraVez) {
            numeroMayor = numero;
            primeraVez = false;
        } else {
            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
        }
        amosarResultado("El mayor número introducido es " + numeroMayor);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_13(numero1, numero2, numero3) {
    var texto = "";
    if (numDistCero(numero1) || numDistCero(numero2) || numDistCero(numero3)) {
        texto = "Introduce datos numéricos válidos."
    } else {
        var numero1 = parseInt(numero1);
        var numero2 = parseInt(numero2);
        var numero3 = parseInt(numero3);
        texto = "El máximo común divisor de " + numero1 + ", " +
            numero2 + " y " + numero3 + " es " +
            maxComunDivisor(numero1, maxComunDivisor(numero2, numero3));
    }
    amosarResultado(texto);
}

function numDistCero(numero) {
    return (isNaN(numero) || numero == 0 || (numero % 1 != 0));
}

function maxComunDivisor(numero1, numero2) {
    var maximo = 1;
    var numero1 = (numero1 < 0) ? numero1 * -1 : numero1;
    var numero2 = (numero2 < 0) ? numero2 * -1 : numero2;
    var limite = numero1;
    if (numero1 > numero2) {
        var limite = numero2;
    }
    for (let i = limite; i >= 2; i--) {
        if ((numero1 % i == 0) && (numero2 % i == 0)) {
            maximo = i;
            break;
        }
    }
    return maximo;
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_14(numero) {
    var texto = "";
    if (!isNaN(numero)) {
        var numero = parseFloat(numero);
        numero = (numero < 0) ? numero * -1 : numero;
        while (numero % 1 != 0) {
            numero *= 10;
        }
        var texto = 0;
        while (numero != 0) {
            var resto = numero % 10;
            texto += resto;
            numero = (numero - resto) / 10;
        }
    } else {
        texto = "Introduce un número.";
    }
    amosarResultado(texto);
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_15(numero) {
    var texto = "";
    if (isNaN(numero) || numero <= 1 || (numero % 1 != 0)) {
        texto = 'Introduce un número válido.';
    } else {
        var numero = parseInt(numero);
        if (numero % 2 == 0) {
            texto += numero + " es un número par.<br>";
        }
        if (esPrimo(numero)) {
            texto += numero + " es un número primo.";
        }
        if ((Math.sqrt(numero) % 1) == 0) {
            texto += numero + " es un cuadrado perfecto.";
        }
        if (texto == "") {
            texto = "No has introducido ningún número.";
        }
    }
    resultado.innerHTML = texto;
}

function esPrimo(numero) {
    var primo = true;
    for (var i = 2; i < numero; i++) {
        if (numero % i == 0) {
            primo = false; break;
        }
    }
    return primo;
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_18() {
    var texto = "";
    const LIMITE = 6;
    for (let i = 0; i <= LIMITE; i++) {
        texto += '<div class="fila">';
        for (let j = i; j <= LIMITE; j++) {
            texto += '<div class="ficha"><div class="columna">' + i + '</div>' +
                '<div class="columna">' + j + '</div></div>' +
                '<div class="separador"></div>';
        }
        texto += '</div>';
    }
    resultado.innerHTML = texto;
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_19(numero) {
    var texto = "";
    if (isNaN(numero) || (numero < 0) || (numero % 1 != 0)) {
        texto = "Introduce un dato numérico.";
    } else {
        var numero = parseInt(numero);
        for (let i = 1; i <= numero; i++) {
            for (let j = 1; j <= i; j++) {
                texto += "*";
            }
            texto += "<br>";
        }
        resultado.innerHTML = texto;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////
function resolver_3_20(numero) {
    var texto = "";
    if (isNaN(numero) || (numero < 0) || (numero % 1 != 0)) {
        texto = "Introduce un dato numérico.";
    } else {
        var numero = parseFloat(numero);
        for (let i = 1; i <= numero; i++) {
            for (let j = 1; j <= numero; j++) {
                if (i == 1 || j == 1 || i == numero || j == numero) {
                    texto += "*";
                } else {
                    texto += "-";
                }
            }
            texto += "<br>";
        }
        resultado.innerHTML = texto;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_21() {
    var texto = "";
    var jugadores = 1;

    for (let i = 1; i <= 30; i++) {
        var contador = "";
        if (jugadores == 4) {
            jugadores = 1;
        }
        texto += "Jugador " + jugadores + ": ";
        if (i % 2 == 0) {
            contador += "PIM ";
        }
        if (i % 3 == 0) {
            contador += "PAM ";
        }
        if (i % 5 == 0) {
            contador += "PUM ";
        }
        if (contador == "") {
            contador = " " + i;
        }
        texto += contador + "<br>";
        jugadores++;
    }
    resultado.innerHTML = texto;
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_22() {
    var xanela = true;
    var texto = "Ata qué número quere calcular?";
    
    while (xanela) {
        var respuesta = prompt(texto);
        if (isNaN(respuesta) || respuesta < 2 || (respuesta & 1 != 0)) {
            texto = "Introduce un dato numérico. " + texto;
        } else {
            xanela = false;
        }
    }
    var texto = "";
    var suma = 0;
    for (let i = 2; i <= respuesta; i++) {
        if (esPrimo(i)) {
            suma += i;
            texto = suma + "<br>" + texto;
        }
    }
    resultado.innerHTML = texto;
}

///////////////////////////////////////////////////////////////////////////////////////////////////

function resolver_3_23(numInicial, numFinal) {
    var texto = "";
    var numInicial = parseInt(numInicial);
    var numFinal = parseInt(numFinal);
    if (isNaN(numInicial) && isNaN(numFinal)) {
        texto = "";
    }
    resultado.innerHTML = texto;
}

///////////////////////////////////////////////////////////////////////////////////////////////////