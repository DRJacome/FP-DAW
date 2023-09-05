function xogos() {
    nomesXogos.sort();
    let codigo = 
        '<img id="ranking" class="icona" src="./imaxes/iconas/activo/ranking.png" onclick="ranking('+ORDENACION_INICIAL+')">' + 
        '<img id="datos" class="icona" src="./imaxes/iconas/activo/datos.png" onclick="simular()">' +
        '<img id="imaxes" class="icona" src="./imaxes/iconas/activo/imaxes.png" onclick="imaxes()">' +
        '<img id="lista" class="icona" src="./imaxes/iconas/activo/lista.png">' + 
        '<img id="usuario" class="icona" src="./imaxes/iconas/activo/usuario.png">' + 
        '<img id="sair" class="icona" src="./imaxes/iconas/inactivo/sair.png">';
    menu.innerHTML = codigo;
}

function ranking(campo) {
    activarIconas('ranking');
    ordenarVector(rankingXogadores, campo);
    var ranking = 
        '<fieldset><legend>Ranking</legend>' +
        '<table>' + 
        '<tr>' + 
            '<th onclick="ranking(0)">Xogador</th>' +
            '<th onclick="ranking(1)">Xogo</th>' +
            '<th onclick="ranking(2)">Pantallas</th>' +
            '<th onclick="ranking(3)">Puntos</th>' +
        '</tr>';
        for (let i = 0; i < rankingXogadores.length; i++) {
    ranking += 
            '<tr>' +
            '<td>' + rankingXogadores[i][0] + '</td>' +
            '<td>' + rankingXogadores[i][1] + '</td>' +
            '<td>' + rankingXogadores[i][2] + '</td>' +
            '<td>' + rankingXogadores[i][3] + '</td>' +
            '</tr>';
        }
    ranking +=
        '</table>'+
        '</fieldset>';
    document.getElementById("xogos").innerHTML = ranking;   
}

function activarIconas(icona) {
    document.getElementById('ranking').src="./imaxes/iconas/activo/ranking.png";
    document.getElementById('datos').src="./imaxes/iconas/activo/datos.png";
    document.getElementById('imaxes').src="./imaxes/iconas/activo/imaxes.png";
    document.getElementById('lista').src="./imaxes/iconas/activo/lista.png";
    document.getElementById(icona).src="./imaxes/iconas/inactivo/" + icona + ".png";
}	

function simular() {
    activarIconas('datos');
    var datos = 
    '<fieldset><legend>Simulación fin partida</legend>' +
    '<table>' + 
        '<tr>' + 
            '<td><label for="xogador">Xogador: </label></td>' +
            '<td><label for="xogo">Xogo: </label></td>' +
            '<td><label for="pantallas">Pantallas: </label></td>' +
            '<td><label for="puntos">Puntos: </label></td>' +
        '</tr>' + 
        '<tr>' + 
            '<td><input type"text" id="xogador" name="xogador">' +
            '<td><input type"text" id="xogo" name="xogo">' +
            '<td><input type"text" id="pantallas" name="pantallas">' +
            '<td><input type"text" id="puntos" name="puntos">' +
        '</tr>' + 
    '</table>' + 
    '<button type="button" class="boton3D" onclick="gardar(xogador.value, xogo.value, pantallas.value,puntos.value)">Gardar</button>' + 
    '</fieldset>';
    document.getElementById("xogos").innerHTML = datos;
}

function gardar(xogador,xogo,pantallas,puntos) {
    if (numeroValido(pantallas) && numeroValido(puntos)) {
        rankingXogadores.push([xogador,xogo.pantallas,puntos]);
    } else {
        numeroIncorrecto();
    }
}

function numeroValido(numero) {
    numero = numero.trim();
    return (!isNaN(numero) && (numero % 1 == 0) && numero != "");
}	

function numeroIncorrecto() {
    mensaxe.innerHTML = "Dato incorrecto. Los números deben ser naturales.";
}

function imaxes() {
    activarIconas('imaxes');
    let codigo = '<fieldset><legend>Xogos</legend>';
        for (let i = 0; i < nomesXogos.length; i++) {
            codigo += '<img class="xogo" src="./imaxes/xogos/' + nomesXogos[i][0] + '.png" onclick="xogar(\'' + nomesXogos[i][1] + '\')">';        
        }
    codigo += '</fieldset>';
    document.getElementById('xogos').innerHTML = codigo;
}

function xogar(url) {
    window.open(url, "_blank").focus();
}

function lista() {
}

function usuario() {
}

function usuarioRexistrado() {
}

function contrasinalIncorrecto() {
}

function cancelar() {
}

function sair() {
}