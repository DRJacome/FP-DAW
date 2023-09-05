var NUMERO_PRACTICAS = 5;

function cargarMenu() {
    var texto = ''; 
	for(var i=1; i<=NUMERO_PRACTICAS; i++) {
		texto += '<div id="practica' + i + '" class="menu" onClick="cargarSubmenu(' + i + ');">Práctica ' + i + '</div>';
	}		
	menu.innerHTML = texto;	
}

function cargarSubmenu(opcion) {
    inicializarEstetica(opcion);
	switch (opcion) {
        case 1: NUMERO_EXERCICIOS = 13; break;
        case 2: NUMERO_EXERCICIOS = 16; break;
        case 3: NUMERO_EXERCICIOS = 21; break;
        default: NUMERO_EXERCICIOS = 0;            
    }
    var texto = '<div>'; 
	for(var i=1; i<=NUMERO_EXERCICIOS; i++) {
		texto += '<div id="exercicio' + i + '" class="submenu" onClick="pedirDatos(' + opcion + ',' + i + ');">Exercicio ' + i + '</div>';
	}    
	texto += '</div>';
    submenu.innerHTML = texto;
}

function opcionSubmenu(opcion) {
	for(var i=1; i<=NUMERO_EXERCICIOS; i++) {
		document.getElementById('exercicio' + i).classList.remove("activo");
	}
	document.getElementById('exercicio' + opcion).classList.add("activo");
}

function inicializarEstetica(opcion) {
	for(var i=1; i<=NUMERO_PRACTICAS; i++) {
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

function pedirDatos(practica,opcion){
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
				case 5:	
					enunciado.innerHTML = 'Cálculo do Factorial dun número calquera'; 
					datos.innerHTML = 
						'Número: <input id="numero" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(numero.value);">Premer</button>';
					break;
				case 6:
					enunciado.innerHTML = 'Imprime a serie 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5...';
					datos.innerHTML = 
						'Límite: <input id="limite" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(limite.value);">Premer</button>';
					break;	
				case 7:
					enunciado.innerHTML = 'Imprime a serie 0, 1, -1, 2, -2, 3, -3, 4, -4...';
					datos.innerHTML = 
						'Límite: <input id="limite" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(limite.value);">Premer</button>';
					break;
				case 8:
					enunciado.innerHTML = 'Imprime a serie de Fibonacci; é dicir, a serie que, empezando polo 1, presenta como seguinte elemento a suma dos dous anteriores: 1, 1, 2, 3, 5, 8, 13...';
					datos.innerHTML = 
						'Límite: <input id="limite" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(limite.value);">Premer</button>';
					break;
				case 9:
					enunciado.innerHTML = 'Imprime a serie 0, 1, 4, 3, 16, 5, 36...; é dicir n<sup>2</sup>, n+1, (n+2)<sup>2</sup>, n+3...';
					datos.innerHTML = 
						'Límite: <input id="limite" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(limite.value);">Premer</button>';
					break;
				case 10:
					enunciado.innerHTML = 'Dado un número N, amosar por pantalla todas as combinacións de dous números naturais que sumados dean N';
					datos.innerHTML = 
						'Límite: <input id="limite" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(limite.value);">Premer</button>';
					break;
				case 11:
					enunciado.innerHTML = 'Calcular a probabilidade de que dous dados lanzados sumen 7 e amósala por pantalla';
					datos.innerHTML = 
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Premer</button>';
					break;	
				case 12:
					enunciado.innerHTML = 'Dados N números, indica cal é o maior';
					datos.innerHTML = 
						'Número: <input id="numero" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(numero.value);">Premer</button>';
					break;	
				case 13:
					enunciado.innerHTML = 'Dados 3 números, calcular o máximo común divisor';
					datos.innerHTML = 
						'Número 1: <input id="numero1" type="text"/>' +
						'Número 2: <input id="numero2" type="text"/>' +
						'Número 3: <input id="numero3" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(numero1.value,numero2.value,numero3.value);">Premer</button>';
					break;	
				case 14:
					enunciado.innerHTML = 'Dado un número, sacar por pantalla a suma dos díxitos que o forman';
					datos.innerHTML = 
						'Número: <input id="numero" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(numero.value);">Premer</button>';
					break;
				case 15:
					enunciado.innerHTML = 'Dado un número, indicar se é par, se é primo e se é cadrado perfecto';
					datos.innerHTML = 
						'Número: <input id="numero" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(numero.value);">Premer</button>';
					break;					
				case 16:
					enunciado.innerHTML = 'Escribir un programa que lea N números enteiros e indique en que posición introducimos o valor máximo';
					datos.innerHTML = 
						'Número: <input id="numero" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(numero.value);">Premer</button>';
					break;					
				case 17:
					enunciado.innerHTML = 'Escribir un programa que calcule o máximo común divisor de dous números naturais positivos segundo o algoritmo de Euclides, que consiste en ir restando o número menor ao maior ata obter dous números iguais, momento no que temos o máximo común divisor';
					datos.innerHTML = 
						'Número 1: <input id="numero1" type="text"/>' +
						'Número 2: <input id="numero2" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(numero1.value,numero2.value);">Premer</button>';
					break;					
				case 18:
					enunciado.innerHTML = 'Escribir un programa que amose todas as fichas do xogo do dominó';
					datos.innerHTML = 
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Premer</button>';
					break;					
				case 19:
					enunciado.innerHTML = 'Debuxar por pantalla con asteriscos o número de liñas que introduce o usuario (cada liña debe ter o número de asteriscos que se corresponde co número de liña)';
					datos.innerHTML = 
						'Número de liñas: <input id="numero" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(numero.value);">Premer</button>';
					break;					
				case 20:
					enunciado.innerHTML = 'Debuxar por pantalla con asteriscos un cadrado usando o número de liñas que introduce o usuario (a liña inferior e superior debe ter o número de asteriscos que introduce o usuario)';
					datos.innerHTML = 
						'Número de liñas: <input id="numero" type="text"/>' +
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '(numero.value);">Premer</button>';
					break;					
				case 21:
					enunciado.innerHTML = 
						'<p>Vamos facer unha simulación do xogo da canción infantil <span class="negra">pim-pam-pum</span>. Consiste en ir dicindo alternativamente cada neno os números naturais dende o 1 ata o 30 de maneira que:</p>' +
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
						'<button type="button" onClick="resolver_' + practica + '_' + opcion + '();">Premer</button>';
					break;					
				default: alert('Exercicio inexistente');
			}
			break;
		default: alert('Práctica aínda non resolta');	
	}	
	
	resultado.innerHTML = '';
}

