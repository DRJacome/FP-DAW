// Modifcar el número de boletines de 5 a 6 y cambiar el nombre a NUMERO_BOLETINS.
// var NUMERO_PRACTICAS = 5;
var NUMERO_BOLETINS = 6;
var primeiraVez = true;
// var contador = 10;
var iteracion = 1;
var vector = new Array();
var suma = 0;

function cargarMenu() {
	var texto = '';
	// Modificar la constante en la terminación del for. NUMERO_PRACTICAS A NUMERO_BOLETINS.
	//for (var i = 1; i <= NUMERO_PRACTICAS; i++) {
	for (var i = 1; i <= NUMERO_BOLETINS; i++) {
		// Cambio el nombre "Práctica" por "Boletín".
		//texto += '<div id="practica' + i + '" class="menu" onClick="cargarSubmenu(' + i + ');">Práctica ' + i + '</div>';
		texto += '<div id="practica' + i + '" class="menu" onClick="cargarSubmenu(' + i + ');">Boletín ' + i + '</div>';
	}
	menu.innerHTML = texto;
}

function cargarSubmenu(opcion) {
	inicializarEstetica(opcion);
	switch (opcion) {
		// Exercicio 4: Axustamos o número de exercicios nos boletins.
		/*case 1: NUMERO_EXERCICIOS = 13; break;
		case 2: NUMERO_EXERCICIOS = 3; break;
		case 3: NUMERO_EXERCICIOS = 21; break;
		case 4: NUMERO_EXERCICIOS = 13; break;*/
		case 1: NUMERO_EXERCICIOS = 0; break;
		case 2: NUMERO_EXERCICIOS = 0; break;
		case 3: NUMERO_EXERCICIOS = 4; break;
		case 4: NUMERO_EXERCICIOS = 3; break;
		// Exercicio 3: Creamos os novos exercicios.
		// Añadir el case 5 para que se visualicen los ejercicios.
		case 5: NUMERO_EXERCICIOS = 5; break;
		// FIN Exercicio 3: Creamos os novos exercicios.
		default: NUMERO_EXERCICIOS = 0;
	}
	var texto = '<div>';
	for (var i = 1; i <= NUMERO_EXERCICIOS; i++) {
		texto += '<div id="exercicio' + i + '" class="submenu" onClick="pedirDatos(' + opcion + ',' + i + ');">Exercicio ' + i + '</div>';
	}
	texto += '</div>';
	submenu.innerHTML = texto;
}

function opcionSubmenu(opcion) {
	for (var i = 1; i <= NUMERO_EXERCICIOS; i++) {
		document.getElementById('exercicio' + i).classList.remove("activo");
	}
	document.getElementById('exercicio' + opcion).classList.add("activo");
}

function inicializarEstetica(opcion) {
	// Modificar la terminación del for. NUMERO_PRACTICAS A NUMERO_BOLETINS.
	//for (var i = 1; i <= NUMERO_PRACTICAS; i++) {
	for (var i = 1; i <= NUMERO_BOLETINS; i++) {
		document.getElementById('practica' + i).classList.remove("activo");
	}
	document.getElementById('practica' + opcion).classList.add("activo");
	submenu.innerHTML = '';
	enunciado.innerHTML = '';
	datos.innerHTML = '';
	resultado.innerHTML = '';
}

function amosarResultado(texto) {
	resultado.innerHTML = texto;
}

function pedirDatos(practica, opcion) {
	opcionSubmenu(opcion);
	switch (practica) {
		case 1: break;
		case 2: break;
		case 3:
			switch (opcion) {
				case 1:
					enunciado.innerHTML = 'Suma dos primeiros 50 números naturais';
					datos.innerHTML =
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Premer</button>';
					break;
				case 2:
					enunciado.innerHTML = 'Imprimir un contador do 0 ao 100';
					datos.innerHTML =
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Premer</button>';
					break;
				case 3:
					enunciado.innerHTML = 'Suma dos números pares existentes entre o 0 e o 100';
					datos.innerHTML =
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Premer</button>';
					break;
				case 4:
					enunciado.innerHTML = 'Imprimir os números primos existentes entre o 0 e o 100';
					datos.innerHTML =
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Premer</button>';
					break;
				default: alert('Exercicio inexistente');
			}
			break;
		case 4:
			switch (opcion) {
				case 1:
					enunciado.innerHTML = 'Imprimir os valores dun vector de 100 elementos';
					datos.innerHTML =
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Premer</button>';
					break;
				case 2:
					enunciado.innerHTML = 'Lee unha matriz de 5x6, e imprime a suma total da matriz';
					datos.innerHTML =
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Premer</button>';
					break;
				case 3:
					enunciado.innerHTML = 'Lee un vector numérico de dimensión 10 e determina cantos elementos son positivos, negativos e ceros, imprimindo por pantalla cada un deles, para finalmente imprimir os contadores por pantalla';
					datos.innerHTML =
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Premer</button>';
					break;
				default: alert('Exercicio inexistente');
			}
			break;
		// Exercicio3: creamos os novos exercicios.
		case 5:
			switch (opcion) {
				case 1:
					enunciado.innerHTML = '<p>Programa que indique se o número introducido é <i>Cero</i>, <i>Positivo</i> ou <i>Negativo</></p>';
					datos.innerHTML =
						'Número <input id="varA" type="text"/>' +
						// Exercicio 5.1: En la función onClick="resolver_" el parámetro no está pasando el valor del input. Añadir .value al parámetro.
						//'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(varA);">Premer</button>';
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(varA.value);">Premer</button>';
					break;
				case 2:
					enunciado.innerHTML = '<p>Número aleatorio natural entre 1 e 100 a adiviñar en menos de 10 intentos; ' +
						'o programa indica se é maior ou menor mentres non acertas</p>';
					datos.innerHTML = '<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Empezar</button>';
					break;
				case 3:
					enunciado.innerHTML = '<p>Modifica o programa anterior para que indique en qué intento acertas:</p>';
					// La variable javaScript de opción de ejercicio está mal. 
					// Se debe meter entre paréntesis para que se realice correctamente la operación de resta.
					// datos.innerHTML = '<button type="button" onClick="resolver_' + practica + '_' + opcion -1 + '();">Empezar</button>';
					datos.innerHTML = '<button type="button" onClick="resolver_' + practica + '_' + (opcion - 1) + '();">Empezar</button>';
					break;
				case 4:
					enunciado.innerHTML = '<p>Programa que modifica un vector para sacar unha alerta saudando</p>';
					datos.innerHTML = '<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Empezar</button>';
					break;
				case 5:
					enunciado.innerHTML = '<p>Compacta o código creando unha función que evite tantas liñas de código</p>';
					datos.innerHTML = '<button type="button" onClick="doom();">Xogar</button>';
					break;
				default: alert('Exercicio inexistente');
			}
			break;
		// FIN Exercicio3: creamos os novos exercicios.
		default: alert('Práctica aínda non resolta');
	}

	resultado.innerHTML = '';
}