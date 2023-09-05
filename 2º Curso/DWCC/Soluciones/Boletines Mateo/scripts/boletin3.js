//exercicio1
function resolver1b3() {
    var texto = 0;
    const MAXIMO = 50;
    for (let i = 0; i <= MAXIMO; i++) {
        texto += i;
    }
    solucion.innerHTML = texto;
}

//exercicio2
function resolver2b3() {
    var texto = "";
    const MAXIMO = 100;
    for (let i = 0; i <= MAXIMO; i++) {
        texto += i + " ";
    }
    solucion.innerHTML = texto;
}

//exercicio3
function resolver3b3() {
    var texto = 0;
    const MAXIMO = 100;
    for (let i = 0; i <= MAXIMO; i += 2) {
        texto += i;
    }
    solucion.innerHTML = texto;
}

//exercicio4
function resolver4b3() {
    var texto = "";
    var primo = true;
    const MAXIMO = 100;
    for (let i = 2; i <= MAXIMO; i++) {
        primo = true;
        for (let j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0 && i != j) {
                primo = false;
            }
        }
        if (primo) {
            texto += i + " ";
        }
    }
    solucion.innerHTML = texto;
}

//exercicio5
function resolver5b3(num) {
    var texto = "";
    if (isNaN(num)) {
        texto = "Introduce un número correcto";
    } else {
        num = parseFloat(num);
        if (num < 0 || (num % 1 != 0)) {
            texto = "Introduce un número correcto";
        } else {
            var factorial = 1;
            for (let i = 1; i <= num; i++) {
                factorial *= i;
            }
            texto = factorial;
        }
    }
    solucion.innerHTML = texto;

}

//exercicio6
function resolver6b3(limite) {
    var texto = "";
    if (isNaN(limite)) {
        texto = "Introduce un número correcto";
    } else {
        limite = parseFloat(limite);
        if (limite < 0 || (limite % 1 != 0)) {
            texto = "Introduce un límite válido";
        } else {
            for (let i = 1; i <= limite; i++) {
                for (let j = 1; j <= i; j++) {
                    texto += j + ", ";
                }
            }
            texto = texto.substring(0, texto.length - 2) + "...";
        }
        solucion.innerHTML = texto;

    }
}

//exercicio7
function resolver7b3(limite) {
    var texto = "0, ";
    if (isNaN(limite)) {
        texto = "Introduce un número";
    } else {
        limite = parseFloat(limite);
        if (limite < 0 || (limite % 1 != 0)) {
            texto = "No se puede hace la serie de " + limite;
        } else {
            for (let i = 1; i <= limite; i++) {
                texto += i + ", " + (i * -1) + ", ";
            }
            texto = texto.substring(0, texto.length - 2) + "...";
        }
        solucion.innerHTML = texto;
    }
}

//exercicio8
function resolver8b3(limite) {
    var texto = "1, ";
    var num1 = 0;
    var num2 = 1;
    var total = 0;
    if (isNaN(limite)) {
        texto = "Introduce un número";
    } else {
        limite = parseFloat(limite);
        if (limite < 0 || (limite % 1 != 0)) {
            texto = "Introduce un límite válido";
        } else {
            for (let i = 0; i < limite; i++) {
                total = num1 + num2;
                num1 = num2;
                num2 = total;
                texto += total + ", ";
            }
            texto = texto.substring(0, texto.length - 2) + "...";
        }
        solucion.innerHTML = texto;
    }
}

//exercicio9
function resolver9b3(limite) {
    var texto = "";
    var cont = 0;
    var num = 0;
    var cuadrado = 0;
    if (isNaN(limite)) {
        texto = "Introduce un número";
    } else {
        limite = parseFloat(limite);
        if (limite < 0 || (limite % 1 != 0)) {
            texto = "Introduce un límite válido";
        } else {
            while (cont <= limite) {
                cuadrado = num * num;
                texto += cuadrado + ", ";
                num++;
                texto += num + ", ";
                num++;
                cont++;
            }
            texto = texto.substring(0, texto.length - 2) + "...";
        }
        solucion.innerHTML = texto;
    }
}

//exercicio10
function resolver10b3(num) {
    var texto = "";
    if (isNaN(num)) {
        texto = "Introduce un número";
    } else {
        num = parseFloat(num);
        if (num < 0 || (num % 1 != 0)) {
            texto = "Introduce un número válido";
        } else {
            for (let i = 1; i <= num / 2; i++) {
                texto += (num - i) + " + " + i + "<br> ";
            }
        }
        solucion.innerHTML = texto;
    }
}

