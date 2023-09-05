// 5. Cando premamos o botón de enviar comprobará que:
//		todos os campos de texto e contrasinal teñan valores
//		os contrasinais coincidan
//		o email conteña polo menos unha arroba
// , asignándolle a clase correcto aos que cumpran as condicións e a clase erro aos que non as cumpran
function comprobarDatos(usuario,contrasinal,repetir,nome,apelidos,email,home,muller,dia,mes,ano) {
	if (usuario.value != '') { 
		usuario.classList.remove('erro');
		usuario.classList.add('correcto'); 
	} else { 
		usuario.classList.remove('correcto');
		usuario.classList.add('erro'); 
	}
	if (contrasinal.value != '') { 
		contrasinal.classList.remove('erro');
		contrasinal.classList.add('correcto'); 
	} else { 
		contrasinal.classList.remove('correcto')
		contrasinal.classList.add('erro'); 
	}	
	if (repetir.value != '') { 
		repetir.classList.remove('erro');
		repetir.classList.add('correcto'); 
	} else { 
		repetir.classList.remove('correcto');
		repetir.classList.add('erro'); 
	}	
	if (nome.value != '') { 
		nome.classList.remove('erro');
		nome.classList.add('correcto'); 
	} else { 
		nome.classList.remove('correcto')
		nome.classList.add('erro'); 
	}	
	if (apelidos.value != '') { 
		apelidos.classList.remove('erro');
		apelidos.classList.add('correcto'); 
	} else { 
		apelidos.classList.remove('correcto');
		apelidos.classList.add('erro'); 
	}
	if (contrasinal.value != repetir.value) {
		contrasinal.classList.remove('correcto');
		contrasinal.classList.add('erro');
		repetir.classList.remove('correcto');
		repetir.classList.add('erro');
	}
	if (validar_email(email.value)) { 
		email.classList.remove('erro');
		email.classList.add('correcto'); 
	} else { 
		email.classList.remove('correcto');
		email.classList.add('erro'); 
	}
}

function validar_email(email) {
	var regex = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	return regex.test(email) ? true : false;
}
