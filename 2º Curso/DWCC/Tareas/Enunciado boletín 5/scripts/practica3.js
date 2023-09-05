var baleiro = 0;
var posicion = 1;
var listaNumeros = '';

function resolver_3_1() {
	var LIMITE = 50;
	var total = 0;

	for (var i = 0; i < LIMITE; i++) {
		total += i;
	}
	amosarResultado(total);
}

function resolver_3_2() {
	var LIMITE = 100;
	var texto = '';

	for (var i = 0; i <= LIMITE; i++) {
		texto += i + ' ';
	}
	amosarResultado(texto);
}

function resolver_3_3() {
	var LIMITE = 100;
	var suma = 0;

	for (var i = 0; i <= LIMITE; i = i + 2) {
		suma += i;
	}
	amosarResultado('Suma dos números pares existentes entre o 0 e o 100 é ' + suma);
}

function resolver_3_4() {
	var LIMITE = 100;
	var texto = '';

	for (var i = 2; i <= LIMITE; i++) {
		if (esPrimo(i)) { texto += i + ' '; }
	}
	amosarResultado('Os números primos existentes entre o 0 e o 100 son: ' + texto);
}

function resolver_3_5(numero) {
	var texto = '';
	if (isNaN(numero) || numero < 0 || (numero % 1 != 0)) {
		texto = 'Este algoritmo non é quen de calcular o factorial de ' + numero + '. Introduce un número enteiro positivo';
	} else {
		var numero = parseInt(numero);

		var factorial = 1;
		var x = 1;
		while (x <= numero) {
			factorial = factorial * x;
			x++;
		}
		texto = 'O factorial de ' + numero + ' é: ' + factorial;
	}
	amosarResultado(texto);
}

function resolver_3_6(limite) {
	var texto = '';
	if (isNaN(limite) || limite < 0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		var limite = parseInt(limite);
		for (var i = 1; i <= limite; i++) {
			for (var j = 1; j <= i; j++) {
				texto += j + ', ';
			}
		}
		texto = texto.substr(0, texto.length - 2) + '...';
	}

	amosarResultado(texto);
}

function resolver_3_7(limite) {
	var texto = '0, ';
	if (isNaN(limite) || limite < 0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		var limite = parseInt(limite);
		var i = 1;
		while (i <= limite) {
			var j = i * -1;
			texto += i + ', ' + j + ', ';
			i++;
		}
		texto = texto.substr(0, texto.length - 2) + '...';
	}

	amosarResultado(texto);
}

function resolver_3_8(limite) {
	var texto = '1, 1, ';
	if (isNaN(limite) || limite < 0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		var limite = parseInt(limite);
		var elemento_n2 = 1;
		var elemento_n1 = 1;
		for (var i = 3; i <= limite; i++) {
			elemento_n = elemento_n1 + elemento_n2;
			texto += elemento_n + ', ';
			elemento_n2 = elemento_n1;
			elemento_n1 = elemento_n;
		}
		texto = texto.substr(0, texto.length - 2) + '...';
	}

	amosarResultado(texto);
}

function resolver_3_9(limite) {
	var texto = '0, ';
	if (isNaN(limite) || limite < 0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		var limite = parseInt(limite);
		for (var i = 1; i < limite; i++) {
			if (i % 2 != 0) {
				texto += i + ', ';
			} else {
				texto += (i * i) + ', ';
			}
		}
		texto = texto.substr(0, texto.length - 2) + '...';
	}

	amosarResultado(texto);
}

function resolver_3_10(limite) {
	var texto = '';
	if (isNaN(limite) || limite < 0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		var limite = parseInt(limite);
		for (var i = 0; i <= limite / 2; i++) {
			texto += i + '+' + (limite - i) + '<br>';
		}
	}

	amosarResultado(texto);
}

function resolver_3_11() {
	var texto = '';
	var NUMERO = 7;
	var CARAS = 6;
	var DADOS = 2;
	var dado2;
	var probabilidade = 0;
	for (var dado1 = 1; dado1 <= CARAS; dado1++) {
		for (var dado2 = 1; dado2 <= CARAS; dado2++) {
			if (dado1 + dado2 == NUMERO) {
				probabilidade++;
				break;
			}
		}
	}

	amosarResultado((probabilidade / Math.pow(CARAS, DADOS)).toFixed(3));
}

function resolver_3_12(numero) {
	if (isNaN(numero)) {
		amosarResultado(baleiro);
		primeiraVez = true;
	} else {
		var numero = parseFloat(numero);
		if (primeiraVez) {
			baleiro = numero;
			primeiraVez = false;
		} else {
			if (baleiro < numero) {
				baleiro = numero;
			}
		}
		pedirDatos(3, 12);
	}
}

function resolver_3_13(numero1, numero2, numero3) {
	var texto = '';
	if (nEDDC(numero1) || nEDDC(numero2) || nEDDC(numero3)) {
		texto = 'Introduce números válidos';
	} else {
		var numero1 = parseInt(numero1);
		var numero2 = parseInt(numero2);
		var numero3 = parseInt(numero3);
		texto = mcd(numero1, mcd(numero2, numero3));
	}
	amosarResultado(texto);
}

function nEDDC(numero) { // numeroEnteiroDistintoDeCero
	numero.trim();
	return (isNaN(numero) || numero == 0 || (numero % 1 != 0) || numero == '');
}

