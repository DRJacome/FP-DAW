// usar o parámetro na resolución
//function resolver_5_1(número) {
function resolver_5_1(numero) {
	// declarar a variable texto como local
	var texto = '';
	// primeiro hai que comprobar que é un número
	if (eNumero(numero)) {
		// a comparación implica un dobre igual	
		//if (numero = 0) {
		if (numero == 0) {
			texto = 'Cero';
		} else if (numero > 0) {
			// debe ser un texto, senón sería unha variable non declarada		
			//texto = Positivo;
			texto = 'Positivo';
		} else {
			texto = 'Negativo';
		}
	} else {
		texto = 'Debes introducir un número';
	}
	// FIN: primeiro hai que comprobar que é un número 
	amosarResultado(texto);
}

function resolver_5_2() {
	// non xera os números que dicimos no enunciado, só xera o 1	
	//aleatorio = Math.floor(Math.random()) + 1;
	aleatorio = Math.floor(Math.random()*100) + 1;
	// indicar o intento
	intento = 0;	
	pedirNumero();
}

function resolver_5_4() {
	var vector = [1,2,3];
	var outroVector = vector;
	modifica(outroVector);
	alert(vector[0]);
}

function modifica(vectorAuxiliar) {
    vectorAuxiliar[0] = 'Ola!!!';
}

function pedirNumero() {
	// controlar se é o último para non pintar mal o intento
	if (intento != 10) {
		// indicar o intento
		intento++;
	}	
	// indicar en que intento vai
	/*datos.innerHTML = 
		'Número <input id="numero" type="text"/>' +
		'<button type="button" onClick="comprobarNumero(numero.value);">Premer</button>';*/
	datos.innerHTML = 
		intento + 'º intento: Número <input id="numero" type="text"/>' +
		'<button id="boton" type="button" onClick="comprobarNumero(numero.value);">Premer</button>';

}

function doom(){
	window.open ('./doom/index.html')
}

function comprobarNumero(numero) {
	// declarar a variable texto como local
	var texto = '';
	if (!nEDDC(numero)) {
		if (numero != aleatorio) {
			if (numero > aleatorio) {
				texto = 'O número aleatorio é menor';
			} else {
				// o texto non indica o que debe			
				//texto = 'O número aleatorio é menor';
				texto = 'O número aleatorio é maior';
			}
		}	
	} else {
		texto = 'Debes introducir un número';
	}
	// comprobar se o intento é válido
	if (intento < 10 && numero != aleatorio) {
		pedirNumero();
	} else {
		if (numero == aleatorio) {
			texto = 'Atinaches no ' + intento + 'º intento';
		} else {
			texto = 'Xa remataches os teus intentos. O número buscado era o ' + aleatorio;
		}	
		// desactivar o botón
		document.getElementById('boton').disabled = true;
	}			 
	// FIN comprobar se o intento é válido
	amosarResultado(texto);
}

// función repetida, colle a derradeira
/*
function modifica(auxiliar) {
  cadea = new Array(80,101,114,111,32,100,101,32,113,117,101,32,118,97,115,44,32,116,237,111,33,33,33,32,65,32,116,105,32,105,115,116,111,32,112,97,114,233,99,101,99,104,101,32,117,110,32,115,97,250,100,111,63);
  var saida='';
  for (var i=0; i< cadea.length; i++) {
	 saida += String.fromCharCode(cadea[i]);
  }
  auxiliar[0] = saida;
}
*/

function nEDDC(numero) { // numeroEnteiroDistintoDeCero
	// debemos igualar o numero para quitar os espazos
	//numero.trim();
	numero = numero.trim();
	return (isNaN(numero) || numero==0 || (numero % 1 != 0) || numero == '');
}	


function eNumero(numero) { // comproba se é número e que non sexa un ou varios espazos en branco
	numero = numero.trim();
	return !(isNaN(numero) || numero == '');
}	
