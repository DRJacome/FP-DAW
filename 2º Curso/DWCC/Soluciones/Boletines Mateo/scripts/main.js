const NUM_BOLETINES = 6;
var numExercicios = 0;

function cargarMenu() {
    menu.innerHTML = "";
    for (let i = 1; i <= NUM_BOLETINES; i++) {
        menu.innerHTML += "<div id='boletin" + i + "'onclick='cargarSubmenu(" + i + ")' class='menu'>Boletin " + i + "</div>";
    }
}

function cargarSubmenu(opcion) {
    inicializarEstetica(opcion);
    switch (opcion) {
        case 1:
            numExercicios = 16;
            break;
        case 2:
            numExercicios = 18;
            break;
        case 3:
            numExercicios = 23;
            break;
        default:
            numExercicios = 0;
    }
    for (let i = 1; i <= numExercicios; i++) {
        submenu.innerHTML += '<button id="exercicio' + i + '" onclick="chamarFuncion(' + opcion + ',' + i + ')">Exercicio' + opcion + '.' + i + '</button>';
    }
}

function opcionSubmenu(exercicio) {
    for (let i = 1; i <= numExercicios; i++) {
        document.getElementById("exercicio" + i).classList.remove("activo");
    }
    document.getElementById("exercicio" + exercicio).classList.add("activo");
}

function chamarFuncion(boletin, exercicio) {
    opcionSubmenu(exercicio);
    switch (boletin) {
        case 1:
            break;
        case 2:
            break;
        case 3:
            switch (exercicio) {
                case 1:
                    enunciado.innerHTML = "<br/>Suma dos primeiros 50 números naturais.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "()'>Calcular</button>" + "</form>";
                    break;
                case 2:
                    enunciado.innerHTML = "<br/>Imprimir un contador do 0 ao 100.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "()'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 3:
                    enunciado.innerHTML = "<br/>Suma dos números pares existentes entre o 0 e o 100.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "()'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 4:
                    enunciado.innerHTML = "<br/>Imprimir os números primos existentes entre o 0 e o 100.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "()'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 5:
                    enunciado.innerHTML = "<br/>Cálculo do Factorial dun número calquera.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='num'>Número: </label> <input id='num'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(num.value)'>Calcular</button>" + "</form>";
                    break;
                case 6:
                    enunciado.innerHTML = "<br/>Imprime a serie 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5...<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='limite'>Límite da serie: </label> <input id='limite'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(limite.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 7:
                    enunciado.innerHTML = "<br/>Imprime a serie 0, 1, -1, 2, -2, 3, -3, 4, -4...<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='limite'>Límite da serie: </label> <input id='limite'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(limite.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 8:
                    enunciado.innerHTML = "<br/>Imprime a serie de Fibonacci; é dicir, a serie que, empezando polo 1, presenta como seguinte elemento a suma dos dous anteriores: 1, 1, 2, 3, 5, 8, 13...<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='limite'>Límite da serie: </label> <input id='limite'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(limite.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 9:
                    enunciado.innerHTML = "<br/>Imprime a serie 0, 1, 4, 3, 16, 5, 36...; é dicir n<sup>2</sup>, n+1, (n+2)<sup>2</sup>, n+3...<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='limite'>Límite da serie: </label> <input id='limite'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(limite.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 10:
                    enunciado.innerHTML = "<br/>Dado un número N, amosar por pantalla todas as combinacións de dous números naturais que sumados dean N.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='num'>Número: </label> <input id='num'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(num.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 11:
                    enunciado.innerHTML = "<br/>Calcular a probabilidade de que dous dados lanzados sumen 7 e amósala por pantalla.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "()'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 12:
                    enunciado.innerHTML = "<br/>Dados N números, indica cal é o maior.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='num'>Número: </label> <input id='num'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(num.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 13:
                    enunciado.innerHTML = "<br/>Dados 3 números, calcular o máximo común divisor.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='num1'>Número 1: </label> <input id='num1'> <br/>" +
                        "<label for='num2'>Número 2: </label> <input id='num2'> <br/>" +
                        "<label for='num3'>Número 3: </label> <input id='num3'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(num1.value, num2.value, num3.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 14:
                    enunciado.innerHTML = "<br/>Dado un número, sacar por pantalla a suma dos díxitos que o forman.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='num'>Número: </label> <input id='num'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(num.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 15:
                    enunciado.innerHTML = "<br/>Dado un número, indicar se é par, se é primo e se é cadrado perfecto.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='num'>Número: </label> <input id='num'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(num.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 16:
                    enunciado.innerHTML = "<br/>Escribir un programa que lea N números enteiros e indique en que posición introducimos o valor máximo.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='num'>Número: </label> <input id='num'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(num.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 17:
                    enunciado.innerHTML = "<br/>Escribir un programa que calcule o máximo común divisor de dous números naturais positivos segundo o algoritmo de Euclides, que consiste en ir restando o número menor ao maior ata obter dous números iguais, momento no que temos o máximo común divisor.<br/><br/>";
                    datos.innerHTML = "<form>" +
                        "<label for='num1'>Número 1: </label> <input id='num1'> <br/>" +
                        "<label for='num2'>Número 2: </label> <input id='num2'> <br/>" +
                        "<button type='button' onclick='resolver" + exercicio + "b" + boletin + "(num1.value, num2.value)'>Calcular</button>" + "</form>";
                    solucion.innerHTML = "";
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                case 21:
                    break;
                case 22:
                    break;
                case 23:
                    break;
                default:
            }
            solucion.innerHTML = "";
            break;
        default:
            alert("Boletín aínda non resolto")
    }
}

function inicializarEstetica(opcion) {
    for (let i = 1; i <= NUM_BOLETINES; i++) {
        document.getElementById("boletin" + i).classList.remove("activo");
    }
    document.getElementById("boletin" + opcion).classList.add("activo");

    enunciado.innerHTML = "";
    datos.innerHTML = "";
    solucion.innerHTML = "";
    submenu.innerHTML = "";
}