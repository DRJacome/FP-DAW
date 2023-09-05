function opcionSubmenu_1(opcion) {
    exercicio1.classList.remove("activo");
    exercicio1.classList.remove("activo");
    exercicio1.classList.remove("activo");
    exercicio1.classList.remove("activo");
    exercicio1.classList.remove("activo");
    exercicio1.classList.remove("activo");
    exercicio1.classList.remove("activo");
    exercicio1.classList.remove("activo");
    exercicio1.classList.remove("activo");
    exercicio10.classList.remove("activo");
    exercicio11.classList.remove("activo");
    exercicio12.classList.remove("activo");
    exercicio13.classList.remove("activo");
    exercicio14.classList.remove("activo");
    exercicio15.classList.remove("activo");
    exercicio16.classList.remove("activo");
    switch (opcion) {
        case 1:
            exercicio1.classList.add("activo");
            break;
        case 2:
            exercicio2.classList.add("activo");
            break;
        case 3:
            exercicio3.classList.add("activo");
            break;
        case 4:
            exercicio4.classList.add("activo");
            break;
        case 5:
            exercicio5.classList.add("activo");
            break;
        case 6:
            exercicio6.classList.add("activo");
            break;
        case 7:
            exercicio7.classList.add("activo");
            break;
        case 8:
            exercicio8.classList.add("activo");
            break;
        case 9:
            exercicio9.classList.add("activo");
            break;
        case 10:
            exercicio10.classList.add("activo");
            break;
        case 11:
            exercicio11.classList.add("activo");
            break;
        case 12:
            exercicio12.classList.add("activo");
            break;
        case 13:
            exercicio13.classList.add("activo");
            break;
        case 14:
            exercicio14.classList.add("activo");
            break;
        case 15:
            exercicio15.classList.add("activo");
            break;
        case 16:
            exercicio16.classList.add("activo");
            break;
        default:
            break;
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_1(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Suma de dos números e impresión del resultado:";
	datos.innerHTML =
		'<form>' +
			'<label for="num1">Introduce el primer número:</label><input id="num1">' +
			'<label for="num2">Introduce el segundo número:</label><input id="num2">' +
			'<button type="button" onclick="sumaExe(num1.value, num2.value)">Calcular</button>' +
		'</form>';
	resultado.innerHTML = '';
}

function sumaExe(a,b) {
	resultado.innerHTML = "El resultado es: " + (parseFloat(a)+parseFloat(b));
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_2(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Un individuo quere invertir o seu capital nun banco e desexa saber cantos cartos aforrará despois de tres meses, se o banco paga a razón do 2% mensual:";
	datos.innerHTML =
	'<form>' +
		'<label for="num1">Capital: </label><input id="num1">' +
		'<button type="button" onclick="calculoAhorro(num1.value)">Calcular</button>' +
	'</form>';
	resultado.innerHTML = '';
}

function calculoAhorro(capitalInicial) {
	capitalInicial = parseFloat(capitalInicial);
	const PAGOMENSUAL =0.02;
	var total = capitalInicial + capitalInicial + PAGOMENSUAL;
	total +=total * PAGOMENSUAL;
	total += total * PAGOMENSUAL;
	var ahorro = total - capitalInicial;
	resultado.innerHTML = "Dinero ahorrado: " + ahorro.toFixed(2) + '€';
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_3(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Unha tenda ofrece un desconto do 15% sobre o total da compra, e un cliente desexa saber canto deberá pagar finalmente pola súa compra:";
	datos.innerHTML = 
	'<form>' +
		'Introduce el importe de la compra: <input id="dato1">' +
		'<button type="button" onclick="desconto(dato1.value)">Calcular</button>'+
	'</form>';
	resultado.innerHTML = '';
}

function desconto(total) {
	var importe = parseFloat(total);
	const DESCONTO = 0.15;
	importe *= (1- DESCONTO);
	resultado.innerHTML = "Precio final: " + importe;
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_4(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Porcentaxe de homes e porcentaxe de mulleres que hai en clase nun momento determinado.";
	datos.innerHTML = 
	'<form>' +
		'Introduce o número de homes: <input id="hombres">' +
		'Introduce o número de mulleres: <input id="mujeres">' + 
		'<button type="button" onclick="porcentaje(hombres.value, mujeres.value)">Calcular</button>' + 
	'</form>';
	resultado.innerHTML = '';
}

function porcentaje(hombres, mujeres) {
	var numHombres = parseInt(hombres);
	var numMujeres = parseInt(mujeres);

	var total = numHombres + numMujeres;
	var porcentajeHombres = (numHombres / total)*100;
	var porcentajeMujeres = (numMujeres / total)*100;

	resultado.innerHTML = "% de hombres: " + porcentajeHombres.toFixed(2) + "% ; % de mujeres: " + porcentajeMujeres.toFixed(2)+ "%";
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_5(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Dada unha cantidade en euros, obter a equivalencia en pesetas e en dólares.";
	datos.innerHTML = 
	'<form>' +
		'Introduce la cantidad en euros: <input id="euros"><br/>' +
		'Introduce el valor actual del dólar: <input id="precioDolar">' +
		'<button type="button" onclick="cambioDivisa(euros.value, precioDolar.value)">Calcular</button>' +
	'</form>';
	resultado.innerHTML = '';
}

function cambioDivisa(euros, precioDolar) {
	const VALORPESETA = 166.386;
	var numEuros = parseFloat(euros);
	var valorDolar = parseFloat(precioDolar);

	var eqDolar = numEuros*valorDolar;
	var eqPesetas = numEuros*VALORPESETA;

	resultado.innerHTML = euros + " € son " + "$" + eqDolar.toFixed(2) + " o también " + eqPesetas.toFixed(2) + " pesetas.";
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_6(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Calcular o numero de pulsacións que ten unha persoa por cada dez segundos de exercicio se a fórmula é: numero de pulsacións = (220-idade)/6.";
	datos.innerHTML = 
	'<form>' + 
	'Introduce tu edad: <input id="edad">' + 
	'<button type="button" onclick="ritmoCardiaco(edad.value)">Calcular</button>' + 
	'</form>';
	resultado.innerHTML = '';
}

function ritmoCardiaco (edad) {
	var años = parseInt(edad);

	var numPulsaciones = (220-edad)/6;

	resultado.innerHTML = "Tu ritmo cardíaco es " + numPulsaciones.toFixed(1) + " pulsaciones."
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_7(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Dados dous números, calcula a división do primeiro entre o segundo e imprímea por pantalla.";
	datos.innerHTML = 
	'<form>' + 
		'<p><label for="dividendo">Introduce el dividendo: </label><input id="dividendo"></p>' + 
		'<p><label for="divisor">Introduce el divisor: </label><input id="divisor"></p>' + 
		'<button type="button" onclick="division(dividendo.value, divisor.value)">Calcular</button>' + 
	'</form>';
	resultado.innerHTML = '';
}

function division (dividendo, divisor) {
	var numDividendo = parseFloat(dividendo);
	var numDivisor = parseFloat(divisor);

	resultado.innerHTML = "El cociente es: " + (numDividendo/numDivisor).toFixed(2) + ".";
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_8(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Un vendedor recibe o soldo base máis un 10% extra de comisión polas súas vendas;" + 
		"o vendedor quere saber cantos cartos obterá no concepto de comisións polas tres vendas " + "que realizou no mes pasado e o total que recibirá no mes. " + 
		"Para obter o resultado final pódese considerar que o seu soldo base é de 1000 euros e que as vendas que realizou foron de 1200, 350 e 5600 euros.";
	datos.innerHTML = 
	'<form>' + 
		'Introduce tu sueldo base: <input id="sueldoBase"><br/>' + 
		'Introduce el total de ventas realizadas: <input id="totalVentas">' + 
		'<button type="button" onclick="calculoComision(sueldoBase.value, totalVentas.value)">Calcular</button>' + 
	'</form>';
	enunciado.innerHTML = '';
}

function calculoComision(sueldoBase, totalVentas) {
	var sueldo = parseFloat(sueldoBase);
	var numVentas = parseInt(totalVentas);
	const PORCENTAJE = 10/100;

	var comision = numVentas * PORCENTAJE;
	var sueldoTotal = sueldo + comision;

	resultado.innerHTML = "Tu salario total es de " + sueldoTotal + ".";
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_9(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Escribir un programa que lea os 3 coeficientes reais a, b, c "+ 
		"dun polinomio de segundo grao e que determine as súas raíces reais.";
	datos.innerHTML = 
	'<form>' + 
		'Introduce el dato a: <input id="a"><br/>' + 
		'Introduce el dato b: <input id="b"><br/>' + 
		'Introduce el dato c: <input id="c"><br/>' + 
		'<button type="button" onclick="polinomio(a.value, b.value, c.value)">Calcular</button>' + 
	'</form>';
	enunciado.innerHTML = '';
}

function polinomio(a, b, c) {
	var tipoA = parseInt(a);
	var tipoB = parseInt(b);
	var tipoC = parseInt(c);

	var polinomio1 = (-b+(Math.sqrt((Math.pow(b,2)-(4*a*c)))))/(2*a);
	var polinomio2 = (-b-(Math.sqrt((Math.pow(b,2)-(4*a*c)))))/(2*a);

	resultado.innerHTML = "Los posibles resultados son " + polinomio1.toFixed(2) + " y " + polinomio2.toFixed(2);
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_10(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Escribir un programa que pida unha temperatura en graos Fahrenheit, " +
		" calcular e amosar o seu equivalente en graos Celsius, ambos admitindo dous decimais.";
	datos.innerHTML = 
	'<form>' + 
		'<p><label for="farenheit">Escribe la temperatura deseada en grados Farenheit: </label><input id="farenheit"></p>' + 
		'<button type="button" onclick="equivalenciasTemperatura(parseFloat(farenheit.value))">Calcular</button>' + 
	'</form>';
	resultado.innerHTML = '';
}

function equivalenciasTemperatura(farenheit) {
	var celsius = (farenheit - 32) / 1.8;

	resultado.innerHTML = farenheit.toFixed(2) + " ºF equivalen a " + celsius.toFixed(2) + " ºC.";
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_11(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Escribir un programa que obteña a equivalencia en polgadas, pés e millas dunha cantidade introducida en metros.";
	datos.innerHTML = 
	'<form>' + 
		'<p><label for="metros">Introduce una medida en metros: </label><input id="metros"></p>' + 
		'<button type="button" onclick="equivalenciaLongitudes(parseFloat(metros.value))">Calcular</button>' + 
	'</form>';
	resultado.innerHTML = '';
}

function equivalenciaLongitudes(metros) {
	var pulgadas = metros * 39.370;
	var pies = metros * 3.2808;
	var millas = metros * 0.00062137;

	resultado.innerHTML = metros + " metros equivalen a " + pulgadas.toFixed(2) + " pulgadas, " + pies.toFixed(2) + " pies, y " + millas.toFixed(2) + " millas.";
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_12(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Escribir un programa que obteña o resultado da operación (a-b)(a+b) logo de introducir os datos correspondentes.";
	datos.innerHTML = 
	'<form>' + 
		'<p><label for="a">Introduce el dato a: </label><input id="a"></p>' + 
		'<p><label for="b">Introduce el dato b: </label><input id="b"></p>' + 
		'<button type="button" onclick="calcularDatos(parseFloat(a.value), parseFloat(b.value))">Calcular</button>' + 
	'</form>'
	enunciado.innerHTML = '';
}

function calcularDatos(a, b) {
	var operacion = (a-b)*(a+b);

	resultado.innerHTML = "El resultado de " + "(" + a + "-" + b + ")" + "*" + "(" + a + "+" + b +")" + " es " + operacion + ".";
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_13(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Dous atletas percorren a mesma distancia e rexístranse os seus tempos en segundos. " + 
	"Desexamos saber o tempo total utilizado por ambos atletas en horas, minutos e segundos.";
	datos.innerHTML = 
	'<form>' + 
		'<p><label for="tiempoAtleta1">Tiempo del atleta 1: </label><input id="tiempoAtleta1"></p>' + 
		'<p><label for="tiempoAtleta2">Tiempo del atleta 2: </label><input id="tiempoAtleta2"></p>' + 
		'<button type="button" onclick="calculoTiempo(parseInt(tiempoAtleta1.value), parseInt(tiempoAtleta2.value))">Calcular</button>' + 
	'</form>';
	resultado.innerHTML = '';
}

function calculoTiempo(tiempoAtleta1, tiempoAtleta2) {
	var horas1 = Math.trunc(tiempoAtleta1 / 3600);
	tiempoAtleta1 -= horas1 * 3600;
	var minutos1 = Math.trunc(tiempoAtleta1 / 60);
	tiempoAtleta1 -= minutos1 * 60;
	var segundos1 = tiempoAtleta1;

	var horas2 = Math.trunc(tiempoAtleta2 / 3600);
	tiempoAtleta2 -= horas2 * 3600;
	var minutos2 = Math.trunc(tiempoAtleta2 / 60);
	tiempoAtleta2 -= minutos2 * 60;
	var segundos2 = tiempoAtleta2;

	resultado.innerHTML = "El atleta 1 ha hecho un tiempo de " + horas1 + " horas, " + minutos1 + " minutos y " + segundos1 + " segundos;" + 
		" y el atleta 2 ha hecho un tiempo de " + horas2 + " horas, " + minutos2 + " minutos " + segundos2 + " segundos.";
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_14(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Unha persoa desexa saber cales son os seus parámetros físicos para saber se debería facer dieta. " +
		" Quere saber o seu índice de masa corporal, a relación cintura/altura e o número de calorías diarias a consumir. " +
		"Recolle os datos necesarios e amosa por pantalla unha táboa cos cálculos realizados. "
	datos.innerHTML = 
	'<form>' + 
		'<p><label for="edad">Introduce tu edad: </label><input id="edad"></p>' +
		'<p><label for="altura">Introduce tu altura en metros: </label><input id="altura"></p>' +
		'<p><label for="peso">Introduce tu peso en kilos: </label><input id="peso"></p>' + 
		'<p><label for="cintura">Introduce el diámetro de tu cintura en metros: </label><input id="cintura"></p>' + 
		'<button type="button" onclick="calculoIMC(parseInt(edad.value), parseFloat(altura.value), parseFloat(peso.value), parseFloat(cintura.value))">Calcular</button>' +
	'</form>';
	resultado.innerHTML = '';
}

function calculoIMC(edad, altura, peso, cintura) {

	var indMasaCorporal = peso / Math.pow(altura, 2);
	var relacionCinturaAltura = cintura / altura;
	var caloriasRecomendadas = (peso*10) + (altura*6.25) - (edad*5);
	
	resultado.innerHTML = "Tu IMC es " + indMasaCorporal.toFixed(2) + ", la relación entre tu cintura y altura es " + relacionCinturaAltura.toFixed(2) + 
		" y el consumo de calorías recomendado es " + caloriasRecomendadas.toFixed(2) +".";
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_15(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Dado un número natural de catro díxitos (non fai falla comprobar que ten catro díxitos) indicar cantos millares, centenas, decenas e unidades ten.";
	datos.innerHTML = 
	'<form>' + 
		'<p><label for="numNatural">[máximo 4 dígitos] Número: </label><input id="numNatural"></p>' + 
		'<button type="button" onclick="ex15Exe(numNatural.value)">Calcular</button>' + 
	'</form>';
	resultado.innerHTML = '';
}

function ex15Exe(numNatural) {
	var numInicial = numNatural;
	var millares = Math.trunc(numNatural/1000);
	numNatural-= millares*1000;
	var centenas = Math.trunc(numNatural/100);
	numNatural -= centenas*100;
	var decenas = Math.trunc(numNatural/10);
	numNatural -= decenas*10;
	
	resultado.innerHTML = "En el número " + numInicial + " hay " + millares + " millar/es, " + centenas + " centena/s, " + decenas + " decena/s, y " + numNatural + " unidad/es.";
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio1_16(opcion) {
	opcionSubmenu_1(opcion, numExercicios);
	enunciado.innerHTML = "Calcular a incidencia acumulada e a evolución do número reprodutivo básico (R0) na comunidade galega coñecendo os seguintes datos:";
	datos.innerHTML = 
	'<form>' +
		'<p><label for="PCRDiariosOnte">Positivos PCR diarios onte: </label><input id="PCRDiariosOnte"></p>' + 
		'<p><label for="PCR14DiasOnte">Positivos PCR nos últimos 14 días onte: </label><input id="PCR14DiasOnte"></p>' + 
		'<p><label for="casosActivosOnte">Casos activos onte: </label><input id="casosActivosOnte"></p>' + 
		'<p><label for="PCRDiariosHoxe">Positivos PCR diarios hoxe: </label><input id="PCRDiariosHoxe"></p>' + 
		'<p><label for="PCR14DiasHoxe">Positivos PCR nos últimos 14 días hoxe: </label><input id="PCR14DiasHoxe"></p>' + 
		'<p><label for="casosActivosHoxe">Casos activos hoxe: </label><input id="casosActivosHoxe"></p>' + 
		'<button type="button" onclick="calculoEx16(parseInt(PCRDiariosOnte.value), parseInt(PCR14DiasOnte.value), parseInt(casosActivosOnte.value), parseInt(PCRDiariosHoxe.value), parseInt(PCR14DiasHoxe.value), parseInt(casosActivosHoxe.value))">Calcular</button>' + 
	'</form>';
	resultado.innerHTML = '';
}

function calculoEx16(PCRDiariosOnte, PCR14DiasOnte, casosActivosOnte, PCRDiariosHoxe, PCR14DiasHoxe, casosActivosHoxe) {
	const POBOACIONGALIZA = 2700000;
	const CRIBAPOBOACION = POBOACIONGALIZA/100000;
	var incidenciaAc = PCR14DiasHoxe / CRIBAPOBOACION;
	var r0 = PCRDiariosHoxe / casosActivosOnte * CRIBAPOBOACION;

	resultado.innerHTML = '<p>Incidendia acumulada: ' + incidenciaAc.toFixed(0) + '</p>' + 
							'<p>R<sub>0</sub>: ' + r0.toFixed(2) + '</p>';
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////