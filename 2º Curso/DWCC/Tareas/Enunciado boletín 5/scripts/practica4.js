function resolver_4_1() {
	var texto = '';
	var vector = new Array(100);

	for (var i = 0; i < 100; i++) {
		vector[i] = (Math.random() * 100).toFixed(0);
		texto += vector[i] + ' ';
	}
	amosarResultado(texto);
}

function resolver_4_2() {
	var texto = '';
	var matriz = new Array(5);
	for (var i = 0; i < matriz.length; i++) {
		matriz[i] = new Array(6);
	}
	texto = '<table id="taboa_4_2">';
	for (var i = 0; i < 5; i++) {
		texto += '<tr>';
		for (var j = 0; j < 6; j++) {
			matriz[i][j] = Math.ceil((Math.random() * 100));
			texto += '<td>' + matriz[i][j] + '</td>';
		}
		texto += '</tr>';
	}
	texto += '</table>';
	var suma = 0;
	for (var i = 0; i < 5; i++) {
		for (var j = 0; j < 6; j++) {
			suma += matriz[i][j];
		}
	}
	amosarResultado(texto + '<br>' + suma);
}

function resolver_4_3() {
	var numPositivos = 0;
	var numNegativos = 0;
	var numCeros = 0;
	var texto = '';
	var vector = new Array(10);

	for (var i = 0; i < vector.length; i++) {
		vector[i] = numeroAleatorio();
		if (vector[i] == 0) {
			numCeros++;
		} else if (vector[i] > 0) {
			numPositivos++;
		} else {
			numNegativos++;
		}
		texto += vector[i];
		if (i < vector.length - 1) { texto += ','; }
	}
	amosarResultado('Na lista introducida [' + texto + '] hai ' + numCeros + ' ceros, ' + numPositivos + ' positivos, ' + numNegativos + ' negativos');
}

function numeroAleatorio() {
	var a = 20;
	var b = -20;
	return Math.round(Math.random() * (a - b) + b);
}

function resolver_4_4(numero) {
	if (!isNaN(numero)) {
		iteracion++;
		numero = parseFloat(numero);
		vector.push(numero);
		vector.sort(ordenar);
		pedirDatos(4, 4);
	}
	amosarResultado(vector);
}

function ordenar(a, b) {
	return a - b;
}

function resolver_4_5(numero) {
	if (!isNaN(numero)) {
		iteracion++;
		numero = parseFloat(numero);
		vector.push(numero);
		suma += numero;
		if (iteracion <= 10) {
			pedirDatos(4, 5);
		} else {
			var media = 0;
			media = suma / vector.length;
			amosarResultado(vector + '<br>A suma dos elementos é igual a: ' + suma + '<br>A media dos elementos é igual a: ' + media);
		}
	}
}

function resolver_4_6(filas) {
	var texto = '';
	for (var i = 0; i < filas; i++) {
		texto += document.getElementById('numero_' + i + '_' + i).value + ' ';
	}
	amosarResultado(texto);
}

function resolver_4_7(filas, columnas) {
	var texto = '';
	for (var i = 0; i < columnas; i++) {
		for (var j = 0; j < filas; j++) {
			texto += document.getElementById('numero_' + j + '_' + i).value + ' ';
		}
		texto += '<br>';
	}
	amosarResultado(texto);
}

function resolver_4_8(numero) {
	var texto = '';
	if (isNaN(numero) || numero < 1 || (numero % 1 != 0)) {
		texto = 'Introduce un número válido';
	} else {
		numero = parseInt(numero);
		var vector = new Array(numero);
		for (var i = 0; i < vector.length; i++) {
			vector[i] = numeroAleatorio();
			texto += vector[i] + ' ';
		}
		var suma = 0;
		var dato = 0;
		texto += '<br>';
		for (var i = 0; i < vector.length; i++) {
			dato = vector[i];
			vector[i] = suma;
			suma += dato;
		}
		texto += vector;
	}
	amosarResultado(texto);
}

function resolver_4_9(numero) {
	var texto = '';
	if (isNaN(numero) || numero < 1 || (numero % 1 != 0)) {
		texto = 'Introduce un número válido';
	} else {
		numero = parseInt(numero);
		var vector = new Array(numero);
		texto += 'Vector orixinal: [';
		for (var i = 0; i < vector.length; i++) {
			vector[i] = numeroAleatorio();
			texto += vector[i] + ',';
		}
		texto += ']<br>';

		var auxiliar = new Array(numero);
		for (var i = 0; i < vector.length / 2; i++) {
			auxiliar[i] = vector[numero - 1 - i];
			auxiliar[numero - 1 - i] = vector[i];
		}
		texto += 'Reverso do vector: ' + auxiliar;
	}
	amosarResultado(texto);
}

function resolver_4_10(numero) {
	if (!isNaN(numero)) {
		iteracion++;
		numero = parseFloat(numero);
		vector.push(numero);
		suma += numero;
		if (iteracion <= 10) {
			pedirDatos(4, 10);
		} else {
			var media = 0;
			media = suma / vector.length;
			for (var i = 0; i < vector.length; i++) {
				if (vector[i] > media) { contador++; }
			}
			amosarResultado(vector + '<br>Hai ' + contador + ' elementos maiores que a media');
		}
	}
}

