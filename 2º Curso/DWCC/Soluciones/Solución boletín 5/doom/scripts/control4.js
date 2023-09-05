function doom() {
	var pantallaActual = Math.round(Math.random() * 7);
	pantallas = new Array(2, 2, 4, 3, 3, 7, 6, 3);		// almacena a arma actual nesta pantalla
	caras = new Array(25, 50, 75, 100, 125, 150);		// almacena o nome numérico das imaxes das caras
	chaves = new Array('amarela', 'azul', 'vermella');	// almacena os nomes das chaves
	datos = new Array(4);								// almacena a caras
	datos[1] = new Array(7);							// almacena os valores que hai que pintar
	datos[2] = new Array(3);							// almacena as chaves que se posúen
	arma = pantallas[pantallaActual];					// arma
	amosarPantalla(pantallaActual);
	datosIniciais(pantallaActual);
}

function datosIniciais(numero) {
	for (var i = 0; i < datos[2].length; i++) {
		datos[2][i] = Math.random() <= 0.5;
	}
	datos[1][1] = Math.round(Math.random() * 200);							// vida
	datos[1][2] = Math.round(Math.random() * 200);							// escudo				
	datos[1][3] = Math.round(Math.random() * 400);							// balas
	datos[1][4] = Math.round(Math.random() * 100);							// cartuchos
	datos[1][5] = Math.round(Math.random() * 100);							// mísiles	
	datos[1][6] = Math.round(Math.random() * 600);							// células de plasma
	datos[0] = caras[datos[1][1] > 125 ? 5 : Math.floor(datos[1][1] / 25)];	// cara
	switch (arma) {															// arma
		// municion
		case 0:
		case 2: datos[1][0] = ''; break;
		case 1:
		case 4: datos[1][0] = datos[1][3]; break;
		case 3: datos[1][0] = datos[1][4]; break;
		case 5: datos[1][0] = datos[1][5]; break;
		case 6:
		case 7: datos[1][0] = datos[1][6]; break;
		default: datos[1][0] = '';
	}
	refrescarPantalla(datos);
}

function disparar() {
	if (datos[1][0] > 0) {
		datos[1][0]--;
		switch (arma) {															// munición
			case 1:
			case 4: datos[1][3]--; break;
			case 3: datos[1][4]--; break;
			case 5: datos[1][5]--; break;
			case 6:
			case 7: datos[1][6]--; break;
			default:
		}
		refrescarPantalla(datos);
	}
}