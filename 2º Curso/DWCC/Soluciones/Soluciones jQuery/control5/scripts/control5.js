$(function () {
	teclas = new Array('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Ñ', 'Z', 'X', 'C', 'V', 'B', 'N', 'M');
	var filaActiva = 0;
	var verba = 'BERRO';
	const NUMEROFILAS = 6;

	// Crear o taboleiro
	const OPORTUNIDADES = 6;
	const LETRAS = 5;
	let taboleiro = "<div id='taboleiro' class='contedor'>";
	for (let i = 0; i < OPORTUNIDADES; i++) {
		taboleiro += "<div class='fila'>";
		for (let j = 0; j < LETRAS; j++) {
			taboleiro += "<div class='columna' data-fila='" + i + "' data-columna='" + j + "'></div>";
		}
		taboleiro += "</div>"
	}
	taboleiro += "</div>"
	$('header').after(taboleiro);

	// Crear o teclado
	const FILAS = 3;
	const TECLAS = 10;
	let indice = 0;
	let teclado = "<div id='teclado' class='contedor'>";
	for (let i = 0; i < FILAS; i++) {
		teclado += "<div class='fila'>";
		for (let j = 0; j < TECLAS; j++) {
			teclado += "<div class='tecla activa'><div class='texto'>" + teclas[indice] + "</div></div>";
			indice++;
			if (indice == teclas.length) {
				teclado += "<div id='comprobar'><div class_'texto'>COMPROBAR</div></div>";
				break;
			}
		}
		teclado += "</div>"
	}
	teclado += "</div>"
	$('#taboleiro').after(teclado);

	// Arrastrar as letras
	$('.activa').draggable({ helper: "clone", });

	// Soltar as letras
	$(".columna").droppable({
		accept: ".tecla",
		drop: function (event, ui) {
			console.log(filaActiva)
			if (filaActiva == $(this).data('fila')) {
				$(this).html("<div class='proba'>" + ui.draggable.text() + "</div>").css('border', '2px solid black');
			} else {
				alert('Andas un pouco apurado, non si?');
			}
		}
	});

	// Permitir premer nunha letra colocada para quitala cando un se equivoca
	$(document).on('click', 'div.columna:has(.proba)', function () {
		$(this).html('').css('border', '2px solid rgb(229 231 235)');
	});

	// Comprobar se a solución proposta é correcta
	$(document).on('click', '#comprobar', function () {
		let solucion = '';
		for (let i = 0; i < verba.length; i++) {
			let elemento = $('.columna[data-fila=' + filaActiva + '][data-columna=' + i + ']');
			solucion += elemento.text();
			// Marcar letras
			if (elemento.text() == verba[i]) { elemento.addClass('verde').css('border', '2px solid green'); }
			else if (verba.includes(elemento.text())) { elemento.addClass('amarelo').css('border', '2px solid yellow'); }
			else {
				elemento.addClass('gris').css('border', '2px solid grey');
				// Desactivar letras incorrectas no teclado
				$('.activa').each(function () {
					// hai que percorrer e comparar porque jquery entende que o 'destroy' hai que facelo sobre o mesmo selector co que foi creado o 'draggable'
					if ($(this).text() == elemento.text()) {
						$(this).draggable('destroy').removeClass('activa').addClass('inactiva');
					}
				});
			}
		}

		// Desactivar ocos xa comprobados
		$('.columna').each(function () {
			// hai que percorrer e comparar porque jquery entende que o 'destroy' hai que facelo sobre o mesmo selector co que foi creado o 'droppable'
			if ($(this).data('fila') == filaActiva) {
				$(this).droppable('destroy');
			}
		});

		// Rematar xogo
		if (verba == solucion) { alert('Obxectivo conseguido!!!') }
		else if (filaActiva == NUMEROFILAS - 1) { alert('Síntoo, non o conseguiches... xogo rematado!!!') }
		else { filaActiva++; }
	});
});