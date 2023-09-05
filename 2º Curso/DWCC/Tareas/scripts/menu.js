const NUM_BOLETINS = 6;
var numExercicios = 0;
var contador = 0;
var aciertos = 0;

function cargarMenu() {
    var texto = "";
    for (let i = 1; i <= NUM_BOLETINS; i++) {
        texto += '<div id="boletin' + i + '" class="menu" onclick="cargarSubmenu(' + i + ')">Boletín ' + i + '</div>';
    }
    menu.innerHTML = texto;
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
        case 4:
            numExercicios = 13;
            break;
        case 5:
            break;
        case 6:
            numExercicios = 16;
            break;
        default:
            numExercicios = 0;
    }
    var texto = '<div>';
    for (let i = 1; i <= numExercicios; i++) {
        texto += '<div id="exercicio' + i + '"class="submenu" onclick="contador = 0; aciertos = 0; iteracion = 1; vector = new Array(); suma = 0; PedirDatos(' + opcion + ',' + i + ')">Ejercicio' + opcion + '_' + i + '</div>';
    }
    texto += '</div>';
    submenu.innerHTML = texto;
}

function opcionSubmenu(exercicio) {
    for (let i = 1; i <= numExercicios; i++) {
        document.getElementById("exercicio" + i).classList.remove("activo");
    }
    document.getElementById("exercicio" + exercicio).classList.add("activo");
}

function inicializarEstetica(opcion) {
    for (let i = 1; i < NUM_BOLETINS; i++) {
        document.getElementById("boletin" + i).classList.remove("activo");
    }
    document.getElementById("boletin" + opcion).classList.add("activo");

    enunciado.innerHTML = "";
    datos.innerHTML = "";
    resultado.innerHTML = "";
    submenu.innerHTML = "";
}

function amosarResultado(texto) {
    resultado.innerHTML = texto;
}

