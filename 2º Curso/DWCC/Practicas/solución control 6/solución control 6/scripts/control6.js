function xogos() {
	nomesXogos.sort();
	let codigo =
		'<img id="ranking" class="icona" src="./imaxes/iconas/activo/ranking.png" onclick="ranking(' + ORDENACION_INICIAL + ');"/>' +
		'<img id="datos" class="icona" src="./imaxes/iconas/activo/datos.png" onclick="simular();"/>' +
		'<img id="imaxes" class="icona" src="./imaxes/iconas/activo/imaxes.png" onclick="imaxes();"/>' +
		'<img id="lista" class="icona" src="./imaxes/iconas/activo/lista.png" onclick="lista();"/>' +
		'<img id="usuario" class="icona" src="./imaxes/iconas/activo/usuario.png"/>' +
		'<img id="sair" class="icona" src="./imaxes/iconas/inactivo/sair.png"/>';
	menu.innerHTML = codigo + '<div id="login"></div>';
	document.getElementById('usuario').addEventListener('click', usuario);
}

function ranking(campo) {
	activarIconas('ranking');
	ordenarVector(rankingXogadores, campo);

	let codigo =
		'<fieldset><legend>RANKING</legend>' +
		'<table><tr>' +
		'<th onclick=ranking(0)>XOGADOR</th>' +
		'<th onclick=ranking(1)>XOGO</th>' +
		'<th onclick=ranking(2)>PANTALLAS</th>' +
		'<th onclick=ranking(3)>PUNTOS</th>' +
		'</tr>';
	for (let i = 0; i < rankingXogadores.length; i++) {
		codigo +=
			'<tr>' +
			'<td>' + rankingXogadores[i][0] + '</td>' +
			'<td>' + rankingXogadores[i][1] + '</td>' +
			'<td>' + rankingXogadores[i][2] + '</td>' +
			'<td>' + rankingXogadores[i][3] + '</td>' +
			'</tr>';
	}
	codigo += "</table></fieldset>";
	document.getElementById('xogos').innerHTML = codigo;
}

function activarIconas(icona) {
	document.getElementById('ranking').src = "./imaxes/iconas/activo/ranking.png";
	document.getElementById('datos').src = "./imaxes/iconas/activo/datos.png";
	document.getElementById('imaxes').src = "./imaxes/iconas/activo/imaxes.png";
	document.getElementById('lista').src = "./imaxes/iconas/activo/lista.png";
	document.getElementById(icona).src = "./imaxes/iconas/inactivo/" + icona + ".png";
}

function simular() {
	activarIconas('datos');
	let codigoSelect = '<select id="xogo">';
	for (let i = 0; i < nomesXogos.length; i++) {
		codigoSelect += '<option>' + nomesXogos[i][0] + '</option>';
	}
	codigoSelect += '</select>';
	let codigo =
		'<fieldset>' +
		'<legend>SIMULACIÓN FIN PARTIDA</legend>' +
		'<div><label>Xogador</label><input id="xogador" type="text"/></div>' +
		'<div><label>Xogo</label>' + codigoSelect + '</div>' +
		'<div><label>Pantallas</label><input id="pantallas" type="text"/></div>' +
		'<div><label>Puntos</label><input id="puntos" type="text"/></div>' +
		'<div><button class="boton3D" type="button" onClick="gardar(xogador.value,xogo.value,pantallas.value,puntos.value);">Gardar</button></div>' +
		'<div id="mensaxe" class="erro"></div>' +
		'</fieldset>';
	document.getElementById('xogos').innerHTML = codigo;
}

function gardar(xogador, xogo, pantallas, puntos) {
	if (numeroValido(pantallas) && numeroValido(puntos)) 
	rankingXogadores.push([xogador, xogo, pantallas, puntos]);
	else numeroIncorrecto();
}

function numeroValido(numero) {
	numero = numero.trim();
	return (!isNaN(numero) && (numero % 1 == 0) && numero != '');
}

function numeroIncorrecto() {
	mensaxe.innerHTML = 'Os números deben ser naturais';
}

function imaxes() {
	activarIconas('imaxes');
	let codigo = '<fieldset><legend>XOGOS</legend>';
	for (let i = 0; i < nomesXogos.length; i++) {
		codigo += '<img class="xogo" src="./imaxes/xogos/' + nomesXogos[i][0] + '.png" onclick="xogar(\'' + nomesXogos[i][1] + '\');"/>';
	}
	codigo += '</fieldset>';
	document.getElementById('xogos').innerHTML = codigo;
}

function xogar(url) {
	window.open(url, '_blank').focus();
}

function lista() {
	activarIconas('lista');
	let codigo = '<fieldset><legend>XOGOS</legend>';
	for (let i = 0; i < nomesXogos.length; i++) {
		codigo += '<div><label>' + nomesXogos[i][0] + '</label><img class="icona" src="./imaxes/xogos/' + nomesXogos[i][0] + '.png" onclick="xogar(\'' + nomesXogos[i][1] + '\');"/></div>';
	}
	codigo += '</fieldset>';
	document.getElementById('xogos').innerHTML = codigo;
}

function usuario() {
	let codigo =
		'<div class="panel">' +
		'<div class="xanela">' +
		'<h2><span>LOGIN USUARIO</span></h2>' +
		'<label>Usuario</label>' +
		'<input id="nome" type="text"/>' +
		'<label>Contrasinal</label>' +
		'<input id="contrasinal" type="password"/>' +
		'<div>' +
		'<button class="boton3D" type="button" onClick="validar(nome.value,contrasinal.value);">Validar</button>' +
		'<button class="boton3D" type="button" onClick="cancelar();">Cancelar</button>' +
		'</div>' +
		'<label id="mensaxe" class="erro"></label>' +
		'</div>' +
		'</div>';
	login.innerHTML = codigo;
}

function usuarioRexistrado() {
	document.getElementById('usuario').src = "./imaxes/iconas/inactivo/usuario.png";
	document.getElementById('sair').src = "./imaxes/iconas/activo/sair.png";
	document.getElementById('sair').addEventListener('click', sair);
	document.getElementById('usuario').removeEventListener('click', usuario);
	login.innerHTML = '';
}

function contrasinalIncorrecto() {
	mensaxe.innerHTML = 'Login ou Contrasinal incorrecto';
}

function cancelar() {
	login.innerHTML = '';
}

function sair() {
	document.getElementById('usuario').src = "./imaxes/iconas/activo/usuario.png";
	document.getElementById('sair').src = "./imaxes/iconas/inactivo/sair.png";
	document.getElementById('sair').removeEventListener('click', sair);
	document.getElementById('usuario').addEventListener('click', usuario);
}