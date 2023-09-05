// Exercicio 5.1: El parámetro de la función resolver_5_1() es incorrecto. Borrar tilde.
// function resolver_5_1(número) {
function resolver_5_1(numero) {
	// Añadir la variable local texto.
	var texto = '';
	// Se debe comprobar que se recibe un número y no una letra con un control de entrada.
	if (eNumero(numero)) {
		// En la condición del if, se está haciendo una asignación y no una comparación. Añadir doble igual (==).
		// if(numero = 0) {
		if (numero == 0) {
			texto = 'Cero';
		} else if (numero > 0) {
			// El valor de la variable texto no está recibiendo un string. Entrecomillar palabra positivo.
			// texto = Positivo;
			texto = 'Positivo';
		} else {
			texto = 'Negativo';
		}
	} else {
		texto = "Introduce un número válido.";
	}
	amosarResultado(texto);
}

function resolver_5_2() {
	// El uso del método Math.random está mal escrito; siempre dará 1. Corregir para hacer el rango 1 y 100.
	// aleatorio = Math.floor(Math.random()) + 1;
	aleatorio = Math.floor(Math.random() * 100) + 1;
	console.log(aleatorio);
	intento = 0;
	pedirNumero();
}

// Falta la función que llama al ejercicio 3. Añadir función resolver_5_3().
/*function resolver_5_3() {
	resolver_5_2();
}*/

function resolver_5_4() {
	var vector = [1, 2, 3];
	var outroVector = vector;
	modifica(outroVector);
	alert(vector[0]);
}

function modifica(vectorAuxiliar) {
	vectorAuxiliar[0] = 'Ola!!!';
}

function pedirNumero() {
	// Controlar si es el último intento para no pintar mal el intento.
	if (intento != 10) {
		// Indicar o intento.
		intento++;
	}
	// Indicar en qué intento va.
	//texto = "Llevas " + intento + " intentos.<br>";

	/*datos.innerHTML =
		'Número <input id="numero" type="text"/>' +
		'<button type="button" onClick="comprobarNumero(numero.value);">Premer</button>';*/
	datos.innerHTML =
		intento + 'º intento: Número <input id="numero" type="text"/>' +
		'<button id="boton" type="button" onClick="comprobarNumero(numero.value);">Premer</button>';
}


function doom() {
	window.open('./doom/index.html');
}

function comprobarNumero(numero) {
	// Añadir la variable local texto.
	var texto = '';
	if (!nEDDC(numero)) {
		// Comprobar se o inento é válido.
		if (numero != aleatorio) {
			if (numero > aleatorio) {
				texto = 'O número aleatorio é menor.';
			} else {
				// El mensaje de esta condición está mal escrito. Cambiar a 'maior'.
				// texto = 'O número aleatorio é menor.';
				texto = 'O número aleatorio é maior.';
			}
		}
	} else {
		texto = 'Debes introducir un número.';
	}
	// Comprobar si el intento es válido.
	if (intento < 10 && numero != aleatorio) {
		pedirNumero();
	} else {
		if (numero == aleatorio) {
			texto = 'Atinaches no ' + intento + 'º intento!';
		} else {
			texto = "Ya no te quedan más intentos. El número buscado era el " + aleatorio + ".";
		}
		// Desactivar el botón.
		document.getElementById('boton').disabled = true;

	}
	amosarResultado(texto);
}

// Hay una función repetida con el mismo nombre; machaca la primera con la segunda. Comentar segunda function modifica().
/*function modifica(auxiliar) {
	cadea = new Array(80, 101, 114, 111, 32, 100, 101, 32, 113, 117, 101, 32, 118, 97, 115,
		44, 32, 116, 237, 111, 33, 33, 33, 32, 65, 32, 116, 105, 32, 105, 115, 116, 111, 32,
		112, 97, 114, 233, 99, 101, 99, 104, 101, 32, 117, 110, 32, 115, 97, 250, 100, 111, 63);
	var saida = '';
	for (var i = 0; i < cadea.length; i++) {
		saida += String.fromCharCode(cadea[i]);
	}
	auxiliar[0] = saida;
}*/

function nEDDC(numero) { // numeroEnteiroDistintoDeCero
	// Número debe estar asginado a la función trim para quitar los espacios.
	// numero.trim();
	numero = numero.trim();
	return (isNaN(numero) || numero == 0 || (numero % 1 != 0) || numero == '');
}

function eNumero(numero) { // Comproba que se é número e que non sexa un ou varios espazos en branco.
	// Número debe estar asginado a la función trim.
	numero.trim();
	numero = numero.trim();
	return !(isNaN(numero) || numero == '');
}

