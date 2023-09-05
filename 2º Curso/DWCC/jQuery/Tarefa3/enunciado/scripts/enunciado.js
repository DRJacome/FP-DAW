$(document).ready(function () {
    // 1. Eliminar as aliñacións contidas no código HTML creando as necesarias 
    // nunha folla CSS mediante código jQuery.
    $("[align=center]").removeAttr("align").css("text-align", "center");
    $("[align=left]").removeAttr("align").css("text-align", "left");
    $("[align=right]").removeAttr("align").css("text-align", "right");

    // Alternativa al 1.
    $("[align]").each(function () {
        $(this).css("text-align", $(this).attr("align")).removeAttr("align");
    });

    // 2. Os parágrafos que conteñan a palabra EUREKA deberán ter cor de texto verde.
    $("p:contains('EUREKA')").css("color", "green");

    // 3. Inserir despois de cada imaxe un parágrafo centrado co seguinte texto:
    // Largura: xxx pixels, Altura: xxx pixels.
    //$("img").each(function () {
    //    $("<p style='text-align: center;'>Largura:" + $(this).width()
    //        + " pixels, Altura:" + $(this).height() + " pixels</p>").insertAfter(this);
    //});

    // Alternativa a 3.
    $("img").each(function () {
        var ancho = this.width;
        var alto = this.height;
        $("<p style='text-align: center'>Largura: " + ancho + " píxels, Altura: " + alto + " píxels</p>").insertAfter(this);
    });

    // 4. Todos os encabezados que conteñan a palabra LUTHIERS terán que ter como cor de texto o vermello.
    $(":header:contains('LUTHIERS')").css("color", "red");

    // 5. Os tres derradeiros parágrafos do documento deberán aparecer coa cor de fondo verde e aliñados á dereita.
    $("p").slice(-3).css("background-color", "green").css("text-align", "right");

    // 6. A segunda imaxe do documento terá que aparecer centrada.
    $("img:eq(1)").parent().css("text-align", "center");

    // 7. Agregar un atributo ALT a todas as imaxes que indique o seguinte:
    // "Imaxes propiedade das webs orixinais. Data actual: dd/mm/aaaa" 
    // cubrindo a data actual coa sacada do noso ordenador.
    let fecha = new Date();
    let dia = fecha.getDate();
    let mes = fecha.getMonth();
    let ano = fecha.getFullYear();

    if (dia < 10) {
        dia = "0" + fecha.getDate();
    } else {
        dia = fecha.getDate();
    }
    if (mes < 9) {
        // El 0 debe ir entre paréntesis para convertirlo en un string y que no se sume al número resultante
        // de fecha.getMonth().
        mes = "0" + (fecha.getMonth() + 1);
    } else {
        mes = fecha.getMonth() + 1;
    }

    $("img").attr("alt", "Imaxes propiedade das webs orixinais. Data actual:" + dia + "/" + mes + "/" + ano);

    // 8. Eliminar todos os parágrafos que conteñan un espazo en branco (&nbsp;).
    // NOTA: A función contains non sirve neste exemplo porque contains busca texto, non código html.
    //$("p").filter(function () {
    //    return this.innerHTML.match(/&nbsp/)
    //}).remove();

    // Alternativa a 8.
    $("p").filter(function () {
        return $(this).html() == '&nbsp;';
    }).remove();

    // 9. Modifica o contido do noveno parágrafo do documento por TEXTO MODIFICADO DENDE JQUERY.
    $("p:nth-child(7)").text("TEXTO MODIFICADO DENDE JQUERY");

    // 10. Crear unha nova liña separadora HR con id="separador" despois do parágrafo con id="final" 
    // e a continuación un novo parágrafo co seguinte texto resumo:
    // Neste documento hai xxx parágrafos, dos cales xxx están centrados e xxx están aliñados á dereita.
    // Temos xxx imaxes e temos xxx ligazóns.
    // (substituir os xxx polo número de imaxes e de ligazóns calculados con jQuery).
    $("<hr id='separador'>").insertAfter("p#final");

    let numParrafos = $("p").length;
    let numParrafosCentrados = $("p").filter(function () {
        return $(this).css("text-align") == "center";
    }).length;

    let numParrafosDerecha = $("p").filter(function () {
        return $(this).css("text-align") == "right";
    }).length;

    let numImagenes = $("img").length;
    let numEnlaces = $("a").length;

    $("<p>Neste documento hai " + numParrafos + " parágrafos, "
        + " dos cales " + numParrafosCentrados + " están centrados "
        + " e " + numParrafosDerecha + " están aliñados á dereita. "
        + "Temos " + numImagenes + " imaxes e temos "
        + numEnlaces + " ligazóns.</p>").insertAfter("#separador");

    // 11. Programar o botón de tal xeito que ao premer inserirá debaixo do obxecto con id="separador"
    // unha copia da primeira imaxe.
    $("#copiar").click(function () {
        $("img:eq(0)").clone().insertAfter("#separador");
        $('p:last').text('Neste documento hai ' + $('p').length
            + ' parágrafos, dos cales ' + $('p[style*="text-align: center"]').length
            + ' están centrados e ' + $('p[style*="text-align: right"]').length
            + ' están aliñados á dereita. Temos ' + $('img').length
            + ' imaxes e temos ' + $('a').length + ' ligazóns.');
    });
});