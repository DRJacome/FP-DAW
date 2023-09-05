$(function () {
	var offset = 0;
	var limite = 3;
	var opcionActiva = '';
	var titulo = '';

	// Cargar opcións do menú
	$.getJSON('servidor/cargarOpcionsMenu.php')
		.done(function (datos) {
			var claseActiva = '';
			var opcionsMenu = "<ul class='menu'>";
			$.each(datos, function () {
				if (this.activa == '1') {
					claseActiva = 'activa';
					opcionActiva = this.orde;
					titulo = this.nome;
				} else {
					claseActiva = '';
				}
				opcionsMenu += "<li class='" + claseActiva + "' data-opcion='" + this.orde + "'>" + this.nome + "</li>";
			});
			opcionsMenu += "</ul>";
			$('#menu').html(opcionsMenu);
			cargarContido(opcionActiva, titulo);
		})
		.fail(function (erro) {
			alert('Erro ao cargar as opcións do menú\n' + erro);
		});

	// Cargar o contido da opción
	function cargarContido(opcionActiva, titulo) {
		var contido = "<h2>" + titulo + "</h2>";
		switch (opcionActiva) {
			case '1':
				contido +=
					"<div id='saudo'>Benvidos á páxina web do Club Balonmán Lalín</div>" +
					"<img src='imaxes/portada.png'>";
				$('#bloque').html(contido);
				break;
			case '2':
				$.getJSON('servidor/cargarNovas.php', { offset: offset, limite: limite })
					.done(function (datos) {
						contido += "<div id='contido'>";
						$.each(datos, function () {
							contido +=
								"<div class='entrada'>" +
								"<h3>" + this.titulo + "</h3>" +
								"<div class='metadatos'><span class='data'>" + this.data + "</span></div>" +
								"<div class='contidoEntrada'>" + this.texto + "</div>" +
								"</div>" +
								"<div class='lateral'><img class='imaxeLateral' src='imaxes/" + this.idNova + ".jpg'></div>";
						});
						// Botóns para avanzar e retroceder
						contido +=
							"<div class='centrada'>" +
							"<img id='retroceder' src='imaxes/retroceder.png' width='64' title='retroceder'>" +
							"<img id='avanzar' src='imaxes/avanzar.png' width='64' title='avanzar'>" +
							"</div>";
						contido += "</div>";
						$('#bloque').html(contido);
						// Ocultar e amosar os botóns
						if (offset <= 0) {
							$('#retroceder').hide();
							offset = 0;
						}
						// Buscar o máximo para saber se nos pasamos
						$.getJSON('servidor/numeroNovas.php')
							.done(function (datos) {
								if (offset + 3 >= datos.numeroNovas) { $('#avanzar').hide(); }
							})
							.fail(function (erro) {
								alert('Erro ao obter o número de Novas\n' + erro);
							});
					})
					.fail(function (erro) {
						alert('Erro ao cargar as novas\n' + erro);
					});
				break;
			case '3':
				contido +=
					"<div id='saudo'>Páxina en construción</div>" +
					"<img src='imaxes/enconstrucion.jpg'>";
				$('#bloque').html(contido);
				break;
			case '4':
				contido +=
					"<div id='saudo'>Páxina en construción</div>" +
					"<img src='imaxes/enconstrucion.jpg'>";
				$('#bloque').html(contido);
				break;
			case '5':
				contido +=
					"<div id='saudo'>Páxina en construción</div>" +
					"<img src='imaxes/enconstrucion.jpg'>";
				$('#bloque').html(contido);
				break;
			case '6':
				contido +=
					"<div id='saudo'>Páxina en construción</div>" +
					"<img src='imaxes/enconstrucion.jpg'>";
				$('#bloque').html(contido);
				break;
			default:
				contido +=
					"<div id='saudo'>Páxina en construción</div>" +
					"<img src='imaxes/enconstrucion.jpg'>";
				$('#bloque').html(contido);
		}

	}

	// Dotar de funcionalidade os elementos do menú
	$(document).on('click', 'li', function () {
		opcionActiva = $(this).attr('data-opcion');
		titulo = $(this).text();
		cargarContido(opcionActiva, titulo);
		// Cambiar o elemento do menú activo
		$('li').removeClass('activa');
		$(this).addClass('activa');
	});

	// Dotar de funcionalidade os botóns de avanzar e retroceder
	$(document).on('click', '#retroceder', function () {
		$('#avanzar').show();
		offset -= limite;
		cargarContido(opcionActiva, titulo);
	});

	$(document).on('click', '#avanzar', function () {
		$('#retroceder').show();
		offset += limite;
		cargarContido(opcionActiva, titulo);
	});
});