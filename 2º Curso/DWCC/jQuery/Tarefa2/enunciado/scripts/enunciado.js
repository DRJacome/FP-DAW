$(document).ready(function () {
    //1. Os parágrafos pares do documento deben aparecer centrados.
    $("p:odd").addClass("centrado");
    //2. O primeiro parágrafo do documento debe ter borde e o seu contido será de cor azul escuro.
    $("p:first").addClass("borde");
    //3. Todas as ligazóns que estean dentro dunha lista aparecerán con cor de fondo verde.
    $("li a").addClass("fondoVerde");
    //4a. A táboa con identificador linguaxes terá que estar centrada,...
    $("#linguaxes").addClass("taboaCentrada");
    //4b. ...a súa primeira fila deberá ter unha cor de fondo amarela e...
    $("#linguaxes tr:first").addClass("fondoAmarelo");
    //4c. ...a derradeira fila da táboa unha cor de fondo azul.
    $("#linguaxes tr:last").addClass("fondoAzul");
    //5. A terceira columna da táboa con identificador linguaxes terá o texto centrado.
    $("#linguaxes td:nth-child(3)").addClass("centrado");
    // 6. Engadir ao derradeiro parágrafo do documento o seguinte texto: "Este é o derradeiro parágrafo".
    $("p:last").html($("p:last").html() + " Este é o derradeiro parágrafo");
    //7. Inserir antes do terceiro parágrafo do documento: "<p>....Texto xerado dende jQuery....</p>"
    $("<p>....Texto xerado dende jQuery....</p>").insertBefore($("p:eq(2)"));
});