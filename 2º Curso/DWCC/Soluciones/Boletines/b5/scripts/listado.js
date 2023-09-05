$(function() {
	$('#listado').css({'color':'grey','cursor':'default','pointer-events':'none'});
	$('#taboaIncidencias').text('Cargando datos...');
	$('#baixa').parent().remove();
	$('#modificacion').parent().remove();
	actualizarTaboa();

	function actualizarTaboa() {
		$.getJSON('servidor/listado.php')
			.done(function(datos) {
				let taboa = "<table id='resultados'>";
				taboa += "<tr><th>Data</th><th>Aula</th><th>Comunicou</th><th>Resolveu</th><th>Descrición</th><th>Resolta</th><th></th><th></th></tr>";

				$.each(datos, function() {
					taboa += "<tr data-codigo='" + this.codigo + "'>";
					taboa += "<td>" + this.data + "</td>";
					taboa += "<td>" + this.nome + "</td>";
					taboa += "<td>" + this.comunica + "</td>";
					taboa += "<td>" + this.resolve + "</td>";
					taboa += "<td>" + this.descricion + "</td>";
					taboa += "<td>" + this.resolta + "</td>";
					taboa += "<td><img src='./imaxes/eliminar.png'/></td>";
					taboa += "<td><img src='./imaxes/modificar.png'/></td>";
					taboa += "</tr>";				
				});

				taboa += "</table>";
				$('#taboaIncidencias').html(taboa);
				
				$('th').addClass('coresTitulo');
				$('#resultados td > img').css('width','2vw');
				$('th, td').css({'padding':'10px'}).addClass('centrado');
				$('#resultados tr')
					.hover( function() {
						$(this).addClass('seleccionada');
					}, function() {
						$(this).removeClass('seleccionada');
					})
			});
	}

	$(document).on('click','img[src*=eliminar]',function() {
		let codigo = $(this).parent().parent().attr('data-codigo');
		$.post('servidor/eliminarIncidencia.php', {codigo:codigo});
		actualizarTaboa();
	});
	
	$(document).on('click','img[src*=modificar]',function() {
		let codigo = $(this).parent().parent().attr('data-codigo');
		let rexistro = $('tr[data-codigo=' + codigo + ']');
		
		//seleccionar o contido dos campos de cada td
		let resoltaOrixinal = rexistro.children('td:eq(5)').text();
		
		//xerar input con ese contido
		rexistro.children('td:eq(0)').html("<input id='data' name='data' type='date' size='10' maxlength='10' value='" + rexistro.children('td:eq(0)').text() + "'/>")

		// A aula seleccionarase dun despregable de aulas obtido dinamicamente da táboa aulas.
		$.getJSON('servidor/cargarAulas.php', function (datos) {
			let selector = "<select name='aula' id='aula'>";
			$.each(datos, function() {
				let seleccionada = (rexistro.children('td:eq(1)').text() == this.nome) ? ' selected ' : '';
				selector += '<option value="' + this.codigo + '"' + seleccionada + '">' + this.nome + '</option>';
			});
			selector += '</select>';
			rexistro.children('td:eq(1)').html(selector);
		});
	
		// Tanto o profesor que comunica a incidencia como o profesor que a resolve serán obtidos dinamicamente da táboa de profesores.
		$.getJSON('servidor/cargarProfesores.php', function (datos) {
			let selectorComunica = "<select name='comunica' id='comunica'>";
			let selectorResolve = "<select name='resolve' id='resolve'>";
			$.each(datos, function() {
				if (this.codigo != 0) {
					seleccionadaComunica = (rexistro.children('td:eq(2)').text() == this.alcume) ? ' selected ' : '';
					selectorComunica += "<option value='" + this.codigo + "'" + seleccionadaComunica + ">" + this.nome + " " + this.apelidos + "</option>";
				}
				seleccionadaResolve = (rexistro.children('td:eq(3)').text() == this.alcume) ? ' selected ' : '';
				selectorResolve += "<option value='" + this.codigo + "'" + seleccionadaResolve + ">" + this.nome + " " + this.apelidos + "</option>";
			});	
			selectorComunica += "</select>";
			selectorResolve += "</select>";
			rexistro.children('td:eq(2)').html(selectorComunica);	
			rexistro.children('td:eq(3)').html(selectorResolve);
		});			
		
		rexistro.children('td:eq(4)').html("<textarea name='descricion' id='descricion' cols='20' rows='1'>" + rexistro.children('td:eq(4)').text() + "</textarea>");
		
		// Xerar un botón de enviar		
		rexistro.children('td:eq(7)').after("<td><img id='gardar' src='./imaxes/gardar.png'/></td>");
		$('#gardar')
			.css({'width':'2vw'})
			.click( function() { 
				if ($('#resolve').val() != 0) resolta = 'S';
				else resolta = 'N';
				$.post('servidor/modificarIncidencia.php',
						{ codigo:$('tr.seleccionada').data('codigo'), data:$('#data').val(), aula:$('#aula').val(), profeComunica:$('#comunica').val(),
						profeResolve:$('#resolve').val(), descricion:$('#descricion').val(), resolta:resolta})
					.done(function() { actualizarTaboa(); })
					.fail(function(erro) { alert('A modificación non puido ser realizada. Erro na base de datos:\n'+erro); })
					.always(function() { });
				});	

		// Xerar un botón para cancelar a modificación				
		rexistro.children('td:eq(8)').after("<td><img id='cancelar' src='./imaxes/cancelar.png'/></td>");		
		$('#cancelar')
			.css({'width':'2vw'})
			.click( function() { 
				actualizarTaboa();
			});
	});
});	