//exercicio11
function resolver11b3() {
    var texto = "";
    var num = 7;
    const CARAS = 6;
    const DADOS = 2;
    var dado1 = 1;
    var dado2 = 1;
    var prob = 0;
    var probabilidade = 0;
    var total = 0;

    while (dado1 <= CARAS) {
        while (dado2 <= CARAS) {
            total = dado1 + dado2;
            if (total = num) {
                prob++;
            }
            dado2++;
        }
        dado1++;
    }
    probabilidade = prob / Math.pow(CARAS, DADOS) * 100;
    texto += probabilidade.toFixed(2) + "%";
    solucion.innerHTML = texto;
}

//exercicio12
function resolver12b3(num /*cantidade*/ ) {
    /*if (isNaN(cantidade)) {
        datos.innerHTML = "Introduce un número";
    } else {
        datos.innerHTML = "";
        for (let i = 1; i <= cantidade; i++) {
            // Si no lo hago asi y meto el form solo antes el navegador lo cierra haciendo un <form></form>
            if (i == 1) {
                datos.innerHTML += "<label for='num" + i + "'>Número " + i + ": </label> <input id='num" + i + "'> <br/>";
            } else {
                datos.innerHTML += "<label for='num" + i + "'>Número " + i + ": </label> <input id='num" + i + "'> <br/>";
            }

        }
        datos.innerHTML += "<button type='button' onclick='resolver12b3p2(";
        console.log(datos.innerHTML);
        for (let i = 1; i <= cantidade; i++) {
            //Lo hago para no añadir la coma al final
            if (i < cantidade) {
                datos.innerHTML += "num" + i + ".value,";
            } else {
                datos.innerHTML += "num" + i + ".value";
            }
        }
        datos.innerHTML += ")>Calcular</button>";
    }*/
    var texto = "";
    var temp = 0;
    var maior = 0;
    if (isNaN(num)) {
        texto = "Introduce un número";
    } else {
        for (let i = 0; i <= num.length; i++) {
            temp = parseInt(num.charAt(i));
            if (maior < temp) {
                maior = temp;
            }
        }
        texto = maior;
    }
    solucion.innerHTML = texto;
}



//exercicio13
function resolver13b3(num1, num2, num3) {
    var texto = "";
    var temp = 0;
    var temp2 = 0;
    num1 = parseInt(num1);
    num2 = parseInt(num2);
    num3 = parseInt(num3);
    while (num2 !== 0) {
        temp = num2;
        num2 = num1 % num2;
        num1 = temp;
    }

    while (num3 !== 0) {
        temp2 = num3;
        num3 = temp % num3;
        temp = temp2;
    }
    texto = temp;
    solucion.innerHTML = texto;
}

//exercicio14
function resolver14b3(num) {
    var texto = "";
    var temp = 0;
    var total = 0;
    if (isNaN(num)) {
        texto = "Introduce un número";
    } else {
        for (let i = 0; i < num.length; i++) {
            temp = parseInt(num.charAt(i));
            total += parseInt(temp);
        }
        texto = total;
    }
    solucion.innerHTML = texto;
}

//exercicio15
function resolver15b3(num) {
    var texto = "";
    var temp = 0;
    if (isNaN(num)) {
        texto = "Introduce un número";
    } else {
        num = parseInt(num);
        if (num % 2 == 0) {
            texto += "É par <br/>";
        }
        if (primo(num)) {
            texto += "É primo <br/>";
        }
        temp = Math.trunc(Math.sqrt(num));
        if (temp * temp == num) {
            texto += "É cadrado perfecto <br/>";
        }
    }
    solucion.innerHTML = texto;
}

function primo(numero) {

    for (var i = 2; i < numero; i++) {

        if (numero % i === 0) {
            return false;
        }

    }

    return numero !== 1;
}

//exercicio16
function resolver16b3(num) {
    var texto = "";
    var temp = 0;
    var maior = 0;
    var posicion = 0;
    if (isNaN(num)) {
        texto = "Introduce un número";
    } else {
        for (let i = 0; i <= num.length; i++) {
            temp = parseInt(num.charAt(i));
            if (maior < temp) {
                maior = temp;
                posicion = i;
            }
        }
        texto = posicion + 1;
    }
    solucion.innerHTML = texto;
}

//exercicio17

function resolver17b3(num1, num2) {
    var texto = "";
    num1 = parseInt(num1);
    num2 = parseInt(num2);
}