function PedirDatos(boletin, exercicio) {
    opcionSubmenu(exercicio);
    switch (boletin) {
        case 1:
            break;
        case 2:
            break;
        case 3:
            switch (exercicio) {
                case 1:
                    enunciado.innerHTML = "Suma dos primeiros 50 números naturais.";
                    datos.innerHTML =
                        '<form>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 2:
                    enunciado.innerHTML = "Imprimir un contador do 0 ao 100.";
                    datos.innerHTML =
                        '<form>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 3:
                    enunciado.innerHTML = "Suma dos números pares existentes entre o 0 e o 100.";
                    datos.innerHTML =
                        '<form>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 4:
                    enunciado.innerHTML = "Imprimir os números primos existentes entre o 0 e o 100.";
                    datos.innerHTML =
                        '<form>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 5:
                    enunciado.innerHTML = "Cálculo do Factorial dun número calquera.";
                    datos.innerHTML =
                        '<form>' +
                        '<p><label for="num">Introduce un número natural mayor que 1:</label><input id=num></p>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(num.value)">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 6:
                    enunciado.innerHTML = "Imprime a serie 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5...";
                    datos.innerHTML =
                        '<form>' +
                        '<p><label for="limite">Introduce un número de finalización:</label><input id="limite"></p>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(limite.value)">Imprimir</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 7:
                    enunciado.innerHTML = "Imprime a serie 0, 1, -1, 2, -2, 3, -3, 4, -4...";
                    datos.innerHTML =
                        '<form>' +
                        '<p><label for="limite">Introduce un número de finalización:</label><input id="limite"></p>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(limite.value)">Imprimir</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 8:
                    enunciado.innerHTML = "Imprime a serie de Fibonacci; é dicir, a serie que, empezando polo 1, " +
                        "presenta como seguinte elemento a suma dos dous anteriores: 1, 1, 2, 3, 5, 8, 13...";
                    datos.innerHTML =
                        '<form>' +
                        '<p><label for="limite">Indica cuántos numeros quieres imprimir de la serie:</label><input id="limite"></p>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(limite.value)">Imprimir Serie</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 9:
                    enunciado.innerHTML = "Imprime a serie 0, 1, 4, 3, 16, 5, 36...; é dicir n<sup>2</sup>, n+1, (n+2)<sup>2</sup>, n+3...";
                    datos.innerHTML =
                        '<form>' +
                        '<p><label for="limite">Límite da serie: </label><input id="limite"></p>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(limite.value)">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 10:
                    enunciado.innerHTML = "Dado un número N, amosar por pantalla todas as combinacións de dous números naturais que sumados dean N.";
                    datos.innerHTML = '<form>' +
                        '<label for="num">Número:</label><input id="num"> <br/>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(num.value)">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 11:
                    enunciado.innerHTML = "Calcular a probabilidade de que dous dados lanzados sumen 7 e amósala por pantalla.";
                    datos.innerHTML =
                        '<form>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 12:
                    enunciado.innerHTML = "Dados N números, indica cal é o maior.";
                    datos.innerHTML = '<form>' +
                        '<p><label for="numero">Introduce números:</label><input id="numero"></p>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(numero.value)">Calcular</button>' +
                        '</form>';
                    if (primeraVez) {
                        resultado.innerHTML = "";
                    }
                    break;
                case 13:
                    enunciado.innerHTML = "Dados 3 números, calcular o máximo común divisor.";
                    datos.innerHTML =
                        '<form>' +
                        '<label for="num1">Número 1: </label><input id="num1">' +
                        '<label for="num2">Número 2: </label><input id="num2">' +
                        '<label for="num3">Número 3: </label><input id="num3">' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(num1.value, num2.value, num3.value)">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 14:
                    enunciado.innerHTML = "Dado un número, sacar por pantalla a suma dos díxitos que o forman.";
                    datos.innerHTML =
                        '<form>' +
                        '<label for="num">Número: </label><input id="num">' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(num.value)">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 15:
                    enunciado.innerHTML = "Dado un número, indicar se é par, se é primo e se é cadrado perfecto.";
                    datos.innerHTML =
                        '<form>' +
                        '<label for="num">Número: </label><input id="num">' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(num.value)">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 16:
                    enunciado.innerHTML = "Escribir un programa que lea N números enteiros e indique en que posición introducimos o valor máximo.";
                    datos.innerHTML =
                        '<form>' +
                        '<label for="num">Número: </label> <input id="num">' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(num.value)">Calcular</button>' +
                        '</form>';
                    solucion.innerHTML = "";
                    break;
                case 17:
                    enunciado.innerHTML = "Escribir un programa que calcule o máximo común divisor de dous números naturais positivos segundo o algoritmo de Euclides," +
                        " que consiste en ir restando o número menor ao maior ata obter dous números iguais, momento no que temos o máximo común divisor.";
                    datos.innerHTML =
                        '<form>' +
                        '<label for="num1">Número 1: </label><input id="num1">' +
                        '<label for="num2">Número 2: </label><input id="num2">' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(num1.value, num2.value)">Calcular</button>' +

                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 18:
                    enunciado.innerHTML = "Escribir un programa que amose todas as fichas do xogo do dominó.";
                    datos.innerHTML =
                        '<form>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Mostrar</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 19:
                    enunciado.innerHTML = 'Debuxar por pantalla con asteriscos o número de liñas que introduce o usuario (cada liña debe ter o número de asteriscos que se corresponde co número de liña)';
                    datos.innerHTML =
                        '<p><label for="numero">Número de liñas: </label><input id="numero" type="text"/></p>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(numero.value)">Premer</button>';
                    break;
                case 20:
                    enunciado.innerHTML = 'Debuxar por pantalla con asteriscos un cadrado usando o número de liñas que introduce o usuario (a liña inferior e superior debe ter o número de asteriscos que introduce o usuario)';
                    datos.innerHTML =
                        '<p><label for="numero">Número de liñas: </label><input id="numero" type="text"/></p>' +
                        '<button type="button" onClick="resolver_' + boletin + '_' + exercicio + '(numero.value);">Premer</button>';
                    break;
                case 21:
                    enunciado.innerHTML = '<p>Vamos facer unha simulación do xogo da canción infantil <span class="negra">pim-pam-pum</span>. Consiste en ir dicindo alternativamente cada neno os números naturais dende o 1 ata o 30 de maneira que:</p>' +
                        '<ul>' +
                        '<li>Se o número é divisible por 2 dise <span class="negra">pim</span></li>' +
                        '<li>Se o número é divisible por 3 dise <span class="negra">pam</span></li>' +
                        '<li>Se o número é divisible por 5 dise <span class="negra">pum</span></li>' +
                        '<li>Se é divisible por máis dun número faise a combinación correspondente</li>' +
                        '<li>Se non é divisible por ningún dos números dise o número</li>' +
                        '</ul>' +
                        '<p>NOTA: </p>' +
                        '<p>En vez de dicilo, pintámolo por pantalla en liñas distintas sabendo que xogan 3 persoas e indicando cal delas está a falar en cada momento.</p>' +
                        '<p>EXEMPLO:</p>' +
                        '<code>Persoa 1: 1</code><br>' +
                        '<code>Persoa 2: pim</code><br>' +
                        '<code>Persoa 3: pam</code><br>' +
                        '<code>Persoa 1: pim</code><br>' +
                        '<code>Persoa 2: pum</code><br>' +
                        '<code>Persoa 3: pim pam</code><br>' +
                        '<code>Persoa 1: 7</code><br>' +
                        '<code>...</code>';
                    datos.innerHTML =
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Calcular</button>';
                    resultado.innerHTML = "";
                    break;
                case 22:
                    enunciado.innerHTML = "Crea unha xanela coa pregunta Ata que número quere calcular? de forma que non se peche ata que se prema un número enteiro positivo.<br>" +
                        " Cando se peche debe sacar por pantalla en liñas diferentes de maior a menor a suma dos números primos ata o valor introducido, evitando duplicados.";
                    datos.innerHTML =
                        '<form>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Calcular</button>' +
                        '</form>';
                    break;
                case 23:
                    enunciado.innerHTML = "Precisamos realizar un control da existencia ou non de determinados ficheiros nun cartafol;<br>" +
                        " todos estes ficheiros teñen un número de rexistro consecutivo.<br>" +
                        " O programa debe permitir escoller:<br>" +
                        " - o número de rexistro inicial.<br>" +
                        " - o número de rexistro final.<br>" +
                        " - o cartafol onde están os ficheiros.<br>" +
                        "O resultado debe indicar que ficheiros faltan.";
                    datos.innerHTML =
                        '<form>' +
                        '<p><label for="numInicial">Introduzca el número de registro inicial</label><input id="numInicial"></p><br>' +
                        '<p><label for="numFinal">Introduzca el número de registro Final</label><input id="numFinal"></p>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(numInicial.value, numFinal,value)">Buscar</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                default:
                    alert("Ejercicio aún no resuelto.");
            }
            break;
        case 4:
            switch (exercicio) {
                case 1:
                    enunciado.innerHTML = "Imprimir os valores dun vector de 100 elementos.";
                    datos.innerHTML =
                        '<form>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Imprimir</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 2:
                    enunciado.innerHTML = "Lee unha matriz de 5x6, e imprime a suma total da matriz.";
                    datos.innerHTML =
                        '<form>' +
                        '<p><label for="numero">Introduce un valor para rellenar la matriz:</label><input id="numero"><p><br>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(numero.value)">Imprimir</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 3:
                    enunciado.innerHTML = "Lee un vector numérico de dimensión 10 e determina cantos elementos son positivos, " +
                        " negativos e ceros, imprimindo por pantalla cada un deles, para finalmente imprimir os contadores por pantalla.";
                    datos.innerHTML =
                        '<form>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Imprimir</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 4:
                    enunciado.innerHTML = "Ordena ascendentemente unha serie de números dados.";
                    datos.innerHTML =
                        '<form>' +
                        '<p><label for="mensaxe">' + iteracion + 'º número a introducir:</label><input id="mensaxe"></p>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(mensaxe.value)">Ordenar</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 5:
                    enunciado.innerHTML = "Dados 10 números, introducilos nun vector e amosar a media e a suma.";
                    datos.innerHTML =
                        '<form>' +
                        '<p><label for="mensaxe">' + iteracion + 'º número a introducir:</label><input id="mensaxe"></p>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(mensaxe.value)">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 6:
                    enunciado.innerHTML = "Encher unha matriz 3x3 e amosar a diagonal principal.";
                    var FILAS = 3;
                    var formulario = "Rellena la siguiente matriz:<br>";
                    for (let i = 0; i < FILAS; i++) {
                        for (let j = 0; j < FILAS; j++) {
                            formulario += '<input id="numero ' + i + '_' + j + '" type="text"/>';
                        }
                        formulario += '<br>';
                    }
                    datos.innerHTML =
                        '<form>' + formulario +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(' + FILAS + ')">Imprimir</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 7:
                    enunciado.innerHTML = "Solicitar os datos dunha matriz 3x4 e amosala trasposta.";
                    var FILAS = 3;
                    var COLUMNAS = 4;
                    var formulario = "Rellena la siguiente matriz:<br>";
                    // Uso un for para crear 9 inputs que formen un cuadrado por pantalla.
                    for (let i = 0; i < FILAS; i++) {
                        for (let j = 0; j < COLUMNAS; j++) {
                            formulario += '<input id="numero ' + i + '_' + j + '" type="text"/>';
                        }
                        formulario += '<br>';
                    }
                    datos.innerHTML =
                        '<form>' +
                        formulario +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(' + FILAS + ',' + COLUMNAS + ')">Imprimir</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 8:
                    enunciado.innerHTML = "Dado un vector de N elementos, modificar ese vector para que cada elemento conteña a suma dos anteriores.";
                    datos.innerHTML =
                        '<form>' +
                        '<label for="limite">¿Cuántos números tendrá el vector?</label><input id="limite" type="text"/><br>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(limite.value)">Imprimir</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 9:
                    enunciado.innerHTML = "Dado un vector de N elementos, devolver outro vector cos elementos ao revés.";
                    datos.innerHTML =
                        '<form>' +
                        '<label for="limite">Introduce un límite:</label><input id="limite" type="text"/>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(limite.value)">Imprimir</button>' +
                        '</form>';
                    break;
                case 10:
                    enunciado.innerHTML = "Escribir un programa para ler 10 números por teclado e indicar cantos son maiores que a media.";
                    datos.innerHTML =
                        '<form>' +
                        '<p><label for="mensaxe">' + iteracion + 'º número a introducir:</label><input id="mensaxe"></p>' +
                        '<button id="boton" type="button" onclick="resolver_' + boletin + '_' + exercicio + '(mensaxe.value)">Calcular</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 11:
                    enunciado.innerHTML = "Crea unha función que reciba un vector bidimensional que contén as posicións dunha partida de xadrez e que pinte o taboleiro correspondente.";
                    datos.innerHTML =
                        '<form>' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '()">Imprimir</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 12:
                    enunciado.innerHTML = "Crea unha función que reciba dous vectores e que, dependendo da decisión do usuario, xere outro vector coa unión ou intersección dos vectores iniciais.<br>" +
                        "NOTA: No vector resultante NON deben aparecer elementos repetidos.<br>" +
                        "EXEMPLO:<br>" +
                        "vector_A = [1,'a',2,'t']<br>" +
                        "vector_B = [3,2,1]<br>" +
                        "// Os vectores solución non teñen por que estar ordenados pero seguro que así resulta máis doado.<br>" +
                        "union = [1,2,3,'a','t']<br>" +
                        "interseccion = [1,2]";
                    datos.innerHTML =
                        '<form>' +
                        '<button id="union" type="button" onclick="resolver_' + boletin + '_' + exercicio + '(this.id)">Unión</button>' +
                        '<button id="interseccion" type="button" onclick="resolver_' + boletin + '_' + exercicio + '(this.id)">Imprimir</button>' +
                        '</form>';
                    resultado.innerHTML = "";
                    break;
                case 13:
                    enunciado.innerHTML = "Crea un vector de números dun tamaño introducido por teclado, éncheo con números aleatorios primos menores que 100 e indica cal é o maior de todos eles.";
                    datos.innerHTML =
                        '<label for="limite">¿Qué tamaño tendrá el vector?</label><input id="limite" type="text">' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(this.id)">Imprimir</button>' +
                        '</form>';
                    break;
                default:
                    alert("Ejercicio aún no resuelto.");
            }
            break;
        case 5:
            break;
        case 6:
            switch (exercicio) {
                case 1:
                    let partidos = ["partido 1", "partido 2", "partido 3", "partido 4", "partido 5", "partido 6", "partido 7"];
                    pronosticos = new Array("", "", "", "", "", "", "");
                    enunciado.innerHTML = "<p>Calcula se gañaches a porra dos partidos da Liga de Campións e da Copa da UEFA, " +
                        "sabendo que as apostas eran sobre cinco partidos da Liga de Campións e dous da Copa da UEFA e só se podía apostar 1, X ou 2 en cada partido.</p>";
                    for (let i = 0; i < partidos.length; i++) {
                        datos.innerHTML +=
                            '<div id="partido' + i + '">' + partidos[i] +
                            '<span id="Resultado' + i + '1" class="resultado" onclick="marcar(this.id)"/>1</span>' +
                            '<span id="Resultado' + i + 'X" class="resultado" onclick="marcar(this.id)"/>X</span>' +
                            '<span id="Resultado' + i + '2" class="resultado" onclick="marcar(this.id)"/>2</span>';
                    }
                    datos.innerHTML +=
                        '<button type=button" onclick="comprobar()">Comprobar resultados</button>';
                    break;
                case 2:
                    enunciado.innerHTML = "Vamos botar unha partida de tute. Despois de repartir as cartas comproba se algún dos contrincantes pode cantar.";
                    datos.innerHTML = '<button type="button" onclick="tute()">Comprobar</button>';
                    tute();
                    resultado.innerHTML = "";
                    break;
                case 3:
                    enunciado.innerHTML = "Saber se un alumno está aprobado ou suspenso na materia, " +
                        "tendo en conta que para aprobar debe ter unha nota maior ou igual a 4 nos exames parciais teóricos e prácticos, " +
                        "sempre e cando a nota media dos exames sexa superior ou igual a 5.";
                    exames();
                    resultado.innerHTML = "";
                    break;
                case 4:
                    enunciado.innerHTML = "Converter un número romano introducido no seu equivalente arábigo.";
                    validarRomano();
                    break;
                case 5:
                    enunciado.innerHTML = "Converter un número arábigo introducido no seu equivalente romano.";
                    datos.innerHTML =
                        '<label for="numArabigo">Introduce un número entre 1 y 3999:</label><input id="numArabigo">' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(numArabigo.value)">Calcular</button>';
                    break;
                case 6:
                    enunciado.innerHTML = "Indicar que tipo de triángulo é (equilátero, isósceles, escaleno ou non é un triángulo) a partir das medidas dos lados introducidas por teclado.";
                    datos.innerHTML =
                        '<form>' +
                        '<label for="ladoA">¿Cuánto mide el primer lado?</label><input id="ladoA"><br><br>' +
                        '<label for="ladoB">¿Cuánto mide el segundo lado?</label><input id="ladoB"><br><br>' +
                        '<label for="ladoC">¿Cuánto mide el tercer lado?</label><input id="ladoC"><br><br>' +
                        '<button type ="button" onclick="resolver_' + boletin + '_' + exercicio + '(ladoA.value, ladoB.value, ladoC.value)">Consultar</button>' +
                        '</form>';
                    break;
                case 7:
                    enunciado.innerHTML = "Dada unha frase, comprobar se é palíndromo.";
                    datos.innerHTML =
                        '<form>' +
                        '<label for="frase">Introduce una frase:</label><input id="frase" type="text">' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(frase.value)">Comprobar</button>' +
                        '</form>';
                    break;
                case 8:
                    enunciado.innerHTML = "Dado un número variable de figuras xeométricas (triángulo, cadrado, rectángulo e círculo) amosar a área de cada unha delas e dicir cal é a máis grande. " +
                        "O dato de entrada serán os lados.";
                    datos.innerHTML = '';
                    break;
                case 9:
                    enunciado.innerHTML = "Facer unha páxina que xere dous números do 0 ao 9 aleatoriamente que estarán colocados en dúas caixas. " +
                        "Terá que existir un botón para que os xere e outro para que os compare. Cando os compare terá que indicar se son iguais ou non, transferindo o maior dos dous a outra caixa.";
                    datos.innerHTML = '';
                    break;
                case 10:
                    enunciado.innerHTML = "Recoller unha frase mediante un formulario e sacar despois unha estatística por pantalla onde se indique, " +
                        "por separado, cantas letras, números e outro tipo de caracteres hai na frase introducida.";
                    datos.innerHTML =
                        '<label for="apuesta">¿Cuál será tu apuesta (1, x o 2)?</label><input id="apuesta">' +
                        '<button type="button" onclick="resolver_' + boletin + '_' + exercicio + '(apuesta.value)">Enviar apuesta</button>' +
                        '</form>';
                    break;
                case 11:
                    enunciado.innerHTML = "Amosar por pantalla a táboa de multiplicar dun número dado.";
                    datos.innerHTML = '';
                    break;
                case 12:
                    enunciado.innerHTML = "Realizar un programa que permita avaliar a capacidade dun neno para realizar as catro operacións aritméticas básicas. " +
                        "O programa deberá presentar 10 operacións (xeradas aleatoriamente) con números positivos de 2 cifras, dando un máximo de 3 oportunidades por operación. " +
                        "O programa contará o número de oportunidades empregadas, contando 5 no caso de fallar 3 veces a mesma operación, " +
                        "e ao final amosará unha mensaxe de avaliación " +
                        "(10 oportunidades: PERFECTO; 11 ou 12 oportunidades: EXCELENTE; de 13 a 15: BEN; de 16 a 20: REGULAR; de 21 a 30: MAL; máis de 30: LAMENTABLE).";
                    datos.innerHTML = '';
                    break;
                case 13:
                    enunciado.innerHTML = "No Parking de Lalín precisan que programemos as máquinas de cobro. " +
                        "Estas admiten para o mesmo billetes de 20, 10 e 5 euros e moedas de 2 e 1 euro e 50, 20, 10 e 5 céntimos. " +
                        "Realiza un programa que devolva o cambio nas mínimas pezas posibles " +
                        "(Por exemplo: tendo que pagar 2,55 euros e introducindo un billete de 5 devolva 1 moeda de 2 euros, 2 moedas de 20 céntimos e 1 moeda de 5 céntimos).";
                    datos.innerHTML = '';
                    break;
                case 14:
                    enunciado.innerHTML = "Escribir un número decimal positivo en letra, tomando dun ou varios vectores os literais.";
                    datos.innerHTML = '';
                    break;
                case 15:
                    enunciado.innerHTML = "Queremos crear unha axenda electrónica dos nosos contactos na que poidamos: " +
                        "Introducir un novo contacto (os datos que debemos recabar son o nome, o teléfono e o correo electrónico). " +
                        "Eliminar un contacto existente. " +
                        "Listar os contactos. " +
                        "Procurar contactos. " +
                        "NOTA: Simularemos a base de datos cun vector bidimensional, a clave que usaremos será o teléfono e NON debe haber elementos duplicados.";
                    datos.innerHTML = '';
                    break;
                case 16:
                    enunciado.innerHTML = "Queremos facer unha táboa clasificatoria dunha competición deportiva, " +
                        "onde se se preme no nome dun dos equipos se amosen as imaxes dos xogadores que compoñen ese equipo " +
                        "e se pasamos co rato por riba dunha delas apareza un texto informativo lateral cos datos do xogador.";
                    datos.innerHTML = '';
                    break;
                default:
            }
            break;
        default:
            alert("Boletín aún no resuelto.");
    }
}