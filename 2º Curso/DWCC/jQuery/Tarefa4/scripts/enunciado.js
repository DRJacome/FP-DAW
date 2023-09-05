$(document).ready(function () {
    // 1. Ocultar o div que contén as opcións de tipo radio cando se cargue o documento.
    $(":radio").parent().parent().hide();

    // 2. Ao clicar no checkbox deberá amosar ou ocultar o div anterior dependendo 
    // da situación na que se atope.
    $("#rolo").click(function () {
        if (this.checked) {
            $(":radio").parent().parent().show();
            // 3. Se o amosa tamén deberá situar o cursor na cela cantidade.
            $("#cantidade").focus();
        } else {
            $(":radio").parent().parent().hide();
        }
    });

    // 4. Se prememos no botón Enviar Datos e o enderezo ou o telefono están baleiros 
    // amosará unha mensaxe de erro no contedor erros, empregando os efectos fadeIn e fadeOut, 
    // de 1 e 3 segundos consecutivamente, e situará o cursor no campo que conteña o erro.
    $("#enviar").click(function () {
        let texto = "";
        if ($("#direccion").val() == "") {
            texto += "<p>Falta o enderezo de envío</p>";
            $("#telefono").focus();
        }
        if ($("#telefono").val() == "") {
            texto += "<p>Falta o teléfono de contacto</p>";
            $("#telefono").focus();
        }
        if (texto != "") {
            $("#erros").html(texto).fadeIn(1000).fadeOut(3000);
        }
    });

    // 5. Ao premer no botón Amosar Datos, amosará no contedor pancarta todos os valores dos campos 
    // do formulario. Empregar o efecto slideToggle a velocidade normal tendo en conta 
    // que o botón deberá tamén cambiar o seu texto de Amosar Datos a Ocultar Datos e viceversa.
    $("#amosar").click(function () {
        //    $("#pancarta").html("<p>Dirección: " + $("#direccion").val() + "<br/>Teléfono" + $("#telefono").val() + "</p>").slideToggle("normal");
        //    $("#amosar").val($("#amosar").val() == "Amosar Datos" ? "Ocultar Datos" : "Amosar Datos");
        let rolos = "";
        let enderezo = "<br>Dirección: " + $("#direccion").val() + "<br>Teléfono: " + $("#telefono").val();

        if ($("#rolo").attr("checked") == "checked") {
            tipoDeRolo = $(":radio:checked").val();
            cantidade = $("#cantidade").val();
            rolos = "Rolos vietnamitas: " + cantidade + " de " + tipoDeRolo;
        }

        $("#pancarta").html(rolos + enderezo).slideToggle(400);
        if (($("#amosar").val()) == "Amosar Datos") {
            $("#amosar").val("Ocultar Datos");
        } else {
            $("#amosar").val("Amosar Datos");
        }
    });

    // 6. Fai unha copia do ficheiro enunciado.html e chámalle enunciado2.html.
    // Empregando o plugin Validate (ver Screencast 6), facer a validación do formulario 
    // tendo en conta os criterios que ti decidas ou creas máis adecuados.
    // Se son necesarias modificacións no código HTML fai as que precises.
});