function mcd(numero1, numero2) { // máximo común divisor
	var maximo = 1;
	var numero1 = (numero1 < 0) ? numero1 * -1 : numero1;
	var numero2 = (numero2 < 0) ? numero2 * -1 : numero2;
	var limite = numero1;
	if (numero1 > numero2) { var limite = numero2; }
	for (var i = limite; i >= 2; i--) {
		if ((numero1 % i == 0) && (numero2 % i == 0)) { maximo = i; break; }
	}
	return maximo;
}

function resolver_3_14(numero) {
	var texto = '';
	if (!isNaN(numero)) {
		var numero = parseFloat(numero);
		numero = (numero < 0) ? numero * -1 : numero;
		while (numero % 1 != 0) { numero *= 10; }
		var texto = 0;
		while (numero != 0) {
			var resto = numero % 10;
			texto += resto;
			numero = (numero - resto) / 10;
		}
	} else {
		texto = 'Introduce un número';
	}
	amosarResultado(texto);
}

function resolver_3_15(numero) {
	var texto = '';
	if (isNaN(numero) || numero <= 1 || (numero % 1 != 0)) {
		texto = 'Introduce un número válido';
	} else {
		var numero = parseInt(numero);
		if (numero % 2 == 0) { texto += 'O número é par<br>'; }
		if (esPrimo(numero)) { texto += 'O número é primo<br>'; }
		if ((Math.sqrt(numero) % 1) == 0) { texto += 'O número é cadrado perfecto<br>'; }
		if (texto == '') { texto = 'O número non é nin par, nin primo, nin cadrado perfecto'; }
	}
	amosarResultado(texto);
}

function esPrimo(numero) {
	var primo = true;
	for (var i = 2; i < numero; i++) {
		if (numero % i == 0) { primo = false; break; }
	}
	if (numero == 0 || numero == 1) primo = false;
	return primo;
}

function resolver_3_16(numero) {
	var texto = '';
	if (isNaN(numero) || (numero % 1 != 0)) {
		if (primeiraVez) {
			texto = 'Introduce algún valor válido';
		} else {
			texto = listaNumeros + '<br>A posición do máximo é: ' + posicion;
			primeiraVez = true;
		}
	} else {
		var numero = parseInt(numero);
		contador++;
		listaNumeros += ' ' + numero;
		if (primeiraVez) {
			baleiro = numero;
			primeiraVez = false;
		} else {
			if (baleiro < numero) {
				baleiro = numero;
				posicion = contador;
			}
		}
		texto = listaNumeros + '<br>A posición actual do máximo é: ' + posicion;
		pedirDatos(3, 16);
	}
	amosarResultado(texto);
}

function resolver_3_17(numero1, numero2) {
	var texto = '';
	if (nPDDC(numero1) || nPDDC(numero2)) {
		texto = 'Introduce números válidos';
	} else {
		var numero1 = parseInt(numero1);
		var numero2 = parseInt(numero2);
		texto = mcdEuclides(numero1, numero2);
	}
	amosarResultado(texto);
}

function nPDDC(numero) { // numeroPositivoDistintoDeCero
	return (isNaN(numero) || numero <= 0 || (numero % 1 != 0));
}

function mcdEuclides(numero1, numero2) {
	while (numero1 != numero2) {
		if (numero1 > numero2) {
			numero1 = numero1 - numero2;
		} else {
			numero2 = numero2 - numero1;
		}
	}
	return numero2;
}

function resolver_3_18() {
	var texto = '';
	var LIMITE = 6;
	for (var i = 0; i <= LIMITE; i++) {
		texto += '<div class="fila">';
		for (var j = i; j <= LIMITE; j++) {
			texto += '<div class="ficha"><div class="columna">' + i + '</div>' +
				'<div class="columna">' + j + '</div></div>' +
				'<div class="separador"></div>';
		}
		texto += '</div>';
	}
	amosarResultado(texto);
}

function resolver_3_19(limite) {
	var texto = '';
	if (isNaN(limite) || limite <= 0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		var limite = parseInt(limite);
		texto = '<br>';
		for (var i = 1; i <= limite; i++) {
			for (var j = 0; j < i; j++) {
				texto += '*';
			}
			texto += "<br>";
		}
	}
	amosarResultado(texto);
}

function resolver_3_20(limite) {
	var texto = '';
	if (isNaN(limite) || limite <= 0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		var limite = parseInt(limite);
		texto = "<br>";
		for (var i = 1; i <= limite; i++) {
			for (var j = 1; j <= limite; j++) {
				if (i == 1 || i == limite || j == 1 || j == limite) {
					texto += '*';
				} else {
					texto += '<span class="invisible">*</span>';
				}
			}
			texto += "<br>";
		}
	}
	amosarResultado(texto);
}

function resolver_3_21() {
	var texto = '';
	var persoa = 1;

	for (var i = 1; i <= 30; i++) {
		var valor = '';
		if (persoa == 4) persoa = 1;
		texto += 'Persoa ' + persoa + ':';
		if (i % 2 == 0) valor += ' pim';
		if (i % 3 == 0) valor += ' pam';
		if (i % 5 == 0) valor += ' pum';
		if (valor == '') valor = ' ' + i;
		texto += valor + '<br/>';
		persoa++;
	}

	amosarResultado(texto);
}