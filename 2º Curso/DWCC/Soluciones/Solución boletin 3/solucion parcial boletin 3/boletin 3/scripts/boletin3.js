var primeiraVez = true;

function resolver_3_1() {
	const MAXIMO = 50;
	var suma = 0;
	for (let i=0; i<=MAXIMO; i++) {
		suma += i;
	}
	amosarResultado(suma);
}

function resolver_3_2() {
	const MAXIMO = 100;
	var texto = '';
	for (let i=0; i<=MAXIMO; i++) {
		texto += i + ' ';
	}
	amosarResultado(texto);
}

function resolver_3_3() {
	const MAXIMO = 100;
	var suma = 0;
	for (let i=0; i<=MAXIMO; i+=2) {
		suma += i;
	}
	amosarResultado('A suma dos números pares existentes entre o 0 e o 100 é ' + suma);
}

function resolver_3_4() {
	const MAXIMO = 100;
	var texto = '';
	var primo = true;
	for (let i=2; i<=MAXIMO; i++) {
		primo = true;
		for (let j=2; j<=Math.sqrt(i); j++) {
			if (i%j == 0 && i!=j) {
				primo = false;
			}				
		}	
		if (primo) {
			texto += i + ' ';
		}	
	}
	amosarResultado('Os números primos existentes entre o 0 e o 100 son: ' + texto);
}

function resolver_3_5(numero) {  
	var texto = '';
	if (isNaN(numero)) {
		texto = 'Este algoritmo non é quen de calcular o factorial de ' + numero + '. Introduce un número enteiro positivo';
	} else {
		numero = parseFloat(numero);
		if (numero<0 || (numero % 1 != 0)) {
			texto = 'Este algoritmo non é quen de calcular o factorial de ' + numero + '. Introduce un número enteiro positivo';
		} else {	
			var contador = 1;
			var factorial = 1;
			while (contador<=numero) {
				factorial *= contador;
				contador++;
			}
			texto = 'O factorial de ' + numero + ' é: ' + factorial;
		}
	}
	amosarResultado(texto);
}

function resolver_3_6(limite) {  
	var texto = '';
	if (isNaN(limite) || limite<0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		for (let i=1; i<=limite; i++) {
			for (let j=1; j<=i; j++) {
				texto += j + ', ';
			}
		}
		texto = texto.substring(0,texto.length-2) + '...';
	}
	amosarResultado(texto);
}

function resolver_3_7(limite) {  
	var texto = '0, ';
	if (isNaN(limite) || limite<0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		var limite = parseInt(limite);
		var i = 1;
		while (i <= limite) {
			texto += i + ', ' + (-i) + ', ';
			i++;
		}
		texto = texto.substring(0,texto.length-2) + '...';
	}
	amosarResultado(texto);
}

function resolver_3_8(limite) {  
	var texto = '1, ';
	var numero1 = 0;
	var numero2 = 1;
	var total = 0;
	if (isNaN(limite) || limite<0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		limite = parseInt(limite);
		for (let i=0; i<limite; i++) {
			total = numero1 + numero2;
			numero1 = numero2;
			numero2 = total;
			texto += total + ', ';
		}
		texto = texto.substring(0,texto.length-2) + '...';
	}
	amosarResultado(texto);
}

function resolver_3_9(limite) {  
	var texto = '';
	var contador = 0;
	var numero = 0;
	var cadrado = 0;
	if (isNaN(limite) || limite<0 || (limite % 1 != 0)) {
		texto = 'Introduce un límite válido';
	} else {
		limite = parseInt(limite);
		while (contador <= limite) {
			cadrado = numero * numero;
			texto += cadrado + ', ';
			numero++;
			texto += numero + ', ';
			numero++;
			contador++;
		}
		texto = texto.substring(0,texto.length-2) + '...';
	}
	amosarResultado(texto);
}

function resolver_3_10(numero) {  
	var texto = '';
	if (isNaN(numero) || numero<0 || (numero % 1 != 0)) {
		texto = 'Introduce un número válido';
	} else {
		numero = parseInt(numero);
		for (let i=1; i<=numero/2; i++) {
			texto += '(' + (numero - i) + ' + ' + i + ')<br>';		
		}		
	}
	amosarResultado(texto);
}

function resolver_3_11() {  
	const x = 7;
	const CARAS = 6;
	const DADOS = 2;
	var dado1 = 1;
	var probabilidade = 0;
	while (dado1 <= CARAS) {
		var dado2 = 1;
		while (dado2 <= CARAS) {
			if (dado1 + dado2 == x) {
				probabilidade++;	
				break;		
			}
			dado2++;
		}	
		dado1++;
	}
	amosarResultado((probabilidade / Math.pow(CARAS,DADOS)).toFixed(3));
}

function resolver_3_12(numero) { 
	bucle = true; 
	if (isNaN(numero)) {
		amosarResultado('Debes introducir un número');
	} else {	
		var numero = parseFloat(numero); 
		if (primeiraVez) {
			numeroMaior = numero;
			primeiraVez = false;
		} else {
			if (numero > numeroMaior) {
				numeroMaior = numero;
			}	 				
		}	
		amosarResultado('O maior número introducido é o ' + numeroMaior);
		chamarFuncion(3,12);
	}			
}






