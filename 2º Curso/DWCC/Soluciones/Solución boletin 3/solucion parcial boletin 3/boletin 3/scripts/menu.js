const NUMERO_BOLETINS = 3;
var numeroDeExercicios = 0;

function cargarMenu() {
	for (let i=1; i<=NUMERO_BOLETINS; i++) {
		menu.innerHTML += '<div id="boletin' + i + '" class="menu" onClick="cargarSubmenu(' + i + ');">Boletín ' + i + '</div>';
	} 
}

function cargarSubmenu(opcion) {
	inicializarEstetica(opcion);
	switch (opcion) {
		case 1: numeroDeExercicios = 16; break;		
		case 2: numeroDeExercicios = 18; break;		
		case 3: numeroDeExercicios = 23; break;
		default: numeroDeExercicios = 0;		
	}
	for (let i=1; i<=numeroDeExercicios; i++) {
		submenu.innerHTML += '<div id="exercicio' + i + '" class="submenu" onClick="chamarFuncion(' + opcion + ',' + i + ');">Exercicio ' + i + '</div>'; 
	}
}

function inicializarEstetica(opcion) {
	for (let i=1; i<=NUMERO_BOLETINS; i++) {
		document.getElementById('boletin' + i).classList.remove("activo");			
	}	
	document.getElementById('boletin' + opcion).classList.add("activo");			
   submenu.innerHTML = '';
   enunciado.innerHTML = '';
   datos.innerHTML = '';
   resultado.innerHTML = '';    
}

function opcionSubmenu(exercicio) {
	for (let i=1; i<=numeroDeExercicios; i++) {
		document.getElementById('exercicio' + i).classList.remove("activo");
	}
	document.getElementById('exercicio' + exercicio).classList.add("activo");
}

function chamarFuncion(boletin,exercicio) {
	opcionSubmenu(exercicio);
	switch(boletin) {
		case 1: break;
		case 2: break;
		case 3:
			switch(exercicio) {
				case 1:
					enunciado.innerHTML = 'Suma dos primeiros 50 números naturais';
					datos.innerHTML =  
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'();">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 2:
					enunciado.innerHTML = 'Imprimir un contador do 0 ao 100';
					datos.innerHTML =  
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'();">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 3:
					enunciado.innerHTML = 'Suma dos números pares existentes entre o 0 e o 100';
					datos.innerHTML =  
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'();">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 4:
					enunciado.innerHTML = 'Imprimir os números primos existentes entre o 0 e o 100';
					datos.innerHTML =  
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'();">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 5:
					enunciado.innerHTML = 'Cálculo do Factorial dun número calquera';
					datos.innerHTML =  
						'<label for="numero">Número: </label><input id="numero" type="text"/>' +
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'(numero.value);">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 6:
					enunciado.innerHTML = 'Imprime a serie 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5...';
					datos.innerHTML =  
						'<label for="numero">Número: </label><input id="numero" type="text"/>' +
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'(numero.value);">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 7:
					enunciado.innerHTML = 'Imprime a serie 0, 1, -1, 2, -2, 3, -3, 4, -4...';
					datos.innerHTML =  
						'<label for="numero">Número: </label><input id="numero" type="text"/>' +
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'(numero.value);">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 8:
					enunciado.innerHTML = 'Imprime a serie de Fibonacci; é dicir, a serie que, empezando polo 1, presenta como seguinte elemento a suma dos dous anteriores: 1, 1, 2, 3, 5, 8, 13...';
					datos.innerHTML =  
						'<label for="numero">Número: </label><input id="numero" type="text"/>' +
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'(numero.value);">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 9:
					enunciado.innerHTML = 'Imprime a serie 0, 1, 4, 3, 16, 5, 36...; é dicir n<sup>2</sup>, n+1, (n+2)<sup>2</sup>, n+3...';
					datos.innerHTML =  
						'<label for="numero">Número: </label><input id="numero" type="text"/>' +
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'(numero.value);">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 10:
					enunciado.innerHTML = 'Dado un número N, amosar por pantalla todas as combinacións de dous números naturais que sumados dean N';
					datos.innerHTML =  
						'<label for="numero">Número: </label><input id="numero" type="text"/>' +
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'(numero.value);">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 11:
					enunciado.innerHTML = 'Calcular a probabilidade de que dous dados lanzados sumen 7 e amósala por pantalla';
					datos.innerHTML =  
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'();">Premer</button>';
   				resultado.innerHTML = '';	
					break;
				case 12:
					
					enunciado.innerHTML = 'Dados N números, indica cal é o maior';
					datos.innerHTML =  
						'<label for="numero">Cantidade de números: </label><input id="numero" type="text"/>' +
   					'<button type="button" onClick="resolver_' + boletin + '_' + exercicio+'(numero.value);">Premer</button>';
   				if (primeiraVez) { resultado.innerHTML = ''; }
					break;
				default: alert('Exercicio aínda non resolto'); 
			}
			break;
		default: alert('Boletín aínda non resolto');
	}	
}

function amosarResultado(texto) {
    resultado.innerHTML = texto;
}

