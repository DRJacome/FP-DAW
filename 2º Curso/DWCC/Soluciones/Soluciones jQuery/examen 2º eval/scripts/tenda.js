// Queremos montar unha tenda deportiva virtual visual que permita a calquera usuario mercar nela sen ter que cambiar de idioma.
$(function () {
	// Creamos dúas zonas, unha para os artigos e outra para o carriño
	let menu = '<div id="contido"><section id="esquerda"><nav id="menu"></nav><nav id="submenu"></nav><nav id="artigos"></nav></section>';
	let carro = '<section id="dereita"><div><img id="carro" class="icona" src="./imaxes/carrito.png"/></div><div id="compra"></div><div id="total"></div></section></div>';
	$('header').after(menu + carro);
	traerCarro();

	// Mediante unha serie de menús baseados en iconas escollemos o tipo de prenda... énchense collendo os datos da base de datos
	$.getJSON('servidor/cargarCategorias.php')
		.done(function (datos) {
			let menu = '';
			$.each(datos, function () {
				menu += '<img id="' + this.idCategoria + '" class="icona categoria activa" src="./imaxes/categorias/' + this.nome + '.png" data-nome="' + this.nome + '"/>';
			});
			$('#menu').html(menu);
		})
		.fail(function (erro) {
			alert('Erro ao cargar as categorías: cargarCategorias');
		});

	// Escoller unha categoría
	$(document).on('click', '.categoria', function () {
		// Cambiar todos os elementos a activos
		$('.categoria').each(function () {
			$(this).attr('src', './imaxes/categorias/' + $(this).data('nome') + '.png').addClass('activa');
		});
		// Cambiar o elemento do menú activo
		$(this).attr('src', './imaxes/categorias/inactivo/' + $(this).data('nome') + '.png').removeClass('activa');
		// Amosar os elementos da subcategoría
		var categoria = $(this).attr('id');
		$.getJSON('servidor/cargarSubcategorias.php', { categoria: categoria })
			.done(function (datos) {
				let menu = '';
				$.each(datos, function () {
					menu += '<img id="' + categoria + '" class="icona subcategoria activa" src="./imaxes/tipos/' + this.tipo + '.png" data-nome="' + this.tipo + '"/>';
				});
				$('#artigos').html('');
				$('#submenu').html(menu);
			})
			.fail(function (erro) {
				alert('Erro ao cargar as subcategorías: cargarSubcategorias');
			});
	});

	// Escoller unha subcategoría
	$(document).on('click', '.subcategoria', function () {
		// Cambiar todos os elementos a activos
		$('.subcategoria').each(function () {
			$(this).attr('src', './imaxes/tipos/' + $(this).data('nome') + '.png').addClass('activa');
		});
		// Cambiar o elemento do menú activo
		$(this).attr('src', './imaxes/tipos/inactivo/' + $(this).data('nome') + '.png').removeClass('activa');
		// Amosar os artigos en venda
		$.post('servidor/cargarArtigos.php', { categoria: $(this).attr('id'), tipo: $(this).data('nome') }, function () { }, "json")
			.done(function (datos) {
				let menu = '';
				$.each(datos, function () {
					menu += '<div><img id="' + this.idArtigo + '" class="icona artigo" src="./imaxes/artigos/' + this.idArtigo + '.png"/><div></div></div>';
				});
				$('#artigos').html(menu);
				// Facer arrastrables os artigos
				$('.artigo').draggable({ revert: true, containment: 'document' });
			})
			.fail(function (erro) {
				alert('Erro ao cargar os artigos: cargarArtigos');
			});
	});

	// Amosar datos do artigo
	$(document).on('click', 'img.artigo', function () {
		var artigo = $(this).attr('id');
		$.post('servidor/datosArtigo.php', { artigo: artigo }, function () { }, "json")
			.done(function (datos) {
				$('img.artigo + div').html('');
				$('img[id=' + artigo + '] + div').html('<p class="nome">' + datos.nome + '</p><p class="prezo">' + datos.prezo + ' €</p><p class="stock">' + datos.stock + '</p>');
			})
			.fail(function (erro) {
				alert('Erro ao cargar os artigos: datosArtigo');
			});
	});

	// Crear a zona de recepción
	$('#carro').droppable({
		accept: 'img.artigo',
		drop: function (event, ui) {
			// Gardar artigo no carro
			$.post('servidor/gardarArtigo.php', { artigo: ui.draggable.attr('id') }, function () { }, "json")
				.done(function (datos) {
					if (datos == 'OK') {
						// Actualizar as prendas do carro
						traerCarro();
					}
				})
				.fail(function () {			//Controlar posibles erros da BD
					alert("PROBLEMAS COA BASE DE DATOS: gardarArtigo");
				});
		}
	});

	function traerCarro() {
		$.getJSON('servidor/traerCarro.php')
			.done(function (datos) {
				let prendas = '';
				let total = 0;
				$.each(datos, function () {
					prendas += '<div><img class="prenda" src="./imaxes/artigos/' + this.idArtigo + '.png"/><div>' + this.cantidade + '</div><div>' + this.prezo + '</div></div>';
					total += parseFloat(this.prezo);
				});
				$('#compra').html(prendas);
				// Actualizar visualmente o total
				$('#total').html(total);
			})
			.fail(function () {			//Controlar posibles erros da BD
				alert("PROBLEMAS COA BASE DE DATOS: traerCarro");
			});
	}
});