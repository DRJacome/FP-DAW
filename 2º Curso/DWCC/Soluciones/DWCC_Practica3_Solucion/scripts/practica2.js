//var primeiraVez = true;
var area;
var contador = 0;
var anterior;
var numeros;

function opcionSubmenu_2(opcion) {
	exercicio1.classList.remove("activo");
	exercicio2.classList.remove("activo");
	exercicio3.classList.remove("activo");	
	exercicio4.classList.remove("activo");
	exercicio5.classList.remove("activo");
	exercicio6.classList.remove("activo");	
	exercicio7.classList.remove("activo");
	exercicio8.classList.remove("activo");
	exercicio9.classList.remove("activo");	
	exercicio10.classList.remove("activo");
	exercicio11.classList.remove("activo");
	exercicio12.classList.remove("activo");	
	exercicio13.classList.remove("activo");
	exercicio14.classList.remove("activo");
	exercicio15.classList.remove("activo");
	exercicio16.classList.remove("activo");
	switch(opcion) {
		case 1: exercicio1.classList.add("activo"); break;
		case 2: exercicio2.classList.add("activo"); break;
		case 3: exercicio3.classList.add("activo"); break;
		case 4: exercicio4.classList.add("activo"); break;
		case 5: exercicio5.classList.add("activo"); break;
		case 6: exercicio6.classList.add("activo"); break;
		case 7: exercicio7.classList.add("activo"); break;
		case 8: exercicio8.classList.add("activo"); break;
		case 9: exercicio9.classList.add("activo"); break;
		case 10: exercicio10.classList.add("activo"); break;
		case 11: exercicio11.classList.add("activo"); break;
		case 12: exercicio12.classList.add("activo"); break;
		case 13: exercicio13.classList.add("activo"); break;
		case 14: exercicio14.classList.add("activo"); break;
		case 15: exercicio15.classList.add("activo"); break;
		case 16: exercicio16.classList.add("activo"); break;
		default: break;
	}	
}

function exercicio_2_1(opcion){
	opcionSubmenu_2(opcion);
	enunciado.textContent = 'Imprimir o valor absoluto dun número dado';
	datos.innerHTML = 
        'Número <input id="varA" type="text"/>' +
        '<button type="button" onClick="resolver_2_1(varA.value);">Premer</button>';
	resultado.textContent = '';
}

function resolver_2_1(varA) {
	var texto = '';
	if (!isNaN(varA)) {
		var numero = parseFloat(varA);
		if (numero < 0) {
			numero *= -1;
		}
		texto = 'O valor absoluto do número introducido é: ' + numero;		
	} else {
		texto = 'Debes introducir un número';
	}	
	amosarResultado(texto);
}

function exercicio_2_2(opcion){
	opcionSubmenu_2(opcion);
	enunciado.textContent = 'Calcular a superficie dunha figura xeométrica. A figura só pode ser TRIÁNGULO, CADRADO, RECTÁNGULO ou CÍRCULO';
	datos.innerHTML = 
        '<select id="figura">' +
        '   <option>Triángulo</option>' +
        '   <option>Cadrado</option>' +
        '   <option>Rectángulo</option>' +
        '   <option>Círculo</option>' +
        '</select>' +
        '<button type="button" onClick="resolver_2_2(figura.value);">Premer</button>';
	resultado.textContent = '';
}

function resolver_2_2(figura) {
	switch (figura) {
		case 'Triángulo':
		case 'Rectángulo':		
            datos.innerHTML = 
                'Base <input id="base" type="text"/>' +
                'Altura <input id="altura" type="text"/>' +
                '<button type="button" onClick="calcular(\'' + figura + '\',base.value,altura.value);">Premer</button>';		
			break;	
		case 'Cadrado':	
            datos.innerHTML = 
                'Lado <input id="lado" type="text"/>' +
                '<button type="button" onClick="calcular(\'' + figura + '\',lado.value,lado.value);">Premer</button>';		
			break;	
		case 'Círculo':	
            datos.innerHTML = 
                'Radio <input id="radio" type="text"/>' +
                '<button type="button" onClick="calcular(\'' + figura + '\',radio.value,radio.value);">Premer</button>';	
			break;	
		default:
			amosarResultado('Non sei que figura é');
	}	
	
}

function calcular(figura,varA,varB) {
	var texto = '';
	if (isNaN(varA) || isNaN(varB)) {
		texto = 'Introduce un número';
	} else {
		area = calcularArea(figura,varA,varB);
		texto = 'A área do ' + figura + ' é ' + area;		
	}	
	amosarResultado(texto);
}

function calcularArea(figura,varA,varB) {
	var varA = parseFloat(varA);
	var varB = parseFloat(varB);
	switch (figura) {
		case 'Triángulo': var area = (varA * varB) / 2; break;
		case 'Rectángulo': var area = varA * varB; break;	
		case 'Cadrado': var area = varA * varA; break;	
		case 'Círculo': var area = Math.PI * varA * varA; break;	
	}	
	return area;
}

function exercicio_2_3(opcion){
	opcionSubmenu_2(opcion);
	primeiraVez = true;
	enunciado.textContent = 'Modifica o programa anterior para que, dadas dúas figuras, indique cal delas ten unha superficie maior';
	datos.innerHTML = 
        '<select id="figura">' +
        '   <option>Triángulo</option>' +
        '   <option>Cadrado</option>' +
        '   <option>Rectángulo</option>' +
        '   <option>Círculo</option>' +
        '</select>' +
        '<button type="button" onClick="resolver_2_3(figura.value);">Premer</button>';
	resultado.textContent = '';
}

function resolver_2_3(figura) {
	switch (figura) {
		case 'Triángulo':
		case 'Rectángulo':		
            datos.innerHTML = 
                'Base <input id="base" type="text"/>' +
                'Altura <input id="altura" type="text"/>' +
                '<button type="button" onClick="compararAreas(\'' + figura + '\',base.value,altura.value);">Premer</button>';		
			break;	
		case 'Cadrado':	
            datos.innerHTML = 
                'Lado <input id="lado" type="text"/>' +
                '<button type="button" onClick="compararAreas(\'' + figura + '\',lado.value,lado.value);">Premer</button>';		
			break;	
		case 'Círculo':	
            datos.innerHTML = 
                'Radio <input id="radio" type="text"/>' +
                '<button type="button" onClick="compararAreas(\'' + figura + '\',radio.value,radio.value);">Premer</button>';	
			break;	
		default:
			amosarResultado('Non sei que figura é');
	}		
}

function compararAreas(figura,varA,varB) {
	var texto = '';
	if (isNaN(varA) || isNaN(varB)) {
		texto = 'Introduce un número';
	} else {
		if (primeiraVez) {
			exercicio_2_3(3);
			primeiraVez = false;
			area = calcularArea(figura,varA,varB);
		} else {
			var area2 = calcularArea(figura,varA,varB); 
			if (area > area2) {
				texto = 'A área da 1ª figura é maior que a da 2ª figura';
			} else if (area2 > area) {
				texto = 'A área da 2ª figura é maior que a da 1ª figura';
			} else {
				texto = 'A área das dúas figuras é a mesma';
			}				
		}
	}	
	amosarResultado(texto);
}

		










