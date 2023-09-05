$(function () {
	var offset = 0;
	var limite = 3;
	var opcionActiva = '';
	var titulo = '';

	// Cargar opcións do menú

	$.getJSON('servidor/cargarOpcionsMenu.php')
		.done(function (datosOpciones) {
			var menu = "<ul class='menu'>";
			$.each(datosOpciones, function () {
				if (this.activa == "1") {
					claseActiva = "activa";
					opcionActiva = this.orde;
					titulo = this.nome;
				} else {
					claseActiva = "";
				}
				menu += "<li class='" + claseActiva + "' data-opcion='" + this.orde + "'>" + this.nome + "</li>";
			});
			$("#menu").html(menu);

		})

		.fail(function (error) {
			alert("Error al cargar la base de datos cargarOpcionsMenu" + error);
		});


	// Cargar o contido da opción
	function cargarContido(opcionActiva, titulo) {
		var contido = "<h2>" + titulo + "</h2>";
		switch (opcionActiva) {
			case '1':
				contido += "<div id='saudo'>Benvidos á páxina web do Club Balonmán Lalín</div>"
					+ "<img src='imaxes/portada.png'>";
				break;

			default:
				break;
		}
	}

	// Dotar de funcionalidade os elementos do menú


	// Dotar de funcionalidade os botóns de avanzar e retroceder

});