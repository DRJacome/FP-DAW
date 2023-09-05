$(function() {
	var idioma = "galego";
	var palabra = "";
	$('footer p:first-child').text('2022 Desenvolvido por Outro');
	cambiarIdioma();
	
	// Desactiva a icona correspondente ao idioma usado
	$('figure.idioma > img').click( function() {
		idioma = $(this).attr('id');
		cambiarIdioma();
	});
	
	/******************************************************************************************
	*** cambiarIdioma 	      																***
	***	Cambia o idioma desactivando a icona correspondente									***
	*******************************************************************************************/
	function cambiarIdioma() {
		// Desactiva a icona correspondente ao idioma usado
		$('figure.idioma > img').each( function() {
			$(this).attr('src','./imaxes/bandeiras/' + $(this).attr('id') + '.png').css('cursor','pointer');
		});
		$('#' + idioma).attr('src','./imaxes/bandeiras/' + idioma + '-inactivo.png').css('cursor','default');
		// FIN Desactiva a icona correspondente ao idioma usado
		
		// Cambia os textos ao premer nalgunha das bandeiras
		$.getJSON('servidor/cargarIdioma.php',{idioma:idioma})
			.done(function(datos){
				$('#tituloInstrucion').html(datos.tituloInstrucion);
				$('#textoInstrucion').html(datos.textoInstrucion);
				cargarPalabra();
			})	
			.fail(function() {
				//Controlar posibles erros da BD
				alert("PROBLEMAS COA BASE DE DATOS: cargarIdioma");
			});	
		// FIN Cambia os textos ao premer nalgunha das bandeiras
	}
	
	/******************************************************************************************
	*** cargarPalabra 	      																***
	***	Amosar a palabra a buscar e as 6 imaxes relacionadas								***
	*******************************************************************************************/
	function cargarPalabra() {
		$.getJSON("servidor/cargarPalabra.php", {idioma:idioma} )
			.done(function(datos) {
				let imaxes = '';
				$.each(datos, function(indice, valor) {
					switch(indice){
						case 'idTraducion': palabra = valor; break;
						case 'palabra': $('#palabra').html(valor); break;
						default : imaxes += "<figure class='animal' data-codigo='" + valor + "'>" +
											"<img src='./imaxes/animais/" + valor + ".png'></figure>"; break;
					}
				});	
				$('#imaxes').html(imaxes);
				traducirPalabra();
				
				$('figure.animal').draggable({
					revert: true,
				});
				
				$("#solucion").droppable({
					accept: 'figure.animal',
					drop: function(evento,ui) {
						$('figure.animal').draggable('disable');
						$.getJSON("servidor/comprobarPalabra.php", {palabra: palabra} )
							.done(function(datos) {
								if (datos.solucion == ui.draggable.data('codigo')) {
									$('#solucion').append('<figure><img src="./imaxes/correcto.png"></figure>');
								} else {
									$('#solucion').append('<figure><img src="./imaxes/incorrecto.png"></figure>');
									setTimeout(function(){ $('#solucion figure').remove(); cargarPalabra(); },2000);
								}
							})
							.fail(function() {
								//Controlar posibles erros da BD
								alert("PROBLEMAS COA BASE DE DATOS: comprobarPalabra");
							});							
								
								
					}
				});
			})	
			.fail(function() {			
				//Controlar posibles erros da BD
				alert("PROBLEMAS COA BASE DE DATOS: cargarPalabra");
			});
	}			
	
	
	/******************************************************************************************
	*** traducirPalabra    																	***
	***	Traducir a palabra a buscar															***
	*******************************************************************************************/
	function traducirPalabra() {
		$.getJSON("servidor/traducirPalabra.php", {idioma: idioma, palabra: palabra} )
			.done(function(datos){
				$('#palabra').text(datos.palabra);
			})
			.fail(function() {			//Controlar posibles erros da BD
				alert("PROBLEMAS COA BASE DE DATOS: traducirPalabra");
			})
	}	
});
