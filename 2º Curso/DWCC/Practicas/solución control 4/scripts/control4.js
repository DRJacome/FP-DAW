function control4() {
	cargarEnunciado();
	iniciarVariables();
	pintarButacas();
}

function pintarButacas() {
	var cor, clase;
	reservadas = new Array();
	var butacas = '<div id="patio">';
	for (let i = 0; i < asentos.length; i++) {
		for (let j = 0; j < asentos[i].length; j++) {
			if (asentos[i][j]) {
				cor = 'vermello';
				clase = 'ocupada';
			} else {
				cor = 'verde';
				clase = 'butaca';
			}
			butacas += '<img id="butaca_' + i + '_' + j + '" src="./imaxes/' + cor + '.png" class="' + clase + '" onclick="reservar(' + i + ',' + j + ');">';
		}
		butacas += '<br>';
	}
	butacas += '<br><button type="button" onClick="actualizar();">Reservar asentos</button></div>';
	datos.innerHTML = butacas;
}

function reservar(fila, columna) {
	if (asentos[fila][columna] == false) {
		var butaca = document.getElementById('butaca_' + fila + '_' + columna);
		butaca.src = './imaxes/amarelo.png';
		reservadas.push([fila, columna]);
	}
}

function actualizar() {
	var resposta = confirm('Queres reservar os asentos marcados en amarelo?');
	if (resposta) {
		while (reservadas.length > 0) {
			var reserva = reservadas.pop();
			asentos[reserva[0]][reserva[1]] = true;
		}
	}
	pintarButacas();
}

