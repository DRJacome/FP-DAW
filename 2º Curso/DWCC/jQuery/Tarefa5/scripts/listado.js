$(document).ready(function () {
    // Facer unha páxina web para listar, modificar e eliminar 
    // as incidencias empregando Ajax (páxina listado.html) tendo en conta que:
    $("#listado").addClass("inactiva");
    $("#taboaIncidencias").text("Cargando datos...");
    $("#baixa").parent().remove();
    $("#modificacion").parent().remove();
    actualizarTabla();
    // 1. Hai que dotar de contido aos botóns e ligazóns que existen na páxina 
    //    programando o evento asociado.
    function actualizarTabla() {
        $.getJSON("servidor/listado.php")
            .done(function (datos) {
                // Construcción de tabla donde se visualizarán los registros.
                let taboa = "<table id='resultados'>";
                // Cabeceras de tabla de registros.
                taboa += "<tr>"
                    + "<th>Data</th>"
                    + "<th>Aula</th>"
                    + "<th>Comunicou</th>"
                    + "<th>Resolveu</th>"
                    + "<th>Descrición</th>"
                    + "<th>Resolta</th>"
                    + "<th>Eliminar registro</th>"
                    + "<th>Modificar registro</th>";
                $.each(datos, function () {
                    //Campos de la tabla de registros.
                    // Para incluir un atributo propio, se usa data-nombreDelCampo.
                    taboa += "<tr data-codigo='" + this.codigo + "'>";
                    taboa += "<td>" + this.data + "</td>";
                    taboa += "<td>" + this.nome + "</td>";
                    taboa += "<td>" + this.comunica + "</td>";
                    taboa += "<td>" + this.resolve + "</td>";
                    taboa += "<td>" + this.descricion + "</td>";
                    taboa += "<td>" + this.resolta + "</td>";
                    taboa += "<td><img src='./imaxes/eliminar.png'></td>";
                    taboa += "<td><img src='./imaxes/modificar.png'></td>";
                    taboa += "</tr>";
                });
                taboa += "</table>";

                // Estética para la selección de un registro.
                $("#taboaIncidencias").html(taboa);

                $("th").addClass("coresTitulo");
                $("#resultados td > img").css({ "width": "2vw" });
                $("th,td").css("padding", "10px").addClass("centrado");
                $("#resultados tr")
                    .hover(function () {
                        $(this).addClass("seleccionada");
                    }, function () {
                        $(this).removeClass("seleccionada");
                    });
            });
    }

    // Darle funcionalidad al icono de la papelera para borrar incidencias.
    $(document).on("click", "img [src*=eliminar]", function () {
        let codigo = $(this).parent().parent().attr("data-codigo");
        $.post("servidor/eliminarIncidencia.php", { codigo: codigo });
        actualizarTabla();
    });

    $(document).on("click", "img [src*=modificar]", function () {
        let codigo = $(this).parent().parent().attr("data-codigo");
        let registro = $("tr[data-codigo='" + codigo + "']");

        // Seleccionar el contenido de los campos de cada td.
        let aulaOriginal = registro.children("td:eq(5)").text();

        // Generar input con ese contenido.
        registro.children("td:eq(0)").html("<input id='data' name='data' type='date' size='10' maxlength='10' value='" + registro.children("td:eq(0)").text() + "'/>");

        // A aula seleccionarase dun despregable de aulas obtido dinámicamente de táboa aulas.
        $.getJSON("servidor/cargarAulas.php", function (datos) {
            let selector = "<select name='aula' id='aula'>";
            $.each(datos, function () {
                let seleccionada = (aulaOriginal == this.nome) ? "selected" : "";
                selector += "<option value='" + this.codigo + "'" + seleccionada + ">" + this.nome + "</option>";
            });
            selector += "</select>";
            registro.children("td:eq(1)").html(selector);
        });

        // 2. Debemos poder seleccionar un rexistro premendo no listado.
        // Tanto o profesor que comunica a incidencia como o profesor que a resolve serán obtidos dinamicamente da táboa de profesores.
        $.post("servidor/modificarIncidencia.php", function (datos) {
            let selectorComunica = "<select name='comunica' id='comunica'>";
            let selectorResolve = "<select name='resolve' id='resolve'>";
            $.each(datos, function () {
                if (this.codigo != 0) {
                    seleccionadaComunica = (registro.children("td:eq(2)").text() == this.alcume) ? "selected" : "";
                    selectorComunica += "<option value='" + this.codigo + "'" + seleccionadaComunica + ">" + this.nome + " " + this.apelidos + "</option>";
                }
                seleccionadaResolve = (registro.children("td:eq(3)").text() == this.alcume) ? "selected" : "";
                selectorResolve += "<option value='" + this.codigo + "'" + seleccionadaResolve + ">" + this.nome + " " + this.apelidos + "</option>";
            });
            selectorComunica += "</select>";
            selectorResolve += "</select>";
            registro.children("td:eq(2)").html(selectorComunica);
            registro.children("td:eq(3)").html(selectorResolve);
        });

        registro.children("td:eq(4)").html("<textarea name='descricion' id='descricion cols='20 rows='1'>" + registro.children("td:eq(4)").text() + "</textarea>");

        // Generar un botón de enviar.
        registro.children("td:eq(7)").after("<td><img id='gardar' src='./imaxes/gardar.png'/></td>");
        $("#gardar").css({ "width": "2vw" }).click(function () {
            if ($("#resolve").val() != 0) {
                resolta = "S";
            } else {
                resolta = "N";
            }
            $.post("servidor/modificarIncidencia.php", {
                codigo: $("tr.seleccionada").data("codigo"),
                data: $("#data").val(),
                aula: $("#aula").val(),
                profeComunica: $("#comunica").val(),
                profeResolve: $("#resolve").val(),
                descricion: $("#descricion").val(),
                resolta: resolta
            })
                .done(function () {
                    actualizarTabla();
                })
                .fail(function (error) {
                    alert("La modificación no se pudo realizar. Hubo un error en la base de datos.\n" + error);
                })
            always(function () {
            });
        });

        // Generar un botón paa cancelar la modificación.
        registro.children("td:eq(8)").after("<td><img id='cancelar' src='./imaxes/cancelar.png'/></td>");
        $("#cancelar").css({ "width": "2wv" }).click(function () {
            actualizarTabla();
        });
    });
});