function resolver_4_11() {
	ANCHO = 8;
	crearTaboleiro();
	xerarPezas();
	colocarPezas(pezas);
	pintarTaboleiro();
}

function crearTaboleiro() {
	taboleiro = new Array(ANCHO);

	for (var i = 0; i < taboleiro.length; i++) {
		taboleiro[i] = new Array(ANCHO);
		for (var j = 0; j < taboleiro[i].length; j++) {
			taboleiro[i][j] = new Array(2);
			taboleiro[i][j][0] = '&nbsp;';
			taboleiro[i][j][1] = '&nbsp;';
		}
	}
}

function xerarPezas() {
	// Posición inicial da partida
	pezas = new Array(ANCHO);
	for (var i = 0; i < pezas.length; i++) {
		pezas[i] = new Array(ANCHO);
		for (var j = 0; j < pezas[i].length; j++) {
			pezas[i][j] = new Array(2);
		}
	}
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

function colocarPezas(pezas) {
	for (var i = 0; i < taboleiro.length; i++) {
		for (var j = 0; j < taboleiro[i].length; j++) {
			if (pezas[i][j][1] == 'N' || pezas[i][j][1] == 'B') {
				taboleiro[i][j][0] = pezas[i][j][0];
				taboleiro[i][j][1] = pezas[i][j][1];
			}
		}
	}
}

function pintarTaboleiro() {
	//Amosar o taboleiro mediante unha táboa
	var peza;
	var texto = "<table>";
	for (var i = 0; i < taboleiro.length; i++) {
		texto += "<tr>"
		for (var j = 0; j < taboleiro[i].length; j++) {
			if (taboleiro[i][j][1] != "&nbsp;") {
				peza = "<img src='imaxes/xadrez/" + taboleiro[i][j][0] + taboleiro[i][j][1] + ".png'>";
			} else {
				peza = "";
			}
			texto += "<td class='" + ((j + i) % 2 == 0 ? "fondoBranco" : "fondoNegro") + "'>" + peza + "</td>";
		}
		texto += "</tr>";
	}
	texto += "</table>";
	amosarResultado(texto);
}

function resolver_4_12() {
	vector_A = [1, 'a', 2, 't'];
	vector_B = [3, 2, 1];

	// Simulación da unión
	decision = 0;
	vectorResultante = calcularVector(decision, vector_A, vector_B);
	var saida = '<p>UNIÓN: ' + vectorResultante + '</p>';
	amosarResultado(saida);

	// Simulación da intersección
	decision = 1;
	vectorResultante = calcularVector(decision, vector_A, vector_B);
	saida += '<p>INTERSECCIÓN: ' + vectorResultante + '</p>';
	amosarResultado(saida);
}

function calcularVector(decision, vector_A, vector_B) {
	var vectorAuxiliar = new Array();
	var vectorSaida = new Array();
	var vector_A_auxiliar = new Array();
	var vector_B_auxiliar = new Array();

	for (var i = 0; i < vector_A.length; i++) {
		vector_A_auxiliar.push(vector_A[i]);
	}

	for (var i = 0; i < vector_B.length; i++) {
		vector_B_auxiliar.push(vector_B[i]);
	}

	var i = 0;
	var j = 0;

	switch (decision) {
		case 0: // Unión
			vectorAuxiliar = vector_A_auxiliar.concat(vector_B_auxiliar);
			vectorAuxiliar.sort();
			vectorSaida[0] = vectorAuxiliar[0];
			for (var i = 1; i < vectorAuxiliar.length; i++) {
				if (vectorAuxiliar[i] != vectorSaida[j]) {
					vectorSaida.push(vectorAuxiliar[i]);
					j++;
				}
			}
			break;
		case 1: // Intersección
			for (var i = 0; i < vector_A_auxiliar.length; i++) {
				for (var j = 0; j < vector_B_auxiliar.length; j++) {
					if (vector_A_auxiliar[i] == vector_B_auxiliar[j]) {
						vectorSaida.push(vector_A_auxiliar[i]);
					}
				}
			}
			break;
		default: texto = 'Caso non definido';
	}
	return vectorSaida;
}

function resolver_4_13(numero) {
	var texto = 'Debes introducir un número natural';
	if (!isNaN(numero) && numero > 0 && (numero % 1 == 0)) {
		numero = parseInt(numero);
		var vector = new Array(numero);
		var incompleto = true;
		var MAXIMO = 100;
		var contador = 0;
		texto = 'O vector aleatorio ten os seguintes números: ';
		while (incompleto) {
			var primo = Math.floor(Math.random() * MAXIMO);
			if (esPrimo(primo)) {
				vector[contador] = primo;
				contador++;
				texto += primo + ' ';
			}
			if (contador == numero) { incompleto = false; }
		}
		texto += '<br>O máximo é: ' + Math.max(...vector);
	}
	amosarResultado(texto);
}