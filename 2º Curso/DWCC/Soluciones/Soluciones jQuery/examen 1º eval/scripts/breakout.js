function breakout() {
	const LADRILLOS = 18;
	pausa = false;
	variacion_X = 1;
	variacion_Y = 1;
	// Amosar marcador inicial
	liñas = 0;
	puntos = 0;
	puntuacion.innerHTML = '<div id="liñas" class="esquerda"></div><div id="puntos" class="dereita"></div>';
	document.getElementById('liñas').innerHTML = escribirTexto('LIÑAS ' + liñas, 'puntos');
	document.getElementById('puntos').innerHTML = escribirTexto('PUNTOS ' + puntos, 'puntos');
	// FIN Amosar marcador inicial

	// Colocar o muro de ladrillos 
	cores = new Array('amarelo', 'azul', 'verde', 'vermello');
	let ladrillos = '';
	muro = new Array();
	for (let i = 0; i < cores.length; i++) {
		for (let j = 0; j < LADRILLOS; j++) {
			let puntos = Math.ceil(Math.random() * 5);	// Dar unha puntuación aleatoria enteira a cada ladrillo entre 1 e 5
			ladrillos += '<img id="ladrillo_' + i + '_' + j + '" src="imaxes/ladrillos/' + cores[i] + '.png" class="' + cores[i] + ' ladrillo" puntos="' + puntos + '"/>';
			// Gardar o identificador de cada ladrillo
			muro.push('ladrillo_' + i + '_' + j);
		}
	}
	pano.innerHTML = ladrillos;

	// Colocar cada ladrillo nunha posición fixa
	for (let i = 0; i < muro.length; i++) {
		var ladrillo = document.getElementById(muro[i]);
		var posicions = (ladrillo.id).split('_');
		ladrillo.style.left = pano.offsetLeft + ladrillo.width * posicions[2] + 'px';
		ladrillo.style.top = pano.offsetTop + ladrillo.height * posicions[1] + 'px';
	}

	// FIN Colocar o muro de ladrillos

	// Colocar a paleta
	pano.innerHTML += '<img src="imaxes/ladrillos/barra.png" id="barra" class="barra"/>';
	// FIN Colocar a paleta

	// Mover a paleta coas teclas de esquerda e dereita
	window.addEventListener("keydown",
		function (tecla) {
			switch (tecla.keyCode) {
				case 32:
					pausa = !pausa;
					if (pausa) {
						amosarRegras();
					} else {
						regras.innerHTML = '';
						golpearBola();	// Empezar o xogo premendo a barra espazadora
					}
					break;
				case 37:
					var offset = barra.offsetLeft - barra.width / 2;
					// Controlar chocar co lateral
					if (offset < 0) {
						offset = 0;
						musica('lateral');	// Emitir un son cando choca lateralmente a paleta
					}
					barra.style.left = offset + 'px';
					break;
				case 39:
					var offset = barra.offsetLeft + barra.width / 2;
					// Controlar chocar co lateral
					if (offset + barra.width > pano.clientWidth) {
						offset = pano.clientWidth - barra.width;
						musica('lateral');	// Emitir un son cando choca lateralmente a paleta
					}
					barra.style.left = offset + 'px';
					break;
				default: break; // calquera outra tecla que premamos non fai nada	
			}
		}, false);
	// FIN Mover a paleta coas teclas de esquerda e dereita

	// Colocar a bóla
	pano.innerHTML += '<img src="imaxes/bola.png" id="bola" class="bola"/>';
	// FIN Colocar a bóla

	// Asignar abscisa e ordenada da bóla e sentido inicial
	abscisa = bola.offsetLeft;
	ordenada = bola.offsetTop;
	sentido_X = true;
	sentido_Y = true;
	// FIN Asignar abscisa e ordenada da bóla e sentido inicial
}

// Amosar marcador inicial
function escribirTexto(texto, clase) {
	let textoVisual = '';
	for (let i = 0; i < texto.length; i++) {
		textoVisual += '<img class="' + clase + '" src="./imaxes/alfabeto/' + ((texto.substring(i, i + 1) == ' ') ? 'ESPAZO' : texto.substring(i, i + 1)) + '.png"/>';
	}
	return textoVisual;
}

