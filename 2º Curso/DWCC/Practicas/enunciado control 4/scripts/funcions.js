function cargarEnunciado() {
	enunciado.innerHTML = '<p>Precisamos xerar un patio de butacas de 10x12 para poder controlar a venda anticipada de entradas á función teatral que se vai representar no instituto.</p><p> Utilizaremos un código de cores (vermello: ocupado, amarelo: en proceso e verde:libre) para indicar o estado do asento.</p><p>Pódese escoller máis dunha butaca de cada vez e hai que confirmar a elección mediante unha alerta.</p>';
	datos.innerHTML = '';
	solucion.innerHTML = '';
}

function iniciarVariables() {
	const FILAS = 10;
	const COLUMNAS = 12;
	asentos = new Array(FILAS);

	for (let i=0; i<FILAS; i++) {
		asentos[i] = new Array(COLUMNAS);
		for (let j=0; j<COLUMNAS; j++) {
			asentos[i][j] = false;
		}
	}

	asentos[2][4] = true;
	asentos[2][5] = true;
	asentos[4][7] = true;
	asentos[4][10] = true;
	asentos[9][10] = true;
	asentos[9][11] = true;
}	