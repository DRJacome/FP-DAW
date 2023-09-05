//exercicio1
function exercicio1b1() {

    enunciado.innerHTML = "<br/>Suma de dous números e impresión do resultado.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num1'>Número 1: </label> <input id='num1'> <br/>" +
        "<label for='num2'>Número 2: </label> <input id='num2'><br/>" +
        " <button type='button' onclick='suma(num1.value, num2.value)'>Sumar</button>" + "</form>";

}

function suma(n1, n2) {
    var suma = (parseFloat(n1) + parseFloat(n2));
    solucion.innerHTML = "O resultado é: " + suma.toFixed(2);
}

//exercicio2
function exercicio2b1() {
    enunciado.innerHTML = "<br/>Un individuo quere investir o seu capital nun banco e desexa saber cantos cartos aforrará despois de tres meses, se o banco paga a razón do 2% mensual.<br/><br/>";
    datos.innerHTML = "<form>' + '<label for='capital'>Capital: </label> <input id='capital'> <br/> " +
        "<button type='button' onclick='calcularAforro(capital.value)'>Calcular</button>" + "</form>";
}

function calcularAforro(capitalInicial) {
    capitalInicial = parseFloat(capitalInicial);
    const PAGOMENSUAL = 0.02;
    var total = capitalInicial + capitalInicial * PAGOMENSUAL;
    total += total * PAGOMENSUAL;
    total += total * PAGOMENSUAL;
    var ahorro = total - capitalInicial;

    solucion.innerHTML = "O aforro total sería de " + ahorro.toFixed(2) + "€";
}

//exercicio3
function exercicio3b1() {
    enunciado.innerHTML = "<br/>Unha tenda ofrece un desconto do 15% sobre o total da compra, e un cliente desexa saber canto deberá pagar finalmente pola súa compra.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='pago'>Pago da compra: </label> <input id='pago'> <br/>" +
        " <button type='button' onclick='calcularDesconto(pago.value)'>Calcular</button>" + "</form>";
}

function calcularDesconto(pagoTotal) {
    pagoTotal = parseFloat(pagoTotal);
    const DESCUENTO = 0.15;
    var precioFinal = pagoTotal - pagoTotal * DESCUENTO;

    solucion.innerHTML = "Prezo final tras o desconto " + precioFinal.toFixed(2);
}

//exercicio4
function exercicio4b1() {
    enunciado.innerHTML = "<br/>Porcentaxe de homes e porcentaxe de mulleres que hai en clase nun momento determinado.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='homes'>Cantidade de homes: </label> <input id='homes'> <br/>" +
        "<label for='mulleres'>Cantidade de mulleres: </label> <input id='mulleres'><br/>" +
        " <button type='button' onclick='calcularPorcentaxe(homes.value, mulleres.value)'>Calcular</button>" + "</form>";
}

function calcularPorcentaxe(h, m) {
    h = parseInt(h);
    m = parseInt(m);
    var total = h + m;
    var porcHomes = h / total * 100;
    var porcMulleres = m / total * 100;

    solucion.innerHTML = "<br/>Porcentaxe de homes: " + porcHomes.toFixed(2) + "%" + "<br/>" + "Porcentaxe de mulleres: " + porcMulleres.toFixed(2) + "%";
}

//exercicio5
function exercicio5b1() {
    enunciado.innerHTML = "<br/>Dada unha cantidade en euros, obter a equivalencia en pesetas e en dólares.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='euros'>Cantidade en euros: </label> <input id='euros'> <br/>" +
        "<label for='dolares'>Precio do dólar: </label> <input id='dolares'><br/>" +
        " <button type='button' onclick='calcularEquivalencia(euros.value, dolares.value)'>Calcular</button>" + "</form>";
}

