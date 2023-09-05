$(function() {
	// Desactivar alta
	//$('#alta').parent().hide();
	$('#alta, #baixa, #modificacion').css({'color':'grey','cursor':'default','pointer-events':'none'});
	
	// Agochar o profesor que resolve mentres non estea resolta a incidencia
	$('#profeResolve').parent().hide();
	$('#profeResolve').parent().prev().hide().attr('id','etiqueta');
	
	// Mover de sitio a posibilidade de resolución
	$('#etiqueta').appendTo('#form1 div:eq(-2)');
	$('#profeResolve').parent().appendTo('#form1 div:eq(-2)');
	
	// A data inicial que se amosará será por defecto a do día de hoxe.
	dataActual();
	function dataActual() {
		var actual = new Date();
		var dia = actual.getDate() < 10 ? "0" + actual.getDate() : actual.getDate();
		var mes = actual.getMonth() <= 10 ? "0" + (actual.getMonth() + 1) : (actual.getMonth() + 1);
		var ano = actual.getFullYear();
		$("#data").val(dia + '/' + mes + "/" + ano);
	}
	
	// A aula seleccionarase dun despregable de aulas obtido dinamicamente da táboa aulas.
	$.getJSON('servidor/cargarAulas.php', function (datos) {
		$.each(datos, function() {
			$('#aula').append('<option value="' + this.codigo + '">' + this.nome + '</option>');
		});	
	});	
	
	// Tanto o profesor que comunica a incidencia como o profesor que a resolve serán obtidos dinamicamente da táboa de profesores.
	$.getJSON('servidor/cargarProfesores.php', function (datos) {
		$.each(datos, function() {
			if (this.codigo != 0) {
				$('#profeComunica').append('<option value="' + this.codigo + '">' + this.nome + ' ' + this.apelidos + '</option>');
				$('#profeResolve').append('<option value="' + this.codigo + '">' + this.nome + ' ' + this.apelidos + '</option>');
			}
		});	
	});	

	// Habilitar o despregable do profesor que resolve a incidencia
	$('#resolta_SI').click(function() {
		$('#profeResolve').parent().fadeIn(1000);
		$('#etiqueta').fadeIn(1000);
	});	

	// Deshabilitar o despregable do profesor que resolve a incidencia
	$('#resolta_NON').click(function() {
		$('#profeResolve').parent().fadeOut(1000);
		$('#etiqueta').fadeOut(1000);
	});	
	
	// Hai que dotar de contido aos botóns e ligazóns que existen na páxina programando o evento asociado
	$('#limpar').click(function() {
		$('#form1').trigger('reset');
		dataActual();
		$('#profeResolve').parent().hide();
		$('#etiqueta').hide();
	});
	
	$('#enviar').click(function() {
		let mensaxe = '';
		if (formatoDataIncorrecta($('#data').val()) || nonExisteData($('#data').val())) { mensaxe += 'Non se indica unha data correcta\n'; }
		if ($('#aula').val() == 0) { mensaxe += 'Non se indica a aula\n'; }
		if ($('#profeComunica').val() == 0) { mensaxe += 'Non se indica que profesor comunica a incidencia\n'; }
		if ($('#descricion').val() == '') { mensaxe += 'Non se describe a incidencia\n'; }
		if ($('#resolta_SI:checked').val() && $('#profeResolve').val() == 0) { mensaxe += 'Non se indica que profesor resolve a incidencia\n'; }
		if (mensaxe == '') {
			if ($('#resolta_NON:checked').val()) $('#profeResolve').val('0');
			$.post('servidor/altaIncidencia.php', $('#form1').serialize())
				.done(function() {
					//alert('Os datos foron correctamente introducidos');
					$(".post").fadeOut(500, function() {  
						// Cando remata o FadeOut, cambiamos o contido do div con clase post e facemos un fadeIn.
						saida = "<font color=green><strong>Os datos foron inseridos correctamente...</strong></font>";
						$(".post").html(saida).fadeIn(2000);
						//$('#alta').parent().show();
						$('#alta').css({'color':'#0153B4','cursor':'pointer','pointer-events':'auto'});
					});
				})
				.fail(function(erro) {
					alert('Os datos non se puideron introducir na base de datos: ' + erro);
				});
				
			
		} else {	
			alert(mensaxe);
		}	
	});

	
	function formatoDataIncorrecta(data) {
		return !(data.match(/^\d{2}\/\d{2}\/\d{4}$/));
	}
	
	function nonExisteData(data){
		let anacos = data.split("/");
		let dia = anacos[0];
		let mes = anacos[1];
		let ano = anacos[2];
        return !(mes > 0 && mes < 13 && dia > 0 && dia <= (new Date(ano, mes, 0)).getDate());
	}
	
});	







