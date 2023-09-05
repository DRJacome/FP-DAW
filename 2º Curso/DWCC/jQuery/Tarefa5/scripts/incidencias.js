$(document).ready(function () {
    // $("#alta").parent().hide();
    $("#alta, #baixa, #modificacion").addClass("inactiva");

    // Agochar o profesor que resolve mentres non estea resolta a incidencia.
    $("#profeResolve").parent().hide();
    $("#profeResolve").parent().prev().hide().attr("id", "etiqueta");

    // Mover a posibilidade de resolución.
    $("#etiqueta").appendTo("#form1 div:eq(-2)");
    $("#profeResolve").parent().appendTo("#form1 div:eq(-2)");

    // 1. A data inicial que se amosará será por defecto a do día actual.
    dataActual();
    function dataActual() {
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
            mes = "0" + (fecha.getMonth() + 1);
        } else {
            mes = fecha.getMonth() + 1;
        }
        $("#data").val(dia + "/" + mes + "/" + ano);
    }
    // 2. A aula seleccionarase dun despregable de aulas obtido dinámicamente da táboa aulas.
    // función $.getJSON(url, parametros, retorno,tipo):
    $.getJSON("servidor/cargarAulas.php", function (datosAulas) {

        // $ de AJAX, llamada a función foreach (parámetro1=variable a trabajar, paámetro2=función que devolverá datos de la consulta).
        $.each(datosAulas, function () {
            /* Selector jQuery cogiendo las aulas, añadimos al final de cada una la siguiente e 
                incrustamos código html que a su vez incrusta las variables JS con los valores
                de los campos de la fila de aulas.*/
            $("#aula").append("<option value='" + this.codigo + "'>" + this.nome + "</option>");
        });
    });

    // 3. Tanto o profesor que comunica a incidencia como o profesor que a resolve 
    // serán obtidos dinámicamente da táboa de profesores.

    /* La consulta de datos para profes que comunican y que resuelven incidencia está parametrizada.
        La única diferencia es el selector jQuery para cada tipo de profesor, que cada uno tien su
        propia inserción de datos.*/
    $.getJSON("servidor/cargarProfesores.php", function (datosProfes) {
        $.each(datosProfes, function () {
            // Si el primer registro de la  base de datos es código 0, se ignora para que no salga un espacio vacío.
            if (this.codigo != 0) {
                $("#profeComunica").append("<option value='" + this.codigo + "'>" + this.nome + " " + this.apelidos + "</option>");
                $("#profeResolve").append("<option value='" + this.codigo + "'>" + this.nome + " " + this.apelidos + "</option>");
            }
        });
    });
    // Habilitar el desplegable con del profesor que resuelve la incidencia.
    $("#resolta_SI").click(function () {
        $("#profeResolve").parent().fadeIn(1000);
        $("#etiqueta").fadeIn(1000);
    });

    // Deshabilitar el desplegable del profesor que resuelve la incidencia.
    $("#resolta_NON").click(function () {
        $("#profeResolve").parent().fadeOut(1000);
        $("#etiqueta").fadeOut(1000);
    });
    // 4. Hai que dotar de contido aos botóns e ligazóns que existen na páxina
    // programando o evento asociado.

    // Botón Restablecer.
    $("#limpar").click(function () {
        $("#form1").trigger("reset");
        dataActual();
        $("#profeResolve").parent().hide();
        $("#etiqueta").hide();
    });

    // Botón Enviar.
    $("#enviar").click(function () {
        let mensaxe = "";
        if (formatoDataIncorrecta($("#data").val()) || nonExisteData($("#data").val())) {
            mensaxe += "No se indica un fecha correcta.\n";
        }
        if ($("#aula").val() == 0) {
            mensaxe += "No has escogido un aula.\n";
        }
        if ($("#profeComunica").val() == 0) {
            mensaxe += "No has seleccionado un profesor/a.\n";
        }
        if ($("#descricion").val() =="") {
            mensaxe += "No has rellenado la causa de la incidencia.\n";
        }
        if ($("#resolta_SI:checked").val() && $("#profeResolve").val() == 0) {
            mensaxe += "No se indica qué profesor resolvió la incidencia.\n";
        }
        if (mensaxe == "") {
            if ($("#resolta_NON:checked").val()) {
                $("#profeResolve").val("0");
            }
            $.post("servidor/altaIncidencia.php", $("#form1").serialize())
                .done(function () {
                    $(".post").fadeOut(500, function () {
                        saida = "<font color=green><strong>Os datos foron introducidos correctamente.</strong></font>";
                        $(".post").html(saida).fadeIn(2000);
                    });
                    $("#alta").css({ "color": "#0153B4", "cursor": "pointer", "pointer-events": "auto" });
                })
                .fail(function (erro) {
                    alert("Los datos no se pudieron introducir en la base de datos." + erro);
                });
        } else {
            alert(mensaxe);
        }
    });

    function formatoDataIncorrecta(data) {
        return !(data.match(/^\d{1,2}\/\d{1,2}\/\d{2,4}$/));
    }

    function nonExisteData(data) {
        var fecha = data.split("/");
        var dia = fecha[0];
        var mes = fecha[1];
        var ano = fecha[2];
        return !(mes > 0 && mes < 13 && dia > 0 && dia <= (new Date(ano, mes, 0)).getDate());
    }
});