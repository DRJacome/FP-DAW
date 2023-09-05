$(document).ready(function()
{
	//1. Ocultar o div que contén as opcións de tipo radio cando se cargue o documento
	$(":radio").parent().parent().hide();
	// outras posibilidades:
	//		$("div>div:has(:radio)").hide();
	//		$("fieldset > div > div").hide();
		
	//2. Ao clicar no checkbox deberá amosar ou ocultar o div anterior dependendo da situación na que se atope
	$("#rolo").click(function()
	//	outra posibilidade:
	//	$(":checkbox").click(function()	
	{
		if (this.checked)
		//	outra posibilidade:
		//		if ($("#rolo").attr("checked"))
		{
			$(":radio").parent().parent().show();
			// 3. Se o amosa tamén deberá situar o cursor na cela cantidade
			$("#cantidade").focus();
		}
		else
		{
			$(":radio").parent().parent().hide();
		}			
	});
	//	outra posibilidade:	
	/*
	$("#rolo").click(function() {
		$("div>div").has(":radio").toggle();
		amosarCursor();
	});

	// 3. Se o amosa tamén deberá situar o cursor na cela cantidade
	function amosarCursor() {
		if ($("div>div:has(:radio)").is(":visible")) {
			$("#cantidade").focus();
		}
	}	
	*/

	//4. Se prememos no botón Enviar Datos e o enderezo ou o telefono están baleiros amosará unha mensaxe de erro no contedor erros, empregando os efectos fadeIn e fadeOut, de 1 e 3 segundos consecutivamente, e situará o cursor no campo que conteña o erro
	$("#enviar").click(function() {
		var texto = "";
		if ($("#telefono").val()=="")
		// outra posibilidade:
		//		if ($("#telefono").val().length < 1)
		{
			texto += "<p>Debes introducir o número de teléfono</p>";
			$("#telefono").focus();				
		}
		if ($("#direccion").val()=="")
		// outra posibilidade:
		//		if ($("#direccion").val().length < 1)
		{
			texto += "<p>Debes introducir un enderezo</p>"
			$("#direccion").focus();				
		}
		if (texto != "") {		
			$("#erros").html(texto).fadeIn(1000).fadeOut(3000);
		}
	});
			
	//5. Ao premer no botón Amosar Datos, amosará no contedor pancarta todos os valores dos campos do formulario. Empregar o efecto slideToggle a velocidade normal tendo en conta que o botón deberá tamén cambiar o seu texto de Amosar Datos a Ocultar Datos e viceversa.
	$("#amosar").click(function() {
		var rolos = "";
		var enderezo = "<br/>Dirección: "+$("#direccion").val()+"<br/>Teléfono: "+$("#telefono").val();
		
		if ($("#rolo").attr("checked") == "checked") {
			tipoDeRolo = $(":radio:checked").val();
			cantidade = $("#cantidade").val();
			rolos = "Rolos vietnamitas: "+ cantidade + " de " + tipoDeRolo;
		}
		$("#pancarta").html(rolos+enderezo).slideToggle(400);
		if (($("#amosar").val())=="Amosar Datos") {	
			$("#amosar").val("Ocultar Datos");
		} else {	
			$("#amosar").val("Amosar Datos");
		}
	});
});