// Golpear a bóla contra a barra ou contra un ladrillo
function golpearBola() {
	// Movemos a bóla  a unha velocidade constante (5ms)
	movemento = setInterval(function () { if (!pausa) mover(bola); }, 5);

	// Control do movemento da bóla, controlando as colisións cos bordos
	function mover(bola) {
		if (sentido_X) { abscisa += variacion_X; } else { abscisa -= variacion_X; }		// Aumentamos ou diminuimos a abscisa
		if (sentido_Y) { ordenada += variacion_Y; } else { ordenada -= variacion_Y; }	// Aumentamos o diminuimos a ordenada
		controlarChoqueBarra();
		controlarChoqueLadrillos();
		controlarChoqueLateral();

		// Movemos a bóla en ambos eixos
		bola.style.left = abscisa + 'px';
		bola.style.top = ordenada + 'px';
	}
}

function controlarChoqueLateral() {
	// Controlamos o choque horizontal cos bordos
	if (abscisa <= 0) {
		sentido_X = true;
		abscisa = 0;
	} else if (abscisa >= pano.clientWidth - bola.width) {
		// Se colisiona horizontalmente cambiamos a dirección
		sentido_X = false;
		abscisa = pano.clientWidth - bola.width;
	}

	// Controlamos o choque vertical cos bordos
	if (ordenada <= 0) {
		// Se colisiona por arriba cambiamos a dirección
		sentido_Y = true;
		ordenada = 0;
	} else if (ordenada >= pano.clientHeight - bola.width) {
		// Se non se devolve a bóla a partida remata
		partidaRematada();
		musica('chicharra');
	}
}

function controlarChoqueLadrillos() {
	// Controlamos que estea á altura dalgún dos ladrillos e que choque con el
	for (let i = 0; i < muro.length; i++) {
		var ladrillo = document.getElementById(muro[i]);
		if (pano.offsetTop + ordenada <= ladrillo.offsetTop + ladrillo.height && pano.offsetLeft + abscisa >= ladrillo.offsetLeft && pano.offsetLeft + abscisa <= ladrillo.offsetLeft + ladrillo.width) {
			musica('ladrillo'); 	// golpear ladrillo
			sentido_Y = true;
			// Comprobar se unha liña se completou
			if ((ladrillo.classList.contains('amarelo') && document.getElementsByClassName('amarelo').length == 1) ||
				(ladrillo.classList.contains('verde') && document.getElementsByClassName('verde').length == 1) ||
				(ladrillo.classList.contains('vermello') && document.getElementsByClassName('vermello').length == 1) ||
				(ladrillo.classList.contains('azul') && document.getElementsByClassName('azul').length == 1)) {
				liñas++;
				puntos += 100;
				document.getElementById('liñas').innerHTML = escribirTexto('LIÑAS ' + liñas, 'puntos');
			}
			puntos += parseInt(ladrillo.getAttribute('puntos'));
			document.getElementById('puntos').innerHTML = escribirTexto('PUNTOS ' + puntos, 'puntos');
			muro.splice(i, 1);
			pano.removeChild(ladrillo);
			if (muro.length == 0) {
				partidaRematada(); 	// Remata a partida porque acabamos os ladrillos
				musica('campion');
			}
		}
	}
}

function amosarRegras() {
	let codigo =
		'<div class="panel">' +
		'<div class="xanela">' +
		'<div class="regras">' + escribirTexto('AQUI IRIAN AS REGRAS DO XOGO', 'regras') + '<br>' + escribirTexto('PREME A BARRA ESPAZADORA PARA VOLVER AO XOGO', 'regras') + '</div>' +
		'</div>' +
		'</div>';
	regras.innerHTML = codigo;
}

function partidaRematada() {
	clearInterval(movemento);
	pausa = true;
	let codigo =
		'<div class="panel">' +
		'<div class="xanela">' +
		'<div>' + escribirTexto('GAME OVER', 'puntos') + '</div>' +
		'</div>' +
		'</div>';
	regras.innerHTML = codigo;
}