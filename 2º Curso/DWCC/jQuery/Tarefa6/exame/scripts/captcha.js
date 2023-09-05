$(document).ready(function () {
	var idioma = "galego";
	var palabra = "";
	/**2. Cambia o nome do autor polo teu na páxina */
	$("footer p:first").text("2022 Desenvolvido por David Rodríguez");
	/** Cargo el texto al inicio de la página */
	cambiarIdioma();

	/******************************************************************************************
	*** cambiarIdioma 	      																***
	***	Cambia o idioma desactivando a icona correspondente									***
	*******************************************************************************************/
	/** 4. Cambia os textos ao premer nalgunha das bandeiras */
	function cambiarIdioma() {
		/** 3. Desactiva a icona correspondente ao idioma usado. */
		$("figure.idioma > img").click(function () {
			// Necesitamos saber qué a qué idioma se refiere.
			// Usamos la variable idioma ya creada con la que trabajar 
			// con cada idioma a partir de su id.
			idioma = $(this).attr("id");
			// Recorro todos los iconos de idiomas.
			$("figure.idioma > img").each(function () {
				// (Parametrizado) Activo todos los idiomas.
				// $(this de JS).attr("atributo src", "ruta del archivo de imagen").
				$(this).attr("src", "./imaxes/bandeiras/" + $(this).attr("id") + ".png").css("cursor", "pointer");
			});
			// Después del bucle desactivo el icono pulsado.
			$("#" + idioma).attr("src", "./imaxes/bandeiras/" + idioma + "-inactivo.png").css("cursor", "default");
			// Después de desactivar, llamo a la función que cambia de idioma los textos.
			cambiarIdioma();
		});

		// Invocar al archivo php, pedir el dato correspondiente en PHP, usamos .done()
		// para cargar los títulos y .fail(error) para controlar los errores a la base de datos.
		$.getJSON("servidor/cargarIdioma.php", { idioma: idioma })
			.done(function (datos) {
				// Textos que cambian de idioma.
				$("#tituloInstrucion").html(datos.tituloInstrucion);
				$("#textoInstrucion").html(datos.textoInstrucion);
				cargarPalabra();

			}).fail(function (error) {
				alert("Error en la lectura de la base de datos cargarIdioma." + error);
			});
	}


	/******************************************************************************************
	*** cargarPalabra 	      																***
	***	Amosar a palabra a buscar e as 6 imaxes relacionadas								***
	*******************************************************************************************/
	/** 5. Carga a palabra a buscar */
	function cargarPalabra() {
		// Invocar al archivo php, pedir el dato correspondiente en PHP.
		$.getJSON("servidor/cargarPalabra.php", { idioma: idioma })
			// Usamos la función .done() con un array llamado datos.
			.done(function (datos) {
				let imagenes = "";
				// Usamos un foreach de jQuery para recorrer la palabra y el valor que corresponde
				// de la base de datos.
				$.each(datos, function (indice, valor) {
					switch (indice) {
						case "idTraducion": palabra = valor;
							break;
						case "palabra": $("#palabra").text(valor);
							break;
						default: imagenes += "<figure class='animal' data-codigo='" + valor + "'>" +
							"<img src='imaxes/animais/" + valor + ".png'></figure>";
							break;
					}
				});
				$("#imaxes").html(imagenes);
				traducirPalabra();

				$("figure.animal").draggable({
					// Revert: true se usa para que el objeto vuelva a su estado inicial.
					revert: true,
					// Helper se usa para mantener las propiedades del objeto original.
					//helper: "clone",
				});

				$("#solucion").droppable({
					accept: "figure.animal",
					// function (event = se usa para controlar errores, ui = es el elemento arrastrado)
					drop: function (event, ui) {
						// Las imágenes están desactivadas por defecto.
						$("figure.animal").draggable("disable");
						$.getJSON("servidor/comprobarPalabra.php", { palabra: palabra })
							.done(function (datos) {
								if (datos.solucion == ui.draggable.data("codigo")) {
									$("#solucion").append("<figure><img src='imaxes/correcto.png'></figure>");
								} else {
									$("#solucion").append("<figure><img src='imaxes/incorrecto.png'></figure>");
									// Añado un retardo para el caso de que no se acierte con la imagen para que vuelva a cargar.
									setTimeout(function () { $("#solucion figure").remove(); cargarPalabra(); }, 2000);
								}
							})
							.fail(function (error) {
								alert("Error en la lectura de la base de datos comprobarPalabra. " + error);
							});
					}
				});
			}).fail(function (error) {
				alert("Error en la lectura de la base de datos cambiarIdioma. " + error);
			});
	}

	/******************************************************************************************
	*** traducirPalabra    																	***
	***	Traducir a palabra a buscar															***
	*******************************************************************************************/
	function traducirPalabra() {
		$.getJSON("servidor/traducirPalabra.php", { idioma: idioma, palabra: palabra })
			.done(function (datos) {
				$("#palabra").text(datos.palabra);
			}).fail(function (error) {
				alert("Error con la base de datos traducirPalabra. " + error);
			})
	}
});