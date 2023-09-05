$(document).ready(function() {
	// 1. Ocultar o fieldset que emprega a clase contacto cando se cargue o documento
	$('fieldset.contacto').hide();
	
	// 2. Ocultar os campos de clase autonomia agás o primeiro
	$('.autonomia:gt(0)').hide();

	// 3. Ao clicar no botón Amosar detalles de usuario amosarase o fieldset que emprega a clase contacto
	// empregando un efecto a partir do método toggle que dure 1.2 segundos
	$('#detalles').click(function(event) {
		$('fieldset.contacto').toggle(1200);
		// 4. Cando premamos no botón Amosar detalles de usuario cambiarase o texto por Ocultar detalles de usuario
		// e viceversa e situará o cursor no campo email (cando amosemos o fieldset) ou no campo usuario (cando ocultemos o fieldset)
		if ($(this).text() == 'Ocultar detalles de usuario') {
			$('#detalles').text('Amosar detalles de usuario');
			$('#email').focus();
		} else {
			$('#detalles').text('Ocultar detalles de usuario');
			$('#usuario').focus();
		}
	});

	// 5. Cando premamos o botón de enviar comprobará que:
	//		o usuario teña 6 caracteres
	//		os contrasinais coincidan
	//		o email pase a validación proposta (por exemplo: a@a.com)
	// , asignándolle a clase correcto aos que cumpran as condicións e a clase erro aos que non as cumpran
	$('#enviar').click(function(event) {
		$('input').addClass('correcto');
		if ($('#usuario').val().length == 6) { 
			$('#usuario').removeClass('erro').addClass('correcto'); 
		} else { 
			$('#usuario').removeClass('correcto').addClass('erro'); 
		}
		if ($('#contrasinal').val() != $('#repetir').val()) {
			$('#contrasinal').removeClass('correcto').addClass('erro');
			$('#repetir').removeClass('correcto').addClass('erro');
		}
		if (validar_email($('#email').val())) {
			$('#email').removeClass('erro').addClass('correcto');
		} else {
			$('#email').removeClass('correcto').addClass('erro');
		}
	});

	// 6. Ao clicar nunha autonomía amosará cun fadeIn de 3 segundos as provincias correspondentes,
	// ocultando antes as que xa estivesen amosadas
	$('#autonomia').change(function(event) { 
		switch ($(this).val()) {
			case '1': 
				$('.autonomia:gt(0)').hide();
				$('#andalucia').parent().show().fadeIn(3000);
				break;
			case '2':
				$('.autonomia:gt(0)').hide();
				$('#galiza').parent().show().fadeIn(3000);
				break;
			default: 
				$('.autonomia:gt(0)').hide();	
				break;
		}
	});
	
	function validar_email(email) {
		var regex = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		return regex.test(email) ? true : false;
	}
});