function calcularEquivalencia(e, d) {
    const PESETA = 166.386;
    var pesetas = parseFloat(e) * PESETA;
    var dolares = parseFloat(e) * parseFloat(d);

    solucion.innerHTML = e + "€ teñen un valor de " + pesetas.toFixed(2) + " pesetas" + "<br/>" + e + "€ teñen un valor de " + dolares.toFixed(2) + " dólares";
}
//exercicio6
function exercicio6b1() {
    enunciado.innerHTML = "<br/>Calcular o numero de pulsacións que ten unha persoa por cada dez segundos de exercicio se a fórmula é numeroDePulsacions = (220-idade)/6.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='idade'>Idade: </label> <input id='idade'> <br/>" +
        " <button type='button' onclick='calcularPulsacions(idade.value)'>Calcular</button>" + "</form>";
}

function calcularPulsacions(anos) {
    var numPulsacions = (220 - parseInt(anos)) / 6;
    solucion.innerHTML = "Pulsacións totais cada dez segundos con " + anos + " anos " + numPulsacions.toFixed(0);
}

//exercicio7
function exercicio7b1() {
    enunciado.innerHTML = "<br/>Dados dous números, calcula a división do primeiro entre o segundo e imprímea por pantalla.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num1'>Número 1: </label> <input id='num1'> <br/>" +
        "<label for='num2'>Número 2: </label> <input id='num2'><br/>" +
        " <button type='button' onclick='division(num1.value, num2.value)'>Dividir</button>" + "</form>";
}

function division(n1, n2) {
    var division = parseFloat(n1) / parseFloat(n2);
    solucion.innerHTML = "O resultado da división é " + division.toFixed(2);
}

//exercicio8
function exercicio8b1() {
    enunciado.innerHTML = "<br/>Un vendedor recibe o soldo base máis un 10% extra de comisión polas súas vendas; o vendedor quere saber cantos cartos obterá no concepto de comisións polas tres vendas que realizou no mes pasado e o total que recibirá no mes.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='salario'>Salario base:</label> <input id='salario'> <br/>" +
        "<label for='venda1'>Valor da venda 1: </label><input id='venda1'><br/>" +
        "<label for='venda2'>Valor da venda 2: </label><input id='venda2'><br/>" +
        "<label for='venda3'>Valor da venda 3: </label><input id='venda3'><br/>" +
        " <button type='button' onclick='calcularSalario(salario.value, venda1.value, venda2.value, venda3.value)'>Calcular</button>" + "</form>";
}

function calcularSalario(sal, v1, v2, v3) {
    const COMISION = 0.1;
    var ventas = parseFloat(v1) + parseFloat(v2) + parseFloat(v3);
    var total = parseFloat(sal) + (ventas * COMISION);

    solucion.innerHTML = "Salario total con comisións " + total.toFixed(2);
}
//exercicio9
function exercicio9b1() {
    enunciado.innerHTML = "<br/>Escribir un programa que lea os 3 coeficientes reais a, b, c dun polinomio de segundo grao e que determine as súas raíces reais.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='valorA'>Valor de a: </label><input id='valorA'> <br/>" +
        "<label for='valorB'>Valor de b: </label><input id='valorB'><br/>" +
        "<label for='valorC'>Valor de c: </label><input id='valorC'><br/>" +
        " <button type='button' onclick='calcularRaizReal(valorA.value, valorB.value, valorC.value)'>Calcular</button>" + "</form>";

}

function calcularRaizReal(a, b, c) {
    a = parseFloat(a);
    b = parseFloat(b);
    c = parseFloat(c);
    var polinomio1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    var polinomio2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

    solucion.innerHTML = "Polinomio positivo " + polinomio1 + "<br/>" + "Polinomio negativo " + polinomio2;
}

//exercicio10
function exercicio10b1() {
    enunciado.innerHTML = "<br/>Escribir un programa que pida unha temperatura en graos Fahrenheit e calcular e amosar o seu equivalente en graos Celsius, ambos admitindo dous decimais.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='fahrenheit'>Grados Fahrenheit: </label><input id='fahrenheit'> <br/>" +
        " <button type='button' onclick='calcularGrados(fahrenheit.value)'>Calcular</button>" + "</form>";
}

function calcularGrados(f) {
    var celsius = (parseFloat(f) - 32) * 5 / 9;
    solucion.innerHTML = parseFloat(f) + " grados Fahrenheit equivalen a " + celsius.toFixed(1) + " grados celsius";
}

//exercicio11
function exercicio11b1() {
    enunciado.innerHTML = "<br/>Escribir un programa que obteña a equivalencia en polgadas, pés e millas dunha cantidade introducida en metros.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='metros'>Metros: </label><input id='metros'> <br/>" +
        " <button type='button' onclick='calcularDistancias(metros.value)'>Calcular</button>" + "</form>";

}

function calcularDistancias(m) {
    m = parseFloat(m);
    var pulgadas = m * 39.3701;
    var pies = m * 3.28084;
    var millas = m * 0.000621371;

    solucion.innerHTML = m + " metros equivalen a " + millas.toFixed(2) + " millas" + "<br/>" +
        m + " metros equivalen a " + pies.toFixed(2) + " pies" + "<br/>" +
        m + " metros equivalen a " + pulgadas.toFixed(2) + " pulgadas";
}

//exercicio12
function exercicio12b1() {
    enunciado.innerHTML = "<br/>Escribir un programa que obteña o resultado da operación (a-b)(a+b) logo de introducir os datos correspondentes.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='valorA'>Valor de a: </label><input id='valorA'> <br/>" +
        "<label for='valorB'>Valor de b: </label><input id='valorB'> <br/>" +
        " <button type='button' onclick='calculoEx12(valorA.value, valorB.value)'>Calcular</button>" + "</form>";
}

function calculoEx12(a, b) {
    a = parseFloat(a);
    b = parseFloat(b);
    var resultado = (a - b) * (a + b);
    solucion.innerHTML = resultado;
}

//exercicio13
function exercicio13b1() {
    enunciado.innerHTML = "<br/>Dous atletas percorren a mesma distancia e rexístranse os seus tempos en segundos. Desexamos saber o tempo total utilizado por ambos atletas en horas, minutos e segundos.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='atleta1'>Segundos do atleta 1: </label><input id='atleta1'> <br/>" +
        "<label for='atleta2'>Segundos do atleta 2: </label><input id='atleta2'> <br/>" +
        " <button type='button' onclick='calcularTemposAtletas(atleta1.value, atleta2.value)'>Calcular</button>" + "</form>";
}

function calcularTemposAtletas(t1, t2) {
    t1 = parseFloat(t1);
    t2 = parseFloat(t2);
    var horas1 = Math.trunc(t1 / 3600);
    var minutos1 = Math.trunc((t1 - horas1 * 3600) / 60);
    var segundos1 = Math.trunc(t1 - (horas1 * 3600 + minutos1 * 60));

    var horas2 = Math.trunc(t2 / 3600);
    var minutos2 = Math.trunc((t2 - horas2 * 3600) / 60);
    var segundos2 = Math.trunc(t2 - (horas2 * 3600 + minutos2 * 60));

    solucion.innerHTML = "Tempo do atleta 1: " + horas1 + " hora " + minutos1 + " minutos " + segundos1 + " segundos." + "<br/>" +
        "Tempo do atleta 2: " + horas2 + " hora " + minutos2 + " minutos " + segundos2 + " segundos.";
}

//exercicio14
function exercicio14b1() {
    enunciado.innerHTML = "<br/>Unha persoa desexa saber cales son os seus parámetros físicos para saber se debería facer dieta. Quere saber o seu índice de masa corporal, a relación cintura/altura e o número de calorías diarias a consumir. Recolle os datos necesarios e amosa por pantalla unha táboa cos cálculos realizados. <br/><br/>";
    datos.innerHTML = "<form>" + "<label for='peso'>Peso: </label><input id='peso'> <br/>" +
        "<label for='altura'>Altura en cm: </label><input id='altura'> <br/>" +
        "<label for='idade'>Idade: </label><input id='idade'> <br/>" +
        "<label for='cintura'>Perímetro da cintura: </label><input id='cintura'> <br/>" +
        " <button type='button' onclick='calcularParametrosFisicos(peso.value, altura.value, idade.value, cintura.value)'>Calcular</button>" + "</form>";

}

function calcularParametrosFisicos(peso, altura, idade, cintura) {
    peso = parseFloat(peso);
    altura = parseFloat(altura);
    idade = parseFloat(idade);
    cintura = parseFloat(cintura);

    var calorias = 10 * peso + 6.25 * (altura / 100) - 5 * idade;
    var imc = peso / Math.pow(altura / 100, 2);
    var cinturaAltura = cintura / altura;

    solucion.innerHTML = "<table border='1'> " +
        "<tr>" +
        "<th>IMC</th>" +
        "<th>Relación cintura/altura</th>" +
        "<th>Calorías diarias a consumir</th>" +
        "</tr>" +
        "<tr>" +
        "<td>" + imc.toFixed(2) + "</td>" +
        "<td>" + cinturaAltura.toFixed(2) + "</td>" +
        "<td>2" + calorias.toFixed(0) + "</td>" +
        "</tr>" +
        "</table>";
}

//exercicio15
function exercicio15b1() {
    enunciado.innerHTML = "<br/>Dado un número natural de catro díxitos (non fai falla comprobar que ten catro díxitos) indicar cantos millares, centenas, decenas e unidades ten. <br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num'>Número: </label><input id='num'> <br/>" +
        " <button type='button' onclick='calcularDixitos(num.value)'>Calcular</button>" + "</form>";

}

function calcularDixitos(numero) {
    numero = parseFloat(numero);
    var millares = Math.trunc(numero % 10000 / 1000);
    var centenas = Math.trunc(numero % 1000 / 100);
    var decenas = Math.trunc(numero % 100 / 10);
    var unidades = numero % 10;

    solucion.innerHTML = "O número introducido ten " + millares + " millares, " + centenas + " centenas, " + decenas + " decenas e " + unidades + " unidades.";

}

//exercicio16
function exercicio16b1() {
    enunciado.innerHTML = "<br/>Calcular a incidencia acumulada e a evolución do número reprodutivo básico (R<sub>0</sub>) na comunidade galega. <br/><br/>";
    datos.innerHTML = "<form>" + "<label for='pcrHoxe'>PCR diarios hoxe: </label><input id='pcrHoxe'> <br/>" +
        "<label for='positivos14dias'>Positivos nos últimos 14 días: </label><input id='positivos14dias'><br/>" +
        "<label for='casosOnte'>Casos activos onte: </label><input id='casosOnte'> <br/>" +
        " <button type='button' onclick='calcularCovid(pcrHoxe.value, casosOnte.value, positivos14dias.value)' >Calcular</button>" + "</form>";
}

function calcularCovid(pcrDiarioHoxe, casosActivosOnte, positivos14DiasHoxe) {
    pcrDiarioHoxe = parseInt(pcrDiarioHoxe);
    casosActivosOnte = parseInt(casosActivosOnte);
    positivos14DiasHoxe = parseInt(positivos14DiasHoxe);
    const POBOACIONGALIZA = 2700000;
    const CADA100000 = POBOACIONGALIZA / 100000;


    var incidenciaAcumulada = positivos14DiasHoxe / CADA100000;
    var numReproductivoBasico = pcrDiarioHoxe / casosActivosOnte * CADA100000;

    solucion.innerHTML = "IA = " + incidenciaAcumulada.toFixed(0) + "<br/>" +
        "R<sub>0</sub> = " + numReproductivoBasico.toFixed(2);
}