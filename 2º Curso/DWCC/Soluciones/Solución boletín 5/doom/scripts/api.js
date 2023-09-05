function refrescarPantalla(datos){
	cara.innerHTML = '<img src="./imaxes/caras/' + datos[0] + '.png">'; 
	
	// cambiamos os switch por unha función parametrizada que refresque
	/*switch (datos[1][0].toString().length) {
		case 1: 
			municion.innerHTML = '<img src="./imaxes/vermello/espazo.png">' + 
								'<img src="./imaxes/vermello/espazo.png">' +
								'<img src="./imaxes/vermello/' + datos[1][0].toString().substring(0,1) + '.png">'; 
			break;
		case 2: 
			municion.innerHTML = '<img src="./imaxes/vermello/espazo.png">' + 
								'<img src="./imaxes/vermello/' + datos[1][0].toString().substring(0,1) + '.png">' +
								'<img src="./imaxes/vermello/' + datos[1][0].toString().substring(1,2) + '.png">'; 
			break;
		case 3: 
			municion.innerHTML = '<img src="./imaxes/vermello/' + datos[1][0].toString().substring(0,1) + '.png">' + 
								'<img src="./imaxes/vermello/' + datos[1][0].toString().substring(1,2) + '.png">' +
								'<img src="./imaxes/vermello/' + datos[1][0].toString().substring(2,3) + '.png">'; 
			break;		
		default:
	}
	
	switch (datos[1][1].toString().length) {
		case 1: 
			vida.innerHTML = '<img src="./imaxes/vermello/espazo.png">' + 
							'<img src="./imaxes/vermello/espazo.png">' +
							'<img src="./imaxes/vermello/' + datos[1][1].toString().substring(0,1) + '.png">'; 
			break;
		case 2: 
			vida.innerHTML = '<img src="./imaxes/vermello/espazo.png">' + 
							'<img src="./imaxes/vermello/' + datos[1][1].toString().substring(0,1) + '.png">' +
							'<img src="./imaxes/vermello/' + datos[1][1].toString().substring(1,2) + '.png">'; 
			break;
		case 3: 
			vida.innerHTML = '<img src="./imaxes/vermello/' + datos[1][1].toString().substring(0,1) + '.png">' + 
							'<img src="./imaxes/vermello/' + datos[1][1].toString().substring(1,2) + '.png">' +
							'<img src="./imaxes/vermello/' + datos[1][1].toString().substring(2,3) + '.png">'; 
			break;		
		default:

	switch (datos[1][2].toString().length) {
		case 1: 
			escudo.innerHTML = '<img src="./imaxes/vermello/espazo.png">' + 
								'<img src="./imaxes/vermello/espazo.png">' +
								'<img src="./imaxes/vermello/' + datos[1][2].toString().substring(0,1) + '.png">'; 
			break;
		case 2: 
			escudo.innerHTML = '<img src="./imaxes/vermello/espazo.png">' + 
								'<img src="./imaxes/vermello/' + datos[1][2].toString().substring(0,1) + '.png">' +
								'<img src="./imaxes/vermello/' + datos[1][2].toString().substring(1,2) + '.png">'; 
			break;
		case 3: 
			escudo.innerHTML = '<img src="./imaxes/vermello/' + datos[1][2].toString().substring(0,1) + '.png">' + 
								'<img src="./imaxes/vermello/' + datos[1][2].toString().substring(1,2) + '.png">' +
								'<img src="./imaxes/vermello/' + datos[1][2].toString().substring(2,3) + '.png">'; 
			break;		
		default:
	}	
	*/
	refrescarNumeros('vermello','municion',0);
	refrescarNumeros('vermello','vida',1);
	refrescarNumeros('vermello','escudo',2);
	
	amarela.innerHTML = datos[2][0] ? '<img src="./imaxes/chaves/' + chaves[0] + '.png">' : '';
	azul.innerHTML = datos[2][1] ? '<img src="./imaxes/chaves/' + chaves[1] + '.png">' : '';
	vermella.innerHTML = datos[2][2] ? '<img src="./imaxes/chaves/' + chaves[2] + '.png">' : '';
	
	/*switch (datos[1][3].toString().length) {
		case 1: 
			balas.innerHTML = '<img src="./imaxes/amarelo/espazo.png">' + 
								'<img src="./imaxes/amarelo/espazo.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][3].toString().substring(0,1) + '.png">'; 
			break;
		case 2: 
			balas.innerHTML = '<img src="./imaxes/amarelo/espazo.png">' + 
								'<img src="./imaxes/amarelo/' + datos[1][3].toString().substring(0,1) + '.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][3].toString().substring(1,2) + '.png">'; 
			break;
		case 3: 
			balas.innerHTML = '<img src="./imaxes/amarelo/' + datos[1][3].toString().substring(0,1) + '.png">' + 
								'<img src="./imaxes/amarelo/' + datos[1][3].toString().substring(1,2) + '.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][3].toString().substring(2,3) + '.png">'; 
			break;		
		default:
	}			
	
	switch (datos[1][4].toString().length) {
		case 1: 
			cartuchos.innerHTML = '<img src="./imaxes/amarelo/espazo.png">' + 
								'<img src="./imaxes/amarelo/espazo.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][4].toString().substring(0,1) + '.png">'; 
			break;
		case 2: 
			cartuchos.innerHTML = '<img src="./imaxes/amarelo/espazo.png">' + 
								'<img src="./imaxes/amarelo/' + datos[1][4].toString().substring(0,1) + '.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][4].toString().substring(1,2) + '.png">'; 
			break;
		case 3: 
			cartuchos.innerHTML = '<img src="./imaxes/amarelo/' + datos[1][4].toString().substring(0,1) + '.png">' + 
								'<img src="./imaxes/amarelo/' + datos[1][4].toString().substring(1,2) + '.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][4].toString().substring(2,3) + '.png">'; 
			break;		
		default:
	}		
	
	switch (datos[1][5].toString().length) {
		case 1: 
			misiles.innerHTML = '<img src="./imaxes/amarelo/espazo.png">' + 
								'<img src="./imaxes/amarelo/espazo.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][5].toString().substring(0,1) + '.png">'; 
			break;
		case 2: 
			misiles.innerHTML = '<img src="./imaxes/amarelo/espazo.png">' + 
								'<img src="./imaxes/amarelo/' + datos[1][5].toString().substring(0,1) + '.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][5].toString().substring(1,2) + '.png">'; 
			break;
		case 3: 
			misiles.innerHTML = '<img src="./imaxes/amarelo/' + datos[1][5].toString().substring(0,1) + '.png">' + 
								'<img src="./imaxes/amarelo/' + datos[1][5].toString().substring(1,2) + '.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][5].toString().substring(2,3) + '.png">'; 
			break;		
		default:
	}	
	
	switch (datos[1][6].toString().length) {
		case 1: 
			celulas.innerHTML = '<img src="./imaxes/amarelo/espazo.png">' + 
								'<img src="./imaxes/amarelo/espazo.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][6].toString().substring(0,1) + '.png">'; 
			break;
		case 2: 
			celulas.innerHTML = '<img src="./imaxes/amarelo/espazo.png">' + 
								'<img src="./imaxes/amarelo/' + datos[1][6].toString().substring(0,1) + '.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][6].toString().substring(1,2) + '.png">'; 
			break;
		case 3: 
			celulas.innerHTML = '<img src="./imaxes/amarelo/' + datos[1][6].toString().substring(0,1) + '.png">' + 
								'<img src="./imaxes/amarelo/' + datos[1][6].toString().substring(1,2) + '.png">' +
								'<img src="./imaxes/amarelo/' + datos[1][6].toString().substring(2,3) + '.png">'; 
			break;		
		default:
	}
	*/
	refrescarNumeros('amarelo','balas',3);
	refrescarNumeros('amarelo','cartuchos',4);
	refrescarNumeros('amarelo','misiles',5);	
	refrescarNumeros('amarelo','celulas',6);	
}

function amosarPantalla(numero) {
	pantalla.style.backgroundImage = 'url(./imaxes/pantallas/' + numero + '.jpg)'; 	
	puntos.style.backgroundImage = 'url(./imaxes/puntos.png)'; 	
}

window.addEventListener("keydown", function (tecla) { if(tecla.keyCode == 32) { disparar(); } },false);

function refrescarNumeros(cor,campo,valor) {
	var elemento = document.getElementById(campo);
	switch (datos[1][valor].toString().length) {
		case 1: 
			elemento.innerHTML = '<img src="./imaxes/' + cor + '/espazo.png">' + 
								'<img src="./imaxes/' + cor + '/espazo.png">' +
								'<img src="./imaxes/' + cor + '/' + datos[1][valor].toString().substring(0,1) + '.png">'; 
			break;
		case 2: 
			elemento.innerHTML = '<img src="./imaxes/' + cor + '/espazo.png">' + 
								'<img src="./imaxes/' + cor + '/' + datos[1][valor].toString().substring(0,1) + '.png">' +
								'<img src="./imaxes/' + cor + '/' + datos[1][valor].toString().substring(1,2) + '.png">'; 
			break;
		case 3: 
			elemento.innerHTML = '<img src="./imaxes/' + cor + '/' + datos[1][valor].toString().substring(0,1) + '.png">' + 
								'<img src="./imaxes/' + cor + '/' + datos[1][valor].toString().substring(1,2) + '.png">' +
								'<img src="./imaxes/' + cor + '/' + datos[1][valor].toString().substring(2,3) + '.png">'; 
			break;		
		default:
	}
}