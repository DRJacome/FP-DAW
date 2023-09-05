$(document).ready(function () {
	// 1. Eliminar as aliñacións contidas no código HTML creando as necesarias nunha folla CSS mediante código jQuery.
	$("[align=center]").removeAttr("align").css("text-align", "center");
	$("[align=right]").removeAttr("align").css("text-align", "right");
	$("[align=left]").removeAttr("align").css("text-align", "left");

	/* ou tamén:
	$("[align]").each(function() {
		$(this).css("text-align", $(this).attr("align")).removeAttr("align");
	});*/

	// a nivel propiedade de CSS funciona como se foran equivalentes:
	//	textAlign e text-align

	// 2. Os parágrafos que conteñan a palabra EUREKA deberán ter cor de texto verde.
	$("p:contains('EUREKA')").css("color", "green");

	// 3. Inserir despois de cada imaxe un parágrafo centrado co seguinte texto:
	//    Largura: xxx pixels, Altura: xxx pixels.
	//	 (substituir os xxx polos datos reais da imaxe calculados con jQuery)
	$("img").each(function () {
		$(this).after("<p style='text-align: center;'> Largura: " + $(this).width() + " pixels, Altura: " + $(this).height() + " pixels.</p>");
	});

	// ou tamén    
	//	$("img").each(function()
	//	{
	//		var largo= this.width;
	//		var altura=this.height;

	// ou ben

	// 		var largo= $(this).width();
	// 		var altura=$(this).height();

	// 		var mensaxe="Largura: "+largo+" pixels, Altura: "+altura+ " pixels.";
	// 		$("<p>"+mensaxe+"</p>").insertAfter(this).css("text-align","center");
	// 	});	

	// Solución non válida porque colle os datos da colección enteira 
	// 	$("img").after("<p style='text-align: center;'> Largura: "+$(this).width()+" pixels, Altura: "+$(this).height()+ " pixels.</p>");

	// 4. Todos os encabezados que conteñan a palabra LUTHIERS terán que ter como cor de texto o vermello.
	$(":header:contains('LUTHIERS')").css("color", "red");

	// 5. Os tres derradeiros parágrafos do documento deberán aparecer coa cor de fondo verde e aliñados á dereita.
	// Solución obsoleta: var inicio=$("p").size()-4;
	var inicio = $("p").length - 4;
	$("p:gt(" + inicio + ")").css({ "background-color": "green", "text-align": "right" });

	// ou tamén:
	//	$("p:eq("+inicio+")").nextUntil().css({ "background-color" : "green","text-align" : "right"});	

	// ou tamén:
	// 	$("p").slice(-3).css("background","green").css("text-align","right");

	// ou tamén:
	// 	$('p:gt(-4)').css({'background-color': 'green', 'text-align': 'right'});	

	// 6. A segunda imaxe do documento terá que aparecer centrada.
	$("img:eq(1)").parent().css("text-align", "center");

	// Solución obsoleta: $("img:eq(1)").wrap("<center>");

	// ou tamén:
	// 	$('img').eq(1).css({'display': 'block', 'margin-left': 'auto', 'margin-right': 'auto'});

	// 7. Agregar un atributo ALT a todas as imaxes que indique o seguinte "Imaxes propiedade das webs orixinais. Data actual: dd/mm/aaaa" cubrindo a data actual coa sacada do noso ordenador.
	var aData = new Date();
	var dataActual = aData.toLocaleDateString();
	// Outra forma:
	//  var dataActual=aData.getDate()+"/"+parseInt((aData.getMonth())+1)+"/"+aData.getFullYear();
	$("img").attr("alt", "Imaxes propiedade das webs orixinais. Data actual: " + dataActual);

	// Máis completo, meténdolle ceros antes dos díxitos para que sempre teña dous o día e o mes
	// 	var aData = new Date();
	// 	var dia = aData.getDate() < 10 ? "0" + aData.getDate() : aData.getDate();
	// 	var mes = aData.getMonth() < 9 ? "0" + (parseInt(aData.getMonth()) + 1) : parseInt(aData.getMonth()) + 1;
	// 	var ano = aData.getFullYear();
	// 	$("img").attr("alt", "Imaxes propiedade das webs orixinais. Data actual: " + dia + "/" + mes + "/" + ano);

	// 8. Eliminar todos os parágrafos que conteñan un espazo en branco (&nbsp;) NOTA: A función contains non sirve neste exemplo porque contains busca texto, non código html.
	$('p').filter(function () { return $(this).html() == '&nbsp;'; }).remove();

	// ou tamén:
	// 	$("p").filter(function(){ return this.innerHTML.match(/&nbsp;/); }).remove();

	// ou tamén:
	// 	$("p").each(function(){
	//			if ($(this).html()=="&nbsp;") $(this).remove();
	// 	});

	// 9. Modifica o contido do noveno parágrafo do documento por TEXTO MODIFICADO DENDE JQUERY.
	$("p:eq(8)").text("TEXTO MODIFICADO DENDE JQUERY");

	// Podería tamén valer neste caso:
	// 	$("p:eq(8)").html("TEXTO MODIFICADO DENDE JQUERY");	

	// 10. Crear unha nova liña separadora HR con id="separador" despois do parágrafo con id="final" e a continuación un novo parágrafo co seguinte texto resumo:
	//     Neste documento hai xxx parágrafos, dos cales xxx están centrados e xxx están aliñados á dereita.
	//     Temos xxx imaxes e temos xxx ligazóns.
	$("<hr/>").attr("id", "separador").insertAfter('#final');

	// ou tamén:
	// 	$("<hr id='separador' />").insertAfter("p#final");

	// ou tamén:
	// 	$('p#final').after("<hr id='separador' />");

	var numParagrafos = $("p").length;
	var numParagrafosCentrados = $('p[style*="text-align: center"]').length;
	var numParagrafosDereita = $('p[style*="text-align: right"]').length;

	// ou tamén 
	//	var numParagrafosCentrados = $("p").filter(function(){ return $(this).css("text-align") == "center"; }).length;
	//	var numParagrafosDereita = $("p").filter(function(){ return $(this).css("text-align") == "right"; }).length;

	var numImaxes = $("img").length;
	var numLigazons = $("a").length;
	$("<p>Neste documento hai " + numParagrafos + " parágrafos, dos cales " + numParagrafosCentrados + " están centrados e " + numParagrafosDereita + " están aliñados á dereita.<br/>Temos " + numImaxes + " imaxes e temos " + numLigazons + " ligazóns.</p>").insertAfter("#separador");

	// 11. Programar o botón de tal xeito que ao premer inserirá debaixo do obxecto con id="separador" unha copia da primeira imaxe.
	$("#copiar").click(function () {
		$("img:eq(0)").clone().insertAfter("#separador");
		// Para actualizar o número de imaxes do documento
		$('p:last').text('Neste documento hai ' + $('p').length + ' parágrafos, dos cales ' + $('p[style*="text-align: center"]').length + ' están centrados e ' + $('p[style*="text-align: right"]').length + ' están aliñados á dereita. Temos ' + $('img').length + ' imaxes e temos ' + $('a').length + ' ligazons');
	});

	// ou tamén
	//	$('#copiar').bind('click', function() {
	//		$('#separador').after($('img:first').clone());
	//	});
});
