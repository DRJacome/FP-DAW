peliculas = new Array( ["Al filo","jpg","Drama","RU","Eduard Bordukov","Svetlana Khodchenkova","Stasya Miloslavskaya","Sergey Puskepalis"],
					["El refugio","jpg","Comedia","ES","Macarena Astorga","Loles León","Leo Harlem","María Barranco"], 
					["Encanto","jpg","Animación","US","Jared Bush","Stephanie Beatriz","María Cecilia Botero","John Leguizamo"], 
					["Espíritu sagrado","jpg","Comedia","ES","Chema García Ibarra","Nacho Fernández","Llum Arques","Joanna Valverde","Rocío Ibáñez"], 
					["Fantasía","jpg","Documental","ES","Aitor Merino"], 
					["Imperdonable","jpg","Drama","GB","Nora Fingscheidt","Sandra Bullock","Viola Davis","Rob Morgan"], 
					["La Casa Gucci","jpg","Drama","US","Ridley Scott","Lady Gaga","Adam Driver","Al Pacino"], 
					["La hija","jpg","Thriller","ES","Manuel Martín Cuenca","Javier Gutiérrez","Patricia López Arnaiz","Irene Virgüez"], 
					["Lamb","jpg","Fantástico","IS","Valdimar Jóhannsson","Noomi Rapace","Hilmir Snær Guðnason", "Björn Hlynur Haraldsson"], 
					["Magaluf Ghost Town","jpg","Documental","ES","Miguel Ángel Blanca"], 
					["María Solinha","jpg","Drama","ES","Ignacio Villar","Laura Míguez","Grial Montes","Santi Prego"], 
					["Museo Hermitage. El poder del arte","jpg","Documental","IT","Michele Mally","Toni Servillo"], 
					["Ratones y zorros. Una amistad de otro mundo","jpg","Animación","CZ","Jan Bubenicek"], 
					["Resident Evil Bienvenidos a Raccoon City","jpg","Terror","US","Johannes Roberts","Kaya Scodelario","Hannah John-Kamen","Robbie Amell"] );

 MELLORAS
function estreas() {	// ERRO SINTÁCTICO: Uncaught ReferenceError: data is not defined (date por data) 
	let data = new Date();
	let dia = data.getDate();
	let mes = data.getMonth() + 1;
	let ano = data.getFullYear();
	data = (dia < 10) ? `0${dia}/${mes}/${ano}` : `${dia}/${mes}/${ano}`; 
	data = (mes < 10) ? `${dia}/0${mes}/${ano}` : `${dia}/${mes}/${ano}`; // ERRO SINTÁCTICO: Missing } in template expression (hai un paréntese en vez dunha chave)

	let codigo =  
		'<fieldset>' +
			'<legend>ESTREAS ' + data + '</legend>' +
			'<img class="cartel" src="./imaxes/carteis/Al filo.jpg" onclick="verTrailer(\'AL FILO\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/El refugio.jpg" onclick="verTrailer(\'EL REFUGIO\');"/>' + // ERRO DE EXECUCIÓN: Cando se preme nunha imaxe non amosa o tráiler da película en cuestión
			'<img class="cartel" src="./imaxes/carteis/Encanto.jpg" onclick="verTrailer(\'ENCANTO\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/Espíritu sagrado.jpg" onclick="verTrailer(\'ESPÍRITU SAGRADO\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/Fantasía.jpg" onclick="verTrailer(\'FANTASÍA\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/Imperdonable.jpg" onclick="verTrailer(\'IMPERDONABLE\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/La Casa Gucci.jpg" onclick="verTrailer(\'LA CASA GUCCI\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/La hija.jpg" onclick="verTrailer(\'LA HIJA\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/Lamb.jpg" onclick="verTrailer(\'LAMB\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/Magaluf Ghost Town.jpg" onclick="verTrailer(\'MAGALUF GHOST TOWN\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/María Solinha.jpg" onclick="verTrailer(\'MARÍA SOLINHA\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/Museo Hermitage. El poder del arte.jpg" onclick="verTrailer(\'MUSEO HERMITAGE. EL PODER DEL ARTE\');"/>' +
			'<img class="cartel" src="./imaxes/carteis/Ratones y zorros. Una amistad de otro mundo.jpg" onclick="verTrailer(\'RATONES Y ZORROS. UNA AMISTAD DE OTRO MUNDO\');"/>' +  // ERRO SINTÁCTICO: falta un + ao final da liña
			'<img class="cartel" src="./imaxes/carteis/Resident Evil Bienvenidos a Raccoon City.jpg" onclick="verTrailer(\'RESIDENT EVIL BIENVENIDOS A RACCOON CITY\');"/>' + 
		'</fieldset>';
		
	// ERRO DE EXECUCIÓN: Cando se volve premer noutra imaxe amosa máis dun vídeo
	carteleira.innerHTML = '<div id="video"></div>' + codigo; 
}
/*
function verTrailer(pelicula) { // ERRO SINTÁCTICO: verTrailer is not defined (letras cambiadas)
	let codigo =  // ERRO SINTÁCTICO: Uncaught SyntaxError: Unexpected token '+=' (sobra o +)
		'<video width="800" controls>' +
			'<source src="trailers/' + pelicula + '.mkv" type="video/mp4">' +
			'Your browser does not support HTML video.' +
		'</video>';
	//carteleira.innerHTML += codigo;	// ERRO DE EXECUCIÓN: Cando se volve premer noutra imaxe amosa máis dun vídeo
	video.innerHTML = codigo;	// ERRO DE EXECUCIÓN: Cando se volve premer noutra imaxe amosa máis dun vídeo
}
*/

function estreas() { 
	let data = new Date();
	let dia = data.getDate();
	let mes = data.getMonth() + 1;
	let ano = data.getFullYear();
	data = (dia < 10) ? `0${dia}/${mes}/${ano}` : `${dia}/${mes}/${ano}`; 
	data = (mes < 10) ? `${dia}/0${mes}/${ano}` : `${dia}/${mes}/${ano}`; 

	let codigo = '<fieldset><legend>ESTREAS ' + data + '</legend>';
	
	for (let i=0; i<peliculas.length; i++) {
		codigo += '<img class="cartel" src="./imaxes/carteis/' + peliculas[i][0] + '.' + peliculas[i][1] + '" onclick="verTrailer(\'' + peliculas[i][0].toUpperCase() + '\');"/>';
	}
	
	codigo += '</div></fieldset>';
		
	carteleira.innerHTML = '<div id="video"></div>' + codigo; 
}

function verTrailer(pelicula) { 
	let codigo =  
		'<video width="800" controls>' +
			'<source src="trailers/' + pelicula + '.mkv" type="video/mp4">' +
			'Your browser does not support HTML video.' +
		'</video>';

	let xanela =
		'<div class="panel">' +
			'<div class="xanela">' +
				'<div class="video"><span class="cerrar" onclick="pecharXanela();">×</span><h2>' + pelicula + '</h2></div>' +
				'<div class="video">' + codigo + '</div>' +
			'</div>' +
		'</div>';

	video.innerHTML = xanela;	
}

function pecharXanela() {
	video.innerHTML = '';